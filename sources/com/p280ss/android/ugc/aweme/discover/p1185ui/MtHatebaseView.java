package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.MtHatebaseView */
public class MtHatebaseView extends LinearLayout implements C10778e {

    /* renamed from: a */
    private LinearLayout f71016a;

    /* renamed from: b */
    private FrameLayout f71017b;

    /* renamed from: c */
    private ImageView f71018c;

    /* renamed from: d */
    private DmtTextView f71019d;

    /* renamed from: e */
    private TextView f71020e;

    /* renamed from: f */
    private int f71021f = C6394b.m19903a().f18686a;

    /* renamed from: g */
    private C27006ak f71022g;

    /* renamed from: a */
    private void m88397a() {
        if (C0991u.m4220h(this) == 1 && VERSION.SDK_INT >= 17) {
            setLayoutDirection(0);
            this.f71016a.setLayoutDirection(1);
        }
    }

    /* renamed from: b */
    private void m88398b() {
        if (this.f71022g.f71294d) {
            this.f71017b.setVisibility(0);
            this.f71018c.setImageDrawable(this.f71022g.f71291a);
            return;
        }
        this.f71017b.setVisibility(8);
    }

    /* renamed from: c */
    private void m88399c() {
        if (this.f71022g.f71295e) {
            this.f71019d.setText(this.f71022g.f71292b);
        }
        if (this.f71022g.f71297g) {
            C1056n.m4567a((TextView) this.f71019d, (int) R.style.ss);
        }
    }

    /* renamed from: d */
    private void m88400d() {
        if (this.f71022g.f71296f) {
            this.f71020e.setHighlightColor(getResources().getColor(R.color.ac4));
            this.f71020e.setMovementMethod(LinkMovementMethod.getInstance());
            this.f71020e.setText(this.f71022g.f71293c);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f71016a = (LinearLayout) findViewById(R.id.bir);
        this.f71017b = (FrameLayout) findViewById(R.id.bi3);
        this.f71018c = (ImageView) findViewById(R.id.b8x);
        this.f71019d = (DmtTextView) findViewById(R.id.e3f);
        this.f71020e = (TextView) findViewById(R.id.dt5);
        m88397a();
    }

    /* renamed from: e */
    private void m88401e() {
        int i;
        int i2;
        int i3;
        if (this.f71016a != null && this.f71022g != null) {
            Resources resources = getResources();
            if (this.f71019d != null) {
                if (this.f71022g.f71297g) {
                    DmtTextView dmtTextView = this.f71019d;
                    if (this.f71021f == 0) {
                        i3 = resources.getColor(R.color.ay2);
                    } else {
                        i3 = resources.getColor(R.color.ay1);
                    }
                    dmtTextView.setTextColor(i3);
                } else {
                    DmtTextView dmtTextView2 = this.f71019d;
                    if (this.f71021f == 0) {
                        i2 = R.color.axy;
                    } else {
                        i2 = R.color.axx;
                    }
                    dmtTextView2.setTextColor(resources.getColor(i2));
                }
            }
            if (this.f71020e != null) {
                TextView textView = this.f71020e;
                if (this.f71021f == 0) {
                    i = resources.getColor(R.color.ay2);
                } else {
                    i = resources.getColor(R.color.ay1);
                }
                textView.setTextColor(i);
            }
        }
    }

    public MtHatebaseView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f71021f != i) {
            this.f71021f = i;
            m88401e();
        }
    }

    public void setStatus(C27006ak akVar) {
        if (akVar != null) {
            this.f71022g = akVar;
            m88398b();
            m88399c();
            m88400d();
            m88401e();
        }
    }

    public MtHatebaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MtHatebaseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
