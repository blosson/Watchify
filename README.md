# Watchify
<img src="https://github.com/Diligent0924/Watchify/assets/62194486/a160ec31-b444-4f13-bbdd-22ae482aaaa8"  width="1200" height="600"/>


다양한 컨텐츠를 스케줄링 받아 OTT를 보다 알차게 사용해보세요!

## 만든 사람들
| 프로필                                                    | 이름 | 역할                                                                                                                                                                       | GitHub                                   |
|--------------------------------------------------------|----|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------|
| <img src="https://github.com/gittgi.png" width="50"> | 김준형 | <img src="https://img.shields.io/badge/-LEADER-yellow"> <img src="https://img.shields.io/badge/-FRONTEND-lightblue"> | [@gittgi](https://github.com/gittgi) |
| <img src="https://github.com/gobeul.png" width="50"> | 고병진 | <img src="https://img.shields.io/badge/-BACKEND-green"> | [@gobeul](https://github.com/gobeul) |
| <img src="https://github.com/zxzx9404.png" width="50">  | 최은성 | <img src="https://img.shields.io/badge/-FRONTEND-lightblue"> <img src="https://img.shields.io/badge/-PRESENTOR-pink">                                                     | [@zxzx9404](https://github.com/zxzx9404)   |
| <img src="https://github.com/Diligent0924.png" width="50">   | 박용찬 | <img src="https://img.shields.io/badge/-CI/CD-gray"> <img src="https://img.shields.io/badge/-BACKEND-green">                                                     | [@Diligent0924](https://github.com/Diligent0924)     |
| <img src="https://github.com/blosson.png" width="50"> | 손민혁 | <img src="https://img.shields.io/badge/-FRONTEND-lightblue"> | [@blosson](https://github.com/blosson) |
| <img src="https://github.com/castleis.png" width="50">  | 김성은 | <img src="https://img.shields.io/badge/-BACKEND-green"> | [@castleis](https://github.com/castleis)   |

## 목차
### [1. 서비스 개요](#서비스-개요)
### [2. 서비스 소개](#서비스-소개)
   - [컨텐츠 스케줄링](#컨텐츠-스케줄링)
   - [컨텐츠 추천](#컨텐츠-추천)
   - [간편 로그인](#간편-로그인)
   - [알람 및 공유](#알람-및-공유)
### [3. UCC](#UCC)
### [4. 기술 스택](#기술-스택)
  - [Frontend](#frontend)
  - [Backend](#backend)
  - [CI/CD](#cicd)
### [6. 프로젝트 산출물](#프로젝트-산출물)
  - [데이터베이스](#데이터베이스)
  - [시스템 아키텍처](#시스템-아키텍처)
  - [Figma](#figma)
---
<br>

# 서비스 개요
## 1. 서비스 소개
Watchify는 사용자가 ott 서비스를 좀 더 알차게 즐길 수 있도록 ott 컨텐츠 추천 및 스케줄링을 해주는 서비스입니다. 

## 2. 기획 배경
OTT 구독 기간과 사용자의 취향 등을 반영하여 컨텐츠를 추천받고 시청 스케줄을 만든다면 보다 OTT를 알차게 사용할 수 있을 것이라는 기대에서 시작하였습니다.

## 3. 디자인 컨셉
- 네X버의 그린 닷을 모티브로 한 Watchify만의 레드 닷으로 바텀 탭이 없는 깔끔한 UI를 확인할 수 있습니다.
- 깔끔한 UI를 위해 black과 orenge 컬러를 사용하였습니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/c5484f1b-d7b3-48c5-adcd-d932a55392fe"  width="200" height="400"/>


<img src="https://github.com/Diligent0924/Watchify/assets/62194486/35e34501-dad9-4c97-b20f-af42dcda83c6"  width="200" height="400"/>

# 서비스 소개
## 컨텐츠 스케줄링
사용자가 시청하기 원하는 컨텐츠를 사용자의 시청 패턴에 맞도록, OTT 구독 정보에 맞춰 스케줄링합니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/386700b0-0f5b-401e-9efe-67d24f941fc9"  width="200" height="400"/>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/b2ada86b-a00a-43d2-8f2c-22c687789994"  width="200" height="400"/>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/ab3e0209-865d-4715-b4be-0b1018456d22"  width="200" height="400"/>


### 1. 시청 패턴 지정
프로필 페이지에서 자신의 시청 패턴을 저장할 수 있습니다. 각 요일별로 그래프 바를 움직여 시청 시간을 저장하세요. 그래프를 직접 움직여 설정하는 것이 귀찮다면 본인 시청 패턴에 맞는 프리셋을 선택할 수도 있습니다.
<br>


### 2. 스케줄링 알고리즘
사용자가 시청하기 원하는 컨텐츠를 선택하면, 사용자가 미리 지정해놓은 시청 패턴에 따라 스케줄링을 시작합니다.
- 스케줄링 시 최소한의 OTT를 구독하도록 구성합니다.
- 만약 사용자가 선택한 특정 OTT의 컨텐츠를 스케줄링할 때, 구독 기간이 남아있다면 사용자의 시청기록, 찜 목록, 현재 스케줄링을 요청한 컨텐츠들의 정보를 고려하여 새로운 컨텐츠를 추천하여 구독 기간동안 알차게 컨텐츠를 즐길 수 있도록 구성합니다.
- n부작 드라마를 스케줄링할 때, m화까지 시청하였다면 m+1화부터 스케줄링을 시작합니다.

### 3. 스케줄 조회
스케줄링을 완료했다면 스케줄 페이지에서 달력으로 한 눈에 스케줄을 확인할 수 있습니다. 각 날짜를 터치하면 해당 날의 시청할 컨텐츠를 바텀시트로 확인하고, 각 컨텐츠의 세부정보를 확인할 수 있습니다. 또한 보러가기 버튼을 누른다면 해당 ott 스트리밍 페이지로 이동합니다.
<br>

## 컨텐츠 추천
사용자 기반 협업 필터링을 사용하여 개인별로 컨텐츠를 추천합니다. 사용자가 시청하거나 별점을 매기거나, 혹은 위시리스트에 추가한 컨텐츠를 기반으로 컨텐츠를 추천합니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/5dbf3824-1265-49ce-aa5d-a69940e76466"  width="200" height="400"/>
<img src="https://github.com/Diligent0924/Watchify/assets/62194486/ea8d255f-5014-4392-a070-64b62ba256b9"  width="200" height="400"/>

### 1. 추천 알고리즘
1. DB 조회
  - 먼저 사용자가 선택한 장르, OTT 정보와 사용자의 시청, 평점 기록 및 위시 리스트를 반영하여 컨텐츠 데이터를 조회합니다.
  - 또한 사용자 기반 협업 필터링을 위해 사용자와 비슷한 취향의 유저의 시청, 평점 기록을 기반으로 비슷한 취향의 유저들의 컨텐츠 데이터를 조회합니다.
  - 위에서 조회한 컨텐츠들을 predict 함수를 호출하여 상호 비교하여 추천도가 높은 순으로 출력합니다.

2. 사용자 간 유사도 측정
  - 유저들 간의 유사도를 계산하여 사용자와의 유사도를 계산합니다.
  - smilarity를 계산할 때 `RatingCountMatrix` 클래스의 `get_agreement_count()` 함수를 호출하여 계산합니다.
  - smilarity를 계산할 각 유저의 취향정보를 조회합니다.
  - 시청하거나, 평점을 매긴 컨텐츠가 겹칠수록 유사도가 높아집니다.

3. 추천도 예측
  - 추천도를 계산하기 위한 추천 종류에 따라 predict 함수를 정의하였습니다. 추천 종류에는 개인 별 추천, OTT 별 추천, 스케줄링 추천이 있습니다. 
  - 비슷한 취향의 유저들의 컨텐츠 데이터와 사용자의 컨텐츠 데이터를 비교하며 `SmilarytiyMatrix`클래스의 `get_user_similarity()` 함수를 호출하여 유저 유사도(`user_similarity`)와 이를 이용하여 사용자들이 매긴 평점에 가중치(`weighted_rating`)를 부여합니다.
  - 가중치 점수가 높을수록 추천 순위가 높아집니다.
  - 가중치가 부여된 점수 순으로 컨텐츠를 정렬합니다.

## 검색 기능
실시간 검색 기능을 통하여 사용자가 검색을 더 빠르고 편하게 할 수 있도록 도움을 주며 찜 등을 통하여 이후 스케쥴링 알고리즘 등에 포함되어 들어가게 하는 기능
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/ccfa919b-d690-40e3-989d-b9a57690ad52"  width="200" height="400"/>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/9a1bc8b7-01bb-4856-bd19-452ce018afec"  width="200" height="400"/>

## 간편 로그인
SNS 로그인으로 사용자가 간편하게 서비스에 접근할 수 있도록 합니다. 카카오톡과 구글 로그인을 지원합니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/8aa1535e-e6b2-4ee3-aae4-530857e21dac"  width="200" height="400"/>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/936c99e0-c7b0-4719-97b0-b8b5673d4bae"  width="200" height="400"/>

## 알람 및 공유
### 알람
프로필 페이지의 설정 탭에서 알람 on/off 기능으로 알람을 설정할 수 있습니다. 알람을 on으로 설정한다면, 매일 정해진 시간에 오늘의 시청 스케줄을 알림합니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/e67e7df1-4b2d-4e61-b7cd-197cbe188eb9"  width="200" height="400"/>


### 공유
컨텐츠 시청 스케줄을 받은 후, 스케줄 페이지에서 카카오톡 공유하기를 통해 공유할 수 있습니다.
<br>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/20444f3c-79e4-4e87-8f08-28f36eb78ff6"  width="200" height="400"/>

<img src="https://github.com/Diligent0924/Watchify/assets/62194486/da09e942-a529-46bf-850f-88d75634666d"  width="200" height="400"/>


<br>

# 기술 스택
## Frontend
- React
- Recoil
- Typescript


## Backend
- Spring Boot
- JPA
- Oauth2
- JWT
- MYSQL


### Django
추천 알고리즘 서버를 Django로 구축하였습니다. Rest API를 사용하며 Spring의 요청이 들어오면 추천 알고리즘을 실행시켜 추천 결과를 전송합니다. 
- Rest API
Django rest_framework의 APIView를 사용하여 rest api를 구성하였습니다.
또한 데이터 직렬화를 위해 django.serializer를 사용하여 추천 결과를 직렬화하여 Response로 전송합니다. 
- MySQL
보다 빠른 추천을 위해 Django의 기본 DB를 MySQL에 연결하였습니다. Django에서는 추천 요청을 받으면 MySQL의 데이터를 읽어와 사용자 기반 추천을 실행합니다. DB의 동기화?를 위해 Django에서는 읽기만 진행합니다.

## CI/CD
- AWS  
  AWS에서 사용한 주요 서비스는 RDS(MYSQL), RDSReadOnlyReplica, S3, EC2를 사용하였습니다. 2개의 RDS를 이용한 이유는 기존의 모놀리식이나 여러 port에서 하나의 RDB에만 연결하는 것이 아닌 Port하나당 하나의 RDS를 연결하여 Traffic을 관리하고자 하였습니다. 또한, S3를 통하여 Image 효과적으로 관리하고자 노력하였습니다.
- Kubernetes  
  Container를 관리하기 위해서 단순 docker container보다 더 확장성이 있고 체계적인 Orchestration이 있어야 한다고 생각하여 구축하였습니다. Nginx-ingress를 통하여 Reverse Proxy를 하였으며 Certification을 통한 SSL 인증 과정을 진행하였습니다. YAML 파일을 통하여 Deployment(Service 및 Pods)를 관리하였습니다.
- Docker  
  Kubernetes의 CRI-O containerd와는 별개로 EC2 내 Docker를 설치 후 Redis, Jenkins를 설치하였습니다. Redis와 같은 Database(NoSQL)은 Kubernetes에서 관리하는 것보다 Port가 고정적인 Docker Container가 적합하다고 생각하였습니다. 또한, 설계를 CI와 CD를 나누어서 진행하였기에 Kubernetes 내부에 있을 필요가 없는 Jenkins는 Container에서 동작하게 진행하였습니다.
- Jenkins  
  Jenkins는 CI만을 담당하며 Frontend, Backend1, Backend2, AI Image Build > Dockerhub push > Deployment 변경사항 변경(YAML 변경)을 진행하였습니다.  
  Kubernetes는 Docker Image를 인식할 수 없기에 외부 Dockerhub에서 이미지를 저장한 것을 받아와 Deployment를 변경하도록 진행하였습니다.  
  또한, AWS S3 Secret Key, RDS username/password와 같은 민감한 부분들을 Gitlab에 올리는 것은 큰 위험이 따르기 때문에 Jenkins Global Variable을 이용한 민감 정보를 변수 처리하여 진행하였습니다.
- ArgoCD  
  상태관리도구를 이용하여 Trouble Shooting 등을 효과적으로 확인하였습니다. 각각의 pod를 시각적으로 확인하고 Deploy에서 생성되는 문제점을 효과적으로 관리함으로써 빠른 대처가 가능하였습니다.

# 프로젝트 산출물
### 데이터베이스
   
![ERD](https://github.com/Diligent0924/Watchify/assets/62194486/abfa6767-b50b-4ea9-ba55-4bc355219a17)

### 시스템 아키텍처
<img src="https://github.com/Diligent0924/Watchify/assets/62194486/adc952f9-a97b-43a5-84c9-b6b164db0d03"  width="1000" height="500"/>

### Figma

![Figma1](https://github.com/Diligent0924/Watchify/assets/62194486/15154d3a-2351-42b4-aa92-edf873791508)

![Figma2](https://github.com/Diligent0924/Watchify/assets/62194486/222d4679-bf2c-4aeb-a1c3-84e107bba990)
