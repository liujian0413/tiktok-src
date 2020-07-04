package android.support.p022v4.media;

import android.support.p022v4.util.C0901h;
import android.text.TextUtils;

/* renamed from: android.support.v4.media.k */
class C0817k {

    /* renamed from: a */
    private static final boolean f2949a = C0811h.f2945a;

    /* renamed from: android.support.v4.media.k$a */
    static class C0818a implements C0813b {

        /* renamed from: a */
        private String f2950a;

        /* renamed from: b */
        private int f2951b;

        /* renamed from: c */
        private int f2952c;

        public final int hashCode() {
            return C0901h.m3835a(this.f2950a, Integer.valueOf(this.f2951b), Integer.valueOf(this.f2952c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0818a)) {
                return false;
            }
            C0818a aVar = (C0818a) obj;
            if (TextUtils.equals(this.f2950a, aVar.f2950a) && this.f2951b == aVar.f2951b && this.f2952c == aVar.f2952c) {
                return true;
            }
            return false;
        }

        C0818a(String str, int i, int i2) {
            this.f2950a = str;
            this.f2951b = i;
            this.f2952c = i2;
        }
    }
}
