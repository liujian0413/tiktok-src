package com.bytedance.ies.dmt.p262ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.p262ui.common.C10778e;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.titlebar.AbstractTitleBar */
public abstract class AbstractTitleBar extends FrameLayout implements C10778e {

    /* renamed from: a */
    protected DmtTextView f28975a;

    /* renamed from: b */
    protected int f28976b;

    /* renamed from: a */
    public abstract void mo25766a(int i);

    /* renamed from: a */
    public abstract void mo25857a(boolean z);

    public int getColorMode() {
        return this.f28976b;
    }

    public DmtTextView getTitleView() {
        return this.f28975a;
    }

    public abstract void setDividerLineBackground(int i);

    public AbstractTitleBar(Context context) {
        super(context);
    }

    public void setColorMode(int i) {
        if (this.f28976b != i) {
            this.f28976b = i;
            mo25766a(this.f28976b);
        }
        this.f28976b = i;
    }

    public void setTitle(int i) {
        if (this.f28975a != null) {
            this.f28975a.setText(i);
        }
    }

    public void setTitleColor(int i) {
        if (this.f28975a != null) {
            this.f28975a.setTextColor(i);
        }
    }

    public void setTitleSize(float f) {
        if (this.f28975a != null) {
            this.f28975a.setTextSize(f);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f28975a != null) {
            this.f28975a.setText(charSequence);
        }
    }

    public AbstractTitleBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
