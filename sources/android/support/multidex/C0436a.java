package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import com.taobao.android.dexposed.ClassUtils;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: android.support.multidex.a */
public final class C0436a {

    /* renamed from: a */
    private static final Set<File> f1873a = new HashSet();

    /* renamed from: b */
    private static final boolean f1874b = m1931a(System.getProperty("java.vm.version"));

    /* renamed from: android.support.multidex.a$a */
    static final class C0437a {

        /* renamed from: a */
        private static final int f1875a = 4;

        /* renamed from: b */
        private final C0438a f1876b;

        /* renamed from: android.support.multidex.a$a$a */
        interface C0438a {
            /* renamed from: a */
            Object mo2021a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* renamed from: android.support.multidex.a$a$b */
        static class C0439b implements C0438a {

            /* renamed from: a */
            private final Constructor<?> f1877a;

            C0439b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f1877a = cls.getConstructor(new Class[]{File.class, ZipFile.class, DexFile.class});
                this.f1877a.setAccessible(true);
            }

            /* renamed from: a */
            public final Object mo2021a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.f1877a.newInstance(new Object[]{file, new ZipFile(file), dexFile});
            }
        }

        /* renamed from: android.support.multidex.a$a$c */
        static class C0440c implements C0438a {

            /* renamed from: a */
            private final Constructor<?> f1878a;

            C0440c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f1878a = cls.getConstructor(new Class[]{File.class, File.class, DexFile.class});
                this.f1878a.setAccessible(true);
            }

