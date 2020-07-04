package com.p280ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37352b;
import com.p280ss.android.ugc.aweme.sdk.iap.C37350e.C37353c;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.C37332a;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.CoinListAdapter;
import com.p280ss.android.ugc.aweme.sdk.iap.adapter.CoinListAdapter.C37331a;
import com.p280ss.android.ugc.aweme.sdk.iap.utils.C37373e;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity */
public class IapWalletActivity extends AmeActivity implements OnClickListener, C37353c {

    /* renamed from: a */
    public C37352b f97474a;

    /* renamed from: b */
    private View f97475b;

    /* renamed from: c */
    private View f97476c;

    /* renamed from: d */
    private TextView f97477d;

    /* renamed from: e */
    private TextView f97478e;

    /* renamed from: f */
    private RecyclerView f97479f;

    /* renamed from: g */
    private CoinListAdapter f97480g;

    /* renamed from: h */
    private TextView f97481h;

    /* renamed from: b */
    public final Activity mo93944b() {
        return this;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: d */
    public final void mo93946d() {
        if (isViewValid()) {
            dismissProgressDialog();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f97474a != null) {
            this.f97474a.mo93989e();
        }
    }

    /* renamed from: c */
    public final void mo93945c() {
        if (isViewValid()) {
            showProgressDialog(getString(R.string.c17));
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onResume", true);
        super.onResume();
        if (this.f97474a != null) {
            this.f97474a.mo93988d();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onResume", false);
    }

    /* renamed from: f */
    private void m119834f() {
        this.f97480g = new CoinListAdapter();
        this.f97480g.f97494a = new C37331a() {
            /* renamed from: a */
            public final void mo93950a(View view, C37332a aVar) {
                IapWalletActivity.this.f97474a.mo93985a(aVar.f97500b, aVar.f97499a);
            }
        };
        this.f97479f.setLayoutManager(new LinearLayoutManager(this));
        this.f97479f.setHasFixedSize(true);
        this.f97479f.setAdapter(this.f97480g);
        String stringExtra = getIntent().getStringExtra("extra_iap_key");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        this.f97474a = new C37354f((C37353c) this, stringExtra);
        this.f97474a.mo93983a();
    }

    /* renamed from: a */
    public final boolean mo93943a() {
        return isViewValid();
    }

    /* renamed from: e */
    private void m119833e() {
        URLSpan[] uRLSpanArr;
        ((TextView) findViewById(R.id.e3f)).getPaint().setFakeBoldText(true);
        this.f97477d = (TextView) findViewById(R.id.ds0);
        this.f97477d.getPaint().setFakeBoldText(true);
        this.f97481h = (TextView) findViewById(R.id.dsd);
        SpannableString spannableString = new SpannableString(this.f97481h.getText());
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            spannableString.setSpan(new UnderlineSpan() {
                public void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
        }
        this.f97478e = (TextView) findViewById(R.id.e0t);
        this.f97475b = findViewById(R.id.bik);
        this.f97475b.setVisibility(8);
        this.f97479f = (RecyclerView) findViewById(R.id.cqr);
        this.f97476c = findViewById(R.id.bil);
        this.f97476c.setVisibility(8);
        findViewById(R.id.b6a).setOnClickListener(this);
        this.f97475b.setOnClickListener(this);
        this.f97476c.setOnClickListener(this);
        m119832a((Activity) this);
    }

    /* renamed from: a */
    public final void mo93942a(List<C37332a> list) {
        this.f97480g.mo93954a(list);
    }

    /* renamed from: a */
    public final void mo93941a(C37330a aVar) {
        C1081a aVar2 = new C1081a(this, R.style.rk);
        aVar.mo93952a(aVar2);
        aVar2.mo4245c();
    }

    /* renamed from: a */
    private static void m119832a(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dd);
        m119833e();
        m119834f();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.sdk.iap.IapWalletActivity", "onCreate", false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.b6a) {
            finish();
        } else if (view.getId() == R.id.bik) {
            this.f97474a.mo93986b();
        } else {
            if (view.equals(this.f97476c)) {
                this.f97474a.mo93987c();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f97474a != null) {
            this.f97474a.mo93984a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo93940a(long j, long j2, boolean z, boolean z2) {
        this.f97477d.setText(C37373e.m119965a(j));
        int i = 0;
        if (j2 <= 0 || !z) {
            this.f97475b.setVisibility(8);
        } else {
            this.f97475b.setVisibility(0);
            this.f97478e.setText(C37373e.m119965a(j2));
        }
        View view = this.f97476c;
        if (!z2) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
