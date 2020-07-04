package com.bytedance.ies.uikit.menu;

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
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.uikit.menu.C11053a.C11055a;

public final class SlidingMenu extends RelativeLayout {

    /* renamed from: a */
    public C11051e f29984a;

    /* renamed from: b */
    public C11049c f29985b;

    /* renamed from: c */
    protected int f29986c;

    /* renamed from: d */
    protected VelocityTracker f29987d;

    /* renamed from: e */
    protected int f29988e;

    /* renamed from: f */
    private boolean f29989f;

    /* renamed from: g */
    private boolean f29990g;

    /* renamed from: h */
    private C11053a f29991h;

    /* renamed from: i */
    private C11056b f29992i;

    /* renamed from: j */
    private C11048b f29993j;

    /* renamed from: k */
    private Handler f29994k;

    /* renamed from: l */
    private boolean f29995l;

    /* renamed from: m */
    private boolean f29996m;

    /* renamed from: n */
    private boolean f29997n;

    /* renamed from: o */
    private int f29998o;

    /* renamed from: p */
    private float f29999p;

    /* renamed from: q */
    private float f30000q;

    /* renamed from: r */
    private float f30001r;

    /* renamed from: s */
    private int f30002s;

    /* renamed from: t */
    private int f30003t;

    /* renamed from: u */
    private boolean f30004u;

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$1 */
    class C110441 implements C11055a {
    }

    public static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m32388a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m32387a(Parcel parcel) {
                return new SavedState(parcel, (C110441) null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m32387a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m32388a(i);
            }
        };

