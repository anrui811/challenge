package com.ts.rest;

import com.ts.bean.Person;
import com.ts.service.MessageService;
import com.ts.serviceImpl.MessageServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AR on 15/7/27.
 */
public class MessageResourceTest {

    private MessageResource resource;

    @Before
    public void setUp() throws Exception {
        resource = new MessageResource();
    }

    @Test
    public void testSetPerson() throws Exception {
        String name = "xxx";
        Person p = new Person();
        p.setInfo("xxx");
        resource.setPerson(p);
    }

    @Test
    public void testSetMessageService() throws Exception {

        MessageService s = new MessageServiceImpl();
        this.resource.setMessageService(s);

    }

    @Test
    public void testPost() throws Exception {

        String name = "abc";
        Person p = new Person();
        p.setInfo(name);
        MessageService s = new MessageServiceImpl();
        s.sendMessage(p);
    }
}