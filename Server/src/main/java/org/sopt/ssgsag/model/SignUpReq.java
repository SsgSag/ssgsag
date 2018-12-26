package org.sopt.ssgsag.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Data
public class SignUpReq {
    private String userEmail;
    private String userPw;
    private String userName;
    private String userUniv;
    private String userMajor;
    private String userStudentNum;
    private String userGender;
    private String userBirth; //ex)951107
    private String userSignOutTime; //ex)2018-12-26 20:35 처음에 가입날짜랑 같음
    private String userSignInTime; //ex)2018-12-26 20:35
    private int userPushAllow;
    private int userInfoAllow;
    private List<Integer> userInterest;// = new ArrayList<>();

    //프로필 사진 객체
    private MultipartFile profile;
    //프로필 사진 저장 url 주소
    private String profileUrl;
}
