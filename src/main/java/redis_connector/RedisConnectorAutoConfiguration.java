package redis_connector;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(RedisConnector.class)
public class RedisConnectorAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public RedisConnector connect() {
        return new RedisConnectorImpl();
    }
}