package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9350e;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.live.broadcast.preview.a */
public final class C2846a implements C2882b {

    /* renamed from: com.bytedance.android.live.broadcast.preview.a$a */
    public static final class C2847a implements C2511b<C2882b> {
        /* renamed from: a */
        public final C2512a<C2882b> mo8847a(C2512a<C2882b> aVar) {
            C7573i.m23587b(aVar, "config");
            C2512a<C2882b> a = aVar.mo9081a(new C2846a()).mo9080a();
            C7573i.m23582a((Object) a, "config.provideWith(Broad…wService()).asSingleton()");
            return a;
        }
    }

    /* renamed from: a */
    public final C9350e mo9612a() {
        return new StartLiveFragmentD();
    }
}
