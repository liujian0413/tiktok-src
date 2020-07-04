package org.msgpack.template.builder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.msgpack.p362a.C7710a;
import org.msgpack.p362a.C7711b;
import org.msgpack.p362a.C7712c;
import org.msgpack.p362a.C7713d;
import org.msgpack.p362a.C7714e;
import org.msgpack.p362a.C7715f;
import org.msgpack.p362a.C7716g;
import org.msgpack.p362a.C7717h;
import org.msgpack.p362a.C7718i;
import org.msgpack.p362a.C7719j;
import org.msgpack.template.FieldList;
import org.msgpack.template.FieldList.Entry;
import org.msgpack.template.FieldOption;
import org.msgpack.template.Template;
import org.msgpack.template.TemplateRegistry;

public abstract class AbstractTemplateBuilder implements TemplateBuilder {
    protected TemplateRegistry registry;

    /* access modifiers changed from: protected */
    public abstract <T> Template<T> buildTemplate(Class<T> cls, FieldEntry[] fieldEntryArr);

    public <T> Template<T> loadTemplate(Type type) {
        return null;
    }

    protected AbstractTemplateBuilder(TemplateRegistry templateRegistry) {
        this.registry = templateRegistry;
    }

    public <T> Template<T> buildTemplate(Type type) throws TemplateBuildException {
        Class cls = (Class) type;
        checkClassValidation(cls);
        return buildTemplate(cls, toFieldEntries(cls, getFieldOption(cls)));
    }

    /* access modifiers changed from: protected */
    public FieldOption getFieldOption(Class<?> cls) {
        C7713d dVar = (C7713d) cls.getAnnotation(C7713d.class);
        if (dVar == null) {
            return FieldOption.DEFAULT;
        }
        if (((C7715f) cls.getAnnotation(C7715f.class)) == null) {
            return FieldOption.DEFAULT;
        }
        return dVar.mo20404a();
    }

