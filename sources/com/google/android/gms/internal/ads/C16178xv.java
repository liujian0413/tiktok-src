package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xv */
public final class C16178xv extends ContextWrapper {
    /* renamed from: a */
    public static void m52405a(String str) throws NameNotFoundException {
        throw new NoSuchMethodError();
    }

    public final Context getApplicationContext() {
        throw new NoSuchMethodError();
    }

    public final synchronized ApplicationInfo getApplicationInfo() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageName() {
        throw new NoSuchMethodError();
    }

    public final synchronized String getPackageResourcePath() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static void m52404a(Activity activity) {
        throw new NoSuchMethodError();
    }

    public final synchronized void startActivity(Intent intent) {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m52403a(Context context) {
        if (context instanceof C16178xv) {
            return ((C16178xv) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
