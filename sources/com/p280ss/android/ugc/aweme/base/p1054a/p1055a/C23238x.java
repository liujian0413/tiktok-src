package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.x */
final class C23238x implements C32961dd {

    /* renamed from: a */
    private Context f61240a;

    /* renamed from: b */
    private SharedPreferences f61241b = C7285c.m22838a(this.f61240a, "MainTabPreferences", 0);

    /* renamed from: c */
    public final boolean mo60464c() {
        return this.f61241b.getBoolean("secondTabLastLandFollowTab", false);
    }

    /* renamed from: a */
    public final boolean mo60457a() {
        return this.f61241b.getBoolean("hasReadPhoneStateRequested", false);
    }

    /* renamed from: b */
    public final boolean mo60461b() {
        return this.f61241b.getBoolean("hasAccessLocationRequested", false);
    }

    /* renamed from: a */
    public final long mo60454a(long j) {
        return this.f61241b.getLong("cleanEffectsLastTime", 0);
    }

    /* renamed from: b */
    public final void mo60458b(long j) {
        Editor edit = this.f61241b.edit();
        edit.putLong("cleanEffectsLastTime", j);
        edit.apply();
    }

    /* renamed from: c */
    public final String mo60462c(String str) {
        return this.f61241b.getString("activityLinkFirstLaunchTime", str);
    }

    /* renamed from: d */
    public final void mo60465d(String str) {
        Editor edit = this.f61241b.edit();
        edit.putString("activityLinkFirstLaunchTime", str);
        edit.apply();
    }

    /* renamed from: e */
    public final String mo60467e(String str) {
        return this.f61241b.getString("hasClickActivityDot", str);
    }

    /* renamed from: f */
    public final void mo60469f(String str) {
        Editor edit = this.f61241b.edit();
        edit.putString("hasClickActivityDot", str);
        edit.apply();
    }

    /* renamed from: g */
    public final void mo60471g(String str) {
        Editor edit = this.f61241b.edit();
        edit.putString("unloginContentLanguage", str);
        edit.apply();
    }

    /* renamed from: h */
    public final String mo60473h(String str) {
        return this.f61241b.getString("unloginContentLanguage", str);
    }

    /* renamed from: i */
    public final void mo60475i(String str) {
        Editor edit = this.f61241b.edit();
        edit.putString("consumedFeedsCountForLocationPop", str);
        edit.apply();
    }

    /* renamed from: j */
    public final String mo60477j(String str) {
        return this.f61241b.getString("consumedFeedsCountForLocationPop", str);
    }

    /* renamed from: k */
    public final void mo60479k(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("secondTabLastLandFollowTab", z);
        edit.apply();
    }

    /* renamed from: l */
    public final void mo60480l(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasShowUnloginContentLanguageDialog", z);
        edit.apply();
    }

    /* renamed from: m */
    public final boolean mo60481m(boolean z) {
        return this.f61241b.getBoolean("hasShowUnloginContentLanguageDialog", false);
    }

    /* renamed from: n */
    public final boolean mo60482n(boolean z) {
        return this.f61241b.getBoolean("isCheckContentLanguageDialogWhenFirstLaunch", false);
    }

    /* renamed from: o */
    public final void mo60483o(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("isCheckContentLanguageDialogWhenFirstLaunch", z);
        edit.apply();
    }

    /* renamed from: p */
    public final void mo60484p(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasLocationPopupShown", z);
        edit.apply();
    }

    /* renamed from: q */
    public final boolean mo60485q(boolean z) {
        return this.f61241b.getBoolean("hasLocationPopupShown", false);
    }

    public C23238x(Context context) {
        this.f61240a = context;
    }

    /* renamed from: a */
    public final String mo60455a(String str) {
        return this.f61241b.getString("hasClickActivityLink", str);
    }

    /* renamed from: b */
    public final void mo60459b(String str) {
        Editor edit = this.f61241b.edit();
        edit.putString("hasClickActivityLink", str);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo60463c(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasClickSearch", true);
        edit.apply();
    }

    /* renamed from: d */
    public final boolean mo60466d(boolean z) {
        return this.f61241b.getBoolean("shouldCleanEffectsAtFirstLaunch", true);
    }

    /* renamed from: e */
    public final void mo60468e(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("shouldCleanEffectsAtFirstLaunch", false);
        edit.apply();
    }

    /* renamed from: f */
    public final boolean mo60470f(boolean z) {
        return this.f61241b.getBoolean("shouldShowPrivacyPolicyDialog", true);
    }

    /* renamed from: g */
    public final boolean mo60472g(boolean z) {
        return this.f61241b.getBoolean("shouldShowNewFollowLocationGuide", true);
    }

    /* renamed from: h */
    public final void mo60474h(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("shouldShowNewFollowLocationGuide", false);
        edit.apply();
    }

    /* renamed from: i */
    public final boolean mo60476i(boolean z) {
        return this.f61241b.getBoolean("hasClosedActivityLink", false);
    }

    /* renamed from: j */
    public final void mo60478j(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasClosedActivityLink", z);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo60456a(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasReadPhoneStateRequested", true);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo60460b(boolean z) {
        Editor edit = this.f61241b.edit();
        edit.putBoolean("hasAccessLocationRequested", true);
        edit.apply();
    }
}
