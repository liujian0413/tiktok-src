package com.p280ss.android.ugc.aweme.favorites.p1210a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.a.k */
public final class C27708k {
    @C6593c(mo15949a = "sticker_list")

    /* renamed from: a */
    public List<NewFaceStickerBean> f73051a;
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public int f73052b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public int f73053c;

    /* renamed from: a */
    public final boolean mo71168a() {
        if (this.f73053c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71167a(boolean z) {
        this.f73053c = z ? 1 : 0;
    }
}
