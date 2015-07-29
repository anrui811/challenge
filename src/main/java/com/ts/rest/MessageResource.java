package com.ts.rest;

import com.ts.bean.Person;
import com.ts.service.MessageService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by AR on 15/7/27.
 */

@Controller

@Path("message")


public class MessageResource{


    private Person person;


    private MessageService messageService;

    @Resource
    public void setPerson(Person person) {
        this.person = person;
    }

    @Resource
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }


    @POST
    @Path("/names/{names}")
    @Produces(MediaType.APPLICATION_JSON)
    public String post(@PathParam("names") String name){
        this.person.setInfo(name);
        return this.messageService.sendMessage(person);
    }
}
