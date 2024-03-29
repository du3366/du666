package cn.bdqn.dmuserconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmUserConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmUserConsumerApplication.class, args);
	}

}
