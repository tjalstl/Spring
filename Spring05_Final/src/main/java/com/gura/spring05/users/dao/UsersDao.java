package com.gura.spring05.users.dao;

import com.gura.spring05.users.dto.UsersDto;

public interface UsersDao {
	public boolean isExist(String inputId);
	public void insert(UsersDto dto);
	public boolean isValid(UsersDto dto);
	public boolean updatePwd(UsersDto dto);
	public void delete(String id);
	public UsersDto getData(String id);
}
