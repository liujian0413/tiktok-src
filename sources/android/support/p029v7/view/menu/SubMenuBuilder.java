package android.support.p029v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p029v7.view.menu.MenuBuilder.C1166a;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.SubMenuBuilder */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* renamed from: j */
    public MenuBuilder f4351j;

    /* renamed from: k */
    private MenuItemImpl f4352k;

    public MenuItem getItem() {
        return this.f4352k;
    }

    /* renamed from: b */
    public final boolean mo4723b() {
        return this.f4351j.mo4723b();
    }

    /* renamed from: c */
    public final boolean mo4726c() {
        return this.f4351j.mo4726c();
    }

    /* renamed from: d */
    public final boolean mo4732d() {
        return this.f4351j.mo4732d();
    }

    /* renamed from: l */
    public final MenuBuilder mo4745l() {
        return this.f4351j.mo4745l();
    }

    /* renamed from: a */
    public final String mo4700a() {
        int i;
        if (this.f4352k != null) {
            i = this.f4352k.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo4700a());
        sb.append(":");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo4702a(C1166a aVar) {
        this.f4351j.mo4702a(aVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f4351j.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo4724c(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo4718b(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo4698a(view);
    }

    public SubMenu setIcon(int i) {
        this.f4352k.setIcon(i);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f4351j.setQwertyMode(z);
    }

    /* renamed from: c */
    public final boolean mo4727c(MenuItemImpl menuItemImpl) {
        return this.f4351j.mo4727c(menuItemImpl);
    }

    /* renamed from: d */
    public final boolean mo4733d(MenuItemImpl menuItemImpl) {
        return this.f4351j.mo4733d(menuItemImpl);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo4697a(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo4699a(charSequence);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f4352k.setIcon(drawable);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo4707a(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (super.mo4707a(menuBuilder, menuItem) || this.f4351j.mo4707a(menuBuilder, menuItem)) {
            return true;
        }
        return false;
    }

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f4351j = menuBuilder;
        this.f4352k = menuItemImpl;
    }
}
