package com.bytedance.android.live.core.utils.p159b.p160a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.C3362ag;
import com.bytedance.android.live.core.utils.p159b.C3379c;

/* renamed from: com.bytedance.android.live.core.utils.b.a.b */
public final class C3370b implements C3379c {
    /* renamed from: a */
    public final boolean mo10281a(Context context) {
        try {
            String a = C3362ag.m12539a("ro.hmct.notch_height");
            String a2 = C3362ag.m12539a("ro.hmct.notch_width");
            if (TextUtils.equals(a.trim(), "0") || TextUtils.isEmpty(a.trim()) || TextUtils.equals(a2.trim(), "0") || TextUtils.isEmpty(a2.trim())) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
