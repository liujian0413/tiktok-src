package com.android.p059a.p060a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.p273a.p274a.C6502a;
import com.google.android.p273a.p274a.C6502a.C6503a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.List;

/* renamed from: com.android.a.a.b */
final class C1848b extends C1845a {

    /* renamed from: a */
    public int f6651a;

    /* renamed from: b */
    public C6502a f6652b;

    /* renamed from: c */
    private final Context f6653c;

    /* renamed from: d */
    private ServiceConnection f6654d;

    /* renamed from: com.android.a.a.b$a */
    final class C1850a implements ServiceConnection {

        /* renamed from: b */
        private final C1851c f6656b;

        public final void onServiceDisconnected(ComponentName componentName) {
            C1848b.this.f6652b = null;
            C1848b.this.f6651a = 0;
            this.f6656b.onInstallReferrerServiceDisconnected();
        }

        private C1850a(C1851c cVar) {
            if (cVar != null) {
                this.f6656b = cVar;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1848b.this.f6652b = C6503a.m20204a(iBinder);
            C1848b.this.f6651a = 2;
            this.f6656b.onInstallReferrerSetupFinished(0);
        }
    }

    /* renamed from: d */
    private boolean m8615d() {
        try {
            if (this.f6653c.getPackageManager().getPackageInfo("com.android.vending", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo7354a() {
        if (this.f6651a != 2 || this.f6652b == null || this.f6654d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo7355b() {
        this.f6651a = 3;
        if (this.f6654d != null) {
            this.f6653c.unbindService(this.f6654d);
            this.f6654d = null;
        }
        this.f6652b = null;
    }

    /* renamed from: c */
    public final C1852d mo7356c() throws RemoteException {
        if (mo7354a()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f6653c.getPackageName());
            try {
                return new C1852d(this.f6652b.mo15868a(bundle));
            } catch (RemoteException e) {
                this.f6651a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    public C1848b(Context context) {
        this.f6653c = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo7353a(C1851c cVar) {
        if (mo7354a()) {
            cVar.onInstallReferrerSetupFinished(0);
        } else if (this.f6651a == 1) {
            cVar.onInstallReferrerSetupFinished(3);
        } else if (this.f6651a == 3) {
            cVar.onInstallReferrerSetupFinished(3);
        } else {
            this.f6654d = new C1850a(cVar);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.f6653c.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !m8615d()) {
                        this.f6651a = 0;
                        cVar.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    if (!this.f6653c.bindService(new Intent(intent), this.f6654d, 1)) {
                        this.f6651a = 0;
                        cVar.onInstallReferrerSetupFinished(1);
                        return;
                    }
                    return;
                }
            }
            this.f6651a = 0;
            cVar.onInstallReferrerSetupFinished(2);
        }
    }
}
