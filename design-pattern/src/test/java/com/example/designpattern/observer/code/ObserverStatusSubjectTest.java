package com.example.designpattern.observer.code;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ObserverStatusSubjectTest {


    @Autowired ObserverStatusSubject observerStatusSubject;
    @Test
    void initTest(){


        for (StatusSender statusSender : observerStatusSubject.getObservers().get(ObserverStatus.COMMON)) {
            assertThat(statusSender).isExactlyInstanceOf(StatusEmailSender.class);
            assertThat(statusSender).isNotInstanceOfAny(StatusKakaoTalkSender.class, StatusSMSSender.class);
        }
        for (StatusSender statusSender : observerStatusSubject.getObservers().get(ObserverStatus.WARNING)) {
            assertThat(statusSender).isInstanceOfAny(StatusEmailSender.class, StatusKakaoTalkSender.class);
            assertThat(statusSender).isNotInstanceOf(StatusSMSSender.class);
        }
        for (StatusSender statusSender : observerStatusSubject.getObservers().get(ObserverStatus.DANGER)) {
            assertThat(statusSender).isInstanceOfAny(StatusEmailSender.class, StatusKakaoTalkSender.class, StatusSMSSender.class);
        }
    }


}