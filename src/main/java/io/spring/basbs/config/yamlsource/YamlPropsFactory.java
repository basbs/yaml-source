package io.spring.basbs.config.yamlsource;

import java.io.IOException;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.DefaultPropertySourceFactory;
import org.springframework.core.io.support.EncodedResource;

public class YamlPropsFactory extends DefaultPropertySourceFactory {
    @Override
    public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
        if (resource == null) {
            return super.createPropertySource(name, resource);
        }
        //FIXME: careful with using first index. Might throw Index exception.
        return new YamlPropertySourceLoader().load(resource.getResource().getFilename(),
                resource.getResource()).get(0);
    }
}
