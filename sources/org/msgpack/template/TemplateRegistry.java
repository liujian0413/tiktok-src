package org.msgpack.template;

import com.C1642a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.msgpack.C48351b;
import org.msgpack.MessageTypeException;
import org.msgpack.template.builder.TemplateBuilder;
import org.msgpack.template.builder.TemplateBuilderChain;
import org.msgpack.type.Value;

public class TemplateRegistry {
    Map<Type, Template<Type>> cache;
    private TemplateBuilderChain chain;
    private Map<Type, GenericTemplate> genericCache;
    private TemplateRegistry parent;

    /* access modifiers changed from: protected */
    public TemplateBuilderChain createTemplateBuilderChain() {
        return new TemplateBuilderChain(this);
    }

    private TemplateRegistry() {
        this.chain = createTemplateBuilderChain();
        this.genericCache = new HashMap();
        this.cache = new HashMap();
        registerTemplates();
        this.cache = Collections.unmodifiableMap(this.cache);
    }

    /* access modifiers changed from: protected */
    public void registerTemplatesWhichRefersRegistry() {
        AnyTemplate anyTemplate = new AnyTemplate(this);
        register(List.class, new ListTemplate(anyTemplate));
        register(Set.class, new SetTemplate(anyTemplate));
        register(Collection.class, new CollectionTemplate(anyTemplate));
        register(Map.class, new MapTemplate(anyTemplate, anyTemplate));
        registerGeneric(List.class, new GenericCollectionTemplate(this, ListTemplate.class));
        registerGeneric(Set.class, new GenericCollectionTemplate(this, SetTemplate.class));
        registerGeneric(Collection.class, new GenericCollectionTemplate(this, CollectionTemplate.class));
        registerGeneric(Map.class, new GenericMapTemplate(this, MapTemplate.class));
    }

    private void registerTemplates() {
        register(Boolean.TYPE, BooleanTemplate.getInstance());
        register(Boolean.class, BooleanTemplate.getInstance());
        register(Byte.TYPE, ByteTemplate.getInstance());
        register(Byte.class, ByteTemplate.getInstance());
        register(Short.TYPE, ShortTemplate.getInstance());
        register(Short.class, ShortTemplate.getInstance());
        register(Integer.TYPE, IntegerTemplate.getInstance());
        register(Integer.class, IntegerTemplate.getInstance());
        register(Long.TYPE, LongTemplate.getInstance());
        register(Long.class, LongTemplate.getInstance());
        register(Float.TYPE, FloatTemplate.getInstance());
        register(Float.class, FloatTemplate.getInstance());
        register(Double.TYPE, DoubleTemplate.getInstance());
        register(Double.class, DoubleTemplate.getInstance());
        register(BigInteger.class, BigIntegerTemplate.getInstance());
        register(Character.TYPE, CharacterTemplate.getInstance());
        register(Character.class, CharacterTemplate.getInstance());
        register(boolean[].class, BooleanArrayTemplate.getInstance());
        register(short[].class, ShortArrayTemplate.getInstance());
        register(int[].class, IntegerArrayTemplate.getInstance());
        register(long[].class, LongArrayTemplate.getInstance());
        register(float[].class, FloatArrayTemplate.getInstance());
        register(double[].class, DoubleArrayTemplate.getInstance());
        register(String.class, StringTemplate.getInstance());
        register(byte[].class, ByteArrayTemplate.getInstance());
        register(ByteBuffer.class, ByteBufferTemplate.getInstance());
        register(Value.class, ValueTemplate.getInstance());
        register(BigDecimal.class, BigDecimalTemplate.getInstance());
        register(Date.class, DateTemplate.getInstance());
        registerTemplatesWhichRefersRegistry();
    }

    private static String toJvmReferenceTypeName(String str) {
        return str.substring(6);
    }

    private Template lookupGenericTypeImpl(ParameterizedType parameterizedType) {
        return lookupGenericTypeImpl0(parameterizedType, parameterizedType.getRawType());
    }

    private <T> Template<T> lookupAfterBuilding(Class<T> cls) {
        TemplateBuilder select = this.chain.select(cls, true);
        Template<T> template = null;
        if (select != null) {
            Template<T> loadTemplate = this.chain.forceBuilder.loadTemplate(cls);
            if (loadTemplate != null) {
                register(cls, loadTemplate);
                return loadTemplate;
            }
            template = buildAndRegister(select, cls, true, null);
        }
        return template;
    }

