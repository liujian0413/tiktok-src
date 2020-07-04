package org.json.simple.parser;

import java.util.List;
import java.util.Map;

public interface ContainerFactory {
    List creatArrayContainer();

    Map createObjectContainer();
}
