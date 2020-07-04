package android.support.p029v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: android.support.v7.view.menu.g */
abstract class C1185g implements C1188i, C1194m, OnItemClickListener {

    /* renamed from: g */
    public Rect f4406g;

    C1185g() {
    }

    /* renamed from: a */
    public abstract void mo4884a(int i);

    /* renamed from: a */
    public final void mo1110a(Context context, MenuBuilder menuBuilder) {
    }

    /* renamed from: a */
    public abstract void mo4885a(MenuBuilder menuBuilder);

    /* renamed from: a */
    public abstract void mo4886a(View view);

    /* renamed from: a */
    public abstract void mo4887a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public final boolean mo1116a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: b */
    public final int mo1118b() {
        return 0;
    }

    /* renamed from: b */
    public abstract void mo4888b(int i);

    /* renamed from: b */
    public abstract void mo4889b(boolean z);

    /* renamed from: b */
    public final boolean mo1119b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo4890c(int i);

    /* renamed from: c */
    public abstract void mo4891c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo4896g() {
        return true;
    }

    /* renamed from: a */
    protected static C1181d m5375a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C1181d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C1181d) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m5376b(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        MenuBuilder menuBuilder = m5375a(listAdapter).f4394a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo4896g()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        menuBuilder.mo4709a(menuItem, (C1188i) this, i2);
    }

    /* renamed from: a */
    protected static int m5374a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i3) {
                i3 = measuredWidth;
            }
        }
        return i3;
    }
}
