package com.drug.dao;

import java.util.ArrayList;
import java.util.List;

import com.drug.dto.DrugDto;
import com.drug.vo.PageMaker;

public interface IDrugDao {
	public void insert(DrugDto dto) throws Exception;
	public void update(DrugDto dto) throws Exception;
	public void delete(int pn) throws Exception;
	public ArrayList<DrugDto> selectAll() throws Exception;
	public DrugDto selectName(String name) throws Exception;
	public List<DrugDto> listSearch(PageMaker pm)throws Exception;
	public int listSearchCount(PageMaker pm)throws Exception;
}