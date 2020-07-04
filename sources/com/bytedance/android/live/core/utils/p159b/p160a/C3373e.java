package com.bytedance.android.live.core.utils.p159b.p160a;

import android.content.Context;
import com.bytedance.android.live.core.utils.p159b.C3379c;

/* renamed from: com.bytedance.android.live.core.utils.b.a.e */
public final class C3373e implements C3379c {
    /* renamed from: a */
    public final boolean mo10281a(Context context) {
        try {
            return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
        } catch (Exception unused) {
            return false;
        }
    }
}
