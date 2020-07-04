package com.p280ss.android.ugc.aweme.shortvideo.festival;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.h */
public final class C39875h {
    /* renamed from: a */
    public static final boolean m127613a(File file, String str) {
        if (!file.exists()) {
            return false;
        }
        return TextUtils.equals(C6306c.m19560a(file), str);
    }
}
