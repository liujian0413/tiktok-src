package com.p280ss.android.ugc.aweme.base.p308ui;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SwitchFragmentPagerAdapter */
public class SwitchFragmentPagerAdapter extends FragmentPagerRebuildAdapter<CommonPageFragment> {

    /* renamed from: b */
    public List<C23465e> f61824b;

    /* renamed from: c */
    HashMap<String, C23465e> f61825c;

    /* renamed from: d */
    public C0608j f61826d;

    /* renamed from: e */
    public C23437b f61827e;

    /* renamed from: f */
    public C23438c f61828f;

    /* renamed from: g */
    private List<C23465e> f61829g;

    /* renamed from: h */
    private int f61830h;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.SwitchFragmentPagerAdapter$a */
    public static class C23435a {

        /* renamed from: a */
        List<C23465e> f61831a = new ArrayList();

        /* renamed from: b */
        public C23437b f61832b;

        /* renamed from: a */
        private int m76904a() {
            if (C6307b.m19566a((Collection<T>) this.f61831a)) {
                return 0;
            }
            Collections.sort(this.f61831a, new Comparator<C23465e>() {
                /* renamed from: a */
                private static int m76911a(C23465e eVar, C23465e eVar2) {
                    return eVar.f61929e - eVar2.f61929e;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m76911a((C23465e) obj, (C23465e) obj2);
                }
            });
            int i = 1;
            for (int i2 = 1; i2 < this.f61831a.size(); i2++) {
                if (((C23465e) this.f61831a.get(i2 - 1)).f61929e != ((C23465e) this.f61831a.get(i2)).f61929e) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: a */
        private static int m76905a(List<C23465e> list) {
            if (C6307b.m19566a((Collection<T>) list)) {
                return 0;
            }
            HashSet hashSet = new HashSet();
            for (C23465e eVar : list) {
                if (eVar != null) {
                    hashSet.add(Integer.valueOf(eVar.f61929e));
                }
            }
            return hashSet.size();
        }

        /* renamed from: a */
        public final SwitchFragmentPagerAdapter mo61042a(C0608j jVar) {
            SwitchFragmentPagerAdapter switchFragmentPagerAdapter = new SwitchFragmentPagerAdapter(jVar, m76905a(this.f61831a));
            switchFragmentPagerAdapter.f61827e = this.f61832b;
            switchFragmentPagerAdapter.mo61036a(this.f61831a);
            return switchFragmentPagerAdapter;
        }

        /* renamed from: a */
        public final C23435a mo61038a(Class<? extends CommonPageFragment> cls, String str) {
            return mo61041a(cls, str, null);
        }

        /* renamed from: a */
        public final C23435a mo61041a(Class<? extends CommonPageFragment> cls, String str, Bundle bundle) {
            return mo61040a(cls, str, m76904a(), 1.0f, bundle);
        }

        /* renamed from: a */
        public final C23435a mo61039a(Class<? extends CommonPageFragment> cls, String str, int i, float f) {
            return mo61040a(cls, str, i, f, null);
        }

        /* renamed from: a */
        public final C23435a mo61040a(Class<? extends CommonPageFragment> cls, String str, int i, float f, Bundle bundle) {
            if (cls != null || !C7163a.m22363a()) {
                List<C23465e> list = this.f61831a;
                C23465e eVar = new C23465e(cls, str, i, f, bundle);
                list.add(eVar);
                return this;
            }
            throw new RuntimeException("can not add a null fragment @jiangkun");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.SwitchFragmentPagerAdapter$b */
    public interface C23437b {
        /* renamed from: a */
        void mo61044a(HashMap<Integer, CommonPageFragment> hashMap);

        /* renamed from: a */
        void mo61045a(List<C23465e> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.SwitchFragmentPagerAdapter$c */
    public interface C23438c {
        /* renamed from: a */
        void mo61046a(CommonPageFragment commonPageFragment, int i);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    /* renamed from: a */
    private int m76891a() {
        if (C6307b.m19566a((Collection<T>) this.f61824b)) {
            return 0;
        }
        this.f61825c = new HashMap<>(this.f61824b.size());
        this.f61829g = new ArrayList();
        for (C23465e eVar : this.f61824b) {
            if (eVar != null) {
                this.f61825c.put(eVar.f61926b, eVar);
                int i = eVar.f61929e;
                if (i >= this.f61829g.size()) {
                    this.f61829g.add(i, eVar);
                }
            }
        }
        if (this.f61827e != null) {
            this.f61827e.mo61045a(this.f61829g);
        }
        return this.f61829g.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo61036a(List<C23465e> list) {
        this.f61824b = list;
        return m76891a();
    }

    /* renamed from: a */
    private long m76892a(C23465e eVar) {
        if (eVar == null) {
            return -1;
        }
        return (long) this.f61824b.indexOf(eVar);
    }

    /* renamed from: b */
    private String m76895b(C23465e eVar) {
        return m76893a(this.f61830h, m76892a(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public CommonPageFragment mo60939c(int i) {
        C23465e eVar = (C23465e) this.f61829g.get(i);
        if (eVar != null) {
            try {
                CommonPageFragment commonPageFragment = (CommonPageFragment) eVar.f61925a.newInstance();
                if (!(eVar.f61927c == null || commonPageFragment == null)) {
                    commonPageFragment.setArguments(eVar.f61927c);
                }
                return commonPageFragment;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    private C23465e m76897e(int i) {
        if (i < 0 || i >= this.f61829g.size()) {
            return null;
        }
        return (C23465e) this.f61829g.get(i);
    }

    /* renamed from: b */
    public final long mo2424b(int i) {
        if (this.f61829g == null || this.f61824b == null) {
            return (long) i;
        }
        return (long) this.f61824b.indexOf(this.f61829g.get(i));
    }

    public float getPageWidth(int i) {
        C23465e e = m76897e(i);
        if (e == null || e.f61928d <= 0.0f) {
            return 1.0f;
        }
        return e.f61928d;
    }

    /* renamed from: a */
    public final void mo61037a(String str) {
        if (!C6307b.m19566a((Collection<T>) this.f61824b) && !C6307b.m19566a((Collection<T>) this.f61829g) && !TextUtils.isEmpty(str)) {
            C23465e eVar = (C23465e) this.f61825c.get(str);
            if (eVar != null && this.f61829g.size() > eVar.f61929e && !str.equals(((C23465e) this.f61829g.get(eVar.f61929e)).f61926b)) {
                C23465e eVar2 = (C23465e) this.f61829g.get(eVar.f61929e);
                C0633q a = this.f61826d.mo2645a();
                Fragment a2 = this.f61826d.mo2644a(m76895b(eVar2));
                if (a2 != null) {
                    a.mo2601b(a2);
                }
                Fragment a3 = this.f61826d.mo2644a(m76895b(eVar));
                if (a3 != null && a3.isAdded()) {
                    a.mo2605c(a3);
                }
                a.mo2606d();
                this.f61829g.remove(eVar.f61929e);
                this.f61829g.add(eVar.f61929e, eVar);
                if (this.f61827e != null) {
                    this.f61827e.mo61045a(this.f61829g);
                }
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60938a(HashMap<Integer, CommonPageFragment> hashMap) {
        if (this.f61827e != null) {
            this.f61827e.mo61044a(hashMap);
        }
    }

    public SwitchFragmentPagerAdapter(C0608j jVar, int i) {
        super(jVar, i);
        this.f61826d = jVar;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        this.f61830h = viewGroup.getId();
        return super.instantiateItem(viewGroup, i);
    }

    /* renamed from: a */
    private static String m76893a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60937a(CommonPageFragment commonPageFragment, int i) {
        if (this.f61828f != null) {
            this.f61828f.mo61046a(commonPageFragment, i);
        }
    }
}
