package com.p280ss.base.mvp;

import android.content.Context;
import java.util.UUID;

/* renamed from: com.ss.base.mvp.d */
public abstract class C45785d {

    /* renamed from: a */
    private String f117111a = UUID.randomUUID().toString();

    /* renamed from: b */
    private Context f117112b;

    /* renamed from: b */
    public final Context mo110998b() {
        if (this.f117112b != null) {
            return this.f117112b;
        }
        throw new IllegalStateException("Do not call this before onInit()");
    }

    public C45785d(Context context) {
        this.f117112b = context.getApplicationContext();
    }
}
