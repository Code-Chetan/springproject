package org.springproject.springjdbcdao.logging;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    private static final Logger Logger=LogManager.getLogger(LoggingAspect.class.getName());

    @Before("execution(* org.springproject.springjdbcdao.AccountDaoImpl.selectOne(..))")
    public void before(JoinPoint joinpoint){
        Object[] methodArgs=joinpoint.getArgs();
        Logger.info("input to method {} with args :{}", joinpoint.getSignature().getName(),methodArgs[0]);
    }



}
