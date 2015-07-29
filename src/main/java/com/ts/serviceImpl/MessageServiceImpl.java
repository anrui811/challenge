package com.ts.serviceImpl;

import com.ts.bean.Person;
import com.ts.service.MessageService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Created by AR on 15/7/27.
 */

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public String sendMessage(Person person) {


        JSONObject jSONObject = new JSONObject();

        jSONObject.put("Message",person.getInfo());

        return jSONObject.toString();
    }

}
