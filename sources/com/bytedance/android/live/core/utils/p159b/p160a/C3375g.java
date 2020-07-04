package com.bytedance.android.live.core.utils.p159b.p160a;

import android.content.Context;
import com.bytedance.android.live.core.utils.p159b.C3379c;
import com.bytedance.common.utility.reflect.C6322b;
import com.bytedance.common.utility.reflect.ReflectException;

/* renamed from: com.bytedance.android.live.core.utils.b.a.g */
public final class C3375g implements C3379c {
    /* renamed from: a */
    public final boolean mo10281a(Context context) {
        try {
            return ((Boolean) C6322b.m19611a("android.util.FtFeature").mo15158a("isFeatureSupport", (Class<?>[]) new Class[]{Integer.class}, Integer.valueOf(32)).f18556a).booleanValue();
        } catch (ReflectException unused) {
            return false;
        }
    }
}
