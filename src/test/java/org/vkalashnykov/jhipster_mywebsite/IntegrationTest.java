package org.vkalashnykov.jhipster_mywebsite;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.vkalashnykov.jhipster_mywebsite.JMyWebsiteJHipsterApp;
import org.vkalashnykov.jhipster_mywebsite.config.AsyncSyncConfiguration;
import org.vkalashnykov.jhipster_mywebsite.config.EmbeddedSQL;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { JMyWebsiteJHipsterApp.class, AsyncSyncConfiguration.class })
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
