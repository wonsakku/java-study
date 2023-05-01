package com.example.designpattern.observer.code;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StatusSMSSender implements StatusSender{
    @Override
    public void info(ObserverStatus status) {
        log.info("문자로 연락 보내기. 상태값 : {}", status);
    }
}
