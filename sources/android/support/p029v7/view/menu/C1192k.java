package android.support.p029v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.internal.view.C0745a;
import android.support.p022v4.internal.view.C0746b;
import android.support.p022v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: android.support.v7.view.menu.k */
public final class C1192k {
    /* renamed from: a */
    public static Menu m5416a(Context context, C0745a aVar) {
        return new C1193l(context, aVar);
    }

    /* renamed from: a */
    public static SubMenu m5418a(Context context, SupportSubMenu supportSubMenu) {
        return new C1198o(context, supportSubMenu);
    }

    /* renamed from: a */
    public static MenuItem m5417a(Context context, C0746b bVar) {
        if (VERSION.SDK_INT >= 16) {
            return new C1183f(context, bVar);
        }
        return new MenuItemWrapperICS(context, bVar);
    }
}
