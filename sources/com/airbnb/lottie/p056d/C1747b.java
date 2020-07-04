package com.airbnb.lottie.p056d;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.airbnb.lottie.d.b */
public final class C1747b {
    /* renamed from: b */
    private static float m8333b(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: a */
    private static float m8331a(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m8332a(float f, int i, int i2) {
        float f2 = ((float) ((i >> 24) & NormalGiftView.ALPHA_255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & NormalGiftView.ALPHA_255)) / 255.0f;
        float f4 = ((float) (i & NormalGiftView.ALPHA_255)) / 255.0f;
        float f5 = ((float) ((i2 >> 24) & NormalGiftView.ALPHA_255)) / 255.0f;
        float f6 = ((float) ((i2 >> 16) & NormalGiftView.ALPHA_255)) / 255.0f;
        float f7 = ((float) ((i2 >> 8) & NormalGiftView.ALPHA_255)) / 255.0f;
        float f8 = ((float) (i2 & NormalGiftView.ALPHA_255)) / 255.0f;
        float b = m8333b(((float) ((i >> 16) & NormalGiftView.ALPHA_255)) / 255.0f);
        float b2 = m8333b(f3);
        float b3 = m8333b(f4);
        float b4 = m8333b(f6);
        float b5 = b2 + ((m8333b(f7) - b2) * f);
        float b6 = b3 + (f * (m8333b(f8) - b3));
        float f9 = (f2 + ((f5 - f2) * f)) * 255.0f;
        return (Math.round(m8331a(b + ((b4 - b) * f)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(m8331a(b5) * 255.0f) << 8) | Math.round(m8331a(b6) * 255.0f);
    }
}
