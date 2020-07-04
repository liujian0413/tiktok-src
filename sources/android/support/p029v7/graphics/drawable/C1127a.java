package android.support.p029v7.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p022v4.graphics.drawable.C0727a;
import android.util.SparseArray;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v7.graphics.drawable.a */
class C1127a extends Drawable implements Callback {

    /* renamed from: a */
    public int f4018a = -1;

    /* renamed from: b */
    private C1130b f4019b;

    /* renamed from: c */
    private Rect f4020c;

    /* renamed from: d */
    private Drawable f4021d;

    /* renamed from: e */
    private Drawable f4022e;

    /* renamed from: f */
    private int f4023f = NormalGiftView.ALPHA_255;

    /* renamed from: g */
    private boolean f4024g;

    /* renamed from: h */
    private int f4025h = -1;

    /* renamed from: i */
    private boolean f4026i;

    /* renamed from: j */
    private Runnable f4027j;

    /* renamed from: k */
    private long f4028k;

    /* renamed from: l */
    private long f4029l;

    /* renamed from: m */
    private C1129a f4030m;

    /* renamed from: android.support.v7.graphics.drawable.a$a */
    static class C1129a implements Callback {

        /* renamed from: a */
        private Callback f4032a;

        C1129a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        /* renamed from: a */
        public final Callback mo4475a() {
            Callback callback = this.f4032a;
            this.f4032a = null;
            return callback;
        }

