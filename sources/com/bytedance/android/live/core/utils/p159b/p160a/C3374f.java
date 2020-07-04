package com.bytedance.android.live.core.utils.p159b.p160a;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.live.core.utils.p159b.C3379c;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.utils.b.a.f */
public final class C3374f implements C3379c {

    /* renamed from: a */
    public static final List<String> f10180a = Arrays.asList(new String[]{"ONEPLUS A6000"});

    /* renamed from: a */
    public final boolean mo10281a(Context context) {
        return f10180a.contains(Build.MODEL);
    }
}
