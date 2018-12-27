package org.sopt.ssgsag.service;

import org.sopt.ssgsag.dto.User;
import org.sopt.ssgsag.mapper.UserMapper;
import org.sopt.ssgsag.model.DefaultRes;
import org.sopt.ssgsag.model.LoginReq;
import org.sopt.ssgsag.utils.ResponseMessage;
import org.sopt.ssgsag.utils.StatusCode;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserMapper userMapper;

    private final JwtService jwtService;

    public AuthService(final UserMapper userMapper, JwtService jwtService) {
        this.userMapper = userMapper;
        this.jwtService = jwtService;
    }

    /**
     * 로그인 서비스
     * @param loginReq 로그인 객체
     * @return DefaultRes
     */
    public DefaultRes<JwtService.TokenRes> login(final LoginReq loginReq) {
        final User user = userMapper.findByEmailAndPassword(loginReq.getUserEmail(), loginReq.getUserPw());
        if (user != null) {
            //토큰 생성
            final JwtService.TokenRes tokenDto = new JwtService.TokenRes(jwtService.create(user.getUserIdx()));
            return DefaultRes.res(StatusCode.OK, ResponseMessage.LOGIN_SUCCESS, tokenDto);
        }
        return DefaultRes.res(StatusCode.BAD_REQUEST, ResponseMessage.LOGIN_FAIL);
    }
}
