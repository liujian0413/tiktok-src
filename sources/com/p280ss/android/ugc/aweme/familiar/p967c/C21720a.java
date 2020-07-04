package com.p280ss.android.ugc.aweme.familiar.p967c;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.comment.param.C24201b.C24202a;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21709a;
import com.p280ss.android.ugc.aweme.familiar.p965a.C21712c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.familiar.c.a */
public final class C21720a {

    /* renamed from: a */
    public static final C21720a f58165a = new C21720a();

    private C21720a() {
    }

    /* renamed from: a */
    public static final void m72644a(C24202a aVar, Object obj, Aweme aweme) {
        if (obj instanceof C21712c) {
            List items = ((C21712c) obj).getItems();
            if (!C6307b.m19566a((Collection<T>) items)) {
                C21709a aVar2 = null;
                if (items == null) {
                    C7573i.m23580a();
                }
                Iterator it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C21709a aVar3 = (C21709a) it.next();
                    if (aVar3.getAweme() != null && C7573i.m23585a((Object) aVar3.getAweme(), (Object) aweme)) {
                        aVar2 = aVar3;
                        break;
                    }
                }
                if (!(aVar2 == null || aVar == null)) {
                    aVar.mo62915f(true).mo62906b(aVar2.getLikeList());
                }
            }
        }
    }
}