    private Field[] getFields(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cls != Object.class) {
            Field[] declaredFields = cls.getDeclaredFields();
            i += declaredFields.length;
            arrayList.add(declaredFields);
            cls = cls.getSuperclass();
        }
        Field[] fieldArr = new Field[i];
        int i2 = 0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Field[] fieldArr2 = (Field[]) arrayList.get(size);
            System.arraycopy(fieldArr2, 0, fieldArr, i2, fieldArr2.length);
            i2 += fieldArr2.length;
        }
        return fieldArr;
    }

    /* access modifiers changed from: protected */
    public void checkClassValidation(Class<?> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            StringBuilder sb = new StringBuilder("Cannot build template for abstract class: ");
            sb.append(cls.getName());
            throw new TemplateBuildException(sb.toString());
        } else if (cls.isInterface()) {
            StringBuilder sb2 = new StringBuilder("Cannot build template for interface: ");
            sb2.append(cls.getName());
            throw new TemplateBuildException(sb2.toString());
        } else if (cls.isArray()) {
            StringBuilder sb3 = new StringBuilder("Cannot build template for array class: ");
            sb3.append(cls.getName());
            throw new TemplateBuildException(sb3.toString());
        } else if (cls.isPrimitive()) {
            StringBuilder sb4 = new StringBuilder("Cannot build template of primitive type: ");
            sb4.append(cls.getName());
            throw new TemplateBuildException(sb4.toString());
        }
    }

    public static boolean matchAtArrayTemplateBuilder(Class<?> cls, boolean z) {
        return cls.isArray();
    }

    public static boolean isAnnotated(Class<?> cls, Class<? extends Annotation> cls2) {
        if (cls.getAnnotation(cls2) != null) {
            return true;
        }
        return false;
    }

    public <T> Template<T> buildTemplate(Class<T> cls, FieldList fieldList) throws TemplateBuildException {
        checkClassValidation(cls);
        return buildTemplate(cls, toFieldEntries(cls, fieldList));
    }

    private int getFieldIndex(Field field, int i) {
        C7712c cVar = (C7712c) field.getAnnotation(C7712c.class);
        if (cVar == null) {
            return i + 1;
        }
        return cVar.mo20403a();
    }

    public static boolean isAnnotated(AccessibleObject accessibleObject, Class<? extends Annotation> cls) {
        if (accessibleObject.getAnnotation(cls) != null) {
            return true;
        }
        return false;
    }

    public static boolean matchAtOrdinalEnumTemplateBuilder(Class<?> cls, boolean z) {
        if (!z) {
            return cls.isEnum();
        }
        if (isAnnotated(cls, C7719j.class) || isAnnotated(cls, C7716g.class)) {
            return true;
        }
        return false;
    }

    public static boolean matchAtBeansClassTemplateBuilder(Type type, boolean z) {
        Class cls = (Class) type;
        if (z) {
            if (isAnnotated(cls, C7710a.class) || isAnnotated(cls, C7714e.class)) {
                return true;
            }
            return false;
        } else if (!cls.isEnum() || !cls.isInterface()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean matchAtClassTemplateBuilder(Class<?> cls, boolean z) {
        if (z) {
            if (isAnnotated(cls, C7713d.class) || isAnnotated(cls, C7715f.class)) {
                return true;
            }
            return false;
        } else if (cls.isEnum() || cls.isInterface()) {
            return false;
        } else {
            return true;
        }
    }

    private FieldOption getFieldOption(Field field, FieldOption fieldOption) {
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) || Modifier.isFinal(modifiers) || Modifier.isTransient(modifiers)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) field, C7711b.class)) {
            return FieldOption.IGNORE;
        }
        if (isAnnotated((AccessibleObject) field, C7718i.class)) {
            return FieldOption.OPTIONAL;
        }
        if (isAnnotated((AccessibleObject) field, C7717h.class)) {
            return FieldOption.NOTNULLABLE;
        }
        if (fieldOption != FieldOption.DEFAULT) {
            return fieldOption;
        }
        if (field.getType().isPrimitive()) {
            return FieldOption.NOTNULLABLE;
        }
        return FieldOption.OPTIONAL;
    }

    private FieldEntry[] toFieldEntries(Class<?> cls, FieldList fieldList) {
        ArrayList<Entry> arrayList = fieldList.list;
        FieldEntry[] fieldEntryArr = new FieldEntry[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Entry entry = (Entry) arrayList.get(i);
            if (entry.isAvailable()) {
                try {
                    fieldEntryArr[i] = new DefaultFieldEntry(cls.getDeclaredField(entry.name), entry.option);
                } catch (SecurityException e) {
                    throw new TemplateBuildException((Throwable) e);
                } catch (NoSuchFieldException e2) {
                    throw new TemplateBuildException((Throwable) e2);
                }
            } else {
                fieldEntryArr[i] = new DefaultFieldEntry();
            }
        }
        return fieldEntryArr;
    }

    /* access modifiers changed from: protected */
    public FieldEntry[] toFieldEntries(Class<?> cls, FieldOption fieldOption) {
        Field[] fields = getFields(cls);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Field field : fields) {
            FieldOption fieldOption2 = getFieldOption(field, fieldOption);
            if (fieldOption2 != FieldOption.IGNORE) {
                int fieldIndex = getFieldIndex(field, i);
                if (arrayList.size() > fieldIndex && arrayList.get(fieldIndex) != null) {
                    StringBuilder sb = new StringBuilder("duplicated index: ");
                    sb.append(fieldIndex);
                    throw new TemplateBuildException(sb.toString());
                } else if (fieldIndex >= 0) {
                    while (arrayList.size() <= fieldIndex) {
                        arrayList.add(null);
                    }
                    arrayList.set(fieldIndex, new DefaultFieldEntry(field, fieldOption2));
                    if (i < fieldIndex) {
                        i = fieldIndex;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("invalid index: ");
                    sb2.append(fieldIndex);
                    throw new TemplateBuildException(sb2.toString());
                }
            }
        }
        FieldEntry[] fieldEntryArr = new FieldEntry[(i + 1)];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            FieldEntry fieldEntry = (FieldEntry) arrayList.get(i2);
            if (fieldEntry == null) {
                fieldEntryArr[i2] = new DefaultFieldEntry();
            } else {
                fieldEntryArr[i2] = fieldEntry;
            }
        }
        return fieldEntryArr;
    }
}
