package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import bolts.C1592h;
import com.google.common.util.concurrent.C18241d;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import java.io.IOException;
import java.util.LinkedHashMap;
import retrofit2.p363b.C7728d;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService */
public final class TTUploaderService {

    /* renamed from: b */
    public static volatile boolean f99815b;

    /* renamed from: a */
    public int f99816a = 0;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$RetrofitService */
    interface RetrofitService {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/upload/authkey/")
        C18253l<C39961gh> getUploadAuthKeyConfig(@C7728d LinkedHashMap<String, String> linkedHashMap);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.TTUploaderService$a */
    static class C38410a implements C18245g<VideoCreation> {

        /* renamed from: a */
        private int f99818a;

        public final void onFailure(Throwable th) {
        }

        public C38410a(int i) {
            this.f99818a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onSuccess(VideoCreation videoCreation) {
            TTUploaderService.f99815b = true;
            if (videoCreation instanceof C39961gh) {
                C35574k.m114859a().mo70091f().mo93340a(TTUploaderService.m122752a(this.f99818a), C35574k.m114859a().mo70085S().mo15979b((Object) videoCreation));
            }
        }
    }

    /* renamed from: a */
    public static void m122753a() {
        if (!f99815b) {
            C1592h.m7853a(C39943ge.f103728a);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ Void m122754b() throws Exception {
        IRetrofit createNewRetrofit = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI());
        C18246h.m60214a(((RetrofitService) createNewRetrofit.create(RetrofitService.class)).getUploadAuthKeyConfig(new LinkedHashMap(0)), (C18245g<? super V>) new C38410a<Object>(0), C18254m.m60217a());
        return null;
    }

    public TTUploaderService(int i) {
    }

    /* renamed from: a */
    public static Property m122752a(int i) {
        if (i == 0) {
            return Property.SdkV4AuthKey;
        }
        return Property.StorySdkV4AuthKey;
    }

    /* renamed from: a */
    public final C18253l<VideoCreation> mo96258a(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>(0);
        }
        C18253l uploadAuthKeyConfig = ((RetrofitService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(RetrofitService.class)).getUploadAuthKeyConfig(linkedHashMap);
        C18246h.m60214a(uploadAuthKeyConfig, (C18245g<? super V>) new C38410a<Object>(this.f99816a), C18254m.m60217a());
        return C18246h.m60209a(uploadAuthKeyConfig, IOException.class, new C18241d<IOException, Object>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C18253l mo47108a(IOException iOException) throws Exception {
                String e = C35574k.m114859a().mo70091f().mo93346e(TTUploaderService.m122752a(TTUploaderService.this.f99816a));
                if (TextUtils.isEmpty(e)) {
                    return C18246h.m60211a((Throwable) iOException);
                }
                return C18246h.m60210a(C35574k.m114859a().mo70085S().mo15974a(e, C39961gh.class));
            }
        }, C18254m.m60217a());
    }
}
