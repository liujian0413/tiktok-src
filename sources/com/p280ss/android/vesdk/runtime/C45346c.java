package com.p280ss.android.vesdk.runtime;

import android.text.TextUtils;
import com.p280ss.android.vesdk.runtime.p1778a.C45342a;

/* renamed from: com.ss.android.vesdk.runtime.c */
public final class C45346c {

    /* renamed from: a */
    public String f116805a;

    /* renamed from: b */
    private String f116806b;

    /* renamed from: a */
    public final String mo108564a() {
        if (TextUtils.isEmpty(this.f116806b)) {
            this.f116806b = (String) C45342a.m143305a().mo108560b("vesdk_models_dir_sp_key", "");
        }
        return this.f116806b;
    }
}
