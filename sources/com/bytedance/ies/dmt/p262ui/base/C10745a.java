package com.bytedance.ies.dmt.p262ui.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.dmt.ui.base.a */
public final class C10745a implements C10748c {

    /* renamed from: a */
    public static C10748c f28748a = new C10745a();

    /* renamed from: b */
    public static C10748c f28749b;

    /* renamed from: c */
    public static final C10746a f28750c = new C10746a(null);

    /* renamed from: com.bytedance.ies.dmt.ui.base.a$a */
    public static final class C10746a {
        private C10746a() {
        }

        public /* synthetic */ C10746a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m31338a(Context context, int i, ViewGroup viewGroup, boolean z) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(viewGroup, "root");
            C10748c cVar = C10745a.f28749b;
            if (cVar != null) {
                return cVar.mo25668a(context, i, viewGroup, false);
            }
            return C10745a.f28748a.mo25668a(context, i, viewGroup, false);
        }
    }

    /* renamed from: a */
    public final View mo25668a(Context context, int i, ViewGroup viewGroup, boolean z) {
        C7573i.m23587b(context, "context");
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, z);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…late(resId, root, attach)");
        return inflate;
    }
}
