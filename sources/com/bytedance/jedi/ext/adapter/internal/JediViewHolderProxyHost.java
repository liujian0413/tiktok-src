package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.widget.Widget;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public final class JediViewHolderProxyHost extends Fragment {

    /* renamed from: b */
    public static final String f31484b = JediViewHolderProxyHost.class.getCanonicalName();

    /* renamed from: c */
    public static final C11720a f31485c = new C11720a(null);

    /* renamed from: a */
    public Fragment f31486a;

    /* renamed from: d */
    private final Map<Lifecycle, C11724d> f31487d = new WeakHashMap();

    /* renamed from: e */
    private final Set<C7561a<C7581n>> f31488e = new LinkedHashSet();

    /* renamed from: f */
    private HashMap f31489f;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost$a */
    public static final class C11720a {
        private C11720a() {
        }

        public /* synthetic */ C11720a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final JediViewHolderProxyHost mo29283a(Widget widget) {
            C7573i.m23587b(widget, "widget");
            Object n = widget.mo31589n();
            if (n instanceof Fragment) {
                return m34357a(null, (Fragment) n);
            }
            if (n instanceof FragmentActivity) {
                return m34357a((FragmentActivity) n, null);
            }
            throw new IllegalStateException();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            if (r3 == null) goto L_0x0008;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost m34357a(android.support.p022v4.app.FragmentActivity r3, android.support.p022v4.app.Fragment r4) {
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
                java.lang.String r0 = com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.f31484b
                android.support.v4.app.Fragment r0 = r3.mo2644a(r0)
                boolean r1 = r0 instanceof com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost
                if (r1 != 0) goto L_0x0021
                r0 = 0
            L_0x0021:
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost r0 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost) r0
                if (r0 != 0) goto L_0x004d
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost r0 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost
                r0.<init>()
                r0.f31486a = r4
                if (r4 == 0) goto L_0x003d
                android.support.v4.app.l r4 = r4.mFragmentManager
                if (r4 == 0) goto L_0x003d
                com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost$Companion$create$1$1 r1 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost$Companion$create$1$1
                r1.<init>(r0)
                android.support.v4.app.j$a r1 = (android.support.p022v4.app.C0608j.C0609a) r1
                r2 = 0
                r4.mo2649a(r1, r2)
            L_0x003d:
                android.support.v4.app.q r3 = r3.mo2645a()
                r4 = r0
                android.support.v4.app.Fragment r4 = (android.support.p022v4.app.Fragment) r4
                java.lang.String r1 = com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.f31484b
                android.support.v4.app.q r3 = r3.mo2588a(r4, r1)
                r3.mo2610f()
            L_0x004d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.C11720a.m34357a(android.support.v4.app.FragmentActivity, android.support.v4.app.Fragment):com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost");
        }
    }

    /* renamed from: b */
    private void m34352b() {
        if (this.f31489f != null) {
            this.f31489f.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m34352b();
    }

    /* renamed from: a */
    public final void mo29280a() {
        for (C7561a invoke : this.f31488e) {
            invoke.invoke();
        }
        this.f31488e.clear();
    }

    /* renamed from: a */
    public final C11724d mo29279a(Lifecycle lifecycle) {
        C7573i.m23587b(lifecycle, "lifecycle");
        return (C11724d) this.f31487d.get(lifecycle);
    }

    /* renamed from: a */
    public final void mo29282a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f31488e.add(aVar);
    }

    /* renamed from: a */
    public final void mo29281a(Lifecycle lifecycle, C11724d dVar) {
        C7573i.m23587b(lifecycle, "lifecycle");
        C7573i.m23587b(dVar, "manager");
        this.f31487d.put(lifecycle, dVar);
    }
}
