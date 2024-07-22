package com.minsoft.member.MemberDao;

import com.minsoft.member.MemberVo.MemberVo;

public class MemberDao {
	
	private SqlSession sqlsession;
	
	@Override
	public String loginCheck(MemberVo vo) {
		return sqlsession.selectOne("member.login_check",vo);
	}
}
