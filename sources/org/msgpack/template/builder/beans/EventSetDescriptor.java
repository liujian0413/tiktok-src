package org.msgpack.template.builder.beans;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.TooManyListenersException;

public class EventSetDescriptor extends FeatureDescriptor {
    public Method addListenerMethod;
    public Method getListenerMethod;
    public boolean inDefaultEventSet = true;
    private ArrayList<MethodDescriptor> listenerMethodDescriptors;
    private Method[] listenerMethods;
    public Class<?> listenerType;
    public Method removeListenerMethod;
    public boolean unicast;

    private static boolean isUnicastByDefault(Method method) {
        if (method != null) {
            for (Class equals : method.getExceptionTypes()) {
                if (equals.equals(TooManyListenersException.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void merge(EventSetDescriptor eventSetDescriptor) {
        super.merge(eventSetDescriptor);
        if (this.addListenerMethod == null) {
            this.addListenerMethod = eventSetDescriptor.addListenerMethod;
        }
        if (this.getListenerMethod == null) {
            this.getListenerMethod = eventSetDescriptor.getListenerMethod;
        }
        if (this.listenerMethodDescriptors == null) {
            this.listenerMethodDescriptors = eventSetDescriptor.listenerMethodDescriptors;
        }
        if (this.listenerMethods == null) {
            this.listenerMethods = eventSetDescriptor.listenerMethods;
        }
        if (this.listenerType == null) {
            this.listenerType = eventSetDescriptor.listenerType;
        }
        if (this.removeListenerMethod == null) {
            this.removeListenerMethod = eventSetDescriptor.removeListenerMethod;
        }
        this.inDefaultEventSet = eventSetDescriptor.inDefaultEventSet & this.inDefaultEventSet;
    }

    public EventSetDescriptor(String str, Class<?> cls, Method[] methodArr, Method method, Method method2, Method method3) throws IntrospectionException {
        this.name = str;
        this.listenerType = cls;
        this.listenerMethods = methodArr;
        if (methodArr != null) {
            this.listenerMethodDescriptors = new ArrayList<>();
            for (Method methodDescriptor : methodArr) {
                this.listenerMethodDescriptors.add(new MethodDescriptor(methodDescriptor));
            }
        }
        this.addListenerMethod = method;
        this.removeListenerMethod = method2;
        this.getListenerMethod = method3;
        this.unicast = isUnicastByDefault(method);
    }
}
