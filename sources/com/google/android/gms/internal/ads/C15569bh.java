package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.bh */
public final class C15569bh {

    /* renamed from: a */
    private final Context f41980a;

    public C15569bh(Context context) {
        C15267r.m44385a(context, (Object) "Context can not be null");
        this.f41980a = context;
    }

    /* renamed from: a */
    public final boolean mo40680a() {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m48762a(intent);
    }

    /* renamed from: b */
    public final boolean mo40681b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m48762a(intent);
    }

    /* renamed from: c */
    public final boolean mo40682c() {
        return ((Boolean) aet.m45702a(this.f41980a, new C15570bi())).booleanValue() && C15176d.m44159a(this.f41980a).mo38460a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: d */
    public final boolean mo40683d() {
        return m48762a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    /* renamed from: a */
    private final boolean m48762a(Intent intent) {
        C15267r.m44385a(intent, (Object) "Intent can not be null");
        if (!this.f41980a.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
