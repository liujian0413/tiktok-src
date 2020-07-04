package com.facebook.internal;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.C13499h;
import com.facebook.LoggingBehavior;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.p */
public final class C13933p {

    /* renamed from: a */
    static final String f36876a = "p";

    /* renamed from: b */
    public static final AtomicLong f36877b = new AtomicLong();

    /* renamed from: c */
    public AtomicLong f36878c = new AtomicLong(0);

    /* renamed from: d */
    private final String f36879d;

    /* renamed from: e */
    private final C13941c f36880e;

    /* renamed from: f */
    private final File f36881f;

    /* renamed from: g */
    private boolean f36882g;

    /* renamed from: h */
    private boolean f36883h;

    /* renamed from: i */
    private final Object f36884i;

    /* renamed from: com.facebook.internal.p$a */
    static class C13937a {

        /* renamed from: a */
        private static final FilenameFilter f36892a = new FilenameFilter() {
            public final boolean accept(File file, String str) {
                if (!str.startsWith("buffer")) {
                    return true;
                }
                return false;
            }
        };

        /* renamed from: b */
        private static final FilenameFilter f36893b = new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.startsWith("buffer");
            }
        };

        /* renamed from: a */
        static FilenameFilter m41113a() {
            return f36892a;
        }

        /* renamed from: b */
        private static FilenameFilter m41116b() {
            return f36893b;
        }

        /* renamed from: a */
        static void m41114a(File file) {
            File[] listFiles = file.listFiles(m41116b());
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* renamed from: b */
        static File m41115b(File file) {
            StringBuilder sb = new StringBuilder("buffer");
            sb.append(Long.valueOf(C13933p.f36877b.incrementAndGet()).toString());
            return new File(file, sb.toString());
        }
    }

    /* renamed from: com.facebook.internal.p$b */
    static class C13940b extends OutputStream {

        /* renamed from: a */
        final OutputStream f36894a;

        /* renamed from: b */
        final C13943e f36895b;

        public final void flush() throws IOException {
            this.f36894a.flush();
        }

        public final void close() throws IOException {
            try {
                this.f36894a.close();
            } finally {
                this.f36895b.mo33585a();
            }
        }

        public final void write(int i) throws IOException {
            this.f36894a.write(i);
        }

        public final void write(byte[] bArr) throws IOException {
            this.f36894a.write(bArr);
        }

        C13940b(OutputStream outputStream, C13943e eVar) {
            this.f36894a = outputStream;
            this.f36895b = eVar;
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.f36894a.write(bArr, i, i2);
        }
    }

    /* renamed from: com.facebook.internal.p$c */
    public static final class C13941c {

        /* renamed from: a */
        public int f36896a = 1048576;

        /* renamed from: b */
        public int f36897b = PreloadTask.BYTE_UNIT_NUMBER;
    }

    /* renamed from: com.facebook.internal.p$d */
    static final class C13942d implements Comparable<C13942d> {

        /* renamed from: a */
        public final File f36898a;

        /* renamed from: b */
        public final long f36899b;

        public final int hashCode() {
            return ((this.f36898a.hashCode() + 1073) * 37) + ((int) (this.f36899b % 2147483647L));
        }

        C13942d(File file) {
            this.f36898a = file;
            this.f36899b = file.lastModified();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C13942d) || compareTo((C13942d) obj) != 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C13942d dVar) {
            if (this.f36899b < dVar.f36899b) {
                return -1;
            }
            if (this.f36899b > dVar.f36899b) {
                return 1;
            }
            return this.f36898a.compareTo(dVar.f36898a);
        }
    }

    /* renamed from: com.facebook.internal.p$e */
    interface C13943e {
        /* renamed from: a */
        void mo33585a();
    }

    /* renamed from: com.facebook.internal.p$f */
    static final class C13944f {
        /* renamed from: a */
        static JSONObject m41119a(InputStream inputStream) throws IOException {
            if (inputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = inputStream.read();
                if (read == -1) {
                    C13949t.m41130a(LoggingBehavior.CACHE, C13933p.f36876a, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & NormalGiftView.ALPHA_255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = inputStream.read(bArr, i, i2 - i);
                if (read2 <= 0) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = C13933p.f36876a;
                    StringBuilder sb = new StringBuilder("readHeader: stream.read stopped at ");
                    sb.append(Integer.valueOf(i));
                    sb.append(" when expected ");
                    sb.append(i2);
                    C13949t.m41130a(loggingBehavior, str, sb.toString());
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str2 = C13933p.f36876a;
                StringBuilder sb2 = new StringBuilder("readHeader: expected JSONObject, got ");
                sb2.append(nextValue.getClass().getCanonicalName());
                C13949t.m41130a(loggingBehavior2, str2, sb2.toString());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        static void m41120a(OutputStream outputStream, JSONObject jSONObject) throws IOException {
            byte[] bytes = jSONObject.toString().getBytes();
            outputStream.write(0);
            outputStream.write((bytes.length >> 16) & NormalGiftView.ALPHA_255);
            outputStream.write((bytes.length >> 8) & NormalGiftView.ALPHA_255);
            outputStream.write((bytes.length >> 0) & NormalGiftView.ALPHA_255);
            outputStream.write(bytes);
        }
    }

    /* renamed from: c */
    private void m41106c() {
        synchronized (this.f36884i) {
            if (!this.f36882g) {
                this.f36882g = true;
                C13499h.m39719e().execute(new Runnable() {
                    public final void run() {
                        C13933p.this.mo33583b();
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo33580a() {
        final File[] listFiles = this.f36881f.listFiles(C13937a.m41113a());
        this.f36878c.set(System.currentTimeMillis());
        if (listFiles != null) {
            C13499h.m39719e().execute(new Runnable() {
                public final void run() {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
            });
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{FileLruCache: tag:");
        sb.append(this.f36879d);
        sb.append(" file:");
        sb.append(this.f36881f.getName());
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo33583b() {
        long j;
        synchronized (this.f36884i) {
            this.f36882g = false;
            this.f36883h = true;
        }
        try {
            C13949t.m41130a(LoggingBehavior.CACHE, f36876a, "trim started");
            PriorityQueue priorityQueue = new PriorityQueue();
            File[] listFiles = this.f36881f.listFiles(C13937a.m41113a());
            long j2 = 0;
            if (listFiles != null) {
                long j3 = 0;
                j = 0;
                for (File file : listFiles) {
                    C13942d dVar = new C13942d(file);
                    priorityQueue.add(dVar);
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str = f36876a;
                    StringBuilder sb = new StringBuilder("  trim considering time=");
                    sb.append(Long.valueOf(dVar.f36899b));
                    sb.append(" name=");
                    sb.append(dVar.f36898a.getName());
                    C13949t.m41130a(loggingBehavior, str, sb.toString());
                    j3 += file.length();
                    j++;
                }
                j2 = j3;
            } else {
                j = 0;
            }
            while (true) {
                if (j2 > ((long) this.f36880e.f36896a) || j > ((long) this.f36880e.f36897b)) {
                    File file2 = ((C13942d) priorityQueue.remove()).f36898a;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    String str2 = f36876a;
                    StringBuilder sb2 = new StringBuilder("  trim removing ");
                    sb2.append(file2.getName());
                    C13949t.m41130a(loggingBehavior2, str2, sb2.toString());
                    j2 -= file2.length();
                    j--;
                    file2.delete();
                } else {
                    synchronized (this.f36884i) {
                        this.f36883h = false;
                        this.f36884i.notifyAll();
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            synchronized (this.f36884i) {
                this.f36883h = false;
                this.f36884i.notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final InputStream mo33579a(String str) throws IOException {
        return m41104a(str, (String) null);
    }

    /* renamed from: b */
    public final OutputStream mo33582b(String str) throws IOException {
        return m41105b(str, null);
    }

    /* renamed from: a */
    public final void mo33581a(String str, File file) {
        if (!file.renameTo(new File(this.f36881f, C13967z.m41252b(str)))) {
            file.delete();
        }
        m41106c();
    }

    public C13933p(String str, C13941c cVar) {
        this.f36879d = str;
        this.f36880e = cVar;
        this.f36881f = new File(C13499h.m39731q(), str);
        this.f36884i = new Object();
        if (this.f36881f.mkdirs() || this.f36881f.isDirectory()) {
            C13937a.m41114a(this.f36881f);
        }
    }

    /* renamed from: a */
    private InputStream m41104a(String str, String str2) throws IOException {
        File file = new File(this.f36881f, C13967z.m41252b(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), VideoCacheReadBuffersizeExperiment.DEFAULT);
            try {
                JSONObject a = C13944f.m41119a(bufferedInputStream);
                if (a == null) {
                    return null;
                }
                String optString = a.optString("key");
                if (optString != null) {
                    if (optString.equals(str)) {
                        if (a.optString("tag", null) != null) {
                            bufferedInputStream.close();
                            return null;
                        }
                        long time = new Date().getTime();
                        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                        String str3 = f36876a;
                        StringBuilder sb = new StringBuilder("Setting lastModified to ");
                        sb.append(Long.valueOf(time));
                        sb.append(" for ");
                        sb.append(file.getName());
                        C13949t.m41130a(loggingBehavior, str3, sb.toString());
                        file.setLastModified(time);
                        return bufferedInputStream;
                    }
                }
                bufferedInputStream.close();
                return null;
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private OutputStream m41105b(String str, String str2) throws IOException {
        final File b = C13937a.m41115b(this.f36881f);
        b.delete();
        if (b.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(b);
                final long currentTimeMillis = System.currentTimeMillis();
                final String str3 = str;
                C139341 r0 = new C13943e() {
                    /* renamed from: a */
                    public final void mo33585a() {
                        if (currentTimeMillis < C13933p.this.f36878c.get()) {
                            b.delete();
                        } else {
                            C13933p.this.mo33581a(str3, b);
                        }
                    }
                };
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C13940b(fileOutputStream, r0), VideoCacheReadBuffersizeExperiment.DEFAULT);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!C13967z.m41249a((String) null)) {
                        jSONObject.put("tag", null);
                    }
                    C13944f.m41120a(bufferedOutputStream, jSONObject);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    String str4 = f36876a;
                    StringBuilder sb = new StringBuilder("Error creating JSON header for cache file: ");
                    sb.append(e);
                    C13949t.m41128a(loggingBehavior, 5, str4, sb.toString());
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                String str5 = f36876a;
                StringBuilder sb2 = new StringBuilder("Error creating buffer output stream: ");
                sb2.append(e2);
                C13949t.m41128a(loggingBehavior2, 5, str5, sb2.toString());
                throw new IOException(e2.getMessage());
            }
        } else {
            StringBuilder sb3 = new StringBuilder("Could not create file at ");
            sb3.append(b.getAbsolutePath());
            throw new IOException(sb3.toString());
        }
    }
}
