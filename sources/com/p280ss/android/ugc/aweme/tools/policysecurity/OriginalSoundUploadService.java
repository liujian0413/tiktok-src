package com.p280ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.SafeJobIntentService;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import bolts.C1606i;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1000ak.C22487c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.upload.C41434a;
import com.p280ss.android.ugc.aweme.shortvideo.upload.p1620a.C41435a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.C41639c;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42131a;
import com.p280ss.android.ugc.aweme.tools.p1665a.C42132b;
import com.p280ss.android.ugc.aweme.tools.policysecurity.C42579b.C42580a;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.text.C7634n;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService */
public final class OriginalSoundUploadService extends SafeJobIntentService {

    /* renamed from: a */
    public static final C42571a f110704a = new C42571a(null);

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$AudioUploadApi */
    public interface AudioUploadApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v2/aweme/audiotrack/update/")
        C1592h<BaseResponse> uploadAudio(@C7727c(mo20417a = "aweme_id") String str, @C7727c(mo20417a = "audiotrack_uri") String str2);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$a */
    public static final class C42571a {
        private C42571a() {
        }

        public /* synthetic */ C42571a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$b */
    public static final class C42572b implements TTVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ C39966gm f110705a;

        /* renamed from: b */
        final /* synthetic */ OriginalSoundUploadTask f110706b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f110707c;

        /* renamed from: d */
        final /* synthetic */ C1606i f110708d;

        public final String getStringFromExtern(int i) {
            return null;
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            return C41434a.m132073a(this.f110705a, "OriginalSoundUpload");
        }

        public final void onLog(int i, int i2, String str) {
            C41435a.m132074a(i, str);
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i != 0) {
                if (i == 2) {
                    ((TTVideoUploader) this.f110707c.element).close();
                    C1606i iVar = this.f110708d;
                    StringBuilder sb = new StringBuilder("upload failed ");
                    sb.append(j);
                    sb.append('.');
                    iVar.mo6902b((Exception) new IllegalArgumentException(sb.toString()));
                }
                return;
            }
            OriginalSoundUploadTask originalSoundUploadTask = this.f110706b;
            if (tTVideoInfo == null) {
                C7573i.m23580a();
            }
            originalSoundUploadTask.f110719a = tTVideoInfo.mVideoId;
            ((TTVideoUploader) this.f110707c.element).close();
            this.f110708d.mo6903b(this.f110706b);
        }

