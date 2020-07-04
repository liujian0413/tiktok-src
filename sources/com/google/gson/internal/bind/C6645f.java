package com.google.gson.internal.bind;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.f */
final class C6645f {
    /* renamed from: a */
    static List m20624a(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, Field field) {
        try {
            return reflectiveTypeAdapterFactory.mo16074a(field);
        } catch (IncompatibleClassChangeError e) {
            C6921a.m21559a((Throwable) e);
            return Collections.singletonList(reflectiveTypeAdapterFactory.f18999a.mo15942a(field));
        }
    }
}
