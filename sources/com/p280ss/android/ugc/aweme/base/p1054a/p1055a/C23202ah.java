package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.profile.C36089t;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ah */
final class C23202ah implements C36089t {

    /* renamed from: a */
    private Context f61179a;

    /* renamed from: b */
    private SharedPreferences f61180b = C7285c.m22838a(this.f61179a, "ProfilePreferences", 0);

    /* renamed from: a */
    public final void mo60378a(int i) {
        Editor edit = this.f61180b.edit();
        edit.putInt("last_upload_account_num", i);
        edit.apply();
    }

    /* renamed from: b */
    public final int mo60382b(int i) {
        return this.f61180b.getInt("last_upload_account_num", 0);
    }

    public C23202ah(Context context) {
        this.f61179a = context;
    }

    /* renamed from: a */
    public final void mo60379a(long j) {
        Editor edit = this.f61180b.edit();
        edit.putLong("last_upload_account_num_time", j);
        edit.apply();
    }

    /* renamed from: b */
    public final long mo60383b(long j) {
        return this.f61180b.getLong("last_upload_account_num_time", 0);
    }

    /* renamed from: a */
    public final void mo60380a(String str) {
        Editor edit = this.f61180b.edit();
        edit.putString("profile_cache_post_list", str);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo60384b(boolean z) {
        return this.f61180b.getBoolean("first_open_slide_setting_for_multi_account", true);
    }

    /* renamed from: a */
    public final void mo60381a(boolean z) {
        Editor edit = this.f61180b.edit();
        edit.putBoolean("first_open_slide_setting_for_multi_account", false);
        edit.apply();
    }
}
