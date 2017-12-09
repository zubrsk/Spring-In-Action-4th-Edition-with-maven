package com.zubrsk.springtuto.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zubrsk.springtuto.demo.media", "com.zubrsk.springtuto.demo.mediaplayer"})
public class CDPlayerConfig {
}
