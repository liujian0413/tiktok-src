package org.msgpack.template.builder;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.Unpacker;

public class ReflectionTemplateBuilder extends AbstractTemplateBuilder {
    private static Logger LOG = Logger.getLogger(ReflectionBeansTemplateBuilder.class.getName());

    static final class FieldTemplateImpl extends ReflectionFieldTemplate {
        private Template template;

        public FieldTemplateImpl(FieldEntry fieldEntry, Template template2) {
            super(fieldEntry);
            this.template = template2;
        }

        public final void write(Packer packer, Object obj, boolean z) throws IOException {
            this.template.write(packer, obj, z);
        }

        public final Object read(Unpacker unpacker, Object obj, boolean z) throws IOException {
            Object obj2 = this.entry.get(obj);
            Object read = this.template.read(unpacker, obj2, z);
            if (read != obj2) {
                this.entry.set(obj, read);
            }
            return read;
        }
    }

    protected static class ReflectionClassTemplate<T> extends AbstractTemplate<T> {
        protected Class<T> targetClass;
        protected ReflectionFieldTemplate[] templates;

        protected ReflectionClassTemplate(Class<T> cls, ReflectionFieldTemplate[] reflectionFieldTemplateArr) {
            this.targetClass = cls;
            this.templates = reflectionFieldTemplateArr;
        }

        public T read(Unpacker unpacker, T t, boolean z) throws IOException {
            if (!z && unpacker.trySkipNil()) {
                return null;
            }
            if (t == null) {
                try {
                    t = this.targetClass.newInstance();
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new MessageTypeException((Throwable) e2);
                }
            }
            unpacker.readArrayBegin();
            for (ReflectionFieldTemplate reflectionFieldTemplate : this.templates) {
                if (!reflectionFieldTemplate.entry.isAvailable()) {
                    unpacker.skip();
                } else if (!reflectionFieldTemplate.entry.isOptional() || !unpacker.trySkipNil()) {
                    reflectionFieldTemplate.read(unpacker, t, false);
                }
            }
            unpacker.readArrayEnd();
            return t;
        }

        public void write(Packer packer, T t, boolean z) throws IOException {
            ReflectionFieldTemplate[] reflectionFieldTemplateArr;
            if (t != null) {
                try {
                    packer.writeArrayBegin(this.templates.length);
                    for (ReflectionFieldTemplate reflectionFieldTemplate : this.templates) {
                        if (!reflectionFieldTemplate.entry.isAvailable()) {
                            packer.writeNil();
                        } else {
                            Object obj = reflectionFieldTemplate.entry.get(t);
                            if (obj != null) {
                                reflectionFieldTemplate.write(packer, obj, true);
                            } else if (!reflectionFieldTemplate.entry.isNotNullable()) {
                                packer.writeNil();
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append(reflectionFieldTemplate.entry.getName());
                                sb.append(" cannot be null by @NotNullable");
                                throw new MessageTypeException(sb.toString());
                            }
                        }
                    }
                    packer.writeArrayEnd();
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new MessageTypeException((Throwable) e2);
                }
            } else if (!z) {
                packer.writeNil();
            } else {
                throw new MessageTypeException("attempted to write null");
            }
        }
    }

    protected static abstract class ReflectionFieldTemplate extends AbstractTemplate<Object> {
        protected FieldEntry entry;

        ReflectionFieldTemplate(FieldEntry fieldEntry) {
            this.entry = fieldEntry;
        }
    }

    /* access modifiers changed from: protected */
    public ReflectionFieldTemplate[] toTemplates(FieldEntry[] fieldEntryArr) {
        int length = fieldEntryArr.length;
        for (int i = 0; i < length; i++) {
            Field field = fieldEntryArr[i].field;
            if (!Modifier.isPublic(field.getModifiers())) {
                field.setAccessible(true);
            }
        }
        ReflectionFieldTemplate[] reflectionFieldTemplateArr = new ReflectionFieldTemplate[fieldEntryArr.length];
        for (int i2 = 0; i2 < fieldEntryArr.length; i2++) {
            FieldEntry fieldEntry = fieldEntryArr[i2];
            reflectionFieldTemplateArr[i2] = new FieldTemplateImpl(fieldEntry, this.registry.lookup(fieldEntry.getGenericType()));
        }
        return reflectionFieldTemplateArr;
    }

    public ReflectionTemplateBuilder(TemplateRegistry templateRegistry, ClassLoader classLoader) {
        super(templateRegistry);
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        if (fieldEntryArr != null) {
            return new ReflectionClassTemplate(cls, toTemplates(fieldEntryArr));
        }
        StringBuilder sb = new StringBuilder("entries is null: ");
        sb.append(cls);
        throw new NullPointerException(sb.toString());
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        boolean matchAtClassTemplateBuilder = matchAtClassTemplateBuilder(cls, z);
        if (matchAtClassTemplateBuilder && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder sb = new StringBuilder("matched type: ");
            sb.append(cls.getName());
            logger.fine(sb.toString());
        }
        return matchAtClassTemplateBuilder;
    }
}
