package kotlinx.coroutines.android;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48066am;
import kotlinx.coroutines.C48066am.C48067a;
import kotlinx.coroutines.C48081at;
import kotlinx.coroutines.C48116bs;

/* renamed from: kotlinx.coroutines.android.c */
public abstract class C48074c extends C48116bs implements C48066am {
    private C48074c() {
    }

    public /* synthetic */ C48074c(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    public C48081at mo120266a(long j, Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        return C48067a.m149041a(this, j, runnable);
    }
}
