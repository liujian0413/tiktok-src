package com.p280ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams.MediaEntity;
import com.p280ss.android.ugc.aweme.profile.util.C36749q;
import com.zhihu.matisse.C47321a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.miniapp.media.a */
public final class C33410a {

    /* renamed from: a */
    private C36749q f87259a;

    /* renamed from: b */
    private Activity f87260b;

    /* renamed from: a */
    public final void mo85644a() {
        this.f87259a.mo93088g(6);
    }

    /* renamed from: c */
    private static String m108056c() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    public final MediaEntity mo85646b() {
        MediaEntity mediaEntity = new MediaEntity(m108053a(this.f87260b, m108055b(this.f87259a.mo93086f())), "", 0, 0, 0, 0, "");
        return mediaEntity;
    }

    /* renamed from: a */
    public final void mo85645a(int i) {
        this.f87259a.f96470i = i;
        this.f87259a.mo93083c(6);
    }

    /* renamed from: a */
    private static int m108052a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return NormalGiftView.ALPHA_180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    private Bitmap m108055b(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) m108052a(str));
        return Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
    }

    /* renamed from: a */
    public static List<MediaEntity> m108054a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List<String> b = C47321a.m147752b(intent);
        if (b == null) {
            b = new LinkedList<>();
        }
        for (String mediaEntity : b) {
            MediaEntity mediaEntity2 = new MediaEntity(mediaEntity, "", 0, 0, 0, 0, "");
            arrayList.add(mediaEntity2);
        }
        return arrayList;
    }

    public C33410a(Activity activity, Fragment fragment) {
        this.f87260b = activity;
        this.f87259a = new C36749q(activity, fragment, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC, Splitter:B:26:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b A[SYNTHETIC, Splitter:B:37:0x007b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m108053a(android.content.Context r5, android.graphics.Bitmap r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L_0x0005
            java.lang.String r5 = ""
            return r5
        L_0x0005:
            java.io.File r5 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.ss.android.ugc.aweme.profile.util.q r1 = r4.f87259a
            java.lang.String r1 = r1.f96466e
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = m108056c()
            r0.append(r1)
            java.lang.String r1 = ".jpg"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            r0 = 0
            boolean r1 = r5.exists()     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            if (r1 != 0) goto L_0x003c
            java.io.File r1 = r5.getParentFile()     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            r1.mkdirs()     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            r5.createNewFile()     // Catch:{ IOException -> 0x006f, all -> 0x005f }
        L_0x003c:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            r1.<init>(r5)     // Catch:{ IOException -> 0x006f, all -> 0x005f }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x0070, all -> 0x005c }
            r3 = 100
            r6.compress(r2, r3, r1)     // Catch:{ IOException -> 0x0070, all -> 0x005c }
            r1.flush()     // Catch:{ IOException -> 0x0070, all -> 0x005c }
            boolean r0 = r6.isRecycled()
            if (r0 != 0) goto L_0x0054
            r6.recycle()
        L_0x0054:
            r1.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            java.lang.String r5 = r5.getAbsolutePath()
            return r5
        L_0x005c:
            r5 = move-exception
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r5 = move-exception
        L_0x0060:
            boolean r1 = r6.isRecycled()
            if (r1 != 0) goto L_0x0069
            r6.recycle()
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r0.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            throw r5
        L_0x006f:
            r1 = r0
        L_0x0070:
            boolean r5 = r6.isRecycled()
            if (r5 != 0) goto L_0x0079
            r6.recycle()
        L_0x0079:
            if (r1 == 0) goto L_0x007e
            r1.close()     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp.media.C33410a.m108053a(android.content.Context, android.graphics.Bitmap):java.lang.String");
    }
}
