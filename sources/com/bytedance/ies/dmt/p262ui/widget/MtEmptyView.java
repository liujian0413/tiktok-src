package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.MtEmptyView */
public class MtEmptyView extends LinearLayout implements C10778e, C10808d {

    /* renamed from: a */
    private LinearLayout f29108a;

    /* renamed from: b */
    private FrameLayout f29109b;

    /* renamed from: c */
    private ImageView f29110c;

    /* renamed from: d */
    private DmtTextView f29111d;

    /* renamed from: e */
    private DmtTextView f29112e;

    /* renamed from: f */
    private int f29113f = C6394b.m19903a().f18686a;

    /* renamed from: g */
    private C10805b f29114g;

    /* renamed from: a */
    private void m31658a() {
        if (C0991u.m4220h(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f29108a.setLayoutDirection(1);
        }
    }

    /* renamed from: b */
    private void m31659b() {
        if (this.f29114g.f29126j) {
            this.f29109b.setVisibility(0);
            this.f29110c.setImageDrawable(this.f29114g.f29117a);
            return;
        }
        this.f29109b.setVisibility(8);
    }

    /* renamed from: c */
    private void m31660c() {
        if (this.f29114g.f29127k) {
            this.f29111d.setText(this.f29114g.f29118b);
        }
        if (this.f29114g.f29130n) {
            C1056n.m4567a((TextView) this.f29111d, (int) R.style.ss);
        }
    }

    /* renamed from: d */
    private void m31661d() {
        if (this.f29114g.f29128l) {
            this.f29112e.setText(this.f29114g.f29119c);
            if (this.f29114g.f29129m) {
                this.f29112e.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f29108a = (LinearLayout) findViewById(R.id.bir);
        this.f29109b = (FrameLayout) findViewById(R.id.bi3);
        this.f29110c = (ImageView) findViewById(R.id.b8x);
        this.f29111d = (DmtTextView) findViewById(R.id.e3f);
        this.f29112e = (DmtTextView) findViewById(R.id.dt5);
        m31658a();
    }

    /* renamed from: e */
    private void m31662e() {
        int i;
        int i2;
        int i3;
        if (this.f29108a != null && this.f29114g != null) {
            Resources resources = getResources();
            if (this.f29111d != null) {
                if (this.f29114g.f29130n) {
                    DmtTextView dmtTextView = this.f29111d;
                    if (this.f29113f == 0) {
                        i3 = resources.getColor(R.color.ay2);
                    } else {
                        i3 = resources.getColor(R.color.ay1);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f29111d;
                    if (this.f29113f == 0) {
                        i2 = R.color.axy;
                    } else {
                        i2 = R.color.axx;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f29112e != null) {
                DmtTextView dmtTextView3 = this.f29112e;
                if (this.f29113f == 0) {
                    i = resources.getColor(R.color.ay2);
                } else {
                    i = resources.getColor(R.color.ay1);
                }
                dmtTextView3.setTextColor(i);
            }
        }
    }

    public MtEmptyView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static MtEmptyView m31657a(Context context) {
        return (MtEmptyView) LayoutInflater.from(context).inflate(R.layout.a93, null);
    }

    public void setStatus(C10805b bVar) {
        if (bVar != null) {
            this.f29114g = bVar;
            m31659b();
            m31660c();
            m31661d();
            m31662e();
        }
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f29113f != i) {
            this.f29113f = i;
            m31662e();
        }
    }

    public MtEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
