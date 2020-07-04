package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings.System;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.squareup.picasso.ad */
final class C18807ad {

    /* renamed from: a */
    static final StringBuilder f50699a = new StringBuilder();

    /* renamed from: com.squareup.picasso.ad$a */
    static class C18809a {
        /* renamed from: a */
        static int m61448a(ActivityManager activityManager) {
            return activityManager.getLargeMemoryClass();
        }
    }

    /* renamed from: com.squareup.picasso.ad$b */
    static class C18810b {
        /* renamed from: a */
        static int m61449a(Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.squareup.picasso.ad$c */
    static class C18811c {
        /* renamed from: a */
        static Downloader m61450a(Context context) {
            return new C18842p(context);
        }
    }

    /* renamed from: com.squareup.picasso.ad$d */
    static class C18812d extends Thread {
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }

        public C18812d(Runnable runnable) {
            super(runnable);
        }
    }

    /* renamed from: com.squareup.picasso.ad$e */
    static class C18813e implements ThreadFactory {
        C18813e() {
        }

        public final Thread newThread(Runnable runnable) {
            return new C18812d(runnable);
        }
    }

    /* renamed from: a */
    static void m61437a() {
        if (!m61442b()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* renamed from: a */
    static String m61435a(C18846s sVar) {
        String a = m61436a(sVar, f50699a);
        f50699a.setLength(0);
        return a;
    }

    /* renamed from: a */
    private static String m61436a(C18846s sVar, StringBuilder sb) {
        if (sVar.f50796f != null) {
            sb.ensureCapacity(sVar.f50796f.length() + 50);
            sb.append(sVar.f50796f);
        } else if (sVar.f50794d != null) {
            String uri = sVar.f50794d.toString();
            sb.ensureCapacity(uri.length() + 50);
            sb.append(uri);
        } else {
            sb.ensureCapacity(50);
            sb.append(sVar.f50795e);
        }
        sb.append(10);
        if (sVar.f50803m != 0.0f) {
            sb.append("rotation:");
            sb.append(sVar.f50803m);
            if (sVar.f50806p) {
                sb.append('@');
                sb.append(sVar.f50804n);
                sb.append('x');
                sb.append(sVar.f50805o);
            }
            sb.append(10);
        }
        if (sVar.mo50072d()) {
            sb.append("resize:");
            sb.append(sVar.f50798h);
            sb.append('x');
            sb.append(sVar.f50799i);
            sb.append(10);
        }
        if (sVar.f50800j) {
            sb.append("centerCrop\n");
        } else if (sVar.f50801k) {
            sb.append("centerInside\n");
        }
        if (sVar.f50797g != null) {
            int size = sVar.f50797g.size();
            for (int i = 0; i < size; i++) {
                sb.append(((C18802aa) sVar.f50797g.get(i)).mo50000a());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m61439a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    static boolean m61440a(String str) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(" ", 2);
        if ("CACHE".equals(split[0])) {
            return true;
        }
        if (split.length == 1) {
            return false;
        }
        try {
            if (!"CONDITIONAL_CACHE".equals(split[0]) || Integer.parseInt(split[1]) != 304) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static void m61438a(Looper looper) {
        C188081 r0 = new Handler(looper) {
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000);
            }
        };
        r0.sendMessageDelayed(r0.obtainMessage(), 1000);
    }

    /* renamed from: b */
    private static boolean m61442b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static Downloader m61430a(Context context) {
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
            return C18811c.m61450a(context);
        } catch (ClassNotFoundException unused) {
            return new C18803ab(context);
        }
    }

    /* renamed from: b */
    static File m61441b(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: d */
    static boolean m61447d(Context context) {
        try {
            if (System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0) {
                return true;
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: a */
    static int m61427a(Bitmap bitmap) {
        int i;
        if (VERSION.SDK_INT >= 12) {
            i = C18810b.m61449a(bitmap);
        } else {
            i = bitmap.getRowBytes() * bitmap.getHeight();
        }
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    static int m61445c(Context context) {
        boolean z;
        ActivityManager activityManager = (ActivityManager) m61431a(context, "activity");
        if ((context.getApplicationInfo().flags & 1048576) != 0) {
            z = true;
        } else {
            z = false;
        }
        int memoryClass = activityManager.getMemoryClass();
        if (z && VERSION.SDK_INT >= 11) {
            memoryClass = C18809a.m61448a(activityManager);
        }
        return (memoryClass * 1048576) / 7;
    }

    /* renamed from: a */
    static long m61428a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800), 5242880);
    }

    /* renamed from: b */
    static byte[] m61444b(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: c */
    static boolean m61446c(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[12];
        if (inputStream.read(bArr, 0, 12) != 12 || !"RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) || !"WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static String m61433a(C18815c cVar) {
        return m61434a(cVar, "");
    }

    /* renamed from: a */
    static <T> T m61431a(Context context, String str) {
        return context.getSystemService(str);
    }

    /* renamed from: b */
    static boolean m61443b(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static <T> T m61432a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    static int m61426a(Resources resources, C18846s sVar) throws FileNotFoundException {
        int i;
        if (sVar.f50795e != 0 || sVar.f50794d == null) {
            return sVar.f50795e;
        }
        String authority = sVar.f50794d.getAuthority();
        if (authority != null) {
            List pathSegments = sVar.f50794d.getPathSegments();
            if (pathSegments == null || pathSegments.isEmpty()) {
                StringBuilder sb = new StringBuilder("No path segments: ");
                sb.append(sVar.f50794d);
                throw new FileNotFoundException(sb.toString());
            }
            if (pathSegments.size() == 1) {
                try {
                    i = Integer.parseInt((String) pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder("Last path segment is not a resource ID: ");
                    sb2.append(sVar.f50794d);
                    throw new FileNotFoundException(sb2.toString());
                }
            } else if (pathSegments.size() == 2) {
                i = resources.getIdentifier((String) pathSegments.get(1), (String) pathSegments.get(0), authority);
            } else {
                StringBuilder sb3 = new StringBuilder("More than two path segments: ");
                sb3.append(sVar.f50794d);
                throw new FileNotFoundException(sb3.toString());
            }
            return i;
        }
        StringBuilder sb4 = new StringBuilder("No package provided: ");
        sb4.append(sVar.f50794d);
        throw new FileNotFoundException(sb4.toString());
    }

    /* renamed from: a */
    static Resources m61429a(Context context, C18846s sVar) throws FileNotFoundException {
        if (sVar.f50795e != 0 || sVar.f50794d == null) {
            return context.getResources();
        }
        String authority = sVar.f50794d.getAuthority();
        if (authority != null) {
            try {
                return context.getPackageManager().getResourcesForApplication(authority);
            } catch (NameNotFoundException unused) {
                StringBuilder sb = new StringBuilder("Unable to obtain resources for package: ");
                sb.append(sVar.f50794d);
                throw new FileNotFoundException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("No package provided: ");
            sb2.append(sVar.f50794d);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    /* renamed from: a */
    static String m61434a(C18815c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        C18800a aVar = cVar.f50716k;
        if (aVar != null) {
            sb.append(aVar.f50683b.mo50069a());
        }
        List<C18800a> list = cVar.f50717l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(((C18800a) list.get(i)).f50683b.mo50069a());
            }
        }
        return sb.toString();
    }
}
