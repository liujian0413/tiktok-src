package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;

public class MethodDescriptor extends FeatureDescriptor {
    public Method method;
    public ParameterDescriptor[] parameterDescriptors;

    public MethodDescriptor(Method method2) {
        if (method2 != null) {
            this.method = method2;
            this.name = method2.getName();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: 0000 */
    public void merge(MethodDescriptor methodDescriptor) {
        super.merge(methodDescriptor);
        if (this.method == null) {
            this.method = methodDescriptor.method;
        }
        if (this.parameterDescriptors == null) {
            this.parameterDescriptors = methodDescriptor.parameterDescriptors;
        }
    }
}
