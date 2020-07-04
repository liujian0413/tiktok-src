package kotlinx.coroutines;

import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;

public interface CoroutineExceptionHandler extends C47927b {

    /* renamed from: b */
    public static final C48047a f122896b = C48047a.f122897a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C48047a implements C47929c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C48047a f122897a = new C48047a();

        private C48047a() {
        }
    }

    void handleException(C47924e eVar, Throwable th);
}
