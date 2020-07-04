package com.p280ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.cf */
public final class C43011cf {
    /* renamed from: a */
    public static boolean m136512a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getHost());
            sb.append(parse.getPath());
            String sb2 = sb.toString();
            if (sb2.startsWith("videoRecord/live") || sb2.startsWith("video_record/live") || (parse.getHost().equals("video_record") && TextUtils.equals(parse.getQueryParameter("record_type"), "live"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
