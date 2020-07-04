package android.arch.persistence.room;

import android.arch.persistence.p009a.C0142f;

/* renamed from: android.arch.persistence.room.c */
public abstract class C0155c<T> extends C0165i {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo345a(C0142f fVar, T t);

    public C0155c(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: a */
    public final void mo347a(T t) {
        C0142f b = mo365b();
        try {
            mo345a(b, t);
            b.mo295b();
        } finally {
            mo364a(b);
        }
    }

    /* renamed from: a */
    public final void mo346a(Iterable<T> iterable) {
        C0142f b = mo365b();
        try {
            for (T a : iterable) {
                mo345a(b, a);
                b.mo295b();
            }
        } finally {
            mo364a(b);
        }
    }

    /* renamed from: a */
    public final void mo348a(T[] tArr) {
        C0142f b = mo365b();
        try {
            for (T a : tArr) {
                mo345a(b, a);
                b.mo295b();
            }
        } finally {
            mo364a(b);
        }
    }
}
