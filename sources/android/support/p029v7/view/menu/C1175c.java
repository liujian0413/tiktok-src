package android.support.p029v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p022v4.view.C0972e;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.widget.C1340af;
import android.support.p029v7.widget.MenuPopupWindow;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.c */
final class C1175c extends C1185g implements C1188i, OnKeyListener, OnDismissListener {

    /* renamed from: h */
    private static final int f4357h = 2131492875;

    /* renamed from: A */
    private C1189a f4358A;

    /* renamed from: B */
    private OnDismissListener f4359B;

    /* renamed from: a */
    final Handler f4360a;

    /* renamed from: b */
    final List<C1180a> f4361b = new ArrayList();

    /* renamed from: c */
    final OnGlobalLayoutListener f4362c = new OnGlobalLayoutListener() {
        public final void onGlobalLayout() {
            if (C1175c.this.mo4894e() && C1175c.this.f4361b.size() > 0 && !((C1180a) C1175c.this.f4361b.get(0)).f4391a.f4821u) {
                View view = C1175c.this.f4363d;
                if (view == null || !view.isShown()) {
                    C1175c.this.dismiss();
                    return;
                }
                for (C1180a aVar : C1175c.this.f4361b) {
                    aVar.f4391a.mo4892d();
                }
            }
        }
    };

    /* renamed from: d */
    View f4363d;

    /* renamed from: e */
    ViewTreeObserver f4364e;

    /* renamed from: f */
    boolean f4365f;

    /* renamed from: i */
    private final Context f4366i;

    /* renamed from: j */
    private final int f4367j;

    /* renamed from: k */
    private final int f4368k;

    /* renamed from: l */
    private final int f4369l;

    /* renamed from: m */
    private final boolean f4370m;

    /* renamed from: n */
    private final List<MenuBuilder> f4371n = new ArrayList();

