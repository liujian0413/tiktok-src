package com.bytedance.ies.uikit.menu;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.KeyEventCompat;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11050d;
import com.bytedance.ies.uikit.menu.SlidingMenu.C11052f;
import java.util.List;

/* renamed from: com.bytedance.ies.uikit.menu.a */
public final class C11053a extends ViewGroup {

    /* renamed from: d */
    private static final Interpolator f30008d = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public C11056b f30009a;

    /* renamed from: b */
    public boolean f30010b;

    /* renamed from: c */
    protected int f30011c;

    /* renamed from: e */
    private View f30012e;

    /* renamed from: f */
    private int f30013f;

    /* renamed from: g */
    private Scroller f30014g;

    /* renamed from: h */
    private boolean f30015h;

    /* renamed from: i */
    private boolean f30016i;

    /* renamed from: j */
    private C11055a f30017j;

    /* renamed from: k */
    private C11050d f30018k;

    /* renamed from: l */
    private C11052f f30019l;

    /* renamed from: m */
    private List<View> f30020m;

    /* renamed from: n */
    private float f30021n;

    /* renamed from: com.bytedance.ies.uikit.menu.a$a */
    public interface C11055a {
    }

    public final View getContent() {
        return this.f30012e;
    }

    public final int getCurrentItem() {
        return this.f30013f;
    }

    public final int getTouchMode() {
        return this.f30011c;
    }

    public final int getDestScrollX() {
        return m32392b(this.f30013f);
    }

    /* renamed from: c */
    private boolean m32393c() {
        if (this.f30013f <= 0) {
            return false;
        }
        mo26781a(this.f30013f - 1, true);
        return true;
    }

    /* renamed from: d */
    private boolean m32396d() {
        if (this.f30013f > 0) {
            return false;
        }
        mo26781a(this.f30013f + 1, true);
        return true;
    }

    public final int getBehindWidth() {
        if (this.f30009a == null) {
            return 0;
        }
        return this.f30009a.getBehindWidth();
    }

    public final int getContentLeft() {
        return this.f30012e.getLeft() + this.f30012e.getPaddingLeft();
    }

    /* access modifiers changed from: 0000 */
    public final int getLeftBound() {
        return this.f30009a.mo26817a(this.f30012e);
    }

    /* access modifiers changed from: 0000 */
    public final int getRightBound() {
        return this.f30009a.mo26824b(this.f30012e);
    }

