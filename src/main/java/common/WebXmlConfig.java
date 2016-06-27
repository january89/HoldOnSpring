package common;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

public class WebXmlConfig implements WebApplicationInitializer{

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
    private static final String ENCODE = "UTF-8";
    private static final String FORWARD_SLASH = "/";
    private static final String ASTERISK = "/*";

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(ApplicationContext.class);

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(rootContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping(FORWARD_SLASH);

        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);

        FilterRegistration.Dynamic characterEncoding = servletContext.addFilter("characterEncoding", EncodingFilter());
        characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, ASTERISK);

        servletContext.addListener(new ContextLoaderListener(rootContext));

    }

    CharacterEncodingFilter EncodingFilter(){
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding(ENCODE);
        characterEncodingFilter.setForceEncoding(true);
        return characterEncodingFilter;
    }

}
