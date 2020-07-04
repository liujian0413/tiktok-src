package com.p280ss.android.ugc.aweme.money.growth;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.money.growth.b */
public final class C33631b {

    /* renamed from: d */
    public static final C33632a f87770d = new C33632a(null);

    /* renamed from: a */
    public int f87771a;

    /* renamed from: b */
    public boolean f87772b;

    /* renamed from: c */
    public String f87773c = "";

    /* renamed from: e */
    private final Keva f87774e;

    /* renamed from: com.ss.android.ugc.aweme.money.growth.b$a */
    public static final class C33632a {
        private C33632a() {
        }

        public /* synthetic */ C33632a(C7571f fVar) {
            this();
        }
    }

    public C33631b() {
        Keva repo = Keva.getRepo("money_growth");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f87774e = repo;
        mo86011a(this.f87774e.getInt("deepLinkDialogShown", 0));
        mo86013a(this.f87774e.getBoolean("has_showed_pop", false));
        String string = this.f87774e.getString("activity_id_for_deeplink", "");
        if (string != null) {
            mo86012a(string);
        }
    }

    /* renamed from: a */
    public final void mo86012a(String str) {
        C7573i.m23587b(str, "value");
        this.f87773c = str;
        this.f87774e.storeString("activity_id_for_deeplink", str);
    }

    /* renamed from: a */
    public final void mo86011a(int i) {
        this.f87771a = i;
        this.f87774e.storeInt("deepLinkDialogShown", i);
        if (i == 2) {
            this.f87774e.storeString("activity_id_for_deeplink", "");
        }
    }

    /* renamed from: a */
    public final void mo86013a(boolean z) {
        this.f87772b = z;
        this.f87774e.storeBoolean("has_showed_pop", z);
    }
}
