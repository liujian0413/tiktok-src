package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.retrofit2.C12467c.C12468a;
import com.bytedance.retrofit2.C12475f.C12476a;
import com.bytedance.retrofit2.p638c.C12469a;
import java.util.List;

/* renamed from: com.bytedance.ies.ugc.aweme.network.b */
final class C10941b implements C10942c {

    /* renamed from: a */
    String f29605a;

    /* renamed from: b */
    boolean f29606b;

    /* renamed from: c */
    boolean f29607c = true;

    /* renamed from: d */
    boolean f29608d = true;

    /* renamed from: e */
    List<C12469a> f29609e = RetrofitFactory.allCommonInterceptor(null);

    /* renamed from: f */
    List<C12476a> f29610f = RetrofitFactory.allCommonConvertFactories();

    /* renamed from: g */
    List<C12468a> f29611g = RetrofitFactory.allCommonCallAdapters();

    /* renamed from: a */
    public final C10943d mo26430a() {
        return new C10966k(this);
    }

    public final int hashCode() {
        return (((((this.f29605a.hashCode() * 31) + (this.f29606b ? 1 : 0)) * 31) + (this.f29607c ? 1 : 0)) * 31) + (this.f29608d ? 1 : 0);
    }

    /* renamed from: a */
    public final C10942c mo26429a(boolean z) {
        this.f29606b = true;
        return this;
    }

    /* renamed from: b */
    public final C10942c mo26431b(boolean z) {
        this.f29607c = false;
        return this;
    }

    /* renamed from: c */
    public final C10942c mo26432c(boolean z) {
        this.f29608d = false;
        return this;
    }

    C10941b(String str) {
        this.f29605a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10941b bVar = (C10941b) obj;
        if (this.f29606b == bVar.f29606b && this.f29607c == bVar.f29607c && this.f29608d == bVar.f29608d) {
            return this.f29605a.equals(bVar.f29605a);
        }
        return false;
    }
}
