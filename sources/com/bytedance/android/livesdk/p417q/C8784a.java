package com.bytedance.android.livesdk.p417q;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.widget.C1054l;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.android.livesdk.p417q.C8784a;

/* renamed from: com.bytedance.android.livesdk.q.a */
public abstract class C8784a<T extends C8784a> implements OnDismissListener {

    /* renamed from: A */
    private int f23854A;

    /* renamed from: B */
    private int f23855B = 1;

    /* renamed from: a */
    public PopupWindow f23856a;

    /* renamed from: b */
    public int f23857b = -2;

    /* renamed from: c */
    public int f23858c = -2;

    /* renamed from: d */
    public View f23859d;

    /* renamed from: e */
    public int f23860e = 2;

    /* renamed from: f */
    public int f23861f = 1;

    /* renamed from: g */
    public int f23862g;

    /* renamed from: h */
    public int f23863h;

    /* renamed from: i */
    public boolean f23864i;

    /* renamed from: j */
    public boolean f23865j;

    /* renamed from: k */
    public boolean f23866k;

    /* renamed from: l */
    public C8788a f23867l;

    /* renamed from: m */
    private Context f23868m;

    /* renamed from: n */
    private View f23869n;

    /* renamed from: o */
    private int f23870o;

    /* renamed from: p */
    private boolean f23871p = true;

    /* renamed from: q */
    private boolean f23872q = true;

    /* renamed from: r */
    private int f23873r;

    /* renamed from: s */
    private OnDismissListener f23874s;

    /* renamed from: t */
    private boolean f23875t;

    /* renamed from: u */
    private float f23876u = 0.7f;

    /* renamed from: v */
    private int f23877v = -16777216;

    /* renamed from: w */
    private ViewGroup f23878w;

    /* renamed from: x */
    private Transition f23879x;

    /* renamed from: y */
    private Transition f23880y;

    /* renamed from: z */
    private boolean f23881z = true;

    /* renamed from: com.bytedance.android.livesdk.q.a$a */
    public interface C8788a {
    }

    /* renamed from: d */
    private T m26321d() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo21850a(View view, T t);

    public void onDismiss() {
        m26329k();
    }

    /* renamed from: a */
    public final void mo21848a(View view, int i, int i2) {
        m26322d(false);
        m26327i();
        this.f23859d = view;
        this.f23862g = i;
        this.f23863h = i2;
        if (this.f23864i) {
            m26326h();
        }
        this.f23856a.showAsDropDown(view, this.f23862g, this.f23863h);
    }

    /* renamed from: a */
    public final void mo21849a(View view, int i, int i2, int i3, int i4) {
        m26322d(true);
        this.f23859d = view;
        this.f23862g = i3;
        this.f23863h = i4;
        this.f23860e = 1;
        this.f23861f = i2;
        m26327i();
        int b = m26317b(view, i2, this.f23857b, this.f23862g);
        int a = m26314a(view, 1, this.f23858c, this.f23863h);
        if (this.f23864i) {
            m26326h();
        }
        C1054l.m4552a(this.f23856a, view, b, a, 0);
    }

    public void dismiss() {
        if (this.f23856a != null) {
            C8790c.m26346a(this.f23856a);
        }
    }

