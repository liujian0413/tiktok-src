package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.sysoptimizer.fake.name.SmFakeNameHandler;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.u */
final /* synthetic */ class C32416u implements Callable {

    /* renamed from: a */
    private final Context f84534a;

    C32416u(Context context) {
        this.f84534a = context;
    }

    public final Object call() {
        return SmFakeNameHandler.start(this.f84534a);
    }
}
