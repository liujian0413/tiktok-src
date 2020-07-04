package com.bytedance.apm.p249l;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.impl.C9610a;
import com.bytedance.apm.util.C6292i;
import com.bytedance.apm.util.C6296u;
import com.bytedance.frameworks.core.encrypt.C6367a;
import com.bytedance.frameworks.core.encrypt.TTEncryptUtils;
import com.bytedance.framwork.core.monitor.MonitorNetUtil;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.apm.l.d */
final class C9621d {

    /* renamed from: a */
    private String f26318a;

    /* renamed from: b */
    private byte[] f26319b;

    /* renamed from: c */
    private final Map<String, String> f26320c = new HashMap();

    /* renamed from: a */
    private void m28475a() {
        this.f26318a = C6296u.m19536a(this.f26318a, C6174c.m19151i());
    }

    /* renamed from: b */
    private void m28476b() {
        this.f26318a = MonitorNetUtil.m19813a(this.f26318a, this.f26319b);
    }

    /* renamed from: c */
    private void m28478c() throws IOException {
        if (this.f26319b.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f26319b);
                gZIPOutputStream.close();
                this.f26319b = byteArrayOutputStream.toByteArray();
                this.f26320c.put("Content-Encoding", "gzip");
            } catch (IOException e) {
                throw e;
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C9610a mo23974a(boolean z) throws IOException {
        m28475a();
        m28476b();
        m28478c();
        m28477b(z);
        this.f26320c.put("Accept-Encoding", "gzip");
        return new C9610a(this.f26318a, this.f26320c, this.f26319b);
    }

    /* renamed from: b */
    private void m28477b(boolean z) throws MalformedURLException {
        String str = "application/json; charset=utf-8";
        if (z) {
            this.f26319b = TTEncryptUtils.m19789a(this.f26319b, this.f26319b.length);
            if (this.f26319b != null) {
                if (TextUtils.isEmpty(new URL(this.f26318a).getQuery())) {
                    if (!this.f26318a.endsWith("?")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f26318a);
                        sb.append("?");
                        this.f26318a = sb.toString();
                    }
                } else if (!this.f26318a.endsWith("&")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f26318a);
                    sb2.append("&");
                    this.f26318a = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f26318a);
                sb3.append("tt_data=a");
                this.f26318a = sb3.toString();
                str = "application/octet-stream;tt-data=a";
            }
            LinkedList linkedList = new LinkedList();
            this.f26318a = C6367a.m19792a(this.f26318a, (List<Pair<String, String>>) linkedList);
            this.f26320c.putAll(C6292i.m19527b(linkedList));
        }
        this.f26320c.put("Version-Code", "1");
        this.f26320c.put("Content-Type", str);
    }

    C9621d(String str, byte[] bArr) {
        this.f26318a = str;
        this.f26319b = bArr;
    }
}
