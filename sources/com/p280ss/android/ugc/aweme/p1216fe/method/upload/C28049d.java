package com.p280ss.android.ugc.aweme.p1216fe.method.upload;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27940a.C27943a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27996m;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.GetUploadConfigService.UploadConfigService;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1222a.C28036a;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1222a.C28037b;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1223b.C28039a;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.p1223b.C28040b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.utils.permission.C43162f;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.text.C48038d;
import org.apache.commons.codec.binary.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d */
public final class C28049d implements C28035a {

    /* renamed from: e */
    public static final C28050a f73897e = new C28050a(null);

    /* renamed from: a */
    public TTVideoUploader f73898a;

    /* renamed from: b */
    public WeakReference<Activity> f73899b;

    /* renamed from: c */
    public C27943a f73900c;

    /* renamed from: d */
    public C27996m f73901d;

    /* renamed from: f */
    private UploadConfigService f73902f = new GetUploadConfigService().f73785a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$a */
    public static final class C28050a {
        private C28050a() {
        }

        public /* synthetic */ C28050a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$b */
    final class C28051b implements TTVideoUploaderListener {
        public final String getStringFromExtern(int i) {
            return "";
        }

        public final void onLog(int i, int i2, String str) {
        }

        public C28051b() {
        }

        public final int videoUploadCheckNetState(int i, int i2) {
            if (C28049d.this.f73899b.get() != null) {
                Object obj = C28049d.this.f73899b.get();
                if (obj != null) {
                    Object systemService = ((Activity) obj).getSystemService("connectivity");
                    if (systemService == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                    } else if (((ConnectivityManager) systemService).getActiveNetworkInfo() != null) {
                        return 1;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
                }
            }
            return 0;
        }

        public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
            if (i == 0) {
                try {
                    C28049d dVar = C28049d.this;
                    if (tTVideoInfo == null) {
                        C7573i.m23580a();
                    }
                    String str = tTVideoInfo.mVideoId;
                    C7573i.m23582a((Object) str, "info!!.mVideoId");
                    dVar.mo71492a(str, 3);
                    C28049d.m91670a(C28049d.this).close();
                } catch (Exception unused) {
                }
            } else {
                if (i == 2) {
                    C28049d.this.mo71490a(0, "uploadFailed");
                    try {
                        C28049d.m91670a(C28049d.this).close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$c */
    static final class C28052c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C28049d f73904a;

        C28052c(C28049d dVar) {
            this.f73904a = dVar;
            super(0);
        }

        /* renamed from: a */
        private void m91680a() {
            this.f73904a.mo71493b();
        }

        public final /* synthetic */ Object invoke() {
            m91680a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$d */
    static final class C28053d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C28049d f73905a;

        C28053d(C28049d dVar) {
            this.f73905a = dVar;
            super(0);
        }

        /* renamed from: a */
        private void m91681a() {
            this.f73905a.mo71494c();
        }

        public final /* synthetic */ Object invoke() {
            m91681a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$e */
    public static final class C28054e implements C35547a {

        /* renamed from: a */
        final /* synthetic */ C28049d f73906a;

        /* renamed from: b */
        final /* synthetic */ Intent f73907b;

        public final void onSuccess() {
            String str;
            C28049d dVar = this.f73906a;
            Intent intent = this.f73907b;
            if (intent != null) {
                str = intent.getStringExtra("filePath");
            } else {
                str = null;
            }
            dVar.mo71491a(str);
        }

        C28054e(C28049d dVar, Intent intent) {
            this.f73906a = dVar;
            this.f73907b = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$f */
    static final class C28055f<TTaskResult, TContinuationResult> implements C1591g<C28039a, Void> {

        /* renamed from: a */
        final /* synthetic */ C28049d f73908a;

        /* renamed from: b */
        final /* synthetic */ int f73909b;

        /* renamed from: c */
        final /* synthetic */ String f73910c;

        C28055f(C28049d dVar, int i, String str) {
            this.f73908a = dVar;
            this.f73909b = i;
            this.f73910c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C28039a> hVar) {
            if (hVar != null && !hVar.mo6889d() && ((C28039a) hVar.mo6890e()).f73859a == 0) {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                C28040b bVar = ((C28039a) hVar.mo6890e()).f73861c;
                if (bVar != null) {
                    String str = "mainUrl";
                    String str2 = bVar.f73862a;
                    Charset charset = C48038d.f122880a;
                    if (str2 != null) {
                        byte[] bytes = str2.getBytes(charset);
                        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        byte[] decodeBase64 = Base64.decodeBase64(bytes);
                        C7573i.m23582a((Object) decodeBase64, "Base64.decodeBase64(uplo…e.videoUrl.toByteArray())");
                        jSONObject.put(str, new String(decodeBase64, C48038d.f122880a));
                        jSONObject.put("posterUrl", bVar.f73864c);
                        String str3 = "backupUrl";
                        String str4 = bVar.f73863b;
                        Charset charset2 = C48038d.f122880a;
                        if (str4 != null) {
                            byte[] bytes2 = str4.getBytes(charset2);
                            C7573i.m23582a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
                            byte[] decodeBase642 = Base64.decodeBase64(bytes2);
                            C7573i.m23582a((Object) decodeBase642, "Base64.decodeBase64(uplo…oBackupUrl.toByteArray())");
                            jSONObject.put(str3, new String(decodeBase642, C48038d.f122880a));
                            jSONObject.put("mediaType", bVar.f73865d);
                            jSONArray.put(jSONObject);
                            this.f73908a.f73901d.mo71400a(jSONArray);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
            } else if (this.f73909b > 0) {
                Thread.sleep(1000);
                this.f73908a.mo71492a(this.f73910c, this.f73909b - 1);
            } else if (hVar == null || hVar.mo6889d()) {
                this.f73908a.mo71490a(0, "uploadFailed");
            } else if (((C28039a) hVar.mo6890e()).f73859a != 0) {
                this.f73908a.mo71490a(((C28039a) hVar.mo6890e()).f73859a, ((C28039a) hVar.mo6890e()).f73860b);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$g */
    static final class C28056g implements C22480b {

        /* renamed from: a */
        final /* synthetic */ Activity f73911a;

        /* renamed from: b */
        final /* synthetic */ C28049d f73912b;

        /* renamed from: c */
        final /* synthetic */ C7561a f73913c;

        C28056g(Activity activity, C28049d dVar, C7561a aVar) {
            this.f73911a = activity;
            this.f73912b = dVar;
            this.f73913c = aVar;
        }

        /* renamed from: a */
        public final void mo53549a(String[] strArr, int[] iArr) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                this.f73913c.invoke();
                return;
            }
            if (iArr[0] != 0) {
                C10761a.m31404c((Context) this.f73911a, this.f73911a.getString(R.string.ct5), 0).mo25750a();
            }
            if (iArr[1] != 0) {
                C10761a.m31404c((Context) this.f73911a, this.f73911a.getString(R.string.ct3), 0).mo25750a();
            }
            this.f73912b.f73901d.mo71399a(-1, "uploadFailed");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$h */
    static final class C28057h<TTaskResult, TContinuationResult> implements C1591g<C28036a, Void> {

        /* renamed from: a */
        final /* synthetic */ C28049d f73914a;

        /* renamed from: b */
        final /* synthetic */ String f73915b;

        C28057h(C28049d dVar, String str) {
            this.f73914a = dVar;
            this.f73915b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C28036a> hVar) {
            if (hVar == null || hVar.mo6889d() || ((C28036a) hVar.mo6890e()).f73844a != 0) {
                if (hVar == null || hVar.mo6889d()) {
                    this.f73914a.mo71490a(0, "uploadFailed");
                } else if (((C28036a) hVar.mo6890e()).f73844a != 0) {
                    this.f73914a.mo71490a(((C28036a) hVar.mo6890e()).f73844a, ((C28036a) hVar.mo6890e()).f73845b);
                }
                try {
                    C28049d.m91670a(this.f73914a).close();
                } catch (Exception unused) {
                }
            } else {
                C28037b bVar = ((C28036a) hVar.mo6890e()).f73846c;
                if (bVar != null) {
                    if (new File(this.f73915b).length() > ((long) bVar.f73857k)) {
                        C10761a.m31392b((Context) this.f73914a.f73899b.get(), (int) R.string.foq, 0).mo25750a();
                        this.f73914a.mo71490a(0, "uploadFailed");
                    } else {
                        TTVideoUploader a = C28049d.m91670a(this.f73914a);
                        try {
                            a.setPathName(this.f73915b);
                            a.setAuthorization(bVar.f73848b);
                            a.setFileRetryCount(bVar.f73855i);
                            a.setUserKey(bVar.f73847a);
                            a.setEnableHttps(bVar.f73858l);
                            a.setSliceTimeout(bVar.f73851e);
                            a.setSliceReTryCount(bVar.f73852f);
                            a.setSliceSize(bVar.f73853g);
                            a.setSocketNum(bVar.f73854h);
                            a.setMaxFailTime(bVar.f73856j);
                            a.setVideoUploadDomain(bVar.f73849c);
                            a.setListener(new C28051b());
                            a.start();
                        } catch (Exception unused2) {
                        }
                        this.f73914a.f73900c.mo71421a((Context) this.f73914a.f73899b.get(), this.f73914a);
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo71423a() {
        try {
            TTVideoUploader tTVideoUploader = this.f73898a;
            if (tTVideoUploader == null) {
                C7573i.m23583a("uploader");
            }
            tTVideoUploader.stop();
            TTVideoUploader tTVideoUploader2 = this.f73898a;
            if (tTVideoUploader2 == null) {
                C7573i.m23583a("uploader");
            }
            tTVideoUploader2.close();
            mo71490a(0, "uploadCancel");
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo71493b() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Activity activity = (Activity) this.f73899b.get();
        if (activity != null) {
            activity.startActivityForResult(intent, 800);
        }
    }

    /* renamed from: c */
    public final void mo71494c() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        Activity activity = (Activity) this.f73899b.get();
        if (activity != null) {
            activity.startActivityForResult(intent, 700);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ TTVideoUploader m91670a(C28049d dVar) {
        TTVideoUploader tTVideoUploader = dVar.f73898a;
        if (tTVideoUploader == null) {
            C7573i.m23583a("uploader");
        }
        return tTVideoUploader;
    }

    /* renamed from: a */
    private final void m91671a(C7561a<C7581n> aVar) {
        Activity activity = (Activity) this.f73899b.get();
        if (activity != null) {
            Context context = activity;
            if (C43162f.m136885a(context) == 0 && C43162f.m136888c(context) == 0) {
                aVar.invoke();
            } else {
                C22477b.m74364a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA"}, new C28056g(activity, this, aVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo71491a(String str) {
        if (str != null) {
            this.f73898a = new TTVideoUploader();
            Object service = ServiceManager.get().getService(IAVServiceProxy.class);
            C7573i.m23582a(service, "ServiceManager.get().get…ServiceProxy::class.java)");
            ((IAVServiceProxy) service).getShortVideoPluginService();
            this.f73902f.getUploadAuthConfig().mo6876a((C1591g<TResult, TContinuationResult>) new C28057h<TResult,TContinuationResult>(this, str), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo71425a(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "params");
        int optInt = jSONObject.optInt("type");
        if (optInt == 700) {
            m91671a((C7561a<C7581n>) new C28053d<C7581n>(this));
        } else if (optInt == 800) {
            m91671a((C7561a<C7581n>) new C28052c<C7581n>(this));
        }
    }

    /* renamed from: a */
    public final void mo71490a(int i, String str) {
        this.f73901d.mo71399a(i, str);
    }

    /* renamed from: a */
    public final void mo71492a(String str, int i) {
        this.f73902f.getUploadPlayUrlResponse(str).mo6876a((C1591g<TResult, TContinuationResult>) new C28055f<TResult,TContinuationResult>(this, i, str), (Executor) C1592h.f5957a);
    }

    public C28049d(WeakReference<Activity> weakReference, C27943a aVar, C27996m mVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "dialog");
        C7573i.m23587b(mVar, "onFileSelected");
        this.f73899b = weakReference;
        this.f73900c = aVar;
        this.f73901d = mVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r6 != 900) goto L_0x00cc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo71426a(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r0 = 600(0x258, float:8.41E-43)
            r1 = 0
            r2 = 1
            if (r6 == r0) goto L_0x0098
            r3 = 0
            r4 = 700(0x2bc, float:9.81E-43)
            if (r6 == r4) goto L_0x0057
            r0 = 900(0x384, float:1.261E-42)
            r4 = 800(0x320, float:1.121E-42)
            if (r6 == r4) goto L_0x0015
            if (r6 == r0) goto L_0x0098
            goto L_0x00cc
        L_0x0015:
            if (r7 != 0) goto L_0x001d
            java.lang.String r6 = "uploadCancel"
            r5.mo71490a(r1, r6)
            return r2
        L_0x001d:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f73899b
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r8 == 0) goto L_0x002b
            android.net.Uri r3 = r8.getData()
        L_0x002b:
            java.lang.String r6 = com.p280ss.android.newmedia.C19929d.m65756a(r6, r3)
            android.content.Intent r7 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r8 = r5.f73899b
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r1 = com.p280ss.android.ugc.aweme.p1216fe.method.upload.PreviewUploadActivity.class
            r7.<init>(r8, r1)
            java.lang.String r8 = "filePath"
            r7.putExtra(r8, r6)
            java.lang.String r6 = "src"
            r7.putExtra(r6, r4)
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f73899b
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00cc
            r6.startActivityForResult(r7, r0)
            goto L_0x00cc
        L_0x0057:
            if (r7 != 0) goto L_0x005f
            java.lang.String r6 = "uploadCancel"
            r5.mo71490a(r1, r6)
            return r2
        L_0x005f:
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f73899b
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            if (r8 == 0) goto L_0x006d
            android.net.Uri r3 = r8.getData()
        L_0x006d:
            java.lang.String r6 = com.p280ss.android.newmedia.C19929d.m65756a(r6, r3)
            android.content.Intent r7 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r8 = r5.f73899b
            java.lang.Object r8 = r8.get()
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r1 = com.p280ss.android.ugc.aweme.p1216fe.method.upload.PreviewUploadActivity.class
            r7.<init>(r8, r1)
            java.lang.String r8 = "filePath"
            r7.putExtra(r8, r6)
            java.lang.String r6 = "src"
            r7.putExtra(r6, r4)
            java.lang.ref.WeakReference<android.app.Activity> r6 = r5.f73899b
            java.lang.Object r6 = r6.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00cc
            r6.startActivityForResult(r7, r0)
            goto L_0x00cc
        L_0x0098:
            r6 = -1
            if (r7 != r6) goto L_0x00c5
            com.ss.android.ugc.aweme.framework.services.ServiceManager r6 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IAVServiceProxy> r7 = com.p280ss.android.ugc.aweme.services.IAVServiceProxy.class
            java.lang.Object r6 = r6.getService(r7)
            java.lang.String r7 = "ServiceManager.get().get…ServiceProxy::class.java)"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            com.ss.android.ugc.aweme.services.IAVServiceProxy r6 = (com.p280ss.android.ugc.aweme.services.IAVServiceProxy) r6
            com.ss.android.ugc.aweme.port.in.al r6 = r6.getShortVideoPluginService()
            java.lang.ref.WeakReference<android.app.Activity> r7 = r5.f73899b
            java.lang.Object r7 = r7.get()
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = "ttvideouploader"
            com.ss.android.ugc.aweme.fe.method.upload.d$e r1 = new com.ss.android.ugc.aweme.fe.method.upload.d$e
            r1.<init>(r5, r8)
            com.ss.android.ugc.aweme.port.in.al$a r1 = (com.p280ss.android.ugc.aweme.port.p1479in.C35546al.C35547a) r1
            r6.mo90367a(r7, r2, r0, r1)
            goto L_0x00cc
        L_0x00c5:
            if (r7 != 0) goto L_0x00cc
            java.lang.String r6 = "uploadCancel"
            r5.mo71490a(r1, r6)
        L_0x00cc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.upload.C28049d.mo71426a(int, int, android.content.Intent):boolean");
    }
}
