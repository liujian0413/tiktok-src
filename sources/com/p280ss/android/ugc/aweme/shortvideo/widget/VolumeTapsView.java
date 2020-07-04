package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39308b;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView */
public class VolumeTapsView extends View implements OnGestureListener {

    /* renamed from: a */
    private int f108425a;

    /* renamed from: b */
    private int f108426b;

    /* renamed from: c */
    private final RectF f108427c;

    /* renamed from: d */
    private final RectF f108428d;

    /* renamed from: e */
    private final Paint f108429e;

    /* renamed from: f */
    private Bitmap f108430f;

    /* renamed from: g */
    private Bitmap f108431g;

    /* renamed from: h */
    private Bitmap f108432h;

    /* renamed from: i */
    private C39308b f108433i;

    /* renamed from: j */
    private C39308b f108434j;

    /* renamed from: k */
    private C39308b f108435k;

    /* renamed from: l */
    private Bitmap f108436l;

    /* renamed from: m */
    private GestureDetector f108437m;

    /* renamed from: n */
    private int f108438n;

    /* renamed from: o */
    private int f108439o;

    /* renamed from: p */
    private int f108440p;

    /* renamed from: q */
    private int f108441q;

    /* renamed from: r */
    private C41673a f108442r;

    /* renamed from: s */
    private long f108443s;

    /* renamed from: t */
    private int f108444t;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.VolumeTapsView$a */
    public interface C41673a {
        /* renamed from: a */
        void mo96621a(int i);

        /* renamed from: a */
        void mo96622a(int i, int i2);
    }

