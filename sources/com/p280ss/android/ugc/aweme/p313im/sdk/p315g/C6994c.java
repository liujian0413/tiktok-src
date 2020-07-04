package com.p280ss.android.ugc.aweme.p313im.sdk.p315g;

import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31684d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7097b;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7097b.C7098a;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.g.c */
public final class C6994c implements C7097b {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.g.c$a */
    static final class C6995a extends Lambda implements C7563m<List<IMContact>, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7098a f19737a;

        C6995a(C7098a aVar) {
            this.f19737a = aVar;
            super(2);
        }

        /* renamed from: a */
        private void m21775a(List<IMContact> list, boolean z) {
            C7573i.m23587b(list, "list");
            this.f19737a.mo18367a(list);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m21775a((List) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.g.c$b */
    static final class C6996b extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7098a f19738a;

        C6996b(C7098a aVar) {
            this.f19738a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m21776a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m21776a(Throwable th) {
            C7573i.m23587b(th, "it");
            this.f19738a.mo18366a(th);
        }
    }

    /* renamed from: a */
    public final void mo18079a(int i, C7098a aVar) {
        C7573i.m23587b(aVar, "callback");
        C31690a aVar2 = new C31690a(1, false);
        aVar2.f82914a = false;
        aVar2.f82915b = true;
        new C31684d(aVar2).m102752a(new C6995a(aVar), new C6996b(aVar), C31622e.f82817a, C31623f.f82818a).mo82406e();
    }
}
