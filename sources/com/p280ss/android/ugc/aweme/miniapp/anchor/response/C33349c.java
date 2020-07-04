package com.p280ss.android.ugc.aweme.miniapp.anchor.response;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.model.MediumInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.response.c */
public final class C33349c extends C33348b<MediumInfo> {
    @C6593c(mo15949a = "anchor_list")

    /* renamed from: a */
    public final List<MediumInfo> f87131a;
    @C6593c(mo15949a = "total")

    /* renamed from: b */
    public int f87132b;
    @C6593c(mo15949a = "offset")

    /* renamed from: c */
    public int f87133c;
    @C6593c(mo15949a = "limit")

    /* renamed from: d */
    public int f87134d;

    /* renamed from: c */
    public final int mo85513c() {
        return this.f87133c;
    }

    /* renamed from: a */
    public final List<MediumInfo> mo85511a() {
        return m107887d();
    }

    /* renamed from: d */
    private List<MediumInfo> m107887d() {
        List<MediumInfo> list = this.f87131a;
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }

    /* renamed from: b */
    public final boolean mo85512b() {
        if (m107887d().size() < this.f87132b) {
            return true;
        }
        return false;
    }
}
