package com.bytedance.scene.utlity;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.C0904k;
import com.bytedance.scene.C12629j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public final class SceneInstanceUtility {

    /* renamed from: a */
    private static final C0904k<String, Class<?>> f33679a = new C0904k<>();

    public static class InstantiationException extends RuntimeException {
        InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: a */
    public static boolean m36888a(C12629j jVar) {
        Class cls = jVar.getClass();
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return false;
        }
        int modifiers = cls.getModifiers();
        if (!Modifier.isPublic(modifiers)) {
            return false;
        }
        if (cls.isMemberClass() && !Modifier.isStatic(modifiers)) {
            return false;
        }
        for (Constructor parameterTypes : cls.getConstructors()) {
            if (parameterTypes.getParameterTypes().length > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C12629j m36887a(Class<?> cls, Bundle bundle) {
        try {
            C12629j jVar = (C12629j) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(jVar.getClass().getClassLoader());
                jVar.f33529g = bundle;
            }
            return jVar;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate scene ");
            sb.append(cls);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new InstantiationException(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate scene ");
            sb2.append(cls);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new InstantiationException(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate scene ");
            sb3.append(cls);
            sb3.append(": could not find Scene constructor");
            throw new InstantiationException(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate scene ");
            sb4.append(cls);
            sb4.append(": calling Scene constructor caused an exception");
            throw new InstantiationException(sb4.toString(), e4);
        }
    }

    /* renamed from: a */
    public static C12629j m36886a(Context context, String str, Bundle bundle) {
        Class cls = (Class) f33679a.get(str);
        if (cls == null) {
            try {
                cls = context.getClassLoader().loadClass(str);
                f33679a.put(str, cls);
            } catch (ClassNotFoundException e) {
                StringBuilder sb = new StringBuilder("Unable to instantiate scene ");
                sb.append(str);
                sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
                throw new InstantiationException(sb.toString(), e);
            }
        }
        return m36887a(cls, bundle);
    }
}
