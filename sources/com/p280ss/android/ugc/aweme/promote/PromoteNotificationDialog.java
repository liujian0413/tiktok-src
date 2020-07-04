package com.p280ss.android.ugc.aweme.promote;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.setting.model.PopupSetting;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.promote.PromoteNotificationDialog */
public class PromoteNotificationDialog extends C43374j {

    /* renamed from: a */
    public String f96735a;

    /* renamed from: b */
    public String f96736b;

    /* renamed from: c */
    public Activity f96737c;

    /* renamed from: d */
    private String f96738d;

    /* renamed from: e */
    private View f96739e;

    /* renamed from: f */
    private DmtLoadingDialog f96740f;
    View mBtnCancel;
    View mBtnJoin;
    TextView mTvDesc;
    TextView mTvTitle;

    public void dismiss() {
        super.dismiss();
        m118793a(false);
    }

    /* renamed from: a */
    private void m118789a() {
        this.mBtnJoin.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                PromoteGdprManager.m118780a(PromoteNotificationDialog.this.f96737c, PromoteNotificationDialog.this.f96735a, "");
                PromoteNotificationDialog.this.dismiss();
            }
        });
        this.mBtnCancel.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C10761a.m31410e((Context) PromoteNotificationDialog.this.f96737c, PromoteNotificationDialog.this.f96736b).mo25750a();
                PromoteNotificationDialog.this.dismiss();
            }
        });
    }

    /* renamed from: a */
    private void m118793a(boolean z) {
        if (this.f96740f != null) {
            this.f96740f.dismiss();
        }
    }

    /* renamed from: a */
    private void m118792a(PopupSetting popupSetting) {
        if (this.f96737c != null) {
            this.f96735a = this.f96737c.getString(R.string.cfc);
            this.f96736b = this.f96737c.getString(R.string.cfa);
        }
        if (popupSetting != null) {
            if (!TextUtils.isEmpty(popupSetting.getPositiveActionUrl())) {
                this.f96735a = popupSetting.getPositiveActionUrl();
            }
            if (!TextUtils.isEmpty(popupSetting.getNegativeActionUrl())) {
                this.f96736b = popupSetting.getNegativeActionUrl();
            }
            String popupTitle = popupSetting.getPopupTitle();
            if (!TextUtils.isEmpty(popupTitle)) {
                this.mTvTitle.setText(popupTitle);
            }
            String popupContent = popupSetting.getPopupContent();
            if (!TextUtils.isEmpty(popupContent)) {
                this.mTvDesc.setText(popupContent);
            }
            String positiveButtonText = popupSetting.getPositiveButtonText();
            if (!TextUtils.isEmpty(positiveButtonText)) {
                this.mBtnJoin.setContentDescription(positiveButtonText);
            }
            String negativeButtonText = popupSetting.getNegativeButtonText();
            if (!TextUtils.isEmpty(negativeButtonText)) {
                this.mBtnCancel.setContentDescription(negativeButtonText);
            }
        }
    }

    /* renamed from: a */
    private void m118791a(Context context, PopupSetting popupSetting) {
        this.f96739e = LayoutInflater.from(context).inflate(R.layout.k5, null);
        setContentView(this.f96739e);
        ButterKnife.bind((Object) this, this.f96739e);
        m118792a(popupSetting);
        m118789a();
    }

    /* renamed from: a */
    private void m118790a(Activity activity, String str, PopupSetting popupSetting) {
        this.f96737c = activity;
        this.f96738d = str;
        m118791a(activity, popupSetting);
    }

    public PromoteNotificationDialog(Activity activity, String str, PopupSetting popupSetting) {
        super((Context) activity, (int) R.style.uu, false, true);
        m118790a(activity, str, popupSetting);
    }
}
