package com.zubrsk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zubrsk.media","com.zubrsk.mediaplayer"})
public class CDPlayerConfig {
}