        C42572b(C39966gm gmVar, OriginalSoundUploadTask originalSoundUploadTask, ObjectRef objectRef, C1606i iVar) {
            this.f110705a = gmVar;
            this.f110706b = originalSoundUploadTask;
            this.f110707c = objectRef;
            this.f110708d = iVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$c */
    static final class C42573c<TTaskResult, TContinuationResult> implements C1591g<OriginalSoundUploadTask, C1592h<BaseResponse>> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadService f110709a;

        /* renamed from: b */
        final /* synthetic */ C39961gh f110710b;

        /* renamed from: c */
        final /* synthetic */ C42579b f110711c;

        /* renamed from: d */
        final /* synthetic */ ObjectRef f110712d;

        C42573c(OriginalSoundUploadService originalSoundUploadService, C39961gh ghVar, C42579b bVar, ObjectRef objectRef) {
            this.f110709a = originalSoundUploadService;
            this.f110710b = ghVar;
            this.f110711c = bVar;
            this.f110712d = objectRef;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<BaseResponse> then(C1592h<OriginalSoundUploadTask> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d() || hVar.mo6887c()) {
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                throw f;
            }
            C42579b bVar = this.f110711c;
            Object e = hVar.mo6890e();
            C7573i.m23582a(e, "it.result");
            bVar.mo104187b((OriginalSoundUploadTask) e);
            AudioUploadApi audioUploadApi = (AudioUploadApi) this.f110712d.element;
            C7573i.m23582a((Object) audioUploadApi, "api");
            Object e2 = hVar.mo6890e();
            C7573i.m23582a(e2, "it.result");
            return OriginalSoundUploadService.m135289a(audioUploadApi, (OriginalSoundUploadTask) e2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$d */
    static final class C42574d<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadTask f110713a;

        /* renamed from: b */
        final /* synthetic */ OriginalSoundUploadService f110714b;

        /* renamed from: c */
        final /* synthetic */ C39961gh f110715c;

        /* renamed from: d */
        final /* synthetic */ C42579b f110716d;

        /* renamed from: e */
        final /* synthetic */ ObjectRef f110717e;

        C42574d(OriginalSoundUploadTask originalSoundUploadTask, OriginalSoundUploadService originalSoundUploadService, C39961gh ghVar, C42579b bVar, ObjectRef objectRef) {
            this.f110713a = originalSoundUploadTask;
            this.f110714b = originalSoundUploadService;
            this.f110715c = ghVar;
            this.f110716d = bVar;
            this.f110717e = objectRef;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m135292a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135292a(C1592h<BaseResponse> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (!hVar.mo6889d() && !hVar.mo6887c()) {
                this.f110716d.mo104186a(this.f110713a.f110720b);
                new File(this.f110713a.f110722d).delete();
            } else if (hVar.mo6889d()) {
                if ((hVar.mo6891f() instanceof IllegalStateException) && hVar.mo6891f().getMessage() != null) {
                    String message = hVar.mo6891f().getMessage();
                    if (message == null) {
                        C7573i.m23580a();
                    }
                    if (C7634n.m23721b(message, "file error", false)) {
                        this.f110716d.mo104186a(this.f110713a.f110720b);
                        new File(this.f110713a.f110722d).delete();
                        return;
                    }
                }
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                throw f;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService$e */
    static final class C42575e<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ OriginalSoundUploadTask f110718a;

        C42575e(OriginalSoundUploadTask originalSoundUploadTask) {
            this.f110718a = originalSoundUploadTask;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m135293a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135293a(C1592h<C7581n> hVar) {
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6889d()) {
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "it.error");
                C6893q.m21452b("aweme_movie_publish_log", "upload_audio", C42131a.m134091a(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("success", "0"), C7579l.m23633a("success_mid", this.f110718a.f110721c), C7579l.m23633a("aweme_id", this.f110718a.f110720b), C7579l.m23633a("errorDesc", C42132b.m134092a(f))})));
                return;
            }
            C6893q.m21452b("aweme_movie_publish_log", "upload_audio", C42131a.m134091a(C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("success", "1"), C7579l.m23633a("success_mid", this.f110718a.f110721c), C7579l.m23633a("aweme_id", this.f110718a.f110720b)})));
        }
    }

