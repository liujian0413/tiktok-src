package com.facebook.react.bridge;

import com.C1642a;
import com.facebook.react.bridge.NativeModule.NativeMethod;
import com.facebook.systrace.Systrace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaModuleWrapper {
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeMethod> mMethods = new ArrayList<>();
    private final Class<? extends NativeModule> mModuleClass;
    private final ModuleHolder mModuleHolder;

    public class MethodDescriptor {
        Method method;
        String name;
        String signature;
        String type;

        public MethodDescriptor() {
        }
    }

    public JSInstance getJSInstance() {
        return this.mJSInstance;
    }

    public String getName() {
        return this.mModuleHolder.getName();
    }

    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    public NativeMap getConstants() {
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        Systrace.m42324a(0, "module.getConstants");
        Map constants = module.getConstants();
        Systrace.m42323a(0);
        Systrace.m42324a(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap(constants);
            return makeNativeMap;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END);
            Systrace.m42323a(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END);
        }
    }

    private void findMethods() {
        Method[] declaredMethods;
        Systrace.m42324a(0, "findMethods");
        HashSet hashSet = new HashSet();
        Class<? extends NativeModule> cls = this.mModuleClass;
        Class<? extends NativeModule> superclass = this.mModuleClass.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    methodDescriptor.type = javaMethodWrapper.getType();
                    if (methodDescriptor.type == "sync") {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    StringBuilder sb = new StringBuilder("Java Module ");
                    sb.append(getName());
                    sb.append(" method name already registered: ");
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (IDynamicJavaMethodsFactory.class.isAssignableFrom(cls)) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("getDynamicMethods", new Class[0]);
                Field declaredField = cls.getDeclaredField("DYNAMIC_METHODS");
                if (declaredField != null) {
                    Object obj = declaredField.get(null);
                    if (obj instanceof List) {
                        for (String str : (List) obj) {
                            MethodDescriptor methodDescriptor2 = new MethodDescriptor();
                            DynamicMethodWrapper dynamicMethodWrapper = new DynamicMethodWrapper(this, str);
                            methodDescriptor2.type = dynamicMethodWrapper.getType();
                            methodDescriptor2.name = str;
                            methodDescriptor2.method = declaredMethod;
                            this.mMethods.add(dynamicMethodWrapper);
                            this.mDescs.add(methodDescriptor2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        Systrace.m42323a(0);
    }

    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        C1642a.m8034a("start invoke %d", new Object[]{Integer.valueOf(i)});
        String str = "methods:";
        Iterator it = this.mDescs.iterator();
        while (it.hasNext()) {
            MethodDescriptor methodDescriptor = (MethodDescriptor) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(methodDescriptor.method);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(":");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(methodDescriptor.name);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append(";");
            str = sb7.toString();
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(str);
        sb8.append(this.mModuleClass.getName());
        if (this.mMethods != null && i < this.mMethods.size()) {
            try {
                ((NativeMethod) this.mMethods.get(i)).invoke(this.mJSInstance, readableNativeArray);
            } catch (Exception e) {
                throw e;
            }
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, Class<? extends NativeModule> cls, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
        this.mModuleClass = cls;
    }
}
