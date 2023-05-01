package com.example.designpattern.observer.code;

import java.util.stream.Stream;

public enum ObserverStatus {
    COMMON, WARNING, DANGER
    ;

    public static ObserverStatus findByName(String name) {
        return Stream.of(values())
                .filter(value -> value.name().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("일치하는 name 이 존재하지 않습니다."))
                ;
    }
}
