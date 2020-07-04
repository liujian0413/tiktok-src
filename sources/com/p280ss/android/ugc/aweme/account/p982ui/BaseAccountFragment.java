package com.p280ss.android.ugc.aweme.account.p982ui;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.mobilelib.present.CommonPresent;
import com.p280ss.android.ugc.aweme.account.login.p974ui.BasePhoneNumberInputFragment;
import com.p280ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p280ss.android.ugc.aweme.account.model.C22198a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountFragment */
public abstract class BaseAccountFragment extends BasePhoneNumberInputFragment {
    @BindView(2131492909)
    ImageView backBtn;

    /* renamed from: e */
    private int f59354e = -111;
    @BindView(2131492933)
    View mBtnLogin;
    @BindView(2131492945)
    DmtButton mBtnPreAccount;
    @BindView(2131492985)
    View mCodeDownView;
    @BindView(2131493491)
    DmtStatusView mDmtStatusView;
    @BindView(2131493251)
    View mEditCodeContainer;
    @BindView(2131493049)
    EditText mEditText;
    @BindView(2131493246)
    LinearLayout mLLContainer;
    @BindView(2131493264)
    DmtLoadingLayout mLoadingUI;
    @BindView(2131493323)
    View mPasswordDownView;
    @BindView(2131493048)
    EditText mPasswordEt;
    @BindView(2131493578)
    TextView mPasswordTip;
    @BindView(2131493252)
    View mPhoneContainer;
    @BindView(2131493340)
    View mPhoneDownView;
    @BindView(2131493603)
    TextView mRightText;
    @BindView(2131493395)
    RelativeLayout mRlTitle;
    @BindView(2131493582)
    TextView mSafeCheckHint;
    @BindView(2131493213)
    ImageView mSelectCountryDown;
    @BindView(2131493615)
    DmtTextView mSwitchToEmail;
    @BindView(2131493537)
    protected TextView mTitleHint;
    @BindView(2131493600)
    protected TextView mTxtHint;
    @BindView(2131493605)
    TextView mTxtTimer;

    /* renamed from: q */
    private C23467g f59355q = new C23467g() {
        public final void afterTextChanged(Editable editable) {
            if (BaseAccountFragment.this.mBtnLogin == null || BaseAccountFragment.this.mBtnLogin.getVisibility() != 0) {
                if (BaseAccountFragment.this.mBtnPreAccount != null && BaseAccountFragment.this.mBtnPreAccount.getVisibility() == 0) {
                    BaseAccountFragment.this.mBtnPreAccount.setEnabled(BaseAccountFragment.this.mo58622w());
                }
                return;
            }
            C22358a.m74034a(BaseAccountFragment.this.mBtnLogin, BaseAccountFragment.this.mo58622w());
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo57106d();

    /* renamed from: g */
    public final CommonPresent mo58129g() {
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo58621v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract boolean mo58622w();

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract int mo58623x();

    /* renamed from: s */
    public final void mo58618s() {
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.mo25942f();
            }
            return;
        }
        C22358a.m74035b(this.mBtnLogin);
    }

    /* renamed from: t */
    public final void mo58619t() {
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.setVisibility(8);
            }
            return;
        }
        C22358a.m74033a(this.mBtnLogin);
    }

    /* renamed from: u */
    public void mo58620u() {
        if (getActivity() != null) {
            ((AccountOpeModel) C0069x.m159a(getActivity()).mo147a(AccountOpeModel.class)).f59291b.postValue(new C22198a(false));
        }
    }

    /* renamed from: a */
    public final void mo58125a(View view) {
        KeyboardUtils.m77057c(view);
    }

    /* renamed from: b */
    public final void mo58126b(View view) {
        KeyboardUtils.m77055a(view);
    }

    /* renamed from: c */
    public final void mo58154c(String str) {
        super.mo58154c(str);
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mBtnPreAccount.setEnabled(mo58622w());
            }
            return;
        }
        C22358a.m74034a(this.mBtnLogin, mo58622w());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo58172e(String str) {
        C6907h.m21524a("phone_bundling_skip", (Map) new C21102b().mo56946a("enter_from", "log_in").mo56946a("platform", C21220e.m71416a(str)).f56672a);
        KeyboardUtils.m77057c(this.mEditText);
        getActivity().finish();
    }

    @OnClick({2131492909, 2131492933, 2131493603, 2131492945})
    @Optional
    public void onClick(View view) {
        if (isViewValid()) {
            if (view.getId() == R.id.jo) {
                mo58620u();
            } else if (view.getId() == R.id.qm || view.getId() == R.id.r0) {
                mo58621v();
            } else {
                if (view.getId() == R.id.e77 || view.getId() == R.id.di4) {
                    mo58172e("");
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo57106d();
        this.mEditCodeContainer.setVisibility(8);
        this.mPhoneContainer.setVisibility(8);
        this.mPasswordEt.setVisibility(8);
        if (mo58623x() == 1) {
            mo58126b(this.f58334o);
            this.mPhoneContainer.setVisibility(0);
        } else if (mo58623x() == 2) {
            mo58126b(this.mPasswordEt);
            this.mPasswordEt.setVisibility(0);
            this.mPasswordEt.addTextChangedListener(this.f59355q);
            this.mPasswordTip.setVisibility(0);
        } else if (mo58623x() == 0) {
            mo58126b(this.mEditText);
            this.mEditCodeContainer.setVisibility(0);
            this.mEditText.addTextChangedListener(this.f59355q);
        } else if (mo58623x() == 3) {
            mo58126b(this.mEditText);
            this.mEditCodeContainer.setVisibility(0);
            this.mPasswordEt.setVisibility(0);
            this.mEditText.addTextChangedListener(this.f59355q);
            this.mPasswordEt.addTextChangedListener(this.f59355q);
            this.mPasswordTip.setVisibility(0);
        }
        this.mTitleHint.setTextSize(26.0f);
        if (getArguments() != null) {
            this.f59354e = getArguments().getInt("type");
        }
        if (this.f59354e != 5 && this.f59354e != 9 && ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            this.backBtn.setImageResource(R.drawable.a1r);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b12, viewGroup, false);
        this.f58332m = inflate.findViewById(R.id.br0);
        this.f58333n = (TextView) inflate.findViewById(R.id.dsy);
        this.f58334o = (EditText) inflate.findViewById(R.id.acd);
        this.f58335p = inflate.findViewById(R.id.cb0);
        return inflate;
    }
}
