package io.spring.basbs.config.yamlsource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("root")
@PropertySource(value = "classpath:test-config.yml", factory = YamlPropsFactory.class)
public class YamlReader {
   PojoWithPrimitiveTypes primitivePojo;
   PojoWithReferenceTypes refPojo;
   PojoWithCollections colPojo;
}
