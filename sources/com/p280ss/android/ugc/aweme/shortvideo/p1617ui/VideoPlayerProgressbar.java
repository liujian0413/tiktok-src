package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View.MeasureSpec;
import android.widget.ProgressBar;
import com.p280ss.android.ugc.aweme.common.feed.R$styleable;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39330h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VideoPlayerProgressbar */
public class VideoPlayerProgressbar extends ProgressBar {

    /* renamed from: a */
    public int f107147a;

    /* renamed from: b */
    public boolean f107148b;

    /* renamed from: c */
    public Runnable f107149c;

    /* renamed from: d */
    private Paint f107150d;

    /* renamed from: e */
    private float f107151e;

    /* renamed from: f */
    private int f107152f;

    /* renamed from: g */
    private int f107153g;

    /* renamed from: h */
    private boolean f107154h;

    /* renamed from: i */
    private boolean f107155i;

    /* renamed from: j */
    private int f107156j;

    /* renamed from: k */
    private long f107157k;

    /* renamed from: c */
    private void m131407c() {
        m131400a();
    }

    private long getProgressbarThreshold() {
        return this.f107157k;
    }

    /* renamed from: a */
    private void m131400a() {
        postDelayed(this.f107149c, 50);
    }

    /* renamed from: b */
    private void m131403b() {
        removeCallbacks(this.f107149c);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f107149c);
    }

    public ObjectAnimator getHideAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public void setProgressbarThreshold(long j) {
        this.f107157k = j;
    }

    public void setReachedBarColor(int i) {
        this.f107153g = i;
    }

    public void setReachedProgressBarHeight(float f) {
        this.f107151e = f;
    }

    public VideoPlayerProgressbar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo101726a(long j) {
        if (getHandler() != null) {
            getHandler().postAtTime(this.f107149c, j);
        }
    }

    /* renamed from: b */
    private void m131404b(int i) {
        this.f107148b = false;
        removeCallbacks(this.f107149c);
        setMax(i);
        setProgress(0);
        m131400a();
    }

    /* renamed from: c */
    private int m131406c(int i) {
        return (int) TypedValue.applyDimension(1, 6.0f, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    private int m131399a(int i) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) (((float) (getPaddingTop() + getPaddingBottom())) + Math.max(this.f107151e, Math.abs(this.f107150d.descent() - this.f107150d.ascent())));
        if (mode == Integer.MIN_VALUE) {
            return Math.min(paddingTop, size);
        }
        return paddingTop;
    }

    /* renamed from: a */
    private void m131402a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.VideoPlayerProgressbar);
        this.f107153g = obtainStyledAttributes.getColor(0, -261935);
        this.f107151e = obtainStyledAttributes.getDimension(1, this.f107151e);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        float progress = (float) ((int) (((float) this.f107152f) * ((((float) getProgress()) * 1.0f) / ((float) getMax()))));
        if (progress > 0.0f) {
            this.f107150d.setColor(this.f107153g);
            this.f107150d.setStrokeWidth(this.f107151e);
            canvas.drawLine(0.0f, (float) (getHeight() / 2), progress, (float) (getHeight() / 2), this.f107150d);
        }
        canvas.restore();
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m131405b(int i, int i2) {
        removeCallbacks(this.f107149c);
        setMax(i);
        setProgress(i2);
        m131403b();
    }

    /* renamed from: a */
    private void m131401a(int i, int i2) {
        this.f107148b = false;
        removeCallbacks(this.f107149c);
        setMax(i);
        setProgress(i2);
        m131400a();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(MeasureSpec.getSize(i), m131399a(i2));
        this.f107152f = (getMeasuredWidth() - getPaddingRight()) - getPaddingLeft();
    }

    /* renamed from: a */
    public final void mo101727a(C39330h hVar, int i) {
        if (i != 0) {
            this.f107156j = i;
        }
        switch (hVar.f102160c) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131407c();
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 4:
                m131403b();
                return;
            case 5:
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131401a(this.f107156j, (int) hVar.f102159b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 6:
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131404b(this.f107156j);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 7:
                this.f107154h = false;
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131404b(this.f107156j);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 8:
                if (this.f107154h && hVar.f102161d) {
                    setVisibility(4);
                    m131403b();
                } else if (this.f107154h && ((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131407c();
                }
                this.f107155i = !this.f107155i;
                return;
            case 9:
                return;
            case 10:
                this.f107154h = true;
                setProgress(0);
                break;
            case 11:
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131401a(this.f107156j, (int) hVar.f102159b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
            case 12:
                if (((long) this.f107156j) >= getProgressbarThreshold()) {
                    setVisibility(0);
                    m131405b(this.f107156j, (int) hVar.f102159b);
                    return;
                }
                setVisibility(4);
                setProgress(0);
                return;
        }
    }

    public VideoPlayerProgressbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107150d = new Paint();
        this.f107151e = (float) m131406c(6);
        this.f107154h = true;
        this.f107155i = true;
        this.f107156j = 0;
        this.f107157k = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().progressBarThreshold();
        this.f107149c = new Runnable() {
            public final void run() {
                if (!VideoPlayerProgressbar.this.f107148b) {
                    VideoPlayerProgressbar.this.incrementProgressBy(50);
                    VideoPlayerProgressbar.this.f107147a = VideoPlayerProgressbar.this.getProgress();
                    if (VideoPlayerProgressbar.this.getMax() < VideoPlayerProgressbar.this.f107147a) {
                        VideoPlayerProgressbar.this.removeCallbacks(VideoPlayerProgressbar.this.f107149c);
                        return;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    VideoPlayerProgressbar.this.mo101726a(uptimeMillis + (50 - (uptimeMillis % 50)));
                }
            }
        };
        m131402a(attributeSet);
    }
}
