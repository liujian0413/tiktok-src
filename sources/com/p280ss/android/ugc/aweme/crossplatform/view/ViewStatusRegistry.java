package com.p280ss.android.ugc.aweme.crossplatform.view;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.ViewStatusRegistry */
public final class ViewStatusRegistry {

    /* renamed from: a */
    private final List<C26036j> f68793a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.ViewStatusRegistry$Status */
    public enum Status {
        LOAD_START,
        LOAD_FINISH
    }

    /* renamed from: a */
    public final void mo67538a() {
        this.f68793a.clear();
    }

    /* renamed from: a */
    public final void mo67540a(C26036j jVar) {
        C7573i.m23587b(jVar, "observer");
        this.f68793a.add(jVar);
    }

    /* renamed from: a */
    public final void mo67539a(Status status) {
        C7573i.m23587b(status, "status");
        switch (C26037k.f68814a[status.ordinal()]) {
            case 1:
                for (C26036j r : this.f68793a) {
                    r.mo67124r();
                }
                return;
            case 2:
                for (C26036j s : this.f68793a) {
                    s.mo67125s();
                }
                break;
        }
    }
}
