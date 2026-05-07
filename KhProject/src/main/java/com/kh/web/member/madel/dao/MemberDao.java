package com.kh.web.member.madel.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.web.member.madel.dto.MemberDto;

public class MemberDao {

	public int insertMember(SqlSession sqlSession, MemberDto member) {
		return sqlSession.insert("memberMapper.insertMember", member);
	}

	public MemberDto login(SqlSession sqlSession, MemberDto member) {
		return sqlSession.selectOne("memberMapper.login", member);
	}
	
	
	
	
}
