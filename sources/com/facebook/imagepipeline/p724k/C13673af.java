package com.facebook.imagepipeline.p724k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Video.Media;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.C13326a;
import com.facebook.common.references.C13329c;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.p715b.C13553g;
import com.facebook.imagepipeline.p720g.C13645c;
import com.facebook.imagepipeline.p720g.C13646d;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.af */
public final class C13673af implements C13699am<C13326a<C13645c>> {

    /* renamed from: a */
    private final Executor f36307a;

    /* renamed from: b */
    private final ContentResolver f36308b;

    /* renamed from: a */
    public static int m40318a(ImageRequest imageRequest) {
        if (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) {
            return 1;
        }
        return 3;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final String mo33305b(ImageRequest imageRequest) {
        String[] strArr;
        String str;
        Uri uri;
        Uri uri2 = imageRequest.mSourceUri;
        if (C13337d.m39035c(uri2)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (C13337d.m39036d(uri2)) {
            if (VERSION.SDK_INT < 19 || !"com.android.providers.media.documents".equals(uri2.getAuthority())) {
                uri = uri2;
                str = null;
                strArr = null;
            } else {
                String documentId = DocumentsContract.getDocumentId(uri2);
                uri = Media.EXTERNAL_CONTENT_URI;
                str = "_id=?";
                strArr = new String[]{documentId.split(":")[1]};
            }
            Cursor query = this.f36308b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        if (query != null) {
                            query.close();
                        }
                        return string;
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
        }
        return null;
    }

    public C13673af(Executor executor, ContentResolver contentResolver) {
        this.f36307a = executor;
        this.f36308b = contentResolver;
    }

    /* renamed from: a */
    public final void mo33296a(C13748k<C13326a<C13645c>> kVar, C13700an anVar) {
        final C13702ap c = anVar.mo33336c();
        final String b = anVar.mo33335b();
        final ImageRequest a = anVar.mo33333a();
        final C136741 r0 = new C13712au<C13326a<C13645c>>(kVar, c, "VideoThumbnailProducer", b) {
            /* access modifiers changed from: private */
            /* renamed from: d */
            public C13326a<C13645c> mo32537c() throws Exception {
                String b = C13673af.this.mo33305b(a);
                if (b == null) {
                    return null;
                }
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(b, C13673af.m40318a(a));
                if (createVideoThumbnail == null) {
                    return null;
                }
                return C13326a.m38995a(new C13646d(createVideoThumbnail, (C13329c<Bitmap>) C13553g.m39883a(), C13649g.f36269a, 0));
            }

            /* renamed from: c */
            private static void m40323c(C13326a<C13645c> aVar) {
                C13326a.m39001c(aVar);
            }

            /* renamed from: b */
            public final /* synthetic */ void mo32536b(Object obj) {
                m40323c((C13326a) obj);
            }

            /* renamed from: b */
            private static Map<String, String> m40322b(C13326a<C13645c> aVar) {
                boolean z;
                String str = "createdThumbnail";
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                return ImmutableMap.m38917of(str, String.valueOf(z));
            }

            /* renamed from: a */
            public final void mo32533a(Exception exc) {
                super.mo32533a(exc);
                c.onUltimateProducerReached(b, "VideoThumbnailProducer", false);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final /* synthetic */ Map mo33302c(Object obj) {
                return m40322b((C13326a) obj);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo32534a(C13326a<C13645c> aVar) {
                boolean z;
                super.mo32534a(aVar);
                C13702ap apVar = c;
                String str = b;
                String str2 = "VideoThumbnailProducer";
                if (aVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                apVar.onUltimateProducerReached(str, str2, z);
            }
        };
        anVar.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                r0.mo32532a();
            }
        });
        this.f36307a.execute(r0);
    }
}
