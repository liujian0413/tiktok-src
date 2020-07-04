package com.p280ss.android.ugc.aweme.miniapp.impl;

import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent;
import com.p280ss.android.ugc.aweme.miniapp_api.model.event.MpCommonEvent.C33461a;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33423a;
import com.p280ss.android.ugc.aweme.p1001al.p1002a.C22489a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.f */
public class C33396f {

    /* renamed from: a */
    private Map<String, C33423a> f87239a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.f$a */
    static class C33398a {

        /* renamed from: a */
        public static final C33396f f87240a = new C33396f();
    }

    /* renamed from: a */
    public static C33396f m108015a() {
        return C33398a.f87240a;
    }

    private C33396f() {
        this.f87239a = new HashMap();
    }

    /* renamed from: a */
    public final void mo85612a(String str) {
        if (this.f87239a.containsKey(str)) {
            this.f87239a.remove(str);
        }
        C7705c.m23799a().mo20393c((Object) this);
    }

    @C7709l
    public void onEvent(C22489a aVar) {
        MpCommonEvent a = new C33461a().mo85772a(aVar.f59937a).mo85773a();
        C33423a aVar2 = (C33423a) this.f87239a.get("video_publish");
        if (aVar2 != null) {
            aVar2.onEvent(a);
        }
    }

    @C7709l
    public void onEvent(MpCommonEvent mpCommonEvent) {
        C33423a aVar = (C33423a) this.f87239a.get(mpCommonEvent.getType());
        if (aVar != null) {
            aVar.onEvent(mpCommonEvent);
        }
    }

    /* renamed from: a */
    public final void mo85613a(String str, C33423a aVar) {
        this.f87239a.put(str, aVar);
        if (!C7705c.m23799a().mo20392b((Object) this)) {
            C7705c.m23799a().mo20389a((Object) this);
        }
    }
}
