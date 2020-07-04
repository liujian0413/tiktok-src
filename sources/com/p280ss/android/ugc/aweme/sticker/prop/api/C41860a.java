package com.p280ss.android.ugc.aweme.sticker.prop.api;

import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35548am;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35670h;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.a */
public final class C41860a implements C35548am {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f108890a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C41860a.class), "stickerPropApi", "getStickerPropApi()Lcom/ss/android/ugc/aweme/sticker/prop/api/StickerPropApi;"))};

    /* renamed from: b */
    private final C7541d f108891b = C7546e.m23569a(C41861a.f108892a);

    /* renamed from: com.ss.android.ugc.aweme.sticker.prop.api.a$a */
    static final class C41861a extends Lambda implements C7561a<StickerPropApi> {

        /* renamed from: a */
        public static final C41861a f108892a = new C41861a();

        C41861a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m133141a();
        }

        /* renamed from: a */
        private static StickerPropApi m133141a() {
            return (StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(StickerPropApi.class);
        }
    }

    /* renamed from: a */
    private final StickerPropApi m133138a() {
        return (StickerPropApi) this.f108891b.getValue();
    }

    /* renamed from: a */
    public final NewFaceStickerListBean mo90369a(String str) {
        C7573i.m23587b(str, "stickerIds");
        Object obj = m133138a().getStickerDetail(str).get();
        C7573i.m23582a(obj, "stickerPropApi.getStickerDetail(stickerIds).get()");
        return (NewFaceStickerListBean) obj;
    }

    /* renamed from: a */
    public final void mo90370a(String str, boolean z) {
        C7573i.m23587b(str, "id");
        C42961az.m136380a(new C35670h());
    }
}
