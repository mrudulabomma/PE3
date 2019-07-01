package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsRemoveTest {
VowelsRemover vr;
    @Before
    public void setUp() throws Exception {
        vr=new VowelsRemover();
    }

    @After
    public void tearDown() throws Exception {
        vr=null;
    }
    @Test
    public void vowTest(){
        String[] res=vr.check(new String[] {"india","bangladesh","united states"});
        assertArrayEquals(new String[]{"nd","bngldsh","ntd stts"},res);
    }
    @Test
    public void convertPlaceNamesWithoutVowelsWithInputAsNumbers()
    {
        String[] result = vr.check(new String[] {"1123","7865","66868"});
        assertArrayEquals(new String[]{"1123","7865","66868"},result);
    }

}