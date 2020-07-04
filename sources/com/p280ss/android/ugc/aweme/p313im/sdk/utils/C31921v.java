package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.bytedance.retrofit2.mime.TypedFile;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31883ay.C31884a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.v */
public final class C31921v extends TypedFile {

    /* renamed from: a */
    private File f83393a;

    /* renamed from: b */
    private C31884a f83394b;

    /* renamed from: c */
    private long f83395c;

    public final void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long length = this.f83393a.length();
        FileInputStream fileInputStream = new FileInputStream(this.f83393a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    this.f83395c += (long) read;
                    if (this.f83394b != null) {
                        this.f83394b.mo18258a((double) ((int) ((this.f83395c * 100) / length)));
                    }
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public C31921v(String str, File file, C31884a aVar) {
        super(null, file);
        this.f83394b = aVar;
        this.f83393a = file;
    }
}
