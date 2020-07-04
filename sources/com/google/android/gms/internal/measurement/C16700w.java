package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15267r;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C16700w {

    /* renamed from: a */
    public final long f46657a = 0;

    /* renamed from: b */
    public final String f46658b;

    /* renamed from: c */
    public final String f46659c;

    /* renamed from: d */
    public final boolean f46660d;

    /* renamed from: e */
    public long f46661e;

    /* renamed from: f */
    public final Map<String, String> f46662f;

    public C16700w(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        this.f46658b = str;
        this.f46659c = str2;
        this.f46660d = z;
        this.f46661e = j2;
        if (map != null) {
            this.f46662f = new HashMap(map);
        } else {
            this.f46662f = Collections.emptyMap();
        }
    }
}