    private Template<Type> lookupCache(Type type) {
        Template<Type> template;
        Template<Type> template2 = (Template) this.cache.get(type);
        if (template2 != null) {
            return template2;
        }
        try {
            template = this.parent.lookupCache(type);
        } catch (NullPointerException unused) {
            template = template2;
        }
        return template;
    }

    private Template<Type> lookupGenericArrayType(Type type) {
        if (!(type instanceof GenericArrayType)) {
            return null;
        }
        GenericArrayType genericArrayType = (GenericArrayType) type;
        Template<Type> lookupGenericArrayTypeImpl = lookupGenericArrayTypeImpl(genericArrayType);
        if (lookupGenericArrayTypeImpl != null) {
            return lookupGenericArrayTypeImpl;
        }
        try {
            Template<Type> lookupGenericArrayTypeImpl2 = this.parent.lookupGenericArrayTypeImpl(genericArrayType);
            if (lookupGenericArrayTypeImpl2 != null) {
                return lookupGenericArrayTypeImpl2;
            }
            return null;
        } catch (NullPointerException unused) {
        }
    }

    private <T> Template<T> lookupGenericInterfaceTypes(ParameterizedType parameterizedType) {
        Template<T> template = null;
        try {
            Class[] interfaces = ((Class) parameterizedType.getRawType()).getInterfaces();
            int length = interfaces.length;
            int i = 0;
            while (i < length) {
                Template<T> lookupGenericTypeImpl0 = lookupGenericTypeImpl0(parameterizedType, interfaces[i]);
                if (lookupGenericTypeImpl0 != null) {
                    return lookupGenericTypeImpl0;
                }
                i++;
                template = lookupGenericTypeImpl0;
            }
        } catch (ClassCastException unused) {
        }
        return template;
    }

    private Template<Type> lookupGenericType(ParameterizedType parameterizedType) {
        Template<Type> lookupGenericTypeImpl = lookupGenericTypeImpl(parameterizedType);
        if (lookupGenericTypeImpl != null) {
            return lookupGenericTypeImpl;
        }
        try {
            Template<Type> lookupGenericTypeImpl2 = this.parent.lookupGenericTypeImpl(parameterizedType);
            if (lookupGenericTypeImpl2 != null) {
                return lookupGenericTypeImpl2;
            }
        } catch (NullPointerException unused) {
        }
        Template<Type> lookupGenericInterfaceTypes = lookupGenericInterfaceTypes(parameterizedType);
        if (lookupGenericInterfaceTypes != null) {
            return lookupGenericInterfaceTypes;
        }
        Template<Type> lookupGenericSuperclasses = lookupGenericSuperclasses(parameterizedType);
        if (lookupGenericSuperclasses != null) {
            return lookupGenericSuperclasses;
        }
        return null;
    }

    private <T> Template<T> lookupGenericSuperclasses(ParameterizedType parameterizedType) {
        Template<T> template = null;
        try {
            Class<Object> superclass = ((Class) parameterizedType.getRawType()).getSuperclass();
            if (superclass == null) {
                return null;
            }
            while (superclass != Object.class) {
                Template<T> lookupGenericTypeImpl0 = lookupGenericTypeImpl0(parameterizedType, superclass);
                if (lookupGenericTypeImpl0 != null) {
                    try {
                        register(parameterizedType, lookupGenericTypeImpl0);
                        return lookupGenericTypeImpl0;
                    } catch (ClassCastException unused) {
                        template = lookupGenericTypeImpl0;
                    }
                } else {
                    superclass = superclass.getSuperclass();
                    template = lookupGenericTypeImpl0;
                }
            }
            return template;
        } catch (ClassCastException unused2) {
        }
    }

