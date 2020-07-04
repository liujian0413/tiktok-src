package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.MediaMetadataRetriever;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.OnScanCompletedListener;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.text.TextUtils;
import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

@ReactModule(name = "CameraRollManager")
public class CameraRollManager extends ReactContextBaseJavaModule {
    public static final boolean IS_JELLY_BEAN_OR_LATER;
    public static final String[] PROJECTION;

    static class GetPhotosTask extends GuardedAsyncTask<Void, Void> {
        private final String mAfter;
        private final String mAssetType;
        private final Context mContext;
        private final int mFirst;
        private final String mGroupName;
        private final ReadableArray mMimeTypes;
        private final Promise mPromise;

        /* access modifiers changed from: protected */
        public void doInBackgroundGuarded(Void... voidArr) {
            Uri uri;
            Cursor query;
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.mAfter)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.mAfter);
            }
            if (!TextUtils.isEmpty(this.mGroupName)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.mGroupName);
            }
            if (this.mMimeTypes != null && this.mMimeTypes.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.mMimeTypes.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.mMimeTypes.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.mContext.getContentResolver();
            try {
                if (this.mAssetType == null || !this.mAssetType.equals("Videos")) {
                    uri = Media.EXTERNAL_CONTENT_URI;
                } else {
                    uri = Video.Media.EXTERNAL_CONTENT_URI;
                }
                Uri uri2 = uri;
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                StringBuilder sb3 = new StringBuilder("datetaken DESC, date_modified DESC LIMIT ");
                sb3.append(this.mFirst + 1);
                query = contentResolver.query(uri2, strArr, sb2, strArr2, sb3.toString());
                if (query == null) {
                    this.mPromise.reject("E_UNABLE_TO_LOAD", "Could not get photos");
                    return;
                }
                CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.mFirst, this.mAssetType);
                CameraRollManager.putPageInfo(query, writableNativeMap, this.mFirst);
                query.close();
                this.mPromise.resolve(writableNativeMap);
            } catch (SecurityException e) {
                this.mPromise.reject("E_UNABLE_TO_LOAD_PERMISSION", "Could not get photos: need READ_EXTERNAL_STORAGE permission", e);
            } catch (Throwable th) {
                query.close();
                this.mPromise.resolve(writableNativeMap);
                throw th;
            }
        }

        private GetPhotosTask(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mFirst = i;
            this.mAfter = str;
            this.mGroupName = str2;
            this.mMimeTypes = readableArray;
            this.mPromise = promise;
            this.mAssetType = str3;
        }
    }

    static class SaveToCameraRoll extends GuardedAsyncTask<Void, Void> {
        private final Context mContext;
        public final Promise mPromise;
        private final Uri mUri;

        /* access modifiers changed from: protected */
        public void doInBackgroundGuarded(Void... voidArr) {
            FileChannel fileChannel;
            String str;
            int i;
            File file = new File(this.mUri.getPath());
            FileChannel fileChannel2 = null;
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                externalStoragePublicDirectory.mkdirs();
                if (!externalStoragePublicDirectory.isDirectory()) {
                    this.mPromise.reject("E_UNABLE_TO_LOAD", "External media storage directory not available");
                    return;
                }
                File file2 = new File(externalStoragePublicDirectory, file.getName());
                String name = file.getName();
                if (name.indexOf(46) >= 0) {
                    String substring = name.substring(0, name.lastIndexOf(46));
                    i = 0;
                    String str2 = substring;
                    str = name.substring(name.lastIndexOf(46));
                    name = str2;
                } else {
                    str = "";
                    i = 0;
                }
                while (!file2.createNewFile()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(name);
                    sb.append("_");
                    int i2 = i + 1;
                    sb.append(i);
                    sb.append(str);
                    file2 = new File(externalStoragePublicDirectory, sb.toString());
                    i = i2;
                }
                FileChannel channel = new FileInputStream(file).getChannel();
                try {
                    fileChannel = new FileOutputStream(file2).getChannel();
                    try {
                        fileChannel.transferFrom(channel, 0, channel.size());
                        channel.close();
                        fileChannel.close();
                        MediaScannerConnection.scanFile(this.mContext, new String[]{file2.getAbsolutePath()}, null, new OnScanCompletedListener() {
                            public void onScanCompleted(String str, Uri uri) {
                                if (uri != null) {
                                    SaveToCameraRoll.this.mPromise.resolve(uri.toString());
                                } else {
                                    SaveToCameraRoll.this.mPromise.reject("E_UNABLE_TO_SAVE", "Could not add image to gallery");
                                }
                            }
                        });
                        if (channel != null && channel.isOpen()) {
                            try {
                                channel.close();
                            } catch (IOException e) {
                                C13286a.m38861c("ReactNative", "Could not close input channel", (Throwable) e);
                            }
                        }
                        if (fileChannel != null && fileChannel.isOpen()) {
                            try {
                                fileChannel.close();
                            } catch (IOException e2) {
                                C13286a.m38861c("ReactNative", "Could not close output channel", (Throwable) e2);
                            }
                        }
                    } catch (IOException e3) {
                        Throwable th = e3;
                        fileChannel2 = channel;
                        e = th;
                        try {
                            this.mPromise.reject(e);
                            try {
                                fileChannel2.close();
                            } catch (IOException e4) {
                                C13286a.m38861c("ReactNative", "Could not close input channel", (Throwable) e4);
                            }
                            fileChannel.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileChannel2 != null && fileChannel2.isOpen()) {
                                try {
                                    fileChannel2.close();
                                } catch (IOException e5) {
                                    C13286a.m38861c("ReactNative", "Could not close input channel", (Throwable) e5);
                                }
                            }
                            if (fileChannel != null && fileChannel.isOpen()) {
                                try {
                                    fileChannel.close();
                                } catch (IOException e6) {
                                    C13286a.m38861c("ReactNative", "Could not close output channel", (Throwable) e6);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        fileChannel2 = channel;
                        th = th4;
                        fileChannel2.close();
                        fileChannel.close();
                        throw th;
                    }
                } catch (IOException e7) {
                    fileChannel2 = channel;
                    e = e7;
                    fileChannel = null;
                    this.mPromise.reject(e);
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        fileChannel2.close();
                    }
                    if (fileChannel != null && fileChannel.isOpen()) {
                        fileChannel.close();
                    }
                } catch (Throwable th5) {
                    fileChannel2 = channel;
                    th = th5;
                    fileChannel = null;
                    fileChannel2.close();
                    fileChannel.close();
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                fileChannel = null;
                this.mPromise.reject(e);
                fileChannel2.close();
                fileChannel.close();
            } catch (Throwable th6) {
                th = th6;
                fileChannel = null;
                fileChannel2.close();
                fileChannel.close();
                throw th;
            }
        }

        public SaveToCameraRoll(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.mContext = reactContext;
            this.mUri = uri;
            this.mPromise = promise;
        }
    }

    public String getName() {
        return "CameraRollManager";
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 16) {
            z = true;
        } else {
            z = false;
        }
        IS_JELLY_BEAN_OR_LATER = z;
        if (z) {
            PROJECTION = new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude"};
            return;
        }
        PROJECTION = new String[]{"_id", "mime_type", "bucket_display_name", "datetaken", "longitude", "latitude"};
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        String str;
        String str2;
        String str3;
        ReadableArray readableArray;
        int i = readableMap.getInt("first");
        if (readableMap.hasKey("after")) {
            str = readableMap.getString("after");
        } else {
            str = null;
        }
        if (readableMap.hasKey("groupName")) {
            str2 = readableMap.getString("groupName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("assetType")) {
            str3 = readableMap.getString("assetType");
        } else {
            str3 = null;
        }
        if (readableMap.hasKey("mimeTypes")) {
            readableArray = readableMap.getArray("mimeTypes");
        } else {
            readableArray = null;
        }
        if (!readableMap.hasKey("groupTypes")) {
            GetPhotosTask getPhotosTask = new GetPhotosTask(getReactApplicationContext(), i, str, str2, readableArray, str3, promise);
            getPhotosTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new SaveToCameraRoll(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        boolean z;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        String str = "has_next_page";
        if (i < cursor.getCount()) {
            z = true;
        } else {
            z = false;
        }
        writableNativeMap.putBoolean(str, z);
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString("type", cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        double d = (double) cursor.getLong(i3);
        Double.isNaN(d);
        writableMap.putDouble("timestamp", d / 1000.0d);
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, String str) {
        int i2;
        int i3;
        WritableNativeArray writableNativeArray;
        Cursor cursor2 = cursor;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor2.getColumnIndex("_id");
        int columnIndex2 = cursor2.getColumnIndex("mime_type");
        int columnIndex3 = cursor2.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor2.getColumnIndex("datetaken");
        if (IS_JELLY_BEAN_OR_LATER) {
            i2 = cursor2.getColumnIndex("width");
        } else {
            i2 = -1;
        }
        if (IS_JELLY_BEAN_OR_LATER) {
            i3 = cursor2.getColumnIndex("height");
        } else {
            i3 = -1;
        }
        int columnIndex5 = cursor2.getColumnIndex("longitude");
        int columnIndex6 = cursor2.getColumnIndex("latitude");
        int i4 = i;
        int i5 = 0;
        while (i5 < i4 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeMap writableNativeMap3 = writableNativeMap2;
            WritableNativeArray writableNativeArray3 = writableNativeArray2;
            WritableNativeMap writableNativeMap4 = writableNativeMap;
            int i6 = i5;
            int i7 = columnIndex;
            int i8 = columnIndex6;
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, i2, i3, str)) {
                WritableNativeMap writableNativeMap5 = writableNativeMap3;
                putBasicNodeInfo(cursor2, writableNativeMap5, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor2, writableNativeMap5, columnIndex5, i8);
                writableNativeMap4.putMap("node", writableNativeMap5);
                writableNativeArray = writableNativeArray3;
                writableNativeArray.pushMap(writableNativeMap4);
            } else {
                writableNativeArray = writableNativeArray3;
                i6--;
            }
            cursor.moveToNext();
            i5 = i6 + 1;
            i4 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex6 = i8;
            columnIndex = i7;
        }
        WritableMap writableMap2 = writableMap;
        writableMap2.putArray("edges", writableNativeArray2);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, String str) {
        Uri uri;
        float f;
        AssetFileDescriptor openAssetFileDescriptor;
        MediaMetadataRetriever mediaMetadataRetriever;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (str == null || !str.equals("Videos")) {
            uri = Uri.withAppendedPath(Media.EXTERNAL_CONTENT_URI, cursor.getString(i));
        } else {
            uri = Uri.withAppendedPath(Video.Media.EXTERNAL_CONTENT_URI, cursor.getString(i));
        }
        writableNativeMap.putString("uri", uri.toString());
        float f2 = -1.0f;
        if (IS_JELLY_BEAN_OR_LATER) {
            f2 = (float) cursor.getInt(i2);
            f = (float) cursor.getInt(i3);
        } else {
            f = -1.0f;
        }
        if (str != null && str.equals("Videos") && VERSION.SDK_INT >= 10) {
            try {
                openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f2 <= 0.0f || f <= 0.0f) {
                    try {
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        String str2 = "ReactNative";
                        StringBuilder sb = new StringBuilder("Number format exception occurred while trying to fetch video metadata for ");
                        sb.append(uri.toString());
                        C13286a.m38861c(str2, sb.toString(), (Throwable) e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (IOException e2) {
                StringBuilder sb2 = new StringBuilder("Could not get video metadata for ");
                sb2.append(uri.toString());
                C13286a.m38861c("ReactNative", sb2.toString(), (Throwable) e2);
                return false;
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
                throw th;
            }
        }
        if (f2 <= 0.0f || f <= 0.0f) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, "r");
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                f2 = (float) options.outWidth;
                f = (float) options.outHeight;
                openAssetFileDescriptor2.close();
            } catch (IOException e3) {
                StringBuilder sb3 = new StringBuilder("Could not get width/height for ");
                sb3.append(uri.toString());
                C13286a.m38861c("ReactNative", sb3.toString(), (Throwable) e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", (double) f2);
        writableNativeMap.putDouble("height", (double) f);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }
}
