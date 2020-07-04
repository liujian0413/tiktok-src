package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment */
public abstract class BaseThirdPartyCheckFragment extends BaseMusLoginFragment {
    @BindView(2131492927)
    DmtButton mBtnConfirm;
    @BindView(2131493561)
    DmtTextView mCountDownFive;
    @BindView(2131493211)
    ImageView mIvPlatForm;
    @BindView(2131493202)
    ImageView mIvback;
    @BindView(2131493588)
    DmtTextView mTvBindDetail;

    /* renamed from: n */
    protected CountDownTimer f57525n;

    /* renamed from: o */
    protected String f57526o = "";

    /* renamed from: p */
    protected String f57527p;

    /* renamed from: q */
    protected String f57528q;

    /* renamed from: r */
    protected String f57529r;

    /* renamed from: a */
    public abstract void mo57563a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57564a(long j);

    /* renamed from: a */
    public abstract void mo57565a(Intent intent);

    public void onDestroy() {
        super.onDestroy();
        if (this.f57525n != null) {
            this.f57525n.cancel();
        }
    }

    /* renamed from: i */
    private void m71957i() {
        if (!TextUtils.isEmpty(this.f57526o)) {
            String str = this.f57526o;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1240244679) {
                if (hashCode != -916346253) {
                    if (hashCode != 3765) {
                        if (hashCode != 28903346) {
                            if (hashCode == 497130182 && str.equals("facebook")) {
                                c = 0;
                            }
                        } else if (str.equals("instagram")) {
                            c = 2;
                        }
                    } else if (str.equals("vk")) {
                        c = 4;
                    }
                } else if (str.equals("twitter")) {
                    c = 3;
                }
            } else if (str.equals("google")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    this.mIvPlatForm.setBackgroundResource(R.drawable.b2_);
                    return;
                case 1:
                    this.mIvPlatForm.setBackgroundResource(R.drawable.b2a);
                    return;
                case 2:
                    this.mIvPlatForm.setBackgroundResource(R.drawable.b2b);
                    return;
                case 3:
                    this.mIvPlatForm.setBackgroundResource(R.drawable.b2c);
                    return;
                case 4:
                    this.mIvPlatForm.setBackgroundResource(R.drawable.b2d);
                    break;
            }
        } else if (C7163a.m22363a()) {
            StringBuilder sb = new StringBuilder("mPlatform must not be null in ");
            sb.append(getClass());
            sb.append(", otherwise this page will show a weird UI.");
            throw new IllegalStateException(sb.toString());
        }
    }

    @OnClick({2131493202, 2131492927})
    public void onClick(View view) {
        if (view.getId() == R.id.b6a) {
            getActivity().onBackPressed();
            return;
        }
        if (view.getId() == R.id.py) {
            mo57563a();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57527p = getArguments().getString("access_token");
            this.f57528q = getArguments().getString("access_token_secret");
            this.f57529r = getArguments().getString("code");
            this.f57526o = getArguments().getString("platform");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4321) {
            mo57565a(intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.rg, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        double b = (double) (((float) C9738o.m28709b(getContext())) - C9738o.m28708b(getContext(), 44.0f));
        Double.isNaN(b);
        ((LayoutParams) this.mTvBindDetail.getLayoutParams()).setMargins((int) C9738o.m28708b(getContext(), 20.0f), (int) (b * 0.2d), (int) C9738o.m28708b(getContext(), 20.0f), 0);
        m71957i();
        this.mBtnConfirm.setOnTouchListener(new C34032a(0.5f, 150, null));
        C214131 r4 = new CountDownTimer(5500, 1000) {
            public final void onFinish() {
                BaseThirdPartyCheckFragment.this.mo57563a();
            }

            public final void onTick(long j) {
                BaseThirdPartyCheckFragment.this.mo57564a(j);
            }
        };
        this.f57525n = r4;
        return inflate;
    }
}
