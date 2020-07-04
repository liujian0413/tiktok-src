package com.bytedance.android.live.broadcast.share;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.common.utility.C6319n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class StartLiveShareView extends AbsStartLiveShareView {

    /* renamed from: e */
    ImageView f9158e;

    /* renamed from: f */
    ImageView f9159f;

    /* renamed from: g */
    ImageView f9160g;

    /* renamed from: g */
    private void m11409g() {
        this.f9158e.setImageResource(R.drawable.ca2);
        this.f9159f.setImageResource(R.drawable.cb2);
        this.f9160g.setImageResource(R.drawable.cb8);
    }

    /* renamed from: c */
    private void m11405c() {
        String[] strArr = (String[]) LiveSettingKeys.I18N_SHARE_CHANNEL_LIST.mo10240a();
        if (strArr != null) {
            for (String str : strArr) {
                if ("facebook".equals(str)) {
                    this.f9158e.setVisibility(0);
                } else if ("twitter".equals(str)) {
                    this.f9159f.setVisibility(0);
                } else if ("whatsapp".equals(str)) {
                    this.f9160g.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: d */
    private void m11406d() {
        if (!m11404a("whatsapp")) {
            C3517a.m12960a((Context) this.f9155b, (int) R.string.fg0);
            return;
        }
        m11409g();
        if (!"whatsapp".equals(this.f9154a)) {
            this.f9154a = "whatsapp";
            this.f9160g.setImageResource(R.drawable.cb9);
        } else {
            this.f9160g.setImageResource(R.drawable.cb8);
            this.f9154a = null;
        }
        C8448g.m25682a((Context) this.f9155b);
    }

    /* renamed from: e */
    private void m11407e() {
        if (!m11404a("facebook")) {
            C3517a.m12960a((Context) this.f9155b, (int) R.string.ejs);
            return;
        }
        m11409g();
        if (!"facebook".equals(this.f9154a)) {
            this.f9154a = "facebook";
            this.f9158e.setImageResource(R.drawable.ca3);
        } else {
            this.f9158e.setImageResource(R.drawable.ca2);
            this.f9154a = null;
        }
        C8448g.m25682a((Context) this.f9155b);
    }

    /* renamed from: f */
    private void m11408f() {
        if (!m11404a("twitter")) {
            C3517a.m12960a((Context) this.f9155b, (int) R.string.fed);
            return;
        }
        m11409g();
        if (!"twitter".equals(this.f9154a)) {
            this.f9154a = "twitter";
            this.f9159f.setImageResource(R.drawable.cb3);
        } else {
            this.f9159f.setImageResource(R.drawable.cb2);
            this.f9154a = null;
        }
        C8448g.m25682a((Context) this.f9155b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9666a() {
        inflate(getContext(), R.layout.ayt, this);
        this.f9158e = (ImageView) findViewById(R.id.ahp);
        this.f9159f = (ImageView) findViewById(R.id.e6_);
        this.f9160g = (ImageView) findViewById(R.id.egy);
        this.f9158e.setOnClickListener(this);
        this.f9159f.setOnClickListener(this);
        this.f9160g.setOnClickListener(this);
        m11405c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo9668b() {
        String str = (String) C8946b.f24489s.mo22117a();
        if (!TextUtils.isEmpty(str)) {
            if (C6319n.m19594a(str, "facebook")) {
                if (m11404a("facebook")) {
                    this.f9154a = "facebook";
                    this.f9158e.setImageResource(R.drawable.ca3);
                }
            } else if (C6319n.m19594a(str, "twitter")) {
                if (m11404a("twitter")) {
                    this.f9154a = "twitter";
                    this.f9159f.setImageResource(R.drawable.cb3);
                }
            } else if (C6319n.m19594a(str, "whatsapp") && m11404a("whatsapp")) {
                this.f9154a = "whatsapp";
                this.f9160g.setImageResource(R.drawable.cb9);
            }
            this.f9157d.mo9493a(this.f9154a);
        }
    }

    public StartLiveShareView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private boolean m11404a(String str) {
        return this.f9156c.isShareAvailable(str, this.f9155b);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.ahp) {
            m11407e();
        } else if (id == R.id.e6_) {
            m11408f();
        } else if (id == R.id.egy) {
            m11406d();
        }
        C8946b.f24489s.mo22118a(this.f9154a);
        super.onClick(view);
    }

    public StartLiveShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StartLiveShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
