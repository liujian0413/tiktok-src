package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import org.apache.harmony.beans.BeansUtils;
import org.apache.harmony.beans.internal.nls.Messages;

public class IndexedPropertyDescriptor extends PropertyDescriptor {
    public Method indexedGetter;
    public Class<?> indexedPropertyType;
    public Method indexedSetter;

    public int hashCode() {
        return super.hashCode() + BeansUtils.getHashCode((Object) this.indexedPropertyType) + BeansUtils.getHashCode((Object) this.indexedGetter) + BeansUtils.getHashCode((Object) this.indexedSetter);
    }

    private boolean isCompatible() {
        Class propertyType = getPropertyType();
        if (propertyType == null) {
            return true;
        }
        Class componentType = propertyType.getComponentType();
        if (componentType == null || this.indexedPropertyType == null) {
            return false;
        }
        return componentType.getName().equals(this.indexedPropertyType.getName());
    }

    public void setIndexedReadMethod(Method method) throws IntrospectionException {
        internalSetIndexedReadMethod(method);
    }

    public void setIndexedWriteMethod(Method method) throws IntrospectionException {
        internalSetIndexedWriteMethod(method, false);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IndexedPropertyDescriptor)) {
            return false;
        }
        IndexedPropertyDescriptor indexedPropertyDescriptor = (IndexedPropertyDescriptor) obj;
        if (!super.equals(indexedPropertyDescriptor) || (this.indexedPropertyType != null ? !this.indexedPropertyType.equals(indexedPropertyDescriptor.indexedPropertyType) : indexedPropertyDescriptor.indexedPropertyType != null) || (this.indexedGetter != null ? !this.indexedGetter.equals(indexedPropertyDescriptor.indexedGetter) : indexedPropertyDescriptor.indexedGetter != null) || (this.indexedSetter != null ? !this.indexedSetter.equals(indexedPropertyDescriptor.indexedSetter) : indexedPropertyDescriptor.indexedSetter != null)) {
            return false;
        }
        return true;
    }

    private void internalSetIndexedReadMethod(Method method) throws IntrospectionException {
        if (method == null) {
            if (this.indexedSetter == null) {
                if (getPropertyType() == null) {
                    this.indexedPropertyType = null;
                } else {
                    throw new IntrospectionException(Messages.getString("custom.beans.5A"));
                }
            }
            this.indexedGetter = null;
        } else if (method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Integer.TYPE) {
            Class<?> returnType = method.getReturnType();
            if (returnType == Void.TYPE) {
                throw new IntrospectionException(Messages.getString("custom.beans.5B"));
            } else if (this.indexedSetter == null || method.getReturnType() == this.indexedSetter.getParameterTypes()[1]) {
                if (this.indexedGetter == null) {
                    this.indexedPropertyType = returnType;
                } else if (this.indexedPropertyType != returnType) {
                    throw new IntrospectionException(Messages.getString("custom.beans.5A"));
                }
                this.indexedGetter = method;
            } else {
                throw new IntrospectionException(Messages.getString("custom.beans.5A"));
            }
        } else {
            throw new IntrospectionException(Messages.getString("custom.beans.5B"));
        }
    }

    private void internalSetIndexedWriteMethod(Method method, boolean z) throws IntrospectionException {
        if (method == null) {
            if (this.indexedGetter == null) {
                if (getPropertyType() == null) {
                    this.indexedPropertyType = null;
                } else {
                    throw new IntrospectionException(Messages.getString("custom.beans.5E"));
                }
            }
            this.indexedSetter = null;
            return;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length != 2) {
            throw new IntrospectionException(Messages.getString("custom.beans.5F"));
        } else if (parameterTypes[0] == Integer.TYPE) {
            Class<?> cls = parameterTypes[1];
            if (z && this.indexedGetter == null) {
                this.indexedPropertyType = cls;
            } else if (this.indexedPropertyType != cls) {
                throw new IntrospectionException(Messages.getString("custom.beans.61"));
            }
            this.indexedSetter = method;
        } else {
            throw new IntrospectionException(Messages.getString("custom.beans.60"));
        }
    }

    public IndexedPropertyDescriptor(String str, Method method, Method method2, Method method3, Method method4) throws IntrospectionException {
        super(str, method, method2);
        if (method3 != null) {
            internalSetIndexedReadMethod(method3);
            internalSetIndexedWriteMethod(method4, true);
        } else {
            internalSetIndexedWriteMethod(method4, true);
            internalSetIndexedReadMethod(method3);
        }
        if (!isCompatible()) {
            throw new IntrospectionException(Messages.getString("custom.beans.57"));
        }
    }
}
