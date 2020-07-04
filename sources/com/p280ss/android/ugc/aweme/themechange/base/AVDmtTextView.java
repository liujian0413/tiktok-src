package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.AVDmtTextView */
public final class AVDmtTextView extends DmtTextView {

    /* renamed from: b */
    private boolean f109593b;

    /* renamed from: c */
    private boolean f109594c;

    /* renamed from: d */
    private boolean f109595d;

    /* renamed from: e */
    private boolean f109596e;

    /* renamed from: f */
    private boolean f109597f;

    /* renamed from: g */
    private int f109598g;

    /* renamed from: h */
    private int f109599h;

    /* renamed from: i */
    private int f109600i;

    /* renamed from: j */
    private boolean f109601j;

    /* renamed from: k */
    private Typeface f109602k;

    /* renamed from: l */
    private boolean f109603l;

    /* renamed from: m */
    private boolean f109604m;

    public AVDmtTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo1061a() {
        if (C6399b.m19944t()) {
            setTextSize(12.0f);
            mo103533b();
            return;
        }
        setTextSize(11.0f);
        setTypeface(Typeface.defaultFromStyle(0));
    }

    /* renamed from: b */
    public final void mo103533b() {
        if (this.f109602k == null) {
            this.f109602k = C10832b.m31784a().mo26161a(C10834d.f29337g);
        }
        setTypeface(this.f109602k);
    }

    public final void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.f109596e) {
            if (z) {
                i = this.f109598g;
            } else {
                i = this.f109599h;
            }
            setTextColor(i);
        }
    }

    /* renamed from: a */
    public final void mo103532a(boolean z) {
        this.f109604m = z;
        if (!z) {
            setTextColor(this.f109598g);
        } else if (this.f109594c) {
            setTextColor(this.f109600i);
        }
    }

    public final void setEnableUI(boolean z) {
        if (!z) {
            setTextColor(getResources().getColor(R.color.dr));
        } else if (!this.f109604m) {
            setTextColor(this.f109598g);
        } else if (this.f109594c) {
            setTextColor(this.f109600i);
        }
    }

    public final void setOldPanelStyle(boolean z) {
        int i;
        this.f109593b = z;
        this.f109598g = C42111b.f109618a.mo103541a(this.f109593b);
        this.f109599h = C42111b.m134049a(this.f109598g);
        if (this.f109597f) {
            i = this.f109598g;
        } else {
            i = this.f109599h;
        }
        setTextColor(i);
    }

    /* renamed from: a */
    private final void m134033a(Context context, AttributeSet attributeSet) {
        int i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f109593b = obtainStyledAttributes.getBoolean(26, false);
            this.f109594c = obtainStyledAttributes.getBoolean(2, true);
            this.f109595d = obtainStyledAttributes.getBoolean(7, false);
            this.f109596e = obtainStyledAttributes.getBoolean(9, false);
            this.f109597f = obtainStyledAttributes.getBoolean(10, true);
            this.f109601j = obtainStyledAttributes.getBoolean(6, true);
            this.f109603l = obtainStyledAttributes.getBoolean(32, false);
            obtainStyledAttributes.recycle();
        }
        if (this.f109603l) {
            setBackgroundDrawable(C42111b.f109618a.mo103544a(context, attributeSet));
        }
        this.f109600i = getResources().getColor(R.color.a76);
        this.f109598g = C42111b.f109618a.mo103541a(this.f109593b);
        this.f109599h = C42111b.m134049a(this.f109598g);
        if (this.f109601j) {
            if (this.f109597f) {
                i = this.f109598g;
            } else {
                i = this.f109599h;
            }
            setTextColor(i);
        }
    }

    public AVDmtTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109594c = true;
        this.f109597f = true;
        this.f109601j = true;
        this.f109602k = C10832b.m31784a().mo26161a(C10834d.f29337g);
        m134033a(context, attributeSet);
    }

    public /* synthetic */ AVDmtTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
