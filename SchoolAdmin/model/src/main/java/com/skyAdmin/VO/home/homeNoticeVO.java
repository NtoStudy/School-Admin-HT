package com.skyAdmin.VO.home;

import lombok.Data;

// 后端给前端返回的是VO
// 前端给后端的是DTO
@Data
public class homeNoticeVO {

    private Integer id;
    /**
     * 公告标题
     */
    private String title;

    /**
     * 公告内容
     */
    private String content;

    /**
     * 发布时间
     */
    private String publish_time;

    /**
     * 发布人
     */
    private String publisher;

    /**
     * 浏览量
     */
    private Integer views;
}
