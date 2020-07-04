package com.p280ss.android.ugc.aweme.shortvideo;

import bolts.C1606i;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.tools.extract.C42315d;
import com.p280ss.android.ugc.aweme.tools.extract.C42320g.C42321a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ct */
final /* synthetic */ class C38646ct implements Callable {

    /* renamed from: a */
    private final Object f100391a;

    /* renamed from: b */
    private final C1606i f100392b;

    C38646ct(Object obj, C1606i iVar) {
        this.f100391a = obj;
        this.f100392b = iVar;
    }

    public final Object call() {
        return new C42315d((VideoPublishEditModel) this.f100391a).mo103792a((C42321a) new C38647cu(this.f100392b));
    }
}
