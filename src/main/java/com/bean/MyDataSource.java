package com.bean;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MyDataSource {
    private String username;
    private String password;
    private String url;
    private String driverClass;

}
