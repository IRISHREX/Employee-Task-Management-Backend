package com.taskboard.sohel.dto;

import java.util.List;

import com.taskboard.sohel.entity.User;

import lombok.Data;

@Data
public class UsersResponseDto extends CommonApiResponse {
	
	private List<User> users;

}
