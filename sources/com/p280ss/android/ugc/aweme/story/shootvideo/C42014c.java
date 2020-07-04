package com.p280ss.android.ugc.aweme.story.shootvideo;

import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.c */
public final class C42014c {
    /* renamed from: a */
    public static boolean m133558a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str) && str.trim().length() > 0) {
                return true;
            }
        }
        return false;
    }
}
