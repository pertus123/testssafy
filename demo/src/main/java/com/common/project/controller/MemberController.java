package com.common.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.project.dao.MemberDao;
import com.common.project.model.member.InputMember;
import com.common.project.model.member.Member;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Transactional
@Api(tags = "MemberController", description = "회원 API")
public class MemberController {
	
	@Autowired
	MemberDao memberDao;
	
	//토큰도 생성.
	
	@GetMapping("/login")
	@ApiOperation(value = "로그인", notes="성공시 jwt 토큰을 반환합니다.")
	public Object login(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/signup")
	@ApiOperation(value = "가입하기")
	public Object signup(@RequestBody InputMember inputMember) {
		
		Member member = new Member();
		member.setEmail(inputMember.getEmail());
		member.setPassword(inputMember.getPassword());
		member.setName(inputMember.getName());
		
		memberDao.save(member);
		
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@PostMapping("/updateInfo")
	@ApiOperation(value = "회원정보수정")
	public Object updateInfo(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@GetMapping("/profileInfo")
	@ApiOperation(value = "개인정보가져오기")
	public Object profileInfo(@RequestBody InputMember inputMember) {
		return new ResponseEntity<>("success", HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteInfo")
	@ApiOperation(value = "회원탈퇴")
	public Object deleteInfo(@RequestBody InputMember inputMember) {
		
		return new ResponseEntity<>("success", HttpStatus.OK);
	}

}
