package com.myproject.checkers;

import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

@Component
public class URLChecker {

    private Map<String, LinkedList<LocalDateTime>> map;

    public boolean check(String url){
        if (this.map == null){
            this.map = new HashMap<>();
        }
        if (!map.containsKey(url)){
            LinkedList<LocalDateTime> urlData = new LinkedList<>();
            urlData.add(LocalDateTime.now());
            map.put(url, urlData);
        } else {
            map.put(url, safeAdd(map.get(url), LocalDateTime.now()));
        }

        int trendingFrequency = 4;
        if (map.get(url).size() >= trendingFrequency){
            map.get(url).clear();
            return true;
        } else {
            return false;
        }
    }

    private LinkedList<LocalDateTime> safeAdd(LinkedList<LocalDateTime> urlData, LocalDateTime newUrlReceivingTime){
        // number of objects that should be deleted from begining of the list, (remember that
        // we can't remove object from list when iterating on it)
        int mostDeleteObject = 0;

        for (LocalDateTime time : urlData){
            int hotDuration = 5;
            if (Duration.between(time, newUrlReceivingTime).getSeconds() < hotDuration){
                break;
            } else {
                mostDeleteObject++;
            }
        }
        for (int i = 0; i < mostDeleteObject; i++) {
            urlData.removeFirst();
        }
        urlData.add(newUrlReceivingTime);
        return urlData;
    }
}
