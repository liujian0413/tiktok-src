package android.support.p029v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.internal.view.C0745a;
import android.support.p022v4.view.C0958b;
import android.support.p022v4.view.C0995v;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.MenuBuilder */
public class MenuBuilder implements C0745a {

    /* renamed from: j */
    private static final int[] f4286j = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f4287A = false;

    /* renamed from: a */
    public final Context f4288a;

    /* renamed from: b */
    public final Resources f4289b;

    /* renamed from: c */
    public ContextMenuInfo f4290c;

    /* renamed from: d */
    public CharSequence f4291d;

    /* renamed from: e */
    public Drawable f4292e;

    /* renamed from: f */
    public View f4293f;

    /* renamed from: g */
    public boolean f4294g;

    /* renamed from: h */
    public MenuItemImpl f4295h;

    /* renamed from: i */
    public boolean f4296i;

    /* renamed from: k */
    private boolean f4297k;

    /* renamed from: l */
    private boolean f4298l;

    /* renamed from: m */
    private C1166a f4299m;

    /* renamed from: n */
    private ArrayList<MenuItemImpl> f4300n;

    /* renamed from: o */
    private ArrayList<MenuItemImpl> f4301o;

    /* renamed from: p */
    private boolean f4302p;

    /* renamed from: q */
    private ArrayList<MenuItemImpl> f4303q;

    /* renamed from: r */
    private ArrayList<MenuItemImpl> f4304r;

    /* renamed from: s */
    private boolean f4305s;

    /* renamed from: t */
    private int f4306t;

    /* renamed from: u */
    private boolean f4307u;

    /* renamed from: v */
    private boolean f4308v;

    /* renamed from: w */
    private boolean f4309w;

    /* renamed from: x */
    private boolean f4310x;

    /* renamed from: y */
    private ArrayList<MenuItemImpl> f4311y = new ArrayList<>();

    /* renamed from: z */
    private CopyOnWriteArrayList<WeakReference<C1188i>> f4312z = new CopyOnWriteArrayList<>();

    /* renamed from: android.support.v7.view.menu.MenuBuilder$a */
    public interface C1166a {
        /* renamed from: a */
        void mo1345a(MenuBuilder menuBuilder);

