package com.p280ss.android.ugc.aweme.storage.p1645c;

import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import java.io.File;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.storage.c.g */
public final class C41925g extends C41913a {

    /* renamed from: b */
    public static final C41926a f109000b = new C41926a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.g$a */
    public static final class C41926a {
        private C41926a() {
        }

        public /* synthetic */ C41926a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "mv-theme";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.RESOURCE;
    }

    /* renamed from: c */
    public final File mo31401c() {
        return C35574k.m114859a().mo70094i().mo102932c().mo102928a(C35574k.m114859a().mo70089d().mo90346a().mo90349b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        if (!mo31401c().exists()) {
            return true;
        }
        C41909d dVar = new C41909d(C41911c.m133283a(), null, 2, null);
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(mo31401c());
        dVar.mo102946a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final long mo102953j() {
        C41906b bVar = new C41906b(C41911c.m133283a(), null, 2, null);
        if (mo31401c().exists()) {
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102942a(mo31401c());
        }
        return bVar.f108983a + 0;
    }
}
