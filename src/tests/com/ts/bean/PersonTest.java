package com.ts.bean;

import static org.junit.Assert.*;

/**
 * Created by AR on 15/7/27.
 */
public class PersonTest {

    private Person person;
    @org.junit.Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @org.junit.Test
    public void testSetInfo() throws Exception {
        String s = "abc";
        person.setInfo(s);
    }

    @org.junit.Test
    public void testGetInfo() throws Exception {
        person.getInfo();
    }
}