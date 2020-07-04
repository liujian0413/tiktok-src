package com.p280ss.android.ttve.nativePort;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;

/* renamed from: com.ss.android.ttve.nativePort.TEImageFactory */
public class TEImageFactory {
    private static final String BITMAP = "bitmap";
    private static final String TAG = "TEImageFactory";

    /* renamed from: com.ss.android.ttve.nativePort.TEImageFactory$ImageInfo */
    public static class ImageInfo {
        Bitmap bitmap;
        int height;
        String mimeType;
        int rotation;
        int width;

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public int getHeight() {
            return this.height;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public int getRotation() {
            return this.rotation;
        }

        public int getWidth() {
            return this.width;
        }
    }

    public static void recycleBitmap(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str) {
        return decodeFile(contentResolver, str, null);
    }

    public static ImageInfo getImageInfo(ContentResolver contentResolver, String str) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        decodeFileCompat(contentResolver, str, options);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.mimeType = options.outMimeType;
        return imageInfo;
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
            java.lang.String r3 = "TEImageFactory"
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.nativePort.TEImageFactory.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static ImageInfo decodeFile(ContentResolver contentResolver, String str, Options options) {
        if (options == null) {
            options = new Options();
        }
        options.inPreferredConfig = Config.ARGB_8888;
        Bitmap decodeFileCompat = decodeFileCompat(contentResolver, str, options);
        if (decodeFileCompat == null) {
            return null;
        }
        if (decodeFileCompat.getConfig() != Config.ARGB_8888) {
            Bitmap copy = decodeFileCompat.copy(Config.ARGB_8888, false);
            recycleBitmap(decodeFileCompat);
            decodeFileCompat = copy;
        }
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = decodeFileCompat.getWidth();
        imageInfo.height = decodeFileCompat.getHeight();
        imageInfo.bitmap = decodeFileCompat;
        imageInfo.mimeType = BITMAP;
        imageInfo.rotation = getRotation(contentResolver, str);
        return imageInfo;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[SYNTHETIC, Splitter:B:33:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae A[SYNTHETIC, Splitter:B:43:0x00ae] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00cb A[SYNTHETIC, Splitter:B:50:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120 A[SYNTHETIC, Splitter:B:79:0x0120] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0127 A[SYNTHETIC, Splitter:B:87:0x0127] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFileCompat(android.content.ContentResolver r3, java.lang.String r4, android.graphics.BitmapFactory.Options r5) {
        /*
            java.lang.String r0 = "content"
            boolean r0 = r4.startsWith(r0)
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x00ea
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "meizu"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Meizu"
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "MEIZU"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0035
        L_0x0028:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r3 == r0) goto L_0x0037
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r3 != r0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            if (r3 == 0) goto L_0x00e4
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0097, IOException -> 0x0070, all -> 0x006d }
            java.lang.String r0 = "r"
            r3.<init>(r4, r0)     // Catch:{ FileNotFoundException -> 0x0097, IOException -> 0x0070, all -> 0x006d }
            java.io.FileDescriptor r4 = r3.getFD()     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0069 }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0069 }
            r0.<init>(r2, r2, r2, r2)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0069 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r0, r5)     // Catch:{ FileNotFoundException -> 0x006b, IOException -> 0x0069 }
            r3.close()     // Catch:{ IOException -> 0x0053 }
            goto L_0x0118
        L_0x0053:
            r3 = move-exception
            java.lang.String r5 = "TEImageFactory"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "rubbish meizu raf close error "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.p280ss.android.vesdk.C45372t.m143409d(r5, r3)
            goto L_0x0118
        L_0x0069:
            r4 = move-exception
            goto L_0x0072
        L_0x006b:
            r4 = move-exception
            goto L_0x0099
        L_0x006d:
            r4 = move-exception
            r3 = r1
            goto L_0x00c9
        L_0x0070:
            r4 = move-exception
            r3 = r1
        L_0x0072:
            java.lang.String r5 = "TEImageFactory"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "rubbish meizu decodeFileDescriptor error "
            r0.<init>(r2)     // Catch:{ all -> 0x00c8 }
            r0.append(r4)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x00c8 }
            com.p280ss.android.vesdk.C45372t.m143409d(r5, r4)     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x012a
            r3.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x012a
        L_0x008c:
            r3 = move-exception
            java.lang.String r4 = "TEImageFactory"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "rubbish meizu raf close error "
            r5.<init>(r0)
            goto L_0x00bd
        L_0x0097:
            r4 = move-exception
            r3 = r1
        L_0x0099:
            java.lang.String r5 = "TEImageFactory"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
            java.lang.String r2 = "rubbish meizu decodeFileDescriptor error "
            r0.<init>(r2)     // Catch:{ all -> 0x00c8 }
            r0.append(r4)     // Catch:{ all -> 0x00c8 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x00c8 }
            com.p280ss.android.vesdk.C45372t.m143409d(r5, r4)     // Catch:{ all -> 0x00c8 }
            if (r3 == 0) goto L_0x012a
            r3.close()     // Catch:{ IOException -> 0x00b3 }
            goto L_0x012a
        L_0x00b3:
            r3 = move-exception
            java.lang.String r4 = "TEImageFactory"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "rubbish meizu raf close error "
            r5.<init>(r0)
        L_0x00bd:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.p280ss.android.vesdk.C45372t.m143409d(r4, r3)
            goto L_0x012a
        L_0x00c8:
            r4 = move-exception
        L_0x00c9:
            if (r3 == 0) goto L_0x00e3
            r3.close()     // Catch:{ IOException -> 0x00cf }
            goto L_0x00e3
        L_0x00cf:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "rubbish meizu raf close error "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "TEImageFactory"
            com.p280ss.android.vesdk.C45372t.m143409d(r5, r3)
        L_0x00e3:
            throw r4
        L_0x00e4:
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r4, r5)
            r1 = r3
            goto L_0x012a
        L_0x00ea:
            if (r3 != 0) goto L_0x00f4
            java.lang.String r3 = "TEImageFactory"
            java.lang.String r4 = "contentResolver should not be null after Android Q"
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r4)
            return r1
        L_0x00f4:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r3.openFileDescriptor(r4, r0)     // Catch:{ FileNotFoundException -> 0x0124, all -> 0x011c }
            if (r3 != 0) goto L_0x0106
            if (r3 == 0) goto L_0x0105
            r3.close()     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            return r1
        L_0x0106:
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch:{ FileNotFoundException -> 0x0125, all -> 0x011a }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x0125, all -> 0x011a }
            r0.<init>(r2, r2, r2, r2)     // Catch:{ FileNotFoundException -> 0x0125, all -> 0x011a }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFileDescriptor(r4, r0, r5)     // Catch:{ FileNotFoundException -> 0x0125, all -> 0x011a }
            if (r3 == 0) goto L_0x0118
            r3.close()     // Catch:{ IOException -> 0x0118 }
        L_0x0118:
            r1 = r4
            goto L_0x012a
        L_0x011a:
            r4 = move-exception
            goto L_0x011e
        L_0x011c:
            r4 = move-exception
            r3 = r1
        L_0x011e:
            if (r3 == 0) goto L_0x0123
            r3.close()     // Catch:{ IOException -> 0x0123 }
        L_0x0123:
            throw r4
        L_0x0124:
            r3 = r1
        L_0x0125:
            if (r3 == 0) goto L_0x012a
            r3.close()     // Catch:{ IOException -> 0x012a }
        L_0x012a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.nativePort.TEImageFactory.decodeFileCompat(android.content.ContentResolver, java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }
}
