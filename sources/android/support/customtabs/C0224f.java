package android.support.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: android.support.customtabs.f */
public final class C0224f {

    /* renamed from: a */
    final C0226g f867a;

    /* renamed from: b */
    public final C0211a f868b = new C0211a() {
        /* renamed from: a */
        public final void mo631a(Bundle bundle) {
            try {
                C0224f.this.f867a.mo638a(bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: b */
        public final void mo633b(String str, Bundle bundle) {
            try {
                C0224f.this.f867a.mo640b(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo630a(int i, Bundle bundle) {
            try {
                C0224f.this.f867a.mo637a(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo632a(String str, Bundle bundle) {
            try {
                C0224f.this.f867a.mo639a(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        /* renamed from: a */
        public final void mo629a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0224f.this.f867a.mo636a(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final IBinder mo653a() {
        return this.f867a.asBinder();
    }

    public final int hashCode() {
        return mo653a().hashCode();
    }

    C0224f(C0226g gVar) {
        this.f867a = gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0224f)) {
            return false;
        }
        return ((C0224f) obj).mo653a().equals(this.f867a.asBinder());
    }
}
