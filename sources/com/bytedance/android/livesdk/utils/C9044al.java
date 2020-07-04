package com.bytedance.android.livesdk.utils;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

/* renamed from: com.bytedance.android.livesdk.utils.al */
public final class C9044al {

    /* renamed from: com.bytedance.android.livesdk.utils.al$a */
    static class C9045a extends ProgressDialog {
        public final void show() {
            try {
                super.show();
            } catch (Exception unused) {
            }
        }

        C9045a(Context context) {
            super(context);
        }
    }

    /* renamed from: b */
    public static ProgressDialog m27011b(Context context, String str) {
        C9045a aVar = new C9045a(context);
        aVar.setMessage(str);
        return aVar;
    }

    /* renamed from: a */
    public static ProgressDialog m27010a(Context context, String str) {
        C9045a aVar = new C9045a(context);
        aVar.setMessage(str);
        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
            aVar.show();
        }
        return aVar;
    }
}
