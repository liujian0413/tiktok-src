package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity */
public final class FollowingAndFansSettingActivity extends BaseControlSettingActivity {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f98442d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowingAndFansSettingActivity.class), "mPushChangePresenter", "getMPushChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};

    /* renamed from: e */
    public static final C37782a f98443e = new C37782a(null);

    /* renamed from: f */
    private final C7541d f98444f = C7546e.m23569a(new C37783b(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity$a */
    public static final class C37782a {
        private C37782a() {
        }

        public /* synthetic */ C37782a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity$b */
    static final class C37783b extends Lambda implements C7561a<C37713d> {

        /* renamed from: a */
        final /* synthetic */ FollowingAndFansSettingActivity f98445a;

        C37783b(FollowingAndFansSettingActivity followingAndFansSettingActivity) {
            this.f98445a = followingAndFansSettingActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37713d invoke() {
            C37713d dVar = new C37713d();
            dVar.mo66537a(this.f98445a);
            return dVar;
        }
    }

    /* renamed from: h */
    private final C37713d m120792h() {
        return (C37713d) this.f98444f.getValue();
    }

    /* renamed from: e */
    public final String mo95114e() {
        return "following_follower_permission";
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.FollowingAndFansSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo95111c() {
        this.f98361a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        m120792h().mo59134U_();
    }

    public final void bJ_() {
        super.bJ_();
        C10761a.m31399c((Context) this, (int) R.string.cjr).mo25750a();
    }

    /* renamed from: f */
    public final void mo95115f() {
        CommonItemView commonItemView = this.mEveryoneItem;
        C7573i.m23582a((Object) commonItemView, "mEveryoneItem");
        commonItemView.setTag(Integer.valueOf(0));
        CommonItemView commonItemView2 = this.mFriendsItem;
        C7573i.m23582a((Object) commonItemView2, "mFriendsItem");
        commonItemView2.setTag(Integer.valueOf(1));
    }

    /* renamed from: d */
    public final void mo95113d() {
        this.mTitle.setText(R.string.dpd);
        this.mEveryoneItem.setLeftText(getText(R.string.hw));
        this.mFriendsItem.setLeftText(getText(R.string.cqx));
        CommonItemView commonItemView = this.mOffItem;
        C7573i.m23582a((Object) commonItemView, "mOffItem");
        commonItemView.setVisibility(8);
        switch (this.f98361a) {
            case 0:
                m120668a(this.mEveryoneItem);
                return;
            case 1:
                m120668a(this.mFriendsItem);
                break;
        }
    }

    /* renamed from: a */
    public final void mo95107a(int i) {
        mo95116g();
        switch (i) {
            case 0:
                m120668a(this.mEveryoneItem);
                return;
            case 1:
                m120668a(this.mFriendsItem);
                break;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo95109b(int i) {
        m120792h().mo56976a(mo95114e(), Integer.valueOf(i));
    }
}
