package com.p280ss.android.ugc.trill.share.base;

import com.bytedance.storage.C12918a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;

/* renamed from: com.ss.android.ugc.trill.share.base.h */
public final class C45103h implements C12918a {

    /* renamed from: a */
    private final String f115931a = C41564p.m132360a(C38159c.m121910a());

    /* renamed from: a */
    public final String mo31399a() {
        return "CACHE";
    }

    /* renamed from: b */
    public final boolean mo31400b() {
        C7276d.m22822e(this.f115931a);
        return true;
    }

    /* renamed from: c */
    public final File mo31401c() {
        return new File(this.f115931a);
    }

    /* renamed from: d */
    public final long mo31402d() {
        return C7276d.m22817d(this.f115931a);
    }
}
