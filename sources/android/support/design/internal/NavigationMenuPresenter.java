package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.view.C0954ab;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.view.menu.C1188i;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.view.menu.SubMenuBuilder;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

public class NavigationMenuPresenter implements C1188i {

    /* renamed from: a */
    LinearLayout f1152a;

    /* renamed from: b */
    MenuBuilder f1153b;

    /* renamed from: c */
    public int f1154c;

    /* renamed from: d */
    C0283b f1155d;

    /* renamed from: e */
    LayoutInflater f1156e;

    /* renamed from: f */
    int f1157f;

    /* renamed from: g */
    boolean f1158g;

    /* renamed from: h */
    public ColorStateList f1159h;

    /* renamed from: i */
    public ColorStateList f1160i;

    /* renamed from: j */
    public Drawable f1161j;

    /* renamed from: k */
    public int f1162k;

    /* renamed from: l */
    public int f1163l;

    /* renamed from: m */
    int f1164m;

    /* renamed from: n */
    final OnClickListener f1165n = new OnClickListener() {
        public final void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            NavigationMenuPresenter.this.mo1157b(true);
            MenuItemImpl itemData = navigationMenuItemView.getItemData();
            boolean a = NavigationMenuPresenter.this.f1153b.mo4709a((MenuItem) itemData, (C1188i) NavigationMenuPresenter.this, 0);
            if (itemData != null && itemData.isCheckable() && a) {
                NavigationMenuPresenter.this.f1155d.mo1165a(itemData);
            }
            NavigationMenuPresenter.this.mo1157b(false);
            NavigationMenuPresenter.this.mo1114a(false);
        }
    };

    /* renamed from: o */
    private NavigationMenuView f1166o;

    /* renamed from: p */
    private C1189a f1167p;

    /* renamed from: q */
    private int f1168q;

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$a */
    static class C0282a extends C0291j {
        public C0282a(View view) {
            super(view);
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$b */
    class C0283b extends C1262a<C0291j> {

        /* renamed from: a */
        public MenuItemImpl f1170a;

        /* renamed from: b */
        public boolean f1171b;

        /* renamed from: d */
        private final ArrayList<C0285d> f1173d = new ArrayList<>();

        public final long getItemId(int i) {
            return (long) i;
        }

        /* renamed from: a */
        public final void mo1163a() {
            m1152c();
            notifyDataSetChanged();
        }

        public final int getItemCount() {
            return this.f1173d.size();
        }

        /* renamed from: b */
        public final Bundle mo1166b() {
            View view;
            Bundle bundle = new Bundle();
            if (this.f1170a != null) {
                bundle.putInt("android:menu:checked", this.f1170a.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f1173d.size();
            for (int i = 0; i < size; i++) {
                C0285d dVar = (C0285d) this.f1173d.get(i);
                if (dVar instanceof C0287f) {
                    MenuItemImpl menuItemImpl = ((C0287f) dVar).f1176a;
                    if (menuItemImpl != null) {
                        view = menuItemImpl.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(menuItemImpl.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: c */
        private void m1152c() {
            boolean z;
            if (!this.f1171b) {
                this.f1171b = true;
                this.f1173d.clear();
                this.f1173d.add(new C0284c());
                int size = NavigationMenuPresenter.this.f1153b.mo4739h().size();
                int i = -1;
                boolean z2 = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) NavigationMenuPresenter.this.f1153b.mo4739h().get(i3);
                    if (menuItemImpl.isChecked()) {
                        mo1165a(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.mo4758a(false);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f1173d.add(new C0286e(NavigationMenuPresenter.this.f1164m, 0));
                            }
                            this.f1173d.add(new C0287f(menuItemImpl));
                            int size2 = this.f1173d.size();
                            int size3 = subMenu.size();
                            boolean z3 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                                if (menuItemImpl2.isVisible()) {
                                    if (!z3 && menuItemImpl2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.mo4758a(false);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        mo1165a(menuItemImpl);
                                    }
                                    this.f1173d.add(new C0287f(menuItemImpl2));
                                }
                            }
                            if (z3) {
                                m1149a(size2, this.f1173d.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i2 = this.f1173d.size();
                            if (menuItemImpl.getIcon() != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (i3 != 0) {
                                i2++;
                                this.f1173d.add(new C0286e(NavigationMenuPresenter.this.f1164m, NavigationMenuPresenter.this.f1164m));
                            }
                            z2 = z;
                        } else if (!z2 && menuItemImpl.getIcon() != null) {
                            m1149a(i2, this.f1173d.size());
                            z2 = true;
                        }
                        C0287f fVar = new C0287f(menuItemImpl);
                        fVar.f1177b = z2;
                        this.f1173d.add(fVar);
                        i = groupId;
                    }
                }
                this.f1171b = false;
            }
        }

        public final /* synthetic */ void onViewRecycled(C1293v vVar) {
            m1150a((C0291j) vVar);
        }

        C0283b() {
            m1152c();
        }

        /* renamed from: a */
        private static void m1150a(C0291j jVar) {
            if (jVar instanceof C0288g) {
                ((NavigationMenuItemView) jVar.itemView).mo1136b();
            }
        }

        public final int getItemViewType(int i) {
            C0285d dVar = (C0285d) this.f1173d.get(i);
            if (dVar instanceof C0286e) {
                return 2;
            }
            if (dVar instanceof C0284c) {
                return 3;
            }
            if (!(dVar instanceof C0287f)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((C0287f) dVar).f1176a.hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }

        /* renamed from: a */
        public final void mo1164a(Bundle bundle) {
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.f1171b = true;
                int size = this.f1173d.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C0285d dVar = (C0285d) this.f1173d.get(i2);
                    if (dVar instanceof C0287f) {
                        MenuItemImpl menuItemImpl = ((C0287f) dVar).f1176a;
                        if (menuItemImpl != null && menuItemImpl.getItemId() == i) {
                            mo1165a(menuItemImpl);
                            break;
                        }
                    }
                    i2++;
                }
                this.f1171b = false;
                m1152c();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f1173d.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C0285d dVar2 = (C0285d) this.f1173d.get(i3);
                    if (dVar2 instanceof C0287f) {
                        MenuItemImpl menuItemImpl2 = ((C0287f) dVar2).f1176a;
                        if (menuItemImpl2 != null) {
                            View actionView = menuItemImpl2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(menuItemImpl2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo1165a(MenuItemImpl menuItemImpl) {
            if (this.f1170a != menuItemImpl && menuItemImpl.isCheckable()) {
                if (this.f1170a != null) {
                    this.f1170a.setChecked(false);
                }
                this.f1170a = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        /* renamed from: a */
        private void m1149a(int i, int i2) {
            while (i < i2) {
                ((C0287f) this.f1173d.get(i)).f1177b = true;
                i++;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0291j onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 0:
                    return new C0288g(NavigationMenuPresenter.this.f1156e, viewGroup, NavigationMenuPresenter.this.f1165n);
                case 1:
                    return new C0290i(NavigationMenuPresenter.this.f1156e, viewGroup);
                case 2:
                    return new C0289h(NavigationMenuPresenter.this.f1156e, viewGroup);
                case 3:
                    return new C0282a(NavigationMenuPresenter.this.f1152a);
                default:
                    return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C0291j jVar, int i) {
            Drawable drawable;
            switch (getItemViewType(i)) {
                case 0:
                    NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) jVar.itemView;
                    navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.f1160i);
                    if (NavigationMenuPresenter.this.f1158g) {
                        navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.f1157f);
                    }
                    if (NavigationMenuPresenter.this.f1159h != null) {
                        navigationMenuItemView.setTextColor(NavigationMenuPresenter.this.f1159h);
                    }
                    if (NavigationMenuPresenter.this.f1161j != null) {
                        drawable = NavigationMenuPresenter.this.f1161j.getConstantState().newDrawable();
                    } else {
                        drawable = null;
                    }
                    C0991u.m4185a((View) navigationMenuItemView, drawable);
                    C0287f fVar = (C0287f) this.f1173d.get(i);
                    navigationMenuItemView.setNeedsEmptyIcon(fVar.f1177b);
                    navigationMenuItemView.setHorizontalPadding(NavigationMenuPresenter.this.f1162k);
                    navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.f1163l);
                    navigationMenuItemView.mo1060a(fVar.f1176a, 0);
                    return;
                case 1:
                    ((TextView) jVar.itemView).setText(((C0287f) this.f1173d.get(i)).f1176a.getTitle());
                    return;
                case 2:
                    C0286e eVar = (C0286e) this.f1173d.get(i);
                    jVar.itemView.setPadding(0, eVar.f1174a, 0, eVar.f1175b);
                    break;
            }
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$c */
    static class C0284c implements C0285d {
        C0284c() {
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$d */
    interface C0285d {
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$e */
    static class C0286e implements C0285d {

        /* renamed from: a */
        public final int f1174a;

        /* renamed from: b */
        public final int f1175b;

        public C0286e(int i, int i2) {
            this.f1174a = i;
            this.f1175b = i2;
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$f */
    static class C0287f implements C0285d {

        /* renamed from: a */
        public final MenuItemImpl f1176a;

        /* renamed from: b */
        boolean f1177b;

        C0287f(MenuItemImpl menuItemImpl) {
            this.f1176a = menuItemImpl;
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$g */
    static class C0288g extends C0291j {
        public C0288g(LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.jg, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$h */
    static class C0289h extends C0291j {
        public C0289h(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.ji, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$i */
    static class C0290i extends C0291j {
        public C0290i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.jj, viewGroup, false));
        }
    }

    /* renamed from: android.support.design.internal.NavigationMenuPresenter$j */
    static abstract class C0291j extends C1293v {
        public C0291j(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1116a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    /* renamed from: b */
    public final int mo1118b() {
        return this.f1154c;
    }

    /* renamed from: b */
    public final boolean mo1119b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        if (this.f1155d != null) {
            this.f1155d.mo1163a();
        }
    }

    /* renamed from: a */
    public final void mo1154a(MenuItemImpl menuItemImpl) {
        this.f1155d.mo1165a(menuItemImpl);
    }

    /* renamed from: d */
    public final MenuItemImpl mo1159d() {
        return this.f1155d.f1170a;
    }

    /* renamed from: e */
    public final int mo1161e() {
        return this.f1152a.getChildCount();
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        Bundle bundle = new Bundle();
        if (this.f1166o != null) {
            SparseArray sparseArray = new SparseArray();
            this.f1166o.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        if (this.f1155d != null) {
            bundle.putBundle("android:menu:adapter", this.f1155d.mo1166b());
        }
        if (this.f1152a != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f1152a.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
        this.f1167p = aVar;
    }

    /* renamed from: a */
    public final void mo1151a(ColorStateList colorStateList) {
        this.f1160i = colorStateList;
        mo1114a(false);
    }

    /* renamed from: b */
    public final void mo1156b(ColorStateList colorStateList) {
        this.f1159h = colorStateList;
        mo1114a(false);
    }

    /* renamed from: c */
    public final void mo1158c(int i) {
        this.f1162k = i;
        mo1114a(false);
    }

    /* renamed from: a */
    public final View mo1150a(int i) {
        View inflate = this.f1156e.inflate(i, this.f1152a, false);
        m1123a(inflate);
        return inflate;
    }

    /* renamed from: b */
    public final void mo1155b(int i) {
        this.f1157f = i;
        this.f1158g = true;
        mo1114a(false);
    }

    /* renamed from: d */
    public final void mo1160d(int i) {
        this.f1163l = i;
        mo1114a(false);
    }

    /* renamed from: a */
    private void m1123a(View view) {
        this.f1152a.addView(view);
        this.f1166o.setPadding(0, 0, 0, this.f1166o.getPaddingBottom());
    }

    /* renamed from: b */
    public final void mo1157b(boolean z) {
        if (this.f1155d != null) {
            this.f1155d.f1171b = z;
        }
    }

    /* renamed from: a */
    public final C1190j mo1149a(ViewGroup viewGroup) {
        if (this.f1166o == null) {
            this.f1166o = (NavigationMenuView) this.f1156e.inflate(R.layout.jk, viewGroup, false);
            if (this.f1155d == null) {
                this.f1155d = new C0283b();
            }
            this.f1152a = (LinearLayout) this.f1156e.inflate(R.layout.jh, this.f1166o, false);
            this.f1166o.setAdapter(this.f1155d);
        }
        return this.f1166o;
    }

    /* renamed from: a */
    public final void mo1152a(Drawable drawable) {
        this.f1161j = drawable;
        mo1114a(false);
    }

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f1166o.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f1155d.mo1164a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.f1152a.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public final void mo1153a(C0954ab abVar) {
        int b = abVar.mo3719b();
        if (this.f1168q != b) {
            this.f1168q = b;
            if (this.f1152a.getChildCount() == 0) {
                this.f1166o.setPadding(0, this.f1168q, 0, this.f1166o.getPaddingBottom());
            }
        }
        C0991u.m4199b((View) this.f1152a, abVar);
    }

    /* renamed from: a */
    public final void mo1110a(Context context, MenuBuilder menuBuilder) {
        this.f1156e = LayoutInflater.from(context);
        this.f1153b = menuBuilder;
        this.f1164m = context.getResources().getDimensionPixelOffset(R.dimen.fl);
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
        if (this.f1167p != null) {
            this.f1167p.mo4338a(menuBuilder, z);
        }
    }
}
