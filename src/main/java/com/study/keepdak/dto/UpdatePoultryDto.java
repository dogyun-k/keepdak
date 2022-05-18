package com.study.keepdak.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UpdatePoultryDto {

    private String room;
    private Integer chickenNum;
    private Integer prevChickenNum;
    private Integer prevFeedStock;
    private Integer curFeedStock;
    private Integer todayTotalFeedAmount;
    private Integer weekAge;
    private Integer todayDeadAmount;
    private Integer feedAmountPerOne;
    private Integer jumboNum;
    private Integer extraLargeNum;
    private Integer largeNum;
    private Integer mediumNum;
    private Integer smallNum;

}
