package com.facebook.imagepipeline.p724k;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.memory.C13322g;
import com.facebook.common.p686c.C13286a;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C13848e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.aa */
public class C13664aa extends C13668ac implements C13731bb<C13647e> {

    /* renamed from: a */
    private static final Class<?> f36285a = C13664aa.class;

    /* renamed from: b */
    private static final String[] f36286b = {"_id", "_data"};

    /* renamed from: c */
    private static final String[] f36287c = {"_data"};

    /* renamed from: d */
    private static final Rect f36288d = new Rect(0, 0, 512, 384);

    /* renamed from: e */
    private static final Rect f36289e = new Rect(0, 0, 96, 96);

    /* renamed from: f */
    private final ContentResolver f36290f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33298a() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    /* renamed from: a */
    private static int m40281a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13647e mo33297a(ImageRequest imageRequest) throws IOException {
        Uri uri = imageRequest.mSourceUri;
        if (C13337d.m39038f(uri)) {
            C13647e a = m40282a(uri, imageRequest.mResizeOptions);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: b */
    private static int m40284b(C13596d dVar) {
        if (C13732bc.m40513a(f36289e.width(), f36289e.height(), dVar)) {
            return 3;
        }
        if (C13732bc.m40513a(f36288d.width(), f36288d.height(), dVar)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo33299a(C13596d dVar) {
        return C13732bc.m40513a(f36288d.width(), f36288d.height(), dVar);
    }

    /* renamed from: b */
    private static int m40285b(String str) {
        if (str != null) {
            try {
                return C13848e.m40891a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e) {
                C13286a.m38852b(f36285a, (Throwable) e, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private C13647e m40282a(Uri uri, C13596d dVar) throws IOException {
        Cursor query = this.f36290f.query(uri, f36286b, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (dVar != null) {
                C13647e a = m40283a(dVar, query.getInt(query.getColumnIndex("_id")));
                if (a != null) {
                    a.f36259b = m40285b(string);
                    query.close();
                    return a;
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imagepipeline.p720g.C13647e m40283a(com.facebook.imagepipeline.common.C13596d r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            int r5 = m40284b(r5)
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            android.content.ContentResolver r1 = r4.f36290f     // Catch:{ all -> 0x0052 }
            long r2 = (long) r6     // Catch:{ all -> 0x0052 }
            java.lang.String[] r6 = f36287c     // Catch:{ all -> 0x0052 }
            android.database.Cursor r5 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r1, r2, r5, r6)     // Catch:{ all -> 0x0052 }
            if (r5 != 0) goto L_0x0019
            if (r5 == 0) goto L_0x0018
            r5.close()
        L_0x0018:
            return r0
        L_0x0019:
            r5.moveToFirst()     // Catch:{ all -> 0x0050 }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0050 }
            if (r6 <= 0) goto L_0x004a
            java.lang.String r6 = "_data"
            int r6 = r5.getColumnIndex(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0050 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0050 }
            r1.<init>(r6)     // Catch:{ all -> 0x0050 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x004a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0050 }
            r0.<init>(r6)     // Catch:{ all -> 0x0050 }
            int r6 = m40281a(r6)     // Catch:{ all -> 0x0050 }
            com.facebook.imagepipeline.g.e r6 = r4.mo33304b(r0, r6)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            return r6
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.close()
        L_0x004f:
            return r0
        L_0x0050:
            r6 = move-exception
            goto L_0x0054
        L_0x0052:
            r6 = move-exception
            r5 = r0
        L_0x0054:
            if (r5 == 0) goto L_0x0059
            r5.close()
        L_0x0059:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13664aa.m40283a(com.facebook.imagepipeline.common.d, int):com.facebook.imagepipeline.g.e");
    }

    public C13664aa(Executor executor, C13322g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f36290f = contentResolver;
    }
}
