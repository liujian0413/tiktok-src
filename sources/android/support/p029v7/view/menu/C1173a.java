package android.support.p029v7.view.menu;

import android.content.Context;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.internal.view.SupportSubMenu;
import android.support.p022v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.a */
abstract class C1173a<T> extends C1174b<T> {

    /* renamed from: a */
    final Context f4353a;

    /* renamed from: c */
    private Map<C0746b, MenuItem> f4354c;

    /* renamed from: d */
    private Map<SupportSubMenu, SubMenu> f4355d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4881a() {
        if (this.f4354c != null) {
            this.f4354c.clear();
        }
        if (this.f4355d != null) {
            this.f4355d.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo4879a(MenuItem menuItem) {
        if (!(menuItem instanceof C0746b)) {
            return menuItem;
        }
        C0746b bVar = (C0746b) menuItem;
        if (this.f4354c == null) {
            this.f4354c = new ArrayMap();
        }
        MenuItem menuItem2 = (MenuItem) this.f4354c.get(menuItem);
        if (menuItem2 == null) {
            menuItem2 = C1192k.m5417a(this.f4353a, bVar);
            this.f4354c.put(bVar, menuItem2);
        }
        return menuItem2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4883b(int i) {
        if (this.f4354c != null) {
            Iterator it = this.f4354c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo4880a(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f4355d == null) {
            this.f4355d = new ArrayMap();
        }
        SubMenu subMenu2 = (SubMenu) this.f4355d.get(supportSubMenu);
        if (subMenu2 == null) {
            subMenu2 = C1192k.m5418a(this.f4353a, supportSubMenu);
            this.f4355d.put(supportSubMenu, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4882a(int i) {
        if (this.f4354c != null) {
            Iterator it = this.f4354c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    C1173a(Context context, T t) {
        super(t);
        this.f4353a = context;
    }
}
