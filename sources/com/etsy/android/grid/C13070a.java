package com.etsy.android.grid;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import com.etsy.android.grid.ExtendableListView.C13060d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.etsy.android.grid.a */
public final class C13070a implements Filterable, WrapperListAdapter {

    /* renamed from: c */
    static final ArrayList<C13060d> f34602c = new ArrayList<>();

    /* renamed from: a */
    ArrayList<C13060d> f34603a;

    /* renamed from: b */
    ArrayList<C13060d> f34604b;

    /* renamed from: d */
    boolean f34605d;

    /* renamed from: e */
    private final ListAdapter f34606e;

    /* renamed from: f */
    private final boolean f34607f;

    public final ListAdapter getWrappedAdapter() {
        return this.f34606e;
    }

    /* renamed from: a */
    private int m38212a() {
        return this.f34603a.size();
    }

    /* renamed from: b */
    private int m38214b() {
        return this.f34604b.size();
    }

    public final Filter getFilter() {
        if (this.f34607f) {
            return ((Filterable) this.f34606e).getFilter();
        }
        return null;
    }

    public final int getViewTypeCount() {
        if (this.f34606e != null) {
            return this.f34606e.getViewTypeCount();
        }
        return 1;
    }

    public final boolean hasStableIds() {
        if (this.f34606e != null) {
            return this.f34606e.hasStableIds();
        }
        return false;
    }

    public final boolean areAllItemsEnabled() {
        if (this.f34606e == null) {
            return true;
        }
        if (!this.f34605d || !this.f34606e.areAllItemsEnabled()) {
            return false;
        }
        return true;
    }

    public final int getCount() {
        if (this.f34606e != null) {
            return m38214b() + m38212a() + this.f34606e.getCount();
        }
        return m38214b() + m38212a();
    }

    public final boolean isEmpty() {
        if (this.f34606e == null || this.f34606e.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f34606e != null) {
            this.f34606e.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f34606e != null) {
            this.f34606e.unregisterDataSetObserver(dataSetObserver);
        }
    }

    /* renamed from: a */
    private static boolean m38213a(ArrayList<C13060d> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C13060d) it.next()).f34560c) {
                    return false;
                }
            }
        }
        return true;
    }

    public final long getItemId(int i) {
        int a = m38212a();
        if (this.f34606e != null && i >= a) {
            int i2 = i - a;
            if (i2 < this.f34606e.getCount()) {
                return this.f34606e.getItemId(i2);
            }
        }
        return -1;
    }

    public final int getItemViewType(int i) {
        int a = m38212a();
        if (this.f34606e != null && i >= a) {
            int i2 = i - a;
            if (i2 < this.f34606e.getCount()) {
                return this.f34606e.getItemViewType(i2);
            }
        }
        return -2;
    }

    public final Object getItem(int i) {
        int a = m38212a();
        if (i < a) {
            return ((C13060d) this.f34603a.get(i)).f34559b;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f34606e != null) {
            i3 = this.f34606e.getCount();
            if (i2 < i3) {
                return this.f34606e.getItem(i2);
            }
        }
        return ((C13060d) this.f34604b.get(i2 - i3)).f34559b;
    }

    public final boolean isEnabled(int i) {
        int a = m38212a();
        if (i < a) {
            return ((C13060d) this.f34603a.get(i)).f34560c;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f34606e != null) {
            i3 = this.f34606e.getCount();
            if (i2 < i3) {
                return this.f34606e.isEnabled(i2);
            }
        }
        return ((C13060d) this.f34604b.get(i2 - i3)).f34560c;
    }

    public C13070a(ArrayList<C13060d> arrayList, ArrayList<C13060d> arrayList2, ListAdapter listAdapter) {
        boolean z;
        this.f34606e = listAdapter;
        this.f34607f = listAdapter instanceof Filterable;
        if (arrayList == null) {
            this.f34603a = f34602c;
        } else {
            this.f34603a = arrayList;
        }
        if (arrayList2 == null) {
            this.f34604b = f34602c;
        } else {
            this.f34604b = arrayList2;
        }
        if (!m38213a(this.f34603a) || !m38213a(this.f34604b)) {
            z = false;
        } else {
            z = true;
        }
        this.f34605d = z;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int a = m38212a();
        if (i < a) {
            return ((C13060d) this.f34603a.get(i)).f34558a;
        }
        int i2 = i - a;
        int i3 = 0;
        if (this.f34606e != null) {
            i3 = this.f34606e.getCount();
            if (i2 < i3) {
                return this.f34606e.getView(i2, view, viewGroup);
            }
        }
        return ((C13060d) this.f34604b.get(i2 - i3)).f34558a;
    }
}
