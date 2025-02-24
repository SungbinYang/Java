# 김영한의 실전 자바 - 고급 1편, 멀티스레드와 동시성

## 강의 소개와 자료

- 강의 소개

## 프로세스와 스레드 소개

- 멀티태스킹과 멀티프로세싱
- 프로세스와 스레드
- 스레드와 스케줄링
- 컨텍스트 스위칭

## 스레드 생성과 실행

- 프로젝트 환경 구성
- 스레드 시작1
- 스레드 시작2
- 데몬 스레드
- 스레드 생성 - Runnable
- 로거 만들기
- 여러 스레드 만들기
- Runnable을 만드는 다양한 방법
- 문제와 풀이
- 정리

## 스레드 제어와 생명 주기1

- 스레드 기본 정보
- 스레드의 생명주기 - 설명
- 스레드의 생명 주기 - 코드
- 체크 예외 재정의
- join - 시작
- join - 필요한 상황
- join - sleep 사용
- join - join 사용
- join - 특정 시간 만큼만 대기
- 문제와 풀이

## 스레드 제어와 생명 주기2

- 인터럽트 - 시작1
- 인터럽트 - 시작2
- 인터럽트 - 시작3
- 인터럽트 - 시작4
- 프린터 예제1 - 시작
- 프린터 예제2 - 인터럽트 도입
- 프린터 예제3 - 인터럽트 코드 개선
- yield - 양보하기
- 프린터 예제4 - yield 도입
- 정리

## 메모리 가시성

- volatile, 메모리 가시성1
- volatile, 메모리 가시성2
- volatile, 메모리 가시성3
- volatile, 메모리 가시성4
- 자바 메모리 모델(Java Memory Model)
- 정리

## 동기화 - synchronized

- 출금 예제 - 시작
- 동시성 문제
- 임계 영역
- synchronized 메서드
- synchronized 코드 블럭
- 문제와 풀이
- 정리

## 고급 동기화 - concurrent.Lock

- LockSupport1
- LockSupport2
- ReentrantLock - 이론
- ReentrantLock - 활용
- ReentrantLock - 대기 중단
- 정리

## 생산자 소비자 문제1

- 생산자 소비자 문제 - 소개
- 생산자 소비자 문제 - 예제1 코드
- 생산자 소비자 문제 - 예제1 분석 - 생산자 우선
- 생산자 소비자 문제 - 예제1 분석 - 소비자 우선
- 생산자 소비자 문제 - 예제2 코드
- 생산자 소비자 문제 - 예제2 분석
- Object - wait, notify - 예제3 코드
- Object - wait, notify - 예제3 분석 - 생산자 우선
- Object - wait, notify - 예제3 분석 - 소비자 우선
- Object - wait, notify - 한계
- 정리

## 생산자 소비자 문제2

- Lock Condition - 예제4
- 생산자 소비자 대기 공간 분리 - 예제5 코드
- 생산자 소비자 대기 공간 분리 - 예제5 분석
- 스레드의 대기
- 중간 정리 - 생산자 소비자 문제
- BlockingQueue - 예제6
- BlockingQueue - 기능 설명
- BlockingQueue - 기능 확인
- 정리

## CAS - 동기화와 원자적 연산

- 원자적 연산 - 소개
- 원자적 연산 - 시작
- 원자적 연산 - volatile, synchronized
- 원자적 연산 - AtomicInteger
- 원자적 연산 - 성능 테스트
- CAS 연산1
- CAS 연산2
- CAS 연산3
- CAS 락 구현1
- CAS 락 구현2
- 정리

## 동시성 컬렉션

- 동시성 컬렉션이 필요한 이유1 - 시작
- 동시성 컬렉션이 필요한 이유2 - 동시성 문제
- 동시성 컬렉션이 필요한 이유3 - 동기화
- 동시성 컬렉션이 필요한 이유4 - 프록시 도입
- 자바 동시성 컬렉션1 - synchronized
- 자바 동시성 컬렉션2 - 동시성 컬렉션
- 정리

## 스레드 풀과 Executor 프레임워크1

- 스레드를 직접 사용할 때의 문제점
- Executor 프레임워크 소개
- ExecutorService 코드로 시작하기
- Runnable의 불편함
- Future1 - 소개
- Future2 - 분석
- Future3 - 활용
- Future4 - 이유
- Future5 - 정리
- Future6 - 취소
- Future7 - 예외