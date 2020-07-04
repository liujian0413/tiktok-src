package android.support.p029v7.view.menu;

import android.support.p029v7.view.menu.C1190j.C1191a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.d */
public final class C1181d extends BaseAdapter {

    /* renamed from: a */
    public MenuBuilder f4394a;

    /* renamed from: b */
    public boolean f4395b;

    /* renamed from: c */
    private int f4396c = -1;

    /* renamed from: d */
    private final boolean f4397d;

    /* renamed from: e */
    private final LayoutInflater f4398e;

    /* renamed from: f */
    private final int f4399f;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final void notifyDataSetChanged() {
        m5364a();
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m5364a() {
        MenuItemImpl menuItemImpl = this.f4394a.f4295h;
        if (menuItemImpl != null) {
            ArrayList k = this.f4394a.mo4744k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) k.get(i)) == menuItemImpl) {
                    this.f4396c = i;
                    return;
                }
            }
        }
        this.f4396c = -1;
    }

    public final int getCount() {
        ArrayList arrayList;
        if (this.f4397d) {
            arrayList = this.f4394a.mo4744k();
        } else {
            arrayList = this.f4394a.mo4739h();
        }
        if (this.f4396c < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    /* renamed from: a */
    public final MenuItemImpl getItem(int i) {
        ArrayList arrayList;
        if (this.f4397d) {
            arrayList = this.f4394a.mo4744k();
        } else {
            arrayList = this.f4394a.mo4739h();
        }
        if (this.f4396c >= 0 && i >= this.f4396c) {
            i++;
        }
        return (MenuItemImpl) arrayList.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f4398e.inflate(this.f4399f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (!this.f4394a.mo4723b() || groupId == i2) {
            z = false;
        } else {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        C1191a aVar = (C1191a) view;
        if (this.f4395b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1060a(getItem(i), 0);
        return view;
    }

    public C1181d(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f4397d = z;
        this.f4398e = layoutInflater;
        this.f4394a = menuBuilder;
        this.f4399f = i;
        m5364a();
    }
}
