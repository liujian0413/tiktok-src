package com.bytedance.crash.p501j;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9918j;

/* renamed from: com.bytedance.crash.j.j */
public final class C9960j {

    /* renamed from: a */
    public int f27188a = -1;

    /* renamed from: b */
    private String f27189b;

    /* renamed from: a */
    public final String mo24593a() {
        if (!TextUtils.isEmpty(this.f27189b) && !"0".equals(this.f27189b)) {
            return this.f27189b;
        }
        this.f27189b = C9918j.m29332a().mo24527c();
        if (!TextUtils.isEmpty(this.f27189b) && !"0".equals(this.f27189b)) {
            return this.f27189b;
        }
        this.f27189b = C9957i.m29466a().mo24585b();
        return this.f27189b;
    }

    public C9960j(Context context) {
    }

    /* renamed from: a */
    public final void mo24594a(String str) {
        this.f27189b = str;
        C9957i.m29466a().mo24586b(str);
    }
}
