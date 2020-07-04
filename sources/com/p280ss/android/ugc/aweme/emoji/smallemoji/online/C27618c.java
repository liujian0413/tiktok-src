package com.p280ss.android.ugc.aweme.emoji.smallemoji.online;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.online.model.OnlineSmallEmojiResInfo;
import com.p280ss.android.ugc.aweme.emoji.utils.C27635f;
import com.p280ss.android.ugc.aweme.emoji.utils.C27639h;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47972a;
import kotlin.p1884io.C47973b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.c */
public final class C27618c {

    /* renamed from: a */
    public static final C27618c f72783a = new C27618c();

    /* renamed from: b */
    private static final String f72784b;

    /* renamed from: c */
    private static final String f72785c;

    /* renamed from: d */
    private static final int f72786d = C23486n.m77122a(32.0d);

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.c$a */
    static final class C27619a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String[] f72787a;

        C27619a(String[] strArr) {
            this.f72787a = strArr;
        }

        public final boolean accept(File file, String str) {
            String[] strArr = this.f72787a;
            C7573i.m23582a((Object) str, "fileName");
            if (!C7519g.m23440b((T[]) strArr, C7634n.m23738a(str, (CharSequence) ".zip"))) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.online.c$b */
    static final class C27620b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ List f72788a;

        C27620b(List list) {
            this.f72788a = list;
        }

        public final boolean accept(File file, String str) {
            return this.f72788a.contains(str);
        }
    }

    private C27618c() {
    }

    /* renamed from: a */
    public static String m90546a() {
        StringBuilder sb = new StringBuilder();
        sb.append(f72785c);
        sb.append("tmp/");
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo70940b() {
        File file = new File(m90546a());
        if (file.isDirectory()) {
            C27618c cVar = f72783a;
            String absolutePath = file.getAbsolutePath();
            C7573i.m23582a((Object) absolutePath, "absolutePath");
            cVar.mo70943d(absolutePath);
            return;
        }
        file.delete();
    }

    static {
        StringBuilder sb = new StringBuilder("/data/data/");
        sb.append(C6399b.m19921a().getPackageName());
        sb.append('/');
        f72784b = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f72784b);
        sb2.append("small_emoji_res/");
        f72785c = sb2.toString();
    }

    /* renamed from: a */
    private static Bitmap m90545a(File file) {
        return BitmapUtils.decodeBitmap(file, f72786d);
    }

    /* renamed from: b */
    public static String m90549b(String str) {
        C7573i.m23587b(str, "md5");
        StringBuilder sb = new StringBuilder();
        sb.append(f72785c);
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }

