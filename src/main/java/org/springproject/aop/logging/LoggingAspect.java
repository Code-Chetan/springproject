package org.springproject.aop.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    private static final Logger Logger=LogManager.getLogger(LoggingAspect.class.getName());

    //@Before will get executed before joinPoint method execution.
    @Before("execution(* org.springproject.aop.dao.AccountDaoImpl.selectOne(..))")
    public void before(JoinPoint joinpoint){
        Object[] methodArgs=joinpoint.getArgs();
        Logger.info("input to method {} with args :{}", joinpoint.getSignature().getName(),methodArgs[0]);
    }

    //@After will get executed after joinPoint method execution Completed
    @After("execution(* org.springproject.aop.dao.AccountDaoImpl.save(..))")
    public void after(JoinPoint joinPoint){
        Object[] methodArgs=joinPoint.getArgs();
        Logger.info("input to method {} with argument:{}",joinPoint.getSignature().getName(),methodArgs[0]);
    }

    //@AfterReturning will get in use if joinPoint returns a value, here we can get/print value
    @AfterReturning(pointcut = "execution(* org.springproject.aop.dao.AccountDaoImpl.update(..))",returning = "returnValue")
    public void afterReturnAdvice(JoinPoint joinPoint, Object returnValue){
        Object[] methodArgs=joinPoint.getArgs();

        Logger.info("input passed to method {} with argument- {}",
                joinPoint.getSignature().getName(),methodArgs[0]);

        if(returnValue != null && (int)returnValue > 0){
            Logger.info(" return value of method {} with value :{}",joinPoint.getSignature().getName(),returnValue);
        }else{
            Logger.info("method :{} not returned a value",joinPoint.getSignature().getName());
        }
    }

    //@AfterThrowing will use when method throws an exception, we can caught exception here
    @AfterThrowing(pointcut = "execution(* org.springproject.aop.dao.AccountDaoImpl.getDemoException(..))",throwing = "exception")
    public void afterThrowAdvice(JoinPoint joinPoint, Exception exception){

        Logger.info("method name :{}, exception caught:{}",joinPoint.getSignature().getName(),exception.getMessage());

    }

    //@Around is combination of both @Before & @After but it has power to control whether proceed to execute method or showing custom message or throw exception
    @Around("execution(* org.springproject.aop.dao.AccountDaoImpl.selectOne(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        Object[] args = proceedingJoinPoint.getArgs();

        Logger.info("Executed method name :{} is getting called with argument: {} ",
                proceedingJoinPoint.getSignature().getName(),args[0]);

        // use to getting proceed to run method
        Object result = proceedingJoinPoint.proceed();
        Logger.info("Method executed :{} returns result :{}",proceedingJoinPoint.getSignature().getName(),result);
        return result;
    }
}
