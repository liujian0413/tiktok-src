package com.p280ss.android.ugc.aweme.p1685ug.referral;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.common.internal.ImmutableMap;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.b */
public final class C42743b extends Dialog {

    /* renamed from: a */
    public final String f111059a;

    /* renamed from: b */
    private final String f111060b;

    /* renamed from: c */
    private final String f111061c;

    /* renamed from: d */
    private final String f111062d;

    /* renamed from: e */
    private final Activity f111063e;

    /* renamed from: f */
    private CircleImageView f111064f;

    /* renamed from: g */
    private DmtTextView f111065g;

    /* renamed from: h */
    private DmtTextView f111066h;

    /* renamed from: i */
    private DmtButton f111067i;

    /* renamed from: j */
    private ImageView f111068j;

    /* renamed from: a */
    private void m135675a() {
        this.f111064f = (CircleImageView) findViewById(R.id.bdf);
        this.f111065g = (DmtTextView) findViewById(R.id.dwa);
        this.f111066h = (DmtTextView) findViewById(R.id.dwb);
        this.f111067i = (DmtButton) findViewById(R.id.rm);
        this.f111068j = (ImageView) findViewById(R.id.b6v);
    }

    /* renamed from: b */
    private void m135676b() {
        C23323e.m76514a((RemoteImageView) this.f111064f, this.f111062d);
        this.f111065g.setText(getContext().getString(R.string.bvb, new Object[]{this.f111061c}));
        this.f111066h.setText(R.string.bvc);
        this.f111067i.setOnClickListener(new C42745c(this));
        this.f111068j.setOnClickListener(new C42746d(this));
    }

    /* renamed from: c */
    private void m135677c() {
        C6907h.m21524a("referral_sign_up_click", ImmutableMap.m38918of("referral_code", this.f111059a, "invite_user_id", this.f111060b));
        dismiss();
        C32656f.m105745a(this.f111063e, "", "creator_referral", (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo58663a() {
                try {
                    ReferCommitApi.m135669a(C42743b.this.f111059a);
                } catch (Exception unused) {
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104353a(View view) {
        dismiss();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo104354b(View view) {
        m135677c();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42747e.f111072a = true;
        C6907h.m21524a("referral_pop_up", ImmutableMap.m38918of("referral_code", this.f111059a, "invite_user_id", this.f111060b));
    }

    public C42743b(Context context, Activity activity, String str, String str2, String str3, String str4) {
        super(context);
        getWindow().setBackgroundDrawableResource(R.color.ac4);
        getWindow().requestFeature(1);
        setContentView(R.layout.a_b);
        setCanceledOnTouchOutside(false);
        this.f111060b = str;
        this.f111061c = str2;
        this.f111062d = str3;
        this.f111059a = str4;
        this.f111063e = activity;
        m135675a();
        m135676b();
    }
}
