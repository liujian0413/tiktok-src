package com.facebook.imageutils;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.f */
final class C13849f {
    /* renamed from: a */
    public static int m40895a(InputStream inputStream, int i, boolean z) throws IOException {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & NormalGiftView.ALPHA_255) << (i3 * 8);
                } else {
                    i4 <<= 8;
                    i2 = read & NormalGiftView.ALPHA_255;
                }
                i4 |= i2;
                i3++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i4;
    }
}
