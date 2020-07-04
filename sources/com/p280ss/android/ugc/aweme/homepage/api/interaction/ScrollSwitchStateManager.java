package com.p280ss.android.ugc.aweme.homepage.api.interaction;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import com.p280ss.android.ugc.aweme.base.p308ui.C23465e;
import com.p280ss.android.ugc.aweme.base.p308ui.CommonPageFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager */
public class ScrollSwitchStateManager extends C0063u {

    /* renamed from: e */
    public static final C30246a f79580e = new C30246a(null);

    /* renamed from: A */
    private C30252d f79581A;

    /* renamed from: a */
    public final C0052o<Boolean> f79582a = new C0052o<>();

    /* renamed from: b */
    public String f79583b;

    /* renamed from: c */
    public SparseArray<Fragment> f79584c;

    /* renamed from: d */
    public WeakReference<Fragment> f79585d;

    /* renamed from: f */
    private final C30249b f79586f = new C30249b();

    /* renamed from: g */
    private final C0052o<List<C23465e>> f79587g = new C0052o<>();

    /* renamed from: h */
    private final C0052o<HashMap<Integer, CommonPageFragment>> f79588h = new C0052o<>();

    /* renamed from: i */
    private final C0052o<Boolean> f79589i = new C0052o<>();

    /* renamed from: j */
    private final C0052o<String> f79590j = new C0052o<>();

    /* renamed from: k */
    private final C0052o<Integer> f79591k = new C0052o<>();

    /* renamed from: l */
    private final C0052o<Integer> f79592l = new C0052o<>();

    /* renamed from: m */
    private final C0052o<Triple<Integer, Float, Integer>> f79593m = new C0052o<>();

    /* renamed from: n */
    private final C0052o<ViewPagerFlingEndEvent> f79594n = new C0052o<>();

    /* renamed from: o */
    private final C23084b<String> f79595o = new C23084b<>();

    /* renamed from: p */
    private final C23084b<String> f79596p = new C23084b<>();

    /* renamed from: q */
    private final C0052o<C23434a> f79597q = new C0052o<>();

    /* renamed from: r */
    private final C0052o<Pair<String, Boolean>> f79598r = new C0052o<>();

    /* renamed from: s */
    private C0052o<Boolean> f79599s = new C0052o<>();

    /* renamed from: t */
    private C0052o<Fragment> f79600t = new C0052o<>();

    /* renamed from: u */
    private C30248a f79601u;

    /* renamed from: v */
    private final C0052o<Integer> f79602v = new C0052o<>();

    /* renamed from: w */
    private final C0052o<Triple<Integer, Float, Integer>> f79603w = new C0052o<>();

    /* renamed from: x */
    private C30253e f79604x;

    /* renamed from: y */
    private final C0052o<Boolean> f79605y = new C0052o<>();

    /* renamed from: z */
    private final C30249b f79606z = new C30249b();

    /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a */
    public static final class C30246a {

        /* renamed from: com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager$a$a */
        public static final class C30247a implements C0067b {
            C30247a() {
            }

            /* renamed from: a */
            public final <T extends C0063u> T mo149a(Class<T> cls) {
                C7573i.m23587b(cls, "modelClass");
                return (C0063u) new ScrollSwitchStateManager();
            }
        }

        private C30246a() {
        }

