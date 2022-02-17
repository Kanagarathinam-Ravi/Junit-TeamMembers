package com.example.demo;

import com.example.demo.controller.HelloWorldController;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws ParseException, FileNotFoundException {
	    HelloWorldController controller = new HelloWorldController();
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("src/main/resources/json/team.json");

		Object obj = null;
		try {
			obj = parser.parse(reader);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
        JSONArray teamObject = (JSONArray) obj;
		assertEquals(controller.getTeamMembersName(), teamObject);
	}
}
