package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.view.menu.C1181d;
import android.support.p029v7.view.menu.ListMenuItemView;
import android.support.p029v7.view.menu.MenuBuilder;
import android.support.p029v7.view.menu.MenuItemImpl;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.MenuPopupWindow */
public class MenuPopupWindow extends ListPopupWindow implements C1340af {

    /* renamed from: b */
    private static Method f4835b;

    /* renamed from: a */
    public C1340af f4836a;

    /* renamed from: android.support.v7.widget.MenuPopupWindow$MenuDropDownListView */
    public static class MenuDropDownListView extends C1434x {

        /* renamed from: c */
        final int f4837c;

        /* renamed from: d */
        final int f4838d;

        /* renamed from: e */
        private C1340af f4839e;

        /* renamed from: f */
        private MenuItem f4840f;

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void setHoverListener(C1340af afVar) {
            this.f4839e = afVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C1181d dVar;
            if (this.f4839e != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    dVar = (C1181d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    dVar = (C1181d) adapter;
                }
                MenuItemImpl menuItemImpl = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < dVar.getCount()) {
                            menuItemImpl = dVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f4840f;
                if (menuItem != menuItemImpl) {
                    MenuBuilder menuBuilder = dVar.f4394a;
                    if (menuItem != null) {
                        this.f4839e.mo4902a(menuBuilder, menuItem);
                    }
                    this.f4840f = menuItemImpl;
                    if (menuItemImpl != null) {
                        this.f4839e.mo4903b(menuBuilder, menuItemImpl);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo5507a(MotionEvent motionEvent, int i) {
            return super.mo5507a(motionEvent, i);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f4837c = 22;
                this.f4838d = 21;
                return;
            }
            this.f4837c = 21;
            this.f4838d = 22;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f4837c) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f4838d) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C1181d) getAdapter()).f4394a.mo4722b(false);
                return true;
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo5506a(int i, int i2, int i3, int i4, int i5) {
            return super.mo5506a(i, i2, i3, i4, i5);
        }
    }

    static {
        try {
            f4835b = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
    }

    /* renamed from: b */
    public final void mo5504b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f4822v.setExitTransition(null);
        }
    }

    /* renamed from: c */
    public final void mo5505c(boolean z) {
        if (f4835b != null) {
            try {
                f4835b.invoke(this.f4822v, new Object[]{Boolean.valueOf(false)});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo5503a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f4822v.setEnterTransition(null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1434x mo5477a(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    /* renamed from: b */
    public final void mo4903b(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (this.f4836a != null) {
            this.f4836a.mo4903b(menuBuilder, menuItem);
        }
    }

    /* renamed from: a */
    public final void mo4902a(MenuBuilder menuBuilder, MenuItem menuItem) {
        if (this.f4836a != null) {
            this.f4836a.mo4902a(menuBuilder, menuItem);
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }
}
