package com.p280ss.android.ugc.aweme.p313im.sdk.widget.photodraweeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p280ss.android.image.p878a.C19581a;
import com.p280ss.android.image.p878a.C19582b;
import com.p280ss.android.image.p878a.C19584d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.PhotoDraweeView */
public class PhotoDraweeView extends SimpleDraweeView {

    /* renamed from: a */
    private C31995a f83688a;

    /* renamed from: b */
    private boolean f83689b;

    public float getMaximumScale() {
        return this.f83688a.mo82963e();
    }

    public float getMediumScale() {
        return this.f83688a.mo82961d();
    }

    public float getMinimumScale() {
        return this.f83688a.mo82959c();
    }

    public C19581a getOnPhotoTapListener() {
        return this.f83688a.mo82965g();
    }

    public C19584d getOnViewTapListener() {
        return this.f83688a.mo82966h();
    }

    public float getScale() {
        return this.f83688a.mo82964f();
    }

    public void onAttachedToWindow() {
        m103919c();
        this.f83689b = true;
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f83689b = false;
        this.f83688a.mo82968j();
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    private void m103919c() {
        if (this.f83688a == null || this.f83688a.mo82957b() == null) {
            this.f83688a = new C31995a(this);
        }
    }

    /* renamed from: a */
    public final boolean mo82926a() {
        if (!this.f83689b) {
            return false;
        }
        RectF a = this.f83688a.mo82946a(this.f83688a.f83692c);
        if (a == null) {
            return false;
        }
        float height = (float) getHeight();
        if (a.bottom - a.top >= height && a.bottom > height) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo82927b() {
        if (!this.f83689b) {
            return false;
        }
        RectF a = this.f83688a.mo82946a(this.f83688a.f83692c);
        if (a == null) {
            return false;
        }
        if (a.bottom - a.top >= ((float) getHeight()) && a.top < 0.0f) {
            return true;
        }
        return false;
    }

    public PhotoDraweeView(Context context) {
        super(context);
        m103919c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f83688a.mo82956a(z);
    }

    public void setMaximumScale(float f) {
        this.f83688a.mo82947a(f);
    }

    public void setMediumScale(float f) {
        this.f83688a.mo82958b(f);
    }

    public void setMinimumScale(float f) {
        this.f83688a.mo82960c(f);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.f83688a.mo82951a(onDoubleTapListener);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f83688a.mo82952a(onLongClickListener);
    }

    public void setOnPhotoTapListener(C19581a aVar) {
        this.f83688a.mo82953a(aVar);
    }

    public void setOnScaleChangeListener(C19582b bVar) {
        this.f83688a.mo82954a(bVar);
    }

    public void setOnViewTapListener(C19584d dVar) {
        this.f83688a.mo82955a(dVar);
    }

    public void setScale(float f) {
        this.f83688a.mo82962d(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.f83688a.mo82950a(j);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.f83688a.f83692c);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    public final void mo82925a(int i, int i2) {
        this.f83688a.mo82949a(i, i2);
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m103919c();
    }

    public PhotoDraweeView(Context context, C13438a aVar) {
        super(context, aVar);
        m103919c();
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m103919c();
    }
}
