package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30931f.C30933a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.e */
public class C30930e extends C30925ab implements C30933a {

    /* renamed from: d */
    private static int f81007d;

    /* renamed from: a */
    protected UrlModel f81008a;

    /* renamed from: b */
    public String f81009b;

    /* renamed from: c */
    protected C30933a f81010c;

    /* renamed from: e */
    private C30931f f81011e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo81287a(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo81288b(String str) {
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo81289c(String str) {
        return str;
    }

    /* renamed from: c */
    private void m100680c() {
        this.f81011e.mo81291a(this.f81009b, mo81289c("download"), this.f81008a);
    }

    public void run() {
        this.f81009b = mo81285a();
        File file = new File(mo81288b(this.f81009b));
        if (mo81287a(file.getAbsolutePath())) {
            mo80605a(file.getAbsolutePath(), null);
        } else if (m100678a(this.f81008a)) {
            try {
                if (C30199h.m98861a().getImUseOkhttpclient().getDownloaderUseOkhttpclient().booleanValue()) {
                    m100679b();
                } else {
                    m100680c();
                }
            } catch (NullValueException unused) {
                m100680c();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007c A[SYNTHETIC, Splitter:B:39:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086 A[SYNTHETIC, Splitter:B:44:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0094 A[SYNTHETIC, Splitter:B:54:0x0094] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e A[SYNTHETIC, Splitter:B:59:0x009e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m100679b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.net.f r0 = r7.f81011e
            java.lang.String r1 = r7.f81009b
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r7.f81008a
            com.squareup.okhttp.Response r0 = r0.mo81290a(r1, r2)
            if (r0 != 0) goto L_0x0017
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "response is null"
            r0.<init>(r1)
            r7.mo80606a(r0)
            return
        L_0x0017:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r7.f81009b
            java.lang.String r3 = "download"
            java.lang.String r3 = r7.mo81289c(r3)
            r1.<init>(r2, r3)
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]
            r3 = 0
            com.squareup.okhttp.ResponseBody r4 = r0.body()     // Catch:{ Exception -> 0x0075, all -> 0x0071 }
            java.io.InputStream r4 = r4.byteStream()     // Catch:{ Exception -> 0x0075, all -> 0x0071 }
            com.squareup.okhttp.ResponseBody r0 = r0.body()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            r0.contentLength()     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x006d, all -> 0x006a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x006d, all -> 0x006a }
        L_0x003d:
            int r5 = r4.read(r2)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r6 = -1
            if (r5 == r6) goto L_0x0049
            r6 = 0
            r0.write(r2, r6, r5)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            goto L_0x003d
        L_0x0049:
            r0.flush()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            r7.mo80605a(r1, r3)     // Catch:{ Exception -> 0x0068, all -> 0x0066 }
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r1 = move-exception
            r7.mo80606a(r1)
        L_0x005d:
            r0.close()     // Catch:{ IOException -> 0x0061 }
            return
        L_0x0061:
            r0 = move-exception
            r7.mo80606a(r0)
            return
        L_0x0066:
            r1 = move-exception
            goto L_0x0092
        L_0x0068:
            r1 = move-exception
            goto L_0x006f
        L_0x006a:
            r1 = move-exception
            r0 = r3
            goto L_0x0092
        L_0x006d:
            r1 = move-exception
            r0 = r3
        L_0x006f:
            r3 = r4
            goto L_0x0077
        L_0x0071:
            r1 = move-exception
            r0 = r3
            r4 = r0
            goto L_0x0092
        L_0x0075:
            r1 = move-exception
            r0 = r3
        L_0x0077:
            r7.mo80606a(r1)     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0084
            r3.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r1 = move-exception
            r7.mo80606a(r1)
        L_0x0084:
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch:{ IOException -> 0x008a }
            return
        L_0x008a:
            r0 = move-exception
            r7.mo80606a(r0)
            return
        L_0x008f:
            return
        L_0x0090:
            r1 = move-exception
            r4 = r3
        L_0x0092:
            if (r4 == 0) goto L_0x009c
            r4.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009c
        L_0x0098:
            r2 = move-exception
            r7.mo80606a(r2)
        L_0x009c:
            if (r0 == 0) goto L_0x00a6
            r0.close()     // Catch:{ IOException -> 0x00a2 }
            goto L_0x00a6
        L_0x00a2:
            r0 = move-exception
            r7.mo80606a(r0)
        L_0x00a6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30930e.m100679b():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo81285a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7074e.m22069b());
        sb.append("/im/download");
        return C6399b.m19921a().getExternalFilesDir(sb.toString()).getAbsolutePath();
    }

    /* renamed from: a */
    public final void mo81286a(C30933a aVar) {
        this.f81010c = aVar;
        if (this.f81011e != null) {
            this.f81011e.f81012a = this;
        }
    }

    public C30930e(OkHttpClient okHttpClient) {
        this.f81011e = new C30931f(okHttpClient);
        f81007d++;
        this.f81000f = String.valueOf(f81007d);
    }

    /* renamed from: a */
    public static String m100677a(Message message) {
        if (message == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("DownloadItem");
        sb.append(message.getIndex());
        sb.append("_");
        sb.append(message.getUuid());
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m100678a(UrlModel urlModel) {
        if (this.f81011e == null) {
            mo80606a((Throwable) new IllegalStateException("downloader is null"));
            return false;
        }
        this.f81011e.f81012a = this;
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            return true;
        }
        mo80606a((Throwable) new IllegalStateException("downloadUrl is null"));
        return false;
    }

    /* renamed from: a */
    public void mo80606a(Throwable th) {
        if (this.f81010c != null) {
            this.f81010c.mo80606a(th);
        }
        mo81276e();
    }

    /* renamed from: a */
    public void mo80605a(String str, UrlModel urlModel) {
        if (this.f81010c != null) {
            this.f81010c.mo80605a(str, urlModel);
        }
        mo81276e();
    }
}
