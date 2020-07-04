package org.msgpack.template.builder;

import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.template.OrdinalEnumTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public class OrdinalEnumTemplateBuilder extends AbstractTemplateBuilder {
    private static final Logger LOG = Logger.getLogger(OrdinalEnumTemplateBuilder.class.getName());

    public OrdinalEnumTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry);
    }

    public <T> Template<T> buildTemplate(Type type) throws TemplateBuildException {
        Class cls = (Class) type;
        checkOrdinalEnumValidation(cls);
        return new OrdinalEnumTemplate(cls);
    }

    /* access modifiers changed from: protected */
    public void checkOrdinalEnumValidation(Class<?> cls) {
        if (!cls.isEnum()) {
            StringBuilder sb = new StringBuilder("tried to build ordinal enum template of non-enum class: ");
            sb.append(cls.getName());
            throw new TemplateBuildException(sb.toString());
        }
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        StringBuilder sb = new StringBuilder("fatal error: ");
        sb.append(cls.getName());
        throw new UnsupportedOperationException(sb.toString());
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        boolean matchAtOrdinalEnumTemplateBuilder = matchAtOrdinalEnumTemplateBuilder(cls, z);
        if (matchAtOrdinalEnumTemplateBuilder && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder sb = new StringBuilder("matched type: ");
            sb.append(cls.getName());
            logger.fine(sb.toString());
        }
        return matchAtOrdinalEnumTemplateBuilder;
    }
}
