package cn.fsbay.edu1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages="cn.fsbay.*")
@EnableDiscoveryClient
public class Edu1Application {

  public static void main(String[] args) {
    SpringApplication.run(Edu1Application.class, args);
  }
}
