package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

@C6505uv
public class bye {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final bxw f44162a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bxv f44163b;

    /* renamed from: c */
    private final C15543aw f44164c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C15712gn f44165d;

    /* renamed from: e */
    private final C16200yq f44166e;

    /* renamed from: f */
    private final C16231zu f44167f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C16018rw f44168g;

    /* renamed from: h */
    private final C15713go f44169h;

    public bye(bxw bxw, bxv bxv, C15543aw awVar, C15712gn gnVar, C16200yq yqVar, C16231zu zuVar, C16018rw rwVar, C15713go goVar) {
        this.f44162a = bxw;
        this.f44163b = bxv;
        this.f44164c = awVar;
        this.f44165d = gnVar;
        this.f44166e = yqVar;
        this.f44167f = zuVar;
        this.f44168g = rwVar;
        this.f44169h = goVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m50265b(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        bym.m50296a().mo39273a(context, bym.m50301f().f45677a, "gmob-apps", bundle, true);
    }

    /* renamed from: a */
    public final C15553b mo41436a(Context context, String str, C15931oq oqVar) {
        return (C15553b) new byj(this, context, str, oqVar).mo41442a(context, false);
    }

    /* renamed from: a */
    public final C15663es mo41437a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (C15663es) new byk(this, frameLayout, frameLayout2, context).mo41442a(context, false);
    }

    /* renamed from: a */
    public final C16019rx mo41438a(Activity activity) {
        byg byg = new byg(this, activity);
        String str = "com.google.android.gms.ads.internal.overlay.useClientJar";
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra(str)) {
            afm.m45779c("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra(str, false);
        }
        return (C16019rx) byg.mo41442a(activity, z);
    }
}
