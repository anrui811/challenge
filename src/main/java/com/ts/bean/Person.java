package com.ts.bean;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 * Created by AR on 15/7/27.
 */
@Repository
public class Person {

    JSONObject info;

    public void setInfo(String name){

        info = new JSONObject();

        info.put("content", "Hello " + name);

    }

    public JSONObject getInfo() {
        return info;
    }
}
