package com.p280ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.p280ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.c */
final /* synthetic */ class C43635c implements Runnable {

    /* renamed from: a */
    private final Context f112923a;

    /* renamed from: b */
    private final Map f112924b;

    C43635c(Context context, Map map) {
        this.f112923a = context;
        this.f112924b = map;
    }

    public final void run() {
        MessageAppManager.inst().handleAppLogUpdate(this.f112923a, this.f112924b);
    }
}
