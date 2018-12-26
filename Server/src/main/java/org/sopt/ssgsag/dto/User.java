package org.sopt.ssgsag.dto;

import lombok.Data;

@Data
public class User {
    private int userIdx;
    private String userEmail;
    private String userPw;
    private String userName;
    private String userUniv;
    private String userMajor;
    private String userStudentNum;
    private String userGender;
    private String userBirth;
    private String userSignOutTime;
    private String userSignInTime;
    private int userPushAllow;
    private int userIsSeeker;
    private int userCnt;
    private int userInfoAllow;
    private String userProfileUrl;
    private int userAlreadyOut;
}
