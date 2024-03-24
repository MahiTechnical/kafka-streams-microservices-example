package com.techprimers.domainservice;

import com.techprimers.domaincrawler.Domain;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class DomainKafkaConsumer {

  public int count =0 ;

  @Bean
  public Consumer<KStream<String, Domain>> domainService() {
    return kstream -> kstream.foreach((key, domain) -> {
      System.out.println(count++ + String.format(" : Domain consumed: [%s] ,isActive: [%s]", domain.getDomain(),
              !domain.isDead()));
    });
  }
}
