package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.kalachev.jenkins.controllers.ComponentScanInterface;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = {
    ComponentScanInterface.class }, excludeFilters = {
        @Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class AppConfig {

  @Autowired
  Environment env;

}
