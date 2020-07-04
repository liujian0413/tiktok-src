package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24440a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.n */
final class C23228n implements C24440a {

    /* renamed from: a */
    private Context f61219a;

    /* renamed from: b */
    private SharedPreferences f61220b = C7285c.m22838a(this.f61219a, "CommercePreferences", 0);

    /* renamed from: c */
    private Keva f61221c = Keva.getRepoFromSp(this.f61219a, "CommercePreferences", 0);

    /* renamed from: a */
    public final String mo60415a(String str) {
        return this.f61221c.getString("lastOrderTimeMap", str);
    }

    /* renamed from: c */
    public final String mo60419c(String str) {
        return this.f61221c.getString("isOrderInfoUpdateInProfileMap", str);
    }

    /* renamed from: e */
    public final String mo60423e(String str) {
        return this.f61221c.getString("isOrderInfoUpdateInSlideSettingMap", str);
    }

    public C23228n(Context context) {
        this.f61219a = context;
    }

    /* renamed from: a */
    public final boolean mo60416a(boolean z) {
        return this.f61221c.getBoolean("shouldShowDiscoveryRankAutoScroll", true);
    }

    /* renamed from: b */
    public final void mo60417b(String str) {
        String str2 = "lastOrderTimeMap";
        Editor edit = this.f61220b.edit();
        edit.putString(str2, str);
        edit.apply();
        this.f61221c.storeString(str2, str);
    }

    /* renamed from: c */
    public final boolean mo60420c(boolean z) {
        return this.f61221c.getBoolean("isFirstShowCommonOrderTip", true);
    }

    /* renamed from: d */
    public final void mo60421d(String str) {
        String str2 = "isOrderInfoUpdateInProfileMap";
        Editor edit = this.f61220b.edit();
        edit.putString(str2, str);
        edit.apply();
        this.f61221c.storeString(str2, str);
    }

    /* renamed from: f */
    public final void mo60424f(String str) {
        String str2 = "isOrderInfoUpdateInSlideSettingMap";
        Editor edit = this.f61220b.edit();
        edit.putString(str2, str);
        edit.apply();
        this.f61221c.storeString(str2, str);
    }

    /* renamed from: b */
    public final void mo60418b(boolean z) {
        String str = "shouldShowDiscoveryRankAutoScroll";
        Editor edit = this.f61220b.edit();
        edit.putBoolean(str, false);
        edit.apply();
        this.f61221c.storeBoolean(str, false);
    }

    /* renamed from: d */
    public final void mo60422d(boolean z) {
        String str = "isFirstShowCommonOrderTip";
        Editor edit = this.f61220b.edit();
        edit.putBoolean(str, false);
        edit.apply();
        this.f61221c.storeBoolean(str, false);
    }
}
