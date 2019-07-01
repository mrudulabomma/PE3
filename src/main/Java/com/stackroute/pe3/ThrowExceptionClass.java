package com.stackroute.pe3;

public class ThrowExceptionClass {
    String string;
    public ThrowExceptionClass(String string)
    {
        this.string = string;
    }

    public boolean main(int[] ints){

        try{
            ints=new int[5];
            ints[8]=10;

        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getClass().toString());

        }finally {

            System.out.println(string);
        }
        return true;
    }
}
