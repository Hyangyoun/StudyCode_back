package com.STC.StudyCode.Service;

import com.STC.StudyCode.Dto.MemberDto;

import java.util.List;
import java.util.Objects;

public interface MemberService {
    /** id에 해당하는 회원정보 획득 */
    public MemberDto GetMember(String id);
    /** 회원가입 페이지를 통한 회원정보 데이터베이스에 입력 */
    public String Membership(MemberDto memberDto);

    public String Login(String id, String password);
}
