package com.visual.campus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	 
	 @GetMapping("/")
	 public List<String> getNames(Boolean ind) {
	     return getNameList(ind);
	 }
	 
	
	 
	 public List<String> getNameList(Boolean ind){
		 if(ind) {
		return Arrays.asList("Alice", "Bob", "Charlie", "David");
		 }
		 return new ArrayList();
		 
	 }

}
