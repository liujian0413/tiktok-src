package com.facebook.imagepipeline.p724k;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.C13322g;
import com.facebook.common.memory.C13323h;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.references.C13326a;
import com.facebook.common.util.C13337d;
import com.facebook.imageformat.C13508b;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C13844a;
import com.facebook.imageutils.C13848e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.ab */
public class C13665ab implements C13731bb<C13647e> {

    /* renamed from: a */
    public final C13322g f36291a;

    /* renamed from: b */
    private final Executor f36292b;

    /* renamed from: c */
    private final ContentResolver f36293c;

    /* renamed from: a */
    public final boolean mo33299a(C13596d dVar) {
        return C13732bc.m40513a(512, 512, dVar);
    }

    /* renamed from: a */
    private static int m40289a(ExifInterface exifInterface) {
        return C13848e.m40891a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
    }

    /* renamed from: a */
    private static boolean m40290a(String str) throws IOException {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final ExifInterface mo33300a(Uri uri) {
        String a = C13337d.m39032a(this.f36293c, uri);
        try {
            if (m40290a(a)) {
                return new ExifInterface(a);
            }
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C13286a.m38857c(C13665ab.class, "StackOverflowError in ExifInterface constructor");
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final C13647e mo33301a(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        int i;
        Pair a = C13844a.m40887a((InputStream) new C13323h(pooledByteBuffer));
        int a2 = m40289a(exifInterface);
        int i2 = -1;
        if (a != null) {
            i = ((Integer) a.first).intValue();
        } else {
            i = -1;
        }
        if (a != null) {
            i2 = ((Integer) a.second).intValue();
        }
        C13326a a3 = C13326a.m38995a(pooledByteBuffer);
        try {
            C13647e eVar = new C13647e(a3);
            C13326a.m39001c(a3);
            eVar.f36258a = C13508b.f35825a;
            eVar.f36259b = a2;
            eVar.f36261d = i;
            eVar.f36262e = i2;
            return eVar;
        } catch (Throwable th) {
            C13326a.m39001c(a3);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13647e> kVar, C13700an anVar) {
        C13702ap c = anVar.mo33336c();
        String b = anVar.mo33335b();
        final ImageRequest a = anVar.mo33333a();
        final C136661 r0 = new C13712au<C13647e>(kVar, c, "LocalExifThumbnailProducer", b) {
            /* access modifiers changed from: private */
            /* renamed from: d */
            public C13647e mo32537c() throws Exception {
                ExifInterface a = C13665ab.this.mo33300a(a.mSourceUri);
                if (a == null || !a.hasThumbnail()) {
                    return null;
                }
                return C13665ab.this.mo33301a(C13665ab.this.f36291a.mo32591a(a.getThumbnail()), a);
            }

            /* renamed from: a */
            private static void m40295a(C13647e eVar) {
                C13647e.m40237d(eVar);
            }

            /* renamed from: b */
            public final /* synthetic */ void mo32536b(Object obj) {
                m40295a((C13647e) obj);
            }

            /* renamed from: b */
            private static Map<String, String> m40296b(C13647e eVar) {
                boolean z;
                String str = "createdThumbnail";
                if (eVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return ImmutableMap.m38917of(str, Boolean.toString(z));
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final /* synthetic */ Map mo33302c(Object obj) {
                return m40296b((C13647e) obj);
            }
        };
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                r0.mo32532a();
            }
        });
        this.f36292b.execute(r0);
    }

    public C13665ab(Executor executor, C13322g gVar, ContentResolver contentResolver) {
        this.f36292b = executor;
        this.f36291a = gVar;
        this.f36293c = contentResolver;
    }
}
