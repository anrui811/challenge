package com.ts.service;

import com.ts.bean.Person;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Created by AR on 15/7/27.
 */

public interface MessageService {

    public String sendMessage(Person person);

}
