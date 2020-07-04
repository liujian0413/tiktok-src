package com.adm.push;

import android.content.Context;
import com.p280ss.android.push.PushDependManager;
import com.p280ss.android.pushmanager.thirdparty.ISendTokenCallBack;

/* renamed from: com.adm.push.a */
final class C1652a {
    /* renamed from: a */
    public static void m8054a(Context context, final String str, int i) {
        try {
            m8055a(context, str, (ISendTokenCallBack) new ISendTokenCallBack() {
                public final int getType() {
                    return 14;
                }

                public final String getToken(Context context) {
                    return str;
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m8055a(Context context, String str, ISendTokenCallBack iSendTokenCallBack) {
        if (context != null) {
            try {
                PushDependManager.inst().sendToken(context.getApplicationContext(), iSendTokenCallBack);
            } catch (Throwable unused) {
            }
        }
    }
}
