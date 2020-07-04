package com.p280ss.android.usergrowth;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.usergrowth.ApkUtils.ApkUtilsException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* renamed from: com.ss.android.usergrowth.b */
public final class C45167b {

    /* renamed from: a */
    private static final String f116059a = Environment.getRootDirectory().getAbsolutePath();

    /* renamed from: b */
    private static final String f116060b = Environment.getDataDirectory().getAbsolutePath();

    /* renamed from: c */
    private static String f116061c = "meta_umeng_channel";

    /* renamed from: d */
    private static String f116062d = "ss.properties";

    /* renamed from: e */
    private static String f116063e = "com.ss.android.article.news";

    /* renamed from: f */
    private static int f116064f = 470;

    /* renamed from: g */
    private static final List<File> f116065g = Arrays.asList(new File[]{new File("/system/preload"), new File("/system/delapp"), new File("/data/miui/app"), new File("/cust"), new File("/system/presetapp"), new File("/system/preset_apps"), new File("/system/reserve"), new File("/system/pre-install"), new File("/data/preload"), new File("/system/appbackup"), new File("/system/etc/customization/applications"), new File("/system/etc/property/app"), new File("/apps")});

    /* renamed from: h */
    private static final List<File> f116066h = Collections.singletonList(new File(f116060b, "gn_apps.zip"));

    /* renamed from: i */
    private static final List<String> f116067i;

