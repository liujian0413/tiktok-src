package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class PKProgressBar extends View {

    /* renamed from: a */
    private boolean f25155a;

    /* renamed from: b */
    private int f25156b;

    /* renamed from: c */
    private int f25157c;

    /* renamed from: d */
    private float f25158d;

    /* renamed from: e */
    private float f25159e;

    /* renamed from: f */
    private final Paint f25160f;

    /* renamed from: g */
    private int f25161g;

    /* renamed from: h */
    private int f25162h;

    /* renamed from: i */
    private float f25163i;

    /* renamed from: j */
    private float f25164j;

    /* renamed from: k */
    private int f25165k;

    /* renamed from: l */
    private int f25166l;

    /* renamed from: m */
    private float f25167m;

    /* renamed from: n */
    private float f25168n;

    /* renamed from: o */
    private RectF f25169o;

    /* renamed from: p */
    private RectF f25170p;

    /* renamed from: q */
    private ValueAnimator f25171q;

    /* renamed from: r */
    private ValueAnimator f25172r;

    /* renamed from: s */
    private ValueAnimator f25173s;

    public int getLeftValue() {
        return this.f25165k;
    }

    public int getRightValue() {
        return this.f25166l;
    }

    /* renamed from: a */
    public final void mo22569a() {
        this.f25165k = 0;
        this.f25166l = 0;
        this.f25159e = 0.5f;
        invalidate();
    }

    private Path getClipPath() {
        float leftPaddingOffset = (float) getLeftPaddingOffset();
        float topPaddingOffset = (float) getTopPaddingOffset();
        float width = (((float) getWidth()) - leftPaddingOffset) - ((float) getRightPaddingOffset());
        float height = (((float) getHeight()) - topPaddingOffset) - ((float) getBottomPaddingOffset());
        Path path = new Path();
        float f = height / 2.0f;
        float f2 = f + leftPaddingOffset;
        path.moveTo(f2, topPaddingOffset);
        float f3 = width + leftPaddingOffset;
        path.lineTo(f3 - f, topPaddingOffset);
        float f4 = height + topPaddingOffset;
        path.arcTo(new RectF(f3 - height, topPaddingOffset, f3, f4), -90.0f, 180.0f);
        path.lineTo(f2, f4);
        path.arcTo(new RectF(leftPaddingOffset, topPaddingOffset, height + leftPaddingOffset, f4), 90.0f, 180.0f);
        path.close();
        return path;
    }

    public void setIsVigo(boolean z) {
        this.f25155a = z;
    }

    public PKProgressBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo22571b(ValueAnimator valueAnimator) {
        this.f25164j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo22572c(ValueAnimator valueAnimator) {
        this.f25163i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22570a(ValueAnimator valueAnimator) {
        this.f25159e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    private void setProgress(float f) {
        float f2 = this.f25159e;
        if (this.f25171q != null && this.f25171q.isRunning()) {
            this.f25171q.cancel();
        }
        this.f25171q = ValueAnimator.ofFloat(new float[]{f2, f});
        this.f25171q.setDuration(300);
        this.f25171q.addUpdateListener(new C9267l(this));
        this.f25171q.start();
    }

    public void setLeftValue(int i) {
        this.f25165k = i;
        if (this.f25166l + this.f25165k == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f25165k) / ((float) (this.f25165k + this.f25166l)));
        }
        if (this.f25172r == null || !this.f25172r.isRunning()) {
            this.f25172r = ValueAnimator.ofFloat(new float[]{this.f25163i, this.f25158d});
            this.f25172r.setDuration(300);
            this.f25172r.setRepeatCount(1);
            this.f25172r.setRepeatMode(2);
            this.f25172r.addUpdateListener(new C9265j(this));
            this.f25172r.start();
        }
    }

    public void setRightValue(int i) {
        this.f25166l = i;
        if (this.f25166l + this.f25165k == 0) {
            setProgress(0.5f);
        } else {
            setProgress(((float) this.f25165k) / ((float) (this.f25165k + this.f25166l)));
        }
        if (this.f25173s == null || !this.f25173s.isRunning()) {
            this.f25173s = ValueAnimator.ofFloat(new float[]{this.f25164j, this.f25158d});
            this.f25173s.setDuration(300);
            this.f25173s.setRepeatCount(1);
            this.f25173s.setRepeatMode(2);
            this.f25173s.addUpdateListener(new C9266k(this));
            this.f25173s.start();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        String str;
        String str2;
        super.onDraw(canvas);
        this.f25169o.right = this.f25159e * ((float) getWidth());
        this.f25169o.bottom = (float) getHeight();
        this.f25170p.left = this.f25159e * ((float) getWidth());
        this.f25170p.bottom = (float) getHeight();
        this.f25170p.right = (float) getWidth();
        if (this.f25155a) {
            str2 = String.valueOf(this.f25165k);
            str = String.valueOf(this.f25166l);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(R.string.f_h));
            sb.append(this.f25165k);
            str2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f25166l);
            sb2.append(getContext().getString(R.string.f_j));
            str = sb2.toString();
        }
        canvas.clipPath(getClipPath());
        LinearGradient linearGradient = new LinearGradient(this.f25169o.left, this.f25169o.top, this.f25169o.right, (float) getHeight(), Color.parseColor("#fe155d"), Color.parseColor("#fe499b"), TileMode.MIRROR);
        this.f25160f.setShader(linearGradient);
        canvas.drawRect(this.f25169o, this.f25160f);
        LinearGradient linearGradient2 = new LinearGradient(this.f25170p.left, this.f25170p.top, this.f25170p.right, (float) getHeight(), Color.parseColor("#2bffff"), Color.parseColor("#274ae8"), TileMode.MIRROR);
        this.f25160f.setShader(linearGradient2);
        canvas.drawRect(this.f25170p, this.f25160f);
        this.f25160f.setShader(null);
        this.f25160f.setShader(null);
        this.f25160f.setTextSize(this.f25163i);
        this.f25160f.setColor(this.f25161g);
        canvas.drawText(str2, this.f25167m, (float) ((int) (((float) (getHeight() / 2)) - ((this.f25160f.ascent() + this.f25160f.descent()) / 2.0f))), this.f25160f);
        this.f25160f.setTextSize(this.f25164j);
        this.f25160f.setColor(this.f25162h);
        canvas.drawText(str, (((float) getWidth()) - this.f25168n) - this.f25160f.measureText(str), (float) ((int) (((float) (getHeight() / 2)) - ((this.f25160f.ascent() + this.f25160f.descent()) / 2.0f))), this.f25160f);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25156b = Color.parseColor("#ff3333");
        this.f25167m = (float) C3358ac.m12510a(14.0f);
        this.f25163i = (float) C3358ac.m12510a(10.0f);
        this.f25157c = Color.parseColor("#ffa033");
        this.f25168n = (float) C3358ac.m12510a(14.0f);
        this.f25164j = (float) C3358ac.m12510a(10.0f);
        this.f25162h = -1;
        this.f25161g = -1;
        this.f25158d = (float) C3358ac.m12510a(14.0f);
        this.f25166l = 0;
        this.f25165k = 0;
        this.f25159e = 0.5f;
        this.f25160f = new Paint();
        this.f25160f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f25160f.setStyle(Style.FILL);
        this.f25160f.setDither(true);
        this.f25160f.setAntiAlias(true);
        this.f25169o = new RectF(0.0f, 0.0f, this.f25159e * ((float) getWidth()), (float) getHeight());
        this.f25170p = new RectF(this.f25159e * ((float) getWidth()), 0.0f, (float) getWidth(), (float) getHeight());
    }
}
