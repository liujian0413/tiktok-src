package com.bytedance.android.live.uikit.menu;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.bytedance.android.live.uikit.menu.SlidingMenu.C3545d;
import com.bytedance.android.live.uikit.menu.SlidingMenu.C3547f;
import java.util.List;

/* renamed from: com.bytedance.android.live.uikit.menu.a */
public final class C3548a extends ViewGroup {

    /* renamed from: d */
    private static final Interpolator f10549d = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public C3551b f10550a;

    /* renamed from: b */
    public boolean f10551b;

    /* renamed from: c */
    protected int f10552c;

    /* renamed from: e */
    private View f10553e;

    /* renamed from: f */
    private int f10554f;

    /* renamed from: g */
    private Scroller f10555g;

    /* renamed from: h */
    private boolean f10556h;

    /* renamed from: i */
    private boolean f10557i;

    /* renamed from: j */
    private C3550a f10558j;

    /* renamed from: k */
    private C3545d f10559k;

    /* renamed from: l */
    private C3547f f10560l;

    /* renamed from: m */
    private List<View> f10561m;

    /* renamed from: n */
    private float f10562n;

    /* renamed from: com.bytedance.android.live.uikit.menu.a$a */
    public interface C3550a {
    }

    public final View getContent() {
        return this.f10553e;
    }

    public final int getCurrentItem() {
        return this.f10554f;
    }

    public final int getTouchMode() {
        return this.f10552c;
    }

    public final int getDestScrollX() {
        return m13031b(this.f10554f);
    }

    /* renamed from: c */
    private boolean m13032c() {
        if (this.f10554f <= 0) {
            return false;
        }
        mo10741a(this.f10554f - 1, true);
        return true;
    }

    /* renamed from: d */
    private boolean m13035d() {
        if (this.f10554f > 0) {
            return false;
        }
        mo10741a(this.f10554f + 1, true);
        return true;
    }

    public final int getBehindWidth() {
        if (this.f10550a == null) {
            return 0;
        }
        return this.f10550a.getBehindWidth();
    }

    public final int getContentLeft() {
        return this.f10553e.getLeft() + this.f10553e.getPaddingLeft();
    }

    /* access modifiers changed from: 0000 */
    public final int getLeftBound() {
        return this.f10550a.mo10777a(this.f10553e);
    }

    /* access modifiers changed from: 0000 */
    public final int getRightBound() {
        return this.f10550a.mo10784b(this.f10553e);
    }

