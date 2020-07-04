package com.bytedance.jedi.ext.adapter.internal;

import android.arch.lifecycle.Lifecycle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost.C11720a;
import com.bytedance.widget.Widget;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.d */
public final class C11724d {

    /* renamed from: d */
    public static final C11726a f31502d = new C11726a(null);

    /* renamed from: a */
    public JediViewHolderProxyHost f31503a;

    /* renamed from: b */
    public C11723c f31504b;

    /* renamed from: c */
    public C11730g f31505c;

    /* renamed from: e */
    private final CopyOnWriteArraySet<C11679b> f31506e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    private final Lifecycle f31507f;

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.d$a */
    public static final class C11726a {
        private C11726a() {
        }

        public /* synthetic */ C11726a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final C11724d mo29298a(Fragment fragment) {
            C7573i.m23587b(fragment, "fragment");
            return m34382a((FragmentActivity) null, fragment);
        }

        /* renamed from: a */
        public final C11724d mo29299a(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "activity");
            return m34382a(fragmentActivity, (Fragment) null);
        }

        /* renamed from: a */
        public final C11724d mo29300a(Widget widget) {
            C7573i.m23587b(widget, "widget");
            return m34381a(widget.getLifecycle(), JediViewHolderProxyHost.f31485c.mo29283a(widget));
        }

        /* renamed from: a */
        private static C11724d m34381a(Lifecycle lifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
            C11724d a = jediViewHolderProxyHost.mo29279a(lifecycle);
            if (a != null) {
                return a;
            }
            C11724d dVar = new C11724d(lifecycle, jediViewHolderProxyHost);
            jediViewHolderProxyHost.mo29281a(lifecycle, dVar);
            return dVar;
        }

        /* renamed from: a */
        private final C11724d m34382a(FragmentActivity fragmentActivity, Fragment fragment) {
            JediViewHolderProxyHost a = C11720a.m34357a(fragmentActivity, fragment);
            Lifecycle lifecycle = a.getLifecycle();
            C7573i.m23582a((Object) lifecycle, "proxyHost.lifecycle");
            return m34381a(lifecycle, a);
        }
    }

    /* renamed from: a */
    public final C11724d mo29296a(C11679b bVar) {
        C7573i.m23587b(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        if (this.f31506e.add(jediViewHolderProxy)) {
            jediViewHolderProxy.f31475c = this;
            this.f31507f.mo55a(jediViewHolderProxy);
        }
        return this;
    }

    /* renamed from: b */
    public final C11724d mo29297b(C11679b bVar) {
        C7573i.m23587b(bVar, "proxy");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) bVar;
        this.f31507f.mo56b(jediViewHolderProxy);
        switch (C11727e.f31509a[this.f31507f.mo54a().ordinal()]) {
            case 2:
                if (!jediViewHolderProxy.f31476d) {
                    jediViewHolderProxy.onDestroy();
                    break;
                }
                break;
            case 3:
                jediViewHolderProxy.onDestroy();
                break;
            case 4:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
            case 5:
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
                break;
        }
        jediViewHolderProxy.f31475c = null;
        this.f31506e.remove(jediViewHolderProxy);
        return this;
    }

    public C11724d(Lifecycle lifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
        C7573i.m23587b(lifecycle, "parentLifecycle");
        C7573i.m23587b(jediViewHolderProxyHost, "host");
        this.f31507f = lifecycle;
        this.f31503a = jediViewHolderProxyHost;
        jediViewHolderProxyHost.mo29282a((C7561a<C7581n>) new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ C11724d f31508a;

            {
                this.f31508a = r1;
            }

            public final /* synthetic */ Object invoke() {
                m34380a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m34380a() {
                this.f31508a.f31503a = null;
                C11723c cVar = this.f31508a.f31504b;
                if (cVar != null) {
                    cVar.mo29294b();
                }
                C11730g gVar = this.f31508a.f31505c;
                if (gVar != null) {
                    gVar.mo29303a();
                }
            }
        });
    }
}
