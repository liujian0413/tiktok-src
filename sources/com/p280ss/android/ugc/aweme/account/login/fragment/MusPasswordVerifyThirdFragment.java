package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12711f;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21270a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusPasswordVerifyThirdFragment */
public class MusPasswordVerifyThirdFragment extends BaseThirdPartyCheckFragment {

    /* renamed from: s */
    public static String f57717s = "oldpassword";

    /* renamed from: t */
    public static String f57718t = "newpassword";

    /* renamed from: u */
    public C21270a f57719u;

    /* renamed from: v */
    private String f57720v;

    /* renamed from: w */
    private String f57721w;

    /* renamed from: a */
    public final void mo57563a() {
        Intent intent = new Intent(getContext(), AuthorizeActivity.class);
        intent.putExtra("platform", this.f57526o);
        intent.putExtra("is_only_fetch_token", true);
        startActivityForResult(intent, 4321);
        if (this.f57525n != null) {
            this.f57525n.cancel();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57720v = getArguments().getString(f57717s);
            this.f57721w = getArguments().getString(f57718t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57564a(long j) {
        this.mCountDownFive.setText(C1642a.m8034a(getString(R.string.e7_), new Object[]{Long.valueOf(j / 1000)}));
    }

    /* renamed from: a */
    public final void mo57565a(Intent intent) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("access_token");
            String stringExtra2 = intent.getStringExtra("access_token_secret");
            String stringExtra3 = intent.getStringExtra("code");
            mo57502a(true);
            new MusLoginManager().mo57217a(stringExtra, stringExtra2, stringExtra3, "", this.f57526o, "", new C12706a<C12711f>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onResponse(C12711f fVar) {
                    MusPasswordVerifyThirdFragment.this.mo57502a(false);
                    if (fVar == null) {
                        C10761a.m31399c(MusPasswordVerifyThirdFragment.this.getContext(), (int) R.string.b23).mo25750a();
                    } else if (fVar.f33701a) {
                        MusPasswordVerifyThirdFragment.this.f57719u.mo57248a(fVar.f33710g);
                        MusPasswordVerifyThirdFragment.this.getActivity().onBackPressed();
                    } else if (fVar.f33702b <= 0 || TextUtils.isEmpty(fVar.f33703c)) {
                        C10761a.m31399c(MusPasswordVerifyThirdFragment.this.getContext(), (int) R.string.b23).mo25750a();
                    } else {
                        C10761a.m31403c(MusPasswordVerifyThirdFragment.this.getContext(), fVar.f33703c).mo25750a();
                    }
                }
            });
            return;
        }
        getActivity().onBackPressed();
    }

    /* renamed from: a */
    public static MusPasswordVerifyThirdFragment m72101a(String str, String str2, String str3) {
        MusPasswordVerifyThirdFragment musPasswordVerifyThirdFragment = new MusPasswordVerifyThirdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("platform", str);
        bundle.putString(f57717s, str2);
        bundle.putString(f57718t, str3);
        musPasswordVerifyThirdFragment.setArguments(bundle);
        return musPasswordVerifyThirdFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mBtnConfirm.setText(getString(R.string.e79));
        this.mTvBindDetail.setText(getString(R.string.e77));
        this.f57525n.start();
        return onCreateView;
    }
}
