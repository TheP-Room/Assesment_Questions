package AssesmentOne_Advanced;

import java.io.IOException;

public class SubClass extends SuperClass{
    @Override
    public void showMessage() throws Exception{
        throw new IOException();
    }
    @Override
    public void display() throws RuntimeException{
        throw new NullPointerException();
    }
}
