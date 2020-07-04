package com.bytedance.android.live.core.utils.p159b.p160a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.utils.p159b.C3379c;
import com.bytedance.android.live.core.utils.p159b.C3380d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.utils.b.a.d */
public class C3372d implements C3379c, C3380d {

    /* renamed from: a */
    private static final List<String> f10179a = Arrays.asList(new String[]{"RLI-AN00"});

    /* renamed from: a */
    public final boolean mo10283a() {
        return f10179a.contains(Build.MODEL);
    }

    /* renamed from: a */
    public final int mo10282a(Configuration configuration) {
        if (!mo10283a()) {
            return -1;
        }
        float f = (((float) configuration.screenHeightDp) * 1.0f) / ((float) configuration.screenWidthDp);
        if (f < 0.75f || f > 1.3333334f) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo10281a(Context context) {
        try {
            Class loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | Exception | NoSuchMethodException unused) {
            return false;
        }
    }
}
