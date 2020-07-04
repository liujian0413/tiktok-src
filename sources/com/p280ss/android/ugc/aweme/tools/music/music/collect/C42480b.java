package com.p280ss.android.ugc.aweme.tools.music.music.collect;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.b */
public final class C42480b {

    /* renamed from: b */
    public static final C42480b f110448b = C42482b.m135001a();

    /* renamed from: c */
    public static final C42481a f110449c = new C42481a(null);

    /* renamed from: a */
    public final SharedPreferences f110450a;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.b$a */
    public static final class C42481a {
        private C42481a() {
        }

        /* renamed from: a */
        public static C42480b m135000a() {
            return C42480b.f110448b;
        }

        public /* synthetic */ C42481a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.music.collect.b$b */
    static final class C42482b {

        /* renamed from: a */
        public static final C42482b f110451a = new C42482b();

        /* renamed from: b */
        private static final C42480b f110452b = new C42480b();

        private C42482b() {
        }

        /* renamed from: a */
        public static C42480b m135001a() {
            return f110452b;
        }
    }

    /* renamed from: a */
    public final String mo104013a() {
        return this.f110450a.getString("collect_music_list", "");
    }

    /* renamed from: b */
    public final void mo104015b() {
        Editor edit = this.f110450a.edit();
        edit.remove("collect_music_list");
        edit.commit();
    }

    public C42480b() {
        Object service = ServiceManager.get().getService(IAVServiceProxy.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
        C35578o applicationService = ((IAVServiceProxy) service).getApplicationService();
        C7573i.m23582a((Object) applicationService, "ServiceManager.get().get…       applicationService");
        this.f110450a = C7285c.m22838a(applicationService.mo83136c(), "collect_music", 0);
    }

    /* renamed from: a */
    public final void mo104014a(String str) {
        C7573i.m23587b(str, "musicListString");
        Editor edit = this.f110450a.edit();
        edit.putString("collect_music_list", str);
        edit.commit();
    }
}
