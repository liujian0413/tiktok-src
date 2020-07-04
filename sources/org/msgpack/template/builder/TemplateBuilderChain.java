package org.msgpack.template.builder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.util.android.C48362a;

public class TemplateBuilderChain {
    public TemplateBuilder forceBuilder;
    protected List<TemplateBuilder> templateBuilders;

    private static boolean enableDynamicCodeGeneration() {
        if (!C48362a.m150018a()) {
            return true;
        }
        return false;
    }

    public TemplateBuilderChain(TemplateRegistry templateRegistry) {
        this(templateRegistry, null);
    }

    public TemplateBuilderChain(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        this.templateBuilders = new ArrayList();
        reset(templateRegistry, classLoader);
    }

    public TemplateBuilder select(Type type, boolean z) {
        for (TemplateBuilder templateBuilder : this.templateBuilders) {
            if (templateBuilder.matchType(type, z)) {
                return templateBuilder;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void reset(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        String str;
        if (templateRegistry != null) {
            if (enableDynamicCodeGeneration()) {
                str = "org.msgpack.template.builder.JavassistTemplateBuilder";
            } else {
                str = "org.msgpack.template.builder.ReflectionTemplateBuilder";
            }
            this.forceBuilder = createForceTemplateBuilder(str, templateRegistry, classLoader);
            TemplateBuilder templateBuilder = this.forceBuilder;
            this.templateBuilders.add(new ArrayTemplateBuilder(templateRegistry));
            this.templateBuilders.add(new OrdinalEnumTemplateBuilder(templateRegistry));
            this.templateBuilders.add(templateBuilder);
            this.templateBuilders.add(new ReflectionBeansTemplateBuilder(templateRegistry));
            return;
        }
        throw new NullPointerException("registry is null");
    }

    private static TemplateBuilder createForceTemplateBuilder(String str, TemplateRegistry templateRegistry, ClassLoader classLoader) {
        try {
            return (TemplateBuilder) Class.forName(str).getConstructor(new Class[]{TemplateRegistry.class, ClassLoader.class}).newInstance(new Object[]{templateRegistry, classLoader});
        } catch (Exception unused) {
            return new ReflectionTemplateBuilder(templateRegistry, classLoader);
        }
    }
}
