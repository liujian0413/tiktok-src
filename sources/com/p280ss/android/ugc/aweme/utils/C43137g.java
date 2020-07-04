package com.p280ss.android.ugc.aweme.utils;

import android.app.Application;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.util.LruCache;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.utils.g */
public final class C43137g {

    /* renamed from: a */
    public static final C43137g f111762a = C43139b.m136840a();

    /* renamed from: b */
    public static final C43138a f111763b = new C43138a(null);

    /* renamed from: c */
    private final LruCache<String, String> f111764c;

    /* renamed from: com.ss.android.ugc.aweme.utils.g$a */
    public static final class C43138a {
        private C43138a() {
        }

        /* renamed from: a */
        public static C43137g m136839a() {
            return C43137g.f111762a;
        }

        public /* synthetic */ C43138a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.g$b */
    static final class C43139b {

        /* renamed from: a */
        public static final C43139b f111765a = new C43139b();

        /* renamed from: b */
        private static final C43137g f111766b = new C43137g(null);

        private C43139b() {
        }

        /* renamed from: a */
        public static C43137g m136840a() {
            return f111766b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.g$c */
    static final class C43140c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C43137g f111767a;

        /* renamed from: b */
        final /* synthetic */ String f111768b;

        /* renamed from: c */
        final /* synthetic */ MediaType f111769c;

        C43140c(C43137g gVar, String str, MediaType mediaType) {
            this.f111767a = gVar;
            this.f111768b = str;
            this.f111769c = mediaType;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            return this.f111767a.mo104767b(this.f111768b, this.f111769c);
        }
    }

    /* renamed from: a */
    public static final C43137g m136830a() {
        return f111762a;
    }

    private C43137g() {
        this.f111764c = new LruCache<>(30);
    }

    public /* synthetic */ C43137g(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    private static String m136831a(MediaType mediaType) {
        switch (C43141h.f111770a[mediaType.ordinal()]) {
            case 1:
                return "_data= ?";
            case 2:
                return "_data= ?";
            case 3:
                return "_data= ?";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private static Uri m136834b(MediaType mediaType) {
        switch (C43141h.f111771b[mediaType.ordinal()]) {
            case 1:
                Uri uri = Media.EXTERNAL_CONTENT_URI;
                C7573i.m23582a((Object) uri, "MediaStore.Images.Media.EXTERNAL_CONTENT_URI");
                return uri;
            case 2:
                Uri uri2 = Video.Media.EXTERNAL_CONTENT_URI;
                C7573i.m23582a((Object) uri2, "MediaStore.Video.Media.EXTERNAL_CONTENT_URI");
                return uri2;
            case 3:
                Uri uri3 = Audio.Media.EXTERNAL_CONTENT_URI;
                C7573i.m23582a((Object) uri3, "MediaStore.Audio.Media.EXTERNAL_CONTENT_URI");
                return uri3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    private static boolean m136835b(String str) {
        boolean z;
        File externalFilesDir = C35574k.m114861b().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            String absolutePath = externalFilesDir.getAbsolutePath();
            C7573i.m23582a((Object) absolutePath, "it.absolutePath");
            z = C7634n.m23721b(str, absolutePath, false);
        } else {
            z = false;
        }
        if (!z) {
            Application b = C35574k.m114861b();
            C7573i.m23582a((Object) b, "CameraClient.getApplication()");
            File filesDir = b.getFilesDir();
            C7573i.m23582a((Object) filesDir, "CameraClient.getApplication().filesDir");
            String absolutePath2 = filesDir.getAbsolutePath();
            C7573i.m23582a((Object) absolutePath2, "CameraClient.getApplicat…n().filesDir.absolutePath");
            if (!C7634n.m23721b(str, absolutePath2, false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m136833a(String str) {
        if (!C35574k.m114859a().mo70096k().mo93305a(Property.OpenSDKQAdaption) || ((VERSION.SDK_INT <= 28 && !C35574k.m114859a().mo70096k().mo93305a(Property.SDKQAdaptionConfig)) || m136835b(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104766a(String str, MediaType mediaType) {
        C7573i.m23587b(str, "filePath");
        C7573i.m23587b(mediaType, "type");
        C1592h.m7853a((Callable<TResult>) new C43140c<TResult>(this, str, mediaType));
    }

    /* renamed from: a */
    public static List<String> m136832a(List<String> list, MediaType mediaType) {
        C7573i.m23587b(list, "filePaths");
        C7573i.m23587b(mediaType, "type");
        List<String> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(f111762a.mo104767b((String) list.get(i), mediaType));
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r9 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.Uri m136836c(java.lang.String r9, com.p280ss.android.ugc.aweme.utils.MediaType r10) {
        /*
            r8 = this;
            java.lang.System.currentTimeMillis()
            r0 = 0
            java.lang.String r4 = m136831a(r10)     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            r7 = 0
            r5[r7] = r9     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            java.lang.String r9 = "_id"
            r3[r7] = r9     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            android.app.Application r9 = com.p280ss.android.ugc.aweme.port.p1479in.C35574k.m114861b()     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            java.lang.String r1 = "CameraClient.getApplication()"
            kotlin.jvm.internal.C7573i.m23582a(r9, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            android.net.Uri r2 = m136834b(r10)     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            r6 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            if (r9 != 0) goto L_0x0033
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            goto L_0x0033
        L_0x0030:
            r10 = move-exception
            r0 = r9
            goto L_0x0055
        L_0x0033:
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = r9.getString(r7)     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            java.lang.String r1 = "external"
            android.net.Uri r1 = android.provider.MediaStore.Files.getContentUri(r1)     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            java.lang.String r2 = "id"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            long r2 = java.lang.Long.parseLong(r10)     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            android.net.Uri r10 = android.content.ContentUris.withAppendedId(r1, r2)     // Catch:{ Exception -> 0x005c, all -> 0x0030 }
            r9.close()
            return r10
        L_0x0054:
            r10 = move-exception
        L_0x0055:
            if (r0 == 0) goto L_0x005a
            r0.close()
        L_0x005a:
            throw r10
        L_0x005b:
            r9 = r0
        L_0x005c:
            if (r9 == 0) goto L_0x0061
        L_0x005e:
            r9.close()
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43137g.m136836c(java.lang.String, com.ss.android.ugc.aweme.utils.MediaType):android.net.Uri");
    }

    /* renamed from: b */
    public final String mo104767b(String str, MediaType mediaType) {
        boolean z;
        String str2;
        boolean z2;
        C7573i.m23587b(str, "filePath");
        C7573i.m23587b(mediaType, "type");
        if (!m136833a(str)) {
            return str;
        }
        String str3 = (String) this.f111764c.get(str);
        CharSequence charSequence = str3;
        boolean z3 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Uri c = m136836c(str, mediaType);
            if (c != null) {
                str2 = c.toString();
            } else {
                str2 = null;
            }
            CharSequence charSequence2 = str2;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f111764c.put(str, str2);
            }
        } else {
            str2 = str3;
        }
        CharSequence charSequence3 = str2;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            return str2;
        }
        return str;
    }
}
