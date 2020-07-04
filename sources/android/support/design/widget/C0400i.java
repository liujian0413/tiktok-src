package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.design.p015a.C0234a;
import android.support.design.p015a.C0235b;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1056n;
import android.support.p022v4.widget.Space;
import android.support.p029v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.design.widget.i */
final class C0400i {

    /* renamed from: a */
    public Animator f1726a;

    /* renamed from: b */
    public int f1727b;

    /* renamed from: c */
    public CharSequence f1728c;

    /* renamed from: d */
    public boolean f1729d;

    /* renamed from: e */
    public TextView f1730e;

    /* renamed from: f */
    public CharSequence f1731f;

    /* renamed from: g */
    public boolean f1732g;

    /* renamed from: h */
    private final Context f1733h;

    /* renamed from: i */
    private final TextInputLayout f1734i;

    /* renamed from: j */
    private LinearLayout f1735j;

    /* renamed from: k */
    private int f1736k;

    /* renamed from: l */
    private FrameLayout f1737l;

    /* renamed from: m */
    private int f1738m;

    /* renamed from: n */
    private final float f1739n;

    /* renamed from: o */
    private int f1740o;

    /* renamed from: p */
    private int f1741p;

    /* renamed from: q */
    private TextView f1742q;

    /* renamed from: r */
    private int f1743r;

    /* renamed from: s */
    private Typeface f1744s;

