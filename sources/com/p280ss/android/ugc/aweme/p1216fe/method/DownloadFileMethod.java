package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p280ss.android.socialbase.downloader.downloader.Downloader;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod */
public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener {

    /* renamed from: a */
    public static final C27885a f73460a = new C27885a(null);

    /* renamed from: b */
    private String f73461b;

    /* renamed from: c */
    private String f73462c;

    /* renamed from: d */
    private Integer f73463d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$a */
    public static final class C27885a {
        private C27885a() {
        }

        public /* synthetic */ C27885a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod$b */
    static final class C27886b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ DownloadFileMethod f73464a;

        /* renamed from: b */
        final /* synthetic */ String f73465b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f73466c;

        /* renamed from: d */
        final /* synthetic */ int f73467d;

        C27886b(DownloadFileMethod downloadFileMethod, String str, JSONObject jSONObject, int i) {
            this.f73464a = downloadFileMethod;
            this.f73465b = str;
            this.f73466c = jSONObject;
            this.f73467d = i;
        }

        public final /* synthetic */ Object call() {
            m91354a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91354a() {
            DownloadFileMethod.super.mo71359a(this.f73465b, this.f73466c, this.f73467d);
        }
    }

    public DownloadFileMethod() {
        this(null, 1, null);
    }

    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.f73463d;
        if (num != null) {
            Downloader.getInstance((Context) this.f73443f.get()).cancel(num.intValue());
        }
    }

    public DownloadFileMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private final void m91350a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Context context = (Context) this.f73443f.get();
            if (context != null) {
                C10761a.m31388a(context, context.getString(R.string.dik), 1).mo25750a();
            }
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            AwemeApplication.m21341a().sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    public final BaseCommonJavaMethod mo71360b(WeakReference<Context> weakReference) {
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null && (context instanceof C0043i)) {
                ((C0043i) context).getLifecycle().mo55a(this);
            }
        }
        BaseCommonJavaMethod b = super.mo71360b(weakReference);
        C7573i.m23582a((Object) b, "super.attach(contextRef)");
        return b;
    }

    public final void onCanceled(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "cancel");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onPause(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "pause");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onProgress(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put("type", "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onStart(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "start");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo != null && downloadInfo.getSavePath() != null && downloadInfo.getName() != null) {
            String path = new File(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
            String str = "notification";
            JSONObject jSONObject = new JSONObject();
            String str2 = "data";
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "success");
            if (path != null) {
                jSONObject2.put("path", path);
            }
            jSONObject.put(str2, jSONObject2);
            jSONObject.put("eventName", "download_status_change");
            m91351b(str, jSONObject, 3);
            if (TextUtils.equals(this.f73462c, "image")) {
                m91350a(path);
            }
        }
    }

    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "restart");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
    }

    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", "error");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("eventName", "download_status_change");
        m91351b("notification", jSONObject, 3);
        if (TextUtils.equals(this.f73462c, "image")) {
            Context context = (Context) this.f73443f.get();
            if (context != null) {
                C10761a.m31388a(context, context.getString(R.string.dij), 1).mo25750a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64209a(org.json.JSONObject r7, com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a r8) {
        /*
            r6 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "code"
            int r2 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78751d
            r0.put(r1, r2)
            java.lang.ref.WeakReference r1 = r6.f73443f
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x00fd
            java.lang.String r2 = "reason"
            java.lang.String r3 = "params insufficient"
            r0.put(r2, r3)
            r2 = 0
            if (r7 == 0) goto L_0x0027
            java.lang.String r3 = "url"
            java.lang.String r3 = r7.optString(r3)
            goto L_0x0028
        L_0x0027:
            r3 = r2
        L_0x0028:
            boolean r3 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r3)
            if (r3 == 0) goto L_0x0040
            if (r7 == 0) goto L_0x0037
            java.lang.String r3 = "suffix"
            java.lang.String r3 = r7.optString(r3)
            goto L_0x0038
        L_0x0037:
            r3 = r2
        L_0x0038:
            boolean r3 = com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b.m77913a(r3)
            if (r3 == 0) goto L_0x0040
            r3 = 1
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r1 = r2
        L_0x0045:
            if (r1 == 0) goto L_0x00fd
            if (r7 == 0) goto L_0x0050
            java.lang.String r3 = "url"
            java.lang.String r3 = r7.optString(r3)
            goto L_0x0051
        L_0x0050:
            r3 = r2
        L_0x0051:
            r6.f73461b = r3
            if (r7 == 0) goto L_0x005c
            java.lang.String r3 = "type"
            java.lang.String r3 = r7.optString(r3)
            goto L_0x005d
        L_0x005c:
            r3 = r2
        L_0x005d:
            r6.f73462c = r3
            java.lang.String r3 = r6.f73462c
            java.lang.String r4 = "image"
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r3, r4)
            if (r3 == 0) goto L_0x0083
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.f73461b
            java.lang.String r4 = com.bytedance.sdk.account.p650b.p654d.C12748a.m37035a(r4)
            r3.append(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0089
        L_0x0083:
            java.lang.String r3 = r6.f73461b
            java.lang.String r3 = com.bytedance.sdk.account.p650b.p654d.C12748a.m37035a(r3)
        L_0x0089:
            if (r7 == 0) goto L_0x0091
            java.lang.String r2 = "suffix"
            java.lang.String r2 = r7.optString(r2)
        L_0x0091:
            java.lang.ref.WeakReference r7 = r6.f73443f
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r7 = com.p280ss.android.ugc.aweme.video.p1700d.C43211f.m137011a(r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            boolean r4 = com.p280ss.android.ugc.aweme.utils.C42973bg.m136427a(r3)
            if (r4 != 0) goto L_0x00f1
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = com.p280ss.android.socialbase.downloader.downloader.Downloader.with(r1)
            java.lang.String r3 = r6.f73461b
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.url(r3)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.name(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r7 = r1.savePath(r7)
            r1 = r6
            com.ss.android.socialbase.downloader.depend.IDownloadListener r1 = (com.p280ss.android.socialbase.downloader.depend.IDownloadListener) r1
            com.ss.android.socialbase.downloader.model.DownloadTask r7 = r7.subThreadListener(r1)
            int r7 = r7.download()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.f73463d = r7
            java.lang.String r7 = "reason"
            r0.remove(r7)
            java.lang.String r7 = "code"
            int r1 = com.p280ss.android.ugc.aweme.framework.p1274c.C29956a.f78750c
            r0.put(r7, r1)
            goto L_0x00fd
        L_0x00f1:
            java.lang.String r7 = "reason"
            java.lang.String r1 = "file already exists"
            r0.put(r7, r1)
            java.lang.String r7 = "path"
            r0.put(r7, r3)
        L_0x00fd:
            r8.mo71365a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.DownloadFileMethod.mo64209a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }

    private /* synthetic */ DownloadFileMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }

    /* renamed from: b */
    private final void m91351b(String str, JSONObject jSONObject, int i) {
        C1592h.m7855a((Callable<TResult>) new C27886b<TResult>(this, str, jSONObject, 3), C1592h.f5958b);
    }
}
