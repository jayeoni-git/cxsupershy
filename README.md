 # INHA_NET_ZERO_HACKATHON
AWS에서 주관하는 INHA SW NET-Zero 해커톤에서 사용한 서버 코드입니다. Spring Boot를 활용하여 "탄소중립실현" 모바일 애플리케이션의 프로토타입을 구현하였습니다.
## 👨‍🏫 프로젝트 소개
"저탄소 에너지 사용 점수를 통한 녹색소비 솔루션"을 주제로 한 안드로이드 애플리케이션입니다. 소비자들의 저탄소 소비를 독려하기 위해 에너지소비효율을 비교/분석하는 플랫폼을 제작해보았습니다. 

## ⏲️ 개발 기간 
- 2023.07.13(목) ~ 2023.07.15(토)
- 탄소중립의 이해, DevOps 특강
- 아이디어 노트 작성
- 코딩테스트
- 아이디어 발표
- 해커톤
- 발표평가
  
## 🧑‍🤝‍🧑 개발자 소개 
- **변현섭** : 팀장, Server 개발자
- **강민교** : 데이터 분석
- **곽수연** : 데이터 분석
- **양원철** : Android 개발자
- **김가영** : UX UI Designer
  
![개발자 소개](https://github.com/gmlstjq123/INHA_NET_ZERO_HACKATHON/blob/hello_there-12/%EA%B0%9C%EB%B0%9C%EC%9E%90%20%EC%86%8C%EA%B0%9C.png)

## 💻 개발환경
- **Version** : Java 17
- **IDE** : IntelliJ
- **Framework** : SpringBoot 2.7.11
- **ORM** : JPA

## ⚙️ 기술 스택
- **Server** : AWS EC2
- **DataBase** : AWS RDS, Datagrip, JPQL, ERD AqueryTool
- **WS/WAS** : Nginx, Tomcat
- **OCR** : AWS Textract, AWS S3
- **아이디어 회의** : Slack, Zoom, Notion

## 📝 프로젝트 아키텍쳐
![프로젝트 아키텍쳐](https://github.com/gmlstjq123/INHA_NET_ZERO_HACKATHON/blob/hello_there-12/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%EC%95%84%ED%82%A4%ED%85%8D%EC%B3%90.png)

## 📌 화면 주요 기능
![image](https://github.com/user-attachments/assets/78d270f8-51b5-4b5d-b9b2-83bfbd8a9a69)
- 시작 페이지에서 기존 사용자라면 로그인을 눌러 얼굴인식페이지로 넘어가 인식을 진행한다.
- 처음이라면 새프로필 등록하기를 눌러 닉네임 페이지로 넘어간다.

![image](https://github.com/user-attachments/assets/f0981a82-6fc7-49b7-a566-34d8ababe99f)
![image](https://github.com/user-attachments/assets/ff6a1443-ab75-4196-884c-6af7798ff736)
![image](https://github.com/user-attachments/assets/4c406a28-f458-45d4-b335-6e7fbeac59a9)
![image](https://github.com/user-attachments/assets/b75b2e23-72c4-4f6d-954b-350df1463c9d)
![image](https://github.com/user-attachments/assets/b9a85f34-67de-4153-a14f-1f54415b9530)
- 닉네임 및 아이콘, 관심있는 모드, 시트 높낮이와 온도를 설정하게 되면 프로필 등록이 완료된다.
- 이후 사용자 맞춤 메인 대시보드를 보여준다.

![image](https://github.com/user-attachments/assets/60bda219-b1ee-4f76-a286-705b9c562efd)
- 메인 대시보드는 사용자가 설정한 정보를 보여주며 사용자의 상태 또한 보여준다.

![image](https://github.com/user-attachments/assets/282e49ab-ab2f-4336-84c3-1d0a3762c5df)
- 카카오 api를 통해 화면을 연결시켜놓았으며 현재위치와 목적지로 길찾기 기능을 구현해 놓았다.

![image](https://github.com/user-attachments/assets/a3825c94-6968-48d8-92d9-ecee57413646)
![image](https://github.com/user-attachments/assets/d58a6ae5-ed50-4f85-ba0e-afad58a7fd2b)
- 오른쪽상단에는 여러 사용자를 위한 프로필 전환 기능을 구현해 놓았다.
- 휴식모드를 통해 조명 밝기 조절, 소음모드, ASMR모드를 조절할 수 있는 화면을 구현했다.





 

      
## ✒️ API
- API 상세설명 : <https://velog.io/@gmlstjq123/INHA-SW-NET-Zero-%EA%B3%B5%EB%8F%99%ED%95%B4%EC%BB%A4%ED%86%A4-Server-%EC%BD%94%EB%93%9C#3-%ED%92%88%EB%AA%A9%EB%B3%84-%EB%9E%AD%ED%82%B9-%EC%A1%B0%ED%9A%8C>


- API 명세서 : <https://makeus-challenge.notion.site/API-ecafb2a8fb8c427c9e78abf6120d674b>
