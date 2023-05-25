package com.mybatis.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

/**
 * @author 刘文成
 * @create 2022/2/21 20:37
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT";
        String username="root";
        String password="19930803";
        String path = "/Users/hsmliu/IdeaProjects/mybatis-plus-generator/src/main/java";
        String xmlPath = "/Users/hsmliu/IdeaProjects/mybatis-plus-generator/src/main/resources/mapper";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("刘文成") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir() //禁止打开输出目录
                            .outputDir(path); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.mybatis") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, xmlPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok(); //启动lombok
                    builder.mapperBuilder().enableMapperAnnotation().build(); //启用@mapper注释
                    builder.controllerBuilder().enableHyphenStyle().enableRestStyle(); //启用驼峰转连字符样式
                    builder.addExclude(); // 设置需要排除的表名
//                    builder.addInclude() // 设置需要包含的表，参数为空表示全部包含
                })
                .execute();
    }
}
