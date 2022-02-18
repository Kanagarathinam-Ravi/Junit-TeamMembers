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

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	/**
	 * Checks json file array contains name from getname() or not, if contains test pass otherwise
	 * test fail
	 *
	 * @throws ParseException
	 * @throws FileNotFoundException
	 */
	@Test
	void contextLoads() {
		JSONParser parser = new JSONParser();
		Object obj = null;
		try {
			FileReader reader = new FileReader("src/main/resources/json/team.json");
			obj = parser.parse(reader);
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
        JSONArray teamObject = (JSONArray) obj;
		assertTrue(teamObject.contains(HelloWorldController.getName()));
	}
}
