package android.support.p029v7.view.menu;

import android.content.Context;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.BaseMenuPresenter */
public abstract class BaseMenuPresenter implements C1188i {

    /* renamed from: a */
    protected Context f4243a;

    /* renamed from: b */
    protected Context f4244b;

    /* renamed from: c */
    public MenuBuilder f4245c;

    /* renamed from: d */
    protected LayoutInflater f4246d;

    /* renamed from: e */
    protected LayoutInflater f4247e;

    /* renamed from: f */
    public C1189a f4248f;

    /* renamed from: g */
    public C1190j f4249g;

    /* renamed from: h */
    public int f4250h;

    /* renamed from: i */
    private int f4251i = R.layout.d;

    /* renamed from: j */
    private int f4252j = R.layout.c;

    /* renamed from: a */
    public abstract void mo4671a(MenuItemImpl menuItemImpl, C1191a aVar);

    /* renamed from: a */
    public boolean mo1115a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo4672a(int i, MenuItemImpl menuItemImpl) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo1116a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: b */
    public final int mo1118b() {
        return this.f4250h;
    }

    /* renamed from: b */
    public final boolean mo1119b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4673a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        if (this.f4248f != null) {
            return this.f4248f.mo4339a(subMenuBuilder);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
        this.f4248f = aVar;
    }

    /* renamed from: b */
    private C1191a m5186b(ViewGroup viewGroup) {
        return (C1191a) this.f4246d.inflate(this.f4252j, viewGroup, false);
    }

    /* renamed from: a */
    public C1190j mo4669a(ViewGroup viewGroup) {
        if (this.f4249g == null) {
            this.f4249g = (C1190j) this.f4246d.inflate(this.f4251i, viewGroup, false);
            this.f4249g.mo1084a(this.f4245c);
            mo1114a(true);
        }
        return this.f4249g;
    }

    /* renamed from: a */
    public void mo1114a(boolean z) {
        MenuItemImpl menuItemImpl;
        ViewGroup viewGroup = (ViewGroup) this.f4249g;
        if (viewGroup != null) {
            int i = 0;
            if (this.f4245c != null) {
                this.f4245c.mo4741i();
                ArrayList h = this.f4245c.mo4739h();
                int size = h.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl2 = (MenuItemImpl) h.get(i3);
                    if (mo4672a(i2, menuItemImpl2)) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C1191a) {
                            menuItemImpl = ((C1191a) childAt).getItemData();
                        } else {
                            menuItemImpl = null;
                        }
                        View a = mo4670a(menuItemImpl2, childAt, viewGroup);
                        if (menuItemImpl2 != menuItemImpl) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            m5185a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo4673a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1110a(Context context, MenuBuilder menuBuilder) {
        this.f4244b = context;
        this.f4247e = LayoutInflater.from(this.f4244b);
        this.f4245c = menuBuilder;
    }

    /* renamed from: a */
    private void m5185a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f4249g).addView(view, i);
    }

    /* renamed from: a */
    public void mo1112a(MenuBuilder menuBuilder, boolean z) {
        if (this.f4248f != null) {
            this.f4248f.mo4338a(menuBuilder, z);
        }
    }

    public BaseMenuPresenter(Context context, int i, int i2) {
        this.f4243a = context;
        this.f4246d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public View mo4670a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        C1191a aVar;
        if (view instanceof C1191a) {
            aVar = (C1191a) view;
        } else {
            aVar = m5186b(viewGroup);
        }
        mo4671a(menuItemImpl, aVar);
        return (View) aVar;
    }
}
