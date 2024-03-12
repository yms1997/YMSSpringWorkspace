package com.myspring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myspring.vo.Board;

@Mapper
public interface BoardMapper {
	public List<Board> getLists();
}
