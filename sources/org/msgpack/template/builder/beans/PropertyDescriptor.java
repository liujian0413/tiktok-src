package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.harmony.beans.BeansUtils;
import org.apache.harmony.beans.internal.nls.Messages;

public class PropertyDescriptor extends FeatureDescriptor {
    public boolean bound;
    public boolean constrained;
    public Method getter;
    public Class<?> propertyEditorClass;
    public Method setter;

    public Class<?> getPropertyType() {
        if (this.getter != null) {
            return this.getter.getReturnType();
        }
        if (this.setter != null) {
            return this.setter.getParameterTypes()[0];
        }
        return null;
    }

    public int hashCode() {
        return BeansUtils.getHashCode((Object) this.getter) + BeansUtils.getHashCode((Object) this.setter) + BeansUtils.getHashCode((Object) getPropertyType()) + BeansUtils.getHashCode((Object) this.propertyEditorClass) + BeansUtils.getHashCode(this.bound) + BeansUtils.getHashCode(this.constrained);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = obj instanceof PropertyDescriptor;
        if (!z7) {
            return z7;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) obj;
        if (!(this.getter == null && propertyDescriptor.getter == null) && (this.getter == null || !this.getter.equals(propertyDescriptor.getter))) {
            z = false;
        } else {
            z = true;
        }
        if (!(this.setter == null && propertyDescriptor.setter == null) && (this.setter == null || !this.setter.equals(propertyDescriptor.setter))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (getPropertyType() == propertyDescriptor.getPropertyType()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.propertyEditorClass == propertyDescriptor.propertyEditorClass) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.bound == propertyDescriptor.bound) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.constrained == propertyDescriptor.constrained) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z || !z2 || !z3 || !z4 || !z5 || !z6) {
            return false;
        }
        return true;
    }

    public void setReadMethod(Method method) throws IntrospectionException {
        if (method != null) {
            if (!Modifier.isPublic(method.getModifiers())) {
                throw new IntrospectionException(Messages.getString("custom.beans.0A"));
            } else if (method.getParameterTypes().length == 0) {
                Class returnType = method.getReturnType();
                if (!returnType.equals(Void.TYPE)) {
                    Class propertyType = getPropertyType();
                    if (propertyType != null && !returnType.equals(propertyType)) {
                        throw new IntrospectionException(Messages.getString("custom.beans.09"));
                    }
                } else {
                    throw new IntrospectionException(Messages.getString("custom.beans.33"));
                }
            } else {
                throw new IntrospectionException(Messages.getString("custom.beans.08"));
            }
        }
        this.getter = method;
    }

    public void setWriteMethod(Method method) throws IntrospectionException {
        if (method != null) {
            if (Modifier.isPublic(method.getModifiers())) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Class cls = parameterTypes[0];
                    Class propertyType = getPropertyType();
                    if (propertyType != null && !propertyType.equals(cls)) {
                        throw new IntrospectionException(Messages.getString("custom.beans.07"));
                    }
                } else {
                    throw new IntrospectionException(Messages.getString("custom.beans.06"));
                }
            } else {
                throw new IntrospectionException(Messages.getString("custom.beans.05"));
            }
        }
        this.setter = method;
    }

    public PropertyDescriptor(String str, Method method, Method method2) throws IntrospectionException {
        if (str == null || str.length() == 0) {
            throw new IntrospectionException(Messages.getString("custom.beans.04"));
        }
        this.name = str;
        setReadMethod(method);
        setWriteMethod(method2);
    }
}
