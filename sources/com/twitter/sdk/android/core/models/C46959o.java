package com.twitter.sdk.android.core.models;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.twitter.sdk.android.core.models.o */
public final class C46959o implements C46950g {
    @C6593c(mo15949a = "text", mo15950b = {"full_text"})

    /* renamed from: A */
    public final String f120419A;
    @C6593c(mo15949a = "display_text_range")

    /* renamed from: B */
    public final List<Integer> f120420B;
    @C6593c(mo15949a = "truncated")

    /* renamed from: C */
    public final boolean f120421C;
    @C6593c(mo15949a = "user")

    /* renamed from: D */
    public final User f120422D;
    @C6593c(mo15949a = "withheld_copyright")

    /* renamed from: E */
    public final boolean f120423E;
    @C6593c(mo15949a = "withheld_in_countries")

    /* renamed from: F */
    public final List<String> f120424F;
    @C6593c(mo15949a = "withheld_scope")

    /* renamed from: G */
    public final String f120425G;
    @C6593c(mo15949a = "card")

    /* renamed from: H */
    public final C46947d f120426H;
    @C6593c(mo15949a = "coordinates")

    /* renamed from: a */
    public final C46948e f120427a;
    @C6593c(mo15949a = "created_at")

    /* renamed from: b */
    public final String f120428b;
    @C6593c(mo15949a = "current_user_retweet")

    /* renamed from: c */
    public final Object f120429c;
    @C6593c(mo15949a = "entities")

    /* renamed from: d */
    public final C46961q f120430d;
    @C6593c(mo15949a = "extended_entities")

    /* renamed from: e */
    public final C46961q f120431e;
    @C6593c(mo15949a = "favorite_count")

    /* renamed from: f */
    public final Integer f120432f;
    @C6593c(mo15949a = "favorited")

    /* renamed from: g */
    public final boolean f120433g;
    @C6593c(mo15949a = "filter_level")

    /* renamed from: h */
    public final String f120434h;
    @C6593c(mo15949a = "id")

    /* renamed from: i */
    public final long f120435i;
    @C6593c(mo15949a = "id_str")

    /* renamed from: j */
    public final String f120436j;
    @C6593c(mo15949a = "in_reply_to_screen_name")

    /* renamed from: k */
    public final String f120437k;
    @C6593c(mo15949a = "in_reply_to_status_id")

    /* renamed from: l */
    public final long f120438l;
    @C6593c(mo15949a = "in_reply_to_status_id_str")

    /* renamed from: m */
    public final String f120439m;
    @C6593c(mo15949a = "in_reply_to_user_id")

    /* renamed from: n */
    public final long f120440n;
    @C6593c(mo15949a = "in_reply_to_user_id_str")

    /* renamed from: o */
    public final String f120441o;
    @C6593c(mo15949a = "lang")

    /* renamed from: p */
    public final String f120442p;
    @C6593c(mo15949a = "place")

    /* renamed from: q */
    public final C46955l f120443q;
    @C6593c(mo15949a = "possibly_sensitive")

    /* renamed from: r */
    public final boolean f120444r;
    @C6593c(mo15949a = "scopes")

    /* renamed from: s */
    public final Object f120445s;
    @C6593c(mo15949a = "quoted_status_id")

    /* renamed from: t */
    public final long f120446t;
    @C6593c(mo15949a = "quoted_status_id_str")

    /* renamed from: u */
    public final String f120447u;
    @C6593c(mo15949a = "quoted_status")

    /* renamed from: v */
    public final C46959o f120448v;
    @C6593c(mo15949a = "retweet_count")

    /* renamed from: w */
    public final int f120449w;
    @C6593c(mo15949a = "retweeted")

    /* renamed from: x */
    public final boolean f120450x;
    @C6593c(mo15949a = "retweeted_status")

    /* renamed from: y */
    public final C46959o f120451y;
    @C6593c(mo15949a = "source")

    /* renamed from: z */
    public final String f120452z;

    public final long getId() {
        return this.f120435i;
    }

    public final int hashCode() {
        return (int) this.f120435i;
    }

    private C46959o() {
        C46961q qVar = C46961q.f120487a;
        this(null, null, null, qVar, qVar, Integer.valueOf(0), false, null, 0, "0", null, 0, "0", 0, "0", null, null, false, null, 0, "0", null, 0, false, null, null, null, null, false, null, false, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C46959o)) {
            return false;
        }
        if (this.f120435i == ((C46959o) obj).f120435i) {
            return true;
        }
        return false;
    }

    public C46959o(C46948e eVar, String str, Object obj, C46961q qVar, C46961q qVar2, Integer num, boolean z, String str2, long j, String str3, String str4, long j2, String str5, long j3, String str6, String str7, C46955l lVar, boolean z2, Object obj2, long j4, String str8, C46959o oVar, int i, boolean z3, C46959o oVar2, String str9, String str10, List<Integer> list, boolean z4, User user, boolean z5, List<String> list2, String str11, C46947d dVar) {
        C46961q qVar3;
        C46961q qVar4;
        this.f120427a = eVar;
        this.f120428b = str;
        this.f120429c = obj;
        if (qVar == null) {
            qVar3 = C46961q.f120487a;
        } else {
            qVar3 = qVar;
        }
        this.f120430d = qVar3;
        if (qVar2 == null) {
            qVar4 = C46961q.f120487a;
        } else {
            qVar4 = qVar2;
        }
        this.f120431e = qVar4;
        this.f120432f = num;
        this.f120433g = z;
        this.f120434h = str2;
        this.f120435i = j;
        this.f120436j = str3;
        this.f120437k = str4;
        this.f120438l = j2;
        this.f120439m = str5;
        this.f120440n = j3;
        this.f120441o = str6;
        this.f120442p = str7;
        this.f120443q = lVar;
        this.f120444r = z2;
        this.f120445s = obj2;
        this.f120446t = j4;
        this.f120447u = str8;
        this.f120448v = oVar;
        this.f120449w = i;
        this.f120450x = z3;
        this.f120451y = oVar2;
        this.f120452z = str9;
        this.f120419A = str10;
        this.f120420B = C46954k.m146830a(list);
        this.f120421C = z4;
        this.f120422D = user;
        this.f120423E = z5;
        this.f120424F = C46954k.m146830a(list2);
        this.f120425G = str11;
        this.f120426H = dVar;
    }
}