    public final void onHandleWork(Intent intent) {
        boolean z;
        C7573i.m23587b(intent, "intent");
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        Object service = ServiceManager.get().getService(AVApi.class);
        C7573i.m23582a(service, "ServiceManager.get().getService(AVApi::class.java)");
        IRetrofit createNewRetrofit = iRetrofitService.createNewRetrofit(((AVApi) service).getAPI_URL_PREFIX_SI());
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (AudioUploadApi) createNewRetrofit.create(AudioUploadApi.class);
        Context applicationContext = getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "applicationContext");
        C42579b a = C42580a.m135303a(applicationContext);
        String e = C35574k.m114859a().mo70091f().mo93346e(Property.SdkV4AuthKey);
        if (!TextUtils.isEmpty(e)) {
            C39961gh ghVar = (C39961gh) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(e, C39961gh.class);
            Iterable a2 = a.mo104184a();
            Collection arrayList = new ArrayList();
            for (Object next : a2) {
                if (System.currentTimeMillis() - ((OriginalSoundUploadTask) next).f110723e > TimeUnit.DAYS.toMillis(1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (OriginalSoundUploadTask originalSoundUploadTask : (List) arrayList) {
                a.mo104186a(originalSoundUploadTask.f110720b);
                new File(originalSoundUploadTask.f110722d).delete();
            }
            for (OriginalSoundUploadTask originalSoundUploadTask2 : a.mo104184a()) {
                C7573i.m23582a((Object) ghVar, "config");
                C39966gm gmVar = ghVar.f103779a;
                C7573i.m23582a((Object) gmVar, "config.uploadVideoConfig");
                C1592h b = m135290a(originalSoundUploadTask2, gmVar).mo6879b((C1591g<TResult, C1592h<TContinuationResult>>) new C42573c<TResult,C1592h<TContinuationResult>>(this, ghVar, a, objectRef));
                C42574d dVar = new C42574d(originalSoundUploadTask2, this, ghVar, a, objectRef);
                b.mo6875a((C1591g<TResult, TContinuationResult>) dVar).mo6875a((C1591g<TResult, TContinuationResult>) new C42575e<TResult,TContinuationResult>(originalSoundUploadTask2)).mo6892g();
            }
        }
    }

    /* renamed from: a */
    public static C1592h<BaseResponse> m135289a(AudioUploadApi audioUploadApi, OriginalSoundUploadTask originalSoundUploadTask) {
        C7573i.m23587b(audioUploadApi, "api");
        C7573i.m23587b(originalSoundUploadTask, "task");
        String str = originalSoundUploadTask.f110720b;
        String str2 = originalSoundUploadTask.f110719a;
        if (str2 == null) {
            C7573i.m23580a();
        }
        return audioUploadApi.uploadAudio(str, str2);
    }

    /* renamed from: a */
    private static C1592h<OriginalSoundUploadTask> m135290a(OriginalSoundUploadTask originalSoundUploadTask, C39966gm gmVar) {
        C7573i.m23587b(originalSoundUploadTask, "task");
        C7573i.m23587b(gmVar, "config");
        if (originalSoundUploadTask.f110719a != null) {
            C1592h<OriginalSoundUploadTask> a = C1592h.m7851a(originalSoundUploadTask);
            C7573i.m23582a((Object) a, "Task.forResult(task)");
            return a;
        }
        int a2 = C41639c.m132544a(originalSoundUploadTask.f110722d);
        if (a2 != 0) {
            StringBuilder sb = new StringBuilder("file error, ");
            sb.append(originalSoundUploadTask.f110722d);
            sb.append(" checkResult = ");
            sb.append(a2);
            C1592h<OriginalSoundUploadTask> a3 = C1592h.m7850a((Exception) new IllegalStateException(sb.toString()));
            C7573i.m23582a((Object) a3, "Task.forError(IllegalSta…kResult = $checkResult\"))");
            return a3;
        }
        C1606i iVar = new C1606i();
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = null;
        try {
            objectRef.element = C22487c.m74374a();
            ((TTVideoUploader) objectRef.element).setListener(new C42572b(gmVar, originalSoundUploadTask, objectRef, iVar));
            ((TTVideoUploader) objectRef.element).setMaxFailTime(gmVar.f103822h);
            ((TTVideoUploader) objectRef.element).setEnableLogCallBack(gmVar.f103835u);
            ((TTVideoUploader) objectRef.element).setSliceSize(gmVar.f103820f);
            ((TTVideoUploader) objectRef.element).setFileUploadDomain(gmVar.f103816b);
            ((TTVideoUploader) objectRef.element).setVideoUploadDomain(gmVar.f103817c);
            ((TTVideoUploader) objectRef.element).setSliceTimeout(gmVar.f103818d);
            ((TTVideoUploader) objectRef.element).setPathName(originalSoundUploadTask.f110722d);
            ((TTVideoUploader) objectRef.element).setFileRetryCount(1);
            ((TTVideoUploader) objectRef.element).setUserKey(gmVar.f103815a);
            ((TTVideoUploader) objectRef.element).setAuthorization(gmVar.f103823i);
            ((TTVideoUploader) objectRef.element).setSocketNum(1);
            ((TTVideoUploader) objectRef.element).start();
        } catch (Exception unused) {
            TTVideoUploader tTVideoUploader = (TTVideoUploader) objectRef.element;
            if (tTVideoUploader != null) {
                tTVideoUploader.close();
            }
        }
        C1592h<TResult> hVar = iVar.f6010a;
        C7573i.m23582a((Object) hVar, "taskCompletionSource.task");
        return hVar;
    }
}
