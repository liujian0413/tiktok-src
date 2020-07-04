package kotlinx.coroutines.android;

import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Method;
import kotlin.coroutines.C47918a;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class AndroidExceptionPreHandler extends C47918a implements CoroutineExceptionHandler {
    public AndroidExceptionPreHandler() {
        super(CoroutineExceptionHandler.f122896b);
    }

    public final void handleException(C47924e eVar, Throwable th) {
        Object obj;
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(th, "exception");
        Method method = C48069a.f122916a;
        if (method != null) {
            obj = method.invoke(null, new Object[0]);
        } else {
            obj = null;
        }
        if (!(obj instanceof UncaughtExceptionHandler)) {
            obj = null;
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = (UncaughtExceptionHandler) obj;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
