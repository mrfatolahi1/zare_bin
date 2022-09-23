package com.myproject;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TrendURLRepository extends ElasticsearchRepository<TrendURL, String> {
}
