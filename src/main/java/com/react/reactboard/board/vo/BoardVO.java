package com.react.reactboard.board.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
    private Integer boardNo;
    private String boardType;
    private String title;
    private String contents;
    private String userId;
    private String createdTime;
    private String updatedTime;
    private String likes;
    private String counts;
}
