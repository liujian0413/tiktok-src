package com.p280ss.android.downloadlib.p862a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import com.p280ss.android.download.api.p857a.C19377f;
import com.p280ss.android.download.api.p857a.C19382k;

/* renamed from: com.ss.android.downloadlib.a.c */
public final class C19454c implements C19377f {

    /* renamed from: a */
    private C19382k f52665a;

    /* renamed from: a */
    public final boolean mo51362a(Context context, String str) {
        if (context == null || C0683b.m2909b(context, str) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo51361a(Activity activity, String[] strArr, C19382k kVar) {
        if (VERSION.SDK_INT >= 23) {
            this.f52665a = kVar;
            activity.requestPermissions(strArr, 1);
            return;
        }
        kVar.mo51367a();
    }

    /* renamed from: a */
    public final void mo51360a(Activity activity, int i, String[] strArr, int[] iArr) {
        if (iArr.length > 0 && this.f52665a != null) {
            if (iArr[0] == -1) {
                this.f52665a.mo51368a(strArr[0]);
            } else if (iArr[0] == 0) {
                this.f52665a.mo51367a();
            }
        }
    }
}
