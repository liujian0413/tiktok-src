package org.msgpack.template.builder;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.p362a.C7711b;
import org.msgpack.p362a.C7712c;
import org.msgpack.p362a.C7717h;
import org.msgpack.p362a.C7718i;
import org.msgpack.packer.Packer;
import org.msgpack.template.FieldOption;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.template.builder.beans.IntrospectionException;
import org.msgpack.template.builder.beans.Introspector;
import org.msgpack.template.builder.beans.PropertyDescriptor;
import org.msgpack.unpacker.Unpacker;

public class ReflectionBeansTemplateBuilder extends ReflectionTemplateBuilder {
    private static Logger LOG = Logger.getLogger(ReflectionBeansTemplateBuilder.class.getName());

    static class ReflectionBeansFieldTemplate extends ReflectionFieldTemplate {
        ReflectionBeansFieldTemplate(FieldEntry fieldEntry) {
            super(fieldEntry);
        }

        public void write(Packer packer, Object obj, boolean z) throws IOException {
            packer.write(obj);
        }

        public Object read(Unpacker unpacker, Object obj, boolean z) throws IOException {
            Object read = unpacker.read(this.entry.getType());
            this.entry.set(obj, read);
            return read;
        }
    }

    public ReflectionBeansTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry, null);
    }

    private int getPropertyIndex(PropertyDescriptor propertyDescriptor) {
        int methodIndex = getMethodIndex(propertyDescriptor.getter);
        if (methodIndex >= 0) {
            return methodIndex;
        }
        return getMethodIndex(propertyDescriptor.setter);
    }

    private int getMethodIndex(Method method) {
        C7712c cVar = (C7712c) method.getAnnotation(C7712c.class);
        if (cVar == null) {
            return -1;
        }
        return cVar.mo20403a();
    }

    private FieldOption getMethodOption(Method method) {
        if (isAnnotated((AccessibleObject) method, C7711b.class)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) method, C7718i.class)) {
            return FieldOption.OPTIONAL;
        }
        if (isAnnotated((AccessibleObject) method, C7717h.class)) {
            return FieldOption.NOTNULLABLE;
        }
        return FieldOption.DEFAULT;
    }

    private boolean isIgnoreProperty(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor == null) {
            return true;
        }
        Method method = propertyDescriptor.getter;
        Method method2 = propertyDescriptor.setter;
        if (method == null || method2 == null || !Modifier.isPublic(method.getModifiers()) || !Modifier.isPublic(method2.getModifiers()) || isAnnotated((AccessibleObject) method, C7711b.class) || isAnnotated((AccessibleObject) method2, C7711b.class)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ReflectionFieldTemplate[] toTemplates(FieldEntry[] fieldEntryArr) {
        ReflectionFieldTemplate[] reflectionFieldTemplateArr = new ReflectionFieldTemplate[fieldEntryArr.length];
        for (int i = 0; i < fieldEntryArr.length; i++) {
            FieldEntry fieldEntry = fieldEntryArr[i];
            if (fieldEntry.getType().isPrimitive()) {
                reflectionFieldTemplateArr[i] = new ReflectionBeansFieldTemplate(fieldEntry);
            } else {
                reflectionFieldTemplateArr[i] = new FieldTemplateImpl(fieldEntry, this.registry.lookup(fieldEntry.getGenericType()));
            }
        }
        return reflectionFieldTemplateArr;
    }

    private FieldOption getPropertyOption(BeansFieldEntry beansFieldEntry, FieldOption fieldOption) {
        FieldOption methodOption = getMethodOption(beansFieldEntry.desc.getter);
        if (methodOption != FieldOption.DEFAULT) {
            return methodOption;
        }
        FieldOption methodOption2 = getMethodOption(beansFieldEntry.desc.setter);
        if (methodOption2 != FieldOption.DEFAULT) {
            return methodOption2;
        }
        return fieldOption;
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        boolean matchAtBeansClassTemplateBuilder = matchAtBeansClassTemplateBuilder(cls, z);
        if (matchAtBeansClassTemplateBuilder && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder sb = new StringBuilder("matched type: ");
            sb.append(cls.getName());
            logger.fine(sb.toString());
        }
        return matchAtBeansClassTemplateBuilder;
    }

    public FieldEntry[] toFieldEntries(Class<?> cls, FieldOption fieldOption) {
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
            ArrayList arrayList = new ArrayList();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                if (!isIgnoreProperty(propertyDescriptor)) {
                    arrayList.add(propertyDescriptor);
                }
            }
            PropertyDescriptor[] propertyDescriptorArr = new PropertyDescriptor[arrayList.size()];
            arrayList.toArray(propertyDescriptorArr);
            BeansFieldEntry[] beansFieldEntryArr = new BeansFieldEntry[propertyDescriptorArr.length];
            for (PropertyDescriptor propertyDescriptor2 : propertyDescriptorArr) {
                int propertyIndex = getPropertyIndex(propertyDescriptor2);
                if (propertyIndex >= 0) {
                    if (beansFieldEntryArr[propertyIndex] != null) {
                        StringBuilder sb = new StringBuilder("duplicated index: ");
                        sb.append(propertyIndex);
                        throw new TemplateBuildException(sb.toString());
                    } else if (propertyIndex < beansFieldEntryArr.length) {
                        beansFieldEntryArr[propertyIndex] = new BeansFieldEntry(propertyDescriptor2);
                        propertyDescriptorArr[propertyIndex] = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder("invalid index: ");
                        sb2.append(propertyIndex);
                        throw new TemplateBuildException(sb2.toString());
                    }
                }
            }
            int i = 0;
            for (PropertyDescriptor propertyDescriptor3 : propertyDescriptorArr) {
                if (propertyDescriptor3 != null) {
                    while (beansFieldEntryArr[i] != null) {
                        i++;
                    }
                    beansFieldEntryArr[i] = new BeansFieldEntry(propertyDescriptor3);
                }
            }
            for (BeansFieldEntry beansFieldEntry : beansFieldEntryArr) {
                beansFieldEntry.option = getPropertyOption(beansFieldEntry, fieldOption);
            }
            return beansFieldEntryArr;
        } catch (IntrospectionException unused) {
            StringBuilder sb3 = new StringBuilder("Class must be java beans class:");
            sb3.append(cls.getName());
            throw new TemplateBuildException(sb3.toString());
        }
    }
}
