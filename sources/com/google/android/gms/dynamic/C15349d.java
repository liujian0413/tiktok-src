package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.C15345b.C15346a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.d */
public final class C15349d<T> extends C15346a {

    /* renamed from: a */
    private final T f39630a;

    private C15349d(T t) {
        this.f39630a = t;
    }

    /* renamed from: a */
    public static <T> C15345b m44668a(T t) {
        return new C15349d(t);
    }

    /* renamed from: a */
    public static <T> T m44669a(C15345b bVar) {
        if (bVar instanceof C15349d) {
            return ((C15349d) bVar).f39630a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
