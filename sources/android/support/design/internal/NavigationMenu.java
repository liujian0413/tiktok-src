package android.support.design.internal;

import android.content.Context;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.support.p029v7.view.menu.SubMenuBuilder;
import android.view.SubMenu;

public class NavigationMenu extends MenuBuilder {
    public NavigationMenu(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) mo1080a(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(this.f4288a, this, menuItemImpl);
        menuItemImpl.mo4757a((SubMenuBuilder) navigationSubMenu);
        return navigationSubMenu;
    }
}
