package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1222a.C28036a;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1223b.C28039a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService */
public final class GetUploadConfigService {

    /* renamed from: b */
    public static final C28017a f73784b = new C28017a(null);

    /* renamed from: a */
    public final UploadConfigService f73785a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService$UploadConfigService */
    public interface UploadConfigService {
        @C7730f(mo20420a = "common/upload_settings")
        C1592h<C28036a> getUploadAuthConfig();

        @C7730f(mo20420a = "common/play_url")
        C1592h<C28039a> getUploadPlayUrlResponse(@C7744t(mo20436a = "video_id") String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.GetUploadConfigService$a */
    public static final class C28017a {
        private C28017a() {
        }

        public /* synthetic */ C28017a(C7571f fVar) {
            this();
        }
    }

    public GetUploadConfigService() {
        Object a = C22838j.m75274a("https://ec.snssdk.com/").mo30492a(UploadConfigService.class);
        C7573i.m23582a(a, "RetrofitFactory.createTT…onfigService::class.java)");
        this.f73785a = (UploadConfigService) a;
    }
}
