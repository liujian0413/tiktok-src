package com.p280ss.ugc.live.gift.resource.p1830d;

import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* renamed from: com.ss.ugc.live.gift.resource.d.c */
public final class C46231c {
    /* renamed from: a */
    public static long m145168a() {
        String path = Environment.getDataDirectory().getPath();
        if (VERSION.SDK_INT < 18) {
            return new File(path).getFreeSpace() / 1024;
        }
        StatFs statFs = new StatFs(path);
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024;
    }
}
