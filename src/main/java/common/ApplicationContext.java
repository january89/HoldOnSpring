package common;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = {
        "main.service"
})
@Import({ WebMvcConfig.class, PersistenceContext.class })
@PropertySource("classpath:application.properties")
public class ApplicationContext{

//    private static final String MESSAGE_SOURCE_BASE_NAME = "i18n/messages";
//
//    @Bean
//    public MessageSource messageSource() {
//        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//        messageSource.setBasename(MESSAGE_SOURCE_BASE_NAME);
//        messageSource.setUseCodeAsDefaultMessage(true);
//        return messageSource;
//    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
