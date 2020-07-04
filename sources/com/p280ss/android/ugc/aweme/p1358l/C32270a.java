package com.p280ss.android.ugc.aweme.p1358l;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48222y;
import kotlinx.coroutines.android.C48074c;
import kotlinx.coroutines.android.C48075d;

/* renamed from: com.ss.android.ugc.aweme.l.a */
public final class C32270a {

    /* renamed from: a */
    private static C48074c f84335a;

    /* renamed from: b */
    private static C48222y f84336b = new C32271a();

    /* renamed from: com.ss.android.ugc.aweme.l.a$a */
    public static final class C32271a extends C48222y {
        C32271a() {
        }

        /* renamed from: a */
        public final boolean mo83490a(C47924e eVar) {
            C7573i.m23587b(eVar, "context");
            return false;
        }

        /* renamed from: a */
        public final void mo83489a(C47924e eVar, Runnable runnable) {
            C7573i.m23587b(eVar, "context");
            C7573i.m23587b(runnable, "block");
            runnable.run();
        }
    }

    /* renamed from: a */
    public static final C48074c m104791a() {
        return f84335a;
    }

    static {
        Looper mainLooper = Looper.getMainLooper();
        C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
        f84335a = C48075d.m149052a(m104790a(mainLooper, true), "fast-main");
    }

    /* renamed from: a */
    private static Handler m104790a(Looper looper, boolean z) {
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
