package com.p280ss.ttm.player;

import android.os.Build.VERSION;

/* renamed from: com.ss.ttm.player.AudioFormats */
public class AudioFormats {
    private static final int[] validSampleRates = {4000, 8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};

    public static int getDefaultSampleRatesNB() {
        return validSampleRates.length;
    }

    public static int getMaxSupportedSampleRates(int[] iArr) {
        int i;
        int length = validSampleRates.length;
        if (VERSION.SDK_INT >= 23) {
            i = length - 3;
        } else if (VERSION.SDK_INT >= 21) {
            i = length - 5;
        } else {
            i = length - 9;
        }
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = validSampleRates[i2];
        }
        return i;
    }
}
