package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.journey.ArcBackgroundView */
public final class ArcBackgroundView extends View {

    /* renamed from: a */
    private int f84068a;

    /* renamed from: b */
    private int f84069b;

    /* renamed from: c */
    private int f84070c;

    /* renamed from: d */
    private Path f84071d;

    /* renamed from: e */
    private int f84072e;

    /* renamed from: f */
    private ShapeDrawable f84073f;

    /* renamed from: g */
    private PathShape f84074g;

    /* renamed from: h */
    private RectF f84075h;

    /* renamed from: i */
    private boolean f84076i;

    public ArcBackgroundView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f84071d;
        if (path == null) {
            C7573i.m23580a();
        }
        path.reset();
        Path path2 = this.f84071d;
        if (path2 == null) {
            C7573i.m23580a();
        }
        path2.moveTo(0.0f, 0.0f);
        Path path3 = this.f84071d;
        if (path3 == null) {
            C7573i.m23580a();
        }
        path3.arcTo(this.f84075h, 0.0f, 180.0f);
        Path path4 = this.f84071d;
        if (path4 == null) {
            C7573i.m23580a();
        }
        path4.lineTo(0.0f, (float) this.f84069b);
        Path path5 = this.f84071d;
        if (path5 == null) {
            C7573i.m23580a();
        }
        path5.lineTo((float) this.f84068a, (float) this.f84069b);
        Path path6 = this.f84071d;
        if (path6 == null) {
            C7573i.m23580a();
        }
        path6.lineTo((float) this.f84068a, 0.0f);
        Path path7 = this.f84071d;
        if (path7 == null) {
            C7573i.m23580a();
        }
        path7.close();
        if (this.f84074g == null || this.f84076i) {
            Path path8 = this.f84071d;
            if (path8 == null) {
                C7573i.m23580a();
            }
            this.f84074g = new PathShape(path8, (float) this.f84068a, (float) this.f84069b);
            if (this.f84076i) {
                this.f84076i = false;
            }
        }
        ShapeDrawable shapeDrawable = this.f84073f;
        if (shapeDrawable == null) {
            C7573i.m23580a();
        }
        shapeDrawable.setShape(this.f84074g);
        ShapeDrawable shapeDrawable2 = this.f84073f;
        if (shapeDrawable2 == null) {
            C7573i.m23580a();
        }
        shapeDrawable2.setBounds(0, 0, this.f84068a, this.f84069b);
        ShapeDrawable shapeDrawable3 = this.f84073f;
        if (shapeDrawable3 == null) {
            C7573i.m23580a();
        }
        Paint paint = shapeDrawable3.getPaint();
        C7573i.m23582a((Object) paint, "mShapeDrawable!!.paint");
        paint.setColor(this.f84072e);
        ShapeDrawable shapeDrawable4 = this.f84073f;
        if (shapeDrawable4 == null) {
            C7573i.m23580a();
        }
        shapeDrawable4.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f84068a = MeasureSpec.getSize(i);
        this.f84069b = MeasureSpec.getSize(i2);
        this.f84076i = true;
    }

    /* renamed from: a */
    private final void m104474a(AttributeSet attributeSet, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ArcBackgroundView);
        this.f84072e = obtainStyledAttributes.getColor(0, this.f84072e);
        this.f84070c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f84071d = new Path();
        obtainStyledAttributes.recycle();
        this.f84073f = new ShapeDrawable();
        this.f84075h = new RectF(0.0f, (float) (-this.f84070c), (float) (this.f84070c * 2), (float) this.f84070c);
    }

    public ArcBackgroundView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m104474a(attributeSet, context);
    }

    public /* synthetic */ ArcBackgroundView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