    /* renamed from: c */
    private static boolean m1785c(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1845a(CharSequence charSequence) {
        m1789h();
        this.f1731f = charSequence;
        this.f1742q.setText(charSequence);
        if (this.f1727b != 2) {
            this.f1740o = 2;
        }
        m1780a(this.f1727b, this.f1740o, m1784a(this.f1742q, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1844a(TextView textView, int i) {
        if (this.f1735j == null && this.f1737l == null) {
            this.f1735j = new LinearLayout(this.f1733h);
            this.f1735j.setOrientation(0);
            this.f1734i.addView(this.f1735j, -1, -2);
            this.f1737l = new FrameLayout(this.f1733h);
            this.f1735j.addView(this.f1737l, -1, new LayoutParams(-2, -2));
            this.f1735j.addView(new Space(this.f1733h), new LinearLayout.LayoutParams(0, 0, 1.0f));
            if (this.f1734i.getEditText() != null) {
                mo1847b();
            }
        }
        if (m1785c(i)) {
            this.f1737l.setVisibility(0);
            this.f1737l.addView(textView);
            this.f1738m++;
        } else {
            this.f1735j.addView(textView, i);
        }
        this.f1735j.setVisibility(0);
        this.f1736k++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1846a(boolean z) {
        if (this.f1729d != z) {
            m1789h();
            if (z) {
                this.f1730e = new AppCompatTextView(this.f1733h);
                this.f1730e.setId(R.id.dig);
                if (this.f1744s != null) {
                    this.f1730e.setTypeface(this.f1744s);
                }
                mo1841a(this.f1741p);
                this.f1730e.setVisibility(4);
                C0991u.m4216f((View) this.f1730e, 1);
                mo1844a(this.f1730e, 0);
            } else {
                mo1840a();
                mo1850b(this.f1730e, 0);
                this.f1730e = null;
                this.f1734i.mo1696a();
                this.f1734i.mo1701b();
            }
            this.f1729d = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1843a(Typeface typeface) {
        if (typeface != this.f1744s) {
            this.f1744s = typeface;
            m1782a(this.f1730e, typeface);
            m1782a(this.f1742q, typeface);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1842a(ColorStateList colorStateList) {
        if (this.f1730e != null) {
            this.f1730e.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1841a(int i) {
        this.f1741p = i;
        if (this.f1730e != null) {
            this.f1734i.mo1698a(this.f1730e, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo1853c() {
        return m1787e(this.f1740o);
    }

    /* renamed from: h */
    private void m1789h() {
        if (this.f1726a != null) {
            this.f1726a.cancel();
        }
    }

    /* renamed from: i */
    private boolean m1790i() {
        if (this.f1735j == null || this.f1734i.getEditText() == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo1854d() {
        if (this.f1730e != null) {
            return this.f1730e.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final ColorStateList mo1855e() {
        if (this.f1730e != null) {
            return this.f1730e.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final int mo1856f() {
        if (this.f1742q != null) {
            return this.f1742q.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: g */
    private void m1788g() {
        m1789h();
        if (this.f1727b == 2) {
            this.f1740o = 0;
        }
        m1780a(this.f1727b, this.f1740o, m1784a(this.f1742q, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1847b() {
        if (m1790i()) {
            C0991u.m4202b(this.f1735j, C0991u.m4229k(this.f1734i.getEditText()), 0, C0991u.m4232l(this.f1734i.getEditText()), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1840a() {
        this.f1728c = null;
        m1789h();
        if (this.f1727b == 1) {
            if (!this.f1732g || TextUtils.isEmpty(this.f1731f)) {
                this.f1740o = 0;
            } else {
                this.f1740o = 2;
            }
        }
        m1780a(this.f1727b, this.f1740o, m1784a(this.f1730e, (CharSequence) null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1848b(int i) {
        this.f1743r = i;
        if (this.f1742q != null) {
            C1056n.m4567a(this.f1742q, i);
        }
    }

    /* renamed from: a */
    private ObjectAnimator m1777a(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f1739n, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C0234a.f875d);
        return ofFloat;
    }

    /* renamed from: d */
    private TextView m1786d(int i) {
        switch (i) {
            case 1:
                return this.f1730e;
            case 2:
                return this.f1742q;
            default:
                return null;
        }
    }

    /* renamed from: e */
    private boolean m1787e(int i) {
        if (i != 1 || this.f1730e == null || TextUtils.isEmpty(this.f1728c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1849b(ColorStateList colorStateList) {
        if (this.f1742q != null) {
            this.f1742q.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1851b(CharSequence charSequence) {
        m1789h();
        this.f1728c = charSequence;
        this.f1730e.setText(charSequence);
        if (this.f1727b != 1) {
            this.f1740o = 1;
        }
        m1780a(this.f1727b, this.f1740o, m1784a(this.f1730e, charSequence));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1852b(boolean z) {
        if (this.f1732g != z) {
            m1789h();
            if (z) {
                this.f1742q = new AppCompatTextView(this.f1733h);
                this.f1742q.setId(R.id.dih);
                if (this.f1744s != null) {
                    this.f1742q.setTypeface(this.f1744s);
                }
                this.f1742q.setVisibility(4);
                C0991u.m4216f((View) this.f1742q, 1);
                mo1848b(this.f1743r);
                mo1844a(this.f1742q, 1);
            } else {
                m1788g();
                mo1850b(this.f1742q, 1);
                this.f1742q = null;
                this.f1734i.mo1696a();
                this.f1734i.mo1701b();
            }
            this.f1732g = z;
        }
    }

    /* renamed from: a */
    private static void m1781a(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private static void m1782a(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: a */
    private static ObjectAnimator m1778a(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C0234a.f872a);
        return ofFloat;
    }

    /* renamed from: a */
    private void m1779a(int i, int i2) {
        if (i != i2) {
            if (i2 != 0) {
                TextView d = m1786d(i2);
                if (d != null) {
                    d.setVisibility(0);
                    d.setAlpha(1.0f);
                }
            }
            if (i != 0) {
                TextView d2 = m1786d(i);
                if (d2 != null) {
                    d2.setVisibility(4);
                    if (i == 1) {
                        d2.setText(null);
                    }
                }
            }
            this.f1727b = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1850b(TextView textView, int i) {
        if (this.f1735j != null) {
            if (!m1785c(i) || this.f1737l == null) {
                this.f1735j.removeView(textView);
            } else {
                this.f1738m--;
                m1781a((ViewGroup) this.f1737l, this.f1738m);
                this.f1737l.removeView(textView);
            }
            this.f1736k--;
            m1781a((ViewGroup) this.f1735j, this.f1736k);
        }
    }

    /* renamed from: a */
    private boolean m1784a(TextView textView, CharSequence charSequence) {
        if (!C0991u.m4167D(this.f1734i) || !this.f1734i.isEnabled() || (this.f1740o == this.f1727b && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m1780a(int i, int i2, boolean z) {
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1726a = animatorSet;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = arrayList;
            int i3 = i;
            int i4 = i2;
            m1783a(arrayList2, this.f1732g, this.f1742q, 2, i3, i4);
            m1783a(arrayList2, this.f1729d, this.f1730e, 1, i3, i4);
            C0235b.m832a(animatorSet, arrayList);
            final TextView d = m1786d(i);
            final TextView d2 = m1786d(i2);
            final int i5 = i2;
            final int i6 = i;
            C04011 r0 = new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    if (d2 != null) {
                        d2.setVisibility(0);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    C0400i.this.f1727b = i5;
                    C0400i.this.f1726a = null;
                    if (d != null) {
                        d.setVisibility(4);
                        if (i6 == 1 && C0400i.this.f1730e != null) {
                            C0400i.this.f1730e.setText(null);
                        }
                    }
                }
            };
            animatorSet.addListener(r0);
            animatorSet.start();
        } else {
            m1779a(i, i2);
        }
        this.f1734i.mo1696a();
        this.f1734i.mo1699a(z);
        this.f1734i.mo1701b();
    }

    /* renamed from: a */
    private void m1783a(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(m1778a(textView, z2));
                if (i3 == i) {
                    list.add(m1777a(textView));
                }
            }
        }
    }
}
