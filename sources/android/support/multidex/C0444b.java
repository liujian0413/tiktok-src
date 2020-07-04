package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: android.support.multidex.b */
final class C0444b implements Closeable {

    /* renamed from: a */
    private final File f1880a;

    /* renamed from: b */
    private final long f1881b;

    /* renamed from: c */
    private final File f1882c;

    /* renamed from: d */
    private final RandomAccessFile f1883d;

    /* renamed from: e */
    private final FileChannel f1884e;

    /* renamed from: f */
    private final FileLock f1885f;

    /* renamed from: android.support.multidex.b$a */
    static class C0446a extends File {

        /* renamed from: a */
        public long f1887a = -1;

        public C0446a(File file, String str) {
            super(file, str);
        }
    }

    public final void close() throws IOException {
        this.f1885f.release();
        this.f1884e.close();
        this.f1883d.close();
    }

    /* renamed from: b */
    private void m1953b() {
        File[] listFiles = this.f1882c.listFiles(new FileFilter() {
            public final boolean accept(File file) {
                if (!file.getName().equals("MultiDex.lock")) {
                    return true;
                }
                return false;
            }
        });
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
    }

    /* renamed from: a */
    private List<C0446a> m1946a() throws IOException {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1880a.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        m1953b();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f1880a);
        try {
            StringBuilder sb3 = new StringBuilder("classes");
            int i = 2;
            sb3.append(2);
            sb3.append(".dex");
            ZipEntry entry = zipFile.getEntry(sb3.toString());
            while (entry != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(sb2);
                sb4.append(i);
                sb4.append(".zip");
                C0446a aVar = new C0446a(this.f1882c, sb4.toString());
                arrayList.add(aVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m1950a(zipFile, entry, (File) aVar, sb2);
                    try {
                        aVar.f1887a = m1952b(aVar);
                        z = true;
                    } catch (IOException unused) {
                        z = false;
                    }
                    StringBuilder sb5 = new StringBuilder("Extraction ");
                    if (z) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb5.append(str);
                    sb5.append(" '");
                    sb5.append(aVar.getAbsolutePath());
                    sb5.append("': length ");
                    sb5.append(aVar.length());
                    sb5.append(" - crc: ");
                    sb5.append(aVar.f1887a);
                    if (!z) {
                        aVar.delete();
                        boolean exists = aVar.exists();
                    }
                }
                if (z) {
                    i++;
                    StringBuilder sb6 = new StringBuilder("classes");
                    sb6.append(i);
                    sb6.append(".dex");
                    entry = zipFile.getEntry(sb6.toString());
                } else {
                    StringBuilder sb7 = new StringBuilder("Could not create zip file ");
                    sb7.append(aVar.getAbsolutePath());
                    sb7.append(" for secondary dex (");
                    sb7.append(i);
                    sb7.append(")");
                    throw new IOException(sb7.toString());
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: a */
    private static void m1949a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    private static long m1944a(File file) {
        long lastModified = file.lastModified();
        if (lastModified == -1) {
            return lastModified - 1;
        }
        return lastModified;
    }

    /* renamed from: b */
    private static long m1952b(File file) throws IOException {
        long a = C0447c.m1955a(file);
        if (a == -1) {
            return a - 1;
        }
        return a;
    }

    /* renamed from: a */
    private static SharedPreferences m1945a(Context context) {
        int i;
        String str = "multidex.version";
        if (VERSION.SDK_INT < 11) {
            i = 0;
        } else {
            i = 4;
        }
        return C7285c.m22838a(context, str, i);
    }

    C0444b(File file, File file2) throws IOException {
        this.f1880a = file;
        this.f1882c = file2;
        this.f1881b = m1952b(file);
        this.f1883d = new RandomAccessFile(new File(file2, "MultiDex.lock"), "rw");
        try {
            this.f1884e = this.f1883d.getChannel();
            this.f1885f = this.f1884e.lock();
        } catch (IOException | Error | RuntimeException e) {
            m1949a((Closeable) this.f1884e);
            throw e;
        } catch (IOException | Error | RuntimeException e2) {
            m1949a((Closeable) this.f1883d);
            throw e2;
        }
    }

    /* renamed from: a */
    private List<C0446a> m1947a(Context context, String str) throws IOException {
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1880a.getName());
        sb.append(".classes");
        String sb2 = sb.toString();
        SharedPreferences a = m1945a(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("dex.number");
        int i = a.getInt(sb3.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append(i2);
            sb4.append(".zip");
            C0446a aVar = new C0446a(this.f1882c, sb4.toString());
            if (aVar.isFile()) {
                aVar.f1887a = m1952b(aVar);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("dex.crc.");
                sb5.append(i2);
                long j = a.getLong(sb5.toString(), -1);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append("dex.time.");
                sb6.append(i2);
                long j2 = a.getLong(sb6.toString(), -1);
                long lastModified = aVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = sb2;
                    SharedPreferences sharedPreferences = a;
                    if (j == aVar.f1887a) {
                        arrayList.add(aVar);
                        i2++;
                        sb2 = str3;
                        a = sharedPreferences;
                    }
                }
                StringBuilder sb7 = new StringBuilder("Invalid extracted dex: ");
                sb7.append(aVar);
                sb7.append(" (key \"");
                sb7.append(str2);
                sb7.append("\"), expected modification time: ");
                sb7.append(j2);
                sb7.append(", modification time: ");
                sb7.append(lastModified);
                sb7.append(", expected crc: ");
                sb7.append(j);
                sb7.append(", file crc: ");
                sb7.append(aVar.f1887a);
                throw new IOException(sb7.toString());
            }
            StringBuilder sb8 = new StringBuilder("Missing extracted secondary dex file '");
            sb8.append(aVar.getPath());
            sb8.append("'");
            throw new IOException(sb8.toString());
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<? extends File> mo2022a(Context context, String str, boolean z) throws IOException {
        if (this.f1885f.isValid()) {
            if (!z && !m1951a(context, this.f1880a, this.f1881b, str)) {
                try {
                    return m1947a(context, str);
                } catch (IOException unused) {
                }
            }
            List<? extends File> a = m1946a();
            m1948a(context, str, m1944a(this.f1880a), this.f1881b, a);
            return a;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: a */
    private static boolean m1951a(Context context, File file, long j, String str) {
        SharedPreferences a = m1945a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        if (a.getLong(sb.toString(), -1) == m1944a(file)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("crc");
            if (a.getLong(sb2.toString(), -1) == j) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m1950a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), ".zip", file.getParentFile());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                StringBuilder sb2 = new StringBuilder("Failed to mark readonly \"");
                sb2.append(createTempFile.getAbsolutePath());
                sb2.append("\" (tmp of \"");
                sb2.append(file.getAbsolutePath());
                sb2.append("\")");
                throw new IOException(sb2.toString());
            } else if (createTempFile.renameTo(file)) {
                m1949a((Closeable) inputStream);
                createTempFile.delete();
            } else {
                StringBuilder sb3 = new StringBuilder("Failed to rename \"");
                sb3.append(createTempFile.getAbsolutePath());
                sb3.append("\" to \"");
                sb3.append(file.getAbsolutePath());
                sb3.append("\"");
                throw new IOException(sb3.toString());
            }
        } catch (Throwable th) {
            m1949a((Closeable) inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m1948a(Context context, String str, long j, long j2, List<C0446a> list) {
        Editor edit = m1945a(context).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (C0446a aVar : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), aVar.f1887a);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), aVar.lastModified());
            i++;
        }
        edit.commit();
    }
}
