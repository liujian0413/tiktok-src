package kotlinx.coroutines.android;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.lang.reflect.Constructor;
import kotlin.C47965i;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.android.d */
public final class C48075d {

    /* renamed from: a */
    public static final C48074c f122927a;

    static {
        Object obj;
        try {
            Looper mainLooper = Looper.getMainLooper();
            C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
            obj = Result.m150902constructorimpl(new C48070b(m149051a(mainLooper, true), "Main"));
        } catch (Throwable th) {
            obj = Result.m150902constructorimpl(C47965i.m148906a(th));
        }
        if (Result.m150908isFailureimpl(obj)) {
            obj = null;
        }
        f122927a = (C48074c) obj;
    }

    /* renamed from: a */
    public static final C48074c m149052a(Handler handler, String str) {
        C7573i.m23587b(handler, "receiver$0");
        return new C48070b(handler, str);
    }

    /* renamed from: a */
    public static final Handler m149051a(Looper looper, boolean z) {
        C7573i.m23587b(looper, "receiver$0");
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
