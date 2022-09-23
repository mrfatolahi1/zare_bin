package com.myproject;

import org.springframework.stereotype.Service;

@Service
public class SaverService {
    private TrendURLRepository trendURLRepository;

    public void createProductIndex(final TrendURL trendURL) {
        trendURLRepository.save(trendURL);
    }
}
