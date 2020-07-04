package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.c */
public final class C41918c extends C41913a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "diamond-game";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.RESOURCE;
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        String str = C39811er.f103471g;
        C7573i.m23582a((Object) str, "ShortVideoConfig2.sDiamondGameDir");
        return c.mo102928a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        if (!mo31401c().exists()) {
            return true;
        }
        C41909d dVar = new C41909d(null, null, 3, null);
        dVar.f108987a = true;
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(mo31401c());
        dVar.mo102946a();
        return true;
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
