package com.skyAdmin.DTO.home;

import lombok.Data;

@Data
public class homeApplicationDTO {
    /**
     * id
     */
    private Integer id;
    /**
     * 申请内容
     */
    private String applyContent;
    /**
     * 申请人
     */
    private String applicant;
}
