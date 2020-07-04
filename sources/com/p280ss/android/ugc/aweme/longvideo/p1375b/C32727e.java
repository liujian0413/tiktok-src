package com.p280ss.android.ugc.aweme.longvideo.p1375b;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.e */
public final class C32727e {

    /* renamed from: a */
    public static final C32728a f85308a = new C32728a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.e$a */
    public static final class C32728a {
        private C32728a() {
        }

        public /* synthetic */ C32728a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public static int m105939b(int i) {
            if (i <= 0) {
                return 0;
            }
            return i / 1000;
        }

        /* renamed from: c */
        private static String m105940c(int i) {
            if (i >= 10) {
                return String.valueOf(i);
            }
            StringBuilder sb = new StringBuilder("0");
            sb.append(i);
            return sb.toString();
        }

        /* renamed from: a */
        public final String mo84203a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(m105940c(i / 60));
            sb.append(':');
            sb.append(m105940c(i % 60));
            return sb.toString();
        }

        /* renamed from: a */
        public final CharSequence mo84202a(float f, int i) {
            return mo84203a((int) ((f * ((float) i)) / 100.0f));
        }
    }
}
