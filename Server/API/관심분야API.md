# 관심분야

## 관심분야 수정

| 메소드  | 경로         | 내용      |
| ---- | ---------- | ------- |
| put  | /interests | 관심분야 수정 |



### 요청 헤더

```
Application: token
```



###  요청 바디

- 요청하지 않은 값은 자동으로 이전 값으로 반영

```
{
	"userIdx" : "2",
	"interestIdx" : ["1", "3", "5"]
}
```



### 응답 바디

회원 정보 수정 성공

```
{
    "status": 200,
    "message": "관심분야 수정 성공",
    "data": {
        "userIdx" : "2",
        "interestIdx" : ["1", "3", "5"]
    }
}
```

관심분야 수정 실패

```
{
    "status": 400,
    "message": "관심분야 수정 실패",
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

DB에러

```
{
    "status": 600,
    "message": "데이터베이스 에러",
    "data": null
}
```

서버 내부 에러

    "status": 500,
    "message": "데이터베이스 에러",
    "data": null