package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.content.FileProvider;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.bf */
public final class C42972bf {
    /* renamed from: a */
    public static Uri m136420a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m136419a(context, new File(str));
    }

    /* renamed from: a */
    public static Uri m136419a(Context context, File file) {
        if (VERSION.SDK_INT < 24) {
            return Uri.fromFile(file);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".fileprovider");
        return FileProvider.getUriForFile(context, sb.toString(), file);
    }
}
