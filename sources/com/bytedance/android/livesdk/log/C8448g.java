package com.bytedance.android.livesdk.log;

import android.content.Context;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.log.g */
public final class C8448g {

    /* renamed from: a */
    private Context f23109a;

    private C8448g(Context context) {
        this.f23109a = context;
    }

    /* renamed from: a */
    public static C8448g m25682a(Context context) {
        return new C8448g(context);
    }

    /* renamed from: a */
    public static C8448g m25683a(View view) {
        return m25682a(view.getContext());
    }
}
