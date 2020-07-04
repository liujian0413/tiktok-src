package org.msgpack.template.builder.beans;

import com.taobao.android.dexposed.ClassUtils;

public class BeanDescriptor extends FeatureDescriptor {
    public Class<?> beanClass;
    public Class<?> customizerClass;

    public BeanDescriptor(Class<?> cls) {
        this(cls, null);
    }

    private String getShortClassName(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR);
        if (lastIndexOf == -1) {
            return name;
        }
        return name.substring(lastIndexOf + 1);
    }

    public BeanDescriptor(Class<?> cls, Class<?> cls2) {
        if (cls != null) {
            this.name = getShortClassName(cls);
            this.beanClass = cls;
            this.customizerClass = cls2;
            return;
        }
        throw new NullPointerException();
    }
}
