package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.setting.serverpush.C37703a.C37704a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.p280ss.android.ugc.aweme.utils.C42961az;
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

/* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity */
public final class WhoCanSeeMyLikeListActivity extends BaseControlSettingActivity {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f98713d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(WhoCanSeeMyLikeListActivity.class), "mPushChangePresenter", "getMPushChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;"))};

    /* renamed from: e */
    public static final C37704a f98714e = new C37871b();

    /* renamed from: f */
    public static final C37870a f98715f = new C37870a(null);

    /* renamed from: g */
    private final C7541d f98716g = C7546e.m23569a(new C37872c(this));

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$a */
    public static final class C37870a {
        private C37870a() {
        }

        /* renamed from: a */
        public static C37704a m121120a() {
            return WhoCanSeeMyLikeListActivity.f98714e;
        }

        public /* synthetic */ C37870a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m121121a(Activity activity, int i, int i2) {
            C7573i.m23587b(activity, "context");
            Intent intent = new Intent(activity, WhoCanSeeMyLikeListActivity.class);
            intent.putExtra("currentSettingsValue", i);
            activity.startActivityForResult(intent, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$b */
    public static final class C37871b implements C37704a {
        C37871b() {
        }

        /* renamed from: a */
        public final void mo59220a(Exception exc) {
            C7573i.m23587b(exc, "e");
        }

        /* renamed from: a */
        public final void mo59219a(C37723b bVar) {
            C7573i.m23587b(bVar, "settings");
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl e = a.mo60075e();
            C7573i.m23582a((Object) e, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
            e.mo59871a(Integer.valueOf(bVar.f98243A));
            C42961az.m136380a(new C37897ax());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity$c */
    static final class C37872c extends Lambda implements C7561a<C37713d> {

        /* renamed from: a */
        final /* synthetic */ WhoCanSeeMyLikeListActivity f98717a;

        C37872c(WhoCanSeeMyLikeListActivity whoCanSeeMyLikeListActivity) {
            this.f98717a = whoCanSeeMyLikeListActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37713d invoke() {
            C37713d dVar = new C37713d();
            dVar.mo66537a(this.f98717a);
            return dVar;
        }
    }

    /* renamed from: a */
    public static final void m121112a(Activity activity, int i, int i2) {
        C37870a.m121121a(activity, i, 7);
    }

    /* renamed from: h */
    private final C37713d m121113h() {
        return (C37713d) this.f98716g.getValue();
    }

    /* renamed from: e */
    public final String mo95114e() {
        return "favorite_permission";
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.WhoCanSeeMyLikeListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: c */
    public final void mo95111c() {
        this.f98361a = getIntent().getIntExtra("currentSettingsValue", 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        m121113h().mo59134U_();
    }

    /* renamed from: f */
    public final void mo95115f() {
        CommonItemView commonItemView = this.mEveryoneItem;
        C7573i.m23582a((Object) commonItemView, "mEveryoneItem");
        commonItemView.setTag(Integer.valueOf(0));
        CommonItemView commonItemView2 = this.mFriendsItem;
        C7573i.m23582a((Object) commonItemView2, "mFriendsItem");
        commonItemView2.setTag(Integer.valueOf(1));
        CommonItemView commonItemView3 = this.mOffItem;
        C7573i.m23582a((Object) commonItemView3, "mOffItem");
        commonItemView3.setTag(Integer.valueOf(3));
    }

    /* renamed from: d */
    public final void mo95113d() {
        int i;
        int i2;
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl f = a.mo60076f();
        C7573i.m23582a((Object) f, "CommonSharePrefCache.ins…redLikeSelfVisibleSetting");
        f.mo59871a(Boolean.valueOf(true));
        TextView textView = this.mTitle;
        C7573i.m23582a((Object) textView, "mTitle");
        if (C6399b.m19944t()) {
            i = R.string.fsd;
        } else {
            i = R.string.fsb;
        }
        textView.setText(getString(i));
        CommonItemView commonItemView = this.mOffItem;
        C7573i.m23582a((Object) commonItemView, "mOffItem");
        commonItemView.setVisibility(8);
        CommonItemView commonItemView2 = this.mFriendsItem;
        if (C6399b.m19944t()) {
            i2 = R.string.cqx;
        } else {
            i2 = R.string.cqy;
        }
        commonItemView2.setLeftText(getString(i2));
        switch (this.f98361a) {
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
        m121113h().mo56976a(mo95114e(), Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo95107a(int i) {
        if (i != 3) {
            switch (i) {
                case 0:
                    m120668a(this.mEveryoneItem);
                    return;
                case 1:
                    m120668a(this.mFriendsItem);
                    return;
            }
        } else {
            m120668a(this.mOffItem);
        }
    }
}
