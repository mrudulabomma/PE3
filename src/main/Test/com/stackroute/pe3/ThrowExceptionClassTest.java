package com.stackroute.pe3;

import com.stackroute.pe3.ThrowExceptionClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThrowExceptionClassTest {
    ThrowExceptionClass exception;
    @Before
    public void setUp() throws Exception {
        exception =new ThrowExceptionClass("look for the condition of ARRAY INDEX OUT OF BOUND exception");
    }

    @After
    public void tearDown() throws Exception {
        exception = null;
    }


    @Test
    public void testMain1(){
        //act
        boolean expected = true;
        //arrange
        boolean result = exception.main(new int[]{23,45,65,44});
        //assert
        assertEquals(expected,result);
    }

    @Test
    public void testMain2(){
        //act
        boolean expected = false;
        //arrange
        boolean result = exception.main(new int[]{23,45,65,44});
        //assert
        assertNotEquals(expected,result);
    }

}