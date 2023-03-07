package com.itsconv.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDTO {

    private Long idx; //회원 고유 키값
    private String email; //아이디
    private String userPw; //패스워드
    private String name; //이름
    private String mobilePhone; //핸드폰 번호
    private String address; //주소
    private Date insertDate; //회원가입일
    private List<AuthVO> authList; //권한
}
