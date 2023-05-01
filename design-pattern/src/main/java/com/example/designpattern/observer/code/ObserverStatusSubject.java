package com.example.designpattern.observer.code;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ObserverStatusSubject {

    @Getter
    private final Map<ObserverStatus, List<StatusSender>> observers;

    @Autowired
    public ObserverStatusSubject(StatusEmailSender statusEmailSender,
                                 StatusKakaoTalkSender statusKakaoTalkSender,
                                 StatusSMSSender statusSMSSender) {
        this.observers = Map.of(
                ObserverStatus.COMMON, List.of(statusEmailSender),
                ObserverStatus.WARNING, List.of(statusEmailSender, statusKakaoTalkSender),
                ObserverStatus.DANGER, List.of(statusEmailSender, statusKakaoTalkSender, statusSMSSender)
        );
    }

    public void notifyToObservers(ObserverStatus status){
        observers.get(status).forEach(observer -> observer.info(status));
    }

}




