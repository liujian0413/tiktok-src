package com.p280ss.android.ugc.aweme.tools.extract.upload;

import android.content.Intent;
import android.support.p022v4.app.SafeJobIntentService;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39962gi;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41500y;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import com.p280ss.android.ugc.aweme.utils.C43136fo;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploader;
import com.p280ss.ttuploader.TTImageUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService */
public class VideoFramesUploadService extends SafeJobIntentService {

    /* renamed from: a */
    public static final String f110113a = "VideoFramesUploadService";

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.upload.VideoFramesUploadService$FramesUploadApi */
    interface FramesUploadApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v2/aweme/vframe/update/")
        C1592h<BaseResponse> uploadFrame(@C7727c(mo20417a = "aweme_id") String str, @C7727c(mo20417a = "video_id") String str2, @C7727c(mo20417a = "vframe_uri") String str3);

        @C7729e
        @C7739o(mo20429a = "/aweme/v2/aweme/vframe/update/")
        C1592h<BaseResponse> uploadFrame(@C7727c(mo20417a = "aweme_id") String str, @C7727c(mo20417a = "video_id") String str2, @C7727c(mo20417a = "vframe_uri") String str3, @C7727c(mo20417a = "stickers") String str4);
    }

    /* renamed from: a */
    private static C1592h<C42340b> m134625a(C42340b bVar) {
        if (bVar == null) {
            return C1592h.m7850a((Exception) new IllegalStateException("the upload model is null"));
        }
        if (!TextUtils.isEmpty(bVar.f110133d) && new File(bVar.f110133d).exists()) {
            return C1592h.m7851a(bVar);
        }
        List allFrames = bVar.f110134e.getAllFrames();
        if (bVar.f110134e == null || allFrames.isEmpty()) {
            return C1592h.m7850a((Exception) new IllegalStateException("the upload frames is empty"));
        }
        bVar.f110133d = C43136fo.m136826a(bVar.f110134e.extractFramesDir, (List<String>) new ArrayList<String>(allFrames));
        if (bVar.f110133d == null || !C7276d.m22812b(bVar.f110133d)) {
            return C1592h.m7850a((Exception) new IllegalStateException("the upload zipPath is empty"));
        }
        return C1592h.m7851a(bVar);
    }

    public void onHandleWork(Intent intent) {
        String str;
        final FramesUploadApi framesUploadApi = (FramesUploadApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(((AVApi) ServiceManager.get().getService(AVApi.class)).getAPI_URL_PREFIX_SI()).create(FramesUploadApi.class);
        final C42339a a = C42339a.m134629a(getApplicationContext());
        if (intent != null) {
            str = intent.getStringExtra("authkey");
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            final C39961gh ghVar = (C39961gh) new C6607f().mo15992f().mo15974a(str, C39961gh.class);
            if (ghVar != null && ghVar.f103781c != null) {
                List a2 = a.mo103819a();
                if (!a2.isEmpty()) {
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        final C42340b bVar = (C42340b) it.next();
                        if (System.currentTimeMillis() - bVar.f110135f > TimeUnit.DAYS.toMillis(1)) {
                            it.remove();
                            a.mo103821a(bVar.f110130a);
                            if (bVar.f110134e != null) {
                                C7276d.m22822e(bVar.f110134e.extractFramesDir);
                                C7276d.m22816c(bVar.f110134e.extractFramesDir);
                            }
                        } else {
                            try {
                                m134625a(bVar).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<C42340b, C1592h<C42340b>>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public C1592h<C42340b> then(C1592h<C42340b> hVar) {
                                        if (hVar.mo6889d()) {
                                            return C1592h.m7850a(hVar.mo6891f());
                                        }
                                        a.mo103820a((C42340b) hVar.mo6890e());
                                        return VideoFramesUploadService.this.mo103816a(bVar, ghVar.f103781c);
                                    }
                                }).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C1591g<C42340b, C1592h<BaseResponse>>() {
                                    /* access modifiers changed from: private */
                                    /* renamed from: a */
                                    public C1592h<BaseResponse> then(C1592h<C42340b> hVar) {
                                        if (hVar.mo6889d()) {
                                            return C1592h.m7850a(hVar.mo6891f());
                                        }
                                        C42340b bVar = (C42340b) hVar.mo6890e();
                                        a.mo103820a(bVar);
                                        if (bVar == null || bVar.f110134e == null || bVar.f110134e.getStickerIds() == null) {
                                            return framesUploadApi.uploadFrame(bVar.f110130a, bVar.f110131b, bVar.f110132c);
                                        }
                                        return framesUploadApi.uploadFrame(bVar.f110130a, bVar.f110131b, bVar.f110132c, bVar.f110134e.getStickerIds());
                                    }
                                }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<BaseResponse, Object>() {
                                    public final Object then(C1592h<BaseResponse> hVar) {
                                        if (hVar.mo6889d()) {
                                            return null;
                                        }
                                        a.mo103821a(bVar.f110130a);
                                        C7276d.m22822e(bVar.f110134e.extractFramesDir);
                                        C7276d.m22816c(bVar.f110134e.extractFramesDir);
                                        return null;
                                    }
                                }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Object, Object>() {
                                    public final Object then(C1592h<Object> hVar) {
                                        return hVar.mo6889d() ? null : null;
                                    }
                                }).mo6892g();
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1592h<C42340b> mo103816a(final C42340b bVar, C39962gi giVar) {
        final TTImageUploader b;
        if (!TextUtils.isEmpty(bVar.f110132c)) {
            return C1592h.m7851a(bVar);
        }
        final C1606i iVar = new C1606i();
        try {
            b = C22487c.m74375b();
            b.setListener(new TTImageUploaderListener() {
                public final void onNotify(int i, long j, TTImageInfo tTImageInfo) {
                    if (i == 3) {
                        b.close();
                        bVar.f110132c = tTImageInfo.mImageUri;
                        iVar.mo6903b(bVar);
                        return;
                    }
                    if (i == 4) {
                        b.close();
                        iVar.mo6902b((Exception) new IllegalStateException("upload zip file failed"));
                    }
                }
            });
            if (C6399b.m19944t()) {
                C41500y yVar = new C41500y();
                yVar.mo102158a(giVar);
                b.setServerParameter(yVar.mo102157a());
            }
            b.setSliceSize(giVar.f103787f);
            b.setFileUploadDomain(giVar.f103783b);
            b.setImageUploadDomain(giVar.f103784c);
            b.setSliceTimeout(giVar.f103788g);
            b.setSliceReTryCount(giVar.f103789h);
            int i = 1;
            b.setFilePath(1, new String[]{bVar.f110133d});
            if (giVar.f103785d > 0) {
                i = giVar.f103785d;
            }
            b.setFileRetryCount(i);
            b.setUserKey(giVar.f103782a);
            b.setEnableHttps(giVar.f103791j);
            b.setAuthorization(giVar.f103790i);
            b.start();
        } catch (Exception e) {
            b.close();
            throw e;
        } catch (Throwable th) {
            iVar.mo6902b(new Exception(th));
        }
        return iVar.f6010a;
    }
}
