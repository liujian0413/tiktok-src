package android.support.transition;

import android.os.IBinder;

/* renamed from: android.support.transition.al */
final class C0472al implements C0474an {

    /* renamed from: a */
    private final IBinder f1946a;

    public final int hashCode() {
        return this.f1946a.hashCode();
    }

    C0472al(IBinder iBinder) {
        this.f1946a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0472al) || !((C0472al) obj).f1946a.equals(this.f1946a)) {
            return false;
        }
        return true;
    }
}
