package com.xilidou;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.huaban.analysis.jieba.JiebaSegmenter;
import com.xilidou.entity.ApiResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebConfig {

	@Bean
	public JiebaSegmenter jiebaSegmenter(){
		return new JiebaSegmenter();
	}

    @Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
    }

    @Bean
	public Cache<String,ApiResponse> cache(){
		return CacheBuilder.newBuilder().maximumSize(10000).build();
	}

}
