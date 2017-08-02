package com.anyuncloud.service.container.impl;

import com.anyuncloud.service.container.YamlParser;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DefaultYamlParser implements YamlParser {
//private String yaml;
    @Override
    public void parse(String str) throws FileNotFoundException {
        Yaml yaml = new Yaml();
        File f = new File("/home/yanbing/IdeaProjects/ServiceContainer/src/main/resources/config.yaml");
        //读入文件
        Object result = yaml.load(new FileInputStream(f));

        System.out.println(result);
    }

    @Override
    public String getContainerType() {
        return null;
    }
}
