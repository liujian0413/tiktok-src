package com.p280ss.android.ugc.aweme.profile.util;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.profile.util.h */
public final class C36735h {

    /* renamed from: a */
    private static SparseArray<String> f96411a = new SparseArray<>();

    /* renamed from: a */
    public static String m118415a(int i) {
        String str;
        if (C6399b.m19944t()) {
            return C30537o.m99738a((long) i);
        }
        String str2 = (String) f96411a.get(i);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (i > 10000) {
            int i2 = i / VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
            int i3 = (i % VideoCacheTTnetProxyTimeoutExperiment.DEFAULT) / 1000;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i3);
            sb.append("w");
            str = sb.toString();
        } else {
            str = String.valueOf(i);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" ");
        String sb3 = sb2.toString();
        f96411a.put(i, sb3);
        return sb3;
    }
}
