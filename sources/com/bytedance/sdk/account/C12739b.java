package com.bytedance.sdk.account;

import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.p280ss.android.account.C18895c;

/* renamed from: com.bytedance.sdk.account.b */
public abstract class C12739b<T extends C12707b> extends C12706a<T> {
    public String getCaptchaInfo(T t) {
        return null;
    }

    public boolean needShowCaptcha(T t) {
        return false;
    }

    public boolean needShowPicCaptcha(T t) {
        return false;
    }

    public boolean needShowSecureCaptcha(T t) {
        return false;
    }

    public abstract void onError(T t, int i);

    public void onNeedCaptcha(T t, String str) {
    }

    public void onNeedSecureCaptcha(T t) {
    }

    public abstract void onSuccess(T t);

    public void onResponse(T t) {
        if (t.f33701a) {
            onSuccess(t);
        } else if (!needShowCaptcha(t)) {
            onError(t, t.f33702b);
        } else if (needShowPicCaptcha(t)) {
            onNeedCaptcha(t, getCaptchaInfo(t));
        } else {
            C18895c.m61668a();
            if (needShowSecureCaptcha(t)) {
                onNeedSecureCaptcha(t);
            } else {
                onError(t, t.f33702b);
            }
        }
    }
}