    /* renamed from: h */
    private void m26326h() {
        mo21851b().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT >= 16) {
                    C8784a.this.mo21851b().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else {
                    C8784a.this.mo21851b().getViewTreeObserver().removeGlobalOnLayoutListener(this);
                }
                C8784a.this.f23857b = C8784a.this.mo21851b().getWidth();
                C8784a.this.f23858c = C8784a.this.mo21851b().getHeight();
                C8784a.this.f23865j = true;
                C8784a.this.f23864i = false;
                if (C8784a.this.f23867l != null) {
                    if (C8784a.this.f23859d != null) {
                        C8784a.this.f23859d.getWidth();
                    }
                    if (C8784a.this.f23859d != null) {
                        C8784a.this.f23859d.getHeight();
                    }
                }
                if (C8784a.this.mo21856c() && C8784a.this.f23866k) {
                    C8784a.this.mo21847a(C8784a.this.f23857b, C8784a.this.f23858c, C8784a.this.f23859d, C8784a.this.f23860e, C8784a.this.f23861f, C8784a.this.f23862g, C8784a.this.f23863h);
                }
            }
        });
    }

    /* renamed from: k */
    private void m26329k() {
        if (this.f23874s != null) {
            this.f23874s.onDismiss();
        }
        m26328j();
        if (this.f23856a != null && this.f23856a.isShowing()) {
            C8790c.m26346a(this.f23856a);
        }
    }

    /* renamed from: c */
    public final boolean mo21856c() {
        if (this.f23856a == null || !this.f23856a.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m26325g() {
        View b = mo21851b();
        if (this.f23857b <= 0 || this.f23858c <= 0) {
            b.measure(0, 0);
            if (this.f23857b <= 0) {
                this.f23857b = b.getMeasuredWidth();
            }
            if (this.f23858c <= 0) {
                this.f23858c = b.getMeasuredHeight();
            }
        }
    }

    /* renamed from: i */
    private void m26327i() {
        if (VERSION.SDK_INT >= 18 && this.f23875t) {
            if (this.f23878w != null) {
                m26316a(this.f23878w);
                return;
            }
            if (!(mo21851b() == null || mo21851b().getContext() == null || !(mo21851b().getContext() instanceof Activity))) {
                m26315a((Activity) mo21851b().getContext());
            }
        }
    }

    /* renamed from: j */
    private void m26328j() {
        if (VERSION.SDK_INT >= 18 && this.f23875t) {
            if (this.f23878w != null) {
                m26320b(this.f23878w);
            } else if (mo21851b() != null) {
                Activity activity = (Activity) mo21851b().getContext();
                if (activity != null) {
                    m26318b(activity);
                }
            }
        }
    }

    /* renamed from: f */
    private void m26324f() {
        if (!this.f23881z) {
            this.f23856a.setFocusable(true);
            this.f23856a.setOutsideTouchable(false);
            this.f23856a.setBackgroundDrawable(null);
            this.f23856a.getContentView().setFocusable(true);
            this.f23856a.getContentView().setFocusableInTouchMode(true);
            this.f23856a.getContentView().setOnKeyListener(new OnKeyListener() {
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    C8789b.m26345a(C8784a.this.f23856a);
                    return true;
                }
            });
            this.f23856a.setTouchInterceptor(new OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if ((motionEvent.getAction() != 0 || (x >= 0 && x < C8784a.this.f23857b && y >= 0 && y < C8784a.this.f23858c)) && motionEvent.getAction() != 4) {
                        return false;
                    }
                    return true;
                }
            });
            return;
        }
        this.f23856a.setFocusable(this.f23871p);
        this.f23856a.setOutsideTouchable(this.f23872q);
        this.f23856a.setBackgroundDrawable(new ColorDrawable(0));
    }

    /* renamed from: b */
    public final View mo21851b() {
        if (this.f23856a != null) {
            return this.f23856a.getContentView();
        }
        return null;
    }

    /* renamed from: e */
    private void m26323e() {
        if (this.f23869n == null) {
            if (this.f23870o == 0 || this.f23868m == null) {
                StringBuilder sb = new StringBuilder("The content view is null,the layoutId=");
                sb.append(this.f23870o);
                sb.append(",appContext=");
                sb.append(this.f23868m);
                throw new IllegalArgumentException(sb.toString());
            }
            this.f23869n = LayoutInflater.from(this.f23868m).inflate(this.f23870o, null);
        }
        this.f23856a.setContentView(this.f23869n);
        if (this.f23857b > 0 || this.f23857b == -2 || this.f23857b == -1) {
            this.f23856a.setWidth(this.f23857b);
        } else {
            this.f23856a.setWidth(-2);
        }
        if (this.f23858c > 0 || this.f23858c == -2 || this.f23858c == -1) {
            this.f23856a.setHeight(this.f23858c);
        } else {
            this.f23856a.setHeight(-2);
        }
        m26325g();
        m26326h();
        this.f23856a.setInputMethodMode(this.f23854A);
        this.f23856a.setSoftInputMode(this.f23855B);
    }

    /* renamed from: a */
    public final T mo21842a() {
        if (this.f23856a == null) {
            this.f23856a = new PopupWindow();
        }
        m26323e();
        m26319b(this.f23869n);
        if (this.f23873r != 0) {
            this.f23856a.setAnimationStyle(this.f23873r);
        }
        m26324f();
        this.f23856a.setOnDismissListener(this);
        if (VERSION.SDK_INT >= 23) {
            if (this.f23879x != null) {
                this.f23856a.setEnterTransition(this.f23879x);
            }
            if (this.f23880y != null) {
                this.f23856a.setExitTransition(this.f23880y);
            }
        }
        return m26321d();
    }

    /* renamed from: b */
    private void m26319b(View view) {
        mo21850a(view, m26321d());
    }

    /* renamed from: a */
    public final T mo21844a(Context context) {
        this.f23868m = context;
        return m26321d();
    }

    /* renamed from: c */
    public final T mo21854c(int i) {
        this.f23858c = i;
        return m26321d();
    }

    /* renamed from: b */
    private static void m26320b(ViewGroup viewGroup) {
        viewGroup.getOverlay().clear();
    }

    /* renamed from: d */
    private void m26322d(boolean z) {
        if (this.f23866k != z) {
            this.f23866k = z;
        }
        if (this.f23856a == null) {
            mo21842a();
        }
    }

    /* renamed from: a */
    public final T mo21843a(int i) {
        this.f23869n = null;
        this.f23870o = i;
        return m26321d();
    }

    /* renamed from: c */
    public final T mo21855c(boolean z) {
        this.f23881z = true;
        return m26321d();
    }

    /* renamed from: b */
    private static void m26318b(Activity activity) {
        ((ViewGroup) activity.getWindow().getDecorView().getRootView()).getOverlay().clear();
    }

    /* renamed from: a */
    public final T mo21845a(View view) {
        this.f23869n = view;
        this.f23870o = 0;
        return m26321d();
    }

    /* renamed from: a */
    private void m26315a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().getRootView();
        ColorDrawable colorDrawable = new ColorDrawable(this.f23877v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f23876u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: a */
    private void m26316a(ViewGroup viewGroup) {
        ColorDrawable colorDrawable = new ColorDrawable(this.f23877v);
        colorDrawable.setBounds(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        colorDrawable.setAlpha((int) (this.f23876u * 255.0f));
        viewGroup.getOverlay().add(colorDrawable);
    }

    /* renamed from: b */
    public final T mo21852b(int i) {
        this.f23857b = i;
        return m26321d();
    }

    /* renamed from: b */
    public final T mo21853b(boolean z) {
        this.f23872q = false;
        return m26321d();
    }

    /* renamed from: a */
    public final T mo21846a(boolean z) {
        this.f23871p = false;
        return m26321d();
    }

    /* renamed from: a */
    private static int m26314a(View view, int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i3 - ((view.getHeight() / 2) + (i2 / 2));
            case 1:
                return i3 - (i2 + view.getHeight());
            case 3:
                return i3 - view.getHeight();
            case 4:
                return i3 - i2;
            default:
                return i3;
        }
    }

    /* renamed from: b */
    private static int m26317b(View view, int i, int i2, int i3) {
        switch (i) {
            case 0:
                return i3 + ((view.getWidth() / 2) - (i2 / 2));
            case 1:
                return i3 - i2;
            case 2:
                return i3 + view.getWidth();
            case 4:
                return i3 - (i2 - view.getWidth());
            default:
                return i3;
        }
    }

    /* renamed from: a */
    public final void mo21847a(int i, int i2, View view, int i3, int i4, int i5, int i6) {
        if (this.f23856a != null) {
            this.f23856a.update(view, m26317b(view, i4, i, i5), m26314a(view, i3, i2, i6), i, i2);
        }
    }
}
