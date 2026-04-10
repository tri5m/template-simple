package com.example.template.service.test;

import org.junit.Test;

/**
 * TestUtil
 * @author: trifolium.wang
 * @date: 2025/10/22
 */
public class TestUtil{

    @Test
    public void test() {
        String regex = "^https?://([a-zA-Z0-9.-]+|\\d{1,3}(\\.\\d{1,3}){3})(:\\d+)?(.*)?$";
        System.out.println("http://zhongwen.com:55676?asdf=3&sdfsdf".matches(regex));
    }
}
