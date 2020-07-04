package android.support.p029v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.C0998y;
import android.support.p022v4.widget.ListViewAutoScrollHelper;
import android.support.p029v7.graphics.drawable.C1131b;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;

/* renamed from: android.support.v7.widget.x */
class C1434x extends ListView {

    /* renamed from: a */
    public boolean f5558a;

    /* renamed from: b */
    C1436b f5559b;

    /* renamed from: c */
    private final Rect f5560c = new Rect();

    /* renamed from: d */
    private int f5561d = 0;

    /* renamed from: e */
    private int f5562e = 0;

    /* renamed from: f */
    private int f5563f = 0;

    /* renamed from: g */
    private int f5564g = 0;

    /* renamed from: h */
    private int f5565h;

    /* renamed from: i */
    private Field f5566i;

    /* renamed from: j */
    private C1435a f5567j;

    /* renamed from: k */
    private boolean f5568k;

    /* renamed from: l */
    private boolean f5569l;

    /* renamed from: m */
    private C0998y f5570m;

    /* renamed from: n */
    private ListViewAutoScrollHelper f5571n;

    /* renamed from: android.support.v7.widget.x$a */
    static class C1435a extends C1131b {

        /* renamed from: a */
        public boolean f5572a = true;

        C1435a(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f5572a) {
                super.draw(canvas);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f5572a) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void setHotspot(float f, float f2) {
            if (this.f5572a) {
                super.setHotspot(f, f2);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f5572a) {
                return super.setVisible(z, z2);
            }
            return false;
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f5572a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: android.support.v7.widget.x$b */
    class C1436b implements Runnable {
        /* renamed from: b */
        public final void mo6625b() {
            C1434x.this.post(this);
        }

        /* renamed from: a */
        public final void mo6624a() {
            C1434x.this.f5559b = null;
            C1434x.this.removeCallbacks(this);
        }

        public final void run() {
            C1434x.this.f5559b = null;
            C1434x.this.drawableStateChanged();
        }

        C1436b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f5559b = null;
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f5559b == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m7205a();
        }
    }

    public boolean hasFocus() {
        if (this.f5569l || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public boolean hasWindowFocus() {
        if (this.f5569l || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public boolean isFocused() {
        if (this.f5569l || super.isFocused()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m7205a() {
        Drawable selector = getSelector();
        if (selector != null && this.f5558a && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public boolean isInTouchMode() {
        if ((!this.f5569l || !this.f5568k) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m7211b() {
        this.f5558a = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f5565h - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f5570m != null) {
            this.f5570m.mo3804b();
            this.f5570m = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f5568k = z;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m7208a(canvas);
        super.dispatchDraw(canvas);
    }

    private void setSelectorEnabled(boolean z) {
        if (this.f5567j != null) {
            this.f5567j.f5572a = z;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f5565h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f5559b != null) {
            this.f5559b.mo6624a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        C1435a aVar;
        if (drawable != null) {
            aVar = new C1435a(drawable);
        } else {
            aVar = null;
        }
        this.f5567j = aVar;
        super.setSelector(this.f5567j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5561d = rect.left;
        this.f5562e = rect.top;
        this.f5563f = rect.right;
        this.f5564g = rect.bottom;
    }

    /* renamed from: a */
    private void m7208a(Canvas canvas) {
        if (!this.f5560c.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f5560c);
                selector.draw(canvas);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f5559b == null) {
            this.f5559b = new C1436b();
            this.f5559b.mo6625b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m7205a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    /* renamed from: a */
    private void m7209a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    C1434x(Context context, boolean z) {
        super(context, null, R.attr.jf);
        this.f5569l = z;
        setCacheColorHint(0);
        try {
            this.f5566i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5566i.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* renamed from: a */
    private void m7206a(int i, View view) {
        boolean z;
        Drawable selector = getSelector();
        boolean z2 = true;
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        m7212b(i, view);
        if (z) {
            Rect rect = this.f5560c;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            C0727a.m3102a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    private void m7212b(int i, View view) {
        Rect rect = this.f5560c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5561d;
        rect.top -= this.f5562e;
        rect.right += this.f5563f;
        rect.bottom += this.f5564g;
        try {
            boolean z = this.f5566i.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f5566i.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5507a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L_0x0011;
                case 2: goto L_0x000f;
                case 3: goto L_0x000c;
                default: goto L_0x0009;
            }
        L_0x0009:
            r9 = 0
            r3 = 1
            goto L_0x0041
        L_0x000c:
            r9 = 0
            r3 = 0
            goto L_0x0041
        L_0x000f:
            r3 = 1
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x0019
            goto L_0x000c
        L_0x0019:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x002c
            r9 = 1
            goto L_0x0041
        L_0x002c:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m7210a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x0009
            r7.m7209a(r3, r5)
            goto L_0x0009
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            if (r9 == 0) goto L_0x0048
        L_0x0045:
            r7.m7211b()
        L_0x0048:
            if (r3 == 0) goto L_0x0060
            android.support.v4.widget.ListViewAutoScrollHelper r9 = r7.f5571n
            if (r9 != 0) goto L_0x0055
            android.support.v4.widget.ListViewAutoScrollHelper r9 = new android.support.v4.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.f5571n = r9
        L_0x0055:
            android.support.v4.widget.ListViewAutoScrollHelper r9 = r7.f5571n
            r9.mo4068a(r2)
            android.support.v4.widget.ListViewAutoScrollHelper r9 = r7.f5571n
            r9.onTouch(r7, r8)
            goto L_0x0069
        L_0x0060:
            android.support.v4.widget.ListViewAutoScrollHelper r8 = r7.f5571n
            if (r8 == 0) goto L_0x0069
            android.support.v4.widget.ListViewAutoScrollHelper r8 = r7.f5571n
            r8.mo4068a(r1)
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1434x.mo5507a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m7207a(int i, View view, float f, float f2) {
        m7206a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0727a.m3102a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m7210a(View view, int i, float f, float f2) {
        this.f5558a = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (this.f5565h != -1) {
            View childAt = getChildAt(this.f5565h - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f5565h = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m7207a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: a */
    public int mo5506a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                i6 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 < i4) {
                if (i5 >= 0 && i9 >= i5) {
                    i11 = i8;
                }
                i9++;
            } else if (i5 < 0 || i9 <= i5 || i11 <= 0 || i8 == i4) {
                return i4;
            } else {
                return i11;
            }
        }
        return i8;
    }
}
