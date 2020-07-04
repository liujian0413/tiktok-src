package android.arch.persistence.room;

import android.arch.persistence.p009a.C0142f;

/* renamed from: android.arch.persistence.room.b */
public abstract class C0148b<T> extends C0165i {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo330a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo331a(C0142f fVar, T t);

    public C0148b(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: a */
    public final int mo328a(T t) {
        C0142f b = mo365b();
        try {
            mo331a(b, t);
            return b.mo294a();
        } finally {
            mo364a(b);
        }
    }

    /* renamed from: a */
    public final int mo329a(T[] tArr) {
        C0142f b = mo365b();
        try {
            int i = 0;
            for (T a : tArr) {
                mo331a(b, a);
                i += b.mo294a();
            }
            return i;
        } finally {
            mo364a(b);
        }
    }
}
