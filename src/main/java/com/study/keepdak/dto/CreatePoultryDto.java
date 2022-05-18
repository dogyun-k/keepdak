package com.study.keepdak.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class CreatePoultryDto {

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

    public static CreatePoultryDto of(
            String room,
            Integer chickenNum,
            Integer prevChickenNum,
            Integer prevFeedStock,
            Integer curFeedStock,
            Integer todayTotalFeedAmount,
            Integer weekAge,
            Integer todayDeadAmount,
            Integer feedAmountPerOne,
            Integer jumboNum,
            Integer extraLargeNum,
            Integer largeNum,
            Integer mediumNum,
            Integer smallNum
    ) {
        return CreatePoultryDto.builder()
                .room(room)
                .chickenNum(chickenNum)
                .prevChickenNum(prevChickenNum)
                .prevFeedStock(prevFeedStock)
                .curFeedStock(curFeedStock)
                .todayTotalFeedAmount(todayTotalFeedAmount)
                .weekAge(weekAge)
                .todayDeadAmount(todayDeadAmount)
                .feedAmountPerOne(feedAmountPerOne)
                .jumboNum(jumboNum)
                .extraLargeNum(extraLargeNum)
                .largeNum(largeNum)
                .mediumNum(mediumNum)
                .smallNum(smallNum)
                .build();
    }

}
