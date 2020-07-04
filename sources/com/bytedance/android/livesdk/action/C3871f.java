package com.bytedance.android.livesdk.action;

import android.text.TextUtils;

/* renamed from: com.bytedance.android.livesdk.action.f */
public final class C3871f {

    /* renamed from: a */
    public C3868d f11572a;

    /* renamed from: b */
    public ThreadMode f11573b;

    /* renamed from: c */
    public String f11574c;

    public C3871f(C3868d dVar) {
        this.f11572a = dVar;
        C3867c cVar = (C3867c) dVar.getClass().getAnnotation(C3867c.class);
        if (dVar != null) {
            this.f11574c = cVar.mo11408a();
            if (!TextUtils.isEmpty(this.f11574c)) {
                this.f11573b = cVar.mo11409b();
                return;
            }
            throw new IllegalArgumentException("action name can't be null");
        }
        throw new IllegalArgumentException("没有ActionMethod注解");
    }
}
