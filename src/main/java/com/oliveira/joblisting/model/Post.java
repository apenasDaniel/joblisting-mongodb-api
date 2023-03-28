package com.oliveira.joblisting.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "JobPost")
public class Post {

    private String profile;

    private String description;
    private int exp;
    private String techs[];



}
