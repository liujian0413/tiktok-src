package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.profile.C35816h;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ag */
final class C23201ag implements C35816h {

    /* renamed from: a */
    private Context f61177a;

    /* renamed from: b */
    private Keva f61178b = Keva.getRepoFromSp(this.f61177a, "PrivateAlbumSp", 0);

    /* renamed from: d */
    public final void mo60377d(boolean z) {
        this.f61178b.storeBoolean("show_private_album_focus", z);
    }

    /* renamed from: a */
    public final boolean mo60374a(boolean z) {
        return this.f61178b.getBoolean("has_show_private_album_guide", false);
    }

    /* renamed from: b */
    public final void mo60375b(boolean z) {
        this.f61178b.storeBoolean("has_show_private_album_guide", true);
    }

    /* renamed from: c */
    public final boolean mo60376c(boolean z) {
        return this.f61178b.getBoolean("show_private_album_focus", false);
    }

    public C23201ag(Context context) {
        this.f61177a = context;
    }
}
