package com.skyAdmin.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.Types;
import java.util.Collections;

public class generator {
    public static void main(String[] args) {
        // 使用 FastAutoGenerator 快速配置代码生成器
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/adminsql?serverTimezone=GMT%2B8", "root", "root")
                .globalConfig(builder -> {
                    builder.author("哞哞") // 设置作者
                            .outputDir("SchoolAdmin/server/src/main/java"); // 输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.skyAdmin") // 设置父包名
                            .entity("entity") // 设置实体类包名
                            .controller("controller/home")
                            .mapper("mapper") // 设置 Mapper 接口包名
                            .service("service") // 设置 Service 接口包名
                            .serviceImpl("service.impl") // 设置 Service 实现类包名
                            .xml("mappers"); // 设置 Mapper XML 文件包名
                })
                .strategyConfig(builder -> {
                    builder.addInclude("file") // 设置需要生成的表名
                            .entityBuilder()
                            .enableRemoveIsPrefix()
                            .enableLombok() // 启用 Lombok
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle(); // 启用 REST 风格
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
                .execute(); // 执行生成
    }
}
