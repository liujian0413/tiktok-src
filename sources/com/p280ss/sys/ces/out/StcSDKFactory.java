package com.p280ss.sys.ces.out;

import android.content.Context;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.sys.ces.C45939c;

/* renamed from: com.ss.sys.ces.out.StcSDKFactory */
public class StcSDKFactory {

    /* renamed from: a */
    private static ISdk f117466a;

    public static ISdk getInstance() {
        return f117466a;
    }

    public static ISdk getSDK(Context context, long j) {
        if (f117466a == null) {
            synchronized (StcSDKFactory.class) {
                if (f117466a == null) {
                    f117466a = C45939c.m144078a(context, j, NormalGiftView.ALPHA_255);
                }
            }
        }
        return f117466a;
    }

    public static ISdk getSDK(Context context, long j, int i) {
        if (f117466a == null) {
            synchronized (StcSDKFactory.class) {
                if (f117466a == null) {
                    f117466a = C45939c.m144078a(context, j, i);
                }
            }
        }
        return f117466a;
    }
}
