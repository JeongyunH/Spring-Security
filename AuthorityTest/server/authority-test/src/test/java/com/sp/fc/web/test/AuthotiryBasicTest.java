package com.sp.fc.web.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthotiryBasicTest extends WebIntegrationTest{

    TestRestTemplate client;

    @DisplayName("1. greeting 메시지를 불러온다.")
    @Test
    void test_1(){
        client = new TestRestTemplate("user1", "1111");
        ResponseEntity<String> response = client.getForEntity(uri("/greeting/jeongyun"), String.class);

        assertEquals("hello jeongyun", response.getBody());
        System.out.println(response.getBody());
    }
}
