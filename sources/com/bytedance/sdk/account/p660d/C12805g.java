package com.bytedance.sdk.account.p660d;

import android.content.Context;
import com.bytedance.sdk.account.platform.api.C12905a;

/* renamed from: com.bytedance.sdk.account.d.g */
public class C12805g implements C12905a {

    /* renamed from: a */
    private static volatile C12905a f33889a;

    /* renamed from: b */
    private final Context f33890b;

    private C12805g(Context context) {
        this.f33890b = context.getApplicationContext();
    }

    /* renamed from: a */
    static C12905a m37219a(Context context) {
        if (f33889a == null) {
            synchronized (C12805g.class) {
                if (f33889a == null) {
                    f33889a = new C12805g(context);
                }
            }
        }
        return f33889a;
    }
}
