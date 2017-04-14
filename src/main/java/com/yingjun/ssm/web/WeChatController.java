package com.yingjun.ssm.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

/**
 * <描述>
 *
 * @author lilw
 * @date: 2017/3/31
 * @version: v1.0
 */
@Controller
@RequestMapping("/wechat")
public class WeChatController {
    @RequestMapping(value = "/request", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String json(HttpServletRequest request) {
        HashMap<String, Object> responseBody = new HashMap<String, Object>();
        responseBody.put("code", 200);
        responseBody.put("message", "Create success.");
        return JSON.toJSONString(responseBody, SerializerFeature.WriteNonStringValueAsString);
    }
}
