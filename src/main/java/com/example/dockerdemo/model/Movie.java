package com.example.dockerdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collation = "movies")
@Builder
@Data
public class Movie {

    @Id
    @Field("movie_id")
    private String id;

    @Field("movie_name")
    private String name;

    @Field("category")
    private String category;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Field("created_date")
    private Date createdDate;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Field("updated_date")
    private Date updatedDate;
}
