package com.p280ss.android.ugc.aweme.discover.mob;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mob.x */
public final class C26804x {

    /* renamed from: a */
    public static final C26805a f70731a = new C26805a(null);

    /* renamed from: com.ss.android.ugc.aweme.discover.mob.x$a */
    public static final class C26805a {
        private C26805a() {
        }

        public /* synthetic */ C26805a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C26501r m88001a(View view) {
            C7573i.m23587b(view, "view");
            C26501r rVar = (C26501r) C26803w.f70730a.mo59054a(view);
            if (rVar == null) {
                Context context = view.getContext();
                if (context instanceof FragmentActivity) {
                    C26803w wVar = C26803w.f70730a;
                    Window window = ((FragmentActivity) context).getWindow();
                    C7573i.m23582a((Object) window, "context.window");
                    rVar = (C26501r) wVar.mo59054a(window.getDecorView());
                }
            }
            if (rVar == null) {
                return new C26501r(true);
            }
            return rVar;
        }

        /* renamed from: a */
        public static void m88002a(View view, C26501r rVar) {
            C7573i.m23587b(view, "view");
            C7573i.m23587b(rVar, "param");
            C26803w.f70730a.mo59055a(view, rVar);
        }
    }
}
