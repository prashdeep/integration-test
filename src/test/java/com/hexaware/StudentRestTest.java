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
}