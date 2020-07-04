package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.google.android.gms.common.internal.t */
public final class C15271t {

    /* renamed from: a */
    private final Resources f39466a;

    /* renamed from: b */
    private final String f39467b = this.f39466a.getResourcePackageName(R.string.aa5);

    public C15271t(Context context) {
        C15267r.m44384a(context);
        this.f39466a = context.getResources();
    }

    /* renamed from: a */
    public final String mo38614a(String str) {
        int identifier = this.f39466a.getIdentifier(str, "string", this.f39467b);
        if (identifier == 0) {
            return null;
        }
        return this.f39466a.getString(identifier);
    }
}
