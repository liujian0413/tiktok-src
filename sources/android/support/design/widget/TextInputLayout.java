package android.support.design.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.internal.C0297c;
import android.support.design.p015a.C0234a;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.widget.AppCompatTextView;
import android.support.p029v7.widget.C1393g;
import android.support.p029v7.widget.C1433w;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public final class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    private float f1543A;

    /* renamed from: B */
    private int f1544B;

    /* renamed from: C */
    private final int f1545C;

    /* renamed from: D */
    private final int f1546D;

    /* renamed from: E */
    private int f1547E;

    /* renamed from: F */
    private int f1548F;

    /* renamed from: G */
    private Drawable f1549G;

    /* renamed from: H */
    private final Rect f1550H;

    /* renamed from: I */
    private final RectF f1551I;

    /* renamed from: J */
    private Typeface f1552J;

    /* renamed from: K */
    private Drawable f1553K;

    /* renamed from: L */
    private CharSequence f1554L;

    /* renamed from: M */
    private CheckableImageButton f1555M;

    /* renamed from: N */
    private boolean f1556N;

    /* renamed from: O */
    private Drawable f1557O;

    /* renamed from: P */
    private Drawable f1558P;

    /* renamed from: Q */
    private ColorStateList f1559Q;

    /* renamed from: R */
    private boolean f1560R;

    /* renamed from: S */
    private Mode f1561S;

    /* renamed from: T */
    private boolean f1562T;

    /* renamed from: U */
    private ColorStateList f1563U;

    /* renamed from: V */
    private ColorStateList f1564V;

    /* renamed from: W */
    private final int f1565W;

    /* renamed from: a */
    EditText f1566a;

    /* renamed from: aa */
    private final int f1567aa;

    /* renamed from: ab */
    private int f1568ab;

    /* renamed from: ac */
    private final int f1569ac;

    /* renamed from: ad */
    private ValueAnimator f1570ad;

    /* renamed from: ae */
    private boolean f1571ae;

    /* renamed from: af */
    private boolean f1572af;

    /* renamed from: b */
    public boolean f1573b;

    /* renamed from: c */
    public boolean f1574c;

    /* renamed from: d */
    public boolean f1575d;

    /* renamed from: e */
    public boolean f1576e;

    /* renamed from: f */
    public boolean f1577f;

    /* renamed from: g */
    final C0385c f1578g;

    /* renamed from: h */
    public boolean f1579h;

    /* renamed from: i */
    public boolean f1580i;

    /* renamed from: j */
    private final FrameLayout f1581j;

    /* renamed from: k */
    private CharSequence f1582k;

    /* renamed from: l */
    private final C0400i f1583l;

    /* renamed from: m */
    private int f1584m;

    /* renamed from: n */
    private boolean f1585n;

    /* renamed from: o */
    private TextView f1586o;

    /* renamed from: p */
    private final int f1587p;

    /* renamed from: q */
    private final int f1588q;

    /* renamed from: r */
    private CharSequence f1589r;

    /* renamed from: s */
    private GradientDrawable f1590s;

    /* renamed from: t */
    private final int f1591t;

    /* renamed from: u */
    private final int f1592u;

    /* renamed from: v */
    private int f1593v;

    /* renamed from: w */
    private final int f1594w;

    /* renamed from: x */
    private float f1595x;

    /* renamed from: y */
    private float f1596y;

    /* renamed from: z */
    private float f1597z;

    public static class AccessibilityDelegate extends C0939a {

        /* renamed from: a */
        private final TextInputLayout f1601a;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.f1601a = textInputLayout;
        }

        /* renamed from: b */
        public final void mo1766b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence charSequence;
            super.mo1766b(view, accessibilityEvent);
            EditText editText = this.f1601a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f1601a.getHint();
            }
            if (!TextUtils.isEmpty(charSequence)) {
                accessibilityEvent.getText().add(charSequence);
            }
        }

        /* renamed from: a */
        public final void mo1148a(View view, C0945c cVar) {
            Editable editable;
            boolean z;
            super.mo1148a(view, cVar);
            EditText editText = this.f1601a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f1601a.getHint();
            CharSequence error = this.f1601a.getError();
            CharSequence counterOverflowDescription = this.f1601a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = false;
            if (z4 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z2) {
                cVar.mo3664c((CharSequence) editable);
            } else if (z3) {
                cVar.mo3664c(hint);
            }
            if (z3) {
                cVar.mo3671e(hint);
                if (!z2 && z3) {
                    z5 = true;
                }
                cVar.mo3695o(z5);
            }
            if (z) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo3675f(error);
                cVar.mo3689l(true);
            }
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m1666a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m1664a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1664a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m1666a(i);
            }

            /* renamed from: a */
            private static SavedState m1665a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m1665a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        CharSequence f1602a;

        /* renamed from: b */
        boolean f1603b;

        public String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" error=");
            sb.append(this.f1602a);
            sb.append("}");
            return sb.toString();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f1602a, parcel, i);
            parcel.writeInt(this.f1603b ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1602a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f1603b = z;
        }
    }

    public final int getBoxBackgroundColor() {
        return this.f1548F;
    }

    public final float getBoxCornerRadiusBottomEnd() {
        return this.f1597z;
    }

    public final float getBoxCornerRadiusBottomStart() {
        return this.f1543A;
    }

    public final float getBoxCornerRadiusTopEnd() {
        return this.f1596y;
    }

    public final float getBoxCornerRadiusTopStart() {
        return this.f1595x;
    }

    public final int getBoxStrokeColor() {
        return this.f1568ab;
    }

    public final int getCounterMaxLength() {
        return this.f1584m;
    }

    public final ColorStateList getDefaultHintTextColor() {
        return this.f1563U;
    }

    public final EditText getEditText() {
        return this.f1566a;
    }

    public final CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f1554L;
    }

    public final Drawable getPasswordVisibilityToggleDrawable() {
        return this.f1553K;
    }

    public final Typeface getTypeface() {
        return this.f1552J;
    }

    /* renamed from: f */
    private boolean m1640f() {
        return this.f1583l.f1732g;
    }

    public final int getErrorCurrentTextColors() {
        return this.f1583l.mo1854d();
    }

    /* access modifiers changed from: 0000 */
    public final int getErrorTextCurrentColor() {
        return this.f1583l.mo1854d();
    }

    public final int getHelperTextCurrentTextColor() {
        return this.f1583l.mo1856f();
    }

    /* access modifiers changed from: 0000 */
    public final float getHintCollapsedTextHeight() {
        return this.f1578g.mo1784a();
    }

    /* access modifiers changed from: 0000 */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f1578g.mo1794b();
    }

    /* renamed from: c */
    private void m1635c() {
        m1637d();
        if (this.f1593v != 0) {
            m1639e();
        }
        m1641g();
    }

    /* renamed from: u */
    private void m1655u() {
        if (m1653s()) {
            ((C0386d) this.f1590s).mo1803b();
        }
    }

    public final CharSequence getError() {
        if (this.f1583l.f1729d) {
            return this.f1583l.f1728c;
        }
        return null;
    }

    public final CharSequence getHelperText() {
        if (this.f1583l.f1732g) {
            return this.f1583l.f1731f;
        }
        return null;
    }

    public final CharSequence getHint() {
        if (this.f1574c) {
            return this.f1589r;
        }
        return null;
    }

    /* renamed from: e */
    private void m1639e() {
        LayoutParams layoutParams = (LayoutParams) this.f1581j.getLayoutParams();
        int i = m1643i();
        if (i != layoutParams.topMargin) {
            layoutParams.topMargin = i;
            this.f1581j.requestLayout();
        }
    }

    private Drawable getBoxBackground() {
        if (this.f1593v == 1 || this.f1593v == 2) {
            return this.f1590s;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    private boolean m1650p() {
        if (this.f1566a == null || !(this.f1566a.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private boolean m1651q() {
        if (!this.f1576e || (!m1650p() && !this.f1556N)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private boolean m1653s() {
        if (!this.f1574c || TextUtils.isEmpty(this.f1589r) || !(this.f1590s instanceof C0386d)) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private void m1654t() {
        if (m1653s()) {
            RectF rectF = this.f1551I;
            this.f1578g.mo1790a(rectF);
            m1632a(rectF);
            ((C0386d) this.f1590s).mo1801a(rectF);
        }
    }

    /* access modifiers changed from: 0000 */
    public final CharSequence getCounterOverflowDescription() {
        if (!this.f1573b || !this.f1585n || this.f1586o == null) {
            return null;
        }
        return this.f1586o.getContentDescription();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f1583l.mo1853c()) {
            savedState.f1602a = getError();
        }
        savedState.f1603b = this.f1556N;
        return savedState;
    }

    /* renamed from: d */
    private void m1637d() {
        if (this.f1593v == 0) {
            this.f1590s = null;
        } else if (this.f1593v != 2 || !this.f1574c || (this.f1590s instanceof C0386d)) {
            if (!(this.f1590s instanceof GradientDrawable)) {
                this.f1590s = new GradientDrawable();
            }
        } else {
            this.f1590s = new C0386d();
        }
    }

    /* renamed from: h */
    private int m1642h() {
        if (this.f1566a == null) {
            return 0;
        }
        switch (this.f1593v) {
            case 1:
                return this.f1566a.getTop();
            case 2:
                return this.f1566a.getTop() + m1643i();
            default:
                return 0;
        }
    }

    /* renamed from: i */
    private int m1643i() {
        if (!this.f1574c) {
            return 0;
        }
        switch (this.f1593v) {
            case 0:
            case 1:
                return (int) this.f1578g.mo1784a();
            case 2:
                return (int) (this.f1578g.mo1784a() / 2.0f);
            default:
                return 0;
        }
    }

    /* renamed from: j */
    private int m1644j() {
        switch (this.f1593v) {
            case 1:
                return getBoxBackground().getBounds().top + this.f1594w;
            case 2:
                return getBoxBackground().getBounds().top - m1643i();
            default:
                return getPaddingTop();
        }
    }

    /* renamed from: l */
    private void m1646l() {
        switch (this.f1593v) {
            case 1:
                this.f1544B = 0;
                return;
            case 2:
                if (this.f1568ab == 0) {
                    this.f1568ab = this.f1564V.getColorForState(getDrawableState(), this.f1564V.getDefaultColor());
                    break;
                }
                break;
        }
    }

    /* renamed from: n */
    private void m1648n() {
        int i = VERSION.SDK_INT;
        if (i == 21 || i == 22) {
            Drawable background = this.f1566a.getBackground();
            if (background != null && !this.f1571ae) {
                Drawable newDrawable = background.getConstantState().newDrawable();
                if (background instanceof DrawableContainer) {
                    this.f1571ae = C0388f.m1724a((DrawableContainer) background, newDrawable.getConstantState());
                }
                if (!this.f1571ae) {
                    C0991u.m4185a((View) this.f1566a, newDrawable);
                    this.f1571ae = true;
                    m1635c();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        boolean z;
        if (!this.f1572af) {
            boolean z2 = true;
            this.f1572af = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            if (!C0991u.m4167D(this) || !isEnabled()) {
                z2 = false;
            }
            mo1699a(z2);
            mo1696a();
            m1641g();
            mo1701b();
            if (this.f1578g != null) {
                z = this.f1578g.mo1793a(drawableState) | false;
            } else {
                z = false;
            }
            if (z) {
                invalidate();
            }
            this.f1572af = false;
        }
    }

    /* renamed from: g */
    private void m1641g() {
        if (this.f1593v != 0 && this.f1590s != null && this.f1566a != null && getRight() != 0) {
            int left = this.f1566a.getLeft();
            int h = m1642h();
            int right = this.f1566a.getRight();
            int bottom = this.f1566a.getBottom() + this.f1591t;
            if (this.f1593v == 2) {
                left += this.f1546D / 2;
                h -= this.f1546D / 2;
                right -= this.f1546D / 2;
                bottom += this.f1546D / 2;
            }
            this.f1590s.setBounds(left, h, right, bottom);
            m1647m();
            m1645k();
        }
    }

    private float[] getCornerRadiiAsArray() {
        if (!C0297c.m1178a(this)) {
            return new float[]{this.f1595x, this.f1595x, this.f1596y, this.f1596y, this.f1597z, this.f1597z, this.f1543A, this.f1543A};
        }
        return new float[]{this.f1596y, this.f1596y, this.f1595x, this.f1595x, this.f1543A, this.f1543A, this.f1597z, this.f1597z};
    }

    /* renamed from: k */
    private void m1645k() {
        if (this.f1566a != null) {
            Drawable background = this.f1566a.getBackground();
            if (background != null) {
                if (C1433w.m7203c(background)) {
                    background = background.mutate();
                }
                C0387e.m1721a((ViewGroup) this, (View) this.f1566a, new Rect());
                Rect bounds = background.getBounds();
                if (bounds.left != bounds.right) {
                    Rect rect = new Rect();
                    background.getPadding(rect);
                    background.setBounds(bounds.left - rect.left, bounds.top, bounds.right + (rect.right * 2), this.f1566a.getBottom());
                }
            }
        }
    }

    /* renamed from: m */
    private void m1647m() {
        if (this.f1590s != null) {
            m1646l();
            if (this.f1566a != null && this.f1593v == 2) {
                if (this.f1566a.getBackground() != null) {
                    this.f1549G = this.f1566a.getBackground();
                }
                C0991u.m4185a((View) this.f1566a, (Drawable) null);
            }
            if (!(this.f1566a == null || this.f1593v != 1 || this.f1549G == null)) {
                C0991u.m4185a((View) this.f1566a, this.f1549G);
            }
            if (this.f1544B >= 0 && this.f1547E != 0) {
                this.f1590s.setStroke(this.f1544B, this.f1547E);
            }
            this.f1590s.setCornerRadii(getCornerRadiiAsArray());
            this.f1590s.setColor(this.f1548F);
            invalidate();
        }
    }

    /* renamed from: r */
    private void m1652r() {
        if (this.f1553K == null) {
            return;
        }
        if (this.f1560R || this.f1562T) {
            this.f1553K = C0727a.m3116g(this.f1553K).mutate();
            if (this.f1560R) {
                C0727a.m3105a(this.f1553K, this.f1559Q);
            }
            if (this.f1562T) {
                C0727a.m3108a(this.f1553K, this.f1561S);
            }
            if (this.f1555M != null && this.f1555M.getDrawable() != this.f1553K) {
                this.f1555M.setImageDrawable(this.f1553K);
            }
        }
    }

    /* renamed from: o */
    private void m1649o() {
        if (this.f1566a != null) {
            if (m1651q()) {
                if (this.f1555M == null) {
                    this.f1555M = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.jm, this.f1581j, false);
                    this.f1555M.setImageDrawable(this.f1553K);
                    this.f1555M.setContentDescription(this.f1554L);
                    this.f1581j.addView(this.f1555M);
                    this.f1555M.setOnClickListener(new OnClickListener() {
                        public final void onClick(View view) {
                            TextInputLayout.this.mo1702b(false);
                        }
                    });
                }
                if (this.f1566a != null && C0991u.m4237p(this.f1566a) <= 0) {
                    this.f1566a.setMinimumHeight(C0991u.m4237p(this.f1555M));
                }
                this.f1555M.setVisibility(0);
                this.f1555M.setChecked(this.f1556N);
                if (this.f1557O == null) {
                    this.f1557O = new ColorDrawable();
                }
                this.f1557O.setBounds(0, 0, this.f1555M.getMeasuredWidth(), 1);
                Drawable[] b = C1056n.m4573b(this.f1566a);
                if (b[2] != this.f1557O) {
                    this.f1558P = b[2];
                }
                C1056n.m4569a((TextView) this.f1566a, b[0], b[1], this.f1557O, b[3]);
                this.f1555M.setPadding(this.f1566a.getPaddingLeft(), this.f1566a.getPaddingTop(), this.f1566a.getPaddingRight(), this.f1566a.getPaddingBottom());
                return;
            }
            if (this.f1555M != null && this.f1555M.getVisibility() == 0) {
                this.f1555M.setVisibility(8);
            }
            if (this.f1557O != null) {
                Drawable[] b2 = C1056n.m4573b(this.f1566a);
                if (b2[2] == this.f1557O) {
                    C1056n.m4569a((TextView) this.f1566a, b2[0], b2[1], this.f1558P, b2[3]);
                    this.f1557O = null;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1701b() {
        boolean z;
        if (this.f1590s != null && this.f1593v != 0) {
            boolean z2 = true;
            if (this.f1566a == null || !this.f1566a.hasFocus()) {
                z = false;
            } else {
                z = true;
            }
            if (this.f1566a == null || !this.f1566a.isHovered()) {
                z2 = false;
            }
            if (this.f1593v == 2) {
                if (!isEnabled()) {
                    this.f1547E = this.f1569ac;
                } else if (this.f1583l.mo1853c()) {
                    this.f1547E = this.f1583l.mo1854d();
                } else if (this.f1585n && this.f1586o != null) {
                    this.f1547E = this.f1586o.getCurrentTextColor();
                } else if (z) {
                    this.f1547E = this.f1568ab;
                } else if (z2) {
                    this.f1547E = this.f1567aa;
                } else {
                    this.f1547E = this.f1565W;
                }
                if ((z2 || z) && isEnabled()) {
                    this.f1544B = this.f1546D;
                } else {
                    this.f1544B = this.f1545C;
                }
                m1647m();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1696a() {
        if (this.f1566a != null) {
            Drawable background = this.f1566a.getBackground();
            if (background != null) {
                m1648n();
                if (C1433w.m7203c(background)) {
                    background = background.mutate();
                }
                if (this.f1583l.mo1853c()) {
                    background.setColorFilter(C1393g.m6897a(this.f1583l.mo1854d(), Mode.SRC_IN));
                } else if (!this.f1585n || this.f1586o == null) {
                    C0727a.m3115f(background);
                    this.f1566a.refreshDrawableState();
                } else {
                    background.setColorFilter(C1393g.m6897a(this.f1586o.getCurrentTextColor(), Mode.SRC_IN));
                }
            }
        }
    }

    public final void setHintAnimationEnabled(boolean z) {
        this.f1579h = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1699a(boolean z) {
        m1634a(z, false);
    }

    public final void setEnabled(boolean z) {
        m1633a((ViewGroup) this, z);
        super.setEnabled(z);
    }

    public final void setErrorEnabled(boolean z) {
        this.f1583l.mo1846a(z);
    }

    public final void setErrorTextAppearance(int i) {
        this.f1583l.mo1841a(i);
    }

    public final void setErrorTextColor(ColorStateList colorStateList) {
        this.f1583l.mo1842a(colorStateList);
    }

    public final void setHelperTextColor(ColorStateList colorStateList) {
        this.f1583l.mo1849b(colorStateList);
    }

    public final void setHelperTextEnabled(boolean z) {
        this.f1583l.mo1852b(z);
    }

    public final void setHelperTextTextAppearance(int i) {
        this.f1583l.mo1848b(i);
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1580i = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1580i = false;
    }

    public final void setBoxBackgroundColor(int i) {
        if (this.f1548F != i) {
            this.f1548F = i;
            m1647m();
        }
    }

    public final void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0683b.m2912c(getContext(), i));
    }

    public final void setBoxBackgroundMode(int i) {
        if (i != this.f1593v) {
            this.f1593v = i;
            m1635c();
        }
    }

    public final void setBoxStrokeColor(int i) {
        if (this.f1568ab != i) {
            this.f1568ab = i;
            mo1701b();
        }
    }

    public final void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f1563U = colorStateList;
        this.f1564V = colorStateList;
        if (this.f1566a != null) {
            mo1699a(false);
        }
    }

    public final void setHint(CharSequence charSequence) {
        if (this.f1574c) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public final void setPasswordVisibilityToggleContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setPasswordVisibilityToggleContentDescription(charSequence);
    }

    public final void setPasswordVisibilityToggleDrawable(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1065a.m4641b(getContext(), i);
        } else {
            drawable = null;
        }
        setPasswordVisibilityToggleDrawable(drawable);
    }

    public final void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f1559Q = colorStateList;
        this.f1560R = true;
        m1652r();
    }

    public final void setPasswordVisibilityToggleTintMode(Mode mode) {
        this.f1561S = mode;
        this.f1562T = true;
        m1652r();
    }

    public final void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        if (this.f1566a != null) {
            C0991u.m4187a((View) this.f1566a, (C0939a) accessibilityDelegate);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f1589r)) {
            this.f1589r = charSequence;
            this.f1578g.mo1792a(charSequence);
            if (!this.f1577f) {
                m1654t();
            }
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f1590s != null) {
            this.f1590s.draw(canvas);
        }
        super.draw(canvas);
        if (this.f1574c) {
            this.f1578g.mo1789a(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        setError(savedState.f1602a);
        if (savedState.f1603b) {
            mo1702b(true);
        }
        requestLayout();
    }

    public final void setHintTextAppearance(int i) {
        this.f1578g.mo1800c(i);
        this.f1564V = this.f1578g.f1650g;
        if (this.f1566a != null) {
            mo1699a(false);
            m1639e();
        }
    }

    public final void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f1554L = charSequence;
        if (this.f1555M != null) {
            this.f1555M.setContentDescription(charSequence);
        }
    }

    public final void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f1553K = drawable;
        if (this.f1555M != null) {
            this.f1555M.setImageDrawable(drawable);
        }
    }

    public final void setPasswordVisibilityToggleEnabled(boolean z) {
        if (this.f1576e != z) {
            this.f1576e = z;
            if (!z && this.f1556N && this.f1566a != null) {
                this.f1566a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            this.f1556N = false;
            m1649o();
        }
    }

    public final void setTypeface(Typeface typeface) {
        if (typeface != this.f1552J) {
            this.f1552J = typeface;
            this.f1578g.mo1791a(typeface);
            this.f1583l.mo1843a(typeface);
            if (this.f1586o != null) {
                this.f1586o.setTypeface(typeface);
            }
        }
    }

    /* renamed from: a */
    private void m1632a(RectF rectF) {
        rectF.left -= (float) this.f1592u;
        rectF.top -= (float) this.f1592u;
        rectF.right += (float) this.f1592u;
        rectF.bottom += (float) this.f1592u;
    }

    /* renamed from: c */
    private void m1636c(boolean z) {
        if (this.f1570ad != null && this.f1570ad.isRunning()) {
            this.f1570ad.cancel();
        }
        if (!z || !this.f1579h) {
            this.f1578g.mo1795b(1.0f);
        } else {
            m1631a(1.0f);
        }
        this.f1577f = false;
        if (m1653s()) {
            m1654t();
        }
    }

    /* renamed from: b */
    public final void mo1702b(boolean z) {
        if (this.f1576e) {
            int selectionEnd = this.f1566a.getSelectionEnd();
            if (m1650p()) {
                this.f1566a.setTransformationMethod(null);
                this.f1556N = true;
            } else {
                this.f1566a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f1556N = false;
            }
            this.f1555M.setChecked(this.f1556N);
            if (z) {
                this.f1555M.jumpDrawablesToCurrentState();
            }
            this.f1566a.setSelection(selectionEnd);
        }
    }

    public final void setCounterMaxLength(int i) {
        int i2;
        if (this.f1584m != i) {
            if (i > 0) {
                this.f1584m = i;
            } else {
                this.f1584m = -1;
            }
            if (this.f1573b) {
                if (this.f1566a == null) {
                    i2 = 0;
                } else {
                    i2 = this.f1566a.getText().length();
                }
                mo1697a(i2);
            }
        }
    }

    public final void setError(CharSequence charSequence) {
        if (!this.f1583l.f1729d) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f1583l.mo1851b(charSequence);
        } else {
            this.f1583l.mo1840a();
        }
    }

    public final void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!m1640f()) {
                setHelperTextEnabled(true);
            }
            this.f1583l.mo1845a(charSequence);
        } else if (m1640f()) {
            setHelperTextEnabled(false);
        }
    }

    /* renamed from: a */
    private void m1631a(float f) {
        if (this.f1578g.f1644a != f) {
            if (this.f1570ad == null) {
                this.f1570ad = new ValueAnimator();
                this.f1570ad.setInterpolator(C0234a.f873b);
                this.f1570ad.setDuration(167);
                this.f1570ad.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TextInputLayout.this.f1578g.mo1795b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
            }
            this.f1570ad.setFloatValues(new float[]{this.f1578g.f1644a, f});
            this.f1570ad.start();
        }
    }

    /* renamed from: d */
    private void m1638d(boolean z) {
        if (this.f1570ad != null && this.f1570ad.isRunning()) {
            this.f1570ad.cancel();
        }
        if (!z || !this.f1579h) {
            this.f1578g.mo1795b(0.0f);
        } else {
            m1631a(0.0f);
        }
        if (m1653s() && ((C0386d) this.f1590s).mo1802a()) {
            m1655u();
        }
        this.f1577f = true;
    }

    public final void setCounterEnabled(boolean z) {
        if (this.f1573b != z) {
            if (z) {
                this.f1586o = new AppCompatTextView(getContext());
                this.f1586o.setId(R.id.dif);
                if (this.f1552J != null) {
                    this.f1586o.setTypeface(this.f1552J);
                }
                this.f1586o.setMaxLines(1);
                mo1698a(this.f1586o, this.f1588q);
                this.f1583l.mo1844a(this.f1586o, 2);
                if (this.f1566a == null) {
                    mo1697a(0);
                } else {
                    mo1697a(this.f1566a.getText().length());
                }
            } else {
                this.f1583l.mo1850b(this.f1586o, 2);
                this.f1586o = null;
            }
            this.f1573b = z;
        }
    }

    public final void setHintEnabled(boolean z) {
        if (z != this.f1574c) {
            this.f1574c = z;
            if (!this.f1574c) {
                this.f1575d = false;
                if (!TextUtils.isEmpty(this.f1589r) && TextUtils.isEmpty(this.f1566a.getHint())) {
                    this.f1566a.setHint(this.f1589r);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f1566a.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f1589r)) {
                        setHint(hint);
                    }
                    this.f1566a.setHint(null);
                }
                this.f1575d = true;
            }
            if (this.f1566a != null) {
                m1639e();
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f1566a == null) {
            this.f1566a = editText;
            m1635c();
            setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            if (!m1650p()) {
                this.f1578g.mo1791a(this.f1566a.getTypeface());
            }
            this.f1578g.mo1785a(this.f1566a.getTextSize());
            int gravity = this.f1566a.getGravity();
            this.f1578g.mo1796b((gravity & -113) | 48);
            this.f1578g.mo1786a(gravity);
            this.f1566a.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    TextInputLayout.this.mo1699a(!TextInputLayout.this.f1580i);
                    if (TextInputLayout.this.f1573b) {
                        TextInputLayout.this.mo1697a(editable.length());
                    }
                }
            });
            if (this.f1563U == null) {
                this.f1563U = this.f1566a.getHintTextColors();
            }
            if (this.f1574c) {
                if (TextUtils.isEmpty(this.f1589r)) {
                    this.f1582k = this.f1566a.getHint();
                    setHint(this.f1582k);
                    this.f1566a.setHint(null);
                }
                this.f1575d = true;
            }
            if (this.f1586o != null) {
                mo1697a(this.f1566a.getText().length());
            }
            this.f1583l.mo1847b();
            m1649o();
            m1634a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1697a(int i) {
        boolean z;
        int i2;
        boolean z2 = this.f1585n;
        if (this.f1584m == -1) {
            this.f1586o.setText(String.valueOf(i));
            this.f1586o.setContentDescription(null);
            this.f1585n = false;
        } else {
            if (C0991u.m4226j(this.f1586o) == 1) {
                C0991u.m4216f((View) this.f1586o, 0);
            }
            if (i > this.f1584m) {
                z = true;
            } else {
                z = false;
            }
            this.f1585n = z;
            if (z2 != this.f1585n) {
                TextView textView = this.f1586o;
                if (this.f1585n) {
                    i2 = this.f1587p;
                } else {
                    i2 = this.f1588q;
                }
                mo1698a(textView, i2);
                if (this.f1585n) {
                    C0991u.m4216f((View) this.f1586o, 1);
                }
            }
            this.f1586o.setText(getContext().getString(R.string.a0e, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1584m)}));
            this.f1586o.setContentDescription(getContext().getString(R.string.a0d, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f1584m)}));
        }
        if (this.f1566a != null && z2 != this.f1585n) {
            mo1699a(false);
            mo1701b();
            mo1696a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        m1649o();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private static void m1633a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m1633a((ViewGroup) childAt, z);
            }
        }
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        if (this.f1582k == null || this.f1566a == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f1575d;
        this.f1575d = false;
        CharSequence hint = this.f1566a.getHint();
        this.f1566a.setHint(this.f1582k);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f1566a.setHint(hint);
            this.f1575d = z;
        }
    }

    /* renamed from: a */
    private void m1634a(boolean z, boolean z2) {
        boolean z3;
        boolean isEnabled = isEnabled();
        boolean z4 = true;
        if (this.f1566a == null || TextUtils.isEmpty(this.f1566a.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f1566a == null || !this.f1566a.hasFocus()) {
            z4 = false;
        }
        boolean c = this.f1583l.mo1853c();
        if (this.f1563U != null) {
            this.f1578g.mo1788a(this.f1563U);
            this.f1578g.mo1798b(this.f1563U);
        }
        if (!isEnabled) {
            this.f1578g.mo1788a(ColorStateList.valueOf(this.f1569ac));
            this.f1578g.mo1798b(ColorStateList.valueOf(this.f1569ac));
        } else if (c) {
            this.f1578g.mo1788a(this.f1583l.mo1855e());
        } else if (this.f1585n && this.f1586o != null) {
            this.f1578g.mo1788a(this.f1586o.getTextColors());
        } else if (z4 && this.f1564V != null) {
            this.f1578g.mo1788a(this.f1564V);
        }
        if (z3 || (isEnabled() && (z4 || c))) {
            if (z2 || this.f1577f) {
                m1636c(z);
            }
        } else if (z2 || !this.f1577f) {
            m1638d(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1698a(TextView textView, int i) {
        boolean z = true;
        try {
            C1056n.m4567a(textView, i);
            if (VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1056n.m4567a(textView, (int) R.style.jd);
            textView.setTextColor(C0683b.m2912c(getContext(), R.color.na));
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f1581j.addView(view, layoutParams2);
            this.f1581j.setLayoutParams(layoutParams);
            m1639e();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1590s != null) {
            m1641g();
        }
        if (this.f1574c && this.f1566a != null) {
            Rect rect = this.f1550H;
            C0387e.m1721a((ViewGroup) this, (View) this.f1566a, rect);
            int compoundPaddingLeft = rect.left + this.f1566a.getCompoundPaddingLeft();
            int compoundPaddingRight = rect.right - this.f1566a.getCompoundPaddingRight();
            int j = m1644j();
            this.f1578g.mo1787a(compoundPaddingLeft, rect.top + this.f1566a.getCompoundPaddingTop(), compoundPaddingRight, rect.bottom - this.f1566a.getCompoundPaddingBottom());
            this.f1578g.mo1797b(compoundPaddingLeft, j, compoundPaddingRight, (i4 - i2) - getPaddingBottom());
            this.f1578g.mo1799c();
            if (m1653s() && !this.f1577f) {
                m1654t();
            }
        }
    }
}
