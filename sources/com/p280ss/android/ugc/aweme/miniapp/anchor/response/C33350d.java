package com.p280ss.android.ugc.aweme.miniapp.anchor.response;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.response.d */
public final class C33350d extends C33348b<MediumInfo> {
    @C6593c(mo15949a = "search_list")

    /* renamed from: a */
    public final List<MediumInfo> f87135a;
    @C6593c(mo15949a = "offset")

    /* renamed from: b */
    public int f87136b;
    @C6593c(mo15949a = "has_more")

    /* renamed from: c */
    public boolean f87137c;
    @C6593c(mo15949a = "limit")

    /* renamed from: d */
    public int f87138d;

    /* renamed from: b */
    public final boolean mo85512b() {
        return this.f87137c;
    }

    /* renamed from: c */
    public final int mo85513c() {
        return this.f87136b;
    }

    /* renamed from: a */
    public final List<MediumInfo> mo85511a() {
        return m107891d();
    }

    /* renamed from: d */
    private List<MediumInfo> m107891d() {
        List<MediumInfo> list = this.f87135a;
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }
}
