package android.support.p029v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.internal.view.SupportSubMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.o */
final class C1198o extends C1193l implements SubMenu {
    /* renamed from: b */
    private SupportSubMenu m5441b() {
        return (SupportSubMenu) this.f4356b;
    }

    public final void clearHeader() {
        m5441b().clearHeader();
    }

    public final MenuItem getItem() {
        return mo4879a(m5441b().getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        m5441b().setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        m5441b().setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        m5441b().setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        m5441b().setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        m5441b().setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        m5441b().setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        m5441b().setIcon(drawable);
        return this;
    }

    C1198o(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
    }
}
