package android.arch.persistence.room;

import android.arch.persistence.p009a.C0142f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: android.arch.persistence.room.i */
public abstract class C0165i {

    /* renamed from: a */
    private final AtomicBoolean f375a = new AtomicBoolean(false);

    /* renamed from: b */
    private final RoomDatabase f376b;

    /* renamed from: c */
    private volatile C0142f f377c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo330a();

    /* renamed from: c */
    private void m469c() {
        this.f376b.mo312c();
    }

    /* renamed from: d */
    private C0142f m470d() {
        return this.f376b.mo304a(mo330a());
    }

    /* renamed from: b */
    public final C0142f mo365b() {
        m469c();
        return m468a(this.f375a.compareAndSet(false, true));
    }

    public C0165i(RoomDatabase roomDatabase) {
        this.f376b = roomDatabase;
    }

    /* renamed from: a */
    public final void mo364a(C0142f fVar) {
        if (fVar == this.f377c) {
            this.f375a.set(false);
        }
    }

    /* renamed from: a */
    private C0142f m468a(boolean z) {
        if (!z) {
            return m470d();
        }
        if (this.f377c == null) {
            this.f377c = m470d();
        }
        return this.f377c;
    }
}
