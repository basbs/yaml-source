package io.spring.basbs.config.yamlsource;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.Data;

@Data
public class PojoWithCollections {

    private List<?> list;
    private Set<?> set;
    private Map<?, ?> map;
}
