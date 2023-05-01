package com.example.designpattern.observer;

import com.example.designpattern.observer.code.ObserverStatus;
import com.example.designpattern.observer.code.ObserverStatusSubject;
import com.example.designpattern.observer.code.StatusEmailSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("/observer")
public class ObserverController {

    private final ObserverStatusSubject observerStatusSubject;

    @GetMapping
    public String observerPage(){
        return "observer";
    }

    @ResponseBody
    @GetMapping("/info")
    public String info(@RequestParam(value = "code") String code){
        ObserverStatus status = ObserverStatus.findByName(code);
        observerStatusSubject.notifyToObservers(status);
        return "처리되었습니다.";
    }


}
