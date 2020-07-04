package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerProvider */
public final class UnlockedStickerProvider {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f106464a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(UnlockedStickerProvider.class), "sStickerAPI", "getSStickerAPI()Lcom/ss/android/ugc/aweme/shortvideo/sticker/unlock/UnlockedStickerProvider$UnlockedStickerListApi;"))};

    /* renamed from: b */
    public static final UnlockedStickerProvider f106465b = new UnlockedStickerProvider();

    /* renamed from: c */
    private static final C7541d f106466c = C7546e.m23569a(C40952a.f106467a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerProvider$UnlockedStickerListApi */
    public interface UnlockedStickerListApi {
        @C7730f(mo20420a = "https://api2.musical.ly/aweme/v1/ug/stickers/unlocked/")
        C18253l<UnlockedStickerListResponse> getUnlockedStickers(@C7744t(mo20436a = "events_ids") List<String> list);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.UnlockedStickerProvider$a */
    static final class C40952a extends Lambda implements C7561a<UnlockedStickerListApi> {

        /* renamed from: a */
        public static final C40952a f106467a = new C40952a();

        C40952a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m130815a();
        }

        /* renamed from: a */
        private static UnlockedStickerListApi m130815a() {
            return (UnlockedStickerListApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(TutorialVideoApiManager.f89507a).create(UnlockedStickerListApi.class);
        }
    }

    private UnlockedStickerProvider() {
    }
}
