package com.p280ss.android.ugc.aweme.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.arch.lifecycle.C0042h;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.analysis.C6863c;
import com.p280ss.android.ugc.aweme.base.component.C23304f;
import com.p280ss.android.ugc.aweme.base.p308ui.C23460b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.base.AmeActivity */
public class AmeActivity extends AbsActivity implements C6863c {
    static C6890a sLoginComponentFactory;
    private Intent mCurrentIntent;
    private C23460b mDeeplinkBackView;
    public boolean mFirstResumed;
    private C23304f mLoginComponent;
    private ProgressDialog mProgressDialog;

    /* renamed from: com.ss.android.ugc.aweme.base.AmeActivity$a */
    public interface C6890a {
        /* renamed from: a */
        C23304f mo16930a(AbsActivity absActivity);
    }

    public static C6890a getLoginComponentFactory() {
        return sLoginComponentFactory;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C23193a.m76154a(this, context);
    }

    public void attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Analysis getAnalysis() {
        return null;
    }

    public boolean isRegisterEventBus() {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C23193a.m76155a(this, configuration);
    }

    public void onConfigurationChanged$___twin___(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        C23193a.m76156a(this, bundle);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onResume() {
        C23193a.m76153a(this);
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public int subscriberPriority() {
        return 0;
    }

    public void showLoginDialog() {
        showLoginDialogWithShowPosition("");
    }

    public void onPause() {
        super.onPause();
        C6405d.m19967a((Activity) null);
        tryRemoveDeeplinkBackView();
    }

    public ProgressDialog showProgressDialog() {
        return showProgressDialog(getString(R.string.c49));
    }

    public void showProtocolDialog() {
        if (getLoginComponent() != null) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    AmeActivity.this.getLoginComponent().bo_();
                }
            });
        }
    }

    public void dismissProgressDialog() {
        if (this.mProgressDialog != null && this.mProgressDialog.isShowing()) {
            this.mProgressDialog.dismiss();
        }
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        if (intent == null || SmartRouter.isSmartIntent(intent)) {
            return intent;
        }
        Intent smartIntent = SmartRouter.smartIntent(intent);
        setIntent(smartIntent);
        return smartIntent;
    }

    public void onDestroy() {
        C7705c a = C7705c.m23799a();
        if (isRegisterEventBus() && a.mo20392b((Object) this)) {
            a.mo20393c((Object) this);
        }
        super.onDestroy();
    }

    public void onResume$___twin___() {
        this.mFirstResumed = true;
        C6405d.m19967a((Activity) this);
        super.onResume();
        if (C23316d.m76492a(this.mCurrentIntent)) {
            this.mCurrentIntent = null;
            addDeeplinkBackView();
        }
    }

    public void tryRemoveDeeplinkBackView() {
        if (this.mDeeplinkBackView != null) {
            ((ViewGroup) getWindow().getDecorView()).removeView(this.mDeeplinkBackView);
            this.mDeeplinkBackView = null;
        }
    }

    private void addDeeplinkBackView() {
        if (getIntent() != null) {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            this.mDeeplinkBackView = C23316d.m76490a(getIntent(), this);
            viewGroup.addView(this.mDeeplinkBackView);
        }
    }

    public C23304f getLoginComponent() {
        if (this.mLoginComponent == null) {
            if (sLoginComponentFactory == null) {
                this.mLoginComponent = C32656f.m105741a();
            } else {
                this.mLoginComponent = sLoginComponentFactory.mo16930a(this);
            }
            if (this.mLoginComponent instanceof C0042h) {
                getLifecycle().mo55a((C0042h) this.mLoginComponent);
            }
        }
        return this.mLoginComponent;
    }

    public static void setLoginComponentFactory(C6890a aVar) {
        sLoginComponentFactory = aVar;
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mCurrentIntent = intent;
    }

    public void setContentView(int i) {
        super.setContentView(i);
        ButterKnife.bind((Activity) this);
    }

    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind((Activity) this);
    }

    public void showLoginDialogWithShowPosition(final String str) {
        if (getLoginComponent() != null) {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    AmeActivity.this.getLoginComponent().mo60581a(str);
                }
            });
        }
    }

    private ProgressDialog getThemedProgressDialog(Context context) {
        if (VERSION.SDK_INT >= 11) {
            return new ProgressDialog(context, 3);
        }
        return new ProgressDialog(context);
    }

    public void onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder("当前页面：");
        sb.append(getClass().getSimpleName());
        C6921a.m21555a(sb.toString());
        C7705c a = C7705c.m23799a();
        if (!a.mo20392b((Object) this) && isRegisterEventBus()) {
            a.mo20389a((Object) this);
        }
        this.mCurrentIntent = getIntent();
    }

    public ProgressDialog showProgressDialog(String str) {
        if (this.mProgressDialog == null) {
            this.mProgressDialog = getThemedProgressDialog(this);
            this.mProgressDialog.setCanceledOnTouchOutside(false);
        }
        if (!this.mProgressDialog.isShowing()) {
            this.mProgressDialog.setMessage(str);
            this.mProgressDialog.show();
        }
        return this.mProgressDialog;
    }
}
