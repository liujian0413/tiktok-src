package com.facebook.internal;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.C0219c;
import android.support.customtabs.C0219c.C0220a;
import com.facebook.C13499h;

/* renamed from: com.facebook.internal.d */
public final class C13905d {

    /* renamed from: a */
    private Uri f36809a;

    /* renamed from: a */
    public final void mo33556a(Activity activity, String str) {
        C0219c a = new C0220a().mo648a();
        a.f855a.setPackage(str);
        a.f855a.addFlags(1073741824);
        a.mo646a(activity, this.f36809a);
    }

    public C13905d(String str, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String a = C13966y.m41208a();
        StringBuilder sb = new StringBuilder();
        sb.append(C13499h.m39722h());
        sb.append("/dialog/");
        sb.append(str);
        this.f36809a = C13967z.m41214a(a, sb.toString(), bundle);
    }
}
