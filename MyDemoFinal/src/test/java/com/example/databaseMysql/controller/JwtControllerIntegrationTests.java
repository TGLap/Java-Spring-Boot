package com.example.databaseMysql.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@AutoConfigureMockMvc
public class JwtControllerIntegrationTests {

    private MockMvc mockMvc;
    private ObjectMapper objectMapper;

    @Autowired
    public JwtControllerIntegrationTests(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
        objectMapper = new ObjectMapper();
    }

}

