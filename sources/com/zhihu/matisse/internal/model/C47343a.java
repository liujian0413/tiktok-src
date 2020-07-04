package com.zhihu.matisse.internal.model;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.zhihu.matisse.R;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p1855a.C47329c;
import com.zhihu.matisse.internal.p1855a.C47330d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.zhihu.matisse.internal.model.a */
public final class C47343a {

    /* renamed from: a */
    public int f121483a;

    /* renamed from: b */
    private final Context f121484b;

    /* renamed from: c */
    private Set<Item> f121485c;

    /* renamed from: b */
    public final List<Item> mo119384b() {
        return new ArrayList(this.f121485c);
    }

    /* renamed from: f */
    public final int mo119393f() {
        return this.f121485c.size();
    }

    /* renamed from: e */
    public final boolean mo119392e() {
        if (this.f121485c.size() == m147844g()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private int m147844g() {
        C47338d a = C47338d.m147803a();
        if (a.f121451g > 0) {
            return a.f121451g;
        }
        if (this.f121483a == 1) {
            return a.f121452h;
        }
        if (this.f121483a == 2) {
            return a.f121453i;
        }
        return a.f121451g;
    }

    /* renamed from: a */
    public final Bundle mo119380a() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f121485c));
        bundle.putInt("state_collection_type", this.f121483a);
        return bundle;
    }

    /* renamed from: c */
    public final List<Uri> mo119387c() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f121485c) {
            arrayList.add(item.f121436c);
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m147845h() {
        boolean z = false;
        boolean z2 = false;
        for (Item item : this.f121485c) {
            if (item.mo119354b() && !z) {
                z = true;
            }
            if (item.mo119356d() && !z2) {
                z2 = true;
            }
        }
        if (z && z2) {
            this.f121483a = 3;
        } else if (z) {
            this.f121483a = 1;
        } else {
            if (z2) {
                this.f121483a = 2;
            }
        }
    }

    /* renamed from: d */
    public final List<String> mo119390d() {
        ArrayList arrayList = new ArrayList();
        for (Item item : this.f121485c) {
            arrayList.add(C47329c.m147772a(this.f121484b, item.f121436c));
        }
        return arrayList;
    }

    public C47343a(Context context) {
        this.f121484b = context;
    }

    /* renamed from: c */
    public final boolean mo119388c(Item item) {
        return this.f121485c.contains(item);
    }

    /* renamed from: b */
    public final void mo119385b(Bundle bundle) {
        bundle.putParcelableArrayList("state_selection", new ArrayList(this.f121485c));
        bundle.putInt("state_collection_type", this.f121483a);
    }

    /* renamed from: e */
    public final int mo119391e(Item item) {
        int indexOf = new ArrayList(this.f121485c).indexOf(item);
        if (indexOf == -1) {
            return Integer.MIN_VALUE;
        }
        return indexOf + 1;
    }

    /* renamed from: f */
    private boolean m147843f(Item item) {
        if (!C47338d.m147803a().f121446b || ((!item.mo119354b() || (this.f121483a != 2 && this.f121483a != 3)) && (!item.mo119356d() || (this.f121483a != 1 && this.f121483a != 3)))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo119381a(Bundle bundle) {
        if (bundle == null) {
            this.f121485c = new LinkedHashSet();
            return;
        }
        this.f121485c = new LinkedHashSet(bundle.getParcelableArrayList("state_selection"));
        this.f121483a = bundle.getInt("state_collection_type", 0);
    }

    /* renamed from: b */
    public final boolean mo119386b(Item item) {
        boolean remove = this.f121485c.remove(item);
        if (remove) {
            if (this.f121485c.size() == 0) {
                this.f121483a = 0;
            } else if (this.f121483a == 3) {
                m147845h();
            }
        }
        return remove;
    }

    /* renamed from: d */
    public final C47336b mo119389d(Item item) {
        String str;
        if (mo119392e()) {
            int g = m147844g();
            try {
                str = this.f121484b.getResources().getQuantityString(R.plurals.matisse_error_over_count, g, new Object[]{Integer.valueOf(g)});
            } catch (NotFoundException unused) {
                str = this.f121484b.getString(com.zhiliaoapp.musically.df_live_zego_link.R.string.c8d, new Object[]{Integer.valueOf(g)});
            } catch (NoClassDefFoundError unused2) {
                str = this.f121484b.getString(com.zhiliaoapp.musically.df_live_zego_link.R.string.c8d, new Object[]{Integer.valueOf(g)});
            }
            return new C47336b(str);
        } else if (m147843f(item)) {
            return new C47336b(this.f121484b.getString(com.zhiliaoapp.musically.df_live_zego_link.R.string.c8i));
        } else {
            return C47330d.m147779a(this.f121484b, item);
        }
    }

    /* renamed from: a */
    public final boolean mo119383a(Item item) {
        if (!m147843f(item)) {
            boolean add = this.f121485c.add(item);
            if (add) {
                if (this.f121483a == 0) {
                    if (item.mo119354b()) {
                        this.f121483a = 1;
                    } else if (item.mo119356d()) {
                        this.f121483a = 2;
                    }
                } else if (this.f121483a == 1) {
                    if (item.mo119356d()) {
                        this.f121483a = 3;
                    }
                } else if (this.f121483a == 2 && item.mo119354b()) {
                    this.f121483a = 3;
                }
            }
            return add;
        }
        throw new IllegalArgumentException("Can't select images and videos at the same time.");
    }

    /* renamed from: a */
    public final void mo119382a(ArrayList<Item> arrayList, int i) {
        if (arrayList.size() == 0) {
            this.f121483a = 0;
        } else {
            this.f121483a = i;
        }
        this.f121485c.clear();
        this.f121485c.addAll(arrayList);
    }
}
