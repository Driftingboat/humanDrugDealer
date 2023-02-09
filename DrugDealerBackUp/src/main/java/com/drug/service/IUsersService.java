package com.drug.service;

import java.util.ArrayList;

import com.drug.dto.UsersDto;

public interface IUsersService {
   public void insert(UsersDto dto) throws Exception;
   public void insertAuthority(UsersDto dto) throws Exception;
   public void update(UsersDto dto) throws Exception;
   public ArrayList<UsersDto> selectAll() throws Exception;
   public UsersDto selectId(String id) throws Exception;
   public void delete(String id) throws Exception;
}