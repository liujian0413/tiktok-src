package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.share.C37968ag;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ao */
final class C23209ao implements C37968ag {

    /* renamed from: a */
    private Context f61193a;

    /* renamed from: b */
    private Keva f61194b = Keva.getRepoFromSp(this.f61193a, "ReuseStickerUpdateSP", 0);

    /* renamed from: b */
    public final void mo60402b(int i) {
        this.f61194b.storeInt("version_code", i);
    }

    /* renamed from: a */
    public final int mo60399a(int i) {
        return this.f61194b.getInt("version_code", 0);
    }

    /* renamed from: b */
    public final void mo60403b(long j) {
        this.f61194b.storeLong("time", j);
    }

    public C23209ao(Context context) {
        this.f61193a = context;
    }

    /* renamed from: a */
    public final long mo60400a(long j) {
        return this.f61194b.getLong("time", 0);
    }

    /* renamed from: b */
    public final void mo60404b(String str) {
        this.f61194b.storeString("eid", str);
    }

    /* renamed from: a */
    public final String mo60401a(String str) {
        return this.f61194b.getString("eid", str);
    }
}
