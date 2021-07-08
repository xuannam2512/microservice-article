//package com.microservice.articles.config;
//
//import org.springframework.boot.autoconfigure.security.SecurityProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//
//@Configuration
//@EnableResourceServer
//@EnableConfigurationProperties(SecurityProperties.class)
//public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
//
////    @Value("${config.jwt.publicKey}")
////    private String publicKey;
//
////    private static final String ROOT_PATTERN = "/**";
//
////    private TokenStore tokenStore;
//
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.csrf()
//                .disable()
//                .authorizeRequests()
//                .anyRequest().permitAll();
//    }
//
////    @Bean
////    public DefaultTokenServices tokenServices(final TokenStore tokenStore) {
////        var tokenServices = new DefaultTokenServices();
////        tokenServices.setTokenStore(tokenStore);
////        return tokenServices;
////    }
////
////    @Bean
////    public TokenStore tokenStore() {
////        if (tokenStore == null) {
////            tokenStore = new JwtTokenStore(jwtAccessTokenConverter());
////        }
////        return tokenStore;
////    }
////
////    @Bean
////    public JwtAccessTokenConverter jwtAccessTokenConverter() {
////        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
////        converter.setVerifierKey(publicKey);
////        return converter;
////    }
//
//}
