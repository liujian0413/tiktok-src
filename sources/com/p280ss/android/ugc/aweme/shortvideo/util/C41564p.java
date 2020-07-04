package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.aweme.storage.C1921e;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.refcache.FileLocker;
import com.bytedance.storage.C12920c;
import com.bytedance.storage.StorageStrategy;
import com.google.common.base.C17427g;
import com.google.common.collect.C18054w;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27687b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.C43284h;
import com.p280ss.android.ugc.p1716b.C43659c;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.p */
public final class C41564p {

    /* renamed from: a */
    public static volatile boolean f108033a;

    /* renamed from: b */
    public static String f108034b;

    /* renamed from: c */
    private static String f108035c;

    /* renamed from: d */
    private static File f108036d;

    /* renamed from: e */
    private static File f108037e;

    /* renamed from: d */
    private static void m132388d() {
        f108033a = false;
    }

    /* renamed from: a */
    private static void m132370a(File[] fileArr, Set<String> set) {
        if (fileArr != null && fileArr.length != 0) {
            int length = fileArr.length;
            int i = 0;
            while (i < length) {
                File file = fileArr[i];
                if (f108033a) {
                    if (file != null && file.exists()) {
                        String absolutePath = file.getAbsolutePath();
                        if (!TextUtils.isEmpty(absolutePath)) {
                            if (file.isFile()) {
                                if (!set.contains(absolutePath) && (absolutePath.endsWith(".mp4") || absolutePath.endsWith(".mp3") || absolutePath.endsWith(".wav") || absolutePath.endsWith("-concat-v") || absolutePath.endsWith("-concat-a") || absolutePath.endsWith("_synthetise"))) {
                                    C7276d.m22816c(absolutePath);
                                }
                            } else if (!set.contains(file.getName()) && !set.contains(file.getAbsolutePath())) {
                                m132370a(file.listFiles(), set);
                                if (file.length() == 0) {
                                    file.delete();
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m132366a(File file, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(File.separator);
        sb.append("cache");
        File file2 = new File(sb.toString());
        if (file2.exists()) {
            File[] listFiles = file2.listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    if (file == null || !file.getName().endsWith("-concat-v")) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles != null && listFiles.length > 0) {
                m132378b(m132361a(listFiles, i));
            }
        }
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m132381b(File file) {
        return file != null && file.exists() && file.getName() != null && file.getName().endsWith("-concat-v") && !file.getName().startsWith("synthetise_");
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m132371a(IShortVideoConfig iShortVideoConfig, File file) {
        return file != null && file.exists() && file.getName() != null && file.getName().endsWith(iShortVideoConfig.suffixMix());
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m132372a(File file) {
        return file != null && file.exists() && file.getName() != null && (file.getName().startsWith("synthetise_") || file.getName().endsWith("_synthetise"));
    }

    /* renamed from: a */
    private static void m132367a(File file, List<File> list) {
        if (file != null) {
            if (file.isFile()) {
                list.add(file);
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File a : listFiles) {
                    m132367a(a, list);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m132368a(List<File> list) {
        if (list != null && list.size() > 0) {
            for (File file : list) {
                if (file != null && file.exists()) {
                    new StringBuilder("del:").append(file.getAbsolutePath());
                    if (FileLocker.m36208a(file.getAbsolutePath())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        sb.append(" in use");
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static File m132374b() {
        if (f108036d != null) {
            return f108036d;
        }
        File b = C12920c.m37611b(C6399b.m19921a(), StorageStrategy.PREFER_SD_CARD);
        if (b == null) {
            File c = C7276d.m22813c();
            f108036d = c;
            return c;
        }
        File file = new File(b, "picture");
        if (!file.exists()) {
            file.mkdirs();
        }
        f108036d = file;
        return file;
    }

    /* renamed from: e */
    private static List<File> m132393e() {
        File parentFile = new File(C39811er.f103480p).getParentFile();
        ArrayList arrayList = new ArrayList();
        if (parentFile != null && parentFile.exists()) {
            ArrayList arrayList2 = new ArrayList();
            m132367a(parentFile, (List<File>) arrayList2);
            arrayList.addAll(arrayList2);
        }
        File file = new File(C39811er.f103487w);
        if (file.exists()) {
            ArrayList arrayList3 = new ArrayList();
            m132367a(file, (List<File>) arrayList3);
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }

    /* renamed from: c */
    private static Set<String> m132384c() {
        HashSet hashSet = new HashSet();
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (C27687b.m90836a()) {
            hashSet.addAll(iAVService.storageService().getPrefixWhiteList());
        } else {
            for (C27311c cVar : iAVService.draftService().queryAllDraftList()) {
                if (cVar != null) {
                    hashSet.addAll(C27312d.m89564c(cVar));
                }
            }
        }
        hashSet.add(new File(iAVService.shortVideoConfig().tempDir()).getAbsolutePath());
        hashSet.addAll(iAVService.gatherFilesToBeUploaded(C6399b.m19921a()));
        return hashSet;
    }

    /* renamed from: a */
    public static Set<String> m132362a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(m132384c());
        if (f108034b == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
            sb.append("/DCIM/Camera/");
            f108034b = sb.toString();
        }
        hashSet.add(new File(f108034b).getAbsolutePath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStorageDirectory().getPath());
        sb2.append("/Android/data/");
        sb2.append(C6399b.m19921a().getPackageName());
        sb2.append("/files/splashad");
        hashSet.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C7276d.m22814c(C6399b.m19921a()).getPath());
        sb3.append("/LiveWallpaper");
        hashSet.add(sb3.toString());
        Collection a = C18054w.m59708a((Collection<F>) hashSet, (C17427g<? super F, T>) new C17427g<String, String>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m132404a((String) obj);
            }

            /* renamed from: a */
            private static String m132404a(String str) {
                return str.replaceFirst("/data/data/", "/data/user/0/");
            }
        });
        Collection a2 = C18054w.m59708a((Collection<F>) hashSet, (C17427g<? super F, T>) new C17427g<String, String>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m132406a((String) obj);
            }

            /* renamed from: a */
            private static String m132406a(String str) {
                return str.replaceFirst("/data/user/0/", "/data/data/");
            }
        });
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet);
        hashSet2.addAll(a);
        hashSet2.addAll(a2);
        return hashSet2;
    }

    /* renamed from: f */
    private static void m132395f(Context context) {
        m132399h(context);
        m132401i(context);
        m132397g(context);
    }

    /* renamed from: a */
    public static void m132369a(boolean z) {
        C6726a.m20842a(new Runnable(true) {
            public final void run() {
                C6877n.m21447a("aweme_clean_cached_files", C6869c.m21381a().mo16882a("force", Boolean.valueOf(false)).mo16888b());
                C41564p.m132379b(true);
            }
        });
    }

    /* renamed from: b */
    public static String m132375b(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m132360a(context));
        sb.append("tmp/");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m132382c(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m132360a(context));
        sb.append("pic/");
        return sb.toString();
    }

    /* renamed from: d */
    public static String m132387d(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m132360a(context));
        sb.append("out/");
        return sb.toString();
    }

    /* renamed from: j */
    private static File m132402j(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("music/download");
        return new File(sb.toString());
    }

    /* renamed from: k */
    private static File m132403k(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        sb.append(File.separator);
        sb.append("music/rhythm");
        return new File(sb.toString());
    }

    /* renamed from: a */
    public static String m132360a(Context context) {
        String str;
        if (context == null) {
            return "";
        }
        if (f108035c != null && !f108035c.isEmpty()) {
            return f108035c;
        }
        File a = C12920c.m37603a(context, StorageStrategy.PREFER_SD_CARD);
        if (a != null) {
            str = a.getPath();
        } else if (context.getExternalFilesDir(null) == null) {
            str = Environment.getExternalStorageDirectory().getPath();
        } else {
            str = context.getExternalFilesDir(null).getPath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/share/");
        String sb2 = sb.toString();
        f108035c = sb2;
        return sb2;
    }

    /* renamed from: e */
    public static File m132392e(Context context) {
        if (f108037e != null) {
            return f108037e;
        }
        File a = C12920c.m37603a(context, StorageStrategy.PREFER_SD_CARD);
        if (a == null) {
            try {
                f108037e = context.getExternalFilesDir("logs");
            } catch (Exception unused) {
            }
            if (f108037e == null) {
                f108037e = new File(context.getFilesDir(), "logs");
            }
            if (!f108037e.exists()) {
                f108037e.mkdirs();
            }
            return f108037e;
        }
        File file = new File(a, "logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        f108037e = file;
        return file;
    }

    /* renamed from: g */
    private static void m132397g(Context context) {
        File a = C43284h.m137320a(context);
        if (a != null) {
            File file = new File(context.getCacheDir(), "cache");
            if (file.exists() && !TextUtils.equals(file.getAbsolutePath(), a.getAbsolutePath())) {
                m132368a(m132383c(file, 0));
            }
            File file2 = new File(context.getExternalCacheDir(), "cache");
            if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), a.getAbsolutePath())) {
                m132368a(m132383c(file2, 0));
            }
            File b = C12920c.m37610b(context);
            if (b != null) {
                File file3 = new File(b, "cache");
                if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), a.getAbsolutePath())) {
                    m132368a(m132383c(file3, 0));
                }
            }
        }
    }

    /* renamed from: h */
    private static void m132399h(Context context) {
        try {
            File e = m132392e(context);
            File file = null;
            try {
                file = context.getExternalFilesDir("logs");
            } catch (Exception unused) {
            }
            if (file != null && file.exists() && !TextUtils.equals(file.getAbsolutePath(), e.getAbsolutePath())) {
                C1921e.m8895b(file);
            }
            File file2 = new File(context.getFilesDir(), "logs");
            if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), e.getAbsolutePath())) {
                C1921e.m8895b(file2);
            }
            File a = C12920c.m37602a(context);
            if (a != null) {
                File file3 = new File(a, "logs");
                if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), e.getAbsolutePath())) {
                    C1921e.m8895b(file3);
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: i */
    private static void m132401i(Context context) {
        File file = new File(m132374b(), "fresco_cache");
        File file2 = new File(context.getExternalCacheDir(), "picture/fresco_cache");
        if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), file.getAbsolutePath())) {
            C1921e.m8895b(file2);
        }
        File file3 = new File(context.getCacheDir(), "picture/fresco_cache");
        if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file.getAbsolutePath())) {
            C1921e.m8895b(file3);
        }
        File b = C12920c.m37610b(context);
        if (b != null) {
            File file4 = new File(b, "picture/fresco_cache");
            if (file4.exists() && !TextUtils.equals(file4.getAbsolutePath(), file.getAbsolutePath())) {
                C1921e.m8895b(file4);
            }
        }
    }

    /* renamed from: d */
    static final /* synthetic */ boolean m132391d(File file) {
        if (file == null || !file.exists() || file.getName() == null || !file.getName().startsWith("temp_")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m132363a(int i) {
        new StringBuilder("clearDuetFiles ").append(i);
        File file = new File(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().cacheDir());
        if (file.exists()) {
            m132368a(m132361a(file.listFiles(C41569q.f108039a), i * 2));
            m132378b(m132361a(file.listFiles(C41570r.f108040a), i));
        }
    }

    /* renamed from: b */
    private static void m132378b(List<File> list) {
        if (list != null && list.size() > 0) {
            Set a = m132362a();
            for (File file : list) {
                if (file != null && file.exists() && !a.contains(file.getAbsolutePath())) {
                    if (FileLocker.m36208a(file.getAbsolutePath())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(file.getAbsolutePath());
                        sb.append(" in use");
                    } else {
                        file.delete();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    static final /* synthetic */ boolean m132386c(File file) {
        if (file == null || !file.exists() || file.getName() == null || file.getName().startsWith("temp_") || !file.getName().endsWith(".mp4")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m132379b(boolean z) {
        if (!f108033a) {
            IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
            File file = new File(shortVideoConfig.shortVideoRootDir());
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    if (z || C7276d.m22817d(shortVideoConfig.shortVideoRootDir()) >= 52428800) {
                        f108033a = true;
                        m132370a(listFiles, m132362a());
                        f108033a = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static final /* synthetic */ int m132359a(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }

    /* renamed from: b */
    static final /* synthetic */ int m132373b(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }

    /* renamed from: e */
    private static void m132394e(Context context, int i) {
        m132364a(context, 2);
        m132363a(2);
        m132377b(context, 2);
        m132385c(context, 2);
    }

    /* renamed from: g */
    private static void m132398g(Context context, int i) {
        if (context != null) {
            File a = C43284h.m137320a(context);
            if (a != null && a.exists()) {
                m132368a(m132383c(a, i));
            }
        }
    }

    /* renamed from: a */
    private static List<File> m132361a(File[] fileArr, int i) {
        if (fileArr != null && fileArr.length > 0) {
            List asList = Arrays.asList(fileArr);
            Collections.sort(asList, C41576x.f108046a);
            if (asList.size() > i) {
                return asList.subList(0, asList.size() - i);
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: c */
    private static List<File> m132383c(File file, int i) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                List asList = Arrays.asList(listFiles);
                Collections.sort(asList, C41575w.f108045a);
                if (asList.size() > i) {
                    return asList.subList(0, asList.size() - i);
                }
            }
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: d */
    private static void m132389d(Context context, int i) {
        new StringBuilder("cleanBySpace ").append(i);
        if (C1921e.m8890a(context)) {
            m132364a(context, i);
        }
        if (C1921e.m8890a(context)) {
            m132400h(context, i);
        }
        if (C1921e.m8890a(context)) {
            m132363a(i);
        }
        if (C1921e.m8890a(context)) {
            m132377b(context, i);
            m132385c(context, i);
        }
    }

    /* renamed from: h */
    private static void m132400h(Context context, int i) {
        if (context != null) {
            File j = m132402j(context);
            if (j != null) {
                if (j.exists()) {
                    m132368a(m132383c(j, i));
                }
                File k = m132403k(context);
                if (k != null && k.exists()) {
                    m132368a(m132383c(k, i));
                }
            }
        }
    }

    /* renamed from: b */
    private static List<File> m132376b(File file, int i) {
        if (!file.exists()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = i * 2;
        List a = m132361a(file.listFiles(C41571s.f108041a), i2);
        if (a != null) {
            arrayList.addAll(a);
        }
        IShortVideoConfig shortVideoConfig = ((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig();
        List a2 = m132361a(file.listFiles(new C41572t(shortVideoConfig)), i);
        if (a2 != null) {
            arrayList.addAll(a2);
        }
        List a3 = m132361a(file.listFiles(new C41573u(shortVideoConfig)), i);
        if (a3 != null) {
            arrayList.addAll(a3);
        }
        List a4 = m132361a(file.listFiles(C41574v.f108044a), i);
        if (a4 != null) {
            arrayList.addAll(a4);
        }
        File file2 = new File(C43659c.m138324a().mo105614b());
        if (file2.exists() && m132383c(file2, i2) != null) {
            arrayList.addAll(a4);
        }
        return arrayList;
    }

    /* renamed from: d */
    private static void m132390d(File file, int i) {
        m132368a(m132383c(new File(file, "out"), i));
        m132368a(m132383c(new File(file, "tmp"), i));
        m132368a(m132383c(new File(file, "pic"), i));
    }

    /* renamed from: f */
    private static void m132396f(Context context, int i) {
        File file = new File(m132360a(context));
        File file2 = new File(context.getExternalFilesDir(null), "share");
        if (file2.exists() && !TextUtils.equals(file2.getAbsolutePath(), file.getAbsolutePath())) {
            m132390d(file2, i);
        }
        File a = C12920c.m37602a(context);
        if (a != null) {
            File file3 = new File(a, "share");
            if (file3.exists() && !TextUtils.equals(file3.getAbsolutePath(), file3.getAbsolutePath())) {
                m132390d(file3, i);
            }
        }
    }

    /* renamed from: b */
    private static void m132377b(Context context, int i) {
        new StringBuilder("clearDrafts ").append(i);
        ArrayList arrayList = new ArrayList();
        if (!(context == null || context.getFilesDir() == null)) {
            arrayList.addAll(m132376b(context.getFilesDir(), i));
        }
        if (context != null) {
            try {
                if (context.getExternalFilesDir(null) != null) {
                    arrayList.addAll(m132376b(context.getExternalFilesDir(null), i));
                }
            } catch (Exception unused) {
            }
        }
        arrayList.addAll(m132393e());
        m132378b((List<File>) arrayList);
    }

    /* renamed from: c */
    private static void m132385c(Context context, int i) {
        new StringBuilder("clearDraftsV2 ").append(i);
        if (!(context == null || context.getFilesDir() == null)) {
            m132366a(context.getFilesDir(), i);
        }
        if (context != null) {
            try {
                if (context.getExternalFilesDir(null) != null) {
                    m132366a(context.getExternalFilesDir(null), i);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m132364a(Context context, int i) {
        Boolean bool;
        try {
            bool = C30199h.m98861a().getCleanShareFiles();
        } catch (NullValueException unused) {
            bool = null;
        }
        if (bool != null && bool.booleanValue()) {
            i = 0;
        }
        new StringBuilder("clearShareFiles ").append(i);
        if (context != null) {
            File file = new File(m132387d(context));
            if (file.exists()) {
                m132368a(m132383c(file, i));
                m132368a(m132383c(new File(m132375b(context)), i));
                m132368a(m132383c(new File(m132382c(context)), i));
            }
            m132396f(context, i);
        }
    }

    /* renamed from: a */
    public static void m132365a(Context context, boolean z) {
        m132388d();
        if (context != null && !f108033a) {
            f108033a = true;
            int i = 2;
            if (z) {
                m132398g(context, 20);
                m132400h(context, 2);
            }
            m132394e(context, 2);
            m132395f(context);
            if (z) {
                long a = C1921e.m8888a(context.getCacheDir().getParent()) + C1921e.m8888a(context.getExternalCacheDir().getParent());
                if (C1921e.m8890a(context)) {
                    m132398g(context, 10);
                }
                while (true) {
                    i--;
                    if (i < 0 || !C1921e.m8890a(context)) {
                        long a2 = C1921e.m8888a(context.getCacheDir().getParent()) + C1921e.m8888a(context.getExternalCacheDir().getParent());
                        JSONObject jSONObject = new JSONObject();
                    } else {
                        m132389d(context, i);
                    }
                }
                long a22 = C1921e.m8888a(context.getCacheDir().getParent()) + C1921e.m8888a(context.getExternalCacheDir().getParent());
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("size", a - a22);
                } catch (JSONException unused) {
                }
                C6379c.m19826a("deep_clean", jSONObject2);
            }
            f108033a = false;
        }
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m132380b(IShortVideoConfig iShortVideoConfig, File file) {
        if (file == null || !file.exists() || file.getName() == null || !file.getName().endsWith("-concat-a") || file.getName().endsWith(iShortVideoConfig.suffixMix())) {
            return false;
        }
        return true;
    }
}
