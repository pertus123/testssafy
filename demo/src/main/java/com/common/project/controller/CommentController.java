package com.common.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
@Api(tags = "CommentController", description = "댓글 API")
public class CommentController {
	//@Autowired
	
	@PostMapping("/writeComment")
	@ApiOperation(value = "댓글쓰기")
	public Object writeComment(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping("/detailComment")
	@ApiOperation(value = "댓글보기")
	public Object detailComment(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/updateComment")
	@ApiOperation(value = "댓글수정")
	public Object updateComment(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteComment")
	@ApiOperation(value = "댓글삭제")
	public Object deleteComment(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
}
