package com.jhon.config;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <p>功能描述</br> TODO</p>
 *
 * @author jiangy19
 * @version v1.0
 * @FileName EsConfig
 * @date 2017/10/4 9:01
 */
@Configuration
public class EsConfig {

	@Bean
	public TransportClient client() throws UnknownHostException {

		InetSocketTransportAddress node = new InetSocketTransportAddress(
				InetAddress.getByName("localhost"),
				9300
		);

		Settings settings = Settings.builder()
				.put("cluster.name","JhonRain")
				.build();

		TransportClient client = new PreBuiltTransportClient(settings);
		client.addTransportAddress(node);
		return client;
	}
}
