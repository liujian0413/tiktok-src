package com.bytedance.common.utility;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BitmapUtils {
    public static Bitmap getBitmapFromSD(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return decodeBitmap(file);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int readPictureDegree(String str) {
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

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065 A[SYNTHETIC, Splitter:B:32:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006e A[SYNTHETIC, Splitter:B:39:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0077 A[SYNTHETIC, Splitter:B:46:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void rotateImage(java.lang.String r9) {
        /*
            r0 = -1
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0021 }
            r1.<init>(r9)     // Catch:{ IOException -> 0x0021 }
            java.lang.String r2 = "Orientation"
            r3 = 1
            int r1 = r1.getAttributeInt(r2, r3)     // Catch:{ IOException -> 0x0021 }
            r2 = 3
            if (r1 == r2) goto L_0x001e
            r2 = 6
            if (r1 == r2) goto L_0x001b
            r2 = 8
            if (r1 == r2) goto L_0x0018
            goto L_0x0022
        L_0x0018:
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0022
        L_0x001b:
            r0 = 90
            goto L_0x0022
        L_0x001e:
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0022
        L_0x0021:
        L_0x0022:
            if (r0 <= 0) goto L_0x007e
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r9)
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            float r0 = (float) r0
            r6.postRotate(r0)
            r2 = 0
            r3 = 0
            int r4 = r8.getWidth()
            int r5 = r8.getHeight()
            r7 = 1
            r1 = r8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)
            r8.recycle()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x006c, all -> 0x0061 }
            r2.<init>(r9)     // Catch:{ FileNotFoundException -> 0x0075, IOException -> 0x006c, all -> 0x0061 }
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x005f, IOException -> 0x005d, all -> 0x005b }
            r1 = 50
            r0.compress(r9, r1, r2)     // Catch:{ FileNotFoundException -> 0x005f, IOException -> 0x005d, all -> 0x005b }
            r2.flush()     // Catch:{ FileNotFoundException -> 0x005f, IOException -> 0x005d, all -> 0x005b }
            r2.close()     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r0.recycle()
            return
        L_0x005b:
            r9 = move-exception
            goto L_0x0063
        L_0x005d:
            r1 = r2
            goto L_0x006c
        L_0x005f:
            r1 = r2
            goto L_0x0075
        L_0x0061:
            r9 = move-exception
            r2 = r1
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r0.recycle()
            throw r9
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r1.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            r0.recycle()
            return
        L_0x0075:
            if (r1 == 0) goto L_0x007a
            r1.close()     // Catch:{ IOException -> 0x007a }
        L_0x007a:
            r0.recycle()
            return
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.rotateImage(java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeBitmap(java.io.File r2) {
        /*
            boolean r0 = r2.exists()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001d, all -> 0x0018 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001d, all -> 0x0018 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ Exception -> 0x001e, all -> 0x0015 }
            r0.close()     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            return r2
        L_0x0015:
            r2 = move-exception
            r1 = r0
            goto L_0x0019
        L_0x0018:
            r2 = move-exception
        L_0x0019:
            r1.close()     // Catch:{ Exception -> 0x001c }
        L_0x001c:
            throw r2
        L_0x001d:
            r0 = r1
        L_0x001e:
            r0.close()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.decodeBitmap(java.io.File):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i) {
        return decodeBitmap(file, i, false);
    }

    public static Bitmap getBitmapFromSD(String str, int i) {
        return getBitmapFromSD(str, i, false);
    }

    public static Bitmap loadBitmap(int i, String str) throws IOException {
        return loadBitmap(i, str, false);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r6 == 0) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap r5, long r6) {
        /*
            if (r5 != 0) goto L_0x0004
            r5 = 0
            return r5
        L_0x0004:
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x000b
            return r5
        L_0x000b:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            int r1 = r5.getRowBytes()
            int r2 = r5.getHeight()
            int r1 = r1 * r2
            long r1 = (long) r1
            long r1 = r1 / r6
            double r6 = (double) r1
            long r6 = java.lang.Math.round(r6)
            double r6 = (double) r6
            r1 = 4611686018427387904(0x4000000000000000, double:2.0)
            r3 = 1
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x0030
            r1 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x0030
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
        L_0x002e:
            r6 = 1
            goto L_0x0038
        L_0x0030:
            double r6 = java.lang.Math.sqrt(r6)
            int r6 = (int) r6
            if (r6 != 0) goto L_0x0038
            goto L_0x002e
        L_0x0038:
            if (r6 != r3) goto L_0x003f
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 != r7) goto L_0x003f
            return r5
        L_0x003f:
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream
            r7.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r5.compress(r1, r2, r7)
            byte[] r5 = r7.toByteArray()
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inSampleSize = r6
            r7.inPurgeable = r3
            r7.inPreferredConfig = r0
            r6 = 0
            int r0 = r5.length
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r6, r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.compressBitmap(android.graphics.Bitmap, long):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2) {
        return getBitmapFromSD(str, i, i2, -1, null);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z = false;
        if (width > i || height > i2) {
            if (width <= height || width <= i) {
                i = (int) (((float) width) * (((float) i2) / ((float) height)));
            } else {
                i2 = (int) (((float) height) * (((float) i) / ((float) width)));
            }
            z = true;
        } else {
            i = 0;
            i2 = 0;
        }
        if (z) {
            return Bitmap.createScaledBitmap(bitmap, i, i2, true);
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035 A[SYNTHETIC, Splitter:B:18:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003c A[SYNTHETIC, Splitter:B:26:0x003c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveImageData(byte[] r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            boolean r4 = r2.exists()     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            if (r4 != 0) goto L_0x001a
            boolean r4 = r2.mkdirs()     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            if (r4 != 0) goto L_0x001a
            boolean r4 = r2.exists()     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            if (r4 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0039, all -> 0x0032 }
            r5.write(r3)     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            r5.flush()     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            r5.close()     // Catch:{ Exception -> 0x003a, all -> 0x002f }
            r3 = 1
            return r3
        L_0x002f:
            r3 = move-exception
            r1 = r5
            goto L_0x0033
        L_0x0032:
            r3 = move-exception
        L_0x0033:
            if (r1 == 0) goto L_0x0038
            r1.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            throw r3
        L_0x0039:
            r5 = r1
        L_0x003a:
            if (r5 == 0) goto L_0x003f
            r5.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.saveImageData(byte[], java.lang.String, java.lang.String):boolean");
    }

    public static Bitmap loadBitmap(int i, String str, boolean z) throws IOException {
        Bitmap bitmap;
        CompressFormat compressFormat;
        Config config;
        Bitmap bitmapFromSD = getBitmapFromSD(str, i, z);
        if (bitmapFromSD == null) {
            return null;
        }
        int width = bitmapFromSD.getWidth();
        int height = bitmapFromSD.getHeight();
        if (width > i + NormalGiftView.MASK_TRANSLATE_VALUE || (width > i && height > 4000)) {
            bitmap = Bitmap.createScaledBitmap(bitmapFromSD, i, (int) (((((float) i) * 1.0f) * ((float) height)) / ((float) width)), true);
            bitmapFromSD.recycle();
            if (bitmap == null) {
                return null;
            }
        } else {
            bitmap = bitmapFromSD;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            compressFormat = CompressFormat.PNG;
        } else {
            compressFormat = CompressFormat.JPEG;
        }
        bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        bitmap.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        Options options = new Options();
        options.inPurgeable = true;
        if (z) {
            config = Config.ARGB_8888;
        } else {
            config = Config.RGB_565;
        }
        options.inPreferredConfig = config;
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveBitmapToSD(android.graphics.Bitmap r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "mounted"
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0062
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x001b
            r0.mkdirs()
        L_0x001b:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "/"
            r2.append(r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 != 0) goto L_0x003f
            r4.createNewFile()     // Catch:{ Exception -> 0x003e }
            goto L_0x003f
        L_0x003e:
            return r1
        L_0x003f:
            r5 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005e, all -> 0x0058 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x005e, all -> 0x0058 }
            android.graphics.Bitmap$CompressFormat r4 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r5 = 100
            r3.compress(r4, r5, r0)     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r0.flush()     // Catch:{ Exception -> 0x0056, all -> 0x0054 }
            r0.close()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r3 = 1
            return r3
        L_0x0054:
            r3 = move-exception
            goto L_0x005a
        L_0x0056:
            r5 = r0
            goto L_0x005e
        L_0x0058:
            r3 = move-exception
            r0 = r5
        L_0x005a:
            r0.close()     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r3
        L_0x005e:
            r5.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            return r1
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.saveBitmapToSD(android.graphics.Bitmap, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getBitmapFromSD(java.lang.String r4, int r5, boolean r6) {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            r1 = 0
            if (r4 != 0) goto L_0x000d
            return r1
        L_0x000d:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0014 }
            r0.setLastModified(r2)     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            android.graphics.Bitmap r4 = decodeBitmap(r0, r5, r6)     // Catch:{ Exception -> 0x0019 }
            return r4
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(java.lang.String, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i, boolean z) {
        Bitmap bitmap;
        Config config;
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (options.outWidth > 0) {
                if (options.outHeight > 0) {
                    int i2 = 1;
                    while (options.outWidth >= i * 2 && options.outHeight >= 4000) {
                        options.outWidth /= 2;
                        options.outHeight /= 2;
                        i2 *= 2;
                    }
                    Options options2 = new Options();
                    options2.inSampleSize = i2;
                    options2.inPurgeable = true;
                    if (z) {
                        config = Config.ARGB_8888;
                    } else {
                        config = Config.RGB_565;
                    }
                    options2.inPreferredConfig = config;
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    try {
                        fileInputStream2.close();
                        if (bitmap == null) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                    return bitmap;
                }
            }
            file.delete();
            return null;
        } catch (Exception unused2) {
            bitmap = null;
        }
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2) {
        if (bArr == null || i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int i5 = 1;
            while (true) {
                if (i3 / 2 < i) {
                    if (i4 / 2 < i2) {
                        Options options2 = new Options();
                        options2.inSampleSize = i5;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Config.RGB_565;
                        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    }
                }
                i3 /= 2;
                i4 /= 2;
                i5 *= 2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap decodeBitmap(ContentResolver contentResolver, Uri uri, int i, int i2) {
        byte[] bArr;
        if (contentResolver == null || uri == null || i <= 0 || i2 <= 0) {
            return null;
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            byte[] bArr2 = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = openInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            bArr = byteArrayOutputStream.toByteArray();
            return decodeBitmap(bArr, i, i2);
        } catch (Exception unused) {
            bArr = null;
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3) {
        return getBitmapFromSD(str, i, i2, i3, null);
    }

    public static Bitmap decodeBitmap(Context context, int i, int i2, int i3) {
        if (context == null || i == 0 || i2 <= 0 || i3 <= 0) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int i6 = 1;
            while (true) {
                if (i4 / 2 < i2) {
                    if (i5 / 2 < i3) {
                        Options options2 = new Options();
                        options2.inSampleSize = i6;
                        options2.inPurgeable = true;
                        options2.inPreferredConfig = Config.RGB_565;
                        return BitmapFactory.decodeResource(resources, i, options2);
                    }
                }
                i4 /= 2;
                i5 /= 2;
                i6 *= 2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, Config config) {
        return getBitmapFromSD(str, i, i2, -1, config);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062 A[SYNTHETIC, Splitter:B:35:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0069 A[SYNTHETIC, Splitter:B:43:0x0069] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeBitmap(java.io.File r7, int r8, int r9, android.graphics.Bitmap.Config r10) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x006d
            if (r8 <= 0) goto L_0x006d
            if (r9 > 0) goto L_0x0009
            goto L_0x006d
        L_0x0009:
            boolean r1 = r7.isFile()     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            if (r1 != 0) goto L_0x0010
            return r0
        L_0x0010:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            r1.<init>()     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0066, all -> 0x005e }
            android.graphics.BitmapFactory.decodeStream(r3, r0, r1)     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r3.close()     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            int r4 = r1.outWidth     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            int r1 = r1.outHeight     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r5 = 1
        L_0x0028:
            int r6 = r4 / 2
            if (r6 >= r8) goto L_0x0053
            int r6 = r1 / 2
            if (r6 < r9) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r8.<init>()     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r8.inSampleSize = r5     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r8.inPurgeable = r2     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            if (r10 == 0) goto L_0x003f
            r8.inPreferredConfig = r10     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            goto L_0x0043
        L_0x003f:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r8.inPreferredConfig = r9     // Catch:{ Exception -> 0x005c, all -> 0x005a }
        L_0x0043:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            r9.<init>(r7)     // Catch:{ Exception -> 0x005c, all -> 0x005a }
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r9, r0, r8)     // Catch:{ Exception -> 0x0067, all -> 0x0050 }
            r9.close()     // Catch:{ Exception -> 0x0067, all -> 0x0050 }
            return r7
        L_0x0050:
            r7 = move-exception
            r3 = r9
            goto L_0x0060
        L_0x0053:
            int r4 = r4 / 2
            int r1 = r1 / 2
            int r5 = r5 * 2
            goto L_0x0028
        L_0x005a:
            r7 = move-exception
            goto L_0x0060
        L_0x005c:
            r9 = r3
            goto L_0x0067
        L_0x005e:
            r7 = move-exception
            r3 = r0
        L_0x0060:
            if (r3 == 0) goto L_0x0065
            r3.close()     // Catch:{ Exception -> 0x0065 }
        L_0x0065:
            throw r7
        L_0x0066:
            r9 = r0
        L_0x0067:
            if (r9 == 0) goto L_0x006c
            r9.close()     // Catch:{ Exception -> 0x006c }
        L_0x006c:
            return r0
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.decodeBitmap(java.io.File, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getBitmapFromSD(java.lang.String r6, int r7, int r8, int r9, android.graphics.Bitmap.Config r10) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0028 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0028 }
            boolean r6 = r1.isFile()     // Catch:{ Exception -> 0x0028 }
            if (r6 != 0) goto L_0x000d
            return r0
        L_0x000d:
            if (r9 <= 0) goto L_0x001c
            long r2 = r1.length()     // Catch:{ Exception -> 0x0028 }
            long r4 = (long) r9     // Catch:{ Exception -> 0x0028 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x001c
            r1.delete()     // Catch:{ Exception -> 0x0028 }
            return r0
        L_0x001c:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0023 }
            r1.setLastModified(r2)     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            android.graphics.Bitmap r6 = decodeBitmap(r1, r7, r8, r10)     // Catch:{ Exception -> 0x0028 }
            return r6
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(java.lang.String, int, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
