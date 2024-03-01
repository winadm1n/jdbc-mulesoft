package org.springframework.sbm;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.http.dsl.Http;

@Configuration
public class FlowConfigurations {
    @Bean
    IntegrationFlow dbcp2Flow(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
        return IntegrationFlows.from(Http.inboundGateway("/getdetails")).handle((p, h) -> p)
// TODO: substitute expression language with appropriate java code 
// TODO: The datatype might not be LinkedMultiValueMap please substitute the right type for payload
                .<LinkedMultiValueMap<String, String>>handle((p, h) ->
                        jdbcTemplate.queryForList(
                                ""))
                .get();
    }

    @Bean
    IntegrationFlow dbcp2Flow(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
        return IntegrationFlows.from(Http.inboundGateway("/getdetails")).handle((p, h) -> p)
// TODO: substitute expression language with appropriate java code 
// TODO: The datatype might not be LinkedMultiValueMap please substitute the right type for payload
                .<LinkedMultiValueMap<String, String>>handle((p, h) ->
                        jdbcTemplate.queryForList(
                                ""))
                .get();
    }
}