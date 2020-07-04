package com.airbnb.lottie.network;

import android.content.Context;
import android.support.p022v4.util.C0902i;
import com.airbnb.lottie.C1745d;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.network.a */
final class C1834a {

    /* renamed from: a */
    private final Context f6637a;

    /* renamed from: b */
    private final String f6638b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0902i<FileExtension, InputStream> mo7333a() {
        FileExtension fileExtension;
        try {
            File a = m8591a(this.f6638b);
            if (a == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(a);
                if (a.getAbsolutePath().endsWith(".zip")) {
                    fileExtension = FileExtension.Zip;
                } else {
                    fileExtension = FileExtension.Json;
                }
                StringBuilder sb = new StringBuilder("Cache hit for ");
                sb.append(this.f6638b);
                sb.append(" at ");
                sb.append(a.getAbsolutePath());
                return new C0902i<>(fileExtension, fileInputStream);
            } catch (FileNotFoundException unused) {
                return null;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    private File m8591a(String str) throws FileNotFoundException {
        File file = new File(this.f6637a.getCacheDir(), m8592a(str, FileExtension.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f6637a.getCacheDir(), m8592a(str, FileExtension.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7335a(FileExtension fileExtension) {
        File file = new File(this.f6637a.getCacheDir(), m8592a(this.f6638b, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        StringBuilder sb = new StringBuilder("Copying temp file to real file (");
        sb.append(file2);
        sb.append(")");
        if (!renameTo) {
            StringBuilder sb2 = new StringBuilder("Unable to rename cache file ");
            sb2.append(file.getAbsolutePath());
            sb2.append(" to ");
            sb2.append(file2.getAbsolutePath());
            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
            C1745d.m8323a(sb2.toString());
        }
    }

    C1834a(Context context, String str) {
        this.f6637a = context.getApplicationContext();
        this.f6638b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final File mo7334a(InputStream inputStream, FileExtension fileExtension) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f6637a.getCacheDir(), m8592a(this.f6638b, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static String m8592a(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.extension;
        } else {
            str2 = fileExtension.tempExtension();
        }
        sb.append(str2);
        return sb.toString();
    }
}
