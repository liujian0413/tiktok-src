package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15550e;

final class ayq implements azt {

    /* renamed from: b */
    private static final ayz f41237b = new ayr();

    /* renamed from: a */
    private final ayz f41238a;

    public ayq() {
        this(new ays(axt.m47691a(), m47795a()));
    }

    private ayq(ayz ayz) {
        this.f41238a = (ayz) axw.m47745a(ayz, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> azs<T> mo40331a(Class<T> cls) {
        azu.m47993a(cls);
        ayy b = this.f41238a.mo40280b(cls);
        if (b.mo40341b()) {
            if (axu.class.isAssignableFrom(cls)) {
                return azh.m47900a(azu.m48005c(), axl.m47654a(), b.mo40342c());
            }
            return azh.m47900a(azu.m47983a(), axl.m47655b(), b.mo40342c());
        } else if (axu.class.isAssignableFrom(cls)) {
            if (m47796a(b)) {
                return azf.m47856a(cls, b, azl.m47915b(), ayl.m47776b(), azu.m48005c(), axl.m47654a(), ayx.m47821b());
            }
            return azf.m47856a(cls, b, azl.m47915b(), ayl.m47776b(), azu.m48005c(), null, ayx.m47821b());
        } else if (m47796a(b)) {
            return azf.m47856a(cls, b, azl.m47914a(), ayl.m47775a(), azu.m47983a(), axl.m47655b(), ayx.m47820a());
        } else {
            return azf.m47856a(cls, b, azl.m47914a(), ayl.m47775a(), azu.m47999b(), null, ayx.m47820a());
        }
    }

    /* renamed from: a */
    private static boolean m47796a(ayy ayy) {
        return ayy.mo40340a() == C15550e.f41206h;
    }

    /* renamed from: a */
    private static ayz m47795a() {
        try {
            return (ayz) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f41237b;
        }
    }
}
