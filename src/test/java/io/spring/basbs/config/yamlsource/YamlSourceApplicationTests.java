package io.spring.basbs.config.yamlsource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(value = YamlReader.class)
class YamlSourceApplicationTests {
	@Autowired
    YamlReader yamlReader;

	@Test
	void testReferenceTypes() {
		assertEquals("Hello Yaml!", yamlReader.refPojo.getString());
	}

	@Test
	void testPrimitiveTypes() {
		assertEquals(true, yamlReader.primitivePojo.isCondition());
	}

	@Test
	void testCollectionTypes() {
		assertEquals(Set.of(1,2,3,4), yamlReader.colPojo.getSet());
	}

}
