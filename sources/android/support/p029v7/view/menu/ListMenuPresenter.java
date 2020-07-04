package android.support.p029v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.p029v7.view.menu.C1188i.C1189a;
import android.support.p029v7.view.menu.C1190j.C1191a;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: android.support.v7.view.menu.ListMenuPresenter */
public class ListMenuPresenter implements C1188i, OnItemClickListener {

    /* renamed from: a */
    Context f4274a;

    /* renamed from: b */
    LayoutInflater f4275b;

    /* renamed from: c */
    MenuBuilder f4276c;

    /* renamed from: d */
    ExpandedMenuView f4277d;

    /* renamed from: e */
    public int f4278e;

    /* renamed from: f */
    int f4279f;

    /* renamed from: g */
    int f4280g;

    /* renamed from: h */
    C1165a f4281h;

    /* renamed from: i */
    public int f4282i;

    /* renamed from: j */
    private C1189a f4283j;

    /* renamed from: android.support.v7.view.menu.ListMenuPresenter$a */
    class C1165a extends BaseAdapter {

        /* renamed from: b */
        private int f4285b = -1;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final void notifyDataSetChanged() {
            m5226a();
            super.notifyDataSetChanged();
        }

        public final int getCount() {
            int size = ListMenuPresenter.this.f4276c.mo4744k().size() - ListMenuPresenter.this.f4278e;
            if (this.f4285b < 0) {
                return size;
            }
            return size - 1;
        }

        /* renamed from: a */
        private void m5226a() {
            MenuItemImpl menuItemImpl = ListMenuPresenter.this.f4276c.f4295h;
            if (menuItemImpl != null) {
                ArrayList k = ListMenuPresenter.this.f4276c.mo4744k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (((MenuItemImpl) k.get(i)) == menuItemImpl) {
                        this.f4285b = i;
                        return;
                    }
                }
            }
            this.f4285b = -1;
        }

        public C1165a() {
            m5226a();
        }

        /* renamed from: a */
        public final MenuItemImpl getItem(int i) {
            ArrayList k = ListMenuPresenter.this.f4276c.mo4744k();
            int i2 = i + ListMenuPresenter.this.f4278e;
            if (this.f4285b >= 0 && i2 >= this.f4285b) {
                i2++;
            }
            return (MenuItemImpl) k.get(i2);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.f4275b.inflate(ListMenuPresenter.this.f4280g, viewGroup, false);
            }
            ((C1191a) view).mo1060a(getItem(i), 0);
            return view;
        }
    }

    /* renamed from: a */
    public final boolean mo1115a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo1116a(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: b */
    public final int mo1118b() {
        return this.f4282i;
    }

    /* renamed from: b */
    public final boolean mo1119b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    /* renamed from: c */
    public final Parcelable mo1120c() {
        if (this.f4277d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m5211a(bundle);
        return bundle;
    }

    /* renamed from: d */
    public final ListAdapter mo4688d() {
        if (this.f4281h == null) {
            this.f4281h = new C1165a();
        }
        return this.f4281h;
    }

    /* renamed from: a */
    public final void mo1113a(C1189a aVar) {
        this.f4283j = aVar;
    }

    /* renamed from: a */
    public final void mo1111a(Parcelable parcelable) {
        m5212b((Bundle) parcelable);
    }

    /* renamed from: b */
    private void m5212b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f4277d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    private void m5211a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.f4277d != null) {
            this.f4277d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: a */
    public final C1190j mo4687a(ViewGroup viewGroup) {
        if (this.f4277d == null) {
            this.f4277d = (ExpandedMenuView) this.f4275b.inflate(R.layout.n, viewGroup, false);
            if (this.f4281h == null) {
                this.f4281h = new C1165a();
            }
            this.f4277d.setAdapter(this.f4281h);
            this.f4277d.setOnItemClickListener(this);
        }
        return this.f4277d;
    }

    /* renamed from: a */
    public final void mo1114a(boolean z) {
        if (this.f4281h != null) {
            this.f4281h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final boolean mo1117a(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        new C1182e(subMenuBuilder).mo4912a((IBinder) null);
        if (this.f4283j != null) {
            this.f4283j.mo4339a(subMenuBuilder);
        }
        return true;
    }

    private ListMenuPresenter(int i, int i2) {
        this.f4280g = i;
        this.f4279f = 0;
    }

    /* renamed from: a */
    public final void mo1112a(MenuBuilder menuBuilder, boolean z) {
        if (this.f4283j != null) {
            this.f4283j.mo4338a(menuBuilder, z);
        }
    }

    public ListMenuPresenter(Context context, int i) {
        this((int) R.layout.q, 0);
        this.f4274a = context;
        this.f4275b = LayoutInflater.from(this.f4274a);
    }

    /* renamed from: a */
    public final void mo1110a(Context context, MenuBuilder menuBuilder) {
        if (this.f4279f != 0) {
            this.f4274a = new ContextThemeWrapper(context, this.f4279f);
            this.f4275b = LayoutInflater.from(this.f4274a);
        } else if (this.f4274a != null) {
            this.f4274a = context;
            if (this.f4275b == null) {
                this.f4275b = LayoutInflater.from(this.f4274a);
            }
        }
        this.f4276c = menuBuilder;
        if (this.f4281h != null) {
            this.f4281h.notifyDataSetChanged();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4276c.mo4709a((MenuItem) this.f4281h.getItem(i), (C1188i) this, 0);
    }
}
