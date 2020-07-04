package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1054l;
import android.support.p029v7.appcompat.R$styleable;
import android.support.p029v7.view.menu.C1194m;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.ListPopupWindow */
public class ListPopupWindow implements C1194m {

    /* renamed from: a */
    private static Method f4791a;

    /* renamed from: b */
    private static Method f4792b;

    /* renamed from: c */
    private static Method f4793c;

    /* renamed from: A */
    private boolean f4794A;

    /* renamed from: B */
    private boolean f4795B;

    /* renamed from: C */
    private boolean f4796C;

    /* renamed from: D */
    private View f4797D;

    /* renamed from: E */
    private DataSetObserver f4798E;

    /* renamed from: F */
    private final C1252d f4799F;

    /* renamed from: G */
    private final C1251c f4800G;

    /* renamed from: H */
    private final C1249a f4801H;

    /* renamed from: I */
    private Runnable f4802I;

    /* renamed from: J */
    private final Rect f4803J;

    /* renamed from: d */
    C1434x f4804d;

    /* renamed from: e */
    public int f4805e;

    /* renamed from: f */
    public int f4806f;

    /* renamed from: g */
    public int f4807g;

    /* renamed from: h */
    public int f4808h;

    /* renamed from: i */
    public int f4809i;

    /* renamed from: j */
    public boolean f4810j;

    /* renamed from: k */
    public boolean f4811k;

    /* renamed from: l */
    public int f4812l;

    /* renamed from: m */
    public int f4813m;

    /* renamed from: n */
    public View f4814n;

    /* renamed from: o */
    public Drawable f4815o;

    /* renamed from: p */
    public OnItemClickListener f4816p;

    /* renamed from: q */
    public OnItemSelectedListener f4817q;

    /* renamed from: r */
    final C1253e f4818r;

    /* renamed from: s */
    final Handler f4819s;

    /* renamed from: t */
    public Rect f4820t;

    /* renamed from: u */
    public boolean f4821u;

    /* renamed from: v */
    PopupWindow f4822v;

    /* renamed from: w */
    private Context f4823w;

    /* renamed from: x */
    private ListAdapter f4824x;

    /* renamed from: y */
    private int f4825y;

    /* renamed from: z */
    private boolean f4826z;

    /* renamed from: android.support.v7.widget.ListPopupWindow$a */
    class C1249a implements Runnable {
        public final void run() {
            ListPopupWindow.this.mo5491g();
        }

