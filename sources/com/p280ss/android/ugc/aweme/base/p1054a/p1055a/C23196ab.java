package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ab */
final class C23196ab implements C34320a {

    /* renamed from: a */
    private Context f61167a;

    /* renamed from: b */
    private SharedPreferences f61168b = C7285c.m22838a(this.f61167a, "aweme-app", 0);

    /* renamed from: c */
    public final long mo60340c() {
        return this.f61168b.getLong("noticeGuideShownStamp", 0);
    }

    /* renamed from: d */
    public final int mo60341d() {
        return this.f61168b.getInt("notice_guide_cancel_limit", 0);
    }

    /* renamed from: e */
    public final int mo60342e() {
        return this.f61168b.getInt("notice_count_latency", 0);
    }

    /* renamed from: f */
    public final boolean mo60343f() {
        return this.f61168b.getBoolean("use_https", false);
    }

    /* renamed from: g */
    public final String mo60344g() {
        return this.f61168b.getString("privacy_reminder", "");
    }

    /* renamed from: h */
    public final boolean mo60345h() {
        return this.f61168b.getBoolean("ttregion", false);
    }

    /* renamed from: b */
    public final boolean mo60339b() {
        return this.f61168b.getBoolean("enable_shopping_user", false);
    }

    /* renamed from: a */
    public final boolean mo60337a() {
        return this.f61168b.getBoolean("enable_shopping_total", false);
    }

    /* renamed from: a */
    public final int mo60334a(int i) {
        return this.f61168b.getInt("im_can_im", 1);
    }

    /* renamed from: b */
    public final void mo60338b(int i) {
        Editor edit = this.f61168b.edit();
        edit.putInt("notice_guide_cancel_limit", i);
        edit.apply();
    }

    public C23196ab(Context context) {
        this.f61167a = context;
    }

    /* renamed from: a */
    public final void mo60335a(long j) {
        Editor edit = this.f61168b.edit();
        edit.putLong("noticeGuideShownStamp", j);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo60336a(boolean z) {
        Editor edit = this.f61168b.edit();
        edit.putBoolean("si_show_user_feed_back_point", true);
        edit.apply();
    }
}
