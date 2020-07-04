package com.p280ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.C6307b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.b */
public final class C33800b {

    /* renamed from: a */
    public static final C33800b f88180a = new C33800b();

    private C33800b() {
    }

    /* renamed from: a */
    public static final <T> void m108971a(List<T> list, List<? extends T> list2, C7563m<? super T, ? super T, Boolean> mVar) {
        Object obj;
        C7573i.m23587b(list, "originList");
        C7573i.m23587b(list2, "addList");
        C7573i.m23587b(mVar, "isEquals");
        if (!C6307b.m19566a((Collection<T>) list2)) {
            for (Object next : list2) {
                if (next != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((Boolean) mVar.invoke(obj, next)).booleanValue()) {
                            break;
                        }
                    }
                    if (obj == null) {
                        list.add(next);
                    }
                }
            }
        }
    }
}
