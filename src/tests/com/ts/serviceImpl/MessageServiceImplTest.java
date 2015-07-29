package com.ts.serviceImpl;

import com.ts.bean.Person;
import com.ts.service.MessageService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AR on 15/7/27.
 */
public class MessageServiceImplTest {

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