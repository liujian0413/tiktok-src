package org.msgpack.template.builder;

import java.lang.reflect.Type;
import org.msgpack.template.FieldList;
import org.msgpack.template.Template;

public interface TemplateBuilder {
    <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) throws TemplateBuildException;

    <T> Template<T> buildTemplate(Type type) throws TemplateBuildException;

    <T> Template<T> loadTemplate(Type type);

    boolean matchType(Type type, boolean z);
}
