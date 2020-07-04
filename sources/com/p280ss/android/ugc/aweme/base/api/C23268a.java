package com.p280ss.android.ugc.aweme.base.api;

import android.support.p022v4.util.ArrayMap;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.base.api.a */
public abstract class C23268a {
    private static final Object sLock = new Object();
    private static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new ArrayMap());

    public <T> T checkValid() throws Throwable {
        Class cls = getClass();
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                initRequiredFieldMap(cls);
            }
        }
        List list = (List) sRequiredMap.get(cls);
        int size = list.size();
        int i = 0;
        while (i < size) {
            try {
                Field field = (Field) list.get(i);
                if (field.get(this) != null) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected null value in ");
                    sb.append(cls.getName());
                    sb.append(", required field: ");
                    sb.append(field.getName());
                    throw new JsonSyntaxException(sb.toString());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    public static RuntimeException getCompatibleException(ExecutionException executionException) throws Exception {
        Throwable cause = executionException.getCause();
        if (cause instanceof ApiServerException) {
            return (ApiServerException) cause;
        }
        if (cause instanceof JsonParseException) {
            return new JSONParseException(cause);
        }
        throw ((Exception) cause);
    }

    private void initRequiredFieldMap(Class<?> cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.getAnnotation(C6891b.class) != null) {
                field.setAccessible(true);
                arrayList.add(field);
            }
        }
        sRequiredMap.put(cls, Collections.unmodifiableList(arrayList));
    }
}
