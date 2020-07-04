package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.SensorManager;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.main.C32922c;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.common.c */
public final class C25656c {

    /* renamed from: a */
    public static final C25656c f67577a = new C25656c();

    private C25656c() {
    }

    /* renamed from: a */
    public static final float m84375a() {
        return (float) C6887b.m21436b().mo16903b((Context) AwemeApplication.m21341a(), "douyidou_threshold", 7);
    }

    /* renamed from: a */
    public static final boolean m84376a(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("sensor");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
        } else if (((SensorManager) systemService).getDefaultSensor(4) == null || !((C32922c) C23336d.m76560a(context, C32922c.class)).mo60453a(true)) {
            return false;
        } else {
            return true;
        }
    }
}
