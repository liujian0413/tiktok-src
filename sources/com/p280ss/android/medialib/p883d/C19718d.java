package com.p280ss.android.medialib.p883d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.ss.android.medialib.d.d */
public class C19718d {

    /* renamed from: a */
    private static final String f53481a = "d";

    /* renamed from: a */
    public static Pair<Integer, Integer> m65016a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.low_latency");
        }
        if (packageManager != null) {
            packageManager.hasSystemFeature("android.hardware.audio.pro");
        }
        int i = 256;
        int i2 = 44100;
        if (VERSION.SDK_INT >= 17) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            i2 = m65015a(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
            i = m65015a(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), 256);
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
    }

    /* renamed from: a */
    private static int m65015a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
