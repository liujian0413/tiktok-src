package android.support.customtabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.C0226g.C0227a;
import android.text.TextUtils;

/* renamed from: android.support.customtabs.b */
public class C0212b {

    /* renamed from: a */
    private final C0229h f834a;

    /* renamed from: b */
    private final ComponentName f835b;

    /* renamed from: a */
    public final boolean mo635a(long j) {
        try {
            return this.f834a.mo619a(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final C0223e mo634a(final C0211a aVar) {
        C02131 r0 = new C0227a() {

            /* renamed from: c */
            private Handler f838c = new Handler(Looper.getMainLooper());

            /* renamed from: a */
            public final void mo638a(final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f838c.post(new Runnable() {
                        public final void run() {
                            aVar.mo631a(bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo637a(final int i, final Bundle bundle) {
                if (aVar != null) {
                    this.f838c.post(new Runnable() {
                        public final void run() {
                            aVar.mo630a(i, bundle);
                        }
                    });
                }
            }

            /* renamed from: b */
            public final void mo640b(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f838c.post(new Runnable() {
                        public final void run() {
                            aVar.mo633b(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo639a(final String str, final Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    this.f838c.post(new Runnable() {
                        public final void run() {
                            aVar.mo632a(str, bundle);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo636a(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
                if (aVar != null) {
                    Handler handler = this.f838c;
                    final int i2 = i;
                    final Uri uri2 = uri;
                    final boolean z2 = z;
                    final Bundle bundle2 = bundle;
                    C02185 r1 = new Runnable() {
                        public final void run() {
                            aVar.mo629a(i2, uri2, z2, bundle2);
                        }
                    };
                    handler.post(r1);
                }
            }
        };
        try {
            if (!this.f834a.mo620a((C0226g) r0)) {
                return null;
            }
            return new C0223e(this.f834a, r0, this.f835b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    C0212b(C0229h hVar, ComponentName componentName) {
        this.f834a = hVar;
        this.f835b = componentName;
    }

    /* renamed from: a */
    public static boolean m780a(Context context, String str, C0221d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, dVar, 33);
    }
}
