package com.p280ss.android.ugc.awemepushlib.p1712a;

import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.common.push.p560a.C10723a.C10724a;
import com.bytedance.ies.uikit.base.C11008b;
import com.p280ss.android.ugc.awemepushlib.p1714di.ies.MessageHandler;

/* renamed from: com.ss.android.ugc.awemepushlib.a.a */
public final class C43588a implements C10724a {
    /* renamed from: a */
    public final void mo25616a(Context context) {
        try {
            if (C11008b.m32267a() == null) {
                context.startService(new Intent(context, MessageHandler.class));
            }
        } catch (Throwable unused) {
        }
    }
}
