package com.springboard.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class User {
    private Long id;
    private String name;
    private String nickname;
    private String email;
    private String passwd;
    private Date regdate;

}
