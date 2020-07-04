package com.p280ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.p280ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.b */
final /* synthetic */ class C43634b implements Runnable {

    /* renamed from: a */
    private final Context f112921a;

    /* renamed from: b */
    private final Map f112922b;

    C43634b(Context context, Map map) {
        this.f112921a = context;
        this.f112922b = map;
    }

    public final void run() {
        MessageAppManager.inst().handleAppLogUpdate(this.f112921a, this.f112922b);
    }
}
