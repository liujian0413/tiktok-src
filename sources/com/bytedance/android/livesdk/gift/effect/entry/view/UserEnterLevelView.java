package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.p022v4.graphics.C0721a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.normal.utils.C8057a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.android.livesdk.gift.effect.p375a.C7962a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class UserEnterLevelView extends View implements C7962a {

    /* renamed from: a */
    private C8038c f21835a;

    /* renamed from: b */
    private Bitmap f21836b;

    /* renamed from: c */
    private float f21837c;

    /* renamed from: d */
    private Matrix f21838d;

    /* renamed from: e */
    private Shader f21839e;

    /* renamed from: f */
    private RectF f21840f;

    /* renamed from: g */
    private Shader f21841g;

    /* renamed from: h */
    private Shader f21842h;

    /* renamed from: i */
    private ComposeShader f21843i;

    /* renamed from: j */
    private Bitmap f21844j;

    /* renamed from: k */
    private Canvas f21845k;

    /* renamed from: l */
    private Matrix f21846l;

    /* renamed from: m */
    private float f21847m;

    /* renamed from: n */
    private Matrix f21848n;

    /* renamed from: o */
    private Paint f21849o;

    /* renamed from: p */
    private Paint f21850p;

    /* renamed from: q */
    private Paint f21851q;

    /* renamed from: r */
    private float f21852r;

    /* renamed from: s */
    private float f21853s;

    /* renamed from: t */
    private boolean f21854t;

    /* renamed from: u */
    private boolean f21855u;

    /* renamed from: v */
    private boolean f21856v;

    /* renamed from: w */
    private boolean f21857w;

    /* renamed from: x */
    private int f21858x;

    /* renamed from: b */
    public final void mo20969b() {
        this.f21855u = true;
    }

    /* renamed from: a */
    public final void mo20966a() {
        if (this.f21858x == 2) {
            m24632a(this.f21852r, this.f21853s);
        } else {
            m24636c();
        }
        invalidate();
    }

    /* renamed from: c */
    private void m24636c() {
        float f;
        if (!this.f21857w) {
            this.f21857w = true;
            int color = getResources().getColor(R.color.arm);
            int color2 = getResources().getColor(R.color.aro);
            int color3 = getResources().getColor(R.color.arn);
            this.f21846l = new Matrix();
            if (this.f21854t) {
                f = this.f21852r;
            } else {
                f = 0.0f;
            }
            this.f21847m = f;
            this.f21840f = new RectF(0.0f, 0.0f, this.f21852r, this.f21853s);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f21852r, this.f21853s, color, color, TileMode.CLAMP);
            this.f21841g = linearGradient;
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 30.0f, 7.0f, new int[]{color3, color2, color3}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP);
            this.f21842h = linearGradient2;
            this.f21843i = new ComposeShader(this.f21841g, this.f21842h, Mode.DST_ATOP);
            this.f21844j = Bitmap.createBitmap((int) this.f21852r, (int) this.f21853s, Config.ARGB_8888);
            this.f21845k = new Canvas(this.f21844j);
            this.f21841g.setLocalMatrix(this.f21848n);
            this.f21842h.setLocalMatrix(this.f21848n);
            this.f21843i.setLocalMatrix(this.f21848n);
        }
    }

    public UserEnterLevelView(Context context) {
        this(context, null);
    }

    public void updateDrawingCache(View view) {
        this.f21836b = C8057a.m24689a(view);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f21855u) {
            this.f21849o.reset();
            canvas.drawBitmap(this.f21836b, 0.0f, 0.0f, this.f21849o);
            try {
                if (this.f21856v) {
                    m24634a(canvas);
                    return;
                }
                if (this.f21857w) {
                    m24635b(canvas);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void setUI(C8026a aVar) {
        this.f21858x = aVar.f21787k;
        this.f21835a.setUI(aVar);
        this.f21836b = C8057a.m24689a((View) this.f21835a);
        this.f21852r = (float) this.f21835a.getWidth();
        this.f21853s = (float) this.f21835a.getHeight();
        invalidate();
    }

    /* renamed from: a */
    private void m24633a(Context context) {
        this.f21835a = new C8038c(context);
        this.f21835a.setDrawingCacheListener(this);
        this.f21836b = C8057a.m24689a((View) this.f21835a);
        this.f21849o = new Paint();
        this.f21849o.setAntiAlias(true);
        this.f21850p = new Paint();
        this.f21850p.setAntiAlias(true);
        this.f21851q = new Paint();
        this.f21851q.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f21848n = new Matrix();
        this.f21848n.setTranslate(1.0f, 0.0f);
    }

    /* renamed from: a */
    private void m24634a(Canvas canvas) {
        if (this.f21854t) {
            this.f21837c -= 60.0f;
        } else {
            this.f21837c += 60.0f;
        }
        this.f21838d.setTranslate(this.f21837c, 0.0f);
        this.f21839e.setLocalMatrix(this.f21838d);
        this.f21849o.setAlpha(240);
        this.f21849o.setShader(this.f21839e);
        canvas.drawRoundRect(this.f21840f, 10.0f, 10.0f, this.f21849o);
        if (this.f21837c >= this.f21852r * 4.0f) {
            this.f21856v = false;
            this.f21837c = -this.f21852r;
        }
        if (this.f21856v && this.f21837c <= this.f21852r * 4.0f) {
            postInvalidateDelayed(20);
        }
    }

    /* renamed from: b */
    private void m24635b(Canvas canvas) {
        this.f21845k.drawPaint(this.f21851q);
        if (this.f21854t) {
            this.f21847m -= 30.0f;
        } else {
            this.f21847m += 30.0f;
        }
        this.f21846l.setTranslate(this.f21847m, 0.0f);
        this.f21842h.setLocalMatrix(this.f21846l);
        this.f21843i = new ComposeShader(this.f21841g, this.f21842h, Mode.DST_ATOP);
        this.f21843i.setLocalMatrix(this.f21848n);
        this.f21849o.setShader(this.f21843i);
        this.f21845k.drawRoundRect(this.f21840f, 10.0f, 10.0f, this.f21849o);
        this.f21849o.setAlpha(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        canvas.drawBitmap(this.f21844j, 0.0f, 0.0f, this.f21849o);
        if (this.f21847m >= this.f21852r * 1.5f) {
            this.f21857w = false;
            this.f21847m = (-this.f21852r) / 2.0f;
        }
        if (this.f21857w && this.f21847m <= this.f21852r * 1.5f) {
            postInvalidateDelayed(20);
        }
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f21852r = (float) this.f21835a.getWidth();
        this.f21853s = (float) this.f21835a.getHeight();
        setMeasuredDimension((int) this.f21852r, (int) this.f21853s);
    }

    /* renamed from: a */
    private void m24632a(float f, float f2) {
        float f3;
        float f4 = f;
        float f5 = f2;
        if (!this.f21856v) {
            this.f21856v = true;
            this.f21838d = new Matrix();
            if (this.f21854t) {
                f3 = f4;
            } else {
                f3 = -f4;
            }
            this.f21837c = f3 * 3.0f;
            int color = getResources().getColor(R.color.arp);
            this.f21840f = new RectF(0.0f, 0.0f, f4, f5);
            float f6 = f4 * 4.0f;
            float f7 = f6;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f6, 0.0f, C0721a.m3067b(color, NormalGiftView.ALPHA_180), C0721a.m3067b(color, NormalGiftView.ALPHA_180), TileMode.CLAMP);
            Bitmap createBitmap = Bitmap.createBitmap((int) f7, (int) f5, Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            TileMode tileMode = TileMode.CLAMP;
            this.f21839e = new BitmapShader(createBitmap, tileMode, tileMode);
            float f8 = f4 / 4.0f;
            float f9 = f5 / 4.0f;
            float dimension = getResources().getDimension(R.dimen.tp);
            float dimension2 = getResources().getDimension(R.dimen.to);
            float f10 = f8 * 2.0f;
            float f11 = f9 * 2.0f;
            float f12 = f10 + dimension;
            float f13 = f8 * 1.0f;
            float f14 = f9 * 3.0f;
            float f15 = 0.0f * f8;
            float f16 = f15 + dimension;
            float f17 = f8 * 3.0f;
            float f18 = f9 * 1.0f;
            float f19 = dimension + f17;
            float f20 = f4 * 2.0f;
            float f21 = f4 * 3.0f;
            float[] fArr = {f10, f11, f12, f11, f13, f14, f13 + dimension, f14, f15 + f4, f11, f16 + f4, f11, f10 + f4, f14, f12 + f4, f14, f17 + f4, f18, f19 + f4, f18, f15 + f20, f14, f16 + f20, f14, f17 + f20, f18, f20 + f19, f18, f15 + f21, f14, f16 + f21, f14, f17 + f21, f18, f19 + f21, f18};
            canvas.drawPaint(this.f21851q);
            this.f21850p.setShader(linearGradient);
            this.f21850p.setStrokeWidth(dimension2);
            canvas.drawLines(fArr, this.f21850p);
            this.f21839e.setLocalMatrix(this.f21848n);
        }
    }

    public UserEnterLevelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24633a(context);
    }

    /* renamed from: a */
    public final void mo20968a(CharSequence charSequence, ImageModel imageModel, ImageModel imageModel2) {
        if (this.f21835a != null && !TextUtils.isEmpty(charSequence) && imageModel2 != null) {
            this.f21835a.mo20991a(charSequence, imageModel, imageModel2);
            this.f21836b = C8057a.m24689a((View) this.f21835a);
            this.f21852r = (float) this.f21835a.getWidth();
            this.f21853s = (float) this.f21835a.getHeight();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo20967a(C8026a aVar, int i, int i2, CharSequence charSequence, int i3, int i4) {
        if (aVar != null && this.f21835a != null) {
            this.f21858x = aVar.f21787k;
            this.f21835a.mo20990a(aVar, i, R.drawable.bpd, charSequence, R.color.aih, R.color.aih);
            this.f21836b = C8057a.m24689a((View) this.f21835a);
            this.f21852r = (float) this.f21835a.getWidth();
            this.f21853s = (float) this.f21835a.getHeight();
            invalidate();
        }
    }
}
