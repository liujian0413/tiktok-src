package com.p280ss.android.ugc.aweme.property;

import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

@C7193k(mo18671a = "xiaenlong", mo18672b = "查看内测工具", mo18673c = "1设计师自测  2待测试  3测试中 4测试不通过 5测试通过, 多选按照逗号分隔, 比如 1,3,5", mo18674d = "2019/10/15", mo18675e = "https://bytedance.feishu.cn/space/doc/doccnu41nvobXiOyUG7A77ZWXfe")
/* renamed from: com.ss.android.ugc.aweme.property.l */
public final class C36975l implements C36952a {

    /* renamed from: a */
    public static final C36975l f96877a = new C36975l();

    /* renamed from: b */
    private static final String f96878b = f96878b;

    /* renamed from: c */
    private static final String f96879c = f96879c;

    /* renamed from: d */
    private static final String f96880d = f96880d;

    /* renamed from: e */
    private static final String f96881e = f96881e;

    /* renamed from: f */
    private static final String f96882f = f96882f;

    /* renamed from: g */
    private static final String f96883g = C7525m.m23492a(C7525m.m23464b((T[]) new String[]{f96878b, f96879c, f96880d, f96881e, f96882f}), ",", null, null, 0, null, null, 62, null);

    /* renamed from: h */
    private static final PropertyStore f96884h = new PropertyStore(C7285c.m22838a(C35574k.m114861b(), "combined_pref", 0));

    /* renamed from: i */
    private static final List<C36992w> f96885i = C7525m.m23464b((T[]) new C36992w[]{m118958a("全部测试状态", f96883g), m118958a("设计师自测", f96878b), m118958a("待测试", f96879c), m118958a("测试中", f96880d), m118958a("测试不通过", f96881e), m118958a("测试通过", f96882f)});

    /* renamed from: com.ss.android.ugc.aweme.property.l$a */
    static final class C36976a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f96886a;

        C36976a(String str) {
            this.f96886a = str;
            super(0);
        }

        /* renamed from: a */
        private boolean m118962a() {
            return C7573i.m23585a((Object) C36975l.f96877a.mo93402b(), (Object) this.f96886a);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m118962a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.l$b */
    static final class C36977b extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f96887a;

        C36977b(String str) {
            this.f96887a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m118963a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118963a(boolean z) {
            if (z) {
                C36975l.f96877a.mo93401a(this.f96887a);
                return;
            }
            if (C7573i.m23585a((Object) C36975l.f96877a.mo93402b(), (Object) this.f96887a)) {
                C36975l.f96877a.mo93401a("");
            }
        }
    }

    private C36975l() {
    }

    /* renamed from: a */
    public static List<C36992w> m118959a() {
        return f96885i;
    }

    public final Object defValue() {
        return "1,2,3,4,5";
    }

    public final String key() {
        return "in_house_effect_status";
    }

    public final boolean supportPersist() {
        return true;
    }

    public final PropertyType type() {
        return PropertyType.String;
    }

    /* renamed from: b */
    public final String mo93402b() {
        return f96884h.mo93366e(this);
    }

    /* renamed from: a */
    public final void mo93401a(String str) {
        f96884h.mo93360a((C36952a) this, str);
    }

    /* renamed from: a */
    private static C36992w m118958a(String str, String str2) {
        return new C36992w(str, new C36976a(str2), new C36977b(str2));
    }
}
