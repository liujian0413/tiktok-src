package com.bytedance.sdk.account;

import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12828k;

/* renamed from: com.bytedance.sdk.account.d */
public abstract class C12793d<T extends C12710e<K>, K extends C12828k> extends C12739b<T> {
    public abstract void onError(T t, int i);

    public abstract void onSuccess(T t);

    public final String getCaptchaInfo(T t) {
        if (t == null || t.f33709g == null) {
            return null;
        }
        return t.f33709g.f33962j;
    }

    public final boolean needShowCaptcha(T t) {
        if (t == null || t.f33709g == null) {
            return false;
        }
        return t.f33709g.mo31361c();
    }

    public final boolean needShowPicCaptcha(T t) {
        if (t == null || t.f33709g == null) {
            return false;
        }
        return t.f33709g.mo31362d();
    }

    public final boolean needShowSecureCaptcha(T t) {
        if (t == null || t.f33709g == null) {
            return false;
        }
        return t.f33709g.mo31363e();
    }
}
