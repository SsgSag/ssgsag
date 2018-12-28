-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- User Table Create SQL
CREATE TABLE User
(
    `userIdx`          INT             NOT NULL        AUTO_INCREMENT COMMENT '사용자 인덱스', 
    `userEmail`        VARCHAR(45)     NULL        COMMENT '사용자 이메일', 
    `userPw`           VARCHAR(45)     NULL        COMMENT '사용자 비밀번호', 
    `userName`         VARCHAR(45)     NULL        COMMENT '사용자 이름', 
    `userUniv`         VARCHAR(45)     NULL        COMMENT '사용자 대학이름', 
    `userMajor`        VARCHAR(45)     NULL        COMMENT '사용자 전공', 
    `userStudentNum`   VARCHAR(45)     NULL        COMMENT '사용자 학번', 
    `userGender`       VARCHAR(45)     NULL        COMMENT '사용자 성별', 
    `userBirth`        VARCHAR(45)     NULL        COMMENT '사용자 생년월일 951107', 
    `userSignOutTime`  DATETIME        NULL        COMMENT '사용자 탈퇴 시간', 
    `userSignInTime`   DATETIME        NULL        COMMENT '사용자 회원가입 날짜 2018-12-23 20:35', 
    `userPushAllow`    TINYINT         NULL        COMMENT '사용자 푸쉬알림 설정', 
    `userIsSeeker`     TINYINT         NULL        DEFAULT 0 COMMENT '사용자 구직 여부', 
    `userCnt`          INT             NULL        DEFAULT 15 COMMENT '사용자 하루 사진 개수', 
    `userInfoAllow`    TINYINT         NULL        DEFAULT 1 COMMENT '사용자 정보제공동의', 
    `userProfileUrl`   VARCHAR(100)    NULL        DEFAULT 'https://s3.ap-northeast-2.amazonaws.com/project-hs/124f34702c074885a4fb3b84389a2680.jpg' COMMENT '사용자 프로필사진 url', 
    `userAlreadyOut`   TINYINT         NULL        DEFAULT 0 COMMENT '사용자 탈퇴여부', 
    PRIMARY KEY (userIdx)
);

ALTER TABLE User COMMENT '사용자';


-- Poster Table Create SQL
CREATE TABLE Poster
(
    `posterIdx`        INT            NOT NULL    AUTO_INCREMENT COMMENT '포스터 인덱스', 
    `photoUrl`         VARCHAR(45)    NULL        COMMENT '포스터 사진 url', 
    `textUrl`          VARCHAR(45)    NULL        COMMENT '포스터 텍스트 url', 
    `posterName`       VARCHAR(45)    NULL        COMMENT '포스터 이름', 
    `posterRegDate`    DATETIME       NULL        COMMENT '포스터 등록 날짜', 
    `posterStartDate`  DATETIME       NULL        COMMENT '포스터 시작 날짜', 
    `posterEndDate`    DATETIME       NULL        COMMENT '포스터 마감 날짜', 
    `posterWebsite`    VARCHAR(45)    NULL        COMMENT '포스터 웹사이트 주소', 
    `category`         INT            NULL        COMMENT '포스터 분야', 
    `isSeek`           TINYINT        NULL        DEFAULT 0 COMMENT '채용(0) or 채용(1)', 
    PRIMARY KEY (posterIdx)
);

ALTER TABLE Poster COMMENT '포스터';


-- Category Table Create SQL
CREATE TABLE Category
(
    `categoryIdx`   INT            NOT NULL    COMMENT '카데고리 인덱스', 
    `categoryName`  VARCHAR(45)    NULL        COMMENT '카데고리 이름', 
    PRIMARY KEY (categoryIdx)
);


ALTER TABLE Category COMMENT '카데고리종류(사용자 관심 카테고리 또는 포스터 카테고리)';


-- UserPoster Table Create SQL
CREATE TABLE UserPoster
(
    `userIdx`    INT        NULL        COMMENT '사용자 인덱스', 
    `posterIdx`  INT        NULL        COMMENT '포스터 인덱스', 
    `like`       TINYINT    NULL        COMMENT '좋아요: 1 싫어요: 0'
);

ALTER TABLE UserPoster COMMENT '사용자가 좋아요 또는 싫어요 누른';

ALTER TABLE UserPoster ADD CONSTRAINT FK_UserPoster_userIdx_User_userIdx FOREIGN KEY (userIdx)
 REFERENCES User (userIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE UserPoster ADD CONSTRAINT FK_UserPoster_posterIdx_Poster_posterIdx FOREIGN KEY (posterIdx)
 REFERENCES Poster (posterIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;


-- PosterCategory Table Create SQL
CREATE TABLE PosterCategory
(
    `posterIdx`    INT    NULL        COMMENT '포스터 인덱스', 
    `categoryIdx`  INT    NULL        COMMENT '카테고리 인덱스'
);

ALTER TABLE PosterCategory COMMENT '포스터의 카테코리';

ALTER TABLE PosterCategory ADD CONSTRAINT FK_PosterCategory_posterIdx_Poster_posterIdx FOREIGN KEY (posterIdx)
 REFERENCES Poster (posterIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE PosterCategory ADD CONSTRAINT FK_PosterCategory_categoryIdx_Category_categoryIdx FOREIGN KEY (categoryIdx)
 REFERENCES Category (categoryIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;


-- UserCategory Table Create SQL
CREATE TABLE UserCategory
(
    `userIdx`      INT    NULL        COMMENT '사용자 인덱스', 
    `categoryIdx`  INT    NULL        COMMENT '카데고리 인덱스'
);

ALTER TABLE UserCategory COMMENT '사용자의  관심분야, 관심 카테고리';

ALTER TABLE UserCategory ADD CONSTRAINT FK_UserCategory_userIdx_User_userIdx FOREIGN KEY (userIdx)
 REFERENCES User (userIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;
ALTER TABLE UserCategory ADD CONSTRAINT FK_UserCategory_categoryIdx_Category_categoryIdx FOREIGN KEY (categoryIdx)
 REFERENCES Category (categoryIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;


-- Career Table Create SQL
CREATE TABLE Career
(
    `careerIdx`        INT            NOT NULL    AUTO_INCREMENT COMMENT '이력 인덱스', 
    `careerName`       VARCHAR(45)    NULL        COMMENT '활동이름', 
    `careerContent`    VARCHAR(45)    NULL        COMMENT '활동내용', 
    `careerStartDate`  VARCHAR(45)    NULL        COMMENT '활동시작날짜', 
    `carerrEndDate`    VARCHAR(45)    NULL        COMMENT '활동종료날짜', 
    `category`         VARCHAR(45)    NULL        COMMENT '카데고리 이름', 
    `userIdx`          INT            NULL        COMMENT '사용자 인덱스', 
    `careerIng`        TINYINT        NULL        DEFAULT 0 COMMENT '진행중', 
    PRIMARY KEY (careerIdx)
);

ALTER TABLE Career COMMENT '이력사항';

ALTER TABLE Career ADD CONSTRAINT FK_Career_userIdx_User_userIdx FOREIGN KEY (userIdx)
 REFERENCES User (userIdx)  ON DELETE RESTRICT ON UPDATE RESTRICT;


INSERT INTO Category(categoryIdx, categoryName) VALUES(0,'기획');
INSERT INTO Category(categoryIdx, categoryName) VALUES(1,'사진/영상');

SELECT*FROM User;
SELECT*FROM UserCategory;
SELECT*FROM Category;
DROP TABLE UserCategory;
DELETE FROM UserCategory;
DELETE FROM User;