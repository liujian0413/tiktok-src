package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.af */
final class C23200af implements C35622l {

    /* renamed from: a */
    private Context f61175a;

    /* renamed from: b */
    private SharedPreferences f61176b = C7285c.m22838a(this.f61175a, "VideoRecord", 0);

    /* renamed from: b */
    public final String mo60361b() {
        return this.f61176b.getString("uploadRecoverPath", "");
    }

    /* renamed from: a */
    public final int mo60357a() {
        return this.f61176b.getInt("resources_version", 0);
    }

    /* renamed from: a */
    public final float mo60356a(float f) {
        return this.f61176b.getFloat("ulikebeauty_sharp_default", -1.0f);
    }

    /* renamed from: c */
    public final int mo60365c(int i) {
        return this.f61176b.getInt("hdr_resource_model_version", -1);
    }

    /* renamed from: d */
    public final void mo60368d(int i) {
        Editor edit = this.f61176b.edit();
        edit.putInt("count_down_mode", i);
        edit.apply();
    }

    /* renamed from: e */
    public final int mo60370e(int i) {
        return this.f61176b.getInt("count_down_mode", 3);
    }

    /* renamed from: f */
    public final void mo60372f(boolean z) {
        Editor edit = this.f61176b.edit();
        edit.putBoolean("has_click_blessing_tag", true);
        edit.apply();
    }

    /* renamed from: g */
    public final boolean mo60373g(boolean z) {
        return this.f61176b.getBoolean("has_click_blessing_tag", false);
    }

    public C23200af(Context context) {
        this.f61175a = context;
    }

    /* renamed from: b */
    public final String mo60362b(String str) {
        return this.f61176b.getString("ulikebeauty_download_data", str);
    }

    /* renamed from: c */
    public final void mo60366c(String str) {
        Editor edit = this.f61176b.edit();
        edit.putString("ulikebeauty_download_data", str);
        edit.apply();
    }

    /* renamed from: d */
    public final boolean mo60369d(boolean z) {
        return this.f61176b.getBoolean("is_first_enter_record_page", true);
    }

    /* renamed from: e */
    public final void mo60371e(boolean z) {
        Editor edit = this.f61176b.edit();
        edit.putBoolean("is_first_enter_record_page", false);
        edit.apply();
    }

    /* renamed from: a */
    public final String mo60358a(String str) {
        Editor edit = this.f61176b.edit();
        edit.putString("uploadRecoverPath", str);
        edit.apply();
        return "";
    }

    /* renamed from: b */
    public final void mo60363b(int i) {
        Editor edit = this.f61176b.edit();
        edit.putInt("hdr_resource_model_version", 2);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo60367c(boolean z) {
        Editor edit = this.f61176b.edit();
        edit.putBoolean("is_duration_mode_manually_change", true);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo60359a(int i) {
        Editor edit = this.f61176b.edit();
        edit.putInt("resources_version", i);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo60364b(boolean z) {
        return this.f61176b.getBoolean("is_duration_mode_manually_change", false);
    }

    /* renamed from: a */
    public final void mo60360a(boolean z) {
        Editor edit = this.f61176b.edit();
        edit.putBoolean("count_down_new_tag", false);
        edit.apply();
    }
}
