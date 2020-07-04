package com.p280ss.android.ugc.aweme.p1685ug.praise;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.c */
public final class C42736c {

    /* renamed from: g */
    public static final C42737a f111039g = new C42737a(null);

    /* renamed from: a */
    public long f111040a;

    /* renamed from: b */
    public boolean f111041b;

    /* renamed from: c */
    public boolean f111042c;

    /* renamed from: d */
    public String f111043d;

    /* renamed from: e */
    public long f111044e;

    /* renamed from: f */
    public boolean f111045f;

    /* renamed from: h */
    private final Keva f111046h;

    /* renamed from: i */
    private final String f111047i;

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.c$a */
    public static final class C42737a {
        private C42737a() {
        }

        public /* synthetic */ C42737a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo104341a() {
        this.f111046h.clear();
    }

    /* renamed from: c */
    public final void mo104347c(boolean z) {
        this.f111045f = z;
        this.f111046h.storeBoolean("key_debug_open", z);
    }

    /* renamed from: a */
    public final void mo104342a(long j) {
        this.f111040a = j;
        Keva keva = this.f111046h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111047i);
        sb.append("key_last_dialog_show_time");
        keva.storeLong(sb.toString(), j);
    }

    /* renamed from: b */
    public final void mo104345b(long j) {
        if (this.f111044e == 0) {
            this.f111044e = j;
            this.f111046h.storeLong("key_app_first_open_time", j);
        }
    }

    /* renamed from: a */
    public final void mo104343a(String str) {
        C7573i.m23587b(str, "value");
        this.f111043d = str;
        Keva keva = this.f111046h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111047i);
        sb.append("key_last_show_version");
        keva.storeString(sb.toString(), str);
    }

    /* renamed from: b */
    public final void mo104346b(boolean z) {
        this.f111042c = z;
        Keva keva = this.f111046h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111047i);
        sb.append("key_is_clicked_submit");
        keva.storeBoolean(sb.toString(), z);
    }

    /* renamed from: a */
    public final void mo104344a(boolean z) {
        this.f111041b = z;
        Keva keva = this.f111046h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111047i);
        sb.append("key_is_clicked_feedback");
        keva.storeBoolean(sb.toString(), z);
    }

    public C42736c(boolean z) {
        String str;
        Keva repo = Keva.getRepo("praise_keva");
        C7573i.m23582a((Object) repo, "Keva.getRepo(REPO_NAME)");
        this.f111046h = repo;
        if (z) {
            str = "ACTIVE";
        } else {
            str = "LIKE";
        }
        this.f111047i = str;
        this.f111043d = "";
        mo104345b(this.f111046h.getLong("key_app_first_open_time", 0));
        Keva keva = this.f111046h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f111047i);
        sb.append("key_last_dialog_show_time");
        mo104342a(keva.getLong(sb.toString(), 0));
        Keva keva2 = this.f111046h;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f111047i);
        sb2.append("key_is_clicked_feedback");
        mo104344a(keva2.getBoolean(sb2.toString(), false));
        Keva keva3 = this.f111046h;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f111047i);
        sb3.append("key_is_clicked_submit");
        mo104346b(keva3.getBoolean(sb3.toString(), false));
        Keva keva4 = this.f111046h;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f111047i);
        sb4.append("key_last_show_version");
        String string = keva4.getString(sb4.toString(), "");
        C7573i.m23582a((Object) string, "keva.getString(keyPrefix…EY_LAST_SHOW_VERSION, \"\")");
        mo104343a(string);
        mo104347c(this.f111046h.getBoolean("key_debug_open", false));
    }
}
