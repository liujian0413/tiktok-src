package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37710c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.BaseControlSettingActivity */
public abstract class BaseControlSettingActivity extends AmeSSActivity implements OnClickListener, C37708a {

    /* renamed from: a */
    protected int f98361a;

    /* renamed from: b */
    protected int f98362b;

    /* renamed from: c */
    protected C37710c f98363c;
    protected CommonItemView mEveryoneItem;
    protected CommonItemView mFriendsItem;
    protected CommonItemView mOffItem;
    protected DmtTextView mTipsView;
    protected TextView mTitle;

    /* renamed from: a */
    public abstract void mo95107a(int i);

    public final void bI_() {
    }

    public void back() {
        onBackPressed();
    }

    /* renamed from: c */
    public abstract void mo95111c();

    /* renamed from: d */
    public abstract void mo95113d();

    /* renamed from: e */
    public abstract String mo95114e();

    /* renamed from: f */
    public abstract void mo95115f();

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public void bJ_() {
        C10761a.m31399c((Context) this, (int) R.string.cjt).mo25750a();
        mo95107a(this.f98362b);
        this.f98361a = this.f98362b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo95116g() {
        this.mFriendsItem.setRightIconRes(0);
        this.mEveryoneItem.setRightIconRes(0);
        this.mOffItem.setRightIconRes(0);
    }

    public void onBackPressed() {
        Intent intent = getIntent();
        intent.putExtra("currentSettingsValue", this.f98361a);
        setResult(-1, intent);
        finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f98363c.mo59134U_();
        if (C6399b.m19944t()) {
            ImmersionBar.with((Activity) this).destroy();
        }
    }

    /* renamed from: h */
    private void m120669h() {
        this.f98363c = new C37710c();
        this.f98363c.mo66537a(this);
        this.mEveryoneItem.setOnClickListener(this);
        this.mFriendsItem.setOnClickListener(this);
        this.mOffItem.setOnClickListener(this);
        mo95115f();
        mo95111c();
        mo95113d();
    }

    /* renamed from: a */
    protected static void m120668a(CommonItemView commonItemView) {
        commonItemView.setRightIconRes(R.drawable.aax);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo95108a(CharSequence charSequence) {
        if (this.mTipsView != null) {
            this.mTipsView.setVisibility(0);
            this.mTipsView.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.bd);
        mo95116g();
        m120669h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo95109b(int i) {
        this.f98363c.mo56976a(mo95114e(), Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo95112c(int i) {
        if (this.mTipsView != null && this.mTipsView.getVisibility() == 0) {
            this.mTipsView.setTextColor(i);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view != null) {
            mo95116g();
            m120668a((CommonItemView) view);
            this.f98362b = this.f98361a;
            int intValue = ((Integer) view.getTag()).intValue();
            this.f98361a = intValue;
            mo95109b(intValue);
        }
    }
}
