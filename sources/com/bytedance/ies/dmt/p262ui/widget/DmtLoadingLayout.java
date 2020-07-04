package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p564d.C10788b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout */
public class DmtLoadingLayout extends FrameLayout implements C10778e, C10809e {

    /* renamed from: a */
    private View f29069a;

    /* renamed from: b */
    private FrameLayout f29070b;

    /* renamed from: c */
    private int f29071c;

    /* renamed from: d */
    private boolean f29072d;

    /* renamed from: e */
    private int f29073e;

    /* renamed from: a */
    private void m31608a() {
        if (this.f29072d) {
            LayoutParams layoutParams = (LayoutParams) this.f29070b.getLayoutParams();
            int i = layoutParams.height;
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int b = (((C10788b.m31501b(getContext()) - this.f29073e) - iArr[1]) / 2) - (i / 2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = b;
            this.f29070b.setLayoutParams(layoutParams);
        }
    }

    public DmtLoadingLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo25766a(int i) {
        if (this.f29071c != i) {
            this.f29071c = i;
        }
    }

    public void setUseScreenHeight(int i) {
        this.f29072d = true;
        this.f29073e = i;
        m31608a();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f29069a != null) {
            this.f29069a.setVisibility(i);
        }
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            LayoutParams layoutParams = (LayoutParams) this.f29069a.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            this.f29069a.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private void m31609a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.a83, this, true);
        this.f29069a = inflate.findViewById(R.id.aa4);
        this.f29070b = (FrameLayout) inflate.findViewById(R.id.cl0);
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtLoadingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29071c = C6394b.m19903a().f18686a;
        m31609a(context);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m31608a();
    }
}
