package com.bytedance.opensdk.core.base.p626b;

import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.opensdk.core.base.b.a */
public abstract class C12306a {
    @C6593c(mo15949a = "description")

    /* renamed from: c */
    public final String f32665c;
    @C6593c(mo15949a = "error_code")

    /* renamed from: d */
    public final Integer f32666d;

    /* renamed from: a */
    public final String mo30107a() {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(this.f32666d);
        return sb.toString();
    }

    public C12306a(String str, Integer num) {
        this.f32665c = str;
        this.f32666d = num;
    }
}
