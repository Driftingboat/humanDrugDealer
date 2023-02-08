package com.drug.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drug.dto.UsersDto;
import com.drug.dao.IUsersDao;

@Service
public class UsersServiceImpl implements IUsersService {

   @Autowired
   private SqlSession sqlSession;

   @Override
   public void insert(UsersDto dto) throws Exception {
      IUsersDao dao = sqlSession.getMapper(IUsersDao.class);
      dao.insert(dto);
   }

   @Override
   public void update(UsersDto dto) throws Exception {
      IUsersDao dao = sqlSession.getMapper(IUsersDao.class);
      dao.update(dto);
   }

   @Override
   public void delete(String id) throws Exception {
      IUsersDao dao = sqlSession.getMapper(IUsersDao.class);
      dao.delete(id);
   }

   @Override
   public ArrayList<UsersDto> selectAll() throws Exception {      
      System.out.println("sudee");
      IUsersDao dao = sqlSession.getMapper(IUsersDao.class);

      return dao.selectAll();
   }

   @Override
   public UsersDto selectId(String id) throws Exception {
      IUsersDao dao = sqlSession.getMapper(IUsersDao.class);
      return dao.selectId(id);
   }

   @Override
   public void insertAuthority(UsersDto dto) throws Exception {
	  IUsersDao dao = sqlSession.getMapper(IUsersDao.class);
	  System.out.println(dto);
	  dao.insertAuthority(dto);
   }

}