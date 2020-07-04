package com.facebook.react.modules.camera;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.C1642a;
import com.facebook.common.p686c.C13286a;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@ReactModule(name = "ImageEditingManager")
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList(new String[]{"file://", "content://"});

    static class CleanTask extends GuardedAsyncTask<Void, Void> {
        private final Context mContext;

        private CleanTask(ReactContext reactContext) {
            super(reactContext);
            this.mContext = reactContext;
        }

        private void cleanDirectory(File file) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    return str.startsWith("ReactNative_cropped_image_");
                }
            });
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }

        /* access modifiers changed from: protected */
        public void doInBackgroundGuarded(Void... voidArr) {
            cleanDirectory(this.mContext.getCacheDir());
            File externalCacheDir = this.mContext.getExternalCacheDir();
            if (externalCacheDir != null) {
                cleanDirectory(externalCacheDir);
            }
        }
    }

    static class CropTask extends GuardedAsyncTask<Void, Void> {
        final Context mContext;
        final Callback mError;
        final int mHeight;
        final Callback mSuccess;
        int mTargetHeight;
        int mTargetWidth;
        final String mUri;
        final int mWidth;

        /* renamed from: mX */
        final int f37424mX;

        /* renamed from: mY */
        final int f37425mY;

        private InputStream openBitmapInputStream() throws IOException {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.mUri)) {
                inputStream = this.mContext.getContentResolver().openInputStream(Uri.parse(this.mUri));
            } else {
                inputStream = new URL(this.mUri).openConnection().getInputStream();
            }
            if (inputStream != null) {
                return inputStream;
            }
            StringBuilder sb = new StringBuilder("Cannot open bitmap: ");
            sb.append(this.mUri);
            throw new IOException(sb.toString());
        }

        private Bitmap crop(Options options) throws IOException {
            InputStream openBitmapInputStream = openBitmapInputStream();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(openBitmapInputStream, false);
            try {
                return newInstance.decodeRegion(new Rect(this.f37424mX, this.f37425mY, this.f37424mX + this.mWidth, this.f37425mY + this.mHeight), options);
            } finally {
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
                newInstance.recycle();
            }
        }

        /* access modifiers changed from: protected */
        public void doInBackgroundGuarded(Void... voidArr) {
            boolean z;
            Bitmap bitmap;
            try {
                Options options = new Options();
                if (this.mTargetWidth <= 0 || this.mTargetHeight <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bitmap = cropAndResize(this.mTargetWidth, this.mTargetHeight, options);
                } else {
                    bitmap = crop(options);
                }
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File createTempFile = ImageEditingManager.createTempFile(this.mContext, str);
                ImageEditingManager.writeCompressedBitmapToFile(bitmap, str, createTempFile);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.mContext, Uri.parse(this.mUri), createTempFile);
                }
                this.mSuccess.invoke(Uri.fromFile(createTempFile).toString());
            } catch (Exception e) {
                this.mError.invoke(e.getMessage());
            }
        }

        public void setTargetSize(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(C1642a.m8034a("Invalid target size: [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.mTargetWidth = i;
            this.mTargetHeight = i2;
        }

        /* JADX INFO: finally extract failed */
        private Bitmap cropAndResize(int i, int i2, Options options) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            int i3 = i;
            int i4 = i2;
            Options options2 = options;
            C13854a.m40916b(options);
            Options options3 = new Options();
            options3.inJustDecodeBounds = true;
            InputStream openBitmapInputStream = openBitmapInputStream();
            try {
                BitmapFactory.decodeStream(openBitmapInputStream, null, options3);
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
                float f6 = (float) i3;
                float f7 = (float) i4;
                float f8 = f6 / f7;
                if (((float) this.mWidth) / ((float) this.mHeight) > f8) {
                    f5 = ((float) this.mHeight) * f8;
                    f4 = (float) this.mHeight;
                    f2 = ((float) this.f37424mX) + ((((float) this.mWidth) - f5) / 2.0f);
                    f = (float) this.f37425mY;
                    f3 = f7 / ((float) this.mHeight);
                } else {
                    f5 = (float) this.mWidth;
                    float f9 = ((float) this.mWidth) / f8;
                    f2 = (float) this.f37424mX;
                    f = ((float) this.f37425mY) + ((((float) this.mHeight) - f9) / 2.0f);
                    float f10 = f9;
                    f3 = f6 / ((float) this.mWidth);
                    f4 = f10;
                }
                options2.inSampleSize = ImageEditingManager.getDecodeSampleSize(this.mWidth, this.mHeight, i3, i4);
                options3.inJustDecodeBounds = false;
                InputStream openBitmapInputStream2 = openBitmapInputStream();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(openBitmapInputStream2, null, options2);
                    if (decodeStream != null) {
                        if (openBitmapInputStream2 != null) {
                            openBitmapInputStream2.close();
                        }
                        int floor = (int) Math.floor((double) (f2 / ((float) options2.inSampleSize)));
                        int floor2 = (int) Math.floor((double) (f / ((float) options2.inSampleSize)));
                        int floor3 = (int) Math.floor((double) (f5 / ((float) options2.inSampleSize)));
                        int floor4 = (int) Math.floor((double) (f4 / ((float) options2.inSampleSize)));
                        float f11 = f3 * ((float) options2.inSampleSize);
                        Matrix matrix = new Matrix();
                        matrix.setScale(f11, f11);
                        return Bitmap.createBitmap(decodeStream, floor, floor2, floor3, floor4, matrix, true);
                    }
                    StringBuilder sb = new StringBuilder("Cannot decode bitmap: ");
                    sb.append(this.mUri);
                    throw new IOException(sb.toString());
                } catch (Throwable th) {
                    if (openBitmapInputStream2 != null) {
                        openBitmapInputStream2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable th3 = th2;
                if (openBitmapInputStream != null) {
                    openBitmapInputStream.close();
                }
                throw th3;
            }
        }

        private CropTask(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(C1642a.m8034a("Invalid crop rectangle: [%d, %d, %d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
            }
            this.mContext = reactContext;
            this.mUri = str;
            this.f37424mX = i;
            this.f37425mY = i2;
            this.mWidth = i3;
            this.mHeight = i4;
            this.mSuccess = callback;
            this.mError = callback2;
        }
    }

    public String getName() {
        return "ImageEditingManager";
    }

    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    public void onCatalystInstanceDestroy() {
        new CleanTask(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new CleanTask(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return CompressFormat.PNG;
        }
        if ("image/webp".equals(str)) {
            return CompressFormat.WEBP;
        }
        return CompressFormat.JPEG;
    }

    private static String getFileExtensionForType(String str) {
        if ("image/png".equals(str)) {
            return ".png";
        }
        if ("image/webp".equals(str)) {
            return ".webp";
        }
        return ".jpg";
    }

    public static boolean isLocalUri(String str) {
        for (String startsWith : LOCAL_URI_PREFIXES) {
            if (str.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir != null && (cacheDir == null || externalCacheDir.getFreeSpace() > cacheDir.getFreeSpace())) {
            cacheDir = externalCacheDir;
        }
        return File.createTempFile("ReactNative_cropped_image_", getFileExtensionForType(str), cacheDir);
    }

    private static File getFileFromUri(Context context, Uri uri) {
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (uri.getScheme().equals(C38347c.f99553h)) {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(0);
                        if (!TextUtils.isEmpty(string)) {
                            return new File(string);
                        }
                    }
                    query.close();
                } finally {
                    query.close();
                }
            }
        }
        return null;
    }

    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public static void copyExif(Context context, Uri uri, File file) throws IOException {
        String[] strArr;
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            StringBuilder sb = new StringBuilder("Couldn't get real path for uri: ");
            sb.append(uri);
            C13286a.m38860c("ReactNative", sb.toString());
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        for (String str : EXIF_ATTRIBUTES) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap readableMap2;
        ReadableMap readableMap3 = readableMap;
        ReadableMap readableMap4 = null;
        if (readableMap3.hasKey("offset")) {
            readableMap2 = readableMap3.getMap("offset");
        } else {
            readableMap2 = null;
        }
        if (readableMap3.hasKey("size")) {
            readableMap4 = readableMap3.getMap("size");
        }
        if (readableMap2 == null || readableMap4 == null || !readableMap2.hasKey("x") || !readableMap2.hasKey("y") || !readableMap4.hasKey("width") || !readableMap4.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        } else if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        } else {
            CropTask cropTask = new CropTask(getReactApplicationContext(), str, (int) readableMap2.getDouble("x"), (int) readableMap2.getDouble("y"), (int) readableMap4.getDouble("width"), (int) readableMap4.getDouble("height"), callback, callback2);
            if (readableMap3.hasKey("displaySize")) {
                ReadableMap map = readableMap3.getMap("displaySize");
                cropTask.setTargetSize((int) map.getDouble("width"), (int) map.getDouble("height"));
            }
            cropTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
