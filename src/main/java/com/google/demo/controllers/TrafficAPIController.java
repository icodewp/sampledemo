package com.google.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.google.demo.models.TrafficSegmentModel;
import com.google.demo.realtimeingest.Publishmessages;
import com.google.gson.Gson;

@Controller
@EnableAutoConfiguration
public class TrafficAPIController {
	
	@RequestMapping( value ="/hello" ,method = RequestMethod.GET)
    @ResponseBody
    public String home(){
		int count =1;
		 RestTemplate restTemplate = new RestTemplate();
		 List<String> segmentlist = new ArrayList<String>();
		 TrafficSegmentModel.Segments[] model=restTemplate
				 .getForObject("https://data.cityofchicago.org/resource/8v9j-bter.json",TrafficSegmentModel.Segments[].class);
		for (TrafficSegmentModel.Segments seg :model){
			System.out.println(count++);
			
			segmentlist.add(new Gson().toJson(seg));
			
			
		}
		try {
			Publishmessages.publishMessages(segmentlist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Messages sent to Pubsub for processing"+ model.length;
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(TrafficAPIController.class, args);
    }

}
