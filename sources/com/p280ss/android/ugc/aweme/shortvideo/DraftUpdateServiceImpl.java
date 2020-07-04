package com.p280ss.android.ugc.aweme.shortvideo;

import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40250c;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl */
public final class DraftUpdateServiceImpl implements DraftUpdateService {
    public static final C38392a Companion = new C38392a(null);
    public static final C7541d gson$delegate = C7546e.m23569a(C38393b.f99667a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$a */
    public static final class C38392a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f99666a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38392a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        private C38392a() {
        }

        /* renamed from: a */
        public static C6600e m122633a() {
            return (C6600e) DraftUpdateServiceImpl.gson$delegate.getValue();
        }

        public /* synthetic */ C38392a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$b */
    static final class C38393b extends Lambda implements C7561a<C6600e> {

        /* renamed from: a */
        public static final C38393b f99667a = new C38393b();

        C38393b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m122634a();
        }

        /* renamed from: a */
        private static C6600e m122634a() {
            Object service = ServiceManager.get().getService(IAVServiceProxy.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
            return ((IAVServiceProxy) service).getNetworkService().getRetrofitFactoryGson();
        }
    }

    public final AVMusic transformNewAVMusic(String str) {
        boolean z;
        C7573i.m23587b(str, "musicString");
        Object a = C38392a.m122633a().mo15974a(str, MusicModel.class);
        C7573i.m23582a(a, "gson\n                .fr…, MusicModel::class.java)");
        MusicModel musicModel = (MusicModel) a;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object a2 = C10944e.m32113a().mo15974a(str, AVMusic.class);
            C7573i.m23582a(a2, "Network.getGson().fromJs…ing, AVMusic::class.java)");
            return (AVMusic) a2;
        }
        new C40250c();
        AVMusic a3 = C40250c.m128598a(musicModel);
        C7573i.m23582a((Object) a3, "AVMusicTransformation().apply(oldMusicModel)!!");
        return a3;
    }
}
