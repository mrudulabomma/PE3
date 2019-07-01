package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
MatrixSum ms;
    @Before
    public void setUp() throws Exception {
        ms=new MatrixSum();
    }

    @After
    public void tearDown() throws Exception {
        ms=null;
    }
    @Test
    public void check(){
        int[][] res=ms.sum(3,2,new int[][] {{1,2},{3,4},{5,6}},new int[][] {{9,8},{7,6},{5,4}});
        assertEquals(new int[][] {{10,10},{10,10},{10,10}},res);

    }
    @Test
    public void checkSum(){
        int[][] res=ms.sum(2,2,new int[][] {{1,-2},{3,4}},new int[][] {{9,8},{7,6}});
        assertEquals(new int[][] {{10,6},{10,10}},res);

    }
}