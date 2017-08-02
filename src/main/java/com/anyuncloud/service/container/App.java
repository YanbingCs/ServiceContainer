package com.anyuncloud.service.container;

import com.anyuncloud.service.container.impl.DefaultYamlParser;

public class App {
    public static void main(String[] args) throws Exception {
        String yaml = "config";
        YamlParser yamlParser = new DefaultYamlParser();
        // ContainerConfigurationService configurationService = new DefaultContainerConfigurationService(yamlParser);
        //ContainerService containerService = new DefaultContainerService();
        // ContainerCreateEntiry entiry = containerService.createContainer(configurationService.buildConfiguration(yaml));
        //System.out.println(entiry.getId());//
    }
}