            /* renamed from: a */
            public final Object mo2021a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f1878a.newInstance(new Object[]{file, file, dexFile});
            }
        }

        /* renamed from: android.support.multidex.a$a$d */
        static class C0441d implements C0438a {

            /* renamed from: a */
            private final Constructor<?> f1879a;

            C0441d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                this.f1879a = cls.getConstructor(new Class[]{File.class, Boolean.TYPE, File.class, DexFile.class});
                this.f1879a.setAccessible(true);
            }

            /* renamed from: a */
            public final Object mo2021a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.f1879a.newInstance(new Object[]{file, Boolean.FALSE, file, dexFile});
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C0437a() throws java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.NoSuchMethodException {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = "dalvik.system.DexPathList$Element"
                java.lang.Class r0 = java.lang.Class.forName(r0)
                android.support.multidex.a$a$b r1 = new android.support.multidex.a$a$b     // Catch:{ NoSuchMethodException -> 0x000f }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x000f }
                goto L_0x001a
            L_0x000f:
                android.support.multidex.a$a$c r1 = new android.support.multidex.a$a$c     // Catch:{ NoSuchMethodException -> 0x0015 }
                r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x0015 }
                goto L_0x001a
            L_0x0015:
                android.support.multidex.a$a$d r1 = new android.support.multidex.a$a$d
                r1.<init>(r0)
            L_0x001a:
                r2.f1876b = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.C0436a.C0437a.<init>():void");
        }

        /* renamed from: a */
        private static String m1934a(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(name.substring(0, name.length() - f1875a));
            sb.append(".dex");
            return new File(parentFile, sb.toString()).getPath();
        }

        /* renamed from: a */
        private Object[] m1936a(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            Object[] objArr = new Object[list.size()];
            for (int i = 0; i < objArr.length; i++) {
                File file = (File) list.get(i);
                objArr[i] = this.f1876b.mo2021a(file, DexFile.loadDex(file.getPath(), m1934a(file), 0));
            }
            return objArr;
        }

        /* renamed from: a */
        static void m1935a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = C0436a.m1924a(classLoader, "pathList").get(classLoader);
            Object[] a = new C0437a().m1936a(list);
            try {
                C0436a.m1930a(obj, "dexElements", a);
            } catch (NoSuchFieldException unused) {
                C0436a.m1930a(obj, "pathElements", a);
            }
        }
    }

    /* renamed from: android.support.multidex.a$b */
    static final class C0442b {
        /* renamed from: a */
        static void m1941a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = C0436a.m1924a(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            C0436a.m1930a(obj, "dexElements", m1942a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                Field a = C0436a.m1924a(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) a.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[(arrayList.size() + iOExceptionArr2.length)];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                a.set(obj, iOExceptionArr);
                IOException iOException = new IOException("I/O exception during makeDexElement");
                iOException.initCause((Throwable) arrayList.get(0));
                throw iOException;
            }
        }

        /* renamed from: a */
        private static Object[] m1942a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) C0436a.m1925a(obj, "makeDexElements", (Class<?>[]) new Class[]{ArrayList.class, File.class, ArrayList.class}).invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    /* renamed from: android.support.multidex.a$c */
    static final class C0443c {
        /* renamed from: a */
        static void m1943a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field a = C0436a.m1924a(classLoader, "path");
            StringBuilder sb = new StringBuilder((String) a.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file = (File) listIterator.next();
                String absolutePath = file.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = file;
                zipFileArr[previousIndex] = new ZipFile(file);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(absolutePath);
                sb2.append(".dex");
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, sb2.toString(), 0);
            }
            a.set(classLoader, sb.toString());
            C0436a.m1930a((Object) classLoader, "mPaths", (Object[]) strArr);
            C0436a.m1930a((Object) classLoader, "mFiles", (Object[]) fileArr);
            C0436a.m1930a((Object) classLoader, "mZips", (Object[]) zipFileArr);
            C0436a.m1930a((Object) classLoader, "mDexs", (Object[]) dexFileArr);
        }
    }

    /* renamed from: a */
    private static boolean m1931a(String str) {
        boolean z = false;
        if (str != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(str);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        return z;
    }

    /* renamed from: a */
    public static void m1930a(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field a = m1924a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        a.set(obj, objArr3);
    }

    /* renamed from: b */
    private static ApplicationInfo m1932b(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static void m1933c(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static void m1926a(Context context) {
        if (!f1874b) {
            if (VERSION.SDK_INT >= 4) {
                try {
                    ApplicationInfo b = m1932b(context);
                    if (b != null) {
                        m1927a(context, new File(b.sourceDir), new File(b.dataDir), "secondary-dexes", "", true);
                    }
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("MultiDex installation failed (");
                    sb.append(e.getMessage());
                    sb.append(").");
                    throw new RuntimeException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("MultiDex installation failed. SDK ");
                sb2.append(VERSION.SDK_INT);
                sb2.append(" is unsupported. Min SDK version is 4");
                sb2.append(ClassUtils.PACKAGE_SEPARATOR);
                throw new RuntimeException(sb2.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m1928a(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            file.getParentFile();
            StringBuilder sb = new StringBuilder("Failed to create directory ");
            sb.append(file.getPath());
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: a */
    public static Field m1924a(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Field ");
        sb.append(str);
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchFieldException(sb.toString());
    }

    /* renamed from: a */
    private static void m1929a(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (!list.isEmpty()) {
            if (VERSION.SDK_INT >= 19) {
                C0442b.m1941a(classLoader, list, file);
            } else if (VERSION.SDK_INT >= 14) {
                C0437a.m1935a(classLoader, list);
            } else {
                C0443c.m1943a(classLoader, list);
            }
        }
    }

    /* renamed from: a */
    private static File m1923a(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            m1928a(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            m1928a(file2);
        }
        File file3 = new File(file2, str);
        m1928a(file3);
        return file3;
    }

    /* renamed from: a */
    public static Method m1925a(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(str);
        sb.append(" with parameters ");
        sb.append(Arrays.asList(clsArr));
        sb.append(" not found in ");
        sb.append(obj.getClass());
        throw new NoSuchMethodException(sb.toString());
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003f A[SYNTHETIC, Splitter:B:31:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0041 A[Catch:{ RuntimeException -> 0x0047 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m1927a(android.content.Context r2, java.io.File r3, java.io.File r4, java.lang.String r5, java.lang.String r6, boolean r7) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.util.Set<java.io.File> r7 = f1873a
            monitor-enter(r7)
            java.util.Set<java.io.File> r0 = f1873a     // Catch:{ all -> 0x0049 }
            boolean r0 = r0.contains(r3)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x000d:
            java.util.Set<java.io.File> r0 = f1873a     // Catch:{ all -> 0x0049 }
            r0.add(r3)     // Catch:{ all -> 0x0049 }
            java.lang.ClassLoader r0 = r2.getClassLoader()     // Catch:{ RuntimeException -> 0x0047 }
            if (r0 != 0) goto L_0x001a
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x001a:
            m1933c(r2)     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            java.io.File r4 = m1923a(r2, r4, r5)     // Catch:{ all -> 0x0049 }
            android.support.multidex.b r5 = new android.support.multidex.b     // Catch:{ all -> 0x0049 }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x0049 }
            r3 = 0
            r1 = 0
            java.util.List r1 = r5.mo2022a(r2, r6, r1)     // Catch:{ all -> 0x0042 }
            m1929a(r0, r4, r1)     // Catch:{ IOException -> 0x0030 }
            goto L_0x0038
        L_0x0030:
            r1 = 1
            java.util.List r2 = r5.mo2022a(r2, r6, r1)     // Catch:{ all -> 0x0042 }
            m1929a(r0, r4, r2)     // Catch:{ all -> 0x0042 }
        L_0x0038:
            r5.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x003d
        L_0x003c:
            r3 = move-exception
        L_0x003d:
            if (r3 != 0) goto L_0x0041
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x0041:
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x0042:
            r2 = move-exception
            r5.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r2 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.multidex.C0436a.m1927a(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }
}
