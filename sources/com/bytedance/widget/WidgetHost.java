package com.bytedance.widget;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public final class WidgetHost extends Fragment {

    /* renamed from: b */
    public static final String f34465b = WidgetHost.class.getCanonicalName();

    /* renamed from: c */
    public static final C13030a f34466c = new C13030a(null);

    /* renamed from: a */
    public Fragment f34467a;

    /* renamed from: d */
    private final HashMap<Integer, Widget> f34468d = new HashMap<>();

    /* renamed from: e */
    private final List<Object> f34469e = new ArrayList();

    /* renamed from: f */
    private final Map<Lifecycle, C13031a> f34470f = new WeakHashMap();

    /* renamed from: g */
    private final Set<C7561a<C7581n>> f34471g = new LinkedHashSet();

    /* renamed from: h */
    private HashMap f34472h;

    /* renamed from: com.bytedance.widget.WidgetHost$a */
    public static final class C13030a {
        private C13030a() {
        }

        public /* synthetic */ C13030a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            if (r3 == null) goto L_0x0008;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.bytedance.widget.WidgetHost m38031a(android.support.p022v4.app.FragmentActivity r3, android.support.p022v4.app.Fragment r4) {
            /*
                if (r3 == 0) goto L_0x0008
                android.support.v4.app.j r3 = r3.getSupportFragmentManager()
                if (r3 != 0) goto L_0x0016
            L_0x0008:
                if (r4 != 0) goto L_0x000d
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x000d:
                android.support.v4.app.j r3 = r4.getChildFragmentManager()
                java.lang.String r0 = "fragment!!.childFragmentManager"
                kotlin.jvm.internal.C7573i.m23582a(r3, r0)
            L_0x0016:
                java.lang.String r0 = com.bytedance.widget.WidgetHost.f34465b
                android.support.v4.app.Fragment r0 = r3.mo2644a(r0)
                boolean r1 = r0 instanceof com.bytedance.widget.WidgetHost
                if (r1 != 0) goto L_0x0021
                r0 = 0
            L_0x0021:
                com.bytedance.widget.WidgetHost r0 = (com.bytedance.widget.WidgetHost) r0
                if (r0 != 0) goto L_0x004d
                com.bytedance.widget.WidgetHost r0 = new com.bytedance.widget.WidgetHost
                r0.<init>()
                r0.f34467a = r4
                if (r4 == 0) goto L_0x003d
                android.support.v4.app.l r4 = r4.mFragmentManager
                if (r4 == 0) goto L_0x003d
                com.bytedance.widget.WidgetHost$Companion$createHost$1$1 r1 = new com.bytedance.widget.WidgetHost$Companion$createHost$1$1
                r1.<init>(r0)
                android.support.v4.app.j$a r1 = (android.support.p022v4.app.C0608j.C0609a) r1
                r2 = 0
                r4.mo2649a(r1, r2)
            L_0x003d:
                android.support.v4.app.q r3 = r3.mo2645a()
                r4 = r0
                android.support.v4.app.Fragment r4 = (android.support.p022v4.app.Fragment) r4
                java.lang.String r1 = com.bytedance.widget.WidgetHost.f34465b
                android.support.v4.app.q r3 = r3.mo2588a(r4, r1)
                r3.mo2610f()
            L_0x004d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.widget.WidgetHost.C13030a.m38031a(android.support.v4.app.FragmentActivity, android.support.v4.app.Fragment):com.bytedance.widget.WidgetHost");
        }
    }

    /* renamed from: d */
    private void m38022d() {
        if (this.f34472h != null) {
            this.f34472h.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m38022d();
    }

    /* renamed from: b */
    public final Context mo31600b() {
        Context requireContext = requireContext();
        C7573i.m23582a((Object) requireContext, "requireContext()");
        return requireContext;
    }

    /* renamed from: c */
    public final Object mo31602c() {
        Fragment fragment = this.mParentFragment;
        if (fragment != null) {
            return fragment;
        }
        Object requireHost = requireHost();
        C7573i.m23582a(requireHost, "requireHost()");
        return requireHost;
    }

    /* renamed from: a */
    public final void mo31596a() {
        for (C7561a invoke : this.f34471g) {
            invoke.invoke();
        }
        this.f34471g.clear();
    }

    /* renamed from: a */
    public final C13031a mo31595a(Lifecycle lifecycle) {
        C7573i.m23587b(lifecycle, "lifecycle");
        return (C13031a) this.f34470f.get(lifecycle);
    }

    /* renamed from: b */
    public final void mo31601b(Widget widget) {
        C7573i.m23587b(widget, "widget");
        Iterator it = this.f34469e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    /* renamed from: a */
    public final void mo31598a(Widget widget) {
        C7573i.m23587b(widget, "widget");
        Iterator it = this.f34469e.iterator();
        while (it.hasNext()) {
            it.next();
        }
        if (widget.f34460f) {
            widget.f34460f = false;
        }
    }

    /* renamed from: a */
    public final void mo31599a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f34471g.add(aVar);
    }

    /* renamed from: a */
    public final void mo31597a(Lifecycle lifecycle, C13031a aVar) {
        C7573i.m23587b(lifecycle, "lifecycle");
        C7573i.m23587b(aVar, "manager");
        this.f34470f.put(lifecycle, aVar);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f34468d.get(Integer.valueOf(i));
        this.f34468d.remove(Integer.valueOf(i));
    }
}
