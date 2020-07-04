package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1601c.C40517g;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.storage.c.i */
public final class C41928i extends C41913a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "person-effect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.RESOURCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        C40517g.m129536c();
        return true;
    }

    /* renamed from: c */
    public final File mo31401c() {
        return C35574k.m114859a().mo70094i().mo102932c().mo102928a(C40517g.m129522a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        C41906b bVar = new C41906b(null, null, 3, null);
        if (mo31401c().exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(mo31401c());
        }
        return bVar.f108983a + 0;
    }
}
