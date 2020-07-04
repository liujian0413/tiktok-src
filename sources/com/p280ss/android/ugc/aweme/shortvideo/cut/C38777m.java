package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42026b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.p1724b.C43688a;
import com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43694c;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.m */
public final class C38777m<T> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f100751a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38777m.class), "diskCache", "getDiskCache()Lcom/ss/android/ugc/effectmanager/disklrucache/DiskLruCache;"))};

    /* renamed from: d */
    public static final C38778a f100752d = new C38778a(null);

    /* renamed from: b */
    public final long f100753b;

    /* renamed from: c */
    public final String f100754c;

    /* renamed from: e */
    private final C7541d f100755e;

    /* renamed from: f */
    private final C38746b<T> f100756f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.m$a */
    public static final class C38778a {
        private C38778a() {
        }

        public /* synthetic */ C38778a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.m$b */
    static final class C38779b extends Lambda implements C7561a<C43688a> {

        /* renamed from: a */
        final /* synthetic */ C38777m f100757a;

        C38779b(C38777m mVar) {
            this.f100757a = mVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C43688a invoke() {
            return C43688a.m138427a(new File(this.f100757a.f100754c), 1, 1, this.f100757a.f100753b);
        }
    }

    /* renamed from: b */
    private final C43688a m123839b() {
        return (C43688a) this.f100755e.getValue();
    }

    /* renamed from: a */
    public final void mo96870a() {
        try {
            m123839b().mo105696e();
            C43688a b = m123839b();
            C7573i.m23582a((Object) b, "diskCache");
            b.f113098b.delete();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private final C38795r<T> m123837a(InputStream inputStream) {
        C38795r<T> a = this.f100756f.mo96819a(inputStream);
        inputStream.close();
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.aweme.shortvideo.cut.C38795r<T> mo96869a(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            com.ss.android.ugc.effectmanager.b.a r0 = r2.m123839b()     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42026b.m133582a(r3)     // Catch:{ all -> 0x0033 }
            com.ss.android.ugc.effectmanager.b.a$c r3 = r0.mo105687a(r3)     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x0032
            r0 = 0
            java.io.InputStream r0 = r3.mo105712a(r0)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "snapshot.getInputStream(0)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ all -> 0x0030 }
            com.ss.android.ugc.aweme.shortvideo.cut.r r0 = r2.m123837a(r0)     // Catch:{ all -> 0x0030 }
            r3.close()
            return r0
        L_0x0030:
            r0 = move-exception
            goto L_0x0035
        L_0x0032:
            return r1
        L_0x0033:
            r0 = move-exception
            r3 = r1
        L_0x0035:
            if (r3 == 0) goto L_0x003a
            r3.close()
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.C38777m.mo96869a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.cut.r");
    }

    /* renamed from: b */
    public final boolean mo96872b(String str) {
        C7573i.m23587b(str, "key");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C43694c a = m123839b().mo105687a(C42026b.m133582a(str));
        if (a == null) {
            return false;
        }
        a.close();
        return true;
    }

    /* renamed from: a */
    private final void m123838a(OutputStream outputStream, C38795r<T> rVar) {
        this.f100756f.mo96820a(outputStream, rVar);
        outputStream.flush();
        outputStream.close();
    }

    public C38777m(String str, C38746b<T> bVar) {
        C7573i.m23587b(str, "cacheDir");
        C7573i.m23587b(bVar, "cacheWriterAndReader");
        this.f100754c = str;
        this.f100756f = bVar;
        long h = C7276d.m22827h();
        long j = 13107200;
        if (h > 52428800) {
            j = 52428800;
        } else if (h > 26214400) {
            j = 26214400;
        } else if (h <= 13107200) {
            j = 10485760;
        }
        this.f100753b = j;
        this.f100755e = C7546e.m23569a(new C38779b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC, Splitter:B:17:0x0050] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96871a(java.lang.String r4, com.p280ss.android.ugc.aweme.shortvideo.cut.C38795r<T> r5, kotlin.jvm.p357a.C7562b<? super java.lang.Boolean, kotlin.C7581n> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = "videoFrameData"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            java.lang.String r0 = "onInsertFinish"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.invoke(r4)
            return
        L_0x0021:
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r2 = r3.m123839b()     // Catch:{ Exception -> 0x004d }
            java.lang.String r4 = com.p280ss.android.ugc.aweme.story.shootvideo.publish.C42026b.m133582a(r4)     // Catch:{ Exception -> 0x004d }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r2.mo105690b(r4)     // Catch:{ Exception -> 0x004d }
            if (r4 == 0) goto L_0x004c
            java.io.OutputStream r0 = r4.mo105700a(r1)     // Catch:{ Exception -> 0x004e }
            if (r0 == 0) goto L_0x004c
            r3.m123838a(r0, r5)     // Catch:{ Exception -> 0x004e }
            r4.mo105701a()     // Catch:{ Exception -> 0x004e }
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x004e }
            r6.invoke(r5)     // Catch:{ Exception -> 0x004e }
            com.ss.android.ugc.effectmanager.b.a r5 = r3.m123839b()     // Catch:{ Exception -> 0x004e }
            r5.mo105692c()     // Catch:{ Exception -> 0x004e }
            goto L_0x0061
        L_0x004c:
            return
        L_0x004d:
            r4 = r0
        L_0x004e:
            if (r4 == 0) goto L_0x005a
            r4.mo105702b()     // Catch:{ Exception -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r4 = move-exception
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r4)
        L_0x005a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.invoke(r4)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.cut.C38777m.mo96871a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.cut.r, kotlin.jvm.a.b):void");
    }
}
