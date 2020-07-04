package com.p280ss.android.vesdk.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.common.C19706c;
import java.io.IOException;

/* renamed from: com.ss.android.vesdk.utils.BitmapLoader */
public class BitmapLoader {
    public static final String TAG = "BitmapLoader";
    public static boolean isSampleSizeRound = false;
    public static int maxSide = 4096;

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        int i;
        boolean z;
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if ((bitmap.getWidth() & 1) == 1) {
                i = bitmap.getWidth() - 1;
                z = true;
            } else {
                i = width;
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
                z = true;
            }
            if (!z) {
                return bitmap;
            }
            if (i > 0) {
                if (height > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i, height);
                    bitmap.recycle();
                    return createBitmap;
                }
            }
            return null;
        } catch (OutOfMemoryError e) {
            C19706c.m64972d("makeDimensionEven", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r3 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0065, code lost:
        if (r3 != null) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a A[SYNTHETIC, Splitter:B:33:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0060 A[SYNTHETIC, Splitter:B:36:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point getPictureSize(android.content.ContentResolver r3, java.lang.String r4) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            java.lang.String r1 = "content"
            boolean r1 = r4.startsWith(r1)
            if (r1 != 0) goto L_0x0014
            android.graphics.BitmapFactory.decodeFile(r4, r0)
            goto L_0x0068
        L_0x0014:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r1 = 0
            if (r3 != 0) goto L_0x0027
            java.lang.String r3 = "BitmapLoader"
            java.lang.String r4 = "contentResolver should not be null after Android Q"
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r4)     // Catch:{ FileNotFoundException -> 0x0064, OutOfMemoryError -> 0x0025 }
            return r1
        L_0x0023:
            r3 = move-exception
            goto L_0x005e
        L_0x0025:
            r3 = move-exception
            goto L_0x004f
        L_0x0027:
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r2)     // Catch:{ FileNotFoundException -> 0x0064, OutOfMemoryError -> 0x0025 }
            if (r3 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0034
            r3.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            return r1
        L_0x0035:
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0065, OutOfMemoryError -> 0x004c, all -> 0x0048 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x0065, OutOfMemoryError -> 0x004c, all -> 0x0048 }
            r2 = -1
            r1.<init>(r2, r2, r2, r2)     // Catch:{ FileNotFoundException -> 0x0065, OutOfMemoryError -> 0x004c, all -> 0x0048 }
            android.graphics.BitmapFactory.decodeFileDescriptor(r4, r1, r0)     // Catch:{ FileNotFoundException -> 0x0065, OutOfMemoryError -> 0x004c, all -> 0x0048 }
            if (r3 == 0) goto L_0x0068
        L_0x0044:
            r3.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x0048:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L_0x005e
        L_0x004c:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x004f:
            java.lang.String r4 = "BitmapLoader"
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0023 }
            com.p280ss.android.vesdk.C45372t.m143409d(r4, r3)     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x0068
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            throw r3
        L_0x0064:
            r3 = r1
        L_0x0065:
            if (r3 == 0) goto L_0x0068
            goto L_0x0044
        L_0x0068:
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = r0.outWidth
            int r0 = r0.outHeight
            r3.<init>(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.utils.BitmapLoader.getPictureSize(android.content.ContentResolver, java.lang.String):android.graphics.Point");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r3 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0050, code lost:
        if (r3 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0054, code lost:
        if (r3 != null) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b A[SYNTHETIC, Splitter:B:30:0x004b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "content"
            boolean r0 = r4.startsWith(r0)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0013
            android.media.ExifInterface r3 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0011 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0011 }
            r1 = r3
            goto L_0x0057
        L_0x0011:
            goto L_0x0057
        L_0x0013:
            if (r3 != 0) goto L_0x001d
            java.lang.String r3 = "BitmapLoader"
            java.lang.String r4 = "contentResolver should not be null after Android Q"
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r4)
            return r2
        L_0x001d:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r0)     // Catch:{ FileNotFoundException -> 0x0053, IOException -> 0x004f, all -> 0x0047 }
            if (r3 != 0) goto L_0x002f
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r2
        L_0x002f:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0050, all -> 0x0045 }
            r0 = 24
            if (r4 < r0) goto L_0x003f
            android.media.ExifInterface r4 = new android.media.ExifInterface     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0050, all -> 0x0045 }
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0050, all -> 0x0045 }
            r4.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0054, IOException -> 0x0050, all -> 0x0045 }
            r1 = r4
        L_0x003f:
            if (r3 == 0) goto L_0x0057
        L_0x0041:
            r3.close()     // Catch:{ IOException -> 0x0011 }
            goto L_0x0057
        L_0x0045:
            r4 = move-exception
            goto L_0x0049
        L_0x0047:
            r4 = move-exception
            r3 = r1
        L_0x0049:
            if (r3 == 0) goto L_0x004e
            r3.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r4
        L_0x004f:
            r3 = r1
        L_0x0050:
            if (r3 == 0) goto L_0x0057
            goto L_0x0041
        L_0x0053:
            r3 = r1
        L_0x0054:
            if (r3 == 0) goto L_0x0057
            goto L_0x0041
        L_0x0057:
            if (r1 == 0) goto L_0x0073
            java.lang.String r3 = "Orientation"
            int r3 = r1.getAttributeInt(r3, r2)
            r4 = 3
            if (r3 == r4) goto L_0x0070
            r4 = 6
            if (r3 == r4) goto L_0x006d
            r4 = 8
            if (r3 == r4) goto L_0x006a
            return r2
        L_0x006a:
            r3 = 270(0x10e, float:3.78E-43)
            return r3
        L_0x006d:
            r3 = 90
            return r3
        L_0x0070:
            r3 = 180(0xb4, float:2.52E-43)
            return r3
        L_0x0073:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i, int i2) {
        ExifInterface exifInterface;
        Bitmap bitmap;
        Options options = new Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                StringBuilder sb = new StringBuilder("BitmapFactory.decodeFile failed, imgPath");
                sb.append(str);
                C19706c.m64972d("loadBitmap", sb.toString());
                return null;
            }
            try {
                exifInterface = new ExifInterface(str);
            } catch (IOException unused) {
                exifInterface = null;
            }
            int i3 = 0;
            if (exifInterface != null) {
                int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                if (attributeInt == 3) {
                    i3 = NormalGiftView.ALPHA_180;
                } else if (attributeInt == 6) {
                    i3 = 90;
                } else if (attributeInt == 8) {
                    i3 = 270;
                }
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i3);
                bitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (decodeFile != null && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
            } else {
                bitmap = decodeFile;
            }
            return makeDimensionEven(bitmap);
        } catch (OutOfMemoryError e) {
            C19706c.m64972d("loadBitmap", e.getMessage());
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006d, code lost:
        if (r6 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0062 A[SYNTHETIC, Splitter:B:37:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0068 A[SYNTHETIC, Splitter:B:40:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int calculateInSampleSize(android.content.ContentResolver r6, java.lang.String r7, int r8, int r9) {
        /*
            r0 = 1
            r1 = -1
            if (r8 == r1) goto L_0x00ad
            if (r9 != r1) goto L_0x0008
            goto L_0x00ad
        L_0x0008:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r2.inJustDecodeBounds = r0
            java.lang.String r3 = "content"
            boolean r3 = r7.startsWith(r3)
            if (r3 != 0) goto L_0x001b
            android.graphics.BitmapFactory.decodeFile(r7, r2)
            goto L_0x0070
        L_0x001b:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            r3 = 0
            if (r6 != 0) goto L_0x002e
            java.lang.String r6 = "BitmapLoader"
            java.lang.String r7 = "contentResolver should not be null after Android Q"
            com.p280ss.android.vesdk.C45372t.m143409d(r6, r7)     // Catch:{ FileNotFoundException -> 0x006c, OutOfMemoryError -> 0x002c }
            return r0
        L_0x002a:
            r6 = move-exception
            goto L_0x0066
        L_0x002c:
            r6 = move-exception
            goto L_0x0057
        L_0x002e:
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r6 = r6.openFileDescriptor(r7, r4)     // Catch:{ FileNotFoundException -> 0x006c, OutOfMemoryError -> 0x002c }
            if (r6 != 0) goto L_0x003c
            if (r6 == 0) goto L_0x003b
            r6.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return r0
        L_0x003c:
            java.io.FileDescriptor r7 = r6.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x006d, OutOfMemoryError -> 0x0054, all -> 0x0050 }
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x006d, OutOfMemoryError -> 0x0054, all -> 0x0050 }
            r3.<init>(r1, r1, r1, r1)     // Catch:{ FileNotFoundException -> 0x006d, OutOfMemoryError -> 0x0054, all -> 0x0050 }
            android.graphics.BitmapFactory.decodeFileDescriptor(r7, r3, r2)     // Catch:{ FileNotFoundException -> 0x006d, OutOfMemoryError -> 0x0054, all -> 0x0050 }
            if (r6 == 0) goto L_0x0070
        L_0x004a:
            r6.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0070
        L_0x004e:
            goto L_0x0070
        L_0x0050:
            r7 = move-exception
            r3 = r6
            r6 = r7
            goto L_0x0066
        L_0x0054:
            r7 = move-exception
            r3 = r6
            r6 = r7
        L_0x0057:
            java.lang.String r7 = "loadBitmap"
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x002a }
            com.p280ss.android.medialib.common.C19706c.m64972d(r7, r6)     // Catch:{ all -> 0x002a }
            if (r3 == 0) goto L_0x0070
            r3.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0070
        L_0x0066:
            if (r3 == 0) goto L_0x006b
            r3.close()     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            throw r6
        L_0x006c:
            r6 = r3
        L_0x006d:
            if (r6 == 0) goto L_0x0070
            goto L_0x004a
        L_0x0070:
            int r6 = r2.outHeight
            int r7 = r2.outWidth
            r1 = 0
            if (r9 <= r8) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            r5 = r9
            r9 = r8
            r8 = r5
        L_0x007b:
            if (r6 <= r7) goto L_0x0080
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0080:
            if (r6 > r8) goto L_0x0084
            if (r7 <= r9) goto L_0x00a8
        L_0x0084:
            float r1 = (float) r7
            float r9 = (float) r9
            float r1 = r1 / r9
            float r9 = (float) r6
            float r8 = (float) r8
            float r9 = r9 / r8
            boolean r8 = isSampleSizeRound
            if (r8 == 0) goto L_0x00a3
            float r8 = java.lang.Math.max(r9, r1)
            int r8 = java.lang.Math.round(r8)
            r1 = r8
        L_0x0097:
            int r8 = java.lang.Math.max(r7, r6)
            int r8 = r8 / r1
            int r9 = maxSide
            if (r8 <= r9) goto L_0x00a8
            int r1 = r1 * 2
            goto L_0x0097
        L_0x00a3:
            float r6 = java.lang.Math.max(r9, r1)
            int r1 = (int) r6
        L_0x00a8:
            int r6 = java.lang.Math.max(r0, r1)
            return r6
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.utils.BitmapLoader.calculateInSampleSize(android.content.ContentResolver, java.lang.String, int, int):int");
    }

    /* JADX WARNING: type inference failed for: r9v1 */
    /* JADX WARNING: type inference failed for: r9v2, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r7v3, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r7v7, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r9v3, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARNING: type inference failed for: r10v4, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r10v6 */
    /* JADX WARNING: type inference failed for: r10v7, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r10v8 */
    /* JADX WARNING: type inference failed for: r10v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r10 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0093, code lost:
        if (r10 != 0) goto L_0x0086;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [?[OBJECT, ARRAY], android.graphics.Bitmap, ?[int, boolean, OBJECT, ARRAY, byte, short, char], android.os.ParcelFileDescriptor]
      mth insns count: 76
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008e A[SYNTHETIC, Splitter:B:39:0x008e] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r7, java.lang.String r8, int r9, int r10) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            java.lang.String r1 = "content"
            boolean r1 = r8.startsWith(r1)
            if (r1 != 0) goto L_0x0013
            android.graphics.Bitmap r7 = loadBitmap(r8, r9, r10)
            goto L_0x00c6
        L_0x0013:
            if (r9 <= 0) goto L_0x001d
            if (r10 <= 0) goto L_0x001d
            int r9 = calculateInSampleSize(r7, r8, r9, r10)
            r0.inSampleSize = r9
        L_0x001d:
            r9 = 0
            if (r7 != 0) goto L_0x0028
            java.lang.String r7 = "BitmapLoader"
            java.lang.String r8 = "contentResolver should not be null after Android Q"
            com.p280ss.android.vesdk.C45372t.m143409d(r7, r8)
            return r9
        L_0x0028:
            android.net.Uri r10 = android.net.Uri.parse(r8)
            java.lang.String r1 = "loadBitmapCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "QPath="
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            r2.append(r8)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            com.p280ss.android.medialib.common.C19706c.m64972d(r1, r2)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r1 = "loadBitmapCompat"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r3 = "QUri="
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            r2.append(r10)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            com.p280ss.android.medialib.common.C19706c.m64972d(r1, r2)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r10 = r7.openFileDescriptor(r10, r1)     // Catch:{ FileNotFoundException -> 0x0092, OutOfMemoryError -> 0x0079, all -> 0x0077 }
            if (r10 != 0) goto L_0x0060
            if (r10 == 0) goto L_0x005f
            r10.close()     // Catch:{ IOException -> 0x005f }
        L_0x005f:
            return r9
        L_0x0060:
            java.io.FileDescriptor r1 = r10.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0093, OutOfMemoryError -> 0x0075 }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x0093, OutOfMemoryError -> 0x0075 }
            r3 = -1
            r2.<init>(r3, r3, r3, r3)     // Catch:{ FileNotFoundException -> 0x0093, OutOfMemoryError -> 0x0075 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r1, r2, r0)     // Catch:{ FileNotFoundException -> 0x0093, OutOfMemoryError -> 0x0075 }
            if (r10 == 0) goto L_0x0073
            r10.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            r9 = r0
            goto L_0x0096
        L_0x0075:
            r0 = move-exception
            goto L_0x007b
        L_0x0077:
            r7 = move-exception
            goto L_0x008c
        L_0x0079:
            r0 = move-exception
            r10 = r9
        L_0x007b:
            java.lang.String r1 = "loadBitmapCompat"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x008a }
            com.p280ss.android.medialib.common.C19706c.m64972d(r1, r0)     // Catch:{ all -> 0x008a }
            if (r10 == 0) goto L_0x0096
        L_0x0086:
            r10.close()     // Catch:{ IOException -> 0x0096 }
            goto L_0x0096
        L_0x008a:
            r7 = move-exception
            r9 = r10
        L_0x008c:
            if (r9 == 0) goto L_0x0091
            r9.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            throw r7
        L_0x0092:
            r10 = r9
        L_0x0093:
            if (r10 == 0) goto L_0x0096
            goto L_0x0086
        L_0x0096:
            int r7 = getRotation(r7, r8)
            if (r7 == 0) goto L_0x00c1
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r7 = (float) r7
            r5.postRotate(r7)
            r1 = 0
            r2 = 0
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            r6 = 1
            r0 = r9
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            if (r9 == 0) goto L_0x00c2
            boolean r8 = r9.isRecycled()
            if (r8 != 0) goto L_0x00c2
            r9.recycle()
            goto L_0x00c2
        L_0x00c1:
            r7 = r9
        L_0x00c2:
            android.graphics.Bitmap r7 = makeDimensionEven(r7)
        L_0x00c6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int):android.graphics.Bitmap");
    }
}
