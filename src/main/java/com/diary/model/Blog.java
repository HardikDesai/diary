package com.diary.model;

import lombok.Getter;
import lombok.Setter;

public class Blog {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private String photoUrl;
    @Getter
    @Setter
    private String description;

}
