package com.p280ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35590t;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.dj */
public final class C43058dj {

    /* renamed from: a */
    public static final C43058dj f111656a = new C43058dj();

    /* renamed from: b */
    private static C43059a f111657b;

    /* renamed from: c */
    private static String f111658c;

    /* renamed from: com.ss.android.ugc.aweme.utils.dj$a */
    public static final class C43059a {

        /* renamed from: a */
        public final String f111659a;

        /* renamed from: b */
        public final String f111660b;

        /* renamed from: c */
        public final String f111661c;

        /* renamed from: d */
        public final long f111662d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C43059a) {
                    C43059a aVar = (C43059a) obj;
                    if (C7573i.m23585a((Object) this.f111659a, (Object) aVar.f111659a) && C7573i.m23585a((Object) this.f111660b, (Object) aVar.f111660b) && C7573i.m23585a((Object) this.f111661c, (Object) aVar.f111661c)) {
                        if (this.f111662d == aVar.f111662d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f111659a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f111660b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f111661c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            long j = this.f111662d;
            return i2 + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EffectData(creationId=");
            sb.append(this.f111659a);
            sb.append(", shootWay=");
            sb.append(this.f111660b);
            sb.append(", propId=");
            sb.append(this.f111661c);
            sb.append(", startUseTime=");
            sb.append(this.f111662d);
            sb.append(")");
            return sb.toString();
        }

        public C43059a(String str, String str2, String str3, long j) {
            this.f111659a = str;
            this.f111660b = str2;
            this.f111661c = str3;
            this.f111662d = j;
        }
    }

    private C43058dj() {
    }

    /* renamed from: a */
    public static final void m136602a() {
        Long l;
        String str;
        String str2;
        String str3;
        if (C6399b.m19944t() && f111657b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C43059a aVar = f111657b;
            if (aVar != null) {
                l = Long.valueOf(aVar.f111662d);
            } else {
                l = null;
            }
            if (l == null) {
                C7573i.m23580a();
            }
            long longValue = elapsedRealtime - l.longValue();
            C42962b bVar = C42962b.f111525a;
            String str4 = "prop_click_time";
            C22984d a = C22984d.m75611a();
            String str5 = "creation_id";
            C43059a aVar2 = f111657b;
            if (aVar2 != null) {
                str = aVar2.f111659a;
            } else {
                str = null;
            }
            C22984d a2 = a.mo59973a(str5, str);
            String str6 = "shoot_way";
            C43059a aVar3 = f111657b;
            if (aVar3 != null) {
                str2 = aVar3.f111660b;
            } else {
                str2 = null;
            }
            C22984d a3 = a2.mo59973a(str6, str2).mo59973a("enter_from", "video_shoot_page");
            String str7 = "prop_id";
            C43059a aVar4 = f111657b;
            if (aVar4 != null) {
                str3 = aVar4.f111661c;
            } else {
                str3 = null;
            }
            bVar.mo104671a(str4, a3.mo59973a(str7, str3).mo59971a("duration", longValue).f60753a);
            f111657b = null;
            f111658c = null;
        }
    }

    /* renamed from: a */
    public static final boolean m136605a(String str) {
        if (!TextUtils.equals(f111658c, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m136607c(Effect effect) {
        if (effect != null && !TextUtils.isEmpty(effect.getAdRawData())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m136603a(Effect effect) {
        String str;
        if (C6399b.m19944t() && m136607c(effect)) {
            C35590t C = C35574k.m114859a().mo70069C();
            String str2 = "camera_ad";
            String str3 = "click";
            String str4 = "sticker";
            if (effect != null) {
                str = effect.getAdRawData();
            } else {
                str = null;
            }
            C.mo83172a(str2, str3, str4, str, null);
        }
    }

    /* renamed from: b */
    public static final void m136606b(Effect effect) {
        String str;
        if (C6399b.m19944t() && m136607c(effect)) {
            C35590t C = C35574k.m114859a().mo70069C();
            String str2 = "camera_ad";
            String str3 = "show";
            String str4 = "sticker";
            if (effect != null) {
                str = effect.getAdRawData();
            } else {
                str = null;
            }
            C.mo83172a(str2, str3, str4, str, null);
        }
    }

    /* renamed from: a */
    public static final void m136604a(String str, String str2, String str3) {
        if (C6399b.m19944t()) {
            f111658c = str3;
            C43059a aVar = new C43059a(str, str2, str3, SystemClock.elapsedRealtime());
            f111657b = aVar;
        }
    }
}
