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
@Api(tags = "PostController", description = "게시글 API")
public class PostController {
	//@Autowired
	
	@GetMapping("/searchPage")
	@ApiOperation(value = "검색이나 블로그 검색 할 때 글 리스트가져오기")
	public Object searchPage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping("/detailPage")
	@ApiOperation(value = "상세페이지")
	public Object detailPage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/writePage")
	@ApiOperation(value = "글쓰기")
	public Object writePage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@DeleteMapping("/deletePage")
	@ApiOperation(value = "글삭제")
	public Object deletePage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/updatePage")
	@ApiOperation(value = "글 수정")
	public Object updatePage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/likePage")
	@ApiOperation(value = "좋아요&안좋아요")
	public Object likePage(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
}
