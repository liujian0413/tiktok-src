package com.p280ss.android.ugc.aweme.sensitiveserver;

import bolts.C1592h;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.retrofit2.p264b.C6465p;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6470u;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;

/* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi */
final class SensitiveFileUploadApi {

    /* renamed from: a */
    private static final SensitiveFileService f97711a = ((SensitiveFileService) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(TutorialVideoApiManager.f89507a).mo26430a().mo26435a(SensitiveFileService.class));

    /* renamed from: com.ss.android.ugc.aweme.sensitiveserver.SensitiveFileUploadApi$SensitiveFileService */
    interface SensitiveFileService {
        @C6465p
        @C6468s(mo15750a = "/pssresource/external/upload")
        C1592h<String> uploadSensitiveFile(@C6470u(mo15752a = "file") TypedFile typedFile, @C6470u(mo15752a = "app_id") Integer num, @C6470u(mo15752a = "channel_key") TypedString typedString, @C6470u(mo15752a = "ftype") Integer num2);
    }

    /* renamed from: a */
    static C1592h<String> m120060a(TypedFile typedFile, Integer num, TypedString typedString, Integer num2) {
        return f97711a.uploadSensitiveFile(typedFile, num, typedString, num2);
    }
}
