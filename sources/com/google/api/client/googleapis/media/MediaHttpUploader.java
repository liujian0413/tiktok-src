package com.google.api.client.googleapis.media;

import com.google.api.client.googleapis.C17222b;
import com.google.api.client.http.C17241b;
import com.google.api.client.http.C17252d;
import com.google.api.client.http.C17253e;
import com.google.api.client.http.C17254f;
import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17257h;
import com.google.api.client.http.C17258i;
import com.google.api.client.http.C17261l;
import com.google.api.client.http.C17266o;
import com.google.api.client.http.C17267p;
import com.google.api.client.http.C17269r;
import com.google.api.client.http.C17274w;
import com.google.api.client.http.C17277z;
import com.google.api.client.util.C17359e;
import com.google.api.client.util.C17384w;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;

public final class MediaHttpUploader {

    /* renamed from: a */
    public UploadState f47983a;

    /* renamed from: b */
    public final C17241b f47984b;

    /* renamed from: c */
    public C17257h f47985c;

    /* renamed from: d */
    public String f47986d;

    /* renamed from: e */
    public C17261l f47987e;

    /* renamed from: f */
    public boolean f47988f;

    /* renamed from: g */
    String f47989g;

    /* renamed from: h */
    public long f47990h;

    /* renamed from: i */
    public int f47991i;

    /* renamed from: j */
    public boolean f47992j;

    /* renamed from: k */
    private final C17267p f47993k;

    /* renamed from: l */
    private long f47994l;

    /* renamed from: m */
    private boolean f47995m;

    /* renamed from: n */
    private C17266o f47996n;

    /* renamed from: o */
    private InputStream f47997o;

    /* renamed from: p */
    private Byte f47998p;

    /* renamed from: q */
    private long f47999q;

    /* renamed from: r */
    private int f48000r;

