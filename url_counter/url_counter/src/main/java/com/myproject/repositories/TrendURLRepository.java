package com.myproject.repositories;

import com.myproject.models.TrendURL;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TrendURLRepository extends ElasticsearchRepository<TrendURL, String> {
}
