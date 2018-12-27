# 로그인

| 메소드 | 경로   | 내용   |
| ------ | ------ | ------ |
| Post   | /login | 로그인 |



### 요청 헤더

~~~
Content-Type: application/json
~~~

### 요청 바디

~~~
{
    "userEmail": "her0807@naver.com",
    "userPass": "1234"
}
~~~



### 응답바디

로그인 성공

~~~
{
    "status": 200,
    "message": "로그인 성공",
    "data": {
        "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJEb0lUU09QVCIsInVzZXJfaWR4IjoxfQ.5lCvAqnzYP4-2pFx1KTgLVOxYzBQ6ygZvkx5jKCFM08"
    }
}

~~~

로그인 실패

```
{
    "status": 400,
    "message": "로그인 실패",
    "data": null
}
```

