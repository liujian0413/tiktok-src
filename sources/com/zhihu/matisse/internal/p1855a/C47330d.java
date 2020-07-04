package com.zhihu.matisse.internal.p1855a;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.taobao.android.dexposed.ClassUtils;
import com.zhihu.matisse.MimeType;
import com.zhihu.matisse.internal.entity.C47336b;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.p1853a.C47322a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.zhihu.matisse.internal.a.d */
public final class C47330d {

    /* renamed from: a */
    private static final String f121428a = "d";

    private C47330d() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    /* renamed from: a */
    public static float m147777a(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return Float.valueOf(decimalFormat.format((double) ((((float) j) / 1024.0f) / 1024.0f)).replaceAll(",", ClassUtils.PACKAGE_SEPARATOR)).floatValue();
    }

    /* renamed from: c */
    private static boolean m147783c(ContentResolver contentResolver, Uri uri) {
        try {
            int attributeInt = C47327a.m147768a(m147780a(contentResolver, uri)).getAttributeInt("Orientation", -1);
            if (attributeInt == 6 || attributeInt == 8) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        } catch (NullPointerException unused2) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m147782b(Context context, Item item) {
        if (context == null) {
            return false;
        }
        ContentResolver contentResolver = context.getContentResolver();
        for (MimeType checkType : C47338d.m147803a().f121445a) {
            if (checkType.checkType(contentResolver, item.f121436c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Point m147778a(Uri uri, Activity activity) {
        ContentResolver contentResolver = activity.getContentResolver();
        Point b = m147781b(contentResolver, uri);
        int i = b.x;
        int i2 = b.y;
        if (m147783c(contentResolver, uri)) {
            i = b.y;
            i2 = b.x;
        }
        if (i2 == 0) {
            return new Point(1600, 1600);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f = (float) i;
        float f2 = ((float) displayMetrics.widthPixels) / f;
        float f3 = (float) i2;
        float f4 = ((float) displayMetrics.heightPixels) / f3;
        if (f2 > f4) {
            return new Point((int) (f * f2), (int) (f3 * f4));
        }
        return new Point((int) (f * f2), (int) (f3 * f4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:17:0x0029, B:24:0x0034] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0034 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[SYNTHETIC, Splitter:B:20:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[SYNTHETIC, Splitter:B:27:0x003b] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0041 A[SYNTHETIC, Splitter:B:32:0x0041] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0034=Splitter:B:24:0x0034, B:17:0x0029=Splitter:B:17:0x0029} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Point m147781b(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            r0 = 0
            r1 = 0
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException -> 0x0034, NullPointerException -> 0x0029 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0034, NullPointerException -> 0x0029 }
            r3 = 1
            r2.inJustDecodeBounds = r3     // Catch:{ FileNotFoundException -> 0x0034, NullPointerException -> 0x0029 }
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0034, NullPointerException -> 0x0029 }
            android.graphics.BitmapFactory.decodeStream(r4, r0, r2)     // Catch:{ FileNotFoundException -> 0x0025, NullPointerException -> 0x0023, all -> 0x0020 }
            int r5 = r2.outWidth     // Catch:{ FileNotFoundException -> 0x0025, NullPointerException -> 0x0023, all -> 0x0020 }
            int r0 = r2.outHeight     // Catch:{ FileNotFoundException -> 0x0025, NullPointerException -> 0x0023, all -> 0x0020 }
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ FileNotFoundException -> 0x0025, NullPointerException -> 0x0023, all -> 0x0020 }
            r2.<init>(r5, r0)     // Catch:{ FileNotFoundException -> 0x0025, NullPointerException -> 0x0023, all -> 0x0020 }
            if (r4 == 0) goto L_0x001f
            r4.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            return r2
        L_0x0020:
            r5 = move-exception
            r0 = r4
            goto L_0x003f
        L_0x0023:
            r0 = r4
            goto L_0x0029
        L_0x0025:
            r0 = r4
            goto L_0x0034
        L_0x0027:
            r5 = move-exception
            goto L_0x003f
        L_0x0029:
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ all -> 0x0027 }
            r4.<init>(r1, r1)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            return r4
        L_0x0034:
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ all -> 0x0027 }
            r4.<init>(r1, r1)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x003e
            r0.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            return r4
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.p1855a.C47330d.m147781b(android.content.ContentResolver, android.net.Uri):android.graphics.Point");
    }

    /* renamed from: a */
    public static C47336b m147779a(Context context, Item item) {
        if (!m147782b(context, item)) {
            return new C47336b(context.getString(R.string.c8b));
        }
        if (C47338d.m147803a().f121454j != null) {
            for (C47322a a : C47338d.m147803a().f121454j) {
                C47336b a2 = a.mo61511a(context, item);
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m147780a(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "content"
            java.lang.String r2 = r9.getScheme()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004a
            r1 = 1
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x0042 }
            r1 = 0
            java.lang.String r2 = "_data"
            r4[r1] = r2     // Catch:{ all -> 0x0042 }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r8 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x003c
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x003a }
            if (r9 != 0) goto L_0x002a
            goto L_0x003c
        L_0x002a:
            java.lang.String r9 = "_data"
            int r9 = r8.getColumnIndex(r9)     // Catch:{ all -> 0x003a }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x003a }
            if (r8 == 0) goto L_0x0039
            r8.close()
        L_0x0039:
            return r9
        L_0x003a:
            r9 = move-exception
            goto L_0x0044
        L_0x003c:
            if (r8 == 0) goto L_0x0041
            r8.close()
        L_0x0041:
            return r0
        L_0x0042:
            r9 = move-exception
            r8 = r0
        L_0x0044:
            if (r8 == 0) goto L_0x0049
            r8.close()
        L_0x0049:
            throw r9
        L_0x004a:
            java.lang.String r8 = r9.getPath()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.p1855a.C47330d.m147780a(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
