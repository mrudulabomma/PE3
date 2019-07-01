package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks sm;

    @Before
    public void setUp() throws Exception {
        sm=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        sm=null;
    }
    @Test
    public void check(){
        String res=sm.grades(4,new int[] {20,30,40,50});
        assertEquals("grades are between 0 and 100",res);
    }
    @Test
    public void checkGrades(){
        String res=sm.grades(4,new int[] {20,30,101,50});
        assertEquals("error",res);
    }
}