package com.works.configs;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class Resilience4JConfiguration {

    /*
    failureRateThreshold: Hata oranı %50'yi geçtiğinde, CircuitBreaker devreye girer ve arızalı servisle ilgili çağrılar durdurulur.
    waitDurationInOpenState: CircuitBreaker açıldıktan sonra, 1 saniye bekleyerek, sistemin toparlanmasına zaman tanınır.
    slidingWindowSize: Son 2 istek dikkate alınarak, başarısızlık oranı hesaplanır. Bu, daha küçük bir pencere ile hızlı bir yanıt almayı sağlar.
    timeoutDuration: Servis çağrılarının tamamlanması için maksimum 4 saniye beklenir. Bu süre aşılırsa, zaman aşımı (timeout) hatası fırlatılır.
    */

    @Bean
    public Customizer<Resilience4JCircuitBreakerFactory> globalCustomConfiguration() {

        // CircuitBreaker yapılandırması
        CircuitBreakerConfig circuitBreakerConfig = CircuitBreakerConfig.custom()
                .failureRateThreshold(50)  // Hata oranı %50'yi geçtiğinde devre açılır.
                .waitDurationInOpenState(Duration.ofMillis(1000))  // CircuitBreaker "open" (açık) durumunda 1 saniye bekler.
                .slidingWindowSize(2)  // Son 2 isteğin başarısızlık oranı dikkate alınır.
                .build();

        // TimeLimiter yapılandırması
        TimeLimiterConfig timeLimiterConfig = TimeLimiterConfig.custom()
                .timeoutDuration(Duration.ofSeconds(4))  // Servis çağrısının tamamlanması için verilen maksimum süre 4 saniyedir.
                .build();

        // Factory yapılandırması
        return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
                .timeLimiterConfig(timeLimiterConfig)  // TimeLimiter ayarlarını ekler.
                .circuitBreakerConfig(circuitBreakerConfig)  // CircuitBreaker ayarlarını ekler.
                .build());

        // return factory -> factory.configure(builder -> builder.circuitBreakerConfig(circuitBreakerConfig)
        //      .timeLimiterConfig(timeLimiterConfig).build(), "circuitBreaker");
    }
}