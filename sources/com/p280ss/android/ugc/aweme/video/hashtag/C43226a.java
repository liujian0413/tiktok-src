package com.p280ss.android.ugc.aweme.video.hashtag;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.video.hashtag.a */
public final class C43226a {

    /* renamed from: a */
    public int f111897a;

    /* renamed from: b */
    public int f111898b;

    /* renamed from: c */
    public String f111899c;

    /* renamed from: com.ss.android.ugc.aweme.video.hashtag.a$a */
    public static class C43227a implements Comparator<C43226a> {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m137133a((C43226a) obj, (C43226a) obj2);
        }

        /* renamed from: a */
        private static int m137133a(C43226a aVar, C43226a aVar2) {
            if (aVar.f111897a == aVar2.f111897a) {
                return 0;
            }
            if (aVar.f111897a < aVar2.f111897a) {
                return -1;
            }
            return 1;
        }
    }

    public C43226a() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f111897a), Integer.valueOf(this.f111898b), this.f111899c});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f111899c);
        sb.append(": ");
        sb.append(this.f111897a);
        sb.append(", ");
        sb.append(this.f111898b);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43226a aVar = (C43226a) obj;
        if (this.f111897a == aVar.f111897a && this.f111898b == aVar.f111898b && (this.f111899c == aVar.f111899c || (this.f111899c != null && this.f111899c.equals(aVar.f111899c)))) {
            return true;
        }
        return false;
    }

    public C43226a(String str, int i, int i2) {
        this.f111899c = str;
        this.f111897a = i;
        this.f111898b = i2;
    }
}
