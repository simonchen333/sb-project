package com.xkazxx.springboot.springbootproject.service;

import com.xkazxx.springboot.springbootproject.bean.statPageMsg.StatPageMsg;

import java.util.Map;

public interface StatService {
    Map queryUserStatmsg();
    Map queryOrderStatmsg();
    Map queryGoodsStatmsg();
}
