package com.anyuncloud.service.container.impl;

import com.anyuncloud.service.container.ConfigurationBuilder;
import com.anyuncloud.service.container.ContainerConfiguration;
import com.anyuncloud.service.container.YamlParser;
import com.anyuncloud.service.container.service.ContainerConfigurationService;

import java.io.InputStream;

public class DefaultContainerConfigurationService implements ContainerConfigurationService
{
    private YamlParser yamlParser;

    public DefaultContainerConfigurationService(YamlParser yamlParser) {
        this.yamlParser = yamlParser;
    }

    @Override
    public ContainerConfiguration buildConfiguration(String configuration) throws Exception {
        ConfigurationBuilder configurationBuilder = null;
        yamlParser.parse(configuration);
        if(yamlParser.getContainerType().equals("docker"))
            configurationBuilder = new DefaultDockerConfigurationBuilder();
        else if(yamlParser.getContainerType().equals("lxd"))
            configurationBuilder = new DefaultLxdConfigurationBuilder();
        return configurationBuilder.build();
    }

    @Override
    public ContainerConfiguration buildConfiguration(InputStream inputStream) throws Exception {
        String yamlString = "result";
        return buildConfiguration(yamlString);
    }
}
