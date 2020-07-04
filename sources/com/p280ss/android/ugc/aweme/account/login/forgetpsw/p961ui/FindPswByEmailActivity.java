package com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p959a.C21368c;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p960b.C21369a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.views.C22364b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity */
public class FindPswByEmailActivity extends MusAbsActivity implements C21380c {

    /* renamed from: a */
    public static C21883t f57381a;

    /* renamed from: b */
    public C21368c f57382b;

    /* renamed from: c */
    private Dialog f57383c;

    /* renamed from: d */
    private OnFocusChangeListener f57384d = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i;
            if (view.getId() == R.id.ag0) {
                ImageView imageView = FindPswByEmailActivity.this.mClearEmail;
                if (!z || TextUtils.isEmpty(FindPswByEmailActivity.this.mEtEmail.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
    };
    @BindView(2131492928)
    LoginButton mBtnNext;
    @BindView(2131492973)
    ImageView mClearEmail;
    @BindView(2131493091)
    EditText mEtEmail;
    @BindView(2131493092)
    View mEtEmailUnderline;
    @BindString(2132083194)
    String mHelpCenterRegular;
    @BindView(2131493397)
    View mRoot;
    @BindView(2131493567)
    TextView mTvHelperCenter;
    @BindView(2131493638)
    View mWrongEmailContainer;
    @BindView(2131493637)
    TextView mWrongEmailText;

    /* renamed from: a */
    public final Activity mo57481a() {
        return this;
    }

    @OnClick({2131493202})
    public void onBackClick() {
        finish();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: d */
    private void m71861d() {
        this.f57382b = new C21368c();
        this.f57382b.mo57469a((C21380c) this);
    }

    @OnClick({2131492973})
    public void onClearEmailClick() {
        this.mClearEmail.setVisibility(8);
        this.mEtEmail.setText("");
    }

    public void onDestroy() {
        super.onDestroy();
        this.f57382b.mo57470c();
        f57381a = null;
    }

    /* renamed from: b */
    private void m71858b() {
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        m71860c();
        this.mEtEmail.post(new Runnable() {
            public final void run() {
                FindPswByEmailActivity.this.mEtEmail.setFocusable(true);
                FindPswByEmailActivity.this.mEtEmail.setFocusableInTouchMode(true);
                FindPswByEmailActivity.this.mEtEmail.requestFocus();
                ((InputMethodManager) FindPswByEmailActivity.this.mEtEmail.getContext().getSystemService("input_method")).showSoftInput(FindPswByEmailActivity.this.mEtEmail, 0);
            }
        });
        this.mEtEmail.setOnFocusChangeListener(this.f57384d);
        this.mRoot.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m77057c(FindPswByEmailActivity.this.mRoot);
            }
        });
        this.mBtnNext.setLoginBackgroundRes(R.drawable.baw);
        this.mBtnNext.setLoadingBackground(R.drawable.bba);
    }

    /* renamed from: c */
    private void m71860c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String charSequence = this.mTvHelperCenter.getText().toString();
        spannableStringBuilder.append(charSequence);
        C213734 r4 = new C22367e(getResources().getColor(R.color.lj), getResources().getColor(R.color.y3)) {
            public final void onClick(View view) {
                FindPswByEmailActivity.this.f57382b.mo57471d();
            }
        };
        int indexOf = charSequence.toLowerCase().indexOf(this.mHelpCenterRegular.toLowerCase());
        if (indexOf != -1) {
            spannableStringBuilder.setSpan(r4, indexOf, this.mHelpCenterRegular.length() + indexOf, 33);
        }
        this.mTvHelperCenter.setHighlightColor(C23481i.m77088a(17170445));
        this.mTvHelperCenter.setText(spannableStringBuilder);
        this.mTvHelperCenter.setMovementMethod(C22364b.m74059a());
    }

    @OnClick({2131492928})
    public void onNextClick() {
        Intent intent = new Intent(this, MusLoginActivity.class);
        if (getIntent().getExtras() != null) {
            intent.putExtras(getIntent().getExtras());
        }
        intent.putExtra("email", this.mEtEmail.getText().toString().trim());
        intent.putExtra("init_page", 12);
        intent.putExtra("use_find_email_pass_ticker_wrapper", true);
        startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
    }

    public void setContentView(int i) {
        super.setContentView(i);
        ButterKnife.bind((Activity) this);
    }

    /* renamed from: a */
    public final void mo57483a(String str) {
        C10761a.m31403c((Context) this, str).mo25750a();
    }

    /* renamed from: a */
    public final void mo57484a(boolean z) {
        if (z) {
            this.mBtnNext.mo57356Z_();
        } else {
            this.mBtnNext.mo57357a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void afterPswInput(Editable editable) {
        int i;
        this.mBtnNext.setEnabled(C21369a.m71856a(this.mEtEmail.getText().toString()));
        ImageView imageView = this.mClearEmail;
        if (!this.mEtEmail.hasFocus() || TextUtils.isEmpty(this.mEtEmail.getText())) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        if (TextUtils.isEmpty(this.mEtEmail.getText())) {
            this.mWrongEmailContainer.setVisibility(8);
            this.mEtEmailUnderline.setBackgroundColor(getResources().getColor(R.color.le));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.ae5);
        f57381a = new C21883t();
        if (getIntent().getBooleanExtra("forget_psw_from_tt_email", false)) {
            C6907h.m21524a("click_forget_password", (Map) new C21102b().mo56946a("platform", "email").f56672a);
        }
        m71858b();
        m71861d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo57482a(int i, int i2) {
        m71859b(R.string.cbp, R.string.cbq);
    }

    /* renamed from: b */
    private void m71859b(int i, int i2) {
        if (this.f57383c != null && this.f57383c.isShowing()) {
            C21379b.m71866a(this.f57383c);
        }
        this.f57383c = new Builder(this).setTitle(i).setMessage(getResources().getString(i2)).setPositiveButton(R.string.cdb, C21378a.f57403a).create();
        this.f57383c.show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }
}
