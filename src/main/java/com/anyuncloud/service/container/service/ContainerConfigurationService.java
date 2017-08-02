package com.anyuncloud.service.container.service;

import com.anyuncloud.service.container.ContainerConfiguration;

import java.io.InputStream;

public interface ContainerConfigurationService {
    ContainerConfiguration buildConfiguration(String configuration) throws Exception;
    ContainerConfiguration buildConfiguration(InputStream inputStream) throws Exception;
}
