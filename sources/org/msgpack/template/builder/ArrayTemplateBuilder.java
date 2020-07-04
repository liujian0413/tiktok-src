package org.msgpack.template.builder;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.msgpack.MessageTypeException;
import org.msgpack.packer.Packer;
import org.msgpack.template.AbstractTemplate;
import org.msgpack.template.BooleanArrayTemplate;
import org.msgpack.template.ByteArrayTemplate;
import org.msgpack.template.DoubleArrayTemplate;
import org.msgpack.template.FieldList;
import org.msgpack.template.FloatArrayTemplate;
import org.msgpack.template.IntegerArrayTemplate;
import org.msgpack.template.LongArrayTemplate;
import org.msgpack.template.ObjectArrayTemplate;
import org.msgpack.template.ShortArrayTemplate;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;
import org.msgpack.unpacker.Unpacker;

public class ArrayTemplateBuilder extends AbstractTemplateBuilder {
    private static final Logger LOG = Logger.getLogger(ArrayTemplateBuilder.class.getName());

    static class ReflectionMultidimentionalArrayTemplate extends AbstractTemplate {
        public Class componentClass;
        private Template componentTemplate;

        public ReflectionMultidimentionalArrayTemplate(Class cls, Template template) {
            this.componentClass = cls;
            this.componentTemplate = template;
        }

        public Object read(Unpacker unpacker, Object obj, boolean z) throws IOException {
            if (!z && unpacker.trySkipNil()) {
                return null;
            }
            int readArrayBegin = unpacker.readArrayBegin();
            Object[] objArr = (Object[]) Array.newInstance(this.componentClass, readArrayBegin);
            for (int i = 0; i < readArrayBegin; i++) {
                objArr[i] = this.componentTemplate.read(unpacker, null, z);
            }
            unpacker.readArrayEnd();
            return objArr;
        }

        public void write(Packer packer, Object obj, boolean z) throws IOException {
            if (obj == null) {
                if (!z) {
                    packer.writeNil();
                    return;
                }
                throw new MessageTypeException("Attempted to write null");
            } else if (!(obj instanceof Object[]) || !this.componentClass.isAssignableFrom(obj.getClass().getComponentType())) {
                throw new MessageTypeException();
            } else {
                packer.writeArrayBegin(r0);
                for (Object write : (Object[]) obj) {
                    this.componentTemplate.write(packer, write, z);
                }
                packer.writeArrayEnd();
            }
        }
    }

    public <T> Template<T> loadTemplate(Type type) {
        return null;
    }

    public ArrayTemplateBuilder(TemplateRegistry templateRegistry) {
        super(templateRegistry);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> org.msgpack.template.Template<T> buildTemplate(java.lang.reflect.Type r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 1
            if (r0 == 0) goto L_0x002b
            r0 = r4
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
        L_0x000c:
            boolean r2 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r2 == 0) goto L_0x0019
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            java.lang.reflect.Type r0 = r0.getGenericComponentType()
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0019:
            boolean r2 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L_0x0027
            r2 = r0
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getRawType()
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x0040
        L_0x0027:
            r2 = r0
            java.lang.Class r2 = (java.lang.Class) r2
            goto L_0x0040
        L_0x002b:
            r0 = r4
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class r0 = r0.getComponentType()
        L_0x0032:
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x003f
            java.lang.Class r0 = r0.getComponentType()
            int r1 = r1 + 1
            goto L_0x0032
        L_0x003f:
            r2 = r0
        L_0x0040:
            org.msgpack.template.Template r4 = r3.toTemplate(r4, r0, r2, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.builder.ArrayTemplateBuilder.buildTemplate(java.lang.reflect.Type):org.msgpack.template.Template");
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) throws TemplateBuildException {
        throw new UnsupportedOperationException(cls.getName());
    }

    /* access modifiers changed from: protected */
    public <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr) {
        throw new UnsupportedOperationException(cls.getName());
    }

    public boolean matchType(Type type, boolean z) {
        Class cls = (Class) type;
        boolean matchAtArrayTemplateBuilder = AbstractTemplateBuilder.matchAtArrayTemplateBuilder(cls, false);
        if (matchAtArrayTemplateBuilder && LOG.isLoggable(Level.FINE)) {
            Logger logger = LOG;
            StringBuilder sb = new StringBuilder("matched type: ");
            sb.append(cls.getName());
            logger.fine(sb.toString());
        }
        return matchAtArrayTemplateBuilder;
    }

    private Template toTemplate(Type type, Type type2, Class cls, int i) {
        if (i == 1) {
            if (cls == Boolean.TYPE) {
                return BooleanArrayTemplate.getInstance();
            }
            if (cls == Short.TYPE) {
                return ShortArrayTemplate.getInstance();
            }
            if (cls == Integer.TYPE) {
                return IntegerArrayTemplate.getInstance();
            }
            if (cls == Long.TYPE) {
                return LongArrayTemplate.getInstance();
            }
            if (cls == Float.TYPE) {
                return FloatArrayTemplate.getInstance();
            }
            if (cls == Double.TYPE) {
                return DoubleArrayTemplate.getInstance();
            }
            if (cls == Byte.TYPE) {
                return ByteArrayTemplate.getInstance();
            }
            return new ObjectArrayTemplate(cls, this.registry.lookup(type2));
        } else if (i == 2) {
            return new ReflectionMultidimentionalArrayTemplate(Array.newInstance(cls, 0).getClass(), toTemplate(type, type2, cls, i - 1));
        } else {
            ReflectionMultidimentionalArrayTemplate reflectionMultidimentionalArrayTemplate = (ReflectionMultidimentionalArrayTemplate) toTemplate(type, type2, cls, i - 1);
            return new ReflectionMultidimentionalArrayTemplate(Array.newInstance(reflectionMultidimentionalArrayTemplate.componentClass, 0).getClass(), reflectionMultidimentionalArrayTemplate);
        }
    }
}
