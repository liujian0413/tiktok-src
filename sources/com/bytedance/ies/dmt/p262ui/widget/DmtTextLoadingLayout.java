package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p564d.C10788b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtTextLoadingLayout */
public class DmtTextLoadingLayout extends FrameLayout implements C10778e, C10809e {

    /* renamed from: a */
    private DoubleColorBallAnimationView f29085a;

    /* renamed from: b */
    private DmtTextView f29086b;

    /* renamed from: c */
    private LinearLayout f29087c;

    /* renamed from: d */
    private int f29088d;

    /* renamed from: e */
    private boolean f29089e;

    /* renamed from: f */
    private int f29090f;

    /* renamed from: a */
    private void m31647a() {
        if (this.f29089e) {
            LayoutParams layoutParams = (LayoutParams) this.f29087c.getLayoutParams();
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int b = (((C10788b.m31501b(getContext()) - this.f29090f) - iArr[1]) / 2) - (this.f29087c.getMeasuredHeight() / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = b;
            this.f29087c.setLayoutParams(layoutParams);
        }
    }

    public DmtTextLoadingLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f29088d != i) {
            this.f29088d = i;
        }
    }

    public void setBoxViewBackground(Drawable drawable) {
        C0991u.m4185a((View) this.f29087c, drawable);
    }

    public void setBottomText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f29086b.setText(str);
        }
    }

    public void setUseScreenHeight(int i) {
        this.f29089e = true;
        this.f29090f = i;
        m31647a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f29085a != null) {
            if (i == 0) {
                this.f29085a.mo25976a();
                return;
            }
            if (this.f29085a.f29091a) {
                this.f29085a.mo25977b();
            }
        }
    }

    /* renamed from: a */
    private void m31648a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.a8_, this, true);
        this.f29085a = (DoubleColorBallAnimationView) inflate.findViewById(R.id.aa5);
        this.f29086b = (DmtTextView) inflate.findViewById(R.id.dqx);
        this.f29087c = (LinearLayout) inflate.findViewById(R.id.bqg);
    }

    public DmtTextLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtTextLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29088d = C6394b.m19903a().f18686a;
        m31648a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m31647a();
    }
}
