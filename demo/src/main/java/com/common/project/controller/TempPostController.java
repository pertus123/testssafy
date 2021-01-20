package com.common.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.project.model.member.InputMember;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Transactional
@Api(tags = "TempPostController", description = "임시글 API")
public class TempPostController {

	//@Autowired
	
	@PostMapping("/writeTemp")
	@ApiOperation(value = "임시 저장하기")
	public Object writeTemp(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping("/detailTemp")
	@ApiOperation(value = "불러오기")
	public Object detailTemp(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/saveTemp")
	@ApiOperation(value = "게시글로 저장")
	public Object saveTemp(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteTemp")
	@ApiOperation(value = "임시글 삭제")
	public Object deleteTemp(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
