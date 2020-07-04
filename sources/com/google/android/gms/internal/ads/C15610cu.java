package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0211a;
import android.support.customtabs.C0212b;
import android.support.customtabs.C0221d;
import android.support.customtabs.C0223e;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.cu */
public final class C15610cu implements bcv {

    /* renamed from: a */
    public C15611cv f44237a;

    /* renamed from: b */
    private C0223e f44238b;

    /* renamed from: c */
    private C0212b f44239c;

    /* renamed from: d */
    private C0221d f44240d;

    /* renamed from: a */
    public static boolean m50382a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (!(queryIntentActivities == null || resolveActivity == null)) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(((ResolveInfo) queryIntentActivities.get(i)).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(bct.m48438a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo41469a(Activity activity) {
        if (this.f44240d != null) {
            activity.unbindService(this.f44240d);
            this.f44239c = null;
            this.f44238b = null;
            this.f44240d = null;
        }
    }

    /* renamed from: b */
    public final void mo41471b(Activity activity) {
        if (this.f44239c == null) {
            String a = bct.m48438a(activity);
            if (a != null) {
                this.f44240d = new bcu(this);
                C0212b.m780a(activity, a, this.f44240d);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo41470a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.f44239c == null) {
            return false;
        }
        if (this.f44239c == null) {
            this.f44238b = null;
        } else if (this.f44238b == null) {
            this.f44238b = this.f44239c.mo634a((C0211a) null);
        }
        C0223e eVar = this.f44238b;
        if (eVar == null) {
            return false;
        }
        return eVar.mo652a(uri, null, null);
    }

    /* renamed from: a */
    public final void mo40513a(C0212b bVar) {
        this.f44239c = bVar;
        this.f44239c.mo635a(0);
        if (this.f44237a != null) {
            this.f44237a.mo39186a();
        }
    }

    /* renamed from: a */
    public final void mo40512a() {
        this.f44239c = null;
        this.f44238b = null;
    }
}
