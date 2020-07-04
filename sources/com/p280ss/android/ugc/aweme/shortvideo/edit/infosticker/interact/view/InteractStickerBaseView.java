package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39564ap;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.p1566a.C39603b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40474a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40483d;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b.C40485e;
import com.p280ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView */
public class InteractStickerBaseView extends FrameLayout {

    /* renamed from: A */
    private boolean f102965A;

    /* renamed from: B */
    private C40474a f102966B;

    /* renamed from: a */
    protected Context f102967a;

    /* renamed from: b */
    protected float f102968b;

    /* renamed from: c */
    protected float f102969c;

    /* renamed from: d */
    protected int f102970d;

    /* renamed from: e */
    protected int f102971e;

    /* renamed from: f */
    protected StickerHelpBoxView f102972f;

    /* renamed from: g */
    protected View f102973g;

    /* renamed from: h */
    protected C39603b f102974h;

    /* renamed from: i */
    public boolean f102975i;

    /* renamed from: j */
    public boolean f102976j;

    /* renamed from: k */
    private boolean f102977k;

    /* renamed from: l */
    private boolean f102978l;

    /* renamed from: m */
    private boolean f102979m;

    /* renamed from: n */
    private PointF f102980n;

    /* renamed from: o */
    private PointF f102981o;

    /* renamed from: p */
    private long f102982p;

    /* renamed from: q */
    private Runnable f102983q;

    /* renamed from: r */
    private boolean f102984r;

    /* renamed from: s */
    private int f102985s;

    /* renamed from: t */
    private boolean f102986t;

    /* renamed from: u */
    private boolean f102987u;

    /* renamed from: v */
    private boolean f102988v;

    /* renamed from: w */
    private long f102989w;

    /* renamed from: x */
    private int f102990x;

    /* renamed from: y */
    private boolean f102991y;

    /* renamed from: z */
    private boolean f102992z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView$1 */
    class C396271 implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ ViewTreeObserver f102993a;

