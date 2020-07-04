package com.p280ss.android.image;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: com.ss.android.image.l */
public final class C19605l {
    /* renamed from: a */
    public static void m64567a(Context context, String str) {
        try {
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(str))));
        } catch (Exception unused) {
        }
    }
}