    /* renamed from: s */
    private byte[] f48001s;

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    /* renamed from: b */
    private boolean m57216b() throws IOException {
        if (m57217c() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private long m57217c() throws IOException {
        if (!this.f47995m) {
            this.f47994l = this.f47984b.mo44564a();
            this.f47995m = true;
        }
        return this.f47994l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo44525a() throws IOException {
        String str;
        C17384w.m57848a(this.f47996n, (Object) "The current request should not be null");
        this.f47996n.mo44643a((C17257h) new C17253e());
        C17261l lVar = this.f47996n.f48097b;
        String str2 = "bytes */";
        String valueOf = String.valueOf(this.f47989g);
        if (valueOf.length() != 0) {
            str = str2.concat(valueOf);
        } else {
            str = new String(str2);
        }
        lVar.mo44623d(str);
    }

    /* renamed from: d */
    private void m57220d() throws IOException {
        int i;
        C17257h hVar;
        String str;
        int i2;
        int i3;
        if (m57216b()) {
            i = (int) Math.min((long) this.f47991i, m57217c() - this.f47990h);
        } else {
            i = this.f47991i;
        }
        if (m57216b()) {
            this.f47997o.mark(i);
            long j = (long) i;
            hVar = new C17274w(this.f47984b.mo44566c(), C17359e.m57797a(this.f47997o, j)).mo44668b(true).mo44667a(j).mo44594a(false);
            this.f47989g = String.valueOf(m57217c());
        } else {
            if (this.f48001s == null) {
                if (this.f47998p == null) {
                    i3 = i + 1;
                } else {
                    i3 = i;
                }
                this.f48001s = new byte[(i + 1)];
                if (this.f47998p != null) {
                    this.f48001s[0] = this.f47998p.byteValue();
                }
                i2 = 0;
            } else {
                int i4 = (int) (this.f47999q - this.f47990h);
                System.arraycopy(this.f48001s, this.f48000r - i4, this.f48001s, 0, i4);
                if (this.f47998p != null) {
                    this.f48001s[i4] = this.f47998p.byteValue();
                }
                i2 = i4;
                i3 = i - i4;
            }
            int a = C17359e.m57795a(this.f47997o, this.f48001s, (i + 1) - i3, i3);
            if (a < i3) {
                int max = i2 + Math.max(0, a);
                if (this.f47998p != null) {
                    max++;
                    this.f47998p = null;
                }
                if (this.f47989g.equals("*")) {
                    this.f47989g = String.valueOf(this.f47990h + ((long) max));
                }
                i = max;
            } else {
                this.f47998p = Byte.valueOf(this.f48001s[i]);
            }
            hVar = new C17252d(this.f47984b.mo44566c(), this.f48001s, 0, i);
            this.f47999q = this.f47990h + ((long) i);
        }
        this.f48000r = i;
        this.f47996n.mo44643a(hVar);
        if (i == 0) {
            C17261l lVar = this.f47996n.f48097b;
            String str2 = "bytes */";
            String valueOf = String.valueOf(this.f47989g);
            if (valueOf.length() != 0) {
                str = str2.concat(valueOf);
            } else {
                str = new String(str2);
            }
            lVar.mo44623d(str);
            return;
        }
        C17261l lVar2 = this.f47996n.f48097b;
        long j2 = this.f47990h;
        long j3 = (this.f47990h + ((long) i)) - 1;
        String valueOf2 = String.valueOf(String.valueOf(this.f47989g));
        StringBuilder sb = new StringBuilder(valueOf2.length() + 48);
        sb.append("bytes ");
        sb.append(j2);
        sb.append("-");
        sb.append(j3);
        sb.append("/");
        sb.append(valueOf2);
        lVar2.mo44623d(sb.toString());
    }

    /* renamed from: a */
    private void m57213a(UploadState uploadState) throws IOException {
        this.f47983a = uploadState;
    }

    /* renamed from: a */
    public final MediaHttpUploader mo44522a(C17261l lVar) {
        this.f47987e = lVar;
        return this;
    }

    /* renamed from: a */
    public final MediaHttpUploader mo44523a(boolean z) {
        this.f47992j = z;
        return this;
    }

    /* renamed from: a */
    private static long m57211a(String str) {
        if (str == null) {
            return 0;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    /* renamed from: b */
    private C17269r m57215b(C17266o oVar) throws IOException {
        if (!this.f47992j && !(oVar.f48103h instanceof C17253e)) {
            oVar.mo44644a((C17258i) new C17254f());
        }
        return m57212a(oVar);
    }

    /* renamed from: a */
    private static C17269r m57212a(C17266o oVar) throws IOException {
        new C17222b().mo44481b(oVar);
        oVar.mo44651a(false);
        return oVar.mo44652a();
    }

    /* renamed from: b */
    private C17269r m57214b(C17256g gVar) throws IOException {
        m57213a(UploadState.MEDIA_IN_PROGRESS);
        C17257h hVar = this.f47984b;
        if (this.f47985c != null) {
            hVar = new C17277z().mo44670a((Collection<? extends C17257h>) Arrays.asList(new C17257h[]{this.f47985c, this.f47984b}));
            gVar.put("uploadType", "multipart");
        } else {
            gVar.put("uploadType", "media");
        }
        C17266o a = this.f47993k.mo44654a(this.f47986d, gVar, hVar);
        a.f48097b.putAll(this.f47987e);
        C17269r b = m57215b(a);
        try {
            if (m57216b()) {
                this.f47990h = m57217c();
            }
            m57213a(UploadState.MEDIA_COMPLETE);
            return b;
        } catch (Throwable th) {
            b.mo44661e();
            throw th;
        }
    }

    /* renamed from: d */
    private C17269r m57219d(C17256g gVar) throws IOException {
        C17257h hVar;
        m57213a(UploadState.INITIATION_STARTED);
        gVar.put("uploadType", "resumable");
        if (this.f47985c == null) {
            hVar = new C17253e();
        } else {
            hVar = this.f47985c;
        }
        C17266o a = this.f47993k.mo44654a(this.f47986d, gVar, hVar);
        this.f47987e.mo44448c("X-Upload-Content-Type", (Object) this.f47984b.mo44566c());
        if (m57216b()) {
            this.f47987e.mo44448c("X-Upload-Content-Length", (Object) Long.valueOf(m57217c()));
        }
        a.f48097b.putAll(this.f47987e);
        C17269r b = m57215b(a);
        try {
            m57213a(UploadState.INITIATION_COMPLETE);
            return b;
        } catch (Throwable th) {
            b.mo44661e();
            throw th;
        }
    }

    /* renamed from: a */
    public final C17269r mo44524a(C17256g gVar) throws IOException {
        boolean z;
        if (this.f47983a == UploadState.NOT_STARTED) {
            z = true;
        } else {
            z = false;
        }
        C17384w.m57850a(z);
        if (this.f47988f) {
            return m57214b(gVar);
        }
        return m57218c(gVar);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private C17269r m57218c(C17256g gVar) throws IOException {
        C17269r rVar;
        boolean z;
        C17269r d = m57219d(gVar);
        if (!d.mo44658b()) {
            return d;
        }
        try {
            C17256g gVar2 = new C17256g(d.mo44656a().mo44622c());
            d.mo44661e();
            this.f47997o = this.f47984b.mo44595b();
            if (!this.f47997o.markSupported() && m57216b()) {
                this.f47997o = new BufferedInputStream(this.f47997o);
            }
            while (true) {
                this.f47996n = this.f47993k.mo44655b(gVar2, null);
                m57220d();
                new C17225a(this, this.f47996n);
                if (m57216b()) {
                    rVar = m57212a(this.f47996n);
                } else {
                    rVar = m57215b(this.f47996n);
                }
                try {
                    if (rVar.mo44658b()) {
                        this.f47990h = m57217c();
                        if (this.f47984b.f48051a) {
                            this.f47997o.close();
                        }
                        m57213a(UploadState.MEDIA_COMPLETE);
                        return rVar;
                    } else if (rVar.f48126e != 308) {
                        return rVar;
                    } else {
                        String c = rVar.mo44656a().mo44622c();
                        if (c != null) {
                            gVar2 = new C17256g(c);
                        }
                        long a = m57211a(rVar.mo44656a().mo44624d());
                        long j = a - this.f47990h;
                        boolean z2 = true;
                        if (j < 0 || j > ((long) this.f48000r)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C17384w.m57853b(z);
                        long j2 = ((long) this.f48000r) - j;
                        if (m57216b()) {
                            if (j2 > 0) {
                                this.f47997o.reset();
                                if (j != this.f47997o.skip(j)) {
                                    z2 = false;
                                }
                                C17384w.m57853b(z2);
                            }
                        } else if (j2 == 0) {
                            this.f48001s = null;
                        }
                        this.f47990h = a;
                        m57213a(UploadState.MEDIA_IN_PROGRESS);
                    }
                } finally {
                    rVar.mo44661e();
                }
            }
        } catch (Throwable th) {
            d.mo44661e();
            throw th;
        }
    }
}
