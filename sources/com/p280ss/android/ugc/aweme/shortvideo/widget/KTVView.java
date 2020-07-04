package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23478e;
import com.p280ss.android.ugc.aweme.tools.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.KTVView */
public class KTVView extends View {

    /* renamed from: a */
    private Paint f108281a;

    /* renamed from: b */
    private int f108282b;

    /* renamed from: c */
    private int f108283c;

    /* renamed from: d */
    private int f108284d;

    public KTVView(Context context) {
        this(context, null);
    }

    public void setColor(int i) {
        this.f108281a.setColor(i);
        invalidate();
    }

    public void setLength(int i) {
        this.f108282b = i;
        this.f108284d = C23478e.m77084a(this.f108283c + this.f108282b, this.f108283c, getWidth() - getPaddingRight());
        invalidate();
    }

    public void setStart(int i) {
        this.f108283c = i;
        this.f108284d = C23478e.m77084a(this.f108283c + this.f108282b, this.f108283c, getWidth() - getPaddingRight());
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
            background.draw(canvas);
            canvas.drawRect((float) this.f108283c, 0.0f, (float) this.f108284d, (float) getHeight(), this.f108281a);
            canvas.restoreToCount(saveLayer);
        }
    }

    public KTVView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KTVView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KTVView, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f108281a = new Paint(1);
        this.f108281a.setStyle(Style.FILL);
        this.f108281a.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
        this.f108281a.setColor(color);
    }
}
