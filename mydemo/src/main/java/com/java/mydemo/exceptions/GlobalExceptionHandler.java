//package com.java.mydemo.exceptions;
//
//import org.springframework.http.HttpStatusCode;
//import org.springframework.http.ProblemDetail;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(Exception.class)
//    public ProblemDetail handleSecurityException(Exception exception){
//        ProblemDetail errorDetails = null;
//        exception.printStackTrace();
//
//        if(exception instanceof BadCredentialsException){
//            errorDetails = ProblemDetail.forStatusAndDetail(HttpStatusCode.valueOf(401), exception.getMessage());
//            errorDetails.setProperties("Descriptions","the Username Password is incorrect");
//            return  errorDetails;
//        }
//    }
//}
