package com.p280ss.android.ugc.bogut.library.factory;

import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a.C43669a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.bogut.library.factory.PresenterStorage */
public enum PresenterStorage {
    INSTANCE;
    
    public HashMap<String, C43668a> idToPresenter;
    public HashMap<C43668a, String> presenterToId;

    public final void clear() {
        this.idToPresenter.clear();
        this.presenterToId.clear();
    }

    public final <P> P getPresenter(String str) {
        return this.idToPresenter.get(str);
    }

    public final String getId(C43668a aVar) {
        return (String) this.presenterToId.get(aVar);
    }

    public final void add(final C43668a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.getClass().getSimpleName());
        sb.append("/");
        sb.append(System.nanoTime());
        sb.append("/");
        sb.append((int) (Math.random() * 2.147483647E9d));
        String sb2 = sb.toString();
        this.idToPresenter.put(sb2, aVar);
        this.presenterToId.put(aVar, sb2);
        aVar.mo105632a((C43669a) new C43669a() {
            /* renamed from: a */
            public final void mo105635a() {
                PresenterStorage.this.idToPresenter.remove(PresenterStorage.this.presenterToId.remove(aVar));
            }
        });
    }
}
