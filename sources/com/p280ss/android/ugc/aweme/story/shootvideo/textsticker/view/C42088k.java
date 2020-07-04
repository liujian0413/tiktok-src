package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.p1563c.C39515a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40485e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40486f;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerData;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a.C42070a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a.C42071b;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a.C42072c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1662a.C42072c.C42075b;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.k */
public final class C42088k extends View implements C39548d<TextStickerData> {

    /* renamed from: A */
    private TextStickerData f109444A;

    /* renamed from: B */
    private long f109445B;

    /* renamed from: C */
    private long f109446C;

    /* renamed from: D */
    private int f109447D = -1;

    /* renamed from: E */
    private PointF f109448E = new PointF();

    /* renamed from: F */
    private boolean f109449F;

    /* renamed from: G */
    private boolean f109450G;

    /* renamed from: H */
    private boolean f109451H;

    /* renamed from: I */
    private boolean f109452I;

    /* renamed from: J */
    private float f109453J;

    /* renamed from: a */
    public float f109454a;

    /* renamed from: b */
    public boolean f109455b;

    /* renamed from: c */
    public final boolean f109456c;

    /* renamed from: d */
    public C42072c f109457d;

    /* renamed from: e */
    public boolean f109458e = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);

    /* renamed from: f */
    public C40486f f109459f = new C40486f(this, new C42090a());

    /* renamed from: g */
    public PointF f109460g = new PointF();

    /* renamed from: h */
    private float f109461h;

    /* renamed from: i */
    private float f109462i;

    /* renamed from: j */
    private float f109463j = 1.0f;

    /* renamed from: k */
    private boolean f109464k = true;

    /* renamed from: l */
    private String[] f109465l;

    /* renamed from: m */
    private int f109466m = 1;

    /* renamed from: n */
    private int f109467n = -1;

    /* renamed from: o */
    private String f109468o = "default";

    /* renamed from: p */
    private int f109469p = 2;

    /* renamed from: q */
    private boolean f109470q = true;

    /* renamed from: r */
    private SafeHandler f109471r;

    /* renamed from: s */
    private int f109472s;

    /* renamed from: t */
    private int f109473t;

    /* renamed from: u */
    private int f109474u;

    /* renamed from: v */
    private C42070a f109475v;

    /* renamed from: w */
    private C42071b f109476w;

    /* renamed from: x */
    private int f109477x;

    /* renamed from: y */
    private int f109478y;

    /* renamed from: z */
    private Vibrator f109479z;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.k$a */
    class C42090a implements C40485e {
        /* renamed from: c */
        public final void mo98456c() {
        }

        /* renamed from: a */
        public final void mo98454a() {
            if (C42088k.this.f109457d.f109407a != null) {
                C42088k.this.f109457d.f109407a.mo103275a(C42088k.this);
            }
        }

        /* renamed from: b */
        public final void mo98455b() {
            if (C42088k.this.f109457d.f109407a != null) {
                C42088k.this.f109457d.f109407a.mo103277a(C42088k.this, true);
            }
        }

        private C42090a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.k$b */
    class C42091b implements C42075b {
        private C42091b() {
        }

        /* renamed from: a */
        public final void mo103391a(boolean z, boolean z2) {
            if (C42088k.this.f109458e) {
                if (z) {
                    C42088k.this.f109459f.mo100525a(C42088k.this.getCurrentHelpBoxRect(), (int) C42088k.this.f109460g.x, (int) C42088k.this.f109460g.y, C42088k.this.f109454a);
                } else if (z2) {
                    C42088k.this.f109459f.mo100524a();
                } else {
                    C42088k.this.f109459f.mo100527b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.k$c */
    public interface C42092c {
        /* renamed from: a */
        int mo103272a(C42088k kVar, boolean z, boolean z2);

        /* renamed from: a */
        PointF mo103273a(C42088k kVar, float f, float f2);

        /* renamed from: a */
        Float mo103274a(float f);

        /* renamed from: a */
        void mo103275a(C42088k kVar);

        /* renamed from: a */
        void mo103276a(C42088k kVar, RectF rectF, int i, int i2, boolean z, boolean z2, boolean z3);

        /* renamed from: a */
        void mo103277a(C42088k kVar, boolean z);

        /* renamed from: b */
        void mo103278b(C42088k kVar);
    }

    public final float getCenterX() {
        return this.f109461h;
    }

    public final float getCenterY() {
        return this.f109462i;
    }

    public final int getCurAlignTxt() {
        return this.f109469p;
    }

    public final int getCurColor() {
        return this.f109467n;
    }

    public final String getCurFontType() {
        return this.f109468o;
    }

    public final int getCurMode() {
        return this.f109466m;
    }

    public final TextStickerData getData() {
        return this.f109444A;
    }

    public final float getStickerRotate() {
        return this.f109454a;
    }

    public final float getStickerScale() {
        return this.f109463j;
    }

    public final void invalidate() {
        super.invalidate();
    }

    /* renamed from: a */
    public final boolean mo103404a() {
        return this.f109457d.f109410d;
    }

    /* renamed from: a */
    public final void mo103403a(int i, int i2, int i3, String str) {
        this.f109466m = i;
        this.f109467n = i2;
        this.f109468o = str;
        C42039d.m133620a().f109198b = this.f109468o;
        if (i == 1) {
            setTextColor(i2);
            this.f109455b = false;
        } else if (i == 2) {
            if (i2 == -1) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            m133900c(i2);
            this.f109455b = true;
        } else if (i == 3) {
            setTextColor(-1);
            m133900c(TextStickerEditText.m133804a(i2));
            this.f109455b = true;
        }
        this.f109469p = i3;
        invalidate();
    }

    /* renamed from: a */
    public final boolean mo103411a(C39947b bVar, float f, float f2) {
        if (!m133908l()) {
            return false;
        }
        float d = m133901d(m133903e(f2));
        this.f109449F = m133905g(f, d);
        this.f109457d.mo103385c(f, d);
        return m133910n();
    }

    /* renamed from: a */
    public final boolean mo103410a(C39947b bVar) {
        if (m133908l() && m133910n()) {
            return this.f109457d.mo103383b(bVar.f103738h.x, bVar.f103738h.y);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo103412a(C39949c cVar) {
        if (!m133908l()) {
            return false;
        }
        float d = m133901d(cVar.f103744i);
        this.f109450G = m133904f(cVar.f103743h, d);
        this.f109457d.mo103385c(cVar.f103743h, d);
        return m133911o();
    }

    /* renamed from: a */
    public final boolean mo103405a(float f) {
        if (!m133908l()) {
            return false;
        }
        float degrees = (float) Math.toDegrees((double) f);
        if (Math.abs(degrees) > 10.0f) {
            degrees = 0.0f;
        }
        if (!m133911o()) {
            return false;
        }
        this.f109454a = this.f109457d.mo103376a(this.f109454a, degrees);
        invalidate();
        return true;
    }

    /* renamed from: a */
    public final boolean mo103409a(ScaleGestureDetector scaleGestureDetector) {
        if (!m133908l()) {
            return false;
        }
        float d = m133901d(scaleGestureDetector.getFocusY());
        this.f109451H = m133904f(scaleGestureDetector.getFocusX(), d);
        this.f109457d.mo103385c(scaleGestureDetector.getFocusX(), d);
        return m133912p();
    }

    /* renamed from: a */
    public final boolean mo103407a(MotionEvent motionEvent) {
        if (!m133908l()) {
            return false;
        }
        m133902d(motionEvent);
        boolean c = this.f109457d.mo103385c(motionEvent.getX(), m133901d(motionEvent.getY()));
        if (c) {
            setTouching(true);
        }
        return c;
    }

    /* renamed from: a */
    public final boolean mo103408a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f109457d.mo103387e();
    }

    /* renamed from: a */
    public final boolean mo103406a(float f, float f2) {
        return m133899a(getHelpRect(), f, f2);
    }

    /* renamed from: f */
    public final boolean mo103427f() {
        return this.f109457d.mo103386d();
    }

    public final PointF[] getAnglePointList() {
        return this.f109475v.mo103369b();
    }

    public final PointF[] getAnglePointListForBlock() {
        return this.f109475v.mo103370c();
    }

    public final RectF getCurrentHelpBoxRect() {
        return this.f109475v.mo103364a();
    }

    public final RectF getDeleteRect() {
        return this.f109475v.f109369c;
    }

    public final RectF getEditRect() {
        return this.f109475v.f109371e;
    }

    public final RectF getHelpRect() {
        return this.f109475v.f109368b;
    }

    public final RectF getRotateRect() {
        return this.f109475v.f109370d;
    }

    public final String getText() {
        return m133894a(this.f109465l);
    }

    public final RectF getTextRect() {
        return this.f109475v.f109367a;
    }

    public final RectF getTimeRect() {
        return this.f109475v.f109372f;
    }

    /* renamed from: h */
    public final void mo103448h() {
        this.f109457d.mo103389g();
    }

    /* renamed from: m */
    private boolean m133909m() {
        if (SystemClock.elapsedRealtime() < this.f109446C) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public TextStickerData mo98475e() {
        return mo103428g().clone();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f109459f.mo100531f();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f109459f.mo100532g();
    }

    private int getFontSize() {
        float f;
        if (this.f109447D < 0) {
            Context context = getContext();
            if (this.f109444A == null) {
                f = 28.0f;
            } else {
                f = (float) this.f109444A.fontSize;
            }
            this.f109447D = (int) C9738o.m28690a(context, f);
        }
        return this.f109447D;
    }

    /* renamed from: k */
    private void m133907k() {
        this.f109461h = (float) (getMeasuredWidth() / 2);
        this.f109462i = (float) (getMeasuredHeight() / 2);
        this.f109454a = 0.0f;
        this.f109463j = 1.0f;
    }

    /* renamed from: l */
    private boolean m133908l() {
        if (!this.f109470q || getVisibility() != 0 || (this.f109457d.mo103388f() && !this.f109456c)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m133911o() {
        if (this.f109450G || this.f109449F || this.f109457d.mo103382b()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private boolean m133912p() {
        if (this.f109451H || this.f109449F || this.f109457d.mo103382b()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m133906j() {
        if (this.f109444A != null && this.f109444A.hasPositionData()) {
            this.f109464k = false;
            this.f109461h = this.f109444A.f109252x;
            this.f109462i = this.f109444A.f109253y;
            this.f109454a = this.f109444A.rotation;
            this.f109463j = this.f109444A.scale;
        }
    }

    /* renamed from: n */
    private boolean m133910n() {
        if (this.f109450G || this.f109451H || this.f109449F || this.f109457d.mo103382b() || this.f109457d.mo103384c()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo103449i() {
        int i;
        if (this.f109444A != null && !mo103404a() && !this.f109452I && !m133909m()) {
            boolean isVisibleWhen = this.f109444A.isVisibleWhen(this.f109445B);
            if (isVisibleWhen) {
                i = 0;
            } else {
                i = 8;
            }
            C23487o.m77150b((View) this, i);
            this.f109470q = isVisibleWhen;
        }
    }

    /* renamed from: c */
    public final void mo103420c() {
        this.f109476w.mo103371a();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: d */
    public final void mo103424d() {
        this.f109476w.mo103375c(this.f109461h, this.f109462i, this.f109463j, this.f109454a);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(250);
        ofFloat.start();
    }

    /* renamed from: g */
    public final TextStickerData mo103428g() {
        if (this.f109444A == null) {
            TextStickerData textStickerData = new TextStickerData("", this.f109466m, this.f109467n, this.f109469p, this.f109468o);
            this.f109444A = textStickerData;
            this.f109444A.mTextStrAry = this.f109465l;
            if (C6399b.m19928c()) {
                throw new IllegalStateException("Why are you running here?");
            }
        }
        this.f109444A.f109252x = this.f109461h;
        this.f109444A.f109253y = this.f109462i;
        this.f109444A.rotation = this.f109454a;
        this.f109444A.scale = this.f109463j;
        this.f109444A.mTextStrAry = this.f109465l;
        this.f109444A.mBgMode = this.f109466m;
        this.f109444A.mColor = this.f109467n;
        this.f109444A.mAlign = this.f109469p;
        this.f109444A.mFontType = this.f109468o;
        return this.f109444A;
    }

    /* renamed from: b */
    public final boolean mo103415b(float f) {
        this.f109463j = f;
        return true;
    }

    public final void setCenterX(float f) {
        this.f109461h = f;
    }

    public final void setCenterY(float f) {
        this.f109462i = f;
    }

    public final void setEnableEdit(boolean z) {
        this.f109470q = z;
    }

    public final void setPlayPosition(long j) {
        this.f109445B = j;
    }

    /* renamed from: a */
    private void m133897a(TextStickerData textStickerData) {
        mo98473a(textStickerData, 0, 0);
    }

    /* renamed from: c */
    private void m133900c(int i) {
        this.f109475v.mo103365a(i);
    }

    public final void setOnEditClickListener(C42092c cVar) {
        this.f109457d.f109407a = cVar;
    }

    public final void setTextColor(int i) {
        this.f109475v.mo103368b(i);
    }

    /* renamed from: d */
    private void m133902d(MotionEvent motionEvent) {
        this.f109453J = motionEvent.getY() - motionEvent.getRawY();
    }

    /* renamed from: e */
    private float m133903e(float f) {
        if (C39947b.f103736i) {
            return f + this.f109453J;
        }
        return f;
    }

    public final void setAlpha(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.3137255f;
        }
        mo103414b(f, false);
    }

    public final void setAnimXY(Point point) {
        this.f109476w.mo103373a(point.x - this.f109472s, point.y - this.f109473t);
    }

    public final void setShowHelpBox(boolean z) {
        this.f109457d.mo103380a(z);
        if (!z) {
            m133895a(1000);
        }
    }

    public final void setText(String[] strArr) {
        this.f109465l = strArr;
        this.f109475v.f109373g = strArr;
        invalidate();
    }

    public final void setTouching(boolean z) {
        if (z != this.f109452I) {
            this.f109452I = z;
            if (!z) {
                m133895a(1000);
            }
        }
    }

    /* renamed from: a */
    public static String m133894a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : strArr) {
            sb.append(append);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private float m133901d(float f) {
        if (!C39805en.m127445a() || !C39804em.m127436a() || C39805en.m127451d(getContext()) <= 0) {
            return f;
        }
        return f - ((float) C39804em.f103459c);
    }

    /* renamed from: b */
    public final int mo98474b(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return i;
        }
        return getData().mEndTime;
    }

    /* renamed from: c */
    public final boolean mo103421c(float f) {
        if (f <= 1.0f) {
            if (this.f109463j < 0.4f) {
                return false;
            }
        } else if (this.f109463j > 11.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m133895a(long j) {
        this.f109446C = SystemClock.elapsedRealtime();
        this.f109471r.postDelayed(new C42093l(this), 1000);
    }

    /* renamed from: a */
    private void m133896a(Context context) {
        this.f109475v = new C42070a();
        this.f109457d = new C42072c();
        this.f109476w = new C42071b();
        this.f109475v.mo103366a(context, this);
        this.f109457d.mo103379a(this, this.f109471r);
        this.f109476w.f109393a = this;
        this.f109457d.f109413g = new C42091b();
    }

    /* renamed from: c */
    public final boolean mo103423c(MotionEvent motionEvent) {
        return this.f109457d.mo103387e();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f109465l != null && this.f109465l.length != 0) {
            this.f109448E.x = this.f109461h;
            this.f109448E.y = this.f109462i;
            this.f109475v.mo103367a(canvas, this.f109463j, this.f109454a, this.f109448E, this.f109469p, this.f109455b, mo103404a(), this.f109456c, getFontSize());
            this.f109476w.mo103372a(this.f109463j, this.f109454a, this.f109461h, this.f109462i);
            this.f109476w.mo103374b(this.f109463j, this.f109454a, this.f109461h, this.f109462i);
        }
    }

    /* renamed from: b */
    public final boolean mo103417b(MotionEvent motionEvent) {
        boolean z;
        this.f109460g.set(motionEvent.getRawX(), motionEvent.getRawY());
        if (!m133908l()) {
            return false;
        }
        if (this.f109457d.mo103387e()) {
            z = this.f109457d.mo103381a(motionEvent);
        } else {
            z = false;
        }
        this.f109450G = false;
        this.f109449F = false;
        this.f109451H = false;
        this.f109457d.mo103377a();
        setTouching(false);
        return z;
    }

    /* renamed from: a */
    public final int mo98472a(int i) {
        if (getData() == null || !getData().hasTimeData()) {
            return 0;
        }
        return getData().mStartTime;
    }

    /* renamed from: b */
    public final boolean mo103419b(ScaleGestureDetector scaleGestureDetector) {
        if (!m133908l() || !m133912p() || !mo103421c(scaleGestureDetector.getScaleFactor())) {
            return false;
        }
        this.f109463j *= scaleGestureDetector.getScaleFactor();
        invalidate();
        return true;
    }

    /* renamed from: f */
    private boolean m133904f(float f, float f2) {
        return mo103406a(f, f2 - ((float) this.f109473t));
    }

    /* renamed from: g */
    private boolean m133905g(float f, float f2) {
        boolean f3 = m133904f(f, f2);
        if (!f3) {
            return mo103416b(f, f2);
        }
        return f3;
    }

    /* renamed from: b */
    public final void mo103414b(float f, boolean z) {
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(f);
        }
    }

    /* renamed from: c */
    public final boolean mo103422c(float f, float f2) {
        return m133899a(getTimeRect(), f, f2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f109464k) {
            this.f109464k = false;
            m133907k();
        }
    }

    /* renamed from: e */
    public final boolean mo103426e(float f, float f2) {
        return m133899a(getDeleteRect(), f, f2);
    }

    /* renamed from: b */
    public final boolean mo103416b(float f, float f2) {
        return m133899a(getRotateRect(), f, f2);
    }

    /* renamed from: d */
    public final boolean mo103425d(float f, float f2) {
        return m133899a(getEditRect(), f, f2);
    }

    /* renamed from: a */
    public final void mo103401a(float f, boolean z) {
        this.f109454a = f;
        if (this.f109454a > 180.0f) {
            this.f109454a -= 360.0f;
        }
        if (this.f109454a < -180.0f) {
            this.f109454a += 360.0f;
        }
        if (z) {
            this.f109454a = this.f109454a;
        }
    }

    /* renamed from: a */
    public final void mo103402a(int i, int i2) {
        this.f109472s = i;
        this.f109473t = i2;
        this.f109457d.mo103378a(i, i2);
        if (this.f109444A != null && this.f109444A.mEditCenterPoint != null) {
            setAnimXY(this.f109444A.mEditCenterPoint);
        }
    }

    /* renamed from: a */
    private boolean m133899a(RectF rectF, float f, float f2) {
        return C39515a.m126217b(rectF, f, f2, this.f109454a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo98473a(TextStickerData textStickerData, int i, int i2) {
        this.f109444A = textStickerData;
        if (textStickerData != null) {
            setText(this.f109444A.mTextStrAry);
            mo103403a(this.f109444A.mBgMode, this.f109444A.mColor, this.f109444A.mAlign, this.f109444A.mFontType);
            setAnimXY(this.f109444A.mEditCenterPoint);
            m133906j();
            invalidate();
        }
    }

    /* renamed from: b */
    public final boolean mo103418b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.f109457d.mo103387e();
    }

    public C42088k(Context context, SafeHandler safeHandler, TextStickerData textStickerData, boolean z) {
        super(context);
        this.f109471r = safeHandler;
        this.f109456c = z;
        this.f109459f.f105228g = this.f109456c;
        m133896a(context);
        this.f109477x = C39805en.m127447b(context) / 2;
        this.f109478y = C39805en.m127443a(context) / 2;
        this.f109474u = C39805en.m127450c(context);
        this.f109479z = (Vibrator) context.getSystemService("vibrator");
        m133897a(textStickerData);
    }
}
