package com.game;
import java.lang.Exception;

public class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

class MyExceptionThrower {
    void f() throws MyException {
        throw new MyException("Throwing MyException");
    }
}
