package com.bytedance.android.live.wallet.model;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.host.PayChannel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.wallet.model.a */
public abstract class C3810a {

    /* renamed from: b */
    public ViewGroup f11320b;

    /* renamed from: c */
    public ImageView f11321c;

    /* renamed from: d */
    public TextView f11322d;

    /* renamed from: e */
    public TextView f11323e;

    /* renamed from: f */
    public TextView f11324f;

    /* renamed from: g */
    public TextView f11325g;

    /* renamed from: h */
    public CheckBox f11326h;

    /* renamed from: i */
    public View f11327i;

    /* renamed from: j */
    public long f11328j;

    /* renamed from: k */
    int f11329k;

    /* renamed from: l */
    int f11330l;

    /* renamed from: m */
    String f11331m;

    /* renamed from: n */
    public String f11332n;

    /* renamed from: o */
    public String f11333o;

    /* renamed from: p */
    public boolean f11334p;

    /* renamed from: q */
    public PayChannel f11335q;

    /* renamed from: r */
    public String f11336r;

    /* renamed from: s */
    public C3811a f11337s;

    /* renamed from: com.bytedance.android.live.wallet.model.a$a */
    public interface C3811a {
        /* renamed from: a */
        void mo11250a(C3810a aVar, boolean z);
    }

    /* renamed from: a */
    public abstract boolean mo11241a();

    /* renamed from: b */
    public abstract void mo11242b();

    /* renamed from: c */
    public final void mo11328c() {
        m13568a(mo11241a());
        mo11242b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11326a(View view) {
        if (this.f11337s != null) {
            this.f11337s.mo11250a(this, this.f11326h.isChecked());
        }
    }

    /* renamed from: a */
    private void m13568a(boolean z) {
        int childCount = this.f11320b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f11320b.getChildAt(i).setEnabled(false);
        }
        if (z) {
            this.f11321c.setImageResource(this.f11329k);
        } else {
            this.f11321c.setImageResource(this.f11330l);
        }
    }

    /* renamed from: a */
    public final void mo11327a(ViewGroup viewGroup) {
        this.f11320b = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.asy, viewGroup, false);
        this.f11321c = (ImageView) this.f11320b.findViewById(R.id.bav);
        this.f11322d = (TextView) this.f11320b.findViewById(R.id.dzb);
        this.f11323e = (TextView) this.f11320b.findViewById(R.id.dz8);
        this.f11324f = (TextView) this.f11320b.findViewById(R.id.dza);
        this.f11325g = (TextView) this.f11320b.findViewById(R.id.e0d);
        this.f11326h = (CheckBox) this.f11320b.findViewById(R.id.vh);
        this.f11327i = this.f11320b.findViewById(R.id.a9q);
        this.f11321c.setBackgroundResource(this.f11329k);
        this.f11322d.setText(this.f11331m);
        this.f11323e.setText(this.f11332n);
        if (!TextUtils.isEmpty(this.f11333o)) {
            this.f11324f.setVisibility(0);
            this.f11324f.setText(this.f11333o);
        }
        if (this.f11334p) {
            this.f11325g.setVisibility(0);
        }
        if (!mo11241a()) {
            m13568a(false);
        }
        this.f11320b.setOnClickListener(new C3812b(this));
        mo11242b();
        viewGroup.addView(this.f11320b);
    }

    public C3810a(long j, int i, int i2, String str, PayChannel payChannel) {
        this.f11328j = j;
        this.f11329k = i;
        this.f11330l = i2;
        this.f11331m = str;
        this.f11335q = payChannel;
    }
}
