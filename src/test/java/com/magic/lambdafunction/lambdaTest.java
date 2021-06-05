package com.magic.lambdafunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class lambdaTest {
    @Test
    void firstName() {
        lambdaFunction lambda = new lambdaFunction();
        boolean result = lambda.validateFirstName("Sonali");
        Assertions.assertTrue(result);
    }
    @Test
    void lastName(){
        lambdaFunction lambda = new lambdaFunction();
        boolean result = lambda.validateLastName("Bhardwaj");
        Assertions.assertTrue(result);
    }
    @Test
    void email(){
        lambdaFunction lambda = new lambdaFunction();
        boolean result = lambda.validateEmail("Sona.123@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    void phoneNumber(){
        lambdaFunction lambda = new lambdaFunction();
        boolean result = lambda.validatePhone("91 9203057282");
        Assertions.assertTrue(result);
    }
    @Test
    void password(){
        lambdaFunction lambda = new lambdaFunction();
        boolean result = lambda.validatePassword("12Sona@256*");
        Assertions.assertTrue(result);
    }
}

