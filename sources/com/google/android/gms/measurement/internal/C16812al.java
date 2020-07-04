package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.common.p749d.C15174b;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.stats.C15307a;
import com.google.android.gms.internal.measurement.C16563gr;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.al */
public final class C16812al {

    /* renamed from: a */
    final C16825ay f46955a;

    C16812al(C16825ay ayVar) {
        this.f46955a = ayVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo43621a(String str) {
        if (str == null || str.isEmpty()) {
            this.f46955a.mo43585q().f47493g.mo44160a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f46955a.mo43584p().mo43571c();
        if (!m55428a()) {
            this.f46955a.mo43585q().f47493g.mo44160a("Install Referrer Reporter is not available");
            return;
        }
        this.f46955a.mo43585q().f47493g.mo44160a("Install Referrer Reporter is initializing");
        C16813am amVar = new C16813am(this, str);
        this.f46955a.mo43584p().mo43571c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f46955a.mo43581m().getPackageManager();
        if (packageManager == null) {
            this.f46955a.mo43585q().f47490d.mo44160a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f46955a.mo43585q().f47493g.mo44160a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m55428a()) {
                this.f46955a.mo43585q().f47493g.mo44160a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f46955a.mo43585q().f47493g.mo44161a("Install Referrer Service is", C15307a.m44540a().mo38676a(this.f46955a.mo43581m(), new Intent(intent), amVar, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f46955a.mo43585q().f47487a.mo44161a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m55428a() {
        boolean z = false;
        try {
            C15174b a = C15176d.m44159a(this.f46955a.mo43581m());
            if (a == null) {
                this.f46955a.mo43585q().f47493g.mo44160a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo38467b("com.android.vending", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f46955a.mo43585q().f47493g.mo44161a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo43620a(String str, C16563gr grVar) {
        this.f46955a.mo43584p().mo43571c();
        if (grVar == null) {
            this.f46955a.mo43585q().f47490d.mo44160a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = grVar.mo42888a(bundle);
            if (a != null) {
                return a;
            }
            this.f46955a.mo43585q().f47487a.mo44160a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f46955a.mo43585q().f47487a.mo44161a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