    /* renamed from: o */
    private final OnAttachStateChangeListener f4372o = new OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (C1175c.this.f4364e != null) {
                if (!C1175c.this.f4364e.isAlive()) {
                    C1175c.this.f4364e = view.getViewTreeObserver();
                }
                C1175c.this.f4364e.removeGlobalOnLayoutListener(C1175c.this.f4362c);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* renamed from: p */
    private final C1340af f4373p = new C1340af() {
        /* renamed from: a */
        public final void mo4902a(MenuBuilder menuBuilder, MenuItem menuItem) {
            C1175c.this.f4360a.removeCallbacksAndMessages(menuBuilder);
        }

        /* renamed from: b */
        public final void mo4903b(final MenuBuilder menuBuilder, final MenuItem menuItem) {
            final C1180a aVar = null;
            C1175c.this.f4360a.removeCallbacksAndMessages(null);
            int size = C1175c.this.f4361b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((C1180a) C1175c.this.f4361b.get(i)).f4392b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C1175c.this.f4361b.size()) {
                    aVar = (C1180a) C1175c.this.f4361b.get(i2);
                }
                C1175c.this.f4360a.postAtTime(new Runnable() {
                    public final void run() {
                        if (aVar != null) {
                            C1175c.this.f4365f = true;
                            aVar.f4392b.mo4722b(false);
                            C1175c.this.f4365f = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            menuBuilder.mo4708a(menuItem, 4);
                        }
                    }
                }, menuBuilder, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: q */
    private int f4374q = 0;

    /* renamed from: r */
    private int f4375r = 0;

    /* renamed from: s */
    private View f4376s;

    /* renamed from: t */
    private int f4377t;

    /* renamed from: u */
    private boolean f4378u;

    /* renamed from: v */
    private boolean f4379v;

    /* renamed from: w */
    private int f4380w;

    /* renamed from: x */
    private int f4381x;

    /* renamed from: y */
    private boolean f4382y;

    /* renamed from: z */
    private boolean f4383z;

    /* renamed from: android.support.v7.view.menu.c$a */
    static class C1180a {

        /* renamed from: a */
        public final MenuPopupWindow f4391a;

        /* renamed from: b */
        public final MenuBuilder f4392b;

        /* renamed from: c */
        public final int f4393c;

        /* renamed from: a */
        public final ListView mo4905a() {
            return this.f4391a.mo4895f();
        }

        public C1180a(MenuPopupWindow menuPopupWindow, MenuBuilder menuBuilder, int i) {
            this.f4391a = menuPopupWindow;
            this.f4392b = menuBuilder;
            this.f4393c = i;
        }
    }

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo4896g() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        for (C1180a aVar : this.f4361b) {
            if (subMenuBuilder == aVar.f4392b) {
                aVar.mo4905a().requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        mo4885a((MenuBuilder) subMenuBuilder);
        if (this.f4358A != null) {
            this.f4358A.mo4339a(subMenuBuilder);
        }
        return true;
    }

    /* renamed from: i */
    private int m5341i() {
        if (C0991u.m4220h(this.f4376s) == 1) {
            return 0;
        }
        return 1;
    }

    /* renamed from: e */
    public final boolean mo4894e() {
        if (this.f4361b.size() <= 0 || !((C1180a) this.f4361b.get(0)).f4391a.mo4894e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final ListView mo4895f() {
        if (this.f4361b.isEmpty()) {
            return null;
        }
        return ((C1180a) this.f4361b.get(this.f4361b.size() - 1)).mo4905a();
    }

    /* renamed from: h */
    private MenuPopupWindow m5340h() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f4366i, null, this.f4368k, this.f4369l);
        menuPopupWindow.f4836a = this.f4373p;
        menuPopupWindow.f4816p = this;
        menuPopupWindow.mo5480a((OnDismissListener) this);
        menuPopupWindow.f4814n = this.f4376s;
        menuPopupWindow.f4809i = this.f4375r;
        menuPopupWindow.mo5481a(true);
        menuPopupWindow.mo5489e(2);
        return menuPopupWindow;
    }

    public final void dismiss() {
        int size = this.f4361b.size();
        if (size > 0) {
            C1180a[] aVarArr = (C1180a[]) this.f4361b.toArray(new C1180a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1180a aVar = aVarArr[i];
                if (aVar.f4391a.mo4894e()) {
                    aVar.f4391a.dismiss();
                }
            }
        }
    }

    public final void onDismiss() {
        C1180a aVar;
        int size = this.f4361b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = (C1180a) this.f4361b.get(i);
            if (!aVar.f4391a.mo4894e()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f4392b.mo4722b(false);
        }
    }

    /* renamed from: d */
    public final void mo4892d() {
        boolean z;
        if (!mo4894e()) {
            for (MenuBuilder c : this.f4371n) {
                m5337c(c);
            }
            this.f4371n.clear();
            this.f4363d = this.f4376s;
            if (this.f4363d != null) {
                if (this.f4364e == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f4364e = this.f4363d.getViewTreeObserver();
                if (z) {
                    this.f4364e.addOnGlobalLayoutListener(this.f4362c);
                }
                this.f4363d.addOnAttachStateChangeListener(this.f4372o);
            }
        }
    }

    /* renamed from: b */
    public final void mo4889b(boolean z) {
        this.f4382y = z;
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
        this.f4358A = aVar;
    }

    /* renamed from: b */
    public final void mo4888b(int i) {
        this.f4378u = true;
        this.f4380w = i;
    }

    /* renamed from: c */
    public final void mo4890c(int i) {
        this.f4379v = true;
        this.f4381x = i;
    }

    /* renamed from: a */
    public final void mo4887a(OnDismissListener onDismissListener) {
        this.f4359B = onDismissListener;
    }

    /* renamed from: c */
    public final void mo4891c(boolean z) {
        this.f4383z = z;
    }

    /* renamed from: d */
    private int m5339d(MenuBuilder menuBuilder) {
        int size = this.f4361b.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == ((C1180a) this.f4361b.get(i)).f4392b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private int m5338d(int i) {
        ListView a = ((C1180a) this.f4361b.get(this.f4361b.size() - 1)).mo4905a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f4363d.getWindowVisibleDisplayFrame(rect);
        if (this.f4377t == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public final void mo4884a(int i) {
        if (this.f4374q != i) {
            this.f4374q = i;
            this.f4375r = C0972e.m4109a(i, C0991u.m4220h(this.f4376s));
        }
    }

    /* renamed from: a */
    public final void mo4885a(MenuBuilder menuBuilder) {
        menuBuilder.mo4705a((C1188i) this, this.f4366i);
        if (mo4894e()) {
            m5337c(menuBuilder);
        } else {
            this.f4371n.add(menuBuilder);
        }
    }

    /* renamed from: c */
    private void m5337c(MenuBuilder menuBuilder) {
        View view;
        C1180a aVar;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f4366i);
        C1181d dVar = new C1181d(menuBuilder, from, this.f4370m, f4357h);
        if (!mo4894e() && this.f4382y) {
            dVar.f4395b = true;
        } else if (mo4894e()) {
            dVar.f4395b = C1185g.m5376b(menuBuilder);
        }
        int a = m5374a(dVar, null, this.f4366i, this.f4367j);
        MenuPopupWindow h = m5340h();
        h.mo5249a((ListAdapter) dVar);
        h.mo5487c(a);
        h.f4809i = this.f4375r;
        if (this.f4361b.size() > 0) {
            aVar = (C1180a) this.f4361b.get(this.f4361b.size() - 1);
            view = m5336a(aVar, menuBuilder);
        } else {
            aVar = null;
            view = null;
        }
        if (view != null) {
            h.mo5505c(false);
            h.mo5503a(null);
            int d = m5338d(a);
            if (d == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f4377t = d;
            if (VERSION.SDK_INT >= 26) {
                h.f4814n = view;
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f4376s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f4375r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f4376s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f4375r & 5) == 5) {
                if (z) {
                    i3 = i + a;
                } else {
                    i3 = i - view.getWidth();
                }
            } else if (z) {
                i3 = i + view.getWidth();
            } else {
                i3 = i - a;
            }
            h.f4807g = i3;
            h.mo5485b(true);
            h.mo5484b(i2);
        } else {
            if (this.f4378u) {
                h.f4807g = this.f4380w;
            }
            if (this.f4379v) {
                h.mo5484b(this.f4381x);
            }
            h.f4820t = this.f4406g;
        }
        this.f4361b.add(new C1180a(h, menuBuilder, this.f4377t));
        h.mo4892d();
        ListView f = h.mo4895f();
        f.setOnKeyListener(this);
        if (aVar == null && this.f4383z && menuBuilder.f4291d != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.s, f, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.f4291d);
            f.addHeaderView(frameLayout, null, false);
            h.mo4892d();
        }
    }

    /* renamed from: a */
    public final void mo4886a(View view) {
        if (this.f4376s != view) {
            this.f4376s = view;
            this.f4375r = C0972e.m4109a(this.f4374q, C0991u.m4220h(this.f4376s));
        }
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        for (C1180a a : this.f4361b) {
            m5375a(a.mo4905a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static MenuItem m5335a(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m5336a(C1180a aVar, MenuBuilder menuBuilder) {
        int i;
        C1181d dVar;
        MenuItem a = m5335a(aVar.f4392b, menuBuilder);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo4905a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            dVar = (C1181d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar = (C1181d) adapter;
            i = 0;
        }
        int count = dVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == dVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
        int d = m5339d(menuBuilder);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f4361b.size()) {
                ((C1180a) this.f4361b.get(i)).f4392b.mo4722b(false);
            }
            C1180a aVar = (C1180a) this.f4361b.remove(d);
            aVar.f4392b.mo4721b((C1188i) this);
            if (this.f4365f) {
                aVar.f4391a.mo5504b(null);
                aVar.f4391a.mo5478a(0);
            }
            aVar.f4391a.dismiss();
            int size = this.f4361b.size();
            if (size > 0) {
                this.f4377t = ((C1180a) this.f4361b.get(size - 1)).f4393c;
            } else {
                this.f4377t = m5341i();
            }
            if (size == 0) {
                dismiss();
                if (this.f4358A != null) {
                    this.f4358A.mo4338a(menuBuilder, true);
                }
                if (this.f4364e != null) {
                    if (this.f4364e.isAlive()) {
                        this.f4364e.removeGlobalOnLayoutListener(this.f4362c);
                    }
                    this.f4364e = null;
                }
                this.f4363d.removeOnAttachStateChangeListener(this.f4372o);
                this.f4359B.onDismiss();
                return;
            }
            if (z) {
                ((C1180a) this.f4361b.get(0)).f4392b.mo4722b(false);
            }
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public C1175c(Context context, View view, int i, int i2, boolean z) {
        this.f4366i = context;
        this.f4376s = view;
        this.f4368k = i;
        this.f4369l = i2;
        this.f4370m = z;
        this.f4382y = false;
        this.f4377t = m5341i();
        Resources resources = context.getResources();
        this.f4367j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.a0));
        this.f4360a = new Handler();
    }
}
