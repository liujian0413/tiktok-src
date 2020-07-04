package com.p1848vk.sdk.api.httpClient;

import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.C1642a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.vk.sdk.api.httpClient.i */
public final class C47154i {

    /* renamed from: a */
    private final String f120976a = C1642a.m8035a(Locale.US, "Boundary(======VK_SDK_%d======)", new Object[]{Integer.valueOf(new Random().nextInt())});

    /* renamed from: b */
    private final File[] f120977b;

    /* renamed from: c */
    private String f120978c;

    /* renamed from: c */
    private String m147414c() {
        return C1642a.m8034a("\r\n--%s--\r\n", new Object[]{this.f120976a});
    }

    /* renamed from: b */
    public final Pair<String, String> mo118442b() {
        return new Pair<>("Content-Type", C1642a.m8034a("multipart/form-data; boundary=%s", new Object[]{this.f120976a}));
    }

    /* renamed from: a */
    public final long mo118440a() {
        long j = 0;
        for (int i = 0; i < this.f120977b.length; i++) {
            File file = this.f120977b[i];
            j = j + file.length() + ((long) m147412a(file, i).length());
        }
        return j + ((long) m147414c().length());
    }

    /* renamed from: a */
    private static String m147413a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public C47154i(File[] fileArr) {
        this.f120977b = fileArr;
    }

    /* renamed from: a */
    public final void mo118441a(OutputStream outputStream) throws IOException {
        for (int i = 0; i < this.f120977b.length; i++) {
            File file = this.f120977b[i];
            outputStream.write(m147412a(file, i).getBytes("UTF-8"));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[2048];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
        }
        outputStream.write(m147414c().getBytes("UTF-8"));
    }

    /* renamed from: a */
    private String m147412a(File file, int i) {
        String str;
        if (this.f120978c == null || !this.f120978c.equals("doc")) {
            str = C1642a.m8035a(Locale.US, "file%d", new Object[]{Integer.valueOf(i + 1)});
        } else {
            str = "file";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(C1642a.m8034a("\r\n--%s\r\n", new Object[]{this.f120976a}));
        sb.append(C1642a.m8034a("Content-Disposition: form-data; name=\"%s\"; filename=\"%s.%s\"\r\n", new Object[]{str, str, fileExtensionFromUrl}));
        sb.append(C1642a.m8034a("Content-Type: %s\r\n\r\n", new Object[]{m147413a(file.getAbsolutePath())}));
        return sb.toString();
    }
}
