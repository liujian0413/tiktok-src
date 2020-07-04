package com.p280ss.android.ugc.aweme.photomovie.edit.cover;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.a */
public interface C34882a {

    /* renamed from: com.ss.android.ugc.aweme.photomovie.edit.cover.a$a */
    public static class C34883a implements C34882a {
        /* renamed from: a */
        public final int mo88417a(int i, float f) {
            int ceil = (int) (Math.ceil((double) (((float) i) * f)) - 1.0d);
            if (ceil < 0) {
                return 0;
            }
            return ceil;
        }
    }

    /* renamed from: a */
    int mo88417a(int i, float f);
}
