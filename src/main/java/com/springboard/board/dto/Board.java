package com.springboard.board.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Board {
    private Long id;
    private Long user_id;
    private String title;
    private String nickname;
    private String content;
    private Date regdate;
    private int readcount;
    private int groupno;
    private int grpord;
    private int depth;

}