    /* renamed from: a */
    public final boolean mo10744a() {
        if (this.f10554f == 0 || this.f10554f == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float getPercentOpen() {
        return Math.abs(this.f10562n - ((float) this.f10553e.getLeft())) / ((float) getBehindWidth());
    }

    public final void computeScroll() {
        if (this.f10555g.isFinished() || !this.f10555g.computeScrollOffset()) {
            mo10747b();
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10555g.getCurrX();
        int currY = this.f10555g.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            mo10740a(currX);
        }
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo10747b() {
        if (this.f10557i) {
            setScrollingCacheEnabled(false);
            this.f10555g.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f10555g.getCurrX();
            int currY = this.f10555g.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.f10557i = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10740a(int i) {
        getWidth();
    }

    public final void setCustomViewBehind(C3551b bVar) {
        this.f10550a = bVar;
    }

    public final void setOnClosedListener(C3545d dVar) {
        this.f10559k = dVar;
    }

    public final void setOnOpenedListener(C3547f fVar) {
        this.f10560l = fVar;
    }

    public final void setOnPageChangeListener(C3550a aVar) {
        this.f10558j = aVar;
    }

    public final void setSlidingEnabled(boolean z) {
        this.f10551b = z;
    }

    public final void setTouchMode(int i) {
        this.f10552c = i;
    }

    public final void setCurrentItem(int i) {
        mo10742a(i, true, false);
    }

    /* access modifiers changed from: 0000 */
    public final void setScrollingCacheEnabled(boolean z) {
        if (this.f10556h != z) {
            this.f10556h = z;
        }
    }

    /* renamed from: b */
    private static float m13030b(float f) {
        double d = (double) (f - 0.5f);
        Double.isNaN(d);
        return (float) Math.sin((double) ((float) (d * 0.4712389167638204d)));
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || m13029a(keyEvent)) {
            return true;
        }
        return false;
    }

    public final void setAboveOffset(int i) {
        View view = this.f10553e;
        view.setPadding(i, view.getPaddingTop(), this.f10553e.getPaddingRight(), this.f10553e.getPaddingBottom());
    }

    public final void setContent(View view) {
        if (this.f10553e != null) {
            removeView(this.f10553e);
        }
        this.f10553e = view;
        addView(this.f10553e);
    }

    /* renamed from: b */
    private int m13031b(int i) {
        switch (i) {
            case 0:
            case 2:
                return this.f10550a.mo10778a(this.f10553e, i);
            case 1:
                return this.f10553e.getLeft();
            default:
                return 0;
        }
    }

    /* renamed from: c */
    private boolean m13034c(MotionEvent motionEvent) {
        Rect rect = new Rect();
        for (View hitRect : this.f10561m) {
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
        this.f10550a.mo10780a(this.f10553e, canvas);
        this.f10550a.mo10781a(this.f10553e, canvas, getPercentOpen());
        this.f10550a.mo10785b(this.f10553e, canvas, getPercentOpen());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r6 != 2) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13033c(int r6) {
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
            boolean r1 = r5.m13035d()
            goto L_0x0046
        L_0x0042:
            boolean r1 = r5.m13032c()
        L_0x0046:
            if (r1 == 0) goto L_0x004f
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.menu.C3548a.m13033c(int):boolean");
    }

    /* renamed from: a */
    private boolean m13029a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                switch (keyCode) {
                    case 21:
                        return m13033c(17);
                    case 22:
                        return m13033c(66);
                }
            } else if (VERSION.SDK_INT >= 11) {
                if (keyEvent.hasNoModifiers()) {
                    return m13033c(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m13033c(1);
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo10748b(MotionEvent motionEvent) {
        return this.f10550a.mo10788b(this.f10553e, this.f10554f, motionEvent.getX() + this.f10562n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10745a(float f) {
        if (mo10744a()) {
            return this.f10550a.mo10786b(f);
        }
        return this.f10550a.mo10782a(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo10746a(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() + this.f10562n);
        if (mo10744a()) {
            return this.f10550a.mo10783a(this.f10553e, this.f10554f, (float) x);
        }
        switch (this.f10552c) {
            case 0:
                return this.f10550a.mo10787b(this.f10553e, x);
            case 1:
                if (!m13034c(motionEvent)) {
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
    public final void mo10741a(int i, boolean z) {
        mo10742a(i, z, false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(0, i);
        int defaultSize2 = getDefaultSize(0, i2);
        setMeasuredDimension(defaultSize, defaultSize2);
        this.f10553e.measure(getChildMeasureSpec(i, 0, defaultSize), getChildMeasureSpec(i2, 0, defaultSize2));
    }

    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
        this.f10562n = (float) i;
        if (this.f10551b) {
            this.f10550a.mo10779a(this.f10553e, i, i2);
        }
        ((SlidingMenu) getParent()).mo10683a(getPercentOpen());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10742a(int i, boolean z, boolean z2) {
        mo10743a(i, z, z2, 0);
    }

    /* renamed from: a */
    private void m13028a(int i, int i2, int i3) {
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
            mo10747b();
            return;
        }
        setScrollingCacheEnabled(true);
        this.f10557i = true;
        int behindWidth = getBehindWidth();
        float f = (float) (behindWidth / 2);
        float b = f + (m13030b(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / ((float) behindWidth))) * f);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i4 = Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4;
        } else {
            Math.abs(i5);
            i4 = 600;
        }
        this.f10555g.startScroll(scrollX, scrollY, i5, i6, Math.min(i4, 600));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            mo10747b();
            scrollTo(m13031b(this.f10554f), getScrollY());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo10743a(int i, boolean z, boolean z2, int i2) {
        if (z2 || this.f10554f != i) {
            this.f10554f = this.f10550a.mo10776a(i);
            int b = m13031b(this.f10554f);
            if (z) {
                m13028a(b, 0, i2);
                return;
            }
            mo10747b();
            scrollTo(b, 0);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f10553e.layout(0, 0, i3 - i, i4 - i2);
    }
}
