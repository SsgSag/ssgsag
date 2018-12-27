package org.sopt.ssgsag.mapper;

import org.apache.ibatis.annotations.*;
import org.sopt.ssgsag.dto.User;
import org.sopt.ssgsag.model.SignUpReq;

import java.util.List;

@Mapper
public interface UserMapper {

    //모든 회원 리스트 조회
    /*
    @Select("SELECT * FROM user")
    List<User> findAll();

    //회원 이름으로 조회
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") final String name);
    */
    //회원 고유 번호로 조회
    @Select("SELECT * FROM User WHERE userIdx = #{userIdx}")
    User findByUserIdx(@Param("userIdx") final int userIdx);


    //회원 등록, Auto Increment는 회원 고유 번호
    //Auto Increment 값을 받아오고 싶으면 리턴 타입을 int(Auto Increment 컬럼 타입)으로 하면 된다.
    @Insert("INSERT INTO User(userEmail, userPw, userName, userUniv, userMajor, userStudentNum, userGender, userBirth, userSignOutTime," +
            "userSignInTime, userPushAllow, userInfoAllow, userProfileUrl) VALUES(#{signUpReq.userEmail}, #{signUpReq.userPw}," +
            "#{signUpReq.userName}, #{signUpReq.userUniv}, #{signUpReq.userMajor}, #{signUpReq.userStudentNum}, #{signUpReq.userGender}, " +
            "#{signUpReq.userBirth}, #{signUpReq.userSignOutTime}, #{signUpReq.userSignInTime}, #{signUpReq.userPushAllow}, " +
            "#{signUpReq.userInfoAllow}, #{signUpReq.userProfileUrl})")
    @Options(useGeneratedKeys = true, keyColumn = "User.userIdx")
    int save(@Param("signUpReq") final SignUpReq signUpReq);

    /*
    //Auto Increment 값을 받아오고 싶지 않다면 필요 없다.
    @Insert("INSERT INTO User(name, email) VALUES(#{user.name}, #{user.email})")
    void save2(@Param("user") final User user);
    */

    @Insert("INSERT INTO UserCategory(userIdx, categoryIdx) VALUES(#{userIdx}, #{categoryIdx})")
    void saveInterest(@Param("userIdx") final int userIdx, @Param("categoryIdx") final int categoryIdx);


    //회원 정보 수정
    /*
    @Update("UPDATE user SET name = #{user.name}, part = #{user.email} WHERE userIdx = #{userIdx}")
    void update(@Param("userIdx") final int userIdx, @Param("user") final User user);
    */
    //회원 삭제
    /*
    @Delete("DELETE FROM user where userIdx = #{userIdx}")
    void deleteByUserIdx(@Param("userIdx") final int userIdx);
    */

    //이메일과 비밀번호로 조회
    @Select("SELECT * FROM User WHERE userEmail = #{userEmail} AND userPw = #{userPw}")
    User findByEmailAndPassword(@Param("userEmail") final String userEmail, @Param("userPw") final String userPw);
}
