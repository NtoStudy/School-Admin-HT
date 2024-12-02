package com.skyAdmin.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 文件表
 * </p>
 *
 * @author 哞哞
 * @since 2024-12-02
 */
@Getter
@Setter
@TableName("file")
public class File implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId("id")
    private Integer id;

    /**
     * 标题
     */
    @TableField("title")
    private String title;

    /**
     * 上传人
     */
    @TableField("uploader")
    private String uploader;

    /**
     * 上传时间
     */
    @TableField("upload_time")
    private LocalDateTime uploadTime;

    /**
     * 文件内容或描述
     */
    @TableField("content")
    private String content;

    /**
     * 状态
     */
    @TableField("status")
    private String status;

    /**
     * 查看次数
     */
    @TableField("views")
    private Integer views;

    /**
     * 是否重要
     */
    @TableField("is_important")
    private Boolean isImportant;
}
