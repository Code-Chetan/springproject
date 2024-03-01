package org.springproject.propertysource;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@PropertySources({  @PropertySource("classpath:mailconfig.properties"),
                    @PropertySource("file:D://Config file for testing/UserDetails.properties ")
})
//@PropertySource("classpath:mailconfig.properties")
@Component
public class MailConfiguration {

    private static final Logger log =LogManager.getLogger(MailConfiguration.class);

    @Value("${smtp.host}")  // read the data from property file
    private String hostName;

    @Value("${smtp.port}")
    private int port ;

    @Value("${smtp.user}")
    private String userName;

    @Value("${smtp.pass}")
    private String password;

    @Value("${user.indentity}")
    private String username;

    @Value("${user.pass}")
    private String userPassword;

    @Value("${user.id}")
    private int userId;

    @Value("${user.address}")
    private String userAddress;

    public void getMailConfigDetails(){
        log.info("Mail Configuration, host:{}, port:{}, username:{} and password:{}", hostName, port,
                userName, password);
    }

    public void getUserDetailsFromFile(){
        log.info("User details are , userName:{},userPassword:{}, userId:{} and userAddress:{}"
                ,username,userPassword,userId,userAddress);
    }
}