    private <T> Template<T> lookupInterfaceTypes(Class<T> cls) {
        Class[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        Template<T> template = null;
        int i = 0;
        while (i < length) {
            Class cls2 = interfaces[i];
            Template<T> template2 = (Template) this.cache.get(cls2);
            if (template2 != null) {
                register(cls, template2);
                return template2;
            }
            try {
                template = this.parent.lookupCache(cls2);
                if (template != null) {
                    try {
                        register(cls, template);
                        return template;
                    } catch (NullPointerException unused) {
                        continue;
                    }
                } else {
                    continue;
                    i++;
                }
            } catch (NullPointerException unused2) {
                template = template2;
            }
        }
        return template;
    }

    private <T> Template<T> lookupSuperclassInterfaceTypes(Class<T> cls) {
        Class<Object> superclass = cls.getSuperclass();
        Template<T> template = null;
        if (superclass != null) {
            while (superclass != Object.class) {
                template = lookupInterfaceTypes(superclass);
                if (template != null) {
                    register(cls, template);
                    return template;
                }
                try {
                    Template<T> lookupCache = this.parent.lookupCache(superclass);
                    if (lookupCache != null) {
                        try {
                            register(cls, lookupCache);
                            return lookupCache;
                        } catch (NullPointerException unused) {
                        }
                    }
                    template = lookupCache;
                } catch (NullPointerException unused2) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return template;
    }

    private <T> Template<T> lookupSuperclasses(Class<T> cls) {
        Class<Object> superclass = cls.getSuperclass();
        Template<T> template = null;
        if (superclass != null) {
            while (superclass != Object.class) {
                template = (Template) this.cache.get(superclass);
                if (template != null) {
                    register(cls, template);
                    return template;
                }
                try {
                    Template<T> lookupCache = this.parent.lookupCache(superclass);
                    if (lookupCache != null) {
                        try {
                            register(cls, lookupCache);
                            return lookupCache;
                        } catch (NullPointerException unused) {
                        }
                    }
                    template = lookupCache;
                } catch (NullPointerException unused2) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return template;
    }

    public TemplateRegistry(TemplateRegistry templateRegistry) {
        if (templateRegistry != null) {
            this.parent = templateRegistry;
        } else {
            this.parent = new TemplateRegistry();
        }
        this.chain = createTemplateBuilderChain();
        this.cache = new HashMap();
        this.genericCache = new HashMap();
        registerTemplatesWhichRefersRegistry();
    }

    private static boolean isPrimitiveType(String str) {
        if (str.equals("byte") || str.equals("short") || str.equals("int") || str.equals("long") || str.equals("float") || str.equals("double") || str.equals("boolean") || str.equals("char")) {
            return true;
        }
        return false;
    }

    private static String toJvmPrimitiveTypeName(String str) {
        if (str.equals("byte")) {
            return "B";
        }
        if (str.equals("short")) {
            return "S";
        }
        if (str.equals("int")) {
            return "I";
        }
        if (str.equals("long")) {
            return "J";
        }
        if (str.equals("float")) {
            return "F";
        }
        if (str.equals("double")) {
            return "D";
        }
        if (str.equals("boolean")) {
            return "Z";
        }
        if (str.equals("char")) {
            return "C";
        }
        throw new MessageTypeException(C1642a.m8034a("fatal error: type=%s", new Object[]{str}));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|(1:5)|36|(1:7)(1:8)|9|10|11|(2:13|(2:15|16))|17|18|(2:20|(2:22|23))|24|25|(2:27|28)|29|31) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0072 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0087 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c A[Catch:{ ClassNotFoundException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d A[Catch:{ ClassNotFoundException -> 0x0092 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.msgpack.template.Template lookupGenericArrayTypeImpl(java.lang.reflect.GenericArrayType r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "\\["
            java.lang.String[] r1 = r0.split(r1)
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            if (r1 <= 0) goto L_0x00b2
            if (r1 > r2) goto L_0x00a2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.reflect.Type r8 = r8.getGenericComponentType()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            boolean r0 = isPrimitiveType(r8)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            r5 = 0
        L_0x0034:
            if (r5 >= r1) goto L_0x003e
            r6 = 91
            r4.append(r6)
            int r5 = r5 + 1
            goto L_0x0034
        L_0x003e:
            if (r0 != 0) goto L_0x0052
            r0 = 76
            r4.append(r0)
            java.lang.String r8 = toJvmReferenceTypeName(r8)
            r4.append(r8)
            r8 = 59
            r4.append(r8)
            goto L_0x0059
        L_0x0052:
            java.lang.String r8 = toJvmPrimitiveTypeName(r8)
            r4.append(r8)
        L_0x0059:
            java.lang.String r8 = r4.toString()
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ ClassNotFoundException -> 0x0072 }
            java.lang.ClassLoader r0 = r0.getContextClassLoader()     // Catch:{ ClassNotFoundException -> 0x0072 }
            if (r0 == 0) goto L_0x0072
            java.lang.Class r0 = r0.loadClass(r8)     // Catch:{ ClassNotFoundException -> 0x0072 }
            if (r0 == 0) goto L_0x0072
            org.msgpack.template.Template r0 = r7.lookupAfterBuilding(r0)     // Catch:{ ClassNotFoundException -> 0x0072 }
            return r0
        L_0x0072:
            java.lang.Class r0 = r7.getClass()     // Catch:{ ClassNotFoundException -> 0x0087 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0087 }
            if (r0 == 0) goto L_0x0087
            java.lang.Class r0 = r0.loadClass(r8)     // Catch:{ ClassNotFoundException -> 0x0087 }
            if (r0 == 0) goto L_0x0087
            org.msgpack.template.Template r0 = r7.lookupAfterBuilding(r0)     // Catch:{ ClassNotFoundException -> 0x0087 }
            return r0
        L_0x0087:
            java.lang.Class r0 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r0 == 0) goto L_0x0092
            org.msgpack.template.Template r0 = r7.lookupAfterBuilding(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            return r0
        L_0x0092:
            org.msgpack.MessageTypeException r0 = new org.msgpack.MessageTypeException
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r8
            java.lang.String r8 = "cannot find template of %s"
            java.lang.String r8 = com.C1642a.m8034a(r8, r1)
            r0.<init>(r8)
            throw r0
        L_0x00a2:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "Not implemented template generation of %s"
            java.lang.String r0 = com.C1642a.m8034a(r0, r1)
            r8.<init>(r0)
            throw r8
        L_0x00b2:
            org.msgpack.MessageTypeException r8 = new org.msgpack.MessageTypeException
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "fatal error: type="
            java.lang.String r0 = com.C1642a.m8034a(r0, r1)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.lookupGenericArrayTypeImpl(java.lang.reflect.GenericArrayType):org.msgpack.template.Template");
    }

    public synchronized Template lookup(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Template lookupGenericType = lookupGenericType(parameterizedType);
            if (lookupGenericType != null) {
                return lookupGenericType;
            }
            type = parameterizedType.getRawType();
        }
        Template lookupGenericArrayType = lookupGenericArrayType(type);
        if (lookupGenericArrayType != null) {
            return lookupGenericArrayType;
        }
        Template lookupCache = lookupCache(type);
        if (lookupCache != null) {
            return lookupCache;
        }
        if (!(type instanceof WildcardType)) {
            if (!(type instanceof TypeVariable)) {
                Class cls = (Class) type;
                if (C48351b.class.isAssignableFrom(cls)) {
                    MessagePackableTemplate messagePackableTemplate = new MessagePackableTemplate(cls);
                    register(cls, messagePackableTemplate);
                    return messagePackableTemplate;
                } else if (cls.isInterface()) {
                    AnyTemplate anyTemplate = new AnyTemplate(this);
                    register(type, anyTemplate);
                    return anyTemplate;
                } else {
                    Template lookupAfterBuilding = lookupAfterBuilding(cls);
                    if (lookupAfterBuilding != null) {
                        return lookupAfterBuilding;
                    }
                    Template lookupInterfaceTypes = lookupInterfaceTypes(cls);
                    if (lookupInterfaceTypes != null) {
                        return lookupInterfaceTypes;
                    }
                    Template lookupSuperclasses = lookupSuperclasses(cls);
                    if (lookupSuperclasses != null) {
                        return lookupSuperclasses;
                    }
                    Template lookupSuperclassInterfaceTypes = lookupSuperclassInterfaceTypes(cls);
                    if (lookupSuperclassInterfaceTypes != null) {
                        return lookupSuperclassInterfaceTypes;
                    }
                    StringBuilder sb = new StringBuilder("Cannot find template for ");
                    sb.append(cls);
                    sb.append(" class.  Try to add @Message annotation to the class or call MessagePack.register(Type).");
                    throw new MessageTypeException(sb.toString());
                }
            }
        }
        AnyTemplate anyTemplate2 = new AnyTemplate(this);
        register(type, anyTemplate2);
        return anyTemplate2;
    }

    public synchronized void registerGeneric(Type type, GenericTemplate genericTemplate) {
        if (type instanceof ParameterizedType) {
            this.genericCache.put(((ParameterizedType) type).getRawType(), genericTemplate);
        } else {
            this.genericCache.put(type, genericTemplate);
        }
    }

    private Template lookupGenericTypeImpl0(ParameterizedType parameterizedType, Type type) {
        GenericTemplate genericTemplate = (GenericTemplate) this.genericCache.get(type);
        if (genericTemplate == null) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Template[] templateArr = new Template[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            templateArr[i] = lookup(actualTypeArguments[i]);
        }
        return genericTemplate.build(templateArr);
    }

    public synchronized void register(Type type, Template template) {
        if (template == null) {
            throw new NullPointerException("Template object is null");
        } else if (type instanceof ParameterizedType) {
            this.cache.put(((ParameterizedType) type).getRawType(), template);
        } else {
            this.cache.put(type, template);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046 A[SYNTHETIC, Splitter:B:28:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f A[Catch:{ all -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0058 A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005b A[Catch:{ all -> 0x003f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0063 A[SYNTHETIC, Splitter:B:41:0x0063] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized org.msgpack.template.Template buildAndRegister(org.msgpack.template.builder.TemplateBuilder r5, java.lang.Class r6, boolean r7, org.msgpack.template.FieldList r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r1 = r4.cache     // Catch:{ Exception -> 0x0041 }
            boolean r1 = r1.containsKey(r6)     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x0013
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r1 = r4.cache     // Catch:{ Exception -> 0x0041 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x0041 }
            org.msgpack.template.Template r1 = (org.msgpack.template.Template) r1     // Catch:{ Exception -> 0x0041 }
            goto L_0x0014
        L_0x0013:
            r1 = r0
        L_0x0014:
            org.msgpack.template.TemplateReference r2 = new org.msgpack.template.TemplateReference     // Catch:{ Exception -> 0x003c }
            r2.<init>(r4, r6)     // Catch:{ Exception -> 0x003c }
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r3 = r4.cache     // Catch:{ Exception -> 0x003a }
            r3.put(r6, r2)     // Catch:{ Exception -> 0x003a }
            if (r5 != 0) goto L_0x0026
            org.msgpack.template.builder.TemplateBuilderChain r5 = r4.chain     // Catch:{ Exception -> 0x003a }
            org.msgpack.template.builder.TemplateBuilder r5 = r5.select(r6, r7)     // Catch:{ Exception -> 0x003a }
        L_0x0026:
            if (r8 == 0) goto L_0x002d
            org.msgpack.template.Template r5 = r5.buildTemplate(r6, r8)     // Catch:{ Exception -> 0x003a }
            goto L_0x0031
        L_0x002d:
            org.msgpack.template.Template r5 = r5.buildTemplate(r6)     // Catch:{ Exception -> 0x003a }
        L_0x0031:
            if (r5 == 0) goto L_0x0038
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r7 = r4.cache     // Catch:{ all -> 0x0069 }
            r7.put(r6, r5)     // Catch:{ all -> 0x0069 }
        L_0x0038:
            monitor-exit(r4)
            return r5
        L_0x003a:
            r5 = move-exception
            goto L_0x0044
        L_0x003c:
            r5 = move-exception
            r2 = r0
            goto L_0x0044
        L_0x003f:
            r5 = move-exception
            goto L_0x0061
        L_0x0041:
            r5 = move-exception
            r1 = r0
            r2 = r1
        L_0x0044:
            if (r1 == 0) goto L_0x004f
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r7 = r4.cache     // Catch:{ all -> 0x004c }
            r7.put(r6, r1)     // Catch:{ all -> 0x004c }
            goto L_0x0054
        L_0x004c:
            r5 = move-exception
            r0 = r2
            goto L_0x0061
        L_0x004f:
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r7 = r4.cache     // Catch:{ all -> 0x004c }
            r7.remove(r6)     // Catch:{ all -> 0x004c }
        L_0x0054:
            boolean r7 = r5 instanceof org.msgpack.MessageTypeException     // Catch:{ all -> 0x003f }
            if (r7 == 0) goto L_0x005b
            org.msgpack.MessageTypeException r5 = (org.msgpack.MessageTypeException) r5     // Catch:{ all -> 0x003f }
            throw r5     // Catch:{ all -> 0x003f }
        L_0x005b:
            org.msgpack.MessageTypeException r7 = new org.msgpack.MessageTypeException     // Catch:{ all -> 0x003f }
            r7.<init>(r5)     // Catch:{ all -> 0x003f }
            throw r7     // Catch:{ all -> 0x003f }
        L_0x0061:
            if (r0 == 0) goto L_0x006b
            java.util.Map<java.lang.reflect.Type, org.msgpack.template.Template<java.lang.reflect.Type>> r7 = r4.cache     // Catch:{ all -> 0x0069 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0069 }
            goto L_0x006b
        L_0x0069:
            r5 = move-exception
            goto L_0x006c
        L_0x006b:
            throw r5     // Catch:{ all -> 0x0069 }
        L_0x006c:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.msgpack.template.TemplateRegistry.buildAndRegister(org.msgpack.template.builder.TemplateBuilder, java.lang.Class, boolean, org.msgpack.template.FieldList):org.msgpack.template.Template");
    }
}
