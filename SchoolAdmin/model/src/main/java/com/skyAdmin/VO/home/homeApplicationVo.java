package com.skyAdmin.VO.home;

import lombok.Builder;
import lombok.Data;

import java.util.Date;


@Builder
@Data
public class homeApplicationVo {
    private Integer id;

    /**
     * 申请人
     */
    private String applicant;

    /**
     * 申请内容
     */
    private String applyContent;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 是否处理
     */
    private String status;
    /**
     * 处理人
     */
    private String applyName;

}
