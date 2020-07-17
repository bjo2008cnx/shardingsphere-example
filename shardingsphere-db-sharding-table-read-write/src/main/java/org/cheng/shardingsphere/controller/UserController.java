package org.cheng.shardingsphere.controller;

import java.util.Random;
import org.cheng.shardingsphere.entity.User;
import org.cheng.shardingsphere.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	protected IUserService userService;

	@ApiOperation(value = "添加")
	@PostMapping
	public void save(@Validated User dto) {
		userService.save(dto);
	}

	@ApiOperation(value = "查询")
	@GetMapping("/{id}")
	public User get(@PathVariable Long id) {
		return userService.get(id);
	}
	
	@ApiOperation(value = "新增再查下")
	@PostMapping("/add2get")
	public User add2get(@Validated User dto) {
		return userService.add2(dto);
	}

	@ApiOperation(value = "查下再新增")
	@PostMapping("/get2add")
	public User get2add(@Validated User dto) {
		return userService.get2add(dto);
	}

	@ApiOperation(value = "批添加")
	@PostMapping("/batch")
	public Object batch() {
		Random random = new Random();
		for (long i = 0; i < 1000; i++) {
			User user = new User();
			long dataSource = random.nextInt(100);
			user.setDataSource(dataSource);
			user.setCity("hangzhou");
			user.setName("WangLao");
      //user.setId((Long) generator.generateKey());
			userService.save(user);
		}
		return "success";
	}
}