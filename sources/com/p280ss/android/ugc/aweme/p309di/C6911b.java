package com.p280ss.android.ugc.aweme.p309di;

import android.app.Application;
import com.p280ss.android.ugc.aweme.app.host.HostApplication;
import com.p280ss.android.ugc.graph.C44840e;
import com.p280ss.android.ugc.graph.C7289f.C7292c;
import com.p280ss.android.ugc.graph.C7289f.C7293b;

/* renamed from: com.ss.android.ugc.aweme.di.b */
public abstract /* synthetic */ class C6911b {
    /* renamed from: a */
    public static AppComponent m21536a(HostApplication hostApplication) {
        AppComponent a = DaggerAppComponent.builder().mo16969a((Application) hostApplication).mo16970a(new C26252aj(hostApplication)).mo16971a();
        new C7293b().mo19027a((Object) a).mo19026a((C7292c) new C44840e()).mo19028a();
        return a;
    }
}