        C1249a() {
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$b */
    class C1250b extends DataSetObserver {
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }

        public final void onChanged() {
            if (ListPopupWindow.this.mo4894e()) {
                ListPopupWindow.this.mo4892d();
            }
        }

        C1250b() {
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$c */
    class C1251c implements OnScrollListener {
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C1251c() {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo5492h() && ListPopupWindow.this.f4822v.getContentView() != null) {
                ListPopupWindow.this.f4819s.removeCallbacks(ListPopupWindow.this.f4818r);
                ListPopupWindow.this.f4818r.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$d */
    class C1252d implements OnTouchListener {
        C1252d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.f4822v != null && ListPopupWindow.this.f4822v.isShowing() && x >= 0 && x < ListPopupWindow.this.f4822v.getWidth() && y >= 0 && y < ListPopupWindow.this.f4822v.getHeight()) {
                ListPopupWindow.this.f4819s.postDelayed(ListPopupWindow.this.f4818r, 250);
            } else if (action == 1) {
                ListPopupWindow.this.f4819s.removeCallbacks(ListPopupWindow.this.f4818r);
            }
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.ListPopupWindow$e */
    class C1253e implements Runnable {
        public final void run() {
            if (ListPopupWindow.this.f4804d != null && C0991u.m4170G(ListPopupWindow.this.f4804d) && ListPopupWindow.this.f4804d.getCount() > ListPopupWindow.this.f4804d.getChildCount() && ListPopupWindow.this.f4804d.getChildCount() <= ListPopupWindow.this.f4812l) {
                ListPopupWindow.this.f4822v.setInputMethodMode(2);
                ListPopupWindow.this.mo4892d();
            }
        }

        C1253e() {
        }
    }

    /* renamed from: f */
    public final ListView mo4895f() {
        return this.f4804d;
    }

    /* renamed from: b */
    public final Drawable mo5482b() {
        return this.f4822v.getBackground();
    }

    /* renamed from: c */
    public final int mo5486c() {
        if (!this.f4826z) {
            return 0;
        }
        return this.f4825y;
    }

    /* renamed from: e */
    public final boolean mo4894e() {
        return this.f4822v.isShowing();
    }

    /* renamed from: g */
    public final void mo5491g() {
        C1434x xVar = this.f4804d;
        if (xVar != null) {
            xVar.setListSelectionHidden(true);
            xVar.requestLayout();
        }
    }

    /* renamed from: h */
    public final boolean mo5492h() {
        if (this.f4822v.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void mo5248a() {
        if (this.f4797D != null) {
            ViewParent parent = this.f4797D.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f4797D);
            }
        }
    }

    public void dismiss() {
        C1339ae.m6613a(this.f4822v);
        mo5248a();
        this.f4822v.setContentView(null);
        this.f4804d = null;
        this.f4819s.removeCallbacks(this.f4818r);
    }

    static {
        try {
            f4791a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
        try {
            f4792b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f4793c = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* renamed from: i */
    private int m5802i() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        int i4;
        boolean z = true;
        if (this.f4804d == null) {
            Context context = this.f4823w;
            this.f4802I = new Runnable() {
                public final void run() {
                    View view = ListPopupWindow.this.f4814n;
                    if (view != null && view.getWindowToken() != null) {
                        ListPopupWindow.this.mo4892d();
                    }
                }
            };
            this.f4804d = mo5477a(context, !this.f4821u);
            if (this.f4815o != null) {
                this.f4804d.setSelector(this.f4815o);
            }
            this.f4804d.setAdapter(this.f4824x);
            this.f4804d.setOnItemClickListener(this.f4816p);
            this.f4804d.setFocusable(true);
            this.f4804d.setFocusableInTouchMode(true);
            this.f4804d.setOnItemSelectedListener(new OnItemSelectedListener() {
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i != -1) {
                        C1434x xVar = ListPopupWindow.this.f4804d;
                        if (xVar != null) {
                            xVar.setListSelectionHidden(false);
                        }
                    }
                }
            });
            this.f4804d.setOnScrollListener(this.f4800G);
            if (this.f4817q != null) {
                this.f4804d.setOnItemSelectedListener(this.f4817q);
            }
            View view2 = this.f4804d;
            View view3 = this.f4797D;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                switch (this.f4813m) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                }
                if (this.f4806f >= 0) {
                    i4 = this.f4806f;
                    i3 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i4, i3), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f4822v.setContentView(view);
        } else {
            this.f4822v.getContentView();
            View view4 = this.f4797D;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f4822v.getBackground();
        if (background != null) {
            background.getPadding(this.f4803J);
            i2 = this.f4803J.top + this.f4803J.bottom;
            if (!this.f4826z) {
                this.f4825y = -this.f4803J.top;
            }
        } else {
            this.f4803J.setEmpty();
            i2 = 0;
        }
        if (this.f4822v.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m5799a(this.f4814n, this.f4825y, z);
        if (this.f4810j || this.f4805e == -1) {
            return a + i2;
        }
        switch (this.f4806f) {
            case -2:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4823w.getResources().getDisplayMetrics().widthPixels - (this.f4803J.left + this.f4803J.right), Integer.MIN_VALUE);
                break;
            case -1:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4823w.getResources().getDisplayMetrics().widthPixels - (this.f4803J.left + this.f4803J.right), 1073741824);
                break;
            default:
                makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f4806f, 1073741824);
                break;
        }
        int a2 = this.f4804d.mo5506a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f4804d.getPaddingTop() + this.f4804d.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: d */
    public void mo4892d() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = m5802i();
        boolean h = mo5492h();
        C1054l.m4551a(this.f4822v, this.f4808h);
        boolean z2 = true;
        if (!this.f4822v.isShowing()) {
            if (this.f4806f == -1) {
                i = -1;
            } else if (this.f4806f == -2) {
                i = this.f4814n.getWidth();
            } else {
                i = this.f4806f;
            }
            if (this.f4805e == -1) {
                i7 = -1;
            } else if (this.f4805e != -2) {
                i7 = this.f4805e;
            }
            this.f4822v.setWidth(i);
            this.f4822v.setHeight(i7);
            mo5505c(true);
            PopupWindow popupWindow = this.f4822v;
            if (this.f4811k || this.f4810j) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.f4822v.setTouchInterceptor(this.f4799F);
            if (this.f4796C) {
                C1054l.m4553a(this.f4822v, this.f4795B);
            }
            if (f4793c != null) {
                try {
                    f4793c.invoke(this.f4822v, new Object[]{this.f4820t});
                } catch (Exception unused) {
                }
            }
            C1054l.m4552a(this.f4822v, this.f4814n, this.f4807g, this.f4825y, this.f4809i);
            this.f4804d.setSelection(-1);
            if (!this.f4821u || this.f4804d.isInTouchMode()) {
                mo5491g();
            }
            if (!this.f4821u) {
                this.f4819s.post(this.f4801H);
            }
        } else if (C0991u.m4170G(this.f4814n)) {
            if (this.f4806f == -1) {
                i2 = -1;
            } else if (this.f4806f == -2) {
                i2 = this.f4814n.getWidth();
            } else {
                i2 = this.f4806f;
            }
            if (this.f4805e == -1) {
                if (!h) {
                    i7 = -1;
                }
                if (h) {
                    PopupWindow popupWindow2 = this.f4822v;
                    if (this.f4806f == -1) {
                        i6 = -1;
                    } else {
                        i6 = 0;
                    }
                    popupWindow2.setWidth(i6);
                    this.f4822v.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.f4822v;
                    if (this.f4806f == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    popupWindow3.setWidth(i5);
                    this.f4822v.setHeight(-1);
                }
            } else if (this.f4805e != -2) {
                i7 = this.f4805e;
            }
            PopupWindow popupWindow4 = this.f4822v;
            if (this.f4811k || this.f4810j) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.f4822v;
            View view = this.f4814n;
            int i8 = this.f4807g;
            int i9 = this.f4825y;
            if (i2 < 0) {
                i3 = -1;
            } else {
                i3 = i2;
            }
            if (i7 < 0) {
                i4 = -1;
            } else {
                i4 = i7;
            }
            popupWindow5.update(view, i8, i9, i3, i4);
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.sf);
    }

    /* renamed from: e */
    public final void mo5489e(int i) {
        this.f4822v.setInputMethodMode(2);
    }

    /* renamed from: a */
    public final void mo5478a(int i) {
        this.f4822v.setAnimationStyle(0);
    }

    /* renamed from: b */
    public final OnTouchListener mo5483b(View view) {
        return new C1330aa(view) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C1194m mo4666a() {
                return ListPopupWindow.this;
            }
        };
    }

    /* renamed from: c */
    private void mo5505c(boolean z) {
        if (f4791a != null) {
            try {
                f4791a.invoke(this.f4822v, new Object[]{Boolean.valueOf(true)});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo5484b(int i) {
        this.f4825y = i;
        this.f4826z = true;
    }

    /* renamed from: d */
    public final void mo5488d(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.f4805e = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    /* renamed from: f */
    public final void mo5490f(int i) {
        C1434x xVar = this.f4804d;
        if (mo4894e() && xVar != null) {
            xVar.setListSelectionHidden(false);
            xVar.setSelection(i);
            if (xVar.getChoiceMode() != 0) {
                xVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: b */
    public final void mo5485b(boolean z) {
        this.f4796C = true;
        this.f4795B = true;
    }

    /* renamed from: c */
    public final void mo5487c(int i) {
        Drawable background = this.f4822v.getBackground();
        if (background != null) {
            background.getPadding(this.f4803J);
            this.f4806f = this.f4803J.left + this.f4803J.right + i;
            return;
        }
        this.f4806f = i;
    }

    /* renamed from: a */
    public final void mo5479a(Drawable drawable) {
        this.f4822v.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo5249a(ListAdapter listAdapter) {
        if (this.f4798E == null) {
            this.f4798E = new C1250b();
        } else if (this.f4824x != null) {
            this.f4824x.unregisterDataSetObserver(this.f4798E);
        }
        this.f4824x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4798E);
        }
        if (this.f4804d != null) {
            this.f4804d.setAdapter(this.f4824x);
        }
    }

    /* renamed from: a */
    public final void mo5480a(OnDismissListener onDismissListener) {
        this.f4822v.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public final void mo5481a(boolean z) {
        this.f4821u = true;
        this.f4822v.setFocusable(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1434x mo5477a(Context context, boolean z) {
        return new C1434x(context, z);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private int m5799a(View view, int i, boolean z) {
        if (f4792b != null) {
            try {
                return ((Integer) f4792b.invoke(this.f4822v, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
            }
        }
        return this.f4822v.getMaxAvailableHeight(view, i);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4805e = -2;
        this.f4806f = -2;
        this.f4808h = 1002;
        this.f4794A = true;
        this.f4812l = Integer.MAX_VALUE;
        this.f4818r = new C1253e();
        this.f4799F = new C1252d();
        this.f4800G = new C1251c();
        this.f4801H = new C1249a();
        this.f4803J = new Rect();
        this.f4823w = context;
        this.f4819s = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ListPopupWindow, i, i2);
        this.f4807g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        this.f4825y = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        if (this.f4825y != 0) {
            this.f4826z = true;
        }
        obtainStyledAttributes.recycle();
        this.f4822v = new C1415j(context, attributeSet, i, i2);
        this.f4822v.setInputMethodMode(1);
    }
}
