package com.drug.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drug.dao.ICartDao;
import com.drug.dto.CartDto;
import com.drug.dto.CartDto;

@Service
public class CartServiceImpl implements ICartService {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public void insert(CartDto dto) throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		dao.insert(dto);
	}

	@Override
	public List<CartDto> selectAll() throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		return dao.selectAll();
	}
	
	@Override
	public List<CartDto> selectId(int cn) throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		return dao.selectId(cn);
	}

	@Override
	public void update(CartDto dto) throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		dao.update(dto);
	}

	@Override
	public void delete(int cn) throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		dao.delete(cn);
	}

	@Override
	public void deleteAll(String id) throws Exception {
		ICartDao dao=sqlSession.getMapper(ICartDao.class);
		dao.deleteAll(id);
	}

}