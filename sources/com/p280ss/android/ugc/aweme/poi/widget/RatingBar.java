package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar */
public class RatingBar extends LinearLayout {

    /* renamed from: a */
    private boolean f93059a;

    /* renamed from: b */
    private int f93060b;

    /* renamed from: c */
    private C35476a f93061c;

    /* renamed from: d */
    private C35477b f93062d;

    /* renamed from: e */
    private float f93063e;

    /* renamed from: f */
    private float f93064f;

    /* renamed from: g */
    private float f93065g;

    /* renamed from: h */
    private Drawable f93066h;

    /* renamed from: i */
    private Drawable f93067i;

    /* renamed from: j */
    private Drawable f93068j;

    /* renamed from: k */
    private StepSize f93069k;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$StepSize */
    public enum StepSize {
        Half(0),
        Full(1);
        
        int step;

        public static StepSize fromStep(int i) {
            StepSize[] values;
            for (StepSize stepSize : values()) {
                if (stepSize.step == i) {
                    return stepSize;
                }
            }
            throw new IllegalArgumentException();
        }

        private StepSize(int i) {
            this.step = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$a */
    public interface C35476a {
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$b */
    public interface C35477b {
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m114601a();
    }

    /* renamed from: a */
    private void m114601a() {
        for (int i = 0; i < this.f93060b; i++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.f93066h);
            starImageView.setOnClickListener(new C35489f(this, starImageView));
            addView(starImageView);
        }
        setStar(this.f93065g);
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LayoutParams layoutParams = new LayoutParams(Math.round(this.f93063e), Math.round(this.f93063e));
        layoutParams.setMargins(0, 0, Math.round(this.f93064f), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.f93066h);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;
    }

    public void setClickable(boolean z) {
        this.f93059a = z;
    }

    public void setOnRatingChangeListener(C35476a aVar) {
        this.f93061c = aVar;
    }

    public void setStarCount(int i) {
        this.f93060b = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f93066h = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f93067i = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f93068j = drawable;
    }

    public void setStarImageSize(float f) {
        this.f93063e = f;
    }

    public void setStarPadding(float f) {
        this.f93064f = f;
    }

    public void setStarStep(float f) {
        this.f93065g = f;
    }

    public void setUnClickableClickListener(C35477b bVar) {
        this.f93062d = bVar;
    }

    public RatingBar(Context context) {
        this(context, null);
    }

    public void setStepSize(int i) {
        this.f93069k = StepSize.fromStep(i);
    }

    public void setStar(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 5.0f) {
            f = 5.0f;
        }
        this.f93065g = f;
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        for (int i2 = 0; i2 < i; i2++) {
            ((ImageView) getChildAt(i2)).setImageDrawable(this.f93067i);
        }
        for (int i3 = i; i3 < this.f93060b; i3++) {
            ((ImageView) getChildAt(i3)).setImageDrawable(this.f93066h);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i)).setImageDrawable(this.f93068j);
        }
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingBar);
            this.f93063e = obtainStyledAttributes.getDimension(5, 20.0f);
            this.f93064f = obtainStyledAttributes.getDimension(6, 10.0f);
            this.f93065g = obtainStyledAttributes.getFloat(7, 1.0f);
            this.f93069k = StepSize.fromStep(obtainStyledAttributes.getInt(8, 1));
            this.f93060b = obtainStyledAttributes.getInteger(1, 5);
            this.f93066h = obtainStyledAttributes.getDrawable(2);
            this.f93067i = obtainStyledAttributes.getDrawable(3);
            this.f93068j = obtainStyledAttributes.getDrawable(4);
            this.f93059a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo90222a(ImageView imageView, View view) {
        if (this.f93059a) {
            int i = (int) this.f93065g;
            if (new BigDecimal(Float.toString(this.f93065g)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (indexOfChild(view) > i) {
                setStar((float) (indexOfChild(view) + 1));
            } else if (indexOfChild(view) != i) {
                setStar(((float) indexOfChild(view)) + 1.0f);
            } else if (this.f93069k != StepSize.Full) {
                if (imageView.getDrawable().getCurrent().getConstantState().equals(this.f93068j.getConstantState())) {
                    setStar((float) (indexOfChild(view) + 1));
                } else {
                    setStar(((float) indexOfChild(view)) + 0.5f);
                }
            }
        }
    }
}
