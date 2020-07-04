package com.p280ss.android.ugc.aweme.shortvideo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PermissionSettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cz */
public final class C39320cz {

    /* renamed from: a */
    Fragment f102134a;

    /* renamed from: b */
    Activity f102135b;

    /* renamed from: c */
    PermissionSettingItem f102136c;

    /* renamed from: d */
    int f102137d;

    /* renamed from: a */
    public final int mo97880a() {
        return this.f102136c.getPermission();
    }

    /* renamed from: b */
    public final void mo97886b(Bundle bundle) {
        mo97881a(bundle.getInt("permission"));
    }

    /* renamed from: a */
    public final void mo97881a(int i) {
        this.f102136c.setPermission(i);
    }

    /* renamed from: a */
    public final void mo97882a(Intent intent) {
        this.f102136c.setPermission(intent.getIntExtra("extra.PERMISSION", 0));
    }

    /* renamed from: b */
    public final void mo97887b(C39319cy cyVar) {
        this.f102136c.mo101645a(new C39333db(this, cyVar));
        if (C6399b.m19946v() && !C35563c.f93230L.mo93342a(Property.PrivateAvailable)) {
            this.f102136c.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo97883a(Bundle bundle) {
        if (C30538p.m99745a()) {
            bundle.putInt("permission", C35563c.f93230L.mo93342a(Property.PrivateAvailable) ? 1 : 0);
        } else {
            bundle.putInt("permission", mo97880a());
        }
    }

    /* renamed from: a */
    public final void mo97884a(C39319cy cyVar) {
        this.f102136c.mo101645a(new C39332da(this, cyVar));
        if (C6399b.m19946v() && !C35563c.f93230L.mo93342a(Property.PrivateAvailable)) {
            this.f102136c.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo97888b(C39319cy cyVar, View view) {
        String str;
        PublishPermissionActivity.m122669a(this.f102134a, this.f102137d, this.f102136c.getPermission(), (int) R.string.b7k, (int) R.string.b7j, 2);
        C6909j jVar = new C6909j();
        String str2 = "is_photo";
        if (this.f102137d == 5) {
            str = "1";
        } else {
            str = "0";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo97885a(C39319cy cyVar, View view) {
        String str;
        PublishPermissionActivity.m122668a(this.f102135b, this.f102137d, this.f102136c.getPermission(), (int) R.string.b7k, (int) R.string.b7j, 2);
        C6909j jVar = new C6909j();
        String str2 = "is_photo";
        if (this.f102137d == 5) {
            str = "1";
        } else {
            str = "0";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(jVar.mo16966a(str2, str).mo16967a()));
    }

    /* renamed from: a */
    public static C39320cz m125645a(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        return new C39320cz(fragment, permissionSettingItem, 0);
    }

    public C39320cz(Activity activity, PermissionSettingItem permissionSettingItem, int i) {
        this.f102135b = activity;
        this.f102136c = permissionSettingItem;
        this.f102137d = i;
    }

    private C39320cz(Fragment fragment, PermissionSettingItem permissionSettingItem, int i) {
        this.f102134a = fragment;
        this.f102136c = permissionSettingItem;
        this.f102137d = i;
    }
}
