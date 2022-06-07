package io.github.jas34.scheduledwf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

/**
 * Description:<br>
 * Date: 27/09/21-8:47 am
 * 
 * @since v2.0.0
 * @author Jasbir Singh
 */
@Configuration("PostgresPersistenceConfiguration")
@Import(value = {CoreConfiguration.class, PostgresPersistenceConfiguration.class})
@ComponentScan(basePackages = { "io.github.jas34.scheduledwf" },
        excludeFilters = {@ComponentScan.Filter(value = Controller.class, type = FilterType.ANNOTATION)})
public class ScheduledWfModuleConfiguration {

}
