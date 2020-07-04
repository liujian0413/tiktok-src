package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.squareup.picasso.C18850u.C18851a;
import com.squareup.picasso.Picasso.LoadedFrom;
import java.io.IOException;

/* renamed from: com.squareup.picasso.n */
final class C18838n extends C18827g {

    /* renamed from: b */
    private static final String[] f50770b = {"orientation"};

    /* renamed from: com.squareup.picasso.n$a */
    enum C18839a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: d */
        final int f50775d;

        /* renamed from: e */
        final int f50776e;

        /* renamed from: f */
        final int f50777f;

        private C18839a(int i, int i2, int i3) {
            this.f50775d = i;
            this.f50776e = i2;
            this.f50777f = i3;
        }
    }

    C18838n(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final boolean mo50006a(C18846s sVar) {
        Uri uri = sVar.f50794d;
        if (!C38347c.f99553h.equals(uri.getScheme()) || !"media".equals(uri.getAuthority())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m61527a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = f50770b     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ RuntimeException -> 0x0030, all -> 0x0028 }
            if (r8 == 0) goto L_0x0022
            boolean r9 = r8.moveToFirst()     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r9 != 0) goto L_0x0016
            goto L_0x0022
        L_0x0016:
            int r9 = r8.getInt(r0)     // Catch:{ RuntimeException -> 0x0031, all -> 0x0020 }
            if (r8 == 0) goto L_0x001f
            r8.close()
        L_0x001f:
            return r9
        L_0x0020:
            r9 = move-exception
            goto L_0x002a
        L_0x0022:
            if (r8 == 0) goto L_0x0027
            r8.close()
        L_0x0027:
            return r0
        L_0x0028:
            r9 = move-exception
            r8 = r1
        L_0x002a:
            if (r8 == 0) goto L_0x002f
            r8.close()
        L_0x002f:
            throw r9
        L_0x0030:
            r8 = r1
        L_0x0031:
            if (r8 == 0) goto L_0x0036
            r8.close()
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C18838n.m61527a(android.content.ContentResolver, android.net.Uri):int");
    }

    /* renamed from: a */
    private static C18839a m61528a(int i, int i2) {
        if (i <= C18839a.MICRO.f50776e && i2 <= C18839a.MICRO.f50777f) {
            return C18839a.MICRO;
        }
        if (i > C18839a.MINI.f50776e || i2 > C18839a.MINI.f50777f) {
            return C18839a.FULL;
        }
        return C18839a.MINI;
    }

    /* renamed from: a */
    public final C18851a mo50005a(C18846s sVar, int i) throws IOException {
        boolean z;
        Bitmap bitmap;
        int i2;
        C18846s sVar2 = sVar;
        ContentResolver contentResolver = this.f50733a.getContentResolver();
        int a = m61527a(contentResolver, sVar2.f50794d);
        String type = contentResolver.getType(sVar2.f50794d);
        if (type == null || !type.startsWith("video/")) {
            z = false;
        } else {
            z = true;
        }
        if (sVar.mo50072d()) {
            C18839a a2 = m61528a(sVar2.f50798h, sVar2.f50799i);
            if (!z && a2 == C18839a.FULL) {
                return new C18851a(null, mo50025b(sVar), LoadedFrom.DISK, a);
            }
            long parseId = ContentUris.parseId(sVar2.f50794d);
            Options c = m61580c(sVar);
            c.inJustDecodeBounds = true;
            Options options = c;
            m61577a(sVar2.f50798h, sVar2.f50799i, a2.f50776e, a2.f50777f, c, sVar);
            if (z) {
                if (a2 == C18839a.FULL) {
                    i2 = 1;
                } else {
                    i2 = a2.f50775d;
                }
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, i2, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, a2.f50775d, options);
            }
            if (bitmap != null) {
                return new C18851a(bitmap, null, LoadedFrom.DISK, a);
            }
        }
        return new C18851a(null, mo50025b(sVar), LoadedFrom.DISK, a);
    }
}
