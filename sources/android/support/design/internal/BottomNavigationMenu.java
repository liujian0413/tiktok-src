package android.support.design.internal;

import android.content.Context;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.view.MenuItem;
import android.view.SubMenu;

public final class BottomNavigationMenu extends MenuBuilder {
    public BottomNavigationMenu(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* renamed from: a */
    public final MenuItem mo1080a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo4735f();
            MenuItem a = super.mo1080a(i, i2, i3, charSequence);
            if (a instanceof MenuItemImpl) {
                ((MenuItemImpl) a).mo4758a(true);
            }
            mo4737g();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }
}
