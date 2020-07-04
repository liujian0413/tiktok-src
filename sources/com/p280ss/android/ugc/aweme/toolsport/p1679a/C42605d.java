package com.p280ss.android.ugc.aweme.toolsport.p1679a;

import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.toolsport.a.d */
public final class C42605d {

    /* renamed from: f */
    public static final C42606a f110760f = new C42606a(null);

    /* renamed from: a */
    public final Boolean f110761a;

    /* renamed from: b */
    public final String f110762b;

    /* renamed from: c */
    public final AVMusic f110763c;

    /* renamed from: d */
    public final String f110764d;

    /* renamed from: e */
    public final boolean f110765e;

    /* renamed from: com.ss.android.ugc.aweme.toolsport.a.d$a */
    public static final class C42606a {
        private C42606a() {
        }

        public /* synthetic */ C42606a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42605d m135392a(Boolean bool, String str, AVMusic aVMusic, String str2) {
            C42605d dVar = new C42605d(bool, str, aVMusic, str2, false, 16, null);
            return dVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42605d) {
                C42605d dVar = (C42605d) obj;
                if (C7573i.m23585a((Object) this.f110761a, (Object) dVar.f110761a) && C7573i.m23585a((Object) this.f110762b, (Object) dVar.f110762b) && C7573i.m23585a((Object) this.f110763c, (Object) dVar.f110763c) && C7573i.m23585a((Object) this.f110764d, (Object) dVar.f110764d)) {
                    if (this.f110765e == dVar.f110765e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.f110761a;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f110762b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        AVMusic aVMusic = this.f110763c;
        int hashCode3 = (hashCode2 + (aVMusic != null ? aVMusic.hashCode() : 0)) * 31;
        String str2 = this.f110764d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f110765e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicResultBean(isCancelCurrentMusic=");
        sb.append(this.f110761a);
        sb.append(", musicOrigin=");
        sb.append(this.f110762b);
        sb.append(", music=");
        sb.append(this.f110763c);
        sb.append(", musicLocalPath=");
        sb.append(this.f110764d);
        sb.append(", isShowTips=");
        sb.append(this.f110765e);
        sb.append(")");
        return sb.toString();
    }

    public C42605d(Boolean bool, String str, AVMusic aVMusic, String str2, boolean z) {
        this.f110761a = bool;
        this.f110762b = str;
        this.f110763c = aVMusic;
        this.f110764d = str2;
        this.f110765e = z;
    }

    public /* synthetic */ C42605d(Boolean bool, String str, AVMusic aVMusic, String str2, boolean z, int i, C7571f fVar) {
        this(bool, str, aVMusic, str2, true);
    }
}
