package com.p280ss.android.ugc.aweme.compliance.p1149a;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.compliance.model.ComplianceSetting;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.compliance.a.a */
public final class C25785a {

    /* renamed from: a */
    public static final C25786a f68191a = new C25786a(null);

    /* renamed from: b */
    private ComplianceSetting f68192b;

    /* renamed from: c */
    private final Keva f68193c;

    /* renamed from: d */
    private int f68194d;

    /* renamed from: e */
    private ComplianceSetting f68195e;

    /* renamed from: f */
    private int f68196f;

    /* renamed from: com.ss.android.ugc.aweme.compliance.a.a$a */
    public static final class C25786a {
        private C25786a() {
        }

        public /* synthetic */ C25786a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: e */
    private void m84744e() {
        this.f68193c.clear();
    }

    /* renamed from: a */
    public final int mo66969a() {
        return this.f68193c.getInt("do_not_sell_data", 0);
    }

    /* renamed from: b */
    public final ComplianceSetting mo66972b() {
        if (this.f68195e == null) {
            return m84743d();
        }
        return this.f68195e;
    }

    /* renamed from: c */
    public final int mo66974c() {
        return this.f68193c.getInt("vpa_content_choice", 0);
    }

    public C25785a() {
        Keva repo = Keva.getRepo("compliance_setting");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f68193c = repo;
    }

    /* renamed from: d */
    private final ComplianceSetting m84743d() {
        if (this.f68192b != null) {
            return this.f68192b;
        }
        String string = this.f68193c.getString("cached_setting", "");
        C7573i.m23582a((Object) string, "keva.getString(CACHED_SETTING, \"\")");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.f68192b = (ComplianceSetting) new C6600e().mo15974a(string, ComplianceSetting.class);
            } catch (Exception unused) {
            }
        }
        return this.f68192b;
    }

    /* renamed from: a */
    public final void mo66971a(ComplianceSetting complianceSetting) {
        this.f68195e = complianceSetting;
        m84742b(complianceSetting);
    }

    /* renamed from: b */
    private final void m84742b(ComplianceSetting complianceSetting) {
        this.f68192b = complianceSetting;
        if (complianceSetting == null) {
            m84744e();
        } else {
            this.f68193c.storeString("cached_setting", new C6600e().mo15979b((Object) complianceSetting));
        }
    }

    /* renamed from: a */
    public final void mo66970a(int i) {
        this.f68194d = i;
        this.f68193c.storeInt("do_not_sell_data", i);
    }

    /* renamed from: b */
    public final void mo66973b(int i) {
        this.f68196f = i;
        this.f68193c.storeInt("vpa_content_choice", this.f68196f);
    }
}
