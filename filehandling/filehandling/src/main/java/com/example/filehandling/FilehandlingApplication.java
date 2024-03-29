package com.example.filehandling;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;

@SpringBootApplication
public class FilehandlingApplication {

	public static void main(String[] args) {

		SpringApplication.run(FilehandlingApplication.class, args);
		String inputFilePath = "src/main/resources/io/input.json";
		String outputFilePath = "src/main/resources/io/output.json";

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			JsonNode jsonData = readJSON(objectMapper, inputFilePath);
			editJSON(objectMapper, (ObjectNode) jsonData);
			saveJSON(objectMapper, jsonData, outputFilePath);
			System.out.println("JSON file has been modified and saved to: " + outputFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static JsonNode readJSON(ObjectMapper objectMapper, String filePath) throws IOException {
		return objectMapper.readTree(new File(filePath));
	}

	private static void editJSON(ObjectMapper objectMapper, ObjectNode jsonData) {
		// Edit values of any two keys
		jsonData.put("key1", "new_value1");
		jsonData.put("key2", "new_value2");

		// Add two additional keys and their values
		jsonData.put("new_key1", "value1");
		jsonData.put("new_key2", "value2");
	}

	private static void saveJSON(ObjectMapper objectMapper, JsonNode jsonData, String filePath) throws IOException {
		objectMapper.writeValue(new File(filePath), jsonData);
	}

}
