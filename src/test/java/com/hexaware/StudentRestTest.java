package com.hexaware;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import org.junit.Test;
import static org.junit.Assert.*;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import static com.jayway.restassured.RestAssured.given;

public class StudentRestTest {

    @Test
	public void testAllStudentsGET() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
				.get("http://localhost:8080/sms/rest/students").then().assertThat().statusCode(200);
	}

    @Test
	public void testStudentByIdGET() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
				.get("http://localhost:8080/sms/rest/students/12").then().assertThat().statusCode(200);
	}

    @Test
	public void testInvalidStudentByIdGET() throws AssertionError, URISyntaxException {
		given().accept(ContentType.JSON).when()
				.get("http://localhost:8080/sms/rest/students/13245352").then().assertThat().statusCode(404);
	}

    @Test
	public void testValidtudentPOST() throws AssertionError, URISyntaxException {
        Student student = new Student();
        student.setId(12);
        student.setName("Kishore");
		given().accept(ContentType.JSON).body(student).when()
				.post("http://localhost:8080/sms/rest/students/13245352").then().assertThat().statusCode(201);
	}

    @Test
	public void testValidtudentPOST() throws AssertionError, URISyntaxException {
        Student student = new Student();
        student.setName("Kishore");
		given().accept(ContentType.JSON).body(student).when()
				.post("http://localhost:8080/sms/rest/students").then().assertThat().statusCode(400);
	}

    @Test
	public void testValidtudentPOST() throws AssertionError, URISyntaxException {
        Student student = new Student();
        student.setId(12);
        student.setName("Kishore");
		given().accept(ContentType.JSON).body(student).when()
				.put("http://localhost:8080/sms/rest/students/13245352").then().assertThat().statusCode(200);
	}



































}