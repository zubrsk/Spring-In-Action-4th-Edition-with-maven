package com.zubrsk.springtuto.autoconfig.config;

import com.zubrsk.springtuto.autoconfig.media.CompactDisc;
import com.zubrsk.springtuto.autoconfig.mediaplayer.MediaPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.zubrsk.springtuto.autoconfig.media", "com.zubrsk.springtuto.autoconfig.mediaplayer"})
public class CDPlayerConfig {
}
