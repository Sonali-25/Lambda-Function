package com.magic.lambdafunction;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

interface PatternInterface {
    boolean validatePattern(String key, String value);
}

public class lambdaFunction {
    PatternInterface lambdaPatternCheck = (String key, String value) ->
    {
        Pattern pattern = Pattern.compile(key);
        Matcher match = pattern.matcher(value);
        boolean result = match.matches();
        return (result);
    };
    final String nameRegex = "[A-Z]{1}[a-z]{2,}";
    final String nameRegexLastName = "[A-Z]{1}[a-z]{2,}";
    final String emailRegex = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})$";
    final String phoneRegex = "^[0-9]{2}[ ][0-9]{10}$";
    final String passwordRegex = "^(?=.[a-z])(?=.[A-Z])(?=.\\d)(?=.[@$!%?&])[A-Za-z\\d@$!%?&]{8,}$";
    int Analyzer = 0;
    public boolean validateFirstName(String FirstName){
        try {
            boolean result = lambdaPatternCheck.validatePattern(nameRegex,FirstName);
            return(result);
        }
        catch(NullPointerException e){
            return false;
        }

    }
    public boolean validateLastName(String LastName){
        try {
            boolean result = lambdaPatternCheck.validatePattern(nameRegexLastName,LastName);
            return(result);
        }
        catch(NullPointerException e){
            return false;
        }
    }
    public boolean validateEmail(String Email){
        try{
            boolean result = lambdaPatternCheck.validatePattern(emailRegex,Email);
            return(result);
        }
        catch(NullPointerException e){
            return false;
        }
    }
    public boolean validatePhone(String PhoneNumber){
        try{
            boolean result = lambdaPatternCheck.validatePattern(phoneRegex,PhoneNumber);
            return(result);
        }
        catch(NullPointerException e){
            return false;
        }
    }
    public boolean validatePassword(String Password){
        try{
            boolean result = lambdaPatternCheck.validatePattern(passwordRegex,Password);
            return(result);
        }
        catch(NullPointerException e){
            return false;
        }
    }

    public static void main(String[] args) {
        lambdaFunction lambda = new lambdaFunction();
        System.out.println(lambda.validateFirstName("Sonali"));
        System.out.println(lambda.validateLastName("Bhardwaj"));
        System.out.println(lambda.validateEmail("Sona.123@gmail.com"));
        System.out.println(lambda.validatePhone("91 9203057282"));
        System.out.println(lambda.validatePassword("12Sona@256*"));
    }

}

