package com.kakao.util.helper;

import java.lang.reflect.Method;

public final class MethodInvoker {
    private static Method findMethod(String str, Method[] methodArr) {
        for (Method method : methodArr) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }

    public static void invoke(Object obj, String str, Object... objArr) throws Exception {
        if (obj != null) {
            for (Class cls = obj.getClass(); !cls.equals(Object.class); cls = cls.getSuperclass()) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                if (declaredMethods != null) {
                    Method findMethod = findMethod(str, declaredMethods);
                    if (findMethod != null) {
                        findMethod.invoke(obj, objArr);
                        return;
                    }
                }
            }
            return;
        }
        throw new RuntimeException("methodOwnerClass is null.");
    }
}
