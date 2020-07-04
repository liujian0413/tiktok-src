package com.google.gson.internal.p278a;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.a.c */
final class C6622c extends C6621b {

    /* renamed from: a */
    private static Class f18979a;

    /* renamed from: b */
    private final Object f18980b = m20532b();

    /* renamed from: c */
    private final Field f18981c = m20534c();

    C6622c() {
    }

    /* renamed from: c */
    private static Field m20534c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Object m20532b() {
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            f18979a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo16058a(AccessibleObject accessibleObject) {
        if (!m20533b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(sb.toString(), e);
            }
        }
    }

    /* renamed from: b */
    private boolean m20533b(AccessibleObject accessibleObject) {
        if (!(this.f18980b == null || this.f18981c == null)) {
            try {
                long longValue = ((Long) f18979a.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f18980b, new Object[]{this.f18981c})).longValue();
                f18979a.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f18980b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
