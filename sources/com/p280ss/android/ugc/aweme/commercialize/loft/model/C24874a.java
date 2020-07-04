package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import android.content.Context;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.a */
public final class C24874a {

    /* renamed from: a */
    public static final C24875a f65591a = new C24875a(null);

    /* renamed from: b */
    private Context f65592b;

    /* renamed from: c */
    private final String f65593c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.a$a */
    public static final class C24875a extends C24892g<C24874a, Context> {
        private C24875a() {
            super(C248761.f65594a);
        }

        public /* synthetic */ C24875a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo65111a() {
        return m81625a(this.f65592b);
    }

    /* renamed from: b */
    public static void m81628b(String str) {
        C7573i.m23587b(str, "absPath");
        C42973bg.m136431c(str);
    }

    private C24874a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        this.f65592b = applicationContext;
        this.f65593c = "discover_loft_res";
    }

    /* renamed from: a */
    public static void m81627a(String str) {
        C7573i.m23587b(str, "absPath");
        File file = new File(str);
        if (file.exists() && !file.delete()) {
            C42973bg.m136431c(str);
        }
    }

    /* renamed from: a */
    private final String m81625a(Context context) {
        File file;
        try {
            if (context.getExternalCacheDir() == null || !context.getExternalCacheDir().exists()) {
                StringBuilder sb = new StringBuilder();
                File cacheDir = context.getCacheDir();
                C7573i.m23582a((Object) cacheDir, "context.cacheDir");
                sb.append(cacheDir.getAbsoluteFile());
                sb.append(File.separator);
                sb.append(this.f65593c);
                file = new File(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder();
                File externalCacheDir = context.getExternalCacheDir();
                C7573i.m23582a((Object) externalCacheDir, "context.externalCacheDir");
                sb2.append(externalCacheDir.getAbsoluteFile());
                sb2.append(File.separator);
                sb2.append(this.f65593c);
                file = new File(sb2.toString());
            }
            if (!file.exists()) {
                if (!file.mkdir()) {
                    StringBuilder sb3 = new StringBuilder("/data/data/");
                    sb3.append(context.getPackageName());
                    sb3.append("/cache/");
                    sb3.append(this.f65593c);
                    file = context.getDir(sb3.toString(), 0);
                }
            }
        } catch (Throwable unused) {
            StringBuilder sb4 = new StringBuilder();
            File cacheDir2 = context.getCacheDir();
            C7573i.m23582a((Object) cacheDir2, "context.cacheDir");
            sb4.append(cacheDir2.getAbsoluteFile());
            sb4.append(File.separator);
            sb4.append(this.f65593c);
            file = new File(sb4.toString());
            if (!file.exists()) {
                file.mkdir();
            }
        }
        C7573i.m23582a((Object) file, "file");
        String absolutePath = file.getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "file.absolutePath");
        return absolutePath;
    }

    /* renamed from: a */
    public final String mo65112a(Loft loft) {
        boolean z;
        String str;
        C7573i.m23587b(loft, "loft");
        CharSequence id = loft.getId();
        boolean z2 = false;
        if (id == null || id.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            LoftAnimationRes animationRes = loft.getAnimationRes();
            if (animationRes != null) {
                str = animationRes.getDownloadUrl();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                String id2 = loft.getId();
                if (id2 == null) {
                    C7573i.m23580a();
                }
                LoftAnimationRes animationRes2 = loft.getAnimationRes();
                if (animationRes2 == null) {
                    C7573i.m23580a();
                }
                return m81629c(id2, animationRes2.getDownloadUrl());
            }
        }
        return "";
    }

    public /* synthetic */ C24874a(Context context, C7571f fVar) {
        this(context);
    }

