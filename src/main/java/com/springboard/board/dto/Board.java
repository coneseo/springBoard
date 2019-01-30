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
    private int read_count;
    private int group_no;
    private int group_seq;
    private int group_depth;

    public Board(){
        this.regdate = new Date();
        this.read_count = 0;
        this.group_no = 0;
        this.group_seq = 0;
        this.group_depth = 0;
    }

}
