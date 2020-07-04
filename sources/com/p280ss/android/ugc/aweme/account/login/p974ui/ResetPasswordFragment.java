package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12718b;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ResetPasswordFragment */
public class ResetPasswordFragment extends BaseResetPasswordFragment {

    /* renamed from: G */
    private String f58517G = "user_click";

    /* renamed from: H */
    private C12728d f58518H;

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final String mo58176z() {
        return this.f58517G;
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58348u != null) {
            ((CheckButton) this.f58348u).mo58186d();
        }
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58348u != null) {
            ((CheckButton) this.f58348u).mo58184b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo58163j() {
        final String trim = this.f58345r.getText().toString().trim();
        this.f58518H.mo31182a(trim, (C12718b) new C12718b() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onSuccess(C12730b bVar) {
                ResetPasswordFragment.this.mo58160a(ResetPasswordFragment.this.f58344q.getText().toString(), trim, null);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12730b bVar, int i) {
                C10761a.m31403c(ResetPasswordFragment.this.getContext(), C22338o.m73945a((C12707b) bVar)).mo25750a();
            }
        });
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f58518H = C12798d.m37186a(getContext());
        this.f58358A = (TextView) view.findViewById(R.id.d8h);
        this.f58359B = (TextView) view.findViewById(R.id.aqc);
        this.f58347t.setTextSize(26.0f);
        String str = "";
        if (!TextUtils.isEmpty(this.f58350w)) {
            str = this.f58350w;
        } else if (!TextUtils.isEmpty(this.f58349v)) {
            str = this.f58349v;
        }
        String a = C1642a.m8034a(getString(R.string.b76), new Object[]{str});
        if (a != null) {
            i = a.indexOf(str);
        } else {
            i = 0;
        }
        SpannableString spannableString = new SpannableString(a);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a71)), i, str.length() + i, 17);
        this.f58343e.setText(spannableString);
        this.f58348u.setEnabled(false);
        super.mo58156r();
        this.f58517G = "auto_system";
        this.f58358A.performClick();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.qi, viewGroup, false);
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.dan);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C23482j.m77101d();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
