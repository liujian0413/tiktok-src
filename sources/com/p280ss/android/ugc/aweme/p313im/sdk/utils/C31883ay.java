package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ay */
public final class C31883ay extends RequestBody {

    /* renamed from: a */
    public C31884a f83353a;

    /* renamed from: b */
    private File f83354b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ay$a */
    public interface C31884a {
        /* renamed from: a */
        void mo18257a();

        /* renamed from: a */
        void mo18258a(double d);

        /* renamed from: a */
        void mo18259a(String str);

        /* renamed from: a */
        void mo18261a(Throwable th);
    }

    public final long contentLength() throws IOException {
        return this.f83354b.length();
    }

    public final MediaType contentType() {
        return MediaType.parse("multipart/form-data");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        double length = (double) this.f83354b.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f83354b);
        long j = 0;
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (this.f83353a != null) {
                    C31884a aVar = this.f83353a;
                    double d = (double) j;
                    Double.isNaN(d);
                    Double.isNaN(length);
                    aVar.mo18258a(d / length);
                }
                j += (long) read;
                bufferedSink.write(bArr, 0, read);
            } catch (Exception e) {
                if (this.f83353a != null) {
                    this.f83353a.mo18261a((Throwable) e);
                }
                return;
            } finally {
                fileInputStream.close();
            }
        }
        if (this.f83353a != null) {
            this.f83353a.mo18257a();
        }
    }

    public C31883ay(File file, C31884a aVar) {
        this.f83354b = file;
        this.f83353a = aVar;
    }
}