        /* renamed from: a */
        public final C1129a mo4476a(Callback callback) {
            this.f4032a = callback;
            return this;
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f4032a != null) {
                this.f4032a.unscheduleDrawable(drawable, runnable);
            }
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f4032a != null) {
                this.f4032a.scheduleDrawable(drawable, runnable, j);
            }
        }
    }

    /* renamed from: android.support.v7.graphics.drawable.a$b */
    static abstract class C1130b extends ConstantState {

        /* renamed from: A */
        boolean f4033A;

        /* renamed from: B */
        int f4034B;

        /* renamed from: C */
        public int f4035C;

        /* renamed from: D */
        public int f4036D;

        /* renamed from: E */
        boolean f4037E;

        /* renamed from: F */
        ColorFilter f4038F;

        /* renamed from: G */
        boolean f4039G;

        /* renamed from: H */
        ColorStateList f4040H;

        /* renamed from: I */
        Mode f4041I;

        /* renamed from: J */
        boolean f4042J;

        /* renamed from: K */
        boolean f4043K;

        /* renamed from: c */
        final C1127a f4044c;

        /* renamed from: d */
        Resources f4045d;

        /* renamed from: e */
        int f4046e = 160;

        /* renamed from: f */
        int f4047f;

        /* renamed from: g */
        int f4048g;

        /* renamed from: h */
        SparseArray<ConstantState> f4049h;

        /* renamed from: i */
        Drawable[] f4050i;

        /* renamed from: j */
        public int f4051j;

        /* renamed from: k */
        public boolean f4052k;

        /* renamed from: l */
        boolean f4053l;

        /* renamed from: m */
        Rect f4054m;

        /* renamed from: n */
        public boolean f4055n;

        /* renamed from: o */
        boolean f4056o;

        /* renamed from: p */
        int f4057p;

        /* renamed from: q */
        int f4058q;

        /* renamed from: r */
        int f4059r;

        /* renamed from: s */
        int f4060s;

        /* renamed from: t */
        boolean f4061t;

        /* renamed from: u */
        int f4062u;

        /* renamed from: v */
        boolean f4063v;

        /* renamed from: w */
        boolean f4064w;

        /* renamed from: x */
        boolean f4065x;

        /* renamed from: y */
        boolean f4066y;

        /* renamed from: z */
        boolean f4067z = true;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo4485c() {
            return this.f4050i.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo4484b() {
            this.f4061t = false;
            this.f4063v = false;
        }

        public int getChangingConfigurations() {
            return this.f4047f | this.f4048g;
        }

        /* renamed from: e */
        public final int mo4489e() {
            if (!this.f4056o) {
                m5006m();
            }
            return this.f4057p;
        }

        /* renamed from: f */
        public final int mo4491f() {
            if (!this.f4056o) {
                m5006m();
            }
            return this.f4058q;
        }

        /* renamed from: g */
        public final int mo4492g() {
            if (!this.f4056o) {
                m5006m();
            }
            return this.f4059r;
        }

        /* renamed from: h */
        public final int mo4494h() {
            if (!this.f4056o) {
                m5006m();
            }
            return this.f4060s;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4460a() {
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f4033A = true;
        }

        /* renamed from: l */
        private void m5005l() {
            if (this.f4049h != null) {
                int size = this.f4049h.size();
                for (int i = 0; i < size; i++) {
                    this.f4050i[this.f4049h.keyAt(i)] = m5004b(((ConstantState) this.f4049h.valueAt(i)).newDrawable(this.f4045d));
                }
                this.f4049h = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f4049h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: i */
        public final int mo4495i() {
            int i;
            if (this.f4061t) {
                return this.f4062u;
            }
            m5005l();
            int i2 = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            int i3 = i;
            for (int i4 = 1; i4 < i2; i4++) {
                i3 = Drawable.resolveOpacity(i3, drawableArr[i4].getOpacity());
            }
            this.f4062u = i3;
            this.f4061t = true;
            return i3;
        }

        /* renamed from: j */
        public final boolean mo4496j() {
            if (this.f4063v) {
                return this.f4064w;
            }
            m5005l();
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f4064w = z;
            this.f4063v = true;
            return z;
        }

        /* renamed from: k */
        public final synchronized boolean mo4497k() {
            if (this.f4065x) {
                return this.f4066y;
            }
            m5005l();
            this.f4065x = true;
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f4066y = false;
                    return false;
                }
            }
            this.f4066y = true;
            return true;
        }

        /* renamed from: m */
        private void m5006m() {
            this.f4056o = true;
            m5005l();
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            this.f4058q = -1;
            this.f4057p = -1;
            this.f4060s = 0;
            this.f4059r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f4057p) {
                    this.f4057p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f4058q) {
                    this.f4058q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f4059r) {
                    this.f4059r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f4060s) {
                    this.f4060s = minimumHeight;
                }
            }
        }

        /* renamed from: d */
        public final Rect mo4487d() {
            if (this.f4052k) {
                return null;
            }
            if (this.f4054m != null || this.f4053l) {
                return this.f4054m;
            }
            m5005l();
            Rect rect = new Rect();
            int i = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    if (rect.left > rect2.left) {
                        rect2.left = rect.left;
                    }
                    if (rect.top > rect2.top) {
                        rect2.top = rect.top;
                    }
                    if (rect.right > rect2.right) {
                        rect2.right = rect.right;
                    }
                    if (rect.bottom > rect2.bottom) {
                        rect2.bottom = rect.bottom;
                    }
                }
            }
            this.f4053l = true;
            this.f4054m = rect2;
            return rect2;
        }

        /* renamed from: b */
        private Drawable m5004b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f4034B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f4044c);
            return mutate;
        }

        /* renamed from: a */
        public final int mo4480a(Drawable drawable) {
            int i = this.f4051j;
            if (i >= this.f4050i.length) {
                mo4490e(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f4044c);
            this.f4050i[i] = drawable;
            this.f4051j++;
            this.f4048g = drawable.getChangingConfigurations() | this.f4048g;
            mo4484b();
            this.f4054m = null;
            this.f4053l = false;
            this.f4056o = false;
            this.f4065x = false;
            return i;
        }

        /* renamed from: b */
        public final Drawable mo4483b(int i) {
            Drawable drawable = this.f4050i[i];
            if (drawable != null) {
                return drawable;
            }
            if (this.f4049h != null) {
                int indexOfKey = this.f4049h.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m5004b(((ConstantState) this.f4049h.valueAt(indexOfKey)).newDrawable(this.f4045d));
                    this.f4050i[i] = b;
                    this.f4049h.removeAt(indexOfKey);
                    if (this.f4049h.size() == 0) {
                        this.f4049h = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4481a(Theme theme) {
            if (theme != null) {
                m5005l();
                int i = this.f4051j;
                Drawable[] drawableArr = this.f4050i;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f4048g |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo4482a(theme.getResources());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo4482a(Resources resources) {
            if (resources != null) {
                this.f4045d = resources;
                int a = C1127a.m4994a(resources, this.f4046e);
                int i = this.f4046e;
                this.f4046e = a;
                if (i != a) {
                    this.f4056o = false;
                    this.f4053l = false;
                }
            }
        }

        /* renamed from: e */
        public void mo4490e(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f4050i, 0, drawableArr, 0, i);
            this.f4050i = drawableArr;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo4488d(int i, int i2) {
            boolean z;
            int i3 = this.f4051j;
            Drawable[] drawableArr = this.f4050i;
            boolean z2 = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    if (VERSION.SDK_INT >= 23) {
                        z = drawableArr[i4].setLayoutDirection(i);
                    } else {
                        z = false;
                    }
                    if (i4 == i2) {
                        z2 = z;
                    }
                }
            }
            this.f4034B = i;
            return z2;
        }

        C1130b(C1130b bVar, C1127a aVar, Resources resources) {
            Resources resources2;
            int i;
            this.f4044c = aVar;
            if (resources != null) {
                resources2 = resources;
            } else if (bVar != null) {
                resources2 = bVar.f4045d;
            } else {
                resources2 = null;
            }
            this.f4045d = resources2;
            if (bVar != null) {
                i = bVar.f4046e;
            } else {
                i = 0;
            }
            this.f4046e = C1127a.m4994a(resources, i);
            if (bVar != null) {
                this.f4047f = bVar.f4047f;
                this.f4048g = bVar.f4048g;
                this.f4065x = true;
                this.f4066y = true;
                this.f4052k = bVar.f4052k;
                this.f4055n = bVar.f4055n;
                this.f4067z = bVar.f4067z;
                this.f4033A = bVar.f4033A;
                this.f4034B = bVar.f4034B;
                this.f4035C = bVar.f4035C;
                this.f4036D = bVar.f4036D;
                this.f4037E = bVar.f4037E;
                this.f4038F = bVar.f4038F;
                this.f4039G = bVar.f4039G;
                this.f4040H = bVar.f4040H;
                this.f4041I = bVar.f4041I;
                this.f4042J = bVar.f4042J;
                this.f4043K = bVar.f4043K;
                if (bVar.f4046e == this.f4046e) {
                    if (bVar.f4053l) {
                        this.f4054m = new Rect(bVar.f4054m);
                        this.f4053l = true;
                    }
                    if (bVar.f4056o) {
                        this.f4057p = bVar.f4057p;
                        this.f4058q = bVar.f4058q;
                        this.f4059r = bVar.f4059r;
                        this.f4060s = bVar.f4060s;
                        this.f4056o = true;
                    }
                }
                if (bVar.f4061t) {
                    this.f4062u = bVar.f4062u;
                    this.f4061t = true;
                }
                if (bVar.f4063v) {
                    this.f4064w = bVar.f4064w;
                    this.f4063v = true;
                }
                Drawable[] drawableArr = bVar.f4050i;
                this.f4050i = new Drawable[drawableArr.length];
                this.f4051j = bVar.f4051j;
                SparseArray<ConstantState> sparseArray = bVar.f4049h;
                if (sparseArray != null) {
                    this.f4049h = sparseArray.clone();
                } else {
                    this.f4049h = new SparseArray<>(this.f4051j);
                }
                int i2 = this.f4051j;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f4049h.put(i3, constantState);
                        } else {
                            this.f4050i[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f4050i = new Drawable[10];
            this.f4051j = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1130b mo4420b() {
        return this.f4019b;
    }

    public int getAlpha() {
        return this.f4023f;
    }

    public Drawable getCurrent() {
        return this.f4021d;
    }

    public boolean canApplyTheme() {
        return this.f4019b.canApplyTheme();
    }

    public boolean isAutoMirrored() {
        return this.f4019b.f4037E;
    }

    public boolean isStateful() {
        return this.f4019b.mo4496j();
    }

    C1127a() {
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f4019b.getChangingConfigurations();
    }

    /* renamed from: a */
    private boolean mo4417a() {
        if (!isAutoMirrored() || getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public final ConstantState getConstantState() {
        if (!this.f4019b.mo4497k()) {
            return null;
        }
        this.f4019b.f4047f = getChangingConfigurations();
        return this.f4019b;
    }

    public int getIntrinsicHeight() {
        if (this.f4019b.f4055n) {
            return this.f4019b.mo4491f();
        }
        if (this.f4021d != null) {
            return this.f4021d.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f4019b.f4055n) {
            return this.f4019b.mo4489e();
        }
        if (this.f4021d != null) {
            return this.f4021d.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f4019b.f4055n) {
            return this.f4019b.mo4494h();
        }
        if (this.f4021d != null) {
            return this.f4021d.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f4019b.f4055n) {
            return this.f4019b.mo4492g();
        }
        if (this.f4021d != null) {
            return this.f4021d.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        if (this.f4021d == null || !this.f4021d.isVisible()) {
            return -2;
        }
        return this.f4019b.mo4495i();
    }

    public Drawable mutate() {
        if (!this.f4026i && super.mutate() == this) {
            C1130b b = mo4420b();
            b.mo4460a();
            mo4418a(b);
            this.f4026i = true;
        }
        return this;
    }

    public void jumpToCurrentState() {
        boolean z;
        if (this.f4022e != null) {
            this.f4022e.jumpToCurrentState();
            this.f4022e = null;
            this.f4025h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f4021d != null) {
            this.f4021d.jumpToCurrentState();
            if (this.f4024g) {
                this.f4021d.setAlpha(this.f4023f);
            }
        }
        if (this.f4029l != 0) {
            this.f4029l = 0;
            z = true;
        }
        if (this.f4028k != 0) {
            this.f4028k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4468a(Resources resources) {
        this.f4019b.mo4482a(resources);
    }

    public void applyTheme(Theme theme) {
        this.f4019b.mo4481a(theme);
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f4020c != null) {
            rect.set(this.f4020c);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f4021d != null) {
            this.f4021d.getOutline(outline);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f4019b.mo4488d(i, this.f4018a);
    }

    public void draw(Canvas canvas) {
        if (this.f4021d != null) {
            this.f4021d.draw(canvas);
        }
        if (this.f4022e != null) {
            this.f4022e.draw(canvas);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f4019b != null) {
            this.f4019b.mo4484b();
        }
        if (drawable == this.f4021d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f4022e != null) {
            this.f4022e.setBounds(rect);
        }
        if (this.f4021d != null) {
            this.f4021d.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f4022e != null) {
            return this.f4022e.setLevel(i);
        }
        if (this.f4021d != null) {
            return this.f4021d.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f4022e != null) {
            return this.f4022e.setState(iArr);
        }
        if (this.f4021d != null) {
            return this.f4021d.setState(iArr);
        }
        return false;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f4019b.f4037E != z) {
            this.f4019b.f4037E = z;
            if (this.f4021d != null) {
                C0727a.m3109a(this.f4021d, this.f4019b.f4037E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4019b.f4039G = true;
        if (this.f4019b.f4038F != colorFilter) {
            this.f4019b.f4038F = colorFilter;
            if (this.f4021d != null) {
                this.f4021d.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f4019b.f4067z != z) {
            this.f4019b.f4067z = z;
            if (this.f4021d != null) {
                this.f4021d.setDither(this.f4019b.f4067z);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4019b.f4042J = true;
        if (this.f4019b.f4040H != colorStateList) {
            this.f4019b.f4040H = colorStateList;
            C0727a.m3105a(this.f4021d, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        this.f4019b.f4043K = true;
        if (this.f4019b.f4041I != mode) {
            this.f4019b.f4041I = mode;
            C0727a.m3108a(this.f4021d, mode);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4418a(C1130b bVar) {
        this.f4019b = bVar;
        if (this.f4018a >= 0) {
            this.f4021d = bVar.mo4483b(this.f4018a);
            if (this.f4021d != null) {
                m4995a(this.f4021d);
            }
        }
        this.f4025h = -1;
        this.f4022e = null;
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect d = this.f4019b.mo4487d();
        if (d != null) {
            rect.set(d);
            if ((d.right | d.left | d.top | d.bottom) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (this.f4021d != null) {
            z = this.f4021d.getPadding(rect);
        } else {
            z = super.getPadding(rect);
        }
        if (mo4417a()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void setAlpha(int i) {
        if (!this.f4024g || this.f4023f != i) {
            this.f4024g = true;
            this.f4023f = i;
            if (this.f4021d != null) {
                if (this.f4028k == 0) {
                    this.f4021d.setAlpha(i);
                    return;
                }
                mo4469a(false);
            }
        }
    }

    /* renamed from: a */
    private void m4995a(Drawable drawable) {
        if (this.f4030m == null) {
            this.f4030m = new C1129a();
        }
        drawable.setCallback(this.f4030m.mo4476a(drawable.getCallback()));
        try {
            if (this.f4019b.f4035C <= 0 && this.f4024g) {
                drawable.setAlpha(this.f4023f);
            }
            if (this.f4019b.f4039G) {
                drawable.setColorFilter(this.f4019b.f4038F);
            } else {
                if (this.f4019b.f4042J) {
                    C0727a.m3105a(drawable, this.f4019b.f4040H);
                }
                if (this.f4019b.f4043K) {
                    C0727a.m3108a(drawable, this.f4019b.f4041I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4019b.f4067z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f4019b.f4037E);
            }
            Rect rect = this.f4020c;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f4030m.mo4475a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4469a(boolean r13) {
        /*
            r12 = this;
            r0 = 1
            r12.f4024g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r12.f4021d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003e
            long r9 = r12.f4028k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0040
            long r9 = r12.f4028k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0024
            android.graphics.drawable.Drawable r3 = r12.f4021d
            int r9 = r12.f4023f
            r3.setAlpha(r9)
            goto L_0x003e
        L_0x0024:
            long r9 = r12.f4028k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            android.support.v7.graphics.drawable.a$b r9 = r12.f4019b
            int r9 = r9.f4035C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r12.f4021d
            int r3 = 255 - r3
            int r10 = r12.f4023f
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x0041
        L_0x003e:
            r12.f4028k = r7
        L_0x0040:
            r3 = 0
        L_0x0041:
            android.graphics.drawable.Drawable r9 = r12.f4022e
            if (r9 == 0) goto L_0x0074
            long r9 = r12.f4029l
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0076
            long r9 = r12.f4029l
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r12.f4022e
            r0.setVisible(r6, r6)
            r0 = 0
            r12.f4022e = r0
            r0 = -1
            r12.f4025h = r0
            goto L_0x0074
        L_0x005d:
            long r6 = r12.f4029l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            android.support.v7.graphics.drawable.a$b r4 = r12.f4019b
            int r4 = r4.f4036D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r12.f4022e
            int r5 = r12.f4023f
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0077
        L_0x0074:
            r12.f4029l = r7
        L_0x0076:
            r0 = r3
        L_0x0077:
            if (r13 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0083
            java.lang.Runnable r13 = r12.f4027j
            r3 = 16
            long r1 = r1 + r3
            r12.scheduleSelf(r13, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.graphics.drawable.C1127a.mo4469a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4470a(int i) {
        if (i == this.f4018a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f4019b.f4036D > 0) {
            if (this.f4022e != null) {
                this.f4022e.setVisible(false, false);
            }
            if (this.f4021d != null) {
                this.f4022e = this.f4021d;
                this.f4025h = this.f4018a;
                this.f4029l = ((long) this.f4019b.f4036D) + uptimeMillis;
            } else {
                this.f4022e = null;
                this.f4025h = -1;
                this.f4029l = 0;
            }
        } else if (this.f4021d != null) {
            this.f4021d.setVisible(false, false);
        }
        if (i < 0 || i >= this.f4019b.f4051j) {
            this.f4021d = null;
            this.f4018a = -1;
        } else {
            Drawable b = this.f4019b.mo4483b(i);
            this.f4021d = b;
            this.f4018a = i;
            if (b != null) {
                if (this.f4019b.f4035C > 0) {
                    this.f4028k = uptimeMillis + ((long) this.f4019b.f4035C);
                }
                m4995a(b);
            }
        }
        if (!(this.f4028k == 0 && this.f4029l == 0)) {
            if (this.f4027j == null) {
                this.f4027j = new Runnable() {
                    public final void run() {
                        C1127a.this.mo4469a(true);
                        C1127a.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(this.f4027j);
            }
            mo4469a(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    static int m4994a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public void setHotspot(float f, float f2) {
        if (this.f4021d != null) {
            C0727a.m3102a(this.f4021d, f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f4022e != null) {
            this.f4022e.setVisible(z, z2);
        }
        if (this.f4021d != null) {
            this.f4021d.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f4021d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f4021d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f4020c == null) {
            this.f4020c = new Rect(i, i2, i3, i4);
        } else {
            this.f4020c.set(i, i2, i3, i4);
        }
        if (this.f4021d != null) {
            C0727a.m3104a(this.f4021d, i, i2, i3, i4);
        }
    }
}