    public int getStopPosition() {
        return this.f108441q;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: a */
    public final void mo102426a(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("start: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 >= i) {
            m132702a(i - this.f108425a);
            this.f108425a = i;
            this.f108426b = i2;
            invalidate();
        } else {
            StringBuilder sb2 = new StringBuilder("start: ");
            sb2.append(i);
            sb2.append("; end: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    private boolean m132706a(MotionEvent motionEvent) {
        this.f108441q = m132699a(Math.min(Math.max(m132707b(this.f108438n), motionEvent.getX()), (float) getMeasuredWidth()));
        this.f108439o = Math.max(this.f108438n, this.f108441q - ((int) TimeUnit.SECONDS.toMillis(3)));
        this.f108440p = this.f108439o;
        invalidate();
        if (this.f108442r != null) {
            this.f108442r.mo96622a(this.f108439o, this.f108441q);
        }
        return true;
    }

    /* renamed from: a */
    public final void mo102427a(AVMusicWaveBean aVMusicWaveBean, int i) {
        if (aVMusicWaveBean == null || !C39312e.m125626a(aVMusicWaveBean.getMusicWavePointArray())) {
            m132705a(m132701a(getContext(), i));
            return;
        }
        C39312e.m125624a(aVMusicWaveBean, this.f108425a, this.f108426b - this.f108425a, i);
        int b = C39312e.m125623a().mo97878b(getContext());
        if (b < aVMusicWaveBean.getMusicWavePointArray().length) {
            m132705a(C39312e.m125620a(VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, b)));
        }
    }

    public void setOnProgressChangeListener(C41673a aVar) {
        this.f108442r = aVar;
    }

    public VolumeTapsView(Context context) {
        this(context, null);
    }

    public void setPastPosition(int i) {
        this.f108438n = i;
        invalidate();
    }

    public void setProgress(int i) {
        this.f108440p = i;
        invalidate();
    }

    public void setStopPosition(int i) {
        this.f108441q = i;
        invalidate();
    }

    public void setTotalTime(long j) {
        this.f108443s = j;
        setWavForm(this.f108430f);
    }

    /* renamed from: a */
    private int m132699a(float f) {
        return ((int) (((f * 1.0f) * ((float) (this.f108426b - this.f108425a))) / ((float) getMeasuredWidth()))) + this.f108425a;
    }

    /* renamed from: b */
    private float m132707b(int i) {
        return ((((float) (i - this.f108425a)) * 1.0f) * ((float) getMeasuredWidth())) / ((float) (this.f108426b - this.f108425a));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f108435k.mo97870a()) {
            m132704a(canvas, false);
        } else {
            m132704a(canvas, true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = this.f108437m.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1) {
            return onTouchEvent | m132706a(motionEvent);
        }
        return onTouchEvent;
    }

    public boolean onDown(MotionEvent motionEvent) {
        this.f108441q = m132699a(Math.min(Math.max(m132707b(this.f108438n), motionEvent.getX()), (float) getMeasuredWidth()));
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        invalidate();
        if (this.f108442r != null) {
            this.f108442r.mo96621a(this.f108441q);
        }
        return true;
    }

    public void setWavForm(Bitmap bitmap) {
        Context context = getContext();
        int c = C0683b.m2912c(context, R.color.p6);
        if (C6399b.m19946v()) {
            this.f108430f = m132700a(bitmap, context.getResources().getColor(R.color.i4));
            this.f108431g = m132700a(bitmap, c);
            this.f108432h = m132700a(bitmap, context.getResources().getColor(R.color.i5));
        } else {
            this.f108430f = m132700a(bitmap, context.getResources().getColor(R.color.i2));
            this.f108431g = m132700a(bitmap, C0683b.m2912c(context, R.color.a71));
            this.f108432h = m132700a(bitmap, -1);
        }
        invalidate();
    }

    /* renamed from: a */
    private void m132702a(int i) {
        this.f108438n += i;
        this.f108441q += i;
        this.f108439o += i;
        this.f108440p += i;
    }

    /* renamed from: a */
    private void m132703a(Context context) {
        this.f108437m = new GestureDetector(context, this);
        this.f108436l = BitmapFactory.decodeResource(getResources(), R.drawable.ag1);
        setWavForm(BitmapFactory.decodeResource(getResources(), R.drawable.kc));
        this.f108434j = new C39308b(context);
        this.f108433i = new C39308b(context);
        this.f108435k = new C39308b(context);
        this.f108434j.mo97864a(C42111b.m134056i());
        this.f108435k.mo97864a(C42111b.f109618a.mo103551h());
        this.f108433i.mo97864a(C42111b.f109618a.mo103550g());
        this.f108444t = C42111b.f109618a.mo103549f();
        this.f108429e.setColor(this.f108444t);
    }

    /* renamed from: a */
    private void m132705a(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C39312e.m125626a(aVMusicWaveBean.getMusicWavePointArray())) {
            int b = (int) C9738o.m28708b(getContext(), 4.0f);
            C39312e.m125628b(aVMusicWaveBean);
            this.f108433i.f102103b = b;
            this.f108434j.f102103b = b;
            this.f108435k.f102103b = b;
            this.f108433i.f102102a = C39312e.m125623a().f102119d;
            this.f108434j.f102102a = C39312e.m125623a().f102119d;
            this.f108435k.f102102a = C39312e.m125623a().f102119d;
            this.f108433i.mo97869a(aVMusicWaveBean.getMusicWavePointArray());
            this.f108434j.mo97869a(aVMusicWaveBean.getMusicWavePointArray());
            this.f108435k.mo97869a(aVMusicWaveBean.getMusicWavePointArray());
        }
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        this.f108433i.mo97865a(size, size2);
        this.f108434j.mo97865a(size, size2);
        this.f108435k.mo97865a(size, size2);
    }

    /* renamed from: a */
    private static Bitmap m132700a(Bitmap bitmap, int i) {
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private static AVMusicWaveBean m132701a(Context context, int i) {
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        int b = C39312e.m125623a().mo97878b(context);
        float[] fArr = new float[b];
        if (i > 0) {
            for (int i2 = 0; i2 < b; i2++) {
                fArr[i2] = (float) Math.random();
            }
        }
        aVMusicWaveBean.setMusicWavePointArray(fArr);
        return aVMusicWaveBean;
    }

    /* renamed from: a */
    private void m132704a(Canvas canvas, boolean z) {
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.f108427c;
        float b = m132707b(this.f108438n);
        m132707b(this.f108439o);
        float b2 = m132707b(this.f108440p);
        float b3 = m132707b(this.f108441q);
        rectF.left = 0.0f;
        rectF.right = b;
        rectF.top = 0.0f;
        float f = (float) measuredHeight;
        rectF.bottom = f;
        canvas.drawRect(rectF, this.f108429e);
        float f2 = (float) measuredWidth;
        float f3 = ((((float) this.f108425a) * -1.0f) / ((float) (this.f108426b - this.f108425a))) * f2;
        float f4 = (((float) this.f108443s) * 1.0f) / ((float) (this.f108426b - this.f108425a));
        this.f108428d.top = 0.1f * f;
        this.f108428d.right = f4 * f2;
        this.f108428d.bottom = 0.9f * f;
        if (z) {
            rectF.left = 0.0f;
        } else {
            rectF.left = b2;
        }
        rectF.right = f2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f108432h, null, this.f108428d, null);
        } else {
            this.f108435k.mo97867a(canvas);
        }
        canvas.restore();
        rectF.top = 0.0f;
        rectF.bottom = f;
        rectF.left = 0.0f;
        rectF.right = b;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f108430f, null, this.f108428d, null);
        } else {
            this.f108433i.mo97867a(canvas);
        }
        canvas.restore();
        rectF.left = b;
        rectF.right = b2;
        canvas.save();
        canvas.clipRect(rectF);
        if (z) {
            canvas.translate(f3, 0.0f);
            canvas.drawBitmap(this.f108431g, null, this.f108428d, null);
        } else {
            this.f108434j.mo97867a(canvas);
        }
        canvas.restore();
        canvas.drawBitmap(this.f108436l, b3 - ((float) (this.f108436l.getWidth() / 2)), (float) ((measuredHeight / 2) - (this.f108436l.getHeight() / 2)), null);
    }

    public VolumeTapsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f108427c = new RectF();
        this.f108428d = new RectF();
        this.f108429e = new Paint();
        m132703a(context);
        setBackground(C38501ax.m123066a(0, C42111b.f109618a.mo103548e(), 0, (int) C9738o.m28708b(context, 2.0f)));
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f108441q = m132699a(Math.min(Math.max(m132707b(this.f108438n), motionEvent2.getX()), (float) getMeasuredWidth()));
        invalidate();
        if (this.f108442r != null) {
            this.f108442r.mo96621a(this.f108441q);
        }
        return true;
    }
}
