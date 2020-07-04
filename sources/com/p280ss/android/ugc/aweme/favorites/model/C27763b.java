package com.p280ss.android.ugc.aweme.favorites.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.b */
public final class C27763b {
    @C6593c(mo15949a = "ch_list")

    /* renamed from: a */
    public List<Challenge> f73205a;
    @C6593c(mo15949a = "cursor")

    /* renamed from: b */
    public int f73206b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public int f73207c;

    /* renamed from: a */
    public final boolean mo71257a() {
        if (this.f73207c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo71256a(boolean z) {
        this.f73207c = z ? 1 : 0;
    }
}
