package dmt.p1861av.video;

import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;

/* renamed from: dmt.av.video.a */
public final class C47397a {
    /* renamed from: a */
    public static int m148008a(float f) {
        return (int) (f * 4.0f * 1000.0f * 1000.0f);
    }

    /* renamed from: a */
    public static int m148009a(int i) {
        return i;
    }

    /* renamed from: a */
    public static long m148010a(long j) {
        return j;
    }

    /* renamed from: b */
    public static int m148011b(int i) {
        return i;
    }

    /* renamed from: c */
    public static ENCODE_PRESET m148012c(int i) {
        ENCODE_PRESET[] values = ENCODE_PRESET.values();
        if (i < 0 || i >= values.length) {
            return null;
        }
        return values[i];
    }
}
