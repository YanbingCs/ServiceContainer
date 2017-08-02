package com.anyuncloud.service.container;

import java.io.FileNotFoundException;

public interface YamlParser {
    void parse(String str) throws FileNotFoundException;
    String getContainerType();
}
