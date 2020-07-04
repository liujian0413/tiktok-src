package com.p280ss.android.ugc.aweme.comment.api;

import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.comment.model.GifEmojiResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IMainService;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi */
public interface GifEmojiApi {

    /* renamed from: a */
    public static final C24082a f63690a = C24082a.f63692b;

    /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a */
    public static final class C24082a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f63691a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C24082a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/comment/api/GifEmojiApi;"))};

        /* renamed from: b */
        static final /* synthetic */ C24082a f63692b;

        /* renamed from: c */
        private static final C7541d f63693c;

        /* renamed from: com.ss.android.ugc.aweme.comment.api.GifEmojiApi$a$a */
        static final class C24083a extends Lambda implements C7561a<GifEmojiApi> {

            /* renamed from: a */
            final /* synthetic */ C24082a f63694a;

            C24083a(C24082a aVar) {
                this.f63694a = aVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public GifEmojiApi invoke() {
                return C24082a.m79019b();
            }
        }

        private C24082a() {
        }

        /* renamed from: a */
        public static GifEmojiApi m79018a() {
            return (GifEmojiApi) f63693c.getValue();
        }

        static {
            C24082a aVar = new C24082a();
            f63692b = aVar;
            f63693c = C7546e.m23569a(new C24083a(aVar));
        }

        /* renamed from: b */
        public static GifEmojiApi m79019b() {
            IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
            Object create = iRetrofitService.createNewRetrofit(((IMainService) service).getApiUrlPrefix()).create(GifEmojiApi.class);
            C7573i.m23582a(create, "ServiceManager.get()\n   …(GifEmojiApi::class.java)");
            return (GifEmojiApi) create;
        }
    }

    @C7730f(mo20420a = "aweme/v1/im/resources/sticker/collect/")
    C7492s<BaseResponse> collectGifEmoji(@C7744t(mo20436a = "action") int i, @C7744t(mo20436a = "sticker_ids") String str, @C7744t(mo20436a = "sticker_source") int i2);

    @C7730f(mo20420a = "aweme/v1/im/resources/emoticon/search/")
    C7492s<GifEmojiResponse> searchGifEmoji(@C7744t(mo20436a = "keyword") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "source") String str2);
}
