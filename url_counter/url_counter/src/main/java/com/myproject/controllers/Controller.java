package com.myproject.controllers;

import com.myproject.checkers.URLChecker;
import com.myproject.models.TrendURL;
import com.myproject.savers.Saver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Controller {

    @Autowired
    private URLChecker urlChecker;
    @Autowired
    private Saver saver;

    public void receive(String url){
        boolean trending = urlChecker.check(url);
        if (trending){
            saver.save(
                    TrendURL
                            .builder()
                            .text(url)
                            .time(LocalDateTime.now().toString())
                            .build()
            );
            System.out.println(url + "Saved");
        }
    }
}
