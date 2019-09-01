package com.ibm.services.learning.clmsbadges.rest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import  java.lang.reflect.Field;
import javax.net.ssl.SSLContext;

//import org.apache.commons.codec.Charsets;
//import org.apache.commons.codec.binary.Base64;
////import org.apache.commons.text.translate.CsvTranslators.CsvUnescaper;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.json.CDL;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;


//@PropertySource({ "classpath:persistence-db2.properties" })
@RestController
@RequestMapping("/test")
public class BadgeRequestRestController {
	@Autowired
//	private Environment env;
//	private BadgeRequestResponse badgeResp = new BadgeRequestResponse();
	
//	private Logger logger = Logger.getLogger(getClass().getName());
	
//	@CrossOrigin
//	@PostMapping("/badgeRequest")
//	private 
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
}
