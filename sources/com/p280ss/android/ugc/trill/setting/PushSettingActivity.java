package com.p280ss.android.ugc.trill.setting;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.activity.AmePresenterActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.bogut.library.factory.C7287b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

@C7287b(mo19021a = C45067b.class)
/* renamed from: com.ss.android.ugc.trill.setting.PushSettingActivity */
public class PushSettingActivity extends AmePresenterActivity<C45067b> implements OnClickListener {

    /* renamed from: a */
    ImmersionBar f115812a;
    protected CommonItemView mCommentMeItem;
    protected CommonItemView mFollowMeItem;
    protected CommonItemView mLikeMeItem;
    protected ButtonTitleBar mTitleBar;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f115812a != null) {
            this.f115812a.destroy();
        }
    }

    /* renamed from: b */
    public final void mo107595b() {
        this.mLikeMeItem.setChecked(!this.mLikeMeItem.mo25778c());
        C21115b.m71197a().updateShieldDiggNotice(this.mLikeMeItem.mo25778c() ^ true ? 1 : 0);
        m142128a("like", this.mLikeMeItem.mo25778c());
    }

    /* renamed from: c */
    public final void mo107596c() {
        this.mFollowMeItem.setChecked(!this.mFollowMeItem.mo25778c());
        C21115b.m71197a().updateShieldFollowNotice(this.mFollowMeItem.mo25778c() ^ true ? 1 : 0);
        m142128a("follow", this.mFollowMeItem.mo25778c());
    }

    /* renamed from: d */
    public final void mo107597d() {
        this.mCommentMeItem.setChecked(!this.mCommentMeItem.mo25778c());
        C21115b.m71197a().updateShieldCommentNotice(this.mCommentMeItem.mo25778c() ^ true ? 1 : 0);
        m142128a("comment_page", this.mCommentMeItem.mo25778c());
    }

    /* renamed from: e */
    private void m142129e() {
        boolean z;
        boolean z2;
        this.mTitleBar.setTitle((CharSequence) getString(R.string.d_q));
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                PushSettingActivity.this.finish();
            }
        });
        this.mLikeMeItem.setOnClickListener(this);
        this.mFollowMeItem.setOnClickListener(this);
        this.mCommentMeItem.setOnClickListener(this);
        User curUser = C21115b.m71197a().getCurUser();
        CommonItemView commonItemView = this.mLikeMeItem;
        boolean z3 = false;
        if (curUser.getShieldDiggNotice() != 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        CommonItemView commonItemView2 = this.mFollowMeItem;
        if (curUser.getShieldFollowNotice() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        commonItemView2.setChecked(z2);
        CommonItemView commonItemView3 = this.mCommentMeItem;
        if (curUser.getShieldCommentNotice() != 1) {
            z3 = true;
        }
        commonItemView3.setChecked(z3);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.eb);
        m142129e();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.trill.setting.PushSettingActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.blx) {
            ((C45067b) mo60496a()).mo107600a(view.getId(), this.mLikeMeItem.mo25778c());
        } else if (id == R.id.anu) {
            ((C45067b) mo60496a()).mo107600a(view.getId(), this.mFollowMeItem.mo25778c());
        } else {
            if (id == R.id.zi) {
                ((C45067b) mo60496a()).mo107600a(view.getId(), this.mCommentMeItem.mo25778c());
            }
        }
    }

    /* renamed from: a */
    private static void m142128a(String str, boolean z) {
        String str2;
        C6909j jVar = new C6909j();
        if (z) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        jVar.mo16966a("to_status", str2);
        C6907h.onEvent(MobClick.obtain().setEventName("notification_switch").setLabelName(str).setJsonObject(jVar.mo16967a()));
    }
}
