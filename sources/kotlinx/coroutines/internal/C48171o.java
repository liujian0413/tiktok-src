package kotlinx.coroutines.internal;

import kotlin.C7581n;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48066am;
import kotlinx.coroutines.C48081at;
import kotlinx.coroutines.C48116bs;
import kotlinx.coroutines.C48187j;

/* renamed from: kotlinx.coroutines.internal.o */
final class C48171o extends C48116bs implements C48066am {

    /* renamed from: b */
    private final Throwable f123031b;

    /* renamed from: c */
    private final String f123032c;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m149450a() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f123031b
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.<init>(r1)
            java.lang.String r1 = r4.f123032c
            if (r1 == 0) goto L_0x001f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ". "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0021
        L_0x001f:
            java.lang.String r1 = ""
        L_0x0021:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f123031b
            r1.<init>(r0, r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C48171o.m149450a():java.lang.Void");
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Main[missing");
        if (this.f123031b != null) {
            StringBuilder sb2 = new StringBuilder(", cause=");
            sb2.append(this.f123031b);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo83490a(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        m149450a();
        throw null;
    }

    public C48171o(Throwable th, String str) {
        this.f123031b = th;
        this.f123032c = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Void mo120274a(long j, C48187j<? super C7581n> jVar) {
        C7573i.m23587b(jVar, "continuation");
        m149450a();
        throw null;
    }

    /* renamed from: a */
    public final C48081at mo120266a(long j, Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        m149450a();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        m149450a();
        throw null;
    }

    public /* synthetic */ C48171o(Throwable th, String str, int i, C7571f fVar) {
        this(th, null);
    }
}