        /* renamed from: a */
        public final int f30007a;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30007a = parcel.readInt();
        }

        /* synthetic */ SavedState(Parcel parcel, C110441 r2) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f30007a = i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f30007a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$a */
    public interface C11047a {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$b */
    public interface C11048b {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$c */
    public interface C11049c {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$d */
    public interface C11050d {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$e */
    public interface C11051e {
    }

    /* renamed from: com.bytedance.ies.uikit.menu.SlidingMenu$f */
    public interface C11052f {
    }

    /* renamed from: a */
    private void m32379a() {
        m32381a(true);
    }

    /* renamed from: b */
    private boolean m32383b() {
        return this.f29991h.mo26784a();
    }

    /* renamed from: c */
    private void m32384c() {
        this.f29995l = true;
        this.f29997n = false;
    }

    public final float getBehindScrollScale() {
        return this.f29992i.getScrollScale();
    }

    public final View getContent() {
        return this.f29991h.getContent();
    }

    public final int getCurrentItem() {
        return this.f29991h.getCurrentItem();
    }

    public final View getMenu() {
        return this.f29992i.getContent();
    }

    public final int getMode() {
        return this.f29992i.getMode();
    }

    public final View getSecondaryMenu() {
        return this.f29992i.getSecondaryContent();
    }

    public final int getTouchModeAbove() {
        return this.f29991h.getTouchMode();
    }

    public final int getBehindOffset() {
        return ((LayoutParams) this.f29992i.getLayoutParams()).rightMargin;
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f29991h.getCurrentItem());
    }

    /* renamed from: d */
    private void m32385d() {
        this.f29997n = false;
        this.f29995l = false;
        this.f29996m = false;
        this.f29986c = -1;
        if (this.f29987d != null) {
            this.f29987d.recycle();
            this.f29987d = null;
        }
    }

    public final void setIgnoreContentsBackground(boolean z) {
        this.f29990g = z;
    }

    public final void setOnClickCloseListener(C11048b bVar) {
        this.f29993j = bVar;
    }

    public final void setOnCloseListener(C11049c cVar) {
        this.f29985b = cVar;
    }

    public final void setOnOpenListener(C11051e eVar) {
        this.f29984a = eVar;
    }

    public final void setAboveOffset(int i) {
        this.f29991h.setAboveOffset(i);
    }

    public final void setBehindCanvasTransformer(C11047a aVar) {
        this.f29992i.setCanvasTransformer(aVar);
    }

    public final void setBehindOffset(int i) {
        this.f29992i.setWidthOffset(i);
    }

    public final void setFadeDegree(float f) {
        this.f29992i.setFadeDegree(f);
    }

    public final void setFadeEnabled(boolean z) {
        this.f29992i.setFadeEnabled(z);
    }

    public final void setMenu(View view) {
        this.f29992i.setContent(view);
    }

    public final void setOnClosedListener(C11050d dVar) {
        this.f29991h.setOnClosedListener(dVar);
    }

    public final void setOnOpenedListener(C11052f fVar) {
        this.f29991h.setOnOpenedListener(fVar);
    }

    public final void setRightBehindOffset(int i) {
        this.f29992i.setSecondaryWidthOffset(i);
    }

    public final void setSecondaryMenu(View view) {
        this.f29992i.setSecondaryContent(view);
    }

    public final void setSecondaryShadowDrawable(Drawable drawable) {
        this.f29992i.setSecondaryShadowDrawable(drawable);
    }

    public final void setSelectedView(View view) {
        this.f29992i.setSelectedView(view);
    }

    public final void setSelectorBitmap(Bitmap bitmap) {
        this.f29992i.setSelectorBitmap(bitmap);
    }

    public final void setSelectorEnabled(boolean z) {
        this.f29992i.setSelectorEnabled(true);
    }

    public final void setShadowDrawable(Drawable drawable) {
        this.f29992i.setShadowDrawable(drawable);
    }

    public final void setShadowWidth(int i) {
        this.f29992i.setShadowWidth(i);
    }

    public final void setSlidingEnabled(boolean z) {
        this.f30004u = z;
        this.f29991h.setSlidingEnabled(z);
    }

    public final void setContent(View view) {
        this.f29991h.setContent(view);
        m32379a();
    }

    public final void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setSelectorDrawable(int i) {
        this.f29992i.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public final void setShadowDrawable(int i) {
        setShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public final void setShadowWidthRes(int i) {
        setShadowWidth((int) getResources().getDimension(i));
    }

    /* renamed from: a */
    private void m32381a(boolean z) {
        this.f29991h.mo26781a(1, true);
    }

    /* access modifiers changed from: protected */
    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.left;
        int i2 = rect.right;
        int i3 = rect.top;
        int i4 = rect.bottom;
        if (!this.f29989f) {
            setPadding(i, i3, i2, i4);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f29991h.setCurrentItem(savedState.f30007a);
    }

    public final void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public final void setBehindScrollScale(float f) {
        if (f >= 0.0f || f <= 1.0f) {
            this.f29992i.setScrollScale(f);
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
            this.f29992i.setMode(i);
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
            this.f29991h.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public final void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f29992i.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    /* renamed from: b */
    private void m32382b(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (C0978j.m4132b(motionEvent, b) == this.f29986c) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f30000q = C0978j.m4133c(motionEvent, i);
            this.f29986c = C0978j.m4132b(motionEvent, i);
            if (this.f29987d != null) {
                this.f29987d.clear();
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
            this.f29991h.setCustomViewBehind(null);
            this.f29991h.setCurrentItem(1);
            return;
        }
        this.f29991h.setCurrentItem(1);
        this.f29991h.setCustomViewBehind(this.f29992i);
        setSlidingEnabled(true);
    }

    /* renamed from: a */
    private void m32380a(MotionEvent motionEvent) {
        int i;
        int i2 = this.f29986c;
        int a = m32378a(motionEvent, i2);
        if (i2 != -1) {
            float c = C0978j.m4133c(motionEvent, a);
            float f = c - this.f30000q;
            float abs = Math.abs(f);
            float d = C0978j.m4134d(motionEvent, a);
            float abs2 = Math.abs(d - this.f30001r);
            if (m32383b()) {
                i = this.f29998o / 2;
            } else {
                i = this.f29998o;
            }
            if (abs <= ((float) i) || abs <= abs2 || !this.f29991h.mo26785a(f)) {
                if (abs > ((float) this.f29998o)) {
                    this.f29996m = true;
                }
                return;
            }
            m32384c();
            this.f30000q = c;
            this.f30001r = d;
            this.f29991h.setScrollingCacheEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo26723a(float f) {
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
                this.f29994k.post(new Runnable() {
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
        if (!this.f30004u) {
            return false;
        }
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 3 || action == 1 || (action != 0 && this.f29996m)) {
            m32385d();
            return false;
        }
        if (action == 0) {
            int b = C0978j.m4131b(motionEvent);
            this.f29986c = C0978j.m4132b(motionEvent, b);
            if (this.f29986c != -1) {
                float c = C0978j.m4133c(motionEvent, b);
                this.f29999p = c;
                this.f30000q = c;
                this.f30001r = C0978j.m4134d(motionEvent, b);
                if (this.f29991h.mo26786a(motionEvent)) {
                    this.f29995l = false;
                    this.f29996m = false;
                    this.f29997n = false;
                    if (m32383b() && this.f29991h.mo26788b(motionEvent)) {
                        this.f29997n = true;
                    }
                } else {
                    this.f29996m = true;
                }
            }
        } else if (action == 2) {
            m32380a(motionEvent);
        } else if (action == 6) {
            m32382b(motionEvent);
        }
        if (!this.f29995l) {
            if (this.f29987d == null) {
                this.f29987d = VelocityTracker.obtain();
            }
            this.f29987d.addMovement(motionEvent);
        }
        if (this.f29995l || this.f29997n) {
            return true;
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30004u) {
            return false;
        }
        if (!this.f29995l && !this.f29991h.mo26786a(motionEvent)) {
            return false;
        }
        int action = motionEvent.getAction();
        if (this.f29987d == null) {
            this.f29987d = VelocityTracker.obtain();
        }
        this.f29987d.addMovement(motionEvent);
        switch (action & NormalGiftView.ALPHA_255) {
            case 0:
                this.f29991h.mo26787b();
                this.f29986c = C0978j.m4132b(motionEvent, C0978j.m4131b(motionEvent));
                float x = motionEvent.getX();
                this.f29999p = x;
                this.f30000q = x;
                break;
            case 1:
                if (!this.f29995l) {
                    if (this.f29997n && this.f29991h.mo26788b(motionEvent)) {
                        this.f29991h.setCurrentItem(1);
                        m32385d();
                        break;
                    }
                } else {
                    VelocityTracker velocityTracker = this.f29987d;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f29988e);
                    int a = (int) C0990t.m4162a(velocityTracker, this.f29986c);
                    float scrollX = ((float) (this.f29991h.getScrollX() - this.f29991h.getDestScrollX())) / ((float) this.f29992i.getBehindWidth());
                    int a2 = m32378a(motionEvent, this.f29986c);
                    if (this.f29986c != -1) {
                        this.f29991h.mo26783a(m32377a(scrollX, a, (int) (C0978j.m4133c(motionEvent, a2) - this.f29999p)), true, true, a);
                    } else {
                        this.f29991h.mo26783a(this.f29991h.getCurrentItem(), true, true, a);
                    }
                    this.f29986c = -1;
                    m32385d();
                    break;
                }
            case 2:
                if (!this.f29995l) {
                    m32380a(motionEvent);
                    if (this.f29996m) {
                        return false;
                    }
                }
                if (this.f29995l) {
                    int a3 = m32378a(motionEvent, this.f29986c);
                    if (this.f29986c != -1) {
                        float c = C0978j.m4133c(motionEvent, a3);
                        float f = this.f30000q - c;
                        this.f30000q = c;
                        float scrollX2 = ((float) this.f29991h.getScrollX()) + f;
                        float leftBound = (float) this.f29991h.getLeftBound();
                        float rightBound = (float) this.f29991h.getRightBound();
                        if (scrollX2 < leftBound) {
                            scrollX2 = leftBound;
                        } else if (scrollX2 > rightBound) {
                            scrollX2 = rightBound;
                        }
                        int i = (int) scrollX2;
                        this.f30000q += scrollX2 - ((float) i);
                        this.f29991h.scrollTo(i, getScrollY());
                        this.f29991h.mo26780a(i);
                        break;
                    }
                }
                break;
            case 3:
                if (this.f29995l) {
                    this.f29991h.mo26782a(this.f29991h.getCurrentItem(), true, true);
                    this.f29986c = -1;
                    m32385d();
                    break;
                }
                break;
            case 5:
                int b = C0978j.m4131b(motionEvent);
                this.f30000q = C0978j.m4133c(motionEvent, b);
                this.f29986c = C0978j.m4132b(motionEvent, b);
                break;
            case 6:
                m32382b(motionEvent);
                int a4 = m32378a(motionEvent, this.f29986c);
                if (this.f29986c != -1) {
                    this.f30000q = C0978j.m4133c(motionEvent, a4);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    private int m32378a(MotionEvent motionEvent, int i) {
        int a = C0978j.m4130a(motionEvent, i);
        if (a == -1) {
            this.f29986c = -1;
        }
        return a;
    }

    /* renamed from: a */
    private int m32377a(float f, int i, int i2) {
        int currentItem = this.f29991h.getCurrentItem();
        if (Math.abs(i2) <= this.f30003t || Math.abs(i) <= this.f30002s) {
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
