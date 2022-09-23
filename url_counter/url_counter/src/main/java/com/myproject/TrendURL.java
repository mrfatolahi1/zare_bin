package com.myproject;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "TrendURL")
public class TrendURL {

    @Id
    private String text;

    @Field(type = FieldType.Text, name = "Time")
    private String time;

}
