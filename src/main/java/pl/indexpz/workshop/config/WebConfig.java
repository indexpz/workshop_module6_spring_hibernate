package pl.indexpz.workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Configuration
public class WebConfig implements WebMvcConfigurer {


//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(publisherConverter());
//        registry.addConverter(authorConverter());
//    }

//    @Bean
//    public PublisherConverter publisherConverter() {
//        return new PublisherConverter();
//    }
//
//    @Bean
//    public AuthorsConverter authorConverter() {
//        return new AuthorsConverter();
//    }

    @Bean(name = "localeResolver")
    public LocaleContextResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.forLanguageTag("pl"));
        return sessionLocaleResolver;
    }
}