    /* renamed from: a */
    private static boolean m142390a(File file) {
        try {
            if (file.getParent() != null) {
                file = new File(file.getParentFile().getCanonicalFile(), file.getName());
            }
            if (!file.getCanonicalFile().equals(file.getAbsoluteFile())) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m142392a(String str, Collection<String> collection) {
        if (TextUtils.isEmpty(str) || collection == null) {
            return false;
        }
        for (String str2 : collection) {
            if (str.equals(str2)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            if (str.startsWith(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m142389a(Set<String> set) {
        for (File file : f116065g) {
            if (file.isDirectory() && file.canRead()) {
                set.add(file.getAbsolutePath());
            }
        }
    }

    /* renamed from: a */
    private static boolean m142391a(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder("..");
            sb.append(File.separator);
            if (!str.contains(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f116059a);
        sb.append("/app");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f116059a);
        sb2.append("/framework");
        f116067i = Arrays.asList(new String[]{sb.toString(), sb2.toString(), "/sys", "/proc", "/etc", "/dev", "/res", "/d", "mnt/sdcard", "/sdcard"});
    }

    /* renamed from: b */
    private static String m142393b(ApkUtils apkUtils) throws ApkUtilsException {
        return apkUtils.mo107730a(f116061c).toString();
    }

    /* renamed from: a */
    public static String m142384a(Context context) {
        try {
            ApkUtils c = m142396c(context);
            if (c == null) {
                return null;
            }
            String a = m142385a(c);
            c.mo107731a();
            m142398d(context);
            return a;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static ApkUtils m142396c(Context context) throws ApkUtilsException {
        Set b = m142394b(context);
        ApkUtils a = m142383a(context, b, null);
        if (a != null) {
            return a;
        }
        b.addAll(f116067i);
        return m142382a(context, Environment.getRootDirectory().getParentFile(), b);
    }

    /* renamed from: d */
    private static void m142398d(Context context) {
        if (context != null && context.getFilesDir() != null) {
            File file = new File(context.getFilesDir(), "apks");
            if (file.isDirectory()) {
                file.delete();
            }
        }
    }

    /* renamed from: c */
    private static String m142397c(ApkUtils apkUtils) throws ApkUtilsException {
        try {
            Properties properties = new Properties();
            InputStream open = apkUtils.f116057e.open(f116062d);
            properties.load(open);
            open.close();
            return properties.getProperty(f116061c);
        } catch (IOException e) {
            throw new ApkUtilsException((Throwable) e);
        }
    }

    /* renamed from: b */
    private static Set<String> m142394b(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        PackageManager packageManager = context.getPackageManager();
        m142389a((Set<String>) linkedHashSet);
        for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
            File file = new File(applicationInfo.sourceDir);
            if (applicationInfo.sourceDir.startsWith(f116059a) && !m142392a(applicationInfo.sourceDir, (Collection<String>) f116067i) && !m142392a(applicationInfo.sourceDir, (Collection<String>) linkedHashSet)) {
                while (!f116059a.equals(file.getParent())) {
                    file = file.getParentFile();
                }
                linkedHashSet.add(file.getAbsolutePath());
            }
        }
        m142386a(context, (Set<String>) linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: a */
    private static String m142385a(ApkUtils apkUtils) throws ApkUtilsException {
        if (apkUtils == null) {
            return null;
        }
        if (apkUtils.f116055c < f116064f) {
            return m142393b(apkUtils);
        }
        return m142397c(apkUtils);
    }

    /* renamed from: b */
    private static void m142395b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read == -1) {
                return;
            }
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: a */
    private static void m142386a(Context context, Set<String> set) {
        if (context != null && context.getFilesDir() != null) {
            File file = new File(context.getFilesDir(), "apks");
            if (!file.exists()) {
                file.mkdirs();
            } else if (file.isFile()) {
                return;
            }
            for (File file2 : f116066h) {
                if (file2.isFile() && file2.getName().endsWith(".zip")) {
                    try {
                        m142387a(file, file2);
                    } catch (IOException unused) {
                    }
                }
            }
            set.add(file.getAbsolutePath());
        }
    }

    /* renamed from: a */
    private static void m142387a(File file, File file2) throws IOException {
        ZipFile zipFile = new ZipFile(file2);
        try {
            Enumeration entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                String name = zipEntry.getName();
                if (!zipEntry.isDirectory() && m142391a(name) && name.endsWith(".apk")) {
                    try {
                        m142388a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(new File(file, name)));
                    } catch (IOException unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        } finally {
            zipFile.close();
        }
    }

    /* renamed from: a */
    private static void m142388a(InputStream inputStream, OutputStream outputStream) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipOutputStream.close();
                return;
            } else if (!nextEntry.isDirectory()) {
                String name = nextEntry.getName();
                if (!"AndroidManifest.xml".equals(name) && !"resources.arsc".equals(name)) {
                    StringBuilder sb = new StringBuilder("assets/");
                    sb.append(f116062d);
                    if (!sb.toString().equals(name)) {
                        m142395b(zipInputStream, null);
                    }
                }
                zipOutputStream.putNextEntry(nextEntry);
                m142395b(zipInputStream, zipOutputStream);
                zipOutputStream.closeEntry();
            }
        }
    }

    /* renamed from: a */
    private static ApkUtils m142383a(Context context, Set<String> set, Set<String> set2) throws ApkUtilsException {
        if (context == null || set == null) {
            return null;
        }
        for (String file : set) {
            ApkUtils a = m142382a(context, new File(file), null);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static ApkUtils m142382a(Context context, File file, Set<String> set) {
        ApkUtils apkUtils;
        if (context == null || file == null || m142392a(file.getAbsolutePath(), (Collection<String>) set)) {
            return null;
        }
        if (file.canRead() && file.canWrite() && file.getName() != "apks") {
            return null;
        }
        if (file.isFile() && file.getName().endsWith(".apk") && file.canRead()) {
            try {
                apkUtils = new ApkUtils(file);
            } catch (ApkUtilsException unused) {
                apkUtils = null;
            }
            if (apkUtils == null) {
                return null;
            }
            if (f116063e.endsWith(apkUtils.f116054b)) {
                return apkUtils;
            }
            apkUtils.mo107731a();
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return null;
            }
            for (File file2 : listFiles) {
                if (file2 == null || !m142390a(file)) {
                    ApkUtils a = m142382a(context, file2, set);
                    if (a != null) {
                        return a;
                    }
                }
            }
        }
        return null;
    }
}
