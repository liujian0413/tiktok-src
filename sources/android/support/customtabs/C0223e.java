package android.support.customtabs;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.e */
public final class C0223e {

    /* renamed from: a */
    public final ComponentName f863a;

    /* renamed from: b */
    private final Object f864b = new Object();

    /* renamed from: c */
    private final C0229h f865c;

    /* renamed from: d */
    private final C0226g f866d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final IBinder mo651a() {
        return this.f866d.asBinder();
    }

    /* renamed from: a */
    public final boolean mo652a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f865c.mo623a(this.f866d, uri, (Bundle) null, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    C0223e(C0229h hVar, C0226g gVar, ComponentName componentName) {
        this.f865c = hVar;
        this.f866d = gVar;
        this.f863a = componentName;
    }
}
