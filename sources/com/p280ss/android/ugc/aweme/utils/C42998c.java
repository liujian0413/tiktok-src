package com.p280ss.android.ugc.aweme.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Process;
import android.text.format.Formatter;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.utils.c */
public final class C42998c {
    /* renamed from: a */
    public static String m136487a(Context context) throws Exception {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return Formatter.formatFileSize(context, memoryInfo.availMem);
    }

    /* renamed from: b */
    public static String m136488b(Context context) {
        boolean z;
        int i;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = activityManager.getLargeMemoryClass();
        } else {
            i = activityManager.getMemoryClass();
        }
        return Formatter.formatFileSize(context, (long) (i * PreloadTask.BYTE_UNIT_NUMBER * PreloadTask.BYTE_UNIT_NUMBER));
    }

    /* renamed from: c */
    public static String m136489c(Context context) {
        return Formatter.formatFileSize(context, (long) (((ActivityManager) context.getSystemService("activity")).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPrivateDirty() * PreloadTask.BYTE_UNIT_NUMBER));
    }
}
