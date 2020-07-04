package com.google.android.play.core.p766a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.play.core.internal.C17107aw;
import com.google.android.play.core.internal.C17112bc;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.tasks.C17147c;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.g */
public final class C17087g {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6525f f47783b = new C6525f("AppUpdateService");

    /* renamed from: c */
    private static final Intent f47784c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    final C17112bc<C17107aw> f47785a;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f47786d;

    /* renamed from: e */
    private final Context f47787e;

    public C17087g(Context context) {
        this.f47786d = context.getPackageName();
        this.f47787e = context;
        C17112bc bcVar = new C17112bc(context.getApplicationContext(), f47783b, "AppUpdateService", f47784c, C17086f.f47782a, null);
        this.f47785a = bcVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m56673b(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C17081a m56675b(Bundle bundle, String str) {
        C17081a aVar = new C17081a(str, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"));
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static Bundle m56676c() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10500);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Bundle m56677c(String str) {
        Bundle bundle = new Bundle();
        bundle.putAll(m56676c());
        bundle.putString("package.name", str);
        Integer d = m56678d();
        if (d != null) {
            bundle.putInt("app.version.code", d.intValue());
        }
        return bundle;
    }

    /* renamed from: d */
    private final Integer m56678d() {
        try {
            return Integer.valueOf(this.f47787e.getPackageManager().getPackageInfo(this.f47787e.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException unused) {
            f47783b.mo15893d("The current version of the app could not be retrieved", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final C17147c<C17081a> mo44329a(String str) {
        f47783b.mo15889a("requestUpdateInfo(%s)", str);
        C17157l lVar = new C17157l();
        this.f47785a.mo44387a((C17113bd) new C17089i(this, lVar, str, lVar));
        return lVar.f47887a;
    }

    /* renamed from: b */
    public final C17147c<Void> mo44330b(String str) {
        f47783b.mo15889a("completeUpdate(%s)", str);
        C17157l lVar = new C17157l();
        this.f47785a.mo44387a((C17113bd) new C17088h(this, lVar, lVar, str));
        return lVar.f47887a;
    }
}
