package com.ttnet.org.chromium.base1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.webkit.MimeTypeMap;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;

public abstract class ContentUriUtils {
    private static FileProviderUtil sFileProviderUtil;
    private static final Object sLock = new Object();

    public interface FileProviderUtil {
        Uri getContentUriFromFile(Context context, File file);
    }

    private ContentUriUtils() {
    }

    public static void setFileProviderUtil(FileProviderUtil fileProviderUtil) {
        synchronized (sLock) {
            sFileProviderUtil = fileProviderUtil;
        }
    }

    private static boolean hasVirtualFlag(Cursor cursor) {
        if (VERSION.SDK_INT < 24) {
            return false;
        }
        int columnIndex = cursor.getColumnIndex("flags");
        if (columnIndex < 0 || (cursor.getLong(columnIndex) & 512) == 0) {
            return false;
        }
        return true;
    }

    public static boolean contentUriExists(Context context, String str) {
        boolean z;
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(context, str);
        if (assetFileDescriptor != null) {
            z = true;
        } else {
            z = false;
        }
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static Uri getContentUriFromFile(Context context, File file) {
        synchronized (sLock) {
            if (sFileProviderUtil == null) {
                return null;
            }
            Uri contentUriFromFile = sFileProviderUtil.getContentUriFromFile(context, file);
            return contentUriFromFile;
        }
    }

    public static int openContentUriForRead(Context context, String str) {
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(context, str);
        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static String getMimeType(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!isVirtualDocument(parse, context)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ExcHandler: FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0009] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.AssetFileDescriptor getAssetFileDescriptor(android.content.Context r8, java.lang.String r9) {
        /*
            android.content.ContentResolver r0 = r8.getContentResolver()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r1 = 0
            boolean r8 = isVirtualDocument(r9, r8)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            if (r8 == 0) goto L_0x0037
            java.lang.String r8 = "*/*"
            java.lang.String[] r8 = r0.getStreamTypes(r9, r8)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            if (r8 == 0) goto L_0x004a
            int r2 = r8.length     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            if (r2 <= 0) goto L_0x004a
            r2 = 0
            r8 = r8[r2]     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            android.content.res.AssetFileDescriptor r8 = r0.openTypedAssetFileDescriptor(r9, r8, r1)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            long r2 = r8.getStartOffset()     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            r4 = 0
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x002c
            return r8
        L_0x002c:
            r8.close()     // Catch:{ IOException -> 0x002f, FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a, FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a, FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
        L_0x002f:
            java.lang.SecurityException r8 = new java.lang.SecurityException     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            java.lang.String r9 = "Cannot open files with non-zero offset type."
            r8.<init>(r9)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            throw r8     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
        L_0x0037:
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r3 = r0.openFileDescriptor(r9, r8)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            if (r3 == 0) goto L_0x004a
            android.content.res.AssetFileDescriptor r8 = new android.content.res.AssetFileDescriptor     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            r4 = 0
            r6 = -1
            r2 = r8
            r2.<init>(r3, r4, r6)     // Catch:{ FileNotFoundException | IllegalArgumentException | IllegalStateException | SecurityException -> 0x004a }
            return r8
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.ContentUriUtils.getAssetFileDescriptor(android.content.Context, java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private static boolean isVirtualDocument(Uri uri, Context context) {
        Cursor cursor;
        Throwable th;
        if (VERSION.SDK_INT < 19 || uri == null || !DocumentsContract.isDocumentUri(context, uri)) {
            return false;
        }
        try {
            cursor = context.getContentResolver().query(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        boolean hasVirtualFlag = hasVirtualFlag(cursor);
                        StreamUtil.closeQuietly(cursor);
                        return hasVirtualFlag;
                    }
                } catch (NullPointerException unused) {
                    StreamUtil.closeQuietly(cursor);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    StreamUtil.closeQuietly(cursor);
                    throw th;
                }
            }
            StreamUtil.closeQuietly(cursor);
            return false;
        } catch (NullPointerException unused2) {
            cursor = null;
            StreamUtil.closeQuietly(cursor);
            return false;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            StreamUtil.closeQuietly(cursor);
            throw th;
        }
    }

    public static String getDisplayName(Uri uri, Context context, String str) {
        Cursor cursor;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            cursor = contentResolver.query(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        int columnIndex = cursor.getColumnIndex(str);
                        if (columnIndex == -1) {
                            String str2 = "";
                            StreamUtil.closeQuietly(cursor);
                            return str2;
                        }
                        String string = cursor.getString(columnIndex);
                        if (hasVirtualFlag(cursor)) {
                            String[] streamTypes = contentResolver.getStreamTypes(uri, "*/*");
                            if (streamTypes != null && streamTypes.length > 0) {
                                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0]);
                                if (extensionFromMimeType != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(ClassUtils.PACKAGE_SEPARATOR);
                                    sb.append(extensionFromMimeType);
                                    string = sb.toString();
                                }
                            }
                        }
                        StreamUtil.closeQuietly(cursor);
                        return string;
                    }
                } catch (NullPointerException unused) {
                    String str3 = "";
                    StreamUtil.closeQuietly(cursor);
                    return str3;
                } catch (Throwable th) {
                    th = th;
                    StreamUtil.closeQuietly(cursor);
                    throw th;
                }
            }
            StreamUtil.closeQuietly(cursor);
            return "";
        } catch (NullPointerException unused2) {
            cursor = null;
            String str32 = "";
            StreamUtil.closeQuietly(cursor);
            return str32;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            StreamUtil.closeQuietly(cursor);
            throw th;
        }
    }
}