        public /* synthetic */ C30246a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ScrollSwitchStateManager m98970a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            C0063u a = C0069x.m160a(fragmentActivity, (C0067b) new C30247a()).mo147a(ScrollSwitchStateManager.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…StateManager::class.java)");
            return (ScrollSwitchStateManager) a;
        }
    }

    /* renamed from: a */
    public static final ScrollSwitchStateManager m98918a(FragmentActivity fragmentActivity) {
        return C30246a.m98970a(fragmentActivity);
    }

    /* renamed from: a */
    public final void mo79709a(C30251c cVar) {
        C7573i.m23587b(cVar, "dataStreamBridge");
        this.f79586f.mo79752a(cVar);
    }

    /* renamed from: a */
    public final boolean mo79717a() {
        return this.f79586f.f79607a;
    }

    /* renamed from: a */
    public final void mo79715a(List<? extends C23465e> list) {
        C7573i.m23587b(list, "mainPages");
        this.f79587g.setValue(list);
    }

    /* renamed from: a */
    public final void mo79714a(HashMap<Integer, CommonPageFragment> hashMap) {
        C7573i.m23587b(hashMap, "fragments");
        this.f79588h.setValue(hashMap);
    }

    /* renamed from: a */
    public final void mo79716a(boolean z) {
        this.f79589i.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo79712a(String str) {
        C7573i.m23587b(str, "pageName");
        this.f79586f.mo79749a(mo79724c(str));
    }

    /* renamed from: a */
    public final void mo79713a(String str, boolean z) {
        C7573i.m23587b(str, "pageName");
        this.f79586f.mo79750a(mo79724c(str), z);
    }

    /* renamed from: a */
    public final void mo79708a(C30248a aVar) {
        C7573i.m23587b(aVar, "dataStream");
        this.f79601u = aVar;
    }

    /* renamed from: a */
    public final void mo79711a(C30253e eVar) {
        C7573i.m23587b(eVar, "dataStream");
        this.f79604x = eVar;
    }

    /* renamed from: a */
    public final void mo79710a(C30252d dVar) {
        C7573i.m23587b(dVar, "dataStream");
        this.f79581A = dVar;
    }

    /* renamed from: f */
    private String m98921f() {
        if (!mo79717a()) {
            return "";
        }
        return mo79700a(this.f79586f.getValue().intValue());
    }

    /* renamed from: c */
    public final CommonPageFragment mo79725c() {
        if (!mo79717a()) {
            return null;
        }
        return m98920e(this.f79586f.getValue().intValue());
    }

    /* renamed from: d */
    public final Fragment mo79728d() {
        if (this.f79584c == null) {
            return null;
        }
        SparseArray<Fragment> sparseArray = this.f79584c;
        if (sparseArray != null) {
            return (Fragment) sparseArray.get(this.f79606z.getValue().intValue());
        }
        return null;
    }

    /* renamed from: e */
    public final Fragment mo79732e() {
        if (this.f79585d == null) {
            return null;
        }
        WeakReference<Fragment> weakReference = this.f79585d;
        if (weakReference == null) {
            C7573i.m23580a();
        }
        return (Fragment) weakReference.get();
    }

    public ScrollSwitchStateManager() {
        this.f79589i.setValue(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final boolean mo79722b() {
        Object value = this.f79589i.getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        return ((Boolean) value).booleanValue();
    }

    /* renamed from: b */
    public final void mo79718b(int i) {
        this.f79591k.setValue(Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo79726c(int i) {
        this.f79592l.setValue(Integer.valueOf(i));
    }

    /* renamed from: d */
    public final CommonPageFragment mo79729d(String str) {
        C7573i.m23587b(str, "pageName");
        return m98920e(mo79724c(str));
    }

    /* renamed from: g */
    public final boolean mo79738g(String str) {
        C7573i.m23587b(str, "pageName");
        CommonPageFragment d = mo79729d(str);
        if (d == null || !d.mo60919e()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void mo79740h(String str) {
        C7573i.m23587b(str, "showPage");
        this.f79590j.setValue(str);
    }

    /* renamed from: i */
    public final void mo79742i(String str) {
        C7573i.m23587b(str, "bottomTabName");
        this.f79595o.setValue(str);
    }

    /* renamed from: j */
    public final void mo79744j(String str) {
        C7573i.m23587b(str, "bottomTabName");
        this.f79596p.setValue(str);
    }

    /* renamed from: e */
    private CommonPageFragment m98920e(int i) {
        if (this.f79588h.getValue() != null) {
            Object value = this.f79588h.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            if (!((HashMap) value).isEmpty()) {
                Object value2 = this.f79588h.getValue();
                if (value2 == null) {
                    C7573i.m23580a();
                }
                return (CommonPageFragment) ((HashMap) value2).get(Integer.valueOf(i));
            }
        }
        return null;
    }

    /* renamed from: d */
    public final void mo79730d(int i) {
        this.f79602v.setValue(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final void mo79736f(String str) {
        C7573i.m23587b(str, "pageName");
        if (!mo79723b(str)) {
            if (!mo79734e(str)) {
                mo79740h(str);
            }
            m98919b(str, true);
        }
    }

    /* renamed from: a */
    public final String mo79700a(int i) {
        int i2;
        Integer num;
        if (this.f79587g.getValue() == null) {
            i2 = 0;
        } else {
            List list = (List) this.f79587g.getValue();
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            if (num == null) {
                C7573i.m23580a();
            }
            i2 = num.intValue();
        }
        if (i < 0 || i >= i2) {
            return "";
        }
        Object value = this.f79587g.getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        String str = ((C23465e) ((List) value).get(i)).f61926b;
        C7573i.m23582a((Object) str, "mainPages.value!![index].pageName");
        return str;
    }

    /* renamed from: c */
    public final int mo79724c(String str) {
        int i;
        if (this.f79587g.getValue() == null) {
            i = 0;
        } else {
            Object value = this.f79587g.getValue();
            if (value == null) {
                C7573i.m23580a();
            }
            i = ((List) value).size();
        }
        for (int i2 = 0; i2 < i; i2++) {
            CharSequence charSequence = str;
            Object value2 = this.f79587g.getValue();
            if (value2 == null) {
                C7573i.m23580a();
            }
            if (TextUtils.equals(charSequence, ((C23465e) ((List) value2).get(i2)).f61926b)) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047 A[LOOP:0: B:8:0x0022->B:19:0x0047, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo79734e(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "pageName"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            android.arch.lifecycle.o<java.util.List<com.ss.android.ugc.aweme.base.ui.e>> r0 = r5.f79587g
            java.lang.Object r0 = r0.getValue()
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0021
        L_0x0010:
            android.arch.lifecycle.o<java.util.List<com.ss.android.ugc.aweme.base.ui.e>> r0 = r5.f79587g
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x001b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001b:
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 >= r0) goto L_0x004a
            r3 = r6
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            android.arch.lifecycle.o<java.util.List<com.ss.android.ugc.aweme.base.ui.e>> r4 = r5.f79587g
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x003c
            java.lang.Object r4 = r4.get(r2)
            com.ss.android.ugc.aweme.base.ui.e r4 = (com.p280ss.android.ugc.aweme.base.p308ui.C23465e) r4
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = r4.f61926b
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0047
            r6 = 1
            return r6
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0022
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.mo79734e(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final void mo79704a(C0052o<Fragment> oVar) {
        C7573i.m23587b(oVar, "dataStream");
        this.f79600t = oVar;
    }

    /* renamed from: b */
    public final void mo79721b(C30251c cVar) {
        C7573i.m23587b(cVar, "dataStreamBridge");
        this.f79606z.mo79752a(cVar);
    }

    /* renamed from: a */
    public final void mo79705a(C0053p<Integer> pVar) {
        C7573i.m23587b(pVar, "observer");
        this.f79592l.removeObserver(pVar);
    }

    /* renamed from: a */
    public final void mo79706a(C23434a aVar) {
        C7573i.m23587b(aVar, "checker");
        this.f79597q.setValue(aVar);
    }

    /* renamed from: b */
    public final boolean mo79723b(String str) {
        C7573i.m23587b(str, "pageName");
        return TextUtils.equals(str, m98921f());
    }

    /* renamed from: a */
    public final void mo79707a(ViewPagerFlingEndEvent viewPagerFlingEndEvent) {
        C7573i.m23587b(viewPagerFlingEndEvent, "event");
        this.f79594n.setValue(viewPagerFlingEndEvent);
    }

    /* renamed from: a */
    public final void mo79702a(int i, boolean z) {
        this.f79606z.mo79750a(i, false);
    }

    /* renamed from: e */
    public final void mo79733e(C0043i iVar, C0053p<Integer> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79592l.observe(iVar, pVar);
    }

    /* renamed from: f */
    public final void mo79735f(C0043i iVar, C0053p<Triple<Integer, Float, Integer>> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79593m.observe(iVar, pVar);
    }

    /* renamed from: g */
    public final void mo79737g(C0043i iVar, C0053p<ViewPagerFlingEndEvent> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79594n.observe(iVar, pVar);
    }

    /* renamed from: h */
    public final void mo79739h(C0043i iVar, C0053p<String> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79595o.observe(iVar, pVar);
    }

    /* renamed from: i */
    public final void mo79741i(C0043i iVar, C0053p<String> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79596p.observe(iVar, pVar);
    }

    /* renamed from: j */
    public final void mo79743j(C0043i iVar, C0053p<C23434a> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79597q.observe(iVar, pVar);
    }

    /* renamed from: k */
    public final void mo79745k(C0043i iVar, C0053p<Integer> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79602v.observe(iVar, pVar);
    }

    /* renamed from: l */
    public final void mo79746l(C0043i iVar, C0053p<Triple<Integer, Float, Integer>> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79603w.observe(iVar, pVar);
    }

    /* renamed from: m */
    public final void mo79747m(C0043i iVar, C0053p<Boolean> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79605y.observe(iVar, pVar);
    }

    /* renamed from: b */
    private void m98919b(String str, boolean z) {
        C7573i.m23587b(str, "pageName");
        this.f79586f.mo79751a(mo79724c(str), true, false);
    }

    /* renamed from: a */
    public final void mo79703a(C0043i iVar, C0053p<Integer> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79586f.observe(iVar, pVar);
    }

    /* renamed from: c */
    public final void mo79727c(C0043i iVar, C0053p<String> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79590j.observe(iVar, pVar);
    }

    /* renamed from: b */
    public final void mo79720b(C0043i iVar, C0053p<Boolean> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79589i.observe(iVar, pVar);
    }

    /* renamed from: d */
    public final void mo79731d(C0043i iVar, C0053p<Integer> pVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(pVar, "observer");
        this.f79591k.observe(iVar, pVar);
    }

    /* renamed from: a */
    public final void mo79701a(int i, float f, int i2) {
        this.f79593m.setValue(new Triple(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }

    /* renamed from: b */
    public final void mo79719b(int i, float f, int i2) {
        this.f79603w.setValue(new Triple(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)));
    }
}
