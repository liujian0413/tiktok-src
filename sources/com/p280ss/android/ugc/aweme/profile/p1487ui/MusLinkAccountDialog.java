package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C14972a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.api.C15041e.C15042a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.api.client.googleapis.auth.p775a.C17216c;
import com.google.api.client.googleapis.auth.p775a.C17216c.C17217a;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.json.p779a.C17280a;
import com.google.api.client.p770a.p771a.p772a.C17191a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusLinkAccountDialog */
public class MusLinkAccountDialog extends DialogFragment implements OnClickListener, C15040c {

    /* renamed from: h */
    private static final String f94769h;

    /* renamed from: a */
    public C36403cq f94770a;

    /* renamed from: b */
    private View f94771b;

    /* renamed from: c */
    private View f94772c;

    /* renamed from: d */
    private View f94773d;

    /* renamed from: e */
    private String f94774e;

    /* renamed from: f */
    private final C17272u f94775f = C17191a.m57039a();

    /* renamed from: g */
    private final C17291c f94776g = new C17280a();

    /* renamed from: i */
    private GoogleSignInOptions f94777i;

    /* renamed from: j */
    private C15037d f94778j;

    /* renamed from: k */
    private C17216c f94779k;

    /* renamed from: a */
    public final void mo38259a(ConnectionResult connectionResult) {
    }

    static {
        String str;
        if (C6399b.m19947w()) {
            str = "dehbnbz2mthw7Wlc15DqnFlN";
        } else {
            str = "3MPMZ1Eqw9FcFUgkJWAxNbj1";
        }
        f94769h = str;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f94778j != null && this.f94778j.mo38249j()) {
            this.f94778j.mo38234a(getActivity());
            this.f94778j.mo38246g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo92077a(Status status) {
        m116768a("google");
    }

    /* renamed from: a */
    private void m116767a(View view) {
        this.f94771b = view.findViewById(R.id.bml);
        this.f94772c = view.findViewById(R.id.bmm);
        this.f94773d = view.findViewById(R.id.c57);
        this.f94771b.setOnClickListener(this);
        this.f94772c.setOnClickListener(this);
        this.f94773d.setOnClickListener(this);
    }

    /* renamed from: a */
    private void m116768a(String str) {
        if (getActivity() != null) {
            Intent authorizeActivityStartIntent = C6861a.m21335d().getAuthorizeActivityStartIntent(getActivity());
            authorizeActivityStartIntent.putExtra("platform", str);
            authorizeActivityStartIntent.putExtra("enter_from", this.f94774e);
            authorizeActivityStartIntent.putExtra("enter_method", "");
            authorizeActivityStartIntent.putExtra("is_login", false);
            getActivity().startActivityForResult(authorizeActivityStartIntent, 1001);
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.bml) {
            m116768a("facebook");
            C6907h.m21524a("link_account_click", (Map) C22984d.m75611a().mo59973a("platform", "facebook").f60753a);
        } else if (id == R.id.bmm) {
            if (this.f94778j == null) {
                m116768a("google");
            } else {
                C14941a.f38654h.mo38099b(this.f94778j).mo38261a((C15042a) new C36368bi(this));
            }
            C6907h.m21524a("link_account_click", (Map) C22984d.m75611a().mo59973a("platform", "google").f60753a);
        } else {
            if (id == R.id.c57) {
                C6907h.m21524a("link_account_skip", (Map) C22984d.m75611a().f60753a);
                dismiss();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f94774e = arguments.getString("enter_from", "");
        }
        C6907h.m21524a("link_account_show", (Map) C22984d.m75611a().f60753a);
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(getContext()) == 0) {
            this.f94777i = new C14972a(GoogleSignInOptions.f38788f).mo38089a(new Scope("https://www.googleapis.com/auth/youtube"), new Scope[0]).mo38091a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com", true).mo38090a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com").mo38094d();
            try {
                this.f94778j = new C15038a(getContext()).mo38251a(getActivity(), (C15040c) this).mo38253a(C14941a.f38651e, this.f94777i).mo38256a();
            } catch (Exception unused) {
            }
            this.f94779k = new C17217a().mo44493a(this.f94775f).mo44494a(this.f94776g).mo44513a("340331662088-6ubo66ljal3ianb35dr9clu3p0ea7v64.apps.googleusercontent.com", f94769h).mo44514a();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(R.layout.kh, viewGroup);
        m116767a(inflate);
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            if (i2 == -1) {
                C10761a.m31383a(getContext(), (int) R.string.cdr).mo25750a();
                if (this.f94770a != null) {
                    this.f94770a.mo92493a();
                }
                dismiss();
                return;
            }
            if (intent != null) {
                str = intent.getStringExtra("description");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                C10761a.m31403c(getContext(), str).mo25750a();
                return;
            }
            C10761a.m31399c(getContext(), (int) R.string.cdq).mo25750a();
        }
    }
}
