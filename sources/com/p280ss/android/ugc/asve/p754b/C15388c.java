package com.p280ss.android.ugc.asve.p754b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.android.C48074c;
import kotlinx.coroutines.android.C48075d;

/* renamed from: com.ss.android.ugc.asve.b.c */
public final class C15388c {

    /* renamed from: a */
    private static C48074c f39682a;

    /* renamed from: a */
    public static final C48074c m44889a() {
        return f39682a;
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
        f39682a = C48075d.m149052a(m44888a(mainLooper, true), "fast-main");
    }

    /* renamed from: a */
    private static Handler m44888a(Looper looper, boolean z) {
        C7573i.m23587b(looper, "$this$asHandler");
        if (VERSION.SDK_INT < 16) {
            return new Handler(looper);
        }
        if (VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke(null, new Object[]{looper});
            if (invoke != null) {
                return (Handler) invoke;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Handler");
        }
        try {
            Constructor declaredConstructor = Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Callback.class, Boolean.TYPE});
            C7573i.m23582a((Object) declaredConstructor, "Handler::class.java.getD…:class.javaPrimitiveType)");
            Object newInstance = declaredConstructor.newInstance(new Object[]{looper, null, Boolean.valueOf(true)});
            C7573i.m23582a(newInstance, "constructor.newInstance(this, null, true)");
            return (Handler) newInstance;
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
