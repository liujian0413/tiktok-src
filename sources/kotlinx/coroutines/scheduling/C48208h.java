package kotlinx.coroutines.scheduling;

import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.scheduling.h */
public abstract class C48208h implements Runnable {

    /* renamed from: f */
    public long f123101f;

    /* renamed from: g */
    public C48209i f123102g;

    /* renamed from: e */
    public final TaskMode mo120442e() {
        return this.f123102g.mo120438b();
    }

    public C48208h() {
        this(0, C48207g.f123099a);
    }

    public C48208h(long j, C48209i iVar) {
        C7573i.m23587b(iVar, "taskContext");
        this.f123101f = j;
        this.f123102g = iVar;
    }
}
