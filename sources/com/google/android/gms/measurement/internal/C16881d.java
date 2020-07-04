package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.measurement.internal.d */
final class C16881d {

    /* renamed from: a */
    final String f47190a;

    /* renamed from: b */
    final String f47191b;

    /* renamed from: c */
    final long f47192c;

    /* renamed from: d */
    final long f47193d;

    /* renamed from: e */
    final long f47194e;

    /* renamed from: f */
    final long f47195f;

    /* renamed from: g */
    final Long f47196g;

    /* renamed from: h */
    final Long f47197h;

    /* renamed from: i */
    final Long f47198i;

    /* renamed from: j */
    final Boolean f47199j;

    C16881d(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        long j5 = j;
        long j6 = j2;
        long j7 = j4;
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        boolean z = false;
        C15267r.m44394b(j5 >= 0);
        C15267r.m44394b(j6 >= 0);
        if (j7 >= 0) {
            z = true;
        }
        C15267r.m44394b(z);
        this.f47190a = str;
        this.f47191b = str2;
        this.f47192c = j5;
        this.f47193d = j6;
        this.f47194e = j3;
        this.f47195f = j7;
        this.f47196g = l;
        this.f47197h = l2;
        this.f47198i = l3;
        this.f47199j = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16881d mo43791a(long j) {
        C16881d dVar = new C16881d(this.f47190a, this.f47191b, this.f47192c, this.f47193d, j, this.f47195f, this.f47196g, this.f47197h, this.f47198i, this.f47199j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16881d mo43792a(long j, long j2) {
        C16881d dVar = new C16881d(this.f47190a, this.f47191b, this.f47192c, this.f47193d, this.f47194e, j, Long.valueOf(j2), this.f47197h, this.f47198i, this.f47199j);
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16881d mo43793a(Long l, Long l2, Boolean bool) {
        C16881d dVar = new C16881d(this.f47190a, this.f47191b, this.f47192c, this.f47193d, this.f47194e, this.f47195f, this.f47196g, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return dVar;
    }
}
