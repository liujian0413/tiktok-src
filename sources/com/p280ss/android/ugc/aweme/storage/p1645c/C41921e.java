package com.p280ss.android.ugc.aweme.storage.p1645c;

import android.app.Application;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39441a;
import com.p280ss.android.ugc.aweme.storage.C41891a;
import com.p280ss.android.ugc.aweme.storage.constants.StorageType;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41909d;
import com.p280ss.android.ugc.aweme.storage.p1647e.C41940c;
import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.c.e */
public final class C41921e extends C41913a {

    /* renamed from: b */
    public static final C41922a f108998b = new C41922a(null);

    /* renamed from: com.ss.android.ugc.aweme.storage.c.e$a */
    public static final class C41922a {
        private C41922a() {
        }

        public /* synthetic */ C41922a(C7571f fVar) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final String mo102948e() {
        return "effect";
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final StorageType mo102949f() {
        return StorageType.RESOURCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo102950g() {
        super.mo102950g();
        C41891a.m133229a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo102952i() {
        super.mo102952i();
        C41891a.m133229a(false);
    }

    /* renamed from: c */
    public final File mo31401c() {
        C41940c c = C35574k.m114859a().mo70094i().mo102932c();
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        File filesDir = b.getFilesDir();
        C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().filesDir");
        return c.mo102927a(filesDir, "effect");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo102951h() {
        if (!mo31401c().exists()) {
            return true;
        }
        C41909d dVar = new C41909d(C41911c.m133283a(), null, 2, null);
        dVar.f108987a = true;
        C41903a aVar = new C41903a();
        aVar.mo102941a((C41908c) dVar);
        aVar.mo102942a(mo31401c());
        dVar.mo102946a();
        C39441a.m125976a().mo98274b();
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