        /* renamed from: a */
        boolean mo1346a(MenuBuilder menuBuilder, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.MenuBuilder$b */
    public interface C1167b {
        /* renamed from: a */
        boolean mo4674a(MenuItemImpl menuItemImpl);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo4700a() {
        return "android:menu:actionviewstates";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4726c() {
        return this.f4297k;
    }

    /* renamed from: d */
    public boolean mo4732d() {
        return this.f4298l;
    }

    /* renamed from: l */
    public MenuBuilder mo4745l() {
        return this;
    }

    /* renamed from: a */
    public final void mo4704a(C1188i iVar) {
        mo4705a(iVar, this.f4288a);
    }

    /* renamed from: a */
    public final void mo4705a(C1188i iVar, Context context) {
        this.f4312z.add(new WeakReference(iVar));
        iVar.mo1110a(context, this);
        this.f4305s = true;
    }

    /* renamed from: a */
    public final void mo4701a(Bundle bundle) {
        m5240e(bundle);
    }

    /* renamed from: a */
    public void mo4702a(C1166a aVar) {
        this.f4299m = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1080a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m5241f(i3);
        MenuItemImpl a = m5230a(i, i2, i3, f, charSequence, this.f4306t);
        if (this.f4290c != null) {
            a.f4321d = this.f4290c;
        }
        this.f4300n.add(m5229a(this.f4300n, f), a);
        mo1173a(true);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4706a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f4300n.size();
        mo4735f();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i);
            if (menuItemImpl.getGroupId() == groupId && menuItemImpl.mo4767f() && menuItemImpl.isCheckable()) {
                menuItemImpl.mo4759b(menuItemImpl == menuItem);
            }
        }
        mo4737g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4707a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return this.f4299m != null && this.f4299m.mo1346a(menuBuilder, menuItem);
    }

    /* renamed from: a */
    public final boolean mo4708a(MenuItem menuItem, int i) {
        return mo4709a(menuItem, (C1188i) null, i);
    }

    /* renamed from: a */
    public final boolean mo4709a(MenuItem menuItem, C1188i iVar, int i) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        boolean b = menuItemImpl.mo4760b();
        C0958b a = menuItemImpl.mo2950a();
        boolean z = a != null && a.mo3737e();
        if (menuItemImpl.mo4791m()) {
            b |= menuItemImpl.expandActionView();
            if (b) {
                mo4722b(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo4722b(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                menuItemImpl.mo4757a(new SubMenuBuilder(this.f4288a, this, menuItemImpl));
            }
            SubMenuBuilder subMenuBuilder = (SubMenuBuilder) menuItemImpl.getSubMenu();
            if (z) {
                a.mo3732a((SubMenu) subMenuBuilder);
            }
            b |= m5235a(subMenuBuilder, iVar);
            if (!b) {
                mo4722b(true);
            }
        } else if ((i & 1) == 0) {
            mo4722b(true);
        }
        return b;
    }

    /* renamed from: a */
    public void mo1173a(boolean z) {
        if (!this.f4307u) {
            if (z) {
                this.f4302p = true;
                this.f4305s = true;
            }
            m5236c(z);
            return;
        }
        this.f4308v = true;
        if (z) {
            this.f4309w = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4703a(MenuItemImpl menuItemImpl) {
        this.f4302p = true;
        mo1173a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo4699a(CharSequence charSequence) {
        m5232a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo4697a(Drawable drawable) {
        m5232a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MenuBuilder mo4698a(View view) {
        m5232a(0, null, 0, null, view);
        return this;
    }

    public void close() {
        mo4722b(true);
    }

    /* renamed from: j */
    public final ArrayList<MenuItemImpl> mo4743j() {
        mo4741i();
        return this.f4303q;
    }

    /* renamed from: k */
    public final ArrayList<MenuItemImpl> mo4744k() {
        mo4741i();
        return this.f4304r;
    }

    public int size() {
        return this.f4300n.size();
    }

    public void clearHeader() {
        this.f4292e = null;
        this.f4291d = null;
        this.f4293f = null;
        mo1173a(false);
    }

    /* renamed from: e */
    public final void mo4734e() {
        if (this.f4299m != null) {
            this.f4299m.mo1345a(this);
        }
    }

    /* renamed from: f */
    public final void mo4735f() {
        if (!this.f4307u) {
            this.f4307u = true;
            this.f4308v = false;
            this.f4309w = false;
        }
    }

    /* renamed from: g */
    public final void mo4737g() {
        this.f4307u = false;
        if (this.f4308v) {
            this.f4308v = false;
            mo1173a(this.f4309w);
        }
    }

    /* renamed from: b */
    public boolean mo4723b() {
        return this.f4287A;
    }

    public void clear() {
        if (this.f4295h != null) {
            mo4733d(this.f4295h);
        }
        this.f4300n.clear();
        mo1173a(true);
    }

    /* renamed from: h */
    public final ArrayList<MenuItemImpl> mo4739h() {
        if (!this.f4302p) {
            return this.f4301o;
        }
        this.f4301o.clear();
        int size = this.f4300n.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i);
            if (menuItemImpl.isVisible()) {
                this.f4301o.add(menuItemImpl);
            }
        }
        this.f4302p = false;
        this.f4305s = true;
        return this.f4301o;
    }

    public boolean hasVisibleItems() {
        if (this.f4296i) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((MenuItemImpl) this.f4300n.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo4741i() {
        ArrayList h = mo4739h();
        if (this.f4305s) {
            Iterator it = this.f4312z.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1188i iVar = (C1188i) weakReference.get();
                if (iVar == null) {
                    this.f4312z.remove(weakReference);
                } else {
                    z |= iVar.mo1115a();
                }
            }
            if (z) {
                this.f4303q.clear();
                this.f4304r.clear();
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = (MenuItemImpl) h.get(i);
                    if (menuItemImpl.mo4783i()) {
                        this.f4303q.add(menuItemImpl);
                    } else {
                        this.f4304r.add(menuItemImpl);
                    }
                }
            } else {
                this.f4303q.clear();
                this.f4304r.clear();
                this.f4304r.addAll(mo4739h());
            }
            this.f4305s = false;
        }
    }

    /* renamed from: a */
    public final MenuBuilder mo4696a(int i) {
        this.f4306t = 1;
        return this;
    }

    /* renamed from: b */
    public final void mo4719b(Bundle bundle) {
        m5242f(bundle);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f4287A = z;
    }

    /* renamed from: e */
    private int m5239e(int i) {
        return m5228a(i, 0);
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4720b(MenuItemImpl menuItemImpl) {
        this.f4305s = true;
        mo1173a(true);
    }

    public void setQwertyMode(boolean z) {
        this.f4297k = z;
        mo1173a(false);
    }

    public MenuItem add(int i) {
        return mo1080a(0, 0, 0, this.f4289b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f4289b.getString(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final MenuBuilder mo4718b(int i) {
        m5232a(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final MenuBuilder mo4724c(int i) {
        m5232a(0, null, i, null, null);
        return this;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f4300n.get(i);
    }

    public void removeItem(int i) {
        m5233a(m5237d(i), true);
    }

    /* renamed from: d */
    private int m5237d(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((MenuItemImpl) this.f4300n.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: f */
    private static int m5241f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 < 0 || i2 >= f4286j.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (i & 65535) | (f4286j[i2] << 16);
    }

    /* renamed from: c */
    private void m5236c(boolean z) {
        if (!this.f4312z.isEmpty()) {
            mo4735f();
            Iterator it = this.f4312z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1188i iVar = (C1188i) weakReference.get();
                if (iVar == null) {
                    this.f4312z.remove(weakReference);
                } else {
                    iVar.mo1114a(z);
                }
            }
            mo4737g();
        }
    }

    /* renamed from: d */
    private void m5238d(boolean z) {
        boolean z2 = true;
        if (this.f4289b.getConfiguration().keyboard == 1 || !C0995v.m4260c(ViewConfiguration.get(this.f4288a), this.f4288a)) {
            z2 = false;
        }
        this.f4298l = z2;
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1080a(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public final void mo4721b(C1188i iVar) {
        Iterator it = this.f4312z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1188i iVar2 = (C1188i) weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f4312z.remove(weakReference);
            }
        }
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i2);
            if (menuItemImpl.getItemId() == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu()) {
                MenuItem findItem = menuItemImpl.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int e = m5239e(i);
        if (e >= 0) {
            int size = this.f4300n.size() - e;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((MenuItemImpl) this.f4300n.get(e)).getGroupId() != i) {
                    mo1173a(true);
                } else {
                    m5233a(e, false);
                    i2 = i3;
                }
            }
            mo1173a(true);
        }
    }

    public MenuBuilder(Context context) {
        this.f4288a = context;
        this.f4289b = context.getResources();
        this.f4300n = new ArrayList<>();
        this.f4301o = new ArrayList<>();
        this.f4302p = true;
        this.f4303q = new ArrayList<>();
        this.f4304r = new ArrayList<>();
        this.f4305s = true;
        m5238d(true);
    }

    /* renamed from: e */
    private void m5240e(Bundle bundle) {
        if (!this.f4312z.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f4312z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1188i iVar = (C1188i) weakReference.get();
                if (iVar == null) {
                    this.f4312z.remove(weakReference);
                } else {
                    int b = iVar.mo1118b();
                    if (b > 0) {
                        Parcelable c = iVar.mo1120c();
                        if (c != null) {
                            sparseArray.put(b, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: f */
    private void m5242f(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f4312z.isEmpty()) {
            Iterator it = this.f4312z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1188i iVar = (C1188i) weakReference.get();
                if (iVar == null) {
                    this.f4312z.remove(weakReference);
                } else {
                    int b = iVar.mo1118b();
                    if (b > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(b);
                        if (parcelable != null) {
                            iVar.mo1111a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo4722b(boolean z) {
        if (!this.f4310x) {
            this.f4310x = true;
            Iterator it = this.f4312z.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C1188i iVar = (C1188i) weakReference.get();
                if (iVar == null) {
                    this.f4312z.remove(weakReference);
                } else {
                    iVar.mo1112a(this, z);
                }
            }
            this.f4310x = false;
        }
    }

    /* renamed from: c */
    public final void mo4725c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).mo4725c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo4700a(), sparseArray);
        }
    }

    /* renamed from: d */
    public final void mo4731d(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo4700a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuBuilder) item.getSubMenu()).mo4731d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: c */
    public boolean mo4727c(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.f4312z.isEmpty()) {
            return false;
        }
        mo4735f();
        Iterator it = this.f4312z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1188i iVar = (C1188i) weakReference.get();
            if (iVar != null) {
                z = iVar.mo1116a(this, menuItemImpl);
                if (z) {
                    break;
                }
            } else {
                this.f4312z.remove(weakReference);
            }
        }
        mo4737g();
        if (z) {
            this.f4295h = menuItemImpl;
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo4733d(MenuItemImpl menuItemImpl) {
        boolean z = false;
        if (this.f4312z.isEmpty() || this.f4295h != menuItemImpl) {
            return false;
        }
        mo4735f();
        Iterator it = this.f4312z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1188i iVar = (C1188i) weakReference.get();
            if (iVar != null) {
                z = iVar.mo1119b(this, menuItemImpl);
                if (z) {
                    break;
                }
            } else {
                this.f4312z.remove(weakReference);
            }
        }
        mo4737g();
        if (z) {
            this.f4295h = null;
        }
        return z;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (m5231a(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo4708a(findItem(i), i2);
    }

    /* renamed from: a */
    private int m5228a(int i, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((MenuItemImpl) this.f4300n.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f4300n.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    /* renamed from: a */
    private static int m5229a(ArrayList<MenuItemImpl> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((MenuItemImpl) arrayList.get(size)).f4318a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f4300n.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i2);
            if (menuItemImpl.getGroupId() == i && menuItemImpl.mo4762c(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1173a(true);
        }
    }

    /* renamed from: a */
    private MenuItemImpl m5231a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<MenuItemImpl> arrayList = this.f4311y;
        arrayList.clear();
        m5234a((List<MenuItemImpl>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (MenuItemImpl) arrayList.get(0);
        }
        boolean c2 = mo4726c();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayList.get(i2);
            if (c2) {
                c = menuItemImpl.getAlphabeticShortcut();
            } else {
                c = menuItemImpl.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (c2 && c == 8 && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m5233a(int i, boolean z) {
        if (i >= 0 && i < this.f4300n.size()) {
            this.f4300n.remove(i);
            if (z) {
                mo1173a(true);
            }
        }
    }

    /* renamed from: a */
    private boolean m5235a(SubMenuBuilder subMenuBuilder, C1188i iVar) {
        boolean z = false;
        if (this.f4312z.isEmpty()) {
            return false;
        }
        if (iVar != null) {
            z = iVar.mo1117a(subMenuBuilder);
        }
        Iterator it = this.f4312z.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C1188i iVar2 = (C1188i) weakReference.get();
            if (iVar2 == null) {
                this.f4312z.remove(weakReference);
            } else if (!z) {
                z = iVar2.mo1117a(subMenuBuilder);
            }
        }
        return z;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        MenuItemImpl a = m5231a(i, keyEvent);
        if (a != null) {
            z = mo4708a((MenuItem) a, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            mo4722b(true);
        }
        return z;
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f4300n.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i2);
            if (menuItemImpl.getGroupId() == i) {
                menuItemImpl.mo4758a(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    /* renamed from: a */
    private void m5234a(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean z;
        boolean c2 = mo4726c();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f4300n.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) this.f4300n.get(i3);
                if (menuItemImpl.hasSubMenu()) {
                    ((MenuBuilder) menuItemImpl.getSubMenu()).m5234a(list, i, keyEvent);
                }
                if (c2) {
                    c = menuItemImpl.getAlphabeticShortcut();
                } else {
                    c = menuItemImpl.getNumericShortcut();
                }
                if (c2) {
                    i2 = menuItemImpl.getAlphabeticModifiers();
                } else {
                    i2 = menuItemImpl.getNumericModifiers();
                }
                if ((modifiers & 69647) == (i2 & 69647)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (c2 && c == 8 && i == 67)) && menuItemImpl.isEnabled())) {
                    list.add(menuItemImpl);
                }
            }
        }
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1080a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1080a(i, i2, i3, this.f4289b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f4289b.getString(i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) mo1080a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f4288a, this, menuItemImpl);
        menuItemImpl.mo4757a(subMenuBuilder);
        return subMenuBuilder;
    }

    /* renamed from: a */
    private void m5232a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f4289b;
        if (view != null) {
            this.f4293f = view;
            this.f4291d = null;
            this.f4292e = null;
        } else {
            if (i > 0) {
                this.f4291d = resources.getText(i);
            } else if (charSequence != null) {
                this.f4291d = charSequence;
            }
            if (i2 > 0) {
                this.f4292e = C0683b.m2903a(this.f4288a, i2);
            } else if (drawable != null) {
                this.f4292e = drawable;
            }
            this.f4293f = null;
        }
        mo1173a(false);
    }

    /* renamed from: a */
    private MenuItemImpl m5230a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i4, charSequence, i5);
        return menuItemImpl;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.f4288a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }
}
