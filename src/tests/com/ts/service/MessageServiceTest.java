package com.ts.service;

import com.ts.bean.Person;
import com.ts.serviceImpl.MessageServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AR on 15/7/27.
 */
public class MessageServiceTest {

    private MessageService ms;

    @Before
    public void setUp() throws Exception {
        ms = new MessageServiceImpl();
    }

    @Test
    public void testSendMessage() throws Exception {
        Person p = new Person();
        ms.sendMessage(p);
    }
}