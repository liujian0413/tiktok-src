package com.p280ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.CircularAnimateButton */
public class CircularAnimateButton extends AppCompatButton {

    /* renamed from: b */
    private int f110654b;

    /* renamed from: c */
    private C42564c f110655c;

    /* renamed from: d */
    private int f110656d;

    /* renamed from: e */
    private int f110657e;

    /* renamed from: f */
    private int f110658f;

    public CircularAnimateButton(Context context) {
        this(context, null);
    }

    public void setBackgroundColor(int i) {
        this.f110656d = i;
        this.f110655c = m135242a(i);
        setBackgroundCompat(this.f110655c.f110677c);
    }

    public void setBackgroundCompat(Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: b */
    public final void mo104148b(C42563b bVar) {
        C42560a a = m135241a((float) this.f110658f, (float) this.f110654b, this.f110658f, this.f110657e);
        a.f110663e = this.f110656d;
        a.f110664f = this.f110656d;
        a.f110665g = 0;
        a.f110666h = 0;
        a.mo104152a();
    }

    /* renamed from: a */
    private C42564c m135242a(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) C38501ax.m123066a(i, i, 0, this.f110654b);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) this.f110654b);
        C42564c cVar = new C42564c(gradientDrawable);
        cVar.mo104156b(i);
        cVar.mo104155a(0);
        return cVar;
    }

    /* renamed from: a */
    public final void mo104147a(C42563b bVar) {
        C42560a a = m135241a((float) this.f110654b, (float) this.f110658f, this.f110657e, this.f110658f);
        a.f110663e = this.f110656d;
        a.f110664f = this.f110656d;
        a.f110665g = 0;
        a.f110666h = 0;
        a.f110659a = bVar;
        a.mo104152a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f110657e, this.f110658f);
    }

    public CircularAnimateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f110656d = context.getResources().getColor(R.color.a38);
        this.f110654b = (int) C9738o.m28708b(context, 22.0f);
        this.f110657e = (int) C9738o.m28708b(context, 230.0f);
        this.f110658f = (int) C9738o.m28708b(context, 44.0f);
        if (this.f110655c == null) {
            this.f110655c = m135242a(this.f110656d);
        }
        setBackgroundCompat(this.f110655c.f110677c);
    }

    /* renamed from: a */
    private C42560a m135241a(float f, float f2, int i, int i2) {
        C42560a aVar = new C42560a(this, this.f110655c);
        aVar.f110667i = f;
        aVar.f110668j = f2;
        aVar.f110661c = i;
        aVar.f110662d = i2;
        aVar.f110660b = C34943c.f91128x;
        return aVar;
    }
}
