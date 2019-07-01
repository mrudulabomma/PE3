package com.stackroute.pe3;

import com.stackroute.pe3.ExceptionTypes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionTypesTest {
    private ExceptionTypes exc;

    @Before
    public void setUp() throws Exception {
        exc = new ExceptionTypes();
    }

    @After
    public void tearDown() throws Exception {
        exc = null;
    }

    @Test
    public void NegativeArraySizeExceptionTest(){
        assertEquals("class java.lang.NegativeArraySizeException", exc.arrayCreation());
    }

    @Test
    public void IndexOutOfBoundsException(){
        assertEquals("class java.lang.ArrayIndexOutOfBoundsException", exc.arrayAccess());
    }

    @Test
    public void NullPointerException(){

        assertEquals("class java.lang.NullPointerException", exc.stringAccess());
    }



}