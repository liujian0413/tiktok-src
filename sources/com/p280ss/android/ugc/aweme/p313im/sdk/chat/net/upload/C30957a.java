package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload;

import android.os.SystemClock;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.google.common.util.concurrent.C18254m;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EncryptedVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30966a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.ttuploader.TTImageInfo;
import com.p280ss.ttuploader.TTImageUploader;
import com.p280ss.ttuploader.TTVideoInfo;
import com.p280ss.ttuploader.TTVideoUploader;
import com.p280ss.ttuploader.TTVideoUploaderListener;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a */
public class C30957a {

    /* renamed from: h */
    private static volatile C30957a f81060h;

    /* renamed from: a */
    public final Object f81061a = new Object();

    /* renamed from: b */
    public volatile boolean f81062b = false;

    /* renamed from: c */
    public volatile boolean f81063c = false;

    /* renamed from: d */
    public final Object f81064d = new Object();

    /* renamed from: e */
    public volatile boolean f81065e = false;

    /* renamed from: f */
    public volatile boolean f81066f = false;

    /* renamed from: g */
    public int f81067g = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (m100749a(r11) != false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81328a(java.lang.String r8, int r9, com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y r10, boolean r11) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r8 = "96"
            r10.mo18259a(r8)     // Catch:{ Exception -> 0x00c4 }
            return
        L_0x000c:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00c4 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00c4 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x00c4 }
            if (r1 == 0) goto L_0x00be
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00c4 }
            if (r0 != 0) goto L_0x001f
            goto L_0x00be
        L_0x001f:
            if (r11 != 0) goto L_0x003d
            com.ss.android.ugc.aweme.im.sdk.utils.p r11 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r11 = r11.mo18313e()     // Catch:{ Exception -> 0x00c4 }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x00c4 }
            if (r0 != 0) goto L_0x003d
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig> r0 = com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig.class
            java.lang.Object r11 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r11, r0)     // Catch:{ Exception -> 0x00c4 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig r11 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig) r11     // Catch:{ Exception -> 0x00c4 }
            boolean r0 = m100749a(r11)     // Catch:{ Exception -> 0x00c4 }
            if (r0 == 0) goto L_0x0047
        L_0x003d:
            com.google.common.util.concurrent.l r11 = r7.m100750b()     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object r11 = r11.get()     // Catch:{ Exception -> 0x00c4 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig r11 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig) r11     // Catch:{ Exception -> 0x00c4 }
        L_0x0047:
            if (r11 != 0) goto L_0x004f
            java.lang.String r8 = "97"
            r10.mo18259a(r8)     // Catch:{ Exception -> 0x00c4 }
            return
        L_0x004f:
            r0 = 1
            if (r9 != r0) goto L_0x0058
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadImageConfig r11 = r11.getInnerImageConfig()     // Catch:{ Exception -> 0x00c4 }
        L_0x0056:
            r5 = r11
            goto L_0x005d
        L_0x0058:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadImageConfig r11 = r11.getPublicImageConfig()     // Catch:{ Exception -> 0x00c4 }
            goto L_0x0056
        L_0x005d:
            com.ss.android.ugc.aweme.im.sdk.d.a r11 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()     // Catch:{ Exception -> 0x00c4 }
            com.ss.android.ugc.aweme.im.service.h r11 = r11.mo18009f()     // Catch:{ Exception -> 0x00c4 }
            if (r11 != 0) goto L_0x0068
            return
        L_0x0068:
            boolean r1 = r11.isCheckPlugin()     // Catch:{ Exception -> 0x00c4 }
            if (r1 == 0) goto L_0x00b5
            boolean r1 = r7.f81062b     // Catch:{ Exception -> 0x00c4 }
            if (r1 != 0) goto L_0x00b5
            r1 = 0
            r7.f81063c = r1     // Catch:{ Exception -> 0x00c4 }
            android.app.Activity r1 = r11.getCurrentActivity()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = "ttvideouploader"
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a$2 r3 = new com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a$2     // Catch:{ Exception -> 0x00c4 }
            r3.<init>()     // Catch:{ Exception -> 0x00c4 }
            r11.checkPluginAndLoadLibrary(r1, r0, r2, r3)     // Catch:{ Exception -> 0x00c4 }
            java.lang.Object r11 = r7.f81061a     // Catch:{ Exception -> 0x00c4 }
            monitor-enter(r11)     // Catch:{ Exception -> 0x00c4 }
        L_0x0086:
            boolean r0 = r7.f81062b     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0094
            boolean r0 = r7.f81063c     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0094
            java.lang.Object r0 = r7.f81061a     // Catch:{ all -> 0x00b2 }
            r0.wait()     // Catch:{ all -> 0x00b2 }
            goto L_0x0086
        L_0x0094:
            boolean r0 = r7.f81063c     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00a3
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b2 }
            java.lang.String r9 = "download plugin failed"
            r8.<init>(r9)     // Catch:{ all -> 0x00b2 }
            r10.mo18261a(r8)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b0
        L_0x00a3:
            boolean r0 = r7.f81062b     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            boolean r6 = r7.f81062b     // Catch:{ all -> 0x00b2 }
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m100747a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r11)     // Catch:{ all -> 0x00b2 }
            goto L_0x00bd
        L_0x00b2:
            r8 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00b2 }
            throw r8     // Catch:{ Exception -> 0x00c4 }
        L_0x00b5:
            r6 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r1.m100747a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00c4 }
        L_0x00bd:
            return
        L_0x00be:
            java.lang.String r8 = "95"
            r10.mo18259a(r8)     // Catch:{ Exception -> 0x00c4 }
            return
        L_0x00c4:
            java.lang.String r8 = "100"
            r10.mo18259a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.C30957a.mo81328a(java.lang.String, int, com.ss.android.ugc.aweme.im.sdk.chat.net.y, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (m100749a(r8) != false) goto L_0x003d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81329a(java.lang.String r6, com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video.C30966a r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x000c
            java.lang.String r6 = "102"
            r7.mo18259a(r6)     // Catch:{ Exception -> 0x00b2 }
            return
        L_0x000c:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x00b2 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00b2 }
            boolean r1 = r0.exists()     // Catch:{ Exception -> 0x00b2 }
            if (r1 == 0) goto L_0x00ac
            boolean r0 = r0.isFile()     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x001f
            goto L_0x00ac
        L_0x001f:
            if (r8 != 0) goto L_0x003d
            com.ss.android.ugc.aweme.im.sdk.utils.p r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p.m22077a()     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r8 = r8.mo18313e()     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x003d
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig> r0 = com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig.class
            java.lang.Object r8 = com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m.m103667a(r8, r0)     // Catch:{ Exception -> 0x00b2 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig r8 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig) r8     // Catch:{ Exception -> 0x00b2 }
            boolean r0 = m100749a(r8)     // Catch:{ Exception -> 0x00b2 }
            if (r0 == 0) goto L_0x0047
        L_0x003d:
            com.google.common.util.concurrent.l r8 = r5.m100750b()     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r8 = r8.get()     // Catch:{ Exception -> 0x00b2 }
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadAuthKeyConfig r8 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig) r8     // Catch:{ Exception -> 0x00b2 }
        L_0x0047:
            if (r8 != 0) goto L_0x004f
            java.lang.String r6 = "103"
            r7.mo18259a(r6)     // Catch:{ Exception -> 0x00b2 }
            return
        L_0x004f:
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()     // Catch:{ Exception -> 0x00b2 }
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()     // Catch:{ Exception -> 0x00b2 }
            if (r0 != 0) goto L_0x005a
            return
        L_0x005a:
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.UploadImageConfig r8 = r8.getPublicImageConfig()     // Catch:{ Exception -> 0x00b2 }
            boolean r1 = r0.isCheckPlugin()     // Catch:{ Exception -> 0x00b2 }
            r2 = 0
            if (r1 == 0) goto L_0x00a8
            boolean r1 = r5.f81065e     // Catch:{ Exception -> 0x00b2 }
            if (r1 != 0) goto L_0x00a8
            r5.f81066f = r2     // Catch:{ Exception -> 0x00b2 }
            android.app.Activity r1 = r0.getCurrentActivity()     // Catch:{ Exception -> 0x00b2 }
            r2 = 1
            java.lang.String r3 = "ttvideouploader"
            com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a$3 r4 = new com.ss.android.ugc.aweme.im.sdk.chat.net.upload.a$3     // Catch:{ Exception -> 0x00b2 }
            r4.<init>()     // Catch:{ Exception -> 0x00b2 }
            r0.checkPluginAndLoadLibrary(r1, r2, r3, r4)     // Catch:{ Exception -> 0x00b2 }
            java.lang.Object r0 = r5.f81064d     // Catch:{ Exception -> 0x00b2 }
            monitor-enter(r0)     // Catch:{ Exception -> 0x00b2 }
        L_0x007d:
            boolean r1 = r5.f81065e     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x008b
            boolean r1 = r5.f81066f     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x008b
            java.lang.Object r1 = r5.f81064d     // Catch:{ all -> 0x00a5 }
            r1.wait()     // Catch:{ all -> 0x00a5 }
            goto L_0x007d
        L_0x008b:
            boolean r1 = r5.f81066f     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x009a
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x00a5 }
            java.lang.String r8 = "download plugin failed"
            r6.<init>(r8)     // Catch:{ all -> 0x00a5 }
            r7.mo18261a(r6)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a3
        L_0x009a:
            boolean r1 = r5.f81065e     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x00a3
            boolean r1 = r5.f81065e     // Catch:{ all -> 0x00a5 }
            r5.m100748a(r6, r7, r8, r1)     // Catch:{ all -> 0x00a5 }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x00ab
        L_0x00a5:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a5 }
            throw r6     // Catch:{ Exception -> 0x00b2 }
        L_0x00a8:
            r5.m100748a(r6, r7, r8, r2)     // Catch:{ Exception -> 0x00b2 }
        L_0x00ab:
            return
        L_0x00ac:
            java.lang.String r6 = "101"
            r7.mo18259a(r6)     // Catch:{ Exception -> 0x00b2 }
            return
        L_0x00b2:
            java.lang.String r6 = "100"
            r7.mo18259a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.C30957a.mo81329a(java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.video.a, boolean):void");
    }

    /* renamed from: a */
    private static boolean m100749a(UploadAuthKeyConfig uploadAuthKeyConfig) {
        return SystemClock.uptimeMillis() > Math.min(uploadAuthKeyConfig.getInnerImageConfig().expireAt, uploadAuthKeyConfig.getPublicImageConfig().expireAt);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo81327a(C30981y yVar, int i, String str, int i2, long j, TTImageInfo tTImageInfo) {
        if (i2 != 1) {
            switch (i2) {
                case 3:
                    if (yVar != null) {
                        if (i == 1) {
                            UrlModel urlModel = new UrlModel();
                            urlModel.setUri(tTImageInfo.mImageUri);
                            yVar.mo18260a(str, urlModel);
                            return;
                        } else if (i == 0) {
                            EncryptUrlModel encryptUrlModel = new EncryptUrlModel();
                            encryptUrlModel.setOid(tTImageInfo.mObjectId);
                            encryptUrlModel.setMd5(tTImageInfo.mSourceMd5);
                            encryptUrlModel.setSkey(tTImageInfo.mSecretKey);
                            yVar.mo18260a(str, encryptUrlModel);
                            return;
                        }
                    }
                    break;
                case 4:
                    long j2 = tTImageInfo.mErrcode;
                    if ((j2 == 10401 || j2 == 10402 || j2 == 10403 || j2 == 10408) && this.f81067g < 2) {
                        this.f81067g++;
                        mo81328a(str, i, yVar, true);
                        return;
                    } else if (yVar != null) {
                        yVar.mo18259a(String.valueOf(j2));
                        return;
                    }
                    break;
            }
        } else if (yVar != null) {
            yVar.mo18258a((double) ((((float) j) * 1.0f) / 100.0f));
        }
    }

    private C30957a() {
    }

    /* renamed from: a */
    public static C30957a m100742a() {
        if (f81060h == null) {
            synchronized (C30957a.class) {
                if (f81060h == null) {
                    f81060h = new C30957a();
                }
            }
        }
        return f81060h;
    }

    /* renamed from: b */
    private C18253l<UploadAuthKeyConfig> m100750b() {
        C18253l<UploadAuthKeyConfig> b = C7077s.m22161b();
        C18246h.m60214a(b, (C18245g<? super V>) new C18245g<UploadAuthKeyConfig>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                m100754a((UploadAuthKeyConfig) obj);
            }

            /* renamed from: a */
            private static void m100754a(UploadAuthKeyConfig uploadAuthKeyConfig) {
                C7076p.m22077a().mo18294a(C31913m.m103668a(uploadAuthKeyConfig));
            }
        }, C18254m.m60217a());
        return b;
    }

    /* renamed from: a */
    private TTVideoUploader m100744a(UploadImageConfig uploadImageConfig) {
        try {
            this.f81067g = 0;
            TTVideoUploader tTVideoUploader = new TTVideoUploader(1);
            tTVideoUploader.setSocketNum(uploadImageConfig.socketNumber);
            tTVideoUploader.setVideoUploadDomain(uploadImageConfig.imageHostName);
            tTVideoUploader.setMaxFailTime(uploadImageConfig.maxFailTime);
            tTVideoUploader.setFileUploadDomain(uploadImageConfig.fileHostName);
            tTVideoUploader.setFileRetryCount(uploadImageConfig.fileRetryCount);
            tTVideoUploader.setUserKey(uploadImageConfig.appKey);
            tTVideoUploader.setAuthorization(uploadImageConfig.authorization);
            tTVideoUploader.setEnableHttps(uploadImageConfig.enableHttps);
            return tTVideoUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m100745a(TTImageUploader tTImageUploader) {
        try {
            Field declaredField = tTImageUploader.getClass().getDeclaredField("IsErrored");
            declaredField.setAccessible(true);
            declaredField.set(tTImageUploader, Boolean.valueOf(false));
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    private static void m100746a(TTVideoUploader tTVideoUploader) {
        try {
            Field declaredField = tTVideoUploader.getClass().getDeclaredField("IsErrored");
            declaredField.setAccessible(true);
            declaredField.set(tTVideoUploader, Boolean.valueOf(false));
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    private TTImageUploader m100743a(int i, UploadImageConfig uploadImageConfig) {
        int i2 = 0;
        try {
            this.f81067g = 0;
            if (i == 0) {
                i2 = 1;
            }
            TTImageUploader tTImageUploader = new TTImageUploader(i2);
            tTImageUploader.setSocketNum(uploadImageConfig.socketNumber);
            tTImageUploader.setImageUploadDomain(uploadImageConfig.imageHostName);
            tTImageUploader.setMaxFailTime(uploadImageConfig.maxFailTime);
            tTImageUploader.setFileUploadDomain(uploadImageConfig.fileHostName);
            tTImageUploader.setFileRetryCount(uploadImageConfig.fileRetryCount);
            tTImageUploader.setUserKey(uploadImageConfig.appKey);
            tTImageUploader.setAuthorization(uploadImageConfig.authorization);
            tTImageUploader.setEnableHttps(uploadImageConfig.enableHttps);
            return tTImageUploader;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m100748a(final String str, final C30966a aVar, UploadImageConfig uploadImageConfig, boolean z) {
        TTVideoUploader a = m100744a(uploadImageConfig);
        if (a == null) {
            aVar.mo18259a("104");
            return;
        }
        if (z) {
            m100746a(a);
        }
        a.setListener(new TTVideoUploaderListener() {
            public final String getStringFromExtern(int i) {
                return "";
            }

            public final void onLog(int i, int i2, String str) {
            }

            public final int videoUploadCheckNetState(int i, int i2) {
                return -1;
            }

            public final void onNotify(int i, long j, TTVideoInfo tTVideoInfo) {
                switch (i) {
                    case 0:
                        EncryptedVideoContent encryptedVideoContent = new EncryptedVideoContent();
                        encryptedVideoContent.setSecretKey(tTVideoInfo.mSecretKey);
                        encryptedVideoContent.setSourceMD5(tTVideoInfo.mSourceMd5);
                        encryptedVideoContent.setTosKey(tTVideoInfo.mTosKey);
                        EncryptUrlModel encryptUrlModel = new EncryptUrlModel();
                        C6711m mVar = (C6711m) C31913m.m103667a(tTVideoInfo.mExtra, C6711m.class);
                        encryptUrlModel.oid = mVar.mo16149b("thumb_uri").mo15998c();
                        encryptUrlModel.md5 = mVar.mo16149b("thumb_md5").mo15998c();
                        encryptUrlModel.skey = mVar.mo16149b("thumb_secret").mo15998c();
                        aVar.mo81355a(str, encryptedVideoContent, encryptUrlModel);
                        return;
                    case 1:
                        if (aVar != null) {
                            aVar.mo18258a((double) ((((float) j) * 1.0f) / 100.0f));
                            return;
                        }
                        break;
                    case 2:
                        long j2 = tTVideoInfo.mErrcode;
                        if ((j2 != 10401 && j2 != 10402 && j2 != 10403 && j2 != 10408) || C30957a.this.f81067g >= 2) {
                            if (aVar != null) {
                                aVar.mo18259a(String.valueOf(j2));
                                break;
                            }
                        } else {
                            C30957a.this.f81067g++;
                            C30957a.this.mo81329a(str, aVar, true);
                            return;
                        }
                        break;
                }
            }
        });
        a.setPathName(str);
        a.start();
    }

    /* renamed from: a */
    private void m100747a(String str, int i, C30981y yVar, UploadImageConfig uploadImageConfig, boolean z) {
        TTImageUploader a = m100743a(i, uploadImageConfig);
        if (a == null) {
            yVar.mo18259a("98");
            return;
        }
        if (z) {
            m100745a(a);
        }
        a.setListener(new C30962b(this, yVar, i, str));
        a.setFilePath(1, new String[]{str});
        a.start();
    }
}