    /* renamed from: c */
    public final boolean mo70942c(String str) {
        C7573i.m23587b(str, "md5");
        File file = new File(m90549b(str));
        if (!file.exists() || !file.isDirectory()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m90547a(String str) {
        C7573i.m23587b(str, "md5");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo70943d(String str) {
        C7573i.m23587b(str, "path");
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        C7573i.m23582a((Object) file2, "child");
                        if (file2.isDirectory()) {
                            String path = file2.getPath();
                            C7573i.m23582a((Object) path, "child.path");
                            mo70943d(path);
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    /* renamed from: e */
    public final OnlineSmallEmojiResInfo mo70944e(String str) {
        OnlineSmallEmojiResInfo onlineSmallEmojiResInfo;
        boolean z;
        C7573i.m23587b(str, "md5");
        File file = new File(m90549b(str));
        if (!file.exists() || !file.isDirectory()) {
            C6921a.m21555a("OnlineEmojiFileHelper loadCache, cacheDir not exist");
            return null;
        }
        File[] listFiles = file.listFiles();
        boolean z2 = true;
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            C6921a.m21555a("OnlineEmojiFileHelper loadCache, cacheDirFileList is empty");
            return null;
        }
        File file2 = listFiles[0];
        File file3 = new File(file2, "info.json");
        if (!file3.exists() || !file3.isFile()) {
            C6921a.m21555a("OnlineEmojiFileHelper loadCache, infoFile not exist");
            return null;
        }
        String a = C27635f.m90604a(file3);
        if (TextUtils.isEmpty(a)) {
            C6921a.m21555a("OnlineEmojiFileHelper loadCache, infoJsonStr is empty");
            return null;
        }
        try {
            onlineSmallEmojiResInfo = (OnlineSmallEmojiResInfo) C27639h.m90620a(a, OnlineSmallEmojiResInfo.class);
        } catch (Throwable th) {
            C6921a.m21559a(th);
            onlineSmallEmojiResInfo = null;
        }
        if (onlineSmallEmojiResInfo == null) {
            C6921a.m21555a("OnlineEmojiFileHelper loadCache resultResInfo is null");
            return null;
        }
        onlineSmallEmojiResInfo.setMd5(str);
        C7573i.m23582a((Object) file2, "resourceDir");
        String absolutePath = file2.getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "resourceDir.absolutePath");
        onlineSmallEmojiResInfo.setResDirPath(absolutePath);
        String absolutePath2 = new File(file2, "static/").getAbsolutePath();
        C7573i.m23582a((Object) absolutePath2, "File(resourceDir, STATIC…LE_DIR_PATH).absolutePath");
        onlineSmallEmojiResInfo.setPicFileDirPath(absolutePath2);
        return onlineSmallEmojiResInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo70938a(java.lang.String... r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "whiteMd5"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)     // Catch:{ all -> 0x0054 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = f72785c     // Catch:{ all -> 0x0054 }
            r0.<init>(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r0.exists()     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0052
            boolean r1 = r0.isDirectory()     // Catch:{ all -> 0x0054 }
            if (r1 != 0) goto L_0x001a
            goto L_0x0052
        L_0x001a:
            com.ss.android.ugc.aweme.emoji.smallemoji.online.c$a r1 = new com.ss.android.ugc.aweme.emoji.smallemoji.online.c$a     // Catch:{ all -> 0x0054 }
            r1.<init>(r6)     // Catch:{ all -> 0x0054 }
            java.io.FilenameFilter r1 = (java.io.FilenameFilter) r1     // Catch:{ all -> 0x0054 }
            java.io.File[] r6 = r0.listFiles(r1)     // Catch:{ all -> 0x0054 }
            java.lang.String r0 = "cacheDir.listFiles { _, …ix(SUFFIX_ZIP))\n        }"
            kotlin.jvm.internal.C7573i.m23582a(r6, r0)     // Catch:{ all -> 0x0054 }
            int r0 = r6.length     // Catch:{ all -> 0x0054 }
            r1 = 0
        L_0x002c:
            if (r1 >= r0) goto L_0x0050
            r2 = r6[r1]     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ all -> 0x0054 }
            boolean r3 = r2.isDirectory()     // Catch:{ all -> 0x0054 }
            if (r3 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.emoji.smallemoji.online.c r3 = f72783a     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = "it.absolutePath"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)     // Catch:{ all -> 0x0054 }
            r3.mo70943d(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x004d
        L_0x004a:
            r2.delete()     // Catch:{ all -> 0x0054 }
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x002c
        L_0x0050:
            monitor-exit(r5)
            return
        L_0x0052:
            monitor-exit(r5)
            return
        L_0x0054:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.emoji.smallemoji.online.C27618c.mo70938a(java.lang.String[]):void");
    }

    /* renamed from: a */
    private static long m90544a(InputStream inputStream, File file) {
        Throwable th;
        Closeable fileOutputStream = new FileOutputStream(file);
        try {
            long a = C47972a.m148915a(inputStream, (FileOutputStream) fileOutputStream, VideoCacheReadBuffersizeExperiment.DEFAULT);
            C47973b.m148917a(fileOutputStream, null);
            return a;
        } catch (Throwable th2) {
            C47973b.m148917a(fileOutputStream, th);
            throw th2;
        }
    }

    /* renamed from: b */
    public static boolean m90550b(String str, String str2) {
        C7573i.m23587b(str, "zipFilePath");
        C7573i.m23587b(str2, "md5");
        File file = new File(str);
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("OnlineEmojiFileHelper isZipFileValid: zFile not exist: ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            C6921a.m21555a(sb.toString());
            return false;
        } else if (!file.isFile()) {
            StringBuilder sb2 = new StringBuilder("OnlineEmojiFileHelper isZipFileValid: zFile not a file: ");
            sb2.append(str);
            sb2.append(", ");
            sb2.append(str2);
            C6921a.m21555a(sb2.toString());
            return false;
        } else {
            String a = C6306c.m19560a(file);
            if (!(!C7573i.m23585a((Object) str2, (Object) a))) {
                return true;
            }
            StringBuilder sb3 = new StringBuilder("OnlineEmojiFileHelper isZipFileValid: md5 not match: ");
            sb3.append(str);
            sb3.append(", ");
            sb3.append(str2);
            sb3.append(", ");
            sb3.append(a);
            C6921a.m21555a(sb3.toString());
            return false;
        }
    }

    /* renamed from: c */
    public final Bitmap mo70941c(String str, String str2) {
        C7573i.m23587b(str, "picFileDirPath");
        C7573i.m23587b(str2, "picFileName");
        boolean z = true;
        LinkedHashMap a = m90548a(str, C7525m.m23466c(str2));
        if (a != null) {
            if (a.size() != 1) {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                Map map = a;
                Collection arrayList = new ArrayList(map.size());
                for (Entry value : map.entrySet()) {
                    arrayList.add((Bitmap) value.getValue());
                }
                return (Bitmap) ((List) arrayList).get(0);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static LinkedHashMap<String, Bitmap> m90548a(String str, List<String> list) {
        boolean z;
        if (list.isEmpty()) {
            return null;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return null;
        }
        File[] listFiles = file.listFiles(new C27620b(list));
        boolean z2 = true;
        if (listFiles != null) {
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (z2) {
            return null;
        }
        LinkedHashMap<String, Bitmap> linkedHashMap = new LinkedHashMap<>();
        for (File file2 : listFiles) {
            C7573i.m23582a((Object) file2, "it");
            Bitmap a = m90545a(file2);
            if (a != null) {
                Map map = linkedHashMap;
                String name = file2.getName();
                C7573i.m23582a((Object) name, "it.name");
                map.put(name, a);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final boolean mo70939a(String str, String str2) {
        Closeable zipFile;
        Throwable th;
        Closeable inputStream;
        Throwable th2;
        Throwable th3;
        C7573i.m23587b(str, "zipFilePath");
        C7573i.m23587b(str2, "outputDirPath");
        File file = new File(str2);
        if (file.exists()) {
            mo70943d(str2);
        }
        file.mkdirs();
        File file2 = new File(str);
        if (file2.exists()) {
            String name = file2.getName();
            C7573i.m23582a((Object) name, "zipFile.name");
            if (C7634n.m23723c(name, ".zip", false)) {
                try {
                    zipFile = new ZipFile(file2);
                    ZipFile zipFile2 = (ZipFile) zipFile;
                    Enumeration entries = zipFile2.entries();
                    C7573i.m23582a((Object) entries, "zip.entries()");
                    Iterator a = C7525m.m23473a(entries);
                    boolean z = false;
                    while (a.hasNext()) {
                        ZipEntry zipEntry = (ZipEntry) a.next();
                        C7573i.m23582a((Object) zipEntry, "entry");
                        String name2 = zipEntry.getName();
                        C7573i.m23582a((Object) name2, "entry.name");
                        if (C7634n.m23721b(name2, "emoji_", false)) {
                            z = true;
                            File file3 = new File(file, zipEntry.getName());
                            if (zipEntry.isDirectory()) {
                                file3.mkdirs();
                            } else {
                                inputStream = zipFile2.getInputStream(zipEntry);
                                try {
                                    InputStream inputStream2 = (InputStream) inputStream;
                                    C7573i.m23582a((Object) inputStream2, "it");
                                    m90544a(inputStream2, file3);
                                    C47973b.m148917a(inputStream, null);
                                } catch (Throwable th4) {
                                    Throwable th5 = th4;
                                    th3 = r13;
                                    th2 = th5;
                                }
                            }
                        }
                    }
                    C47973b.m148917a(zipFile, null);
                    return z;
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("OnlineEmojiFileHelper unZipFile cause exception: ");
                    sb.append(e.getMessage());
                    C6921a.m21555a(sb.toString());
                    C6921a.m21559a((Throwable) e);
                    return false;
                } catch (Throwable th6) {
                    C47973b.m148917a(zipFile, th);
                    throw th6;
                }
            }
        }
        file2.delete();
        StringBuilder sb2 = new StringBuilder("OnlineEmojiFileHelper unZipFile zipFile invalid: ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        C6921a.m21555a(sb2.toString());
        return false;
        C47973b.m148917a(inputStream, th3);
        throw th2;
    }
}
