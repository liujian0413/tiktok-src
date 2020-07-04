package com.p280ss.android.ugc.aweme.photo.p1451a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.photo.a.a */
public final class C34727a {
    /* renamed from: a */
    public static void m112060a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
    }
}
