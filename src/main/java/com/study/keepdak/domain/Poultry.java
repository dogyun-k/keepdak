package com.study.keepdak.domain;

import com.study.keepdak.dto.CreatePoultryDto;
import com.study.keepdak.dto.UpdatePoultryDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Poultry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
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

    @Builder
    public Poultry(
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
        date = LocalDateTime.now();
        this.room = room;
        this.chickenNum = chickenNum;
        this.prevChickenNum = prevChickenNum;
        this.prevFeedStock = prevFeedStock;
        this.curFeedStock = curFeedStock;
        this.todayTotalFeedAmount = todayTotalFeedAmount;
        this.weekAge = weekAge;
        this.todayDeadAmount = todayDeadAmount;
        this.feedAmountPerOne = feedAmountPerOne;
        this.jumboNum = jumboNum;
        this.extraLargeNum = extraLargeNum;
        this.largeNum = largeNum;
        this.mediumNum = mediumNum;
        this.smallNum = smallNum;
    }

    public static Poultry of() {
        return new Poultry();
    }

    public static Poultry from(CreatePoultryDto createPoultryDto) {
        return Poultry.builder()
                .room(createPoultryDto.getRoom())
                .chickenNum(createPoultryDto.getChickenNum())
                .prevChickenNum(createPoultryDto.getPrevChickenNum())
                .prevFeedStock(createPoultryDto.getPrevFeedStock())
                .curFeedStock(createPoultryDto.getCurFeedStock())
                .todayTotalFeedAmount(createPoultryDto.getTodayTotalFeedAmount())
                .weekAge(createPoultryDto.getWeekAge())
                .todayDeadAmount(createPoultryDto.getTodayDeadAmount())
                .feedAmountPerOne(createPoultryDto.getFeedAmountPerOne())
                .jumboNum(createPoultryDto.getJumboNum())
                .extraLargeNum(createPoultryDto.getExtraLargeNum())
                .largeNum(createPoultryDto.getLargeNum())
                .mediumNum(createPoultryDto.getMediumNum())
                .smallNum(createPoultryDto.getSmallNum())
                .build();
    }

    public void update(UpdatePoultryDto updatePoultryDto) {
        this.room = updatePoultryDto.getRoom();
        this.chickenNum = updatePoultryDto.getChickenNum();
        this.prevChickenNum = updatePoultryDto.getPrevChickenNum();
        this.prevFeedStock = updatePoultryDto.getPrevFeedStock();
        this.curFeedStock = updatePoultryDto.getCurFeedStock();
        this.todayTotalFeedAmount = updatePoultryDto.getTodayTotalFeedAmount();
        this.weekAge = updatePoultryDto.getWeekAge();
        this.todayDeadAmount = updatePoultryDto.getTodayDeadAmount();
        this.feedAmountPerOne = updatePoultryDto.getFeedAmountPerOne();
        this.jumboNum = updatePoultryDto.getJumboNum();
        this.extraLargeNum = updatePoultryDto.getExtraLargeNum();
        this.largeNum = updatePoultryDto.getLargeNum();
        this.mediumNum = updatePoultryDto.getMediumNum();
        this.smallNum = updatePoultryDto.getSmallNum();
    }
}