    /* renamed from: a */
    public final boolean mo26784a() {
        if (this.f30013f == 0 || this.f30013f == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float getPercentOpen() {
        return Math.abs(this.f30021n - ((float) this.f30012e.getLeft())) / ((float) getBehindWidth());
    }

    public final void computeScroll() {
        if (this.f30014g.isFinished() || !this.f30014g.computeScrollOffset()) {
            mo26787b();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f30014g.getCurrX();
        int currY = this.f30014g.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            mo26780a(currX);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26787b() {
        if (this.f30016i) {
            setScrollingCacheEnabled(false);
            this.f30014g.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f30014g.getCurrX();
            int currY = this.f30014g.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f30016i = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26780a(int i) {
        getWidth();
    }

    public final void setCustomViewBehind(C11056b bVar) {
        this.f30009a = bVar;
    }

    public final void setOnClosedListener(C11050d dVar) {
        this.f30018k = dVar;
    }

    public final void setOnOpenedListener(C11052f fVar) {
        this.f30019l = fVar;
    }

    public final void setOnPageChangeListener(C11055a aVar) {
        this.f30017j = aVar;
    }

    public final void setSlidingEnabled(boolean z) {
        this.f30010b = z;
    }

    public final void setTouchMode(int i) {
        this.f30011c = i;
    }

    public final void setCurrentItem(int i) {
        mo26782a(i, true, false);
    }

    /* access modifiers changed from: 0000 */
    public final void setScrollingCacheEnabled(boolean z) {
        if (this.f30015h != z) {
            this.f30015h = z;
        }
    }

    /* renamed from: b */
    private static float m32391b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || m32390a(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void setAboveOffset(int i) {
        View view = this.f30012e;
        view.setPadding(i, view.getPaddingTop(), this.f30012e.getPaddingRight(), this.f30012e.getPaddingBottom());
    }

    public final void setContent(View view) {
        if (this.f30012e != null) {
            removeView(this.f30012e);
        }
        this.f30012e = view;
        addView(this.f30012e);
    }

    /* renamed from: b */
    private int m32392b(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.f30009a.mo26818a(this.f30012e, i);
            case 1:
                return this.f30012e.getLeft();
            default:
                return 0;
        }
    }

    /* renamed from: c */
    private boolean m32395c(MotionEvent motionEvent) {
        Rect rect = new Rect();
        for (View hitRect : this.f30020m) {
            hitRect.getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f30009a.mo26820a(this.f30012e, canvas);
        this.f30009a.mo26821a(this.f30012e, canvas, getPercentOpen());
        this.f30009a.mo26825b(this.f30012e, canvas, getPercentOpen());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r6 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m32394c(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            if (r0 != r5) goto L_0x0007
            r0 = 0
        L_0x0007:
            r1 = 0
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r5, r0, r6)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto L_0x0032
            if (r2 == r0) goto L_0x0032
            if (r6 != r4) goto L_0x001f
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x001f:
            if (r6 != r3) goto L_0x0046
            if (r0 == 0) goto L_0x002d
            int r1 = r2.getLeft()
            int r0 = r0.getLeft()
            if (r1 <= r0) goto L_0x003d
        L_0x002d:
            boolean r1 = r2.requestFocus()
            goto L_0x0046
        L_0x0032:
            if (r6 == r4) goto L_0x0042
            r0 = 1
            if (r6 != r0) goto L_0x0038
            goto L_0x0042
        L_0x0038:
            if (r6 == r3) goto L_0x003d
            r0 = 2
            if (r6 != r0) goto L_0x0046
        L_0x003d:
            boolean r1 = r5.m32396d()
            goto L_0x0046
        L_0x0042:
            boolean r1 = r5.m32393c()
        L_0x0046:
            if (r1 == 0) goto L_0x004f
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.menu.C11053a.m32394c(int):boolean");
    }

    /* renamed from: a */
    private boolean m32390a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return m32394c(17);
                    case 22:
                        return m32394c(66);
                }
            } else if (VERSION.SDK_INT >= 11) {
                if (KeyEventCompat.hasNoModifiers(keyEvent)) {
                    return m32394c(2);
                }
                if (KeyEventCompat.hasModifiers(keyEvent, 1)) {
                    return m32394c(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo26788b(MotionEvent motionEvent) {
        return this.f30009a.mo26828b(this.f30012e, this.f30013f, motionEvent.getX() + this.f30021n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26785a(float f) {
        if (mo26784a()) {
            return this.f30009a.mo26826b(f);
        }
        return this.f30009a.mo26822a(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo26786a(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() + this.f30021n);
        if (mo26784a()) {
            return this.f30009a.mo26823a(this.f30012e, this.f30013f, (float) x);
        }
        switch (this.f30011c) {
            case 0:
                return this.f30009a.mo26827b(this.f30012e, x);
            case 1:
                if (!m32395c(motionEvent)) {
                    return true;
                }
                return false;
            case 2:
                return false;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void mo26781a(int i, boolean z) {
        mo26782a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f30012e.measure(getChildMeasureSpec(i, 0, defaultSize), getChildMeasureSpec(i2, 0, defaultSize2));
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.f30021n = (float) i;
        if (this.f30010b) {
            this.f30009a.mo26819a(this.f30012e, i, i2);
        }
        ((SlidingMenu) getParent()).mo26723a(getPercentOpen());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26782a(int i, boolean z, boolean z2) {
        mo26783a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m32389a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i5 = i - scrollX;
        int i6 = 0 - scrollY;
        if (i5 == 0 && i6 == 0) {
            mo26787b();
            return;
        }
        setScrollingCacheEnabled(true);
        this.f30016i = true;
        int behindWidth = getBehindWidth();
        float f = (float) (behindWidth / 2);
        float b = f + (m32391b(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) behindWidth))) * f);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            Math.abs(i5);
            i4 = 600;
        }
        this.f30014g.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo26787b();
            scrollTo(m32392b(this.f30013f), getScrollY());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26783a(int i, boolean z, boolean z2, int i2) {
        if (z2 || this.f30013f != i) {
            this.f30013f = this.f30009a.mo26816a(i);
            int b = m32392b(this.f30013f);
            if (z) {
                m32389a(b, 0, i2);
                return;
            }
            mo26787b();
            scrollTo(b, 0);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f30012e.layout(0, 0, i3 - i, i4 - i2);
    }
}
