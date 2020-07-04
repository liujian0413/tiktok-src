package com.p280ss.android.ugc.aweme.p759ac;

import com.bytedance.retrofit2.C12520r;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ac.b */
public final class C15459b extends C12520r {

    /* renamed from: q */
    public final HashMap<String, Long> f39777q = new HashMap<>();

    /* renamed from: r */
    public final HashMap<String, Long> f39778r = new HashMap<>();

    /* renamed from: s */
    public final HashMap<String, Long> f39779s = new HashMap<>();

    /* renamed from: t */
    public long f39780t;

    /* renamed from: u */
    public long f39781u;

    /* renamed from: v */
    public String f39782v = "";

    /* renamed from: w */
    public long f39783w;

    /* renamed from: x */
    public long f39784x;

    /* renamed from: y */
    public long f39785y;

    /* renamed from: z */
    public long f39786z;

    /* renamed from: a */
    public final void mo39011a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f39782v = str;
    }

    public C15459b(long j, long j2) {
        super(j, j2);
    }

    /* renamed from: b */
    public final void mo39013b(String str, long j) {
        C7573i.m23587b(str, "name");
        this.f39778r.put(str, Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo39014c(String str, long j) {
        C7573i.m23587b(str, "name");
        this.f39779s.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo39012a(String str, long j) {
        C7573i.m23587b(str, "name");
        Long l = (Long) this.f39777q.get(str);
        if (l == null) {
            l = Long.valueOf(0);
        }
        C7573i.m23582a((Object) l, "interceptorDurations.get(name) ?: 0");
        this.f39777q.put(str, Long.valueOf(j + l.longValue()));
    }
}
