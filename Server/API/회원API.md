# 회원



## 회원 조회

| 메소드 | 경로   | 내용           |
| ------ | ------ | -------------- |
| get    | /users | 회원 정보 조회 |

### 요청 헤더

```
Content-Type: application/json
```

### 응답 바디

회원 조회(self 조회)

```
{
    "status": 200,
    "message": "회원 정보 조회 성공",
    "data": {
    	  "userIdx" : "1",	
          "userEmail" : "2",
          "userPw" : "1234",
          "userName" : "테스트",
          "userUniv" : "00대학교",
          "userMajor" :"00전공",
          "userStudentNum" :"201732038",
          "userGender" :"Man",
          "userBirth" :"980807",
          "userSignOutTime" :"2018-12-27 20:35",
          "userSignInTime" : "2018-12-23 20:35",
          "userPushAllow" : "0",
          "userIsSeeker" : "0",
          "userInfoAllow" : "0",
          "userInterest" : ["2", "4"], // 관심분야 인덱스
          "userProfileUrl" : https://s3.ap-northeast-2.amazonaws.com/project-hs/124f34702c074885a4fb3b84389a2680.jpg
    }
}

```

회원 조회(타인이 조회)

```
{
    "status": 200,
    "message": "회원 정보 조회 성공",
    "data": {
    	  "userIdx" : "1",	
          "userEmail" : "2",
          "userPw" : "1234",
          "userName" : "테스트",
          "userUniv" : "00대학교",
          "userMajor" :"00전공",
          "userStudentNum" :"201732038",
          "userGender" :"Man",
          "userBirth" :"980807",
          "userSignOutTime" :"2018-12-27 20:35",
          "userSignInTime" : "2018-12-23 20:35",
          "userPushAllow" : "0",
          "userIsSeeker" : "0",
          "userInfoAllow" : "0",
          "userInterest" : ["2", "4"], // 관심분야 인덱스
          "userProfileUrl" : https://s3.ap-northeast-2.amazonaws.com/project-hs/124f34702c074885a4fb3b84389a2680.jpg

    }
}
```

회원 조회 실패

```
{
    "status": 404,
    "message": "회원을 찾을 수 없습니다.",
    "data": null
}
```

서버 에러

```
{
    "status": 500,
    "message": "서버 내부 에러",
    "data": null
}
```



***

***



## 회원 가입

| 메소드 | 경로   | 내용      |
| ------ | ------ | --------- |
| POST   | /users | 회원 가입 |



### 요청 헤더

```
Content-Type: application/json
```

### 요청 바디

```
{

          "userEmail" : "2",
          "userPw" : "1234",
          "userName" : "테스트",
          "userUniv" : "00대학교",
          "userMajor" :"00전공",
          "userStudentNum" :"201732038",
          "userGender" :"Man",
          "userBirth" :"980807",
          "userPushAllow" : "0",
          "userIsSeeker" : "0",
          "userInfoAllow" : "0",
          "userInterest" : ["2", "4"], // 관심분야 인덱스
          "userProfileUrl" : https://s3.ap-northeast-2.amazonaws.com/project-hs/124f34702c074885a4fb3b84389a2680.jpg

    
}
```

### 응답 바디

회원 가입 성공

```
{
    "status": 201,
    "message": "회원 가입 성공",
    "data": null
}
```

회원 가입 실패

```
{
    "status": 400,
    "message": "회원 가입 실패",
    "data": null
}
```

DB 에러

```
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```

서버 내부 에러

```
{
    "status": 500,
    "message": "서버 내부 에러",
    "data": null
}
```

***

***



## 회원 정보 수정

| 메소드 | 경로   | 내용           |
| ------ | ------ | -------------- |
| put    | /users | 회원 정보 수정 |



### 요청 헤더

```
Application: token
```



###  요청 바디

- 요청하지 않은 값은 자동으로 이전 값으로 반영

```
{
	"userIdx" :"1",
    "userName" : "테스트",
    "userEmail" : "2"
}
```



### 응답 바디

회원 정보 수정 성공

```
{
    "status": 200,
    "message": "회원 정보 수정 성공",
    "data": {
    
            "userEmail" : "2",
            "userPw" : "1234",
            "userName" : "테스트",
            "userUniv" : "00대학교",
            "userMajor" :"00전공",
            "userStudentNum" :"201732038",
            "userGender" :"Man",
            "userBirth" :"980807",
            "userPushAllow" : "0",
            "userIsSeeker" : "0",
            "userInfoAllow" : "0",
            "userInterest" : ["2", "4"], // 관심분야 인덱스
            "userProfileUrl" : https://s3.ap-northeast-2.amazonaws.com/project-hs/124f34702c074885a4fb3b84389a2680.jpg
    }
    
    
}
```

회원 정보 수정 실패

```
{
    "status": 400,
    "message": "회원 정보 수정 실패",
    "data": null
}
```

인증 실패

```
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
```

다른 회원 정보 수정 시도

```
{
    "status": 403,
    "message": "인가 실패",
    "data": false
}
```

DB에러

```
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```



***

***

## 회원 탈퇴

| 메소드 | 경로   | 내용      |
| ------ | ------ | --------- |
| DELETE | /users | 회원 탈퇴 |

### 요청 헤더

```
Content-Type: application/json
Application: token
```



### 응답바디

회원 탈퇴 성공 

```
{
    "status": 204,
    "message": "회원 탈퇴 성공",
    "data": null
}
```



다른 회원 탈퇴 시도

```
{
    "status": 403,
    "message": "인가 실패",
    "data": false
}
```



회원 조회 실패

```
{
    "status": 404,
    "message": "회원을 찾을 수 없습니다.",
    "data": null
}
```



인증 실패

```
{
    "status": 401,
    "message": "인증 실패",
    "data": null
}
```



DB 에러

```
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```

