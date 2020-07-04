package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C7101f;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.i */
public final class C6944i implements C7101f {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f19641a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C6944i.class), "traceStack", "getTraceStack()Ljava/util/LinkedList;"))};

    /* renamed from: b */
    public static final C6944i f19642b = new C6944i();

    /* renamed from: c */
    private static final C7541d f19643c = C7546e.m23569a(C6945a.f19644a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.i$a */
    static final class C6945a extends Lambda implements C7561a<LinkedList<String>> {

        /* renamed from: a */
        public static final C6945a f19644a = new C6945a();

        C6945a() {
            super(0);
        }

        /* renamed from: a */
        private static LinkedList<String> m21605a() {
            return new LinkedList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m21605a();
        }
    }

    private C6944i() {
    }

    /* renamed from: a */
    private final LinkedList<String> m21597a() {
        return (LinkedList) f19643c.getValue();
    }

    /* renamed from: b */
    private void m21598b() {
        List<String> d = C7525m.m23509d((Collection) m21597a());
        StringBuilder sb = new StringBuilder();
        for (String append : d) {
            sb.append(append);
            sb.append("\n");
            if (sb.length() > 800) {
                C6921a.m21555a(sb.toString());
                sb = new StringBuilder();
            }
        }
        C6921a.m21555a(sb.toString());
    }

    /* renamed from: a */
    public final void mo17974a(int i) {
        boolean z;
        C6944i iVar;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iVar = this;
        } else {
            iVar = null;
        }
        C6944i iVar2 = iVar;
        if (iVar2 != null) {
            iVar2.m21598b();
        }
    }

    /* renamed from: b */
    public final void mo17977b(String str) {
        C7573i.m23587b(str, "status");
        StringBuilder sb = new StringBuilder("ws status changed: ");
        sb.append(str);
        m21599d(sb.toString());
    }

    /* renamed from: a */
    public final void mo17975a(String str) {
        C7573i.m23587b(str, "event");
        m21599d(str);
    }

    /* renamed from: c */
    public final void mo17978c(String str) {
        C7573i.m23587b(str, "event");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": last=");
        C7076p a = C7076p.m22077a();
        C7573i.m23582a((Object) a, "IMSPUtils.get()");
        sb.append(a.mo18329m());
        sb.append(", cur=");
        sb.append(C7074e.m22069b());
        m21599d(sb.toString());
    }

    /* renamed from: d */
    private final void m21599d(String str) {
        if (m21597a().size() >= 100) {
            m21597a().remove(0);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append(":  ");
        sb.append(str);
        String sb2 = sb.toString();
        LinkedList a = m21597a();
        StringBuilder sb3 = new StringBuilder("IMErrorMonitor ");
        sb3.append(sb2);
        a.add(sb3.toString());
    }

    /* renamed from: a */
    public final void mo17976a(String str, String str2, int i, int i2) {
        StringBuilder sb = new StringBuilder("fetch token: reason=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", local=");
        sb.append(str);
        sb.append(", token=");
        sb.append(str2);
        m21599d(sb.toString());
    }
}
