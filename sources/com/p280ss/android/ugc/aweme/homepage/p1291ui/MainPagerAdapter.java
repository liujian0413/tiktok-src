package com.p280ss.android.ugc.aweme.homepage.p1291ui;

import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p308ui.AntiPreloadFgmPagerAdapter;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a.C30272a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import java.lang.ref.WeakReference;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.MainPagerAdapter */
public final class MainPagerAdapter extends AntiPreloadFgmPagerAdapter {

    /* renamed from: c */
    public boolean f79618c;

    /* renamed from: d */
    private final String[] f79619d;

    /* renamed from: e */
    private int[] f79620e;

    /* renamed from: f */
    private String[] f79621f;

    /* renamed from: g */
    private SparseArray<Fragment> f79622g = new SparseArray<>();

    /* renamed from: h */
    private final AbsFragment f79623h;

    /* renamed from: i */
    private WeakReference<Fragment> f79624i;

    /* renamed from: j */
    private final C30272a f79625j;

    /* renamed from: a */
    public final Fragment mo79773a() {
        if (this.f79624i == null) {
            return null;
        }
        WeakReference<Fragment> weakReference = this.f79624i;
        if (weakReference == null) {
            C7573i.m23580a();
        }
        return (Fragment) weakReference.get();
    }

    public final int getCount() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getCount(this.f79619d.length);
    }

    public final CharSequence getPageTitle(int i) {
        return this.f79619d[i];
    }

    /* renamed from: b */
    public final Fragment mo79774b(int i) {
        Object obj = this.f79622g.get(i);
        C7573i.m23582a(obj, "mFragments.get(position)");
        return (Fragment) obj;
    }

    /* renamed from: d */
    public final boolean mo79776d(int i) {
        if (mo79775c(i) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo79775c(int i) {
        if (i >= 0) {
            int[] iArr = this.f79620e;
            if (iArr == null) {
                C7573i.m23580a();
            }
            if (i < iArr.length) {
                int[] iArr2 = this.f79620e;
                if (iArr2 == null) {
                    C7573i.m23580a();
                }
                return iArr2[i];
            }
        }
        return -1;
    }

    public final int getItemPosition(Object obj) {
        C7573i.m23587b(obj, "item");
        int itemPosition = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getItemPosition(obj);
        if (itemPosition == 0) {
            return super.getItemPosition(obj);
        }
        return itemPosition;
    }

    /* renamed from: a */
    public final Fragment mo60871a(int i) {
        HomePageUIFrameService homePageUIFrameService = (HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class);
        AbsFragment absFragment = this.f79623h;
        int[] iArr = this.f79620e;
        if (iArr == null) {
            C7573i.m23580a();
        }
        int i2 = iArr[i];
        String[] strArr = this.f79621f;
        if (strArr == null) {
            C7573i.m23580a();
        }
        return homePageUIFrameService.getItemForPagerInMainFragment(absFragment, i2, strArr[i]);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "container");
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C7573i.m23582a(instantiateItem, "super.instantiateItem(container, position)");
        SparseArray<Fragment> sparseArray = this.f79622g;
        if (instantiateItem != null) {
            sparseArray.put(i, (Fragment) instantiateItem);
            C30272a aVar = this.f79625j;
            if (aVar != null) {
                aVar.mo79779a(this.f79622g);
            }
            return instantiateItem;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.Fragment");
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "item");
        super.destroyItem(viewGroup, i, obj);
        if (obj instanceof Fragment) {
            try {
                if (this.f61628b != null) {
                    this.f61628b.mo2587a((Fragment) obj);
                }
                this.f79622g.remove(i);
                C30272a aVar = this.f79625j;
                if (aVar != null) {
                    aVar.mo79779a(this.f79622g);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment;
        C7573i.m23587b(viewGroup, "container");
        C7573i.m23587b(obj, "item");
        super.setPrimaryItem(viewGroup, i, obj);
        if (this.f79624i != null) {
            WeakReference<Fragment> weakReference = this.f79624i;
            if (weakReference == null) {
                C7573i.m23580a();
            }
            fragment = (Fragment) weakReference.get();
        } else {
            fragment = null;
        }
        if (fragment != obj) {
            this.f79624i = new WeakReference<>((Fragment) obj);
            C30272a aVar = this.f79625j;
            if (aVar != null) {
                aVar.mo79780a(this.f79624i);
            }
        }
    }

    public MainPagerAdapter(AbsFragment absFragment, Context context, C0608j jVar, C30272a aVar) {
        boolean z;
        C7573i.m23587b(absFragment, "mainFragment");
        C7573i.m23587b(jVar, "fm");
        super(jVar);
        this.f79625j = aVar;
        this.f79623h = absFragment;
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl showTimeLineTab = inst.getShowTimeLineTab();
        C7573i.m23582a((Object) showTimeLineTab, "SharePrefCache.inst().showTimeLineTab");
        Object d = showTimeLineTab.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().showTimeLineTab.cache");
        if (!((Boolean) d).booleanValue() || C33003b.m106651a()) {
            z = false;
        } else {
            z = true;
        }
        this.f79618c = z;
        Triple contentForMainFragment = ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getContentForMainFragment(context);
        this.f79619d = (String[]) contentForMainFragment.getFirst();
        this.f79620e = (int[]) contentForMainFragment.getSecond();
        this.f79621f = (String[]) contentForMainFragment.getThird();
        C30272a aVar2 = this.f79625j;
        if (aVar2 != null) {
            aVar2.mo79779a(this.f79622g);
        }
    }
}
