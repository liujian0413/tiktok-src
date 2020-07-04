package com.bytedance.android.live.uikit.menu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0990t;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.live.uikit.menu.C3548a.C3550a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public final class SlidingMenu extends RelativeLayout {

    /* renamed from: a */
    public C3546e f10525a;

    /* renamed from: b */
    public C3544c f10526b;

    /* renamed from: c */
    protected int f10527c;

    /* renamed from: d */
    protected VelocityTracker f10528d;

    /* renamed from: e */
    protected int f10529e;

    /* renamed from: f */
    private boolean f10530f;

    /* renamed from: g */
    private boolean f10531g;

    /* renamed from: h */
    private C3548a f10532h;

    /* renamed from: i */
    private C3551b f10533i;

    /* renamed from: j */
    private C3543b f10534j;

    /* renamed from: k */
    private Handler f10535k;

    /* renamed from: l */
    private boolean f10536l;

    /* renamed from: m */
    private boolean f10537m;

    /* renamed from: n */
    private boolean f10538n;

    /* renamed from: o */
    private int f10539o;

    /* renamed from: p */
    private float f10540p;

    /* renamed from: q */
    private float f10541q;

    /* renamed from: r */
    private float f10542r;

    /* renamed from: s */
    private int f10543s;

    /* renamed from: t */
    private int f10544t;

    /* renamed from: u */
    private boolean f10545u;

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$1 */
    class C35391 implements C3550a {
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m13027a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m13026a(Parcel parcel) {
                return new SavedState(parcel, (C35391) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13026a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13027a(i);
            }
        };

        /* renamed from: a */
        public final int f10548a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10548a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C35391 r2) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f10548a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10548a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$a */
    public interface C3542a {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$b */
    public interface C3543b {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$c */
    public interface C3544c {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$d */
    public interface C3545d {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$e */
    public interface C3546e {
    }

    /* renamed from: com.bytedance.android.live.uikit.menu.SlidingMenu$f */
    public interface C3547f {
    }

    /* renamed from: a */
    private void m13018a() {
        m13020a(true);
    }

    /* renamed from: b */
    private boolean m13022b() {
        return this.f10532h.mo10744a();
    }

    /* renamed from: c */
    private void m13023c() {
        this.f10536l = true;
        this.f10538n = false;
    }

    public final float getBehindScrollScale() {
        return this.f10533i.getScrollScale();
    }

    public final View getContent() {
        return this.f10532h.getContent();
    }

    public final int getCurrentItem() {
        return this.f10532h.getCurrentItem();
    }

    public final View getMenu() {
        return this.f10533i.getContent();
    }

    public final int getMode() {
        return this.f10533i.getMode();
    }

    public final View getSecondaryMenu() {
        return this.f10533i.getSecondaryContent();
    }

    public final int getTouchModeAbove() {
        return this.f10532h.getTouchMode();
    }

    public final int getBehindOffset() {
        return ((LayoutParams) this.f10533i.getLayoutParams()).rightMargin;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f10532h.getCurrentItem());
    }

    /* renamed from: d */
    private void m13024d() {
        this.f10538n = false;
        this.f10536l = false;
        this.f10537m = false;
        this.f10527c = -1;
        if (this.f10528d != null) {
            this.f10528d.recycle();
            this.f10528d = null;
        }
    }

    public final void setIgnoreContentsBackground(boolean z) {
        this.f10531g = z;
    }

    public final void setOnClickCloseListener(C3543b bVar) {
        this.f10534j = bVar;
    }

    public final void setOnCloseListener(C3544c cVar) {
        this.f10526b = cVar;
    }

    public final void setOnOpenListener(C3546e eVar) {
        this.f10525a = eVar;
    }

    public final void setAboveOffset(int i) {
        this.f10532h.setAboveOffset(i);
    }

    public final void setBehindCanvasTransformer(C3542a aVar) {
        this.f10533i.setCanvasTransformer(aVar);
    }

    public final void setBehindOffset(int i) {
        this.f10533i.setWidthOffset(i);
    }

    public final void setFadeDegree(float f) {
        this.f10533i.setFadeDegree(f);
    }

    public final void setFadeEnabled(boolean z) {
        this.f10533i.setFadeEnabled(z);
    }

    public final void setMenu(View view) {
        this.f10533i.setContent(view);
    }

    public final void setOnClosedListener(C3545d dVar) {
        this.f10532h.setOnClosedListener(dVar);
    }

    public final void setOnOpenedListener(C3547f fVar) {
        this.f10532h.setOnOpenedListener(fVar);
    }

    public final void setRightBehindOffset(int i) {
        this.f10533i.setSecondaryWidthOffset(i);
    }

    public final void setSecondaryMenu(View view) {
        this.f10533i.setSecondaryContent(view);
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f10533i.setSecondaryShadowDrawable(drawable);
    }

    public final void setSelectedView(View view) {
        this.f10533i.setSelectedView(view);
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f10533i.setSelectorBitmap(bitmap);
    }

    public final void setSelectorEnabled(boolean z) {
        this.f10533i.setSelectorEnabled(true);
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f10533i.setShadowDrawable(drawable);
    }

    public final void setShadowWidth(int i) {
        this.f10533i.setShadowWidth(i);
    }

    public final void setSlidingEnabled(boolean z) {
        this.f10545u = z;
        this.f10532h.setSlidingEnabled(z);
    }

    public final void setContent(View view) {
        this.f10532h.setContent(view);
        m13018a();
    }

    public final void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setSelectorDrawable(int i) {
        this.f10533i.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public final void setShadowDrawable(int i) {
        setShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setShadowWidthRes(int i) {
        setShadowWidth((int) getResources().getDimension(i));
    }

    /* renamed from: a */
    private void m13020a(boolean z) {
        this.f10532h.mo10741a(1, true);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (!this.f10530f) {
            setPadding(i, i3, i2, i4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10532h.setCurrentItem(savedState.f10548a);
    }

    public final void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindScrollScale(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            this.f10533i.setScrollScale(f);
            return;
        }
        throw new IllegalStateException("ScrollScale must be between 0 and 1");
    }

    public final void setBehindWidthRes(int i) {
        setBehindWidth((int) getContext().getResources().getDimension(i));
    }

    public final void setContent(int i) {
        setContent(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setMenu(int i) {
        setMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f10533i.setMode(i);
            return;
        }
        throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
    }

    public final void setRightBehindOffsetRes(int i) {
        setRightBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setSecondaryMenu(int i) {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, null));
    }

    public final void setTouchModeAbove(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f10532h.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public final void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f10533i.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    /* renamed from: b */
    private void m13021b(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (C0978j.m4132b(motionEvent, b) == this.f10527c) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f10541q = C0978j.m4133c(motionEvent, i);
            this.f10527c = C0978j.m4132b(motionEvent, i);
            if (this.f10528d != null) {
                this.f10528d.clear();
            }
        }
    }

    public final void setBehindWidth(int i) {
        int i2;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Class<Display> cls = Display.class;
        try {
            Class[] clsArr = {Point.class};
            Point point = new Point();
            cls.getMethod("getSize", clsArr).invoke(defaultDisplay, new Object[]{point});
            i2 = point.x;
        } catch (Exception unused) {
            i2 = defaultDisplay.getWidth();
        }
        setBehindOffset(i2 - i);
    }

    public final void setStatic(boolean z) {
        if (z) {
            setSlidingEnabled(false);
            this.f10532h.setCustomViewBehind(null);
            this.f10532h.setCurrentItem(1);
            return;
        }
        this.f10532h.setCurrentItem(1);
        this.f10532h.setCustomViewBehind(this.f10533i);
        setSlidingEnabled(true);
    }

    /* renamed from: a */
    private void m13019a(MotionEvent motionEvent) {
        int i;
        int i2 = this.f10527c;
        int a = m13017a(motionEvent, i2);
        if (i2 != -1) {
            float c = C0978j.m4133c(motionEvent, a);
            float f = c - this.f10541q;
            float abs = Math.abs(f);
            float d = C0978j.m4134d(motionEvent, a);
            float abs2 = Math.abs(d - this.f10542r);
            if (m13022b()) {
                i = this.f10539o / 2;
            } else {
                i = this.f10539o;
            }
            if (abs <= ((float) i) || abs <= abs2 || !this.f10532h.mo10745a(f)) {
                if (abs > ((float) this.f10539o)) {
                    this.f10537m = true;
                }
                return;
            }
            m13023c();
            this.f10541q = c;
            this.f10542r = d;
            this.f10532h.setScrollingCacheEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo10683a(float f) {
        boolean z;
        if (VERSION.SDK_INT >= 11) {
            final int i = 0;
            if (f <= 0.0f || f >= 1.0f) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = 2;
            }
            if (i != getContent().getLayerType()) {
                this.f10535k.post(new Runnable() {
                    public final void run() {
                        boolean z;
                        StringBuilder sb = new StringBuilder("changing layerType. hardware? ");
                        if (i == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sb.append(z);
                        SlidingMenu.this.getContent().setLayerType(i, null);
                        SlidingMenu.this.getMenu().setLayerType(i, null);
                        if (SlidingMenu.this.getSecondaryMenu() != null) {
                            SlidingMenu.this.getSecondaryMenu().setLayerType(i, null);
                        }
                    }
                });
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f10545u) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1 || (action != 0 && this.f10537m)) {
            m13024d();
            return false;
        }
        if (action == 0) {
            int b = C0978j.m4131b(motionEvent);
            this.f10527c = C0978j.m4132b(motionEvent, b);
            if (this.f10527c != -1) {
                float c = C0978j.m4133c(motionEvent, b);
                this.f10540p = c;
                this.f10541q = c;
                this.f10542r = C0978j.m4134d(motionEvent, b);
                if (this.f10532h.mo10746a(motionEvent)) {
                    this.f10536l = false;
                    this.f10537m = false;
                    this.f10538n = false;
                    if (m13022b() && this.f10532h.mo10748b(motionEvent)) {
                        this.f10538n = true;
                    }
                } else {
                    this.f10537m = true;
                }
            }
        } else if (action == 2) {
            m13019a(motionEvent);
        } else if (action == 6) {
            m13021b(motionEvent);
        }
        if (!this.f10536l) {
            if (this.f10528d == null) {
                this.f10528d = VelocityTracker.obtain();
            }
            this.f10528d.addMovement(motionEvent);
        }
        if (this.f10536l || this.f10538n) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10545u) {
            return false;
        }
        if (!this.f10536l && !this.f10532h.mo10746a(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f10528d == null) {
            this.f10528d = VelocityTracker.obtain();
        }
        this.f10528d.addMovement(motionEvent);
        switch (action & NormalGiftView.ALPHA_255) {
            case 0:
                this.f10532h.mo10747b();
                this.f10527c = C0978j.m4132b(motionEvent, C0978j.m4131b(motionEvent));
                float x = motionEvent.getX();
                this.f10540p = x;
                this.f10541q = x;
                break;
            case 1:
                if (!this.f10536l) {
                    if (this.f10538n && this.f10532h.mo10748b(motionEvent)) {
                        this.f10532h.setCurrentItem(1);
                        m13024d();
                        break;
                    }
                } else {
                    VelocityTracker velocityTracker = this.f10528d;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f10529e);
                    int a = (int) C0990t.m4162a(velocityTracker, this.f10527c);
                    float scrollX = ((float) (this.f10532h.getScrollX() - this.f10532h.getDestScrollX())) / ((float) this.f10533i.getBehindWidth());
                    int a2 = m13017a(motionEvent, this.f10527c);
                    if (this.f10527c != -1) {
                        this.f10532h.mo10743a(m13016a(scrollX, a, (int) (C0978j.m4133c(motionEvent, a2) - this.f10540p)), true, true, a);
                    } else {
                        this.f10532h.mo10743a(this.f10532h.getCurrentItem(), true, true, a);
                    }
                    this.f10527c = -1;
                    m13024d();
                    break;
                }
            case 2:
                if (!this.f10536l) {
                    m13019a(motionEvent);
                    if (this.f10537m) {
                        return false;
                    }
                }
                if (this.f10536l) {
                    int a3 = m13017a(motionEvent, this.f10527c);
                    if (this.f10527c != -1) {
                        float c = C0978j.m4133c(motionEvent, a3);
                        float f = this.f10541q - c;
                        this.f10541q = c;
                        float scrollX2 = ((float) this.f10532h.getScrollX()) + f;
                        float leftBound = (float) this.f10532h.getLeftBound();
                        float rightBound = (float) this.f10532h.getRightBound();
                        if (scrollX2 < leftBound) {
                            scrollX2 = leftBound;
                        } else if (scrollX2 > rightBound) {
                            scrollX2 = rightBound;
                        }
                        int i = (int) scrollX2;
                        this.f10541q += scrollX2 - ((float) i);
                        this.f10532h.scrollTo(i, getScrollY());
                        this.f10532h.mo10740a(i);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f10536l) {
                    this.f10532h.mo10742a(this.f10532h.getCurrentItem(), true, true);
                    this.f10527c = -1;
                    m13024d();
                    break;
                }
                break;
            case 5:
                int b = C0978j.m4131b(motionEvent);
                this.f10541q = C0978j.m4133c(motionEvent, b);
                this.f10527c = C0978j.m4132b(motionEvent, b);
                break;
            case 6:
                m13021b(motionEvent);
                int a4 = m13017a(motionEvent, this.f10527c);
                if (this.f10527c != -1) {
                    this.f10541q = C0978j.m4133c(motionEvent, a4);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m13017a(MotionEvent motionEvent, int i) {
        int a = C0978j.m4130a(motionEvent, i);
        if (a == -1) {
            this.f10527c = -1;
        }
        return a;
    }

    /* renamed from: a */
    private int m13016a(float f, int i, int i2) {
        int currentItem = this.f10532h.getCurrentItem();
        if (Math.abs(i2) <= this.f10544t || Math.abs(i) <= this.f10543s) {
            return Math.round(((float) currentItem) + f);
        }
        if (i > 0 && i2 > 0) {
            return currentItem - 1;
        }
        if (i >= 0 || i2 >= 0) {
            return currentItem;
        }
        return currentItem + 1;
    }
}
