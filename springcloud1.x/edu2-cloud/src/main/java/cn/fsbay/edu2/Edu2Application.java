package cn.fsbay.edu2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages="cn.fsbay.*")
@EnableDiscoveryClient
public class Edu2Application {

  public static void main(String[] args) {
    SpringApplication.run(Edu2Application.class, args);
  }
}