    /* renamed from: c */
    private static String m81629c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String a = C6306c.m19561a(sb2.toString());
        if (a == null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(str2);
            a = sb3.toString();
        }
        sb.append(a);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m81626a(String str, String str2) throws ZipException, IOException {
        C7573i.m23587b(str, "src");
        C7573i.m23587b(str2, "des");
        Enumeration entries = new ZipFile(str).entries();
        while (entries.hasMoreElements()) {
            Object nextElement = entries.nextElement();
            if (nextElement != null) {
                ZipEntry zipEntry = (ZipEntry) nextElement;
                if (zipEntry.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(File.separator);
                    sb.append(zipEntry.getName());
                    String absolutePath = new File(sb.toString()).getAbsolutePath();
                    C7573i.m23582a((Object) absolutePath, "File(dirStr).absolutePath");
                    return absolutePath;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.zip.ZipEntry");
            }
        }
        return "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e6  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File m81630d(java.lang.String r7, java.lang.String r8) throws java.io.IOException {
        /*
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "/"
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r1)
            r1 = 0
            java.util.List r0 = r2.split(r0, r1)
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L_0x0043
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x001e:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r2.previous()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 != 0) goto L_0x001e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r3
            java.util.List r0 = kotlin.collections.C7525m.m23505c(r0, r2)
            goto L_0x0047
        L_0x0043:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x0047:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            if (r0 == 0) goto L_0x00e6
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.io.File r2 = new java.io.File
            r2.<init>(r7)
            boolean r4 = r2.exists()
            if (r4 != 0) goto L_0x0061
            r2.mkdir()
        L_0x0061:
            int r2 = r0.length
            if (r2 <= r3) goto L_0x00d1
            java.io.File r8 = new java.io.File
            r8.<init>(r7)
            int r7 = r0.length
            int r7 = r7 - r3
        L_0x006b:
            if (r1 >= r7) goto L_0x009b
            r2 = r0[r1]
            java.nio.charset.Charset r4 = kotlin.text.C48038d.f122885f     // Catch:{ UnsupportedEncodingException -> 0x008d }
            if (r2 == 0) goto L_0x0085
            byte[] r4 = r2.getBytes(r4)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            java.nio.charset.Charset r5 = kotlin.text.C48038d.f122880a     // Catch:{ UnsupportedEncodingException -> 0x008d }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r6.<init>(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            r2 = r6
            goto L_0x008d
        L_0x0085:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ UnsupportedEncodingException -> 0x008d }
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            r4.<init>(r5)     // Catch:{ UnsupportedEncodingException -> 0x008d }
            throw r4     // Catch:{ UnsupportedEncodingException -> 0x008d }
        L_0x008d:
            java.io.File r4 = new java.io.File
            if (r2 != 0) goto L_0x0094
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0094:
            r4.<init>(r8, r2)
            int r1 = r1 + 1
            r8 = r4
            goto L_0x006b
        L_0x009b:
            boolean r7 = r8.exists()
            if (r7 != 0) goto L_0x00a4
            r8.mkdirs()
        L_0x00a4:
            int r7 = r0.length
            int r7 = r7 - r3
            r7 = r0[r7]
            java.nio.charset.Charset r0 = kotlin.text.C48038d.f122885f     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            if (r7 == 0) goto L_0x00be
            byte[] r0 = r7.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            java.nio.charset.Charset r1 = kotlin.text.C48038d.f122880a     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            java.lang.String r2 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            r2.<init>(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            r7 = r2
            goto L_0x00c6
        L_0x00be:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
            throw r0     // Catch:{ UnsupportedEncodingException -> 0x00c6 }
        L_0x00c6:
            java.io.File r0 = new java.io.File
            if (r7 != 0) goto L_0x00cd
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00cd:
            r0.<init>(r8, r7)
            return r0
        L_0x00d1:
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r8)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L_0x00e5
            boolean r7 = r0.isFile()
            if (r7 == 0) goto L_0x00e5
            r0.createNewFile()
        L_0x00e5:
            return r0
        L_0x00e6:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException
            java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.loft.model.C24874a.m81630d(java.lang.String, java.lang.String):java.io.File");
    }

    /* renamed from: b */
    public final int mo65113b(String str, String str2) throws ZipException, IOException {
        C7573i.m23587b(str, "src");
        C7573i.m23587b(str2, "des");
        ZipFile zipFile = new ZipFile(str);
        Enumeration entries = zipFile.entries();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (entries.hasMoreElements()) {
            Object nextElement = entries.nextElement();
            if (nextElement != null) {
                ZipEntry zipEntry = (ZipEntry) nextElement;
                if (zipEntry.isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(File.separator);
                    sb.append(zipEntry.getName());
                    String sb2 = sb.toString();
                    Charset charset = C48038d.f122885f;
                    if (sb2 != null) {
                        byte[] bytes = sb2.getBytes(charset);
                        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                        new File(new String(bytes, C48038d.f122880a)).mkdir();
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                } else {
                    String name = zipEntry.getName();
                    C7573i.m23582a((Object) name, "ze.name");
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(m81630d(str2, name)));
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.util.zip.ZipEntry");
            }
        }
        zipFile.close();
        return 0;
    }
}
