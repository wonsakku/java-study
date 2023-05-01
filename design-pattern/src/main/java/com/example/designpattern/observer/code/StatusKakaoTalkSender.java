package com.example.designpattern.observer.code;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class StatusKakaoTalkSender implements StatusSender{
    @Override
    public void info(ObserverStatus status) {
        log.info("카카오톡으로 연락 보내기, 상태값 : {}", status);
    }
}
