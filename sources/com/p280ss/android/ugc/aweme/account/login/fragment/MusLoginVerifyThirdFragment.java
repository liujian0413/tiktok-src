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
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.MusLoginManager;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21272c;
import com.p280ss.android.ugc.aweme.account.login.p952a.C21273d;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.MusLoginVerifyThirdFragment */
public class MusLoginVerifyThirdFragment extends BaseThirdPartyCheckFragment {

    /* renamed from: s */
    public String f57709s;

    /* renamed from: t */
    public String f57710t;

    /* renamed from: u */
    public String f57711u;

    /* renamed from: v */
    public String f57712v;

    /* renamed from: w */
    public C21272c f57713w;

    /* renamed from: x */
    public String f57714x;

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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57564a(long j) {
        this.mCountDownFive.setText(C1642a.m8034a(getString(R.string.e7_), new Object[]{Long.valueOf(j / 1000)}));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f57709s = getArguments().getString("email");
            this.f57710t = getArguments().getString("password");
            this.f57711u = getArguments().getString("logintype");
            this.f57712v = getArguments().getString("countrycodePhone");
            this.f57714x = getArguments().getString("username");
        }
        C6907h.m21524a("account_verification_show", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("verification_method", "third_party_account").f56672a);
        this.f57713w = new C21273d() {
            /* renamed from: a */
            public final void mo57252a(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo57255a(JSONObject jSONObject, String str, String str2) {
            }

            /* renamed from: b */
            public final void mo57256b(String str) {
            }

            /* renamed from: b */
            public final void mo57257b(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo57250a() {
                MusLoginVerifyThirdFragment.this.mo57502a(false);
                if (!TextUtils.isEmpty(MusLoginVerifyThirdFragment.this.f57712v)) {
                    String str = MusLoginVerifyThirdFragment.this.f57712v.split("-")[0];
                    BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73937a(MusSendCodeFragment.class).mo58756a("country_code", str).mo58756a("phone_number", MusLoginVerifyThirdFragment.this.f57712v.split("-")[1]).mo58754a("code_type", 2).mo58753a();
                    baseMusLoginFragment.mo57501a(MusLoginVerifyThirdFragment.this.f57409h);
                    MusLoginVerifyThirdFragment.this.mo57503b(baseMusLoginFragment, false);
                }
            }

            /* renamed from: a */
            public final void mo57251a(String str) {
                super.mo57251a(str);
                if (MusLoginVerifyThirdFragment.this.getActivity() != null) {
                    MusLoginVerifyThirdFragment.this.mo57502a(false);
                }
            }

            /* renamed from: c */
            public final void mo57258c(String str) {
                MusLoginVerifyThirdFragment.this.mo57502a(false);
                C10761a.m31396b(MusLoginVerifyThirdFragment.this.getContext(), str, 0).mo25750a();
            }

            /* renamed from: a */
            public final void mo57253a(JSONObject jSONObject) {
                if (MusLoginVerifyThirdFragment.this.isViewValid() && MusLoginVerifyThirdFragment.this.getContext() != null) {
                    MusLoginVerifyThirdFragment.this.mo57502a(false);
                    if (MusLoginVerifyThirdFragment.this.getActivity() instanceof MusLoginActivity) {
                        ((MusLoginActivity) MusLoginVerifyThirdFragment.this.getActivity()).f57129a = null;
                    }
                    if (MusLoginVerifyThirdFragment.this.f57711u.equals("email")) {
                        new C21222g().mo57149b("email").mo57148a("1").mo57141b();
                        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", C21592t.f57969a).mo56946a("enter_from", C21592t.f57970b).mo56946a("platform", "email").mo56946a("enter_type", MusLoginVerifyThirdFragment.this.f57413m).mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    } else if (MusLoginVerifyThirdFragment.this.f57711u.equals("username")) {
                        C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", MusLoginVerifyThirdFragment.this.f57412l).mo56946a("enter_from", MusLoginVerifyThirdFragment.this.f57411k).mo56946a("enter_type", MusLoginVerifyThirdFragment.this.f57413m).mo56946a("platform", "handle").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    }
                    try {
                        new C18893a();
                        MusLoginVerifyThirdFragment.m71873a(jSONObject.optJSONObject("data"), (C12898b) C18893a.m61663b(jSONObject));
                    } catch (Exception unused) {
                    }
                    if (MusLoginVerifyThirdFragment.this.f57409h != null) {
                        Bundle bundle = new Bundle(MusLoginVerifyThirdFragment.this.getArguments());
                        bundle.putString("platform", "mobile");
                        MusLoginVerifyThirdFragment.this.f57409h.mo57193a(bundle);
                    }
                }
            }

            /* renamed from: a */
            public final void mo57254a(JSONObject jSONObject, int i, String str) {
                if (MusLoginVerifyThirdFragment.this.isViewValid() && MusLoginVerifyThirdFragment.this.getContext() != null) {
                    MusLoginVerifyThirdFragment.this.mo57502a(false);
                    if (MusLoginVerifyThirdFragment.this.f57711u.equals("email")) {
                        new C21222g().mo57149b("email").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "email").mo56946a("enter_method", MusLoginVerifyThirdFragment.this.f57412l).mo56946a("enter_type", MusLoginVerifyThirdFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    } else if (MusLoginVerifyThirdFragment.this.f57711u.equals("username")) {
                        new C21222g().mo57149b("username").mo57148a("0").mo57150c(String.valueOf(i)).mo57151d("/passport/user/login/").mo57141b();
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", "username").mo56946a("enter_method", MusLoginVerifyThirdFragment.this.f57412l).mo56946a("enter_type", MusLoginVerifyThirdFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                    }
                    if (i != 2006 || !TextUtils.isEmpty(str)) {
                        C10761a.m31396b(MusLoginVerifyThirdFragment.this.getContext(), str, 0).mo25750a();
                    } else {
                        C10761a.m31399c(MusLoginVerifyThirdFragment.this.getContext(), (int) R.string.c6b).mo25750a();
                    }
                }
            }
        };
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
                    if (fVar == null) {
                        C10761a.m31399c(MusLoginVerifyThirdFragment.this.getContext(), (int) R.string.b23).mo25750a();
                    } else if (fVar.f33701a) {
                        String str = fVar.f33710g;
                        if (MusLoginVerifyThirdFragment.this.f57711u.equals("email")) {
                            MusLoginVerifyThirdFragment.this.mo57509e().mo57220b(MusLoginVerifyThirdFragment.this.f57709s, MusLoginVerifyThirdFragment.this.f57710t, str, "", MusLoginVerifyThirdFragment.this.f57713w);
                        } else {
                            if (MusLoginVerifyThirdFragment.this.f57711u.equals("username")) {
                                MusLoginVerifyThirdFragment.this.mo57509e().mo57216a(MusLoginVerifyThirdFragment.this.f57714x, MusLoginVerifyThirdFragment.this.f57710t, str, "", MusLoginVerifyThirdFragment.this.f57713w);
                            }
                        }
                    } else if (fVar.f33702b <= 0 || TextUtils.isEmpty(fVar.f33703c)) {
                        C10761a.m31399c(MusLoginVerifyThirdFragment.this.getContext(), (int) R.string.b23).mo25750a();
                    } else {
                        C10761a.m31403c(MusLoginVerifyThirdFragment.this.getContext(), fVar.f33703c).mo25750a();
                    }
                }
            });
            return;
        }
        getActivity().onBackPressed();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mBtnConfirm.setText(getString(R.string.e79));
        this.mTvBindDetail.setText(getString(R.string.e7b));
        this.f57525n.start();
        return onCreateView;
    }

    /* renamed from: a */
    public static MusLoginVerifyThirdFragment m72086a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        MusLoginVerifyThirdFragment musLoginVerifyThirdFragment = new MusLoginVerifyThirdFragment();
        Bundle bundle = new Bundle();
        bundle.putString("username", str);
        bundle.putString("logintype", str2);
        bundle.putString("platform", str4);
        bundle.putString("email", str5);
        bundle.putString("password", str6);
        bundle.putString("countrycodePhone", str3);
        bundle.putString("enter_from", str7);
        bundle.putString("enter_method", str8);
        musLoginVerifyThirdFragment.setArguments(bundle);
        return musLoginVerifyThirdFragment;
    }
}
