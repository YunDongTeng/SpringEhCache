package com.spark.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.StatusResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created by tyd on 2017-11-3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml", "classpath:applicationContext-web.xml"})
@WebAppConfiguration
public class UserTest {


    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wc;

    @Before
    public void beofre(){
        mockMvc = MockMvcBuilders.webAppContextSetup(wc).build();
    }
    @Test
    public void testUserList() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/user/list")
                .accept(MediaType.APPLICATION_JSON_UTF8));
    }
}
