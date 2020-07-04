package kotlinx.coroutines.scheduling;

import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48060ah;
import kotlinx.coroutines.C48092ba;
import kotlinx.coroutines.C48222y;

/* renamed from: kotlinx.coroutines.scheduling.c */
public class C48203c extends C48092ba {

    /* renamed from: b */
    private CoroutineScheduler f123088b;

    /* renamed from: c */
    private final int f123089c;

    /* renamed from: d */
    private final int f123090d;

    /* renamed from: e */
    private final long f123091e;

    /* renamed from: f */
    private final String f123092f;

    public void close() {
        this.f123088b.close();
    }

    /* renamed from: a */
    private final CoroutineScheduler m149575a() {
        CoroutineScheduler coroutineScheduler = new CoroutineScheduler(this.f123089c, this.f123090d, this.f123091e, this.f123092f);
        return coroutineScheduler;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[scheduler = ");
        sb.append(this.f123088b);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final C48222y mo120434a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C48205e(this, i, TaskMode.PROBABLY_BLOCKING);
        }
        StringBuilder sb = new StringBuilder("Expected positive parallelism level, but have ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        try {
            this.f123088b.mo120416a(runnable, (C48209i) C48207g.f123099a, false);
        } catch (RejectedExecutionException unused) {
            C48060ah.f122908b.mo83489a(eVar, runnable);
        }
    }

    private C48203c(int i, int i2, String str) {
        C7573i.m23587b(str, "schedulerName");
        this(i, i2, C48211k.f123109f, str);
    }

    /* renamed from: a */
    public final void mo120435a(Runnable runnable, C48209i iVar, boolean z) {
        C7573i.m23587b(runnable, "block");
        C7573i.m23587b(iVar, "context");
        try {
            this.f123088b.mo120416a(runnable, iVar, z);
        } catch (RejectedExecutionException unused) {
            C48060ah.f122908b.mo120306a((Runnable) CoroutineScheduler.m149541a(runnable, iVar));
        }
    }

    private C48203c(int i, int i2, long j, String str) {
        C7573i.m23587b(str, "schedulerName");
        this.f123089c = i;
        this.f123090d = i2;
        this.f123091e = j;
        this.f123092f = str;
        this.f123088b = m149575a();
    }

    public /* synthetic */ C48203c(int i, int i2, String str, int i3, C7571f fVar) {
        this(C48211k.f123107d, C48211k.f123108e, "DefaultDispatcher");
    }
}
