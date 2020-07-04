package com.p280ss.android.ugc.aweme.qrcode.p1498d;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.d */
public final class C37074d {
    /* renamed from: a */
    private static Bitmap m119207a(View view) {
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        if (view.getDrawingCache() != null) {
            return Bitmap.createBitmap(view.getDrawingCache());
        }
        return null;
    }

    /* renamed from: a */
    public static void m119209a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    public static String m119208a(View view, String str, String str2) {
        Bitmap a = m119207a(view);
        if (a == null || !BitmapUtils.saveBitmapToSD(a, str, str2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
