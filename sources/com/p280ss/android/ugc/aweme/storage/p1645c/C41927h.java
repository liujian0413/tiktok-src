package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import com.p280ss.android.ugc.p1716b.C43659c;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.h */
public final class C41927h extends C41913a {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "music-cache";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.CACHE;
    }

    /* renamed from: c */
    public final File mo31401c() {
        C43659c a = C43659c.m138324a();
        C7573i.m23582a((Object) a, "MusicProviderConfig.getInstance()");
        String c = a.mo105615c();
        C41940c c2 = C35574k.m114859a().mo70094i().mo102932c();
        C7573i.m23582a((Object) c, "cacheDir");
        return c2.mo102928a(c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        if (!mo31401c().exists()) {
            return true;
        }
        C41909d dVar = new C41909d(null, null, 3, null);
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
