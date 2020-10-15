package com.mushanwb.github.XmlConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

// 该从哪个文件中加载 bean
@Configuration
@ImportResource({"classpath*:applicationContext.xml"})
public class XmlConfiguration {

}
