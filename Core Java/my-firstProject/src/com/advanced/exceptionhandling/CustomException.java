package com.advanced.exceptionhandling;

public class CustomException extends Exception  {


        public CustomException(Exception exception) {
            super(exception);
        }

        public CustomException(String message) {
            super(message);
        }
}