        public final void onGlobalLayout() {
            if (this.f102993a.isAlive()) {
                this.f102993a.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView$a */
    class C39628a implements C40485e {
        /* renamed from: a */
        public final void mo98454a() {
        }

        /* renamed from: c */
        public final void mo98456c() {
        }

        /* renamed from: b */
        public final void mo98455b() {
            if (InteractStickerBaseView.this.f102974h != null) {
                InteractStickerBaseView.this.f102974h.mo98718a();
            }
        }

        private C39628a() {
        }

        /* synthetic */ C39628a(InteractStickerBaseView interactStickerBaseView, C396271 r2) {
            this();
        }
    }

    /* renamed from: g */
    public boolean mo98828g() {
        return false;
    }

    public View getContentView() {
        return this.f102973g;
    }

    public boolean getLockMode() {
        return this.f102987u;
    }

    public float getRotateAngle() {
        return this.f102969c;
    }

    public float getScale() {
        return this.f102968b;
    }

    /* renamed from: a */
    public final boolean mo98816a(C39947b bVar, float f, float f2) {
        return mo98753a();
    }

    /* renamed from: a */
    public final boolean mo98815a(C39947b bVar) {
        if (!mo98753a()) {
            return false;
        }
        if (Math.abs(bVar.f103738h.x) + Math.abs(bVar.f103738h.y) < 1.0f) {
            return true;
        }
        if (mo98827f()) {
            this.f102991y = true;
        }
        this.f102990x = (int) (Math.abs(bVar.f103738h.x) + Math.abs(bVar.f103738h.y));
        if (!m126858i()) {
            mo98809a(bVar.f103738h.x, bVar.f103738h.y);
            m126857h(this.f102973g.getX(), this.f102973g.getY());
        } else if (this.f102984r) {
            m126851b(bVar.f103738h.x, bVar.f103738h.y);
        }
        if (!this.f102984r) {
            this.f102984r = mo98827f();
        }
        mo98826e();
        return true;
    }

    /* renamed from: a */
    public final boolean mo98817a(C39949c cVar) {
        this.f102978l = m126852c(cVar.f103743h, cVar.f103744i);
        return this.f102978l;
    }

    /* renamed from: a */
    public final boolean mo98814a(ScaleGestureDetector scaleGestureDetector) {
        long currentTimeMillis = System.currentTimeMillis() - this.f102989w;
        if (currentTimeMillis < 300) {
            this.f102989w = System.currentTimeMillis();
        }
        this.f102979m = m126852c(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()) && currentTimeMillis > 300;
        return this.f102979m;
    }

    /* renamed from: j */
    private boolean m126861j() {
        if (this.f102985s == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo98826e() {
        m126848a(false);
    }

    /* renamed from: f */
    public final boolean mo98827f() {
        return this.f102972f.f103014a;
    }

    public PointF[] getFourAnglePoint() {
        return this.f102972f.getFourAnglePoint();
    }

    public RectF getViewPositionRect() {
        return this.f102972f.getViewBoxRect();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo98838h() {
        m126848a(true);
    }

    /* renamed from: i */
    private boolean m126858i() {
        if (this.f102985s == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private boolean m126862k() {
        if (this.f102985s == 4) {
            return true;
        }
        return false;
    }

    public int getContentViewHeight() {
        return (int) (((float) this.f102973g.getMeasuredHeight()) * this.f102968b);
    }

    public int getContentViewWidth() {
        return (int) (((float) this.f102973g.getMeasuredWidth()) * this.f102968b);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f102966B.mo100531f();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f102966B.mo100532g();
    }

    /* renamed from: a */
    private boolean mo98753a() {
        if (this.f102977k || this.f102978l || this.f102979m || m126858i()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void mo98754b() {
        this.f102972f.mo98856b();
        if (this.f102983q != null) {
            this.f102972f.removeCallbacks(this.f102983q);
        }
        this.f102972f.postDelayed(this.f102983q, 3000);
    }

    public PointF getContentViewPoint() {
        return new PointF(this.f102973g.getX(), this.f102973g.getY());
    }

    /* renamed from: c */
    public final void mo98822c() {
        Rect rect = new Rect();
        int x = (int) this.f102973g.getX();
        int y = (int) this.f102973g.getY();
        rect.set(x, y, this.f102973g.getMeasuredWidth() + x, this.f102973g.getMeasuredHeight() + y);
        this.f102972f.mo98854a(rect);
        this.f102972f.mo98853a(this.f102968b, this.f102969c);
        this.f102972f.setStickerShowHelpboxCallback(new C39632c(this));
    }

    /* renamed from: d */
    public final void mo98825d() {
        float f;
        mo98822c();
        this.f102972f.mo98852a();
        float f2 = 0.0f;
        if (this.f102974h != null) {
            PointF a = this.f102974h.mo98715a(0.0f, 0.0f);
            f2 = a.x;
            f = a.y;
        } else {
            f = 0.0f;
        }
        float x = this.f102973g.getX() + f2;
        float y = this.f102973g.getY() + f;
        if (this.f102974h == null || !this.f102987u || this.f102974h.mo98723b(f2, f)) {
            this.f102973g.setX(x);
            this.f102973g.setY(y);
            this.f102972f.mo98857b(f2, f);
        }
    }

    public void setLockMode(boolean z) {
        this.f102987u = z;
    }

    public void setStickerEditListener(C39603b bVar) {
        this.f102974h = bVar;
    }

    public InteractStickerBaseView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m126848a(boolean z) {
        this.f102972f.mo98855a(z);
    }

    /* renamed from: b */
    public final boolean mo98821b(ScaleGestureDetector scaleGestureDetector) {
        if (!this.f102979m) {
            return false;
        }
        mo98818b(scaleGestureDetector.getScaleFactor());
        return true;
    }

    /* renamed from: a */
    public final PointF mo98807a(VESize vESize) {
        Rect rect = new Rect();
        this.f102973g.getHitRect(rect);
        rect.centerX();
        return new PointF(rect.exactCenterX(), rect.exactCenterY());
    }

    /* renamed from: a */
    public final void mo98808a(float f) {
        if (this.f102974h != null) {
            int a = this.f102974h.mo98714a(false, true, mo98828g());
            if (this.f102987u && !this.f102974h.mo98722b(f)) {
                return;
            }
            if (4 == a) {
                f = this.f102974h.mo98717a(f).floatValue();
            }
        }
        this.f102969c -= f;
        this.f102973g.setRotation(this.f102969c);
        this.f102972f.mo98853a(this.f102968b, this.f102969c);
    }

    /* renamed from: c */
    public final boolean mo98823c(float f) {
        if (!this.f102978l) {
            return false;
        }
        mo98808a((float) Math.toDegrees((double) f));
        return true;
    }

    /* renamed from: b */
    public final void mo98818b(float f) {
        if (this.f102974h == null || !this.f102987u || this.f102974h.mo98724c(f)) {
            this.f102968b *= f;
            if (this.f102968b > 11.0f) {
                this.f102968b = 11.0f;
            } else if (this.f102968b < 0.4f) {
                this.f102968b = 0.4f;
            } else {
                this.f102973g.setScaleX(this.f102968b);
                this.f102973g.setScaleY(this.f102968b);
                this.f102972f.mo98853a(this.f102968b, this.f102969c);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo98824c(MotionEvent motionEvent) {
        boolean f = mo98827f();
        if (f && this.f102992z) {
            mo98826e();
        }
        this.f102992z = false;
        this.f102975i = false;
        return f;
    }

    /* renamed from: b */
    public final boolean mo98819b(MotionEvent motionEvent) {
        m126860j(motionEvent.getX(), motionEvent.getY());
        this.f102981o.set(motionEvent.getRawX(), motionEvent.getRawY());
        this.f102986t = this.f102972f.mo98858c(this.f102980n.x, this.f102980n.y);
        boolean i = m126859i(this.f102973g.getX(), this.f102973g.getY());
        if (m126861j()) {
            this.f102976j = true;
        }
        if (this.f102977k) {
            this.f102989w = System.currentTimeMillis();
        }
        this.f102992z = !this.f102975i;
        this.f102977k = false;
        this.f102979m = false;
        this.f102978l = false;
        this.f102975i = false;
        this.f102985s = -1;
        return i;
    }

    /* renamed from: a */
    public final boolean mo98812a(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        this.f102991y = false;
        this.f102975i = false;
        this.f102975i = false;
        if (this.f102965A || !m126853d(motionEvent.getX(), motionEvent.getY())) {
            z = false;
        } else {
            z = true;
        }
        if (this.f102965A || !m126854e(motionEvent.getX(), motionEvent.getY())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.f102965A && m126855f(motionEvent.getX(), motionEvent.getY())) {
            z3 = true;
        }
        this.f102977k = m126852c(motionEvent.getX(), motionEvent.getY());
        if (z) {
            this.f102985s = 2;
        } else if (z2) {
            this.f102985s = 1;
        } else if (this.f102977k) {
            this.f102985s = 3;
        } else if (z3) {
            this.f102985s = 4;
        } else {
            this.f102985s = -1;
        }
        if (this.f102985s != -1) {
            this.f102975i = true;
        }
        if (!this.f102975i) {
            mo98826e();
        }
        m126856g(motionEvent.getX(), motionEvent.getY());
        return this.f102975i;
    }

    /* renamed from: g */
    private void m126856g(float f, float f2) {
        m126860j(f, f2);
        this.f102982p = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo98810a(int i, int i2) {
        this.f102970d = i;
        this.f102971e = i2;
    }

    /* renamed from: c */
    private boolean m126852c(float f, float f2) {
        m126860j(f, f2);
        return this.f102972f.mo98858c(this.f102980n.x, this.f102980n.y);
    }

    /* renamed from: d */
    private boolean m126853d(float f, float f2) {
        m126860j(f, f2);
        return this.f102972f.mo98859d(this.f102980n.x, this.f102980n.y);
    }

    /* renamed from: e */
    private boolean m126854e(float f, float f2) {
        m126860j(f, f2);
        return this.f102972f.mo98860e(this.f102980n.x, this.f102980n.y);
    }

    /* renamed from: f */
    private boolean m126855f(float f, float f2) {
        m126860j(f, f2);
        return this.f102972f.mo98861f(this.f102980n.x, this.f102980n.y);
    }

    /* renamed from: j */
    private void m126860j(float f, float f2) {
        this.f102980n.set(f, f2);
        this.f102980n.offset((float) (-this.f102970d), (float) (-this.f102971e));
    }

    public InteractStickerBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102968b = 1.0f;
        this.f102980n = new PointF();
        this.f102981o = new PointF();
        this.f102983q = new C39631b(this);
        this.f102985s = -1;
        this.f102986t = false;
        this.f102987u = false;
        this.f102988v = false;
        this.f102989w = 0;
        this.f102990x = 0;
        this.f102991y = false;
        this.f102992z = false;
        this.f102965A = C35563c.f93231M.mo93305a(Property.EnableStickerFunctionalities);
        this.f102966B = new C40483d(this, new C39628a(this, null));
    }

    /* renamed from: b */
    private void m126851b(float f, float f2) {
        int i;
        float centerX = this.f102972f.getHelpBoxRect().centerX();
        float centerY = this.f102972f.getHelpBoxRect().centerY();
        float centerX2 = this.f102972f.getRotateRect().centerX();
        float centerY2 = this.f102972f.getRotateRect().centerY();
        float f3 = f + centerX2;
        float f4 = f2 + centerY2;
        float f5 = centerX2 - centerX;
        float f6 = centerY2 - centerY;
        float f7 = f3 - centerX;
        float f8 = f4 - centerY;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        float sqrt2 = (float) Math.sqrt((double) ((f7 * f7) + (f8 * f8)));
        mo98818b(sqrt2 / sqrt);
        double d = (double) (((f5 * f7) + (f6 * f8)) / (sqrt * sqrt2));
        if (d <= 1.0d && d >= -1.0d) {
            float degrees = (float) Math.toDegrees(Math.acos(d));
            if ((f5 * f8) - (f7 * f6) > 0.0f) {
                i = 1;
            } else {
                i = -1;
            }
            mo98808a(-(((float) i) * degrees));
        }
    }

    /* renamed from: h */
    private void m126857h(float f, float f2) {
        m126860j(f + ((float) (this.f102973g.getWidth() / 2)), f2 + ((float) (this.f102973g.getHeight() / 2)));
        this.f102980n.x += (float) this.f102970d;
        if (mo98753a() && this.f102974h != null) {
            this.f102974h.mo98720a(this, this.f102980n.x, this.f102980n.y, new RectF(this.f102972f.getHelpBoxRect()), false);
        }
    }

    /* renamed from: i */
    private boolean m126859i(float f, float f2) {
        m126860j(f + ((float) (this.f102973g.getWidth() / 2)), f2 + ((float) (this.f102973g.getHeight() / 2)));
        this.f102980n.x += (float) this.f102970d;
        if (this.f102985s != -1) {
            if (this.f102974h != null) {
                this.f102974h.mo98720a(this, this.f102980n.x, this.f102980n.y, new RectF(this.f102972f.getHelpBoxRect()), true);
            }
            if (System.currentTimeMillis() - this.f102982p > 300 && this.f102984r) {
                mo98754b();
                this.f102984r = false;
            }
            if (System.currentTimeMillis() - this.f102982p < 300) {
                if (m126861j()) {
                    if (this.f102974h != null) {
                        this.f102974h.mo98719a(this);
                    }
                } else if (m126862k()) {
                    if (this.f102974h != null) {
                        this.f102974h.mo98718a();
                    }
                } else if (mo98827f() || (this.f102991y && this.f102990x < 2)) {
                    if (this.f102974h != null && this.f102986t) {
                        new C39564ap().mo98508c(true);
                        this.f102974h.mo98718a();
                    }
                    if (this.f102965A) {
                        mo98826e();
                    }
                } else {
                    mo98754b();
                }
            }
            if (this.f102974h != null) {
                this.f102974h.mo98714a(true, false, mo98828g());
            }
            return true;
        }
        if (this.f102978l && this.f102974h != null) {
            this.f102974h.mo98720a(this, this.f102980n.x, this.f102980n.y, new RectF(this.f102972f.getHelpBoxRect()), true);
            this.f102974h.mo98714a(true, true, mo98828g());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo98809a(float f, float f2) {
        if (this.f102974h != null) {
            int a = this.f102974h.mo98714a(false, false, mo98828g());
            if (-1 != a) {
                PointF a2 = this.f102974h.mo98716a(f, f2, mo98828g());
                if (3 == a) {
                    f = a2.x;
                    f2 = a2.y;
                }
            }
        }
        float x = this.f102973g.getX() + f;
        float y = this.f102973g.getY() + f2;
        if (this.f102974h == null || !this.f102987u || this.f102974h.mo98723b(f, f2)) {
            this.f102973g.setX(x);
            this.f102973g.setY(y);
            this.f102972f.mo98857b(f, f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98811a(boolean z, boolean z2) {
        if (this.f102974h != null) {
            this.f102974h.mo98721a(z);
        }
        if (this.f102965A) {
            if (z) {
                this.f102966B.mo100525a(this.f102972f.getHelpBoxRect(), (int) this.f102981o.x, (int) this.f102981o.y, this.f102972f.getRotateAngle());
            } else if (z2) {
                this.f102966B.mo100524a();
            } else {
                this.f102966B.mo100527b();
            }
        }
    }

    /* renamed from: b */
    public final boolean mo98820b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f102977k || m126858i() || System.currentTimeMillis() - this.f102989w < 300) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo98813a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f102977k || System.currentTimeMillis() - this.f102989w < 300) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f102988v != z) {
            this.f102988v = z;
            mo98822c();
        }
    }
}
