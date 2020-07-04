package com.ttnet.org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;

public abstract class ContentUriUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static FileProviderUtil sFileProviderUtil;
    private static final Object sLock = new Object();

    public interface FileProviderUtil {
        Uri getContentUriFromFile(File file);
    }

    private ContentUriUtils() {
    }

    public static void setFileProviderUtil(FileProviderUtil fileProviderUtil) {
        synchronized (sLock) {
            sFileProviderUtil = fileProviderUtil;
        }
    }

    public static boolean contentUriExists(String str) {
        boolean z;
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
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

    public static boolean delete(String str) {
        if (ContextUtils.getApplicationContext().getContentResolver().delete(Uri.parse(str), null, null) > 0) {
            return true;
        }
        return false;
    }

    public static Uri getContentUriFromFile(File file) {
        synchronized (sLock) {
            if (sFileProviderUtil == null) {
                return null;
            }
            Uri contentUriFromFile = sFileProviderUtil.getContentUriFromFile(file);
            return contentUriFromFile;
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

    public static boolean isContentUri(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null || !C38347c.f99553h.equals(parse.getScheme())) {
            return false;
        }
        return true;
    }

    public static String maybeGetDisplayName(String str) {
        try {
            String displayName = getDisplayName(Uri.parse(str), ContextUtils.getApplicationContext(), "_display_name");
            if (TextUtils.isEmpty(displayName)) {
                return null;
            }
            return displayName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor assetFileDescriptor = getAssetFileDescriptor(str);
        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = ContextUtils.getApplicationContext().getContentResolver();
        Uri parse = Uri.parse(str);
        if (!isVirtualDocument(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ExcHandler: FileNotFoundException | Exception | SecurityException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.AssetFileDescriptor getAssetFileDescriptor(java.lang.String r9) {
        /*
            android.content.Context r0 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r1 = 0
            boolean r2 = isVirtualDocument(r9)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "*/*"
            java.lang.String[] r2 = r0.getStreamTypes(r9, r2)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            if (r2 == 0) goto L_0x0051
            int r3 = r2.length     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            if (r3 <= 0) goto L_0x0051
            r3 = 0
            r2 = r2[r3]     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            android.content.res.AssetFileDescriptor r9 = r0.openTypedAssetFileDescriptor(r9, r2, r1)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            if (r9 == 0) goto L_0x003d
            long r2 = r9.getStartOffset()     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            goto L_0x003d
        L_0x0032:
            r9.close()     // Catch:{ IOException -> 0x0035, FileNotFoundException | Exception | SecurityException -> 0x0051, FileNotFoundException | Exception | SecurityException -> 0x0051 }
        L_0x0035:
            java.lang.SecurityException r9 = new java.lang.SecurityException     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            java.lang.String r0 = "Cannot open files with non-zero offset type."
            r9.<init>(r0)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            throw r9     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
        L_0x003d:
            return r9
        L_0x003e:
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r4 = r0.openFileDescriptor(r9, r2)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            if (r4 == 0) goto L_0x0051
            android.content.res.AssetFileDescriptor r9 = new android.content.res.AssetFileDescriptor     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            r5 = 0
            r7 = -1
            r3 = r9
            r3.<init>(r4, r5, r7)     // Catch:{ FileNotFoundException | Exception | SecurityException -> 0x0051 }
            return r9
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.ContentUriUtils.getAssetFileDescriptor(java.lang.String):android.content.res.AssetFileDescriptor");
    }

    private static boolean isVirtualDocument(Uri uri) {
        Cursor query;
        if (VERSION.SDK_INT < 19 || uri == null || !DocumentsContract.isDocumentUri(ContextUtils.getApplicationContext(), uri)) {
            return false;
        }
        try {
            query = ContextUtils.getApplicationContext().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    boolean hasVirtualFlag = hasVirtualFlag(query);
                    if (query != null) {
                        $closeResource(null, query);
                    }
                    return hasVirtualFlag;
                }
            }
            if (query != null) {
                $closeResource(null, query);
            }
            return false;
        } catch (NullPointerException unused) {
            return false;
        } catch (Throwable th) {
            if (query != null) {
                $closeResource(r0, query);
            }
            throw th;
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, Cursor cursor) {
        if (th != null) {
            try {
                cursor.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            cursor.close();
        }
    }

    public static String getDisplayName(Uri uri, Context context, String str) {
        Cursor query;
        Throwable th;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex(str);
                    if (columnIndex == -1) {
                        String str2 = "";
                        if (query != null) {
                            $closeResource(null, query);
                        }
                        return str2;
                    }
                    String string = query.getString(columnIndex);
                    if (hasVirtualFlag(query)) {
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
                    if (query != null) {
                        $closeResource(null, query);
                    }
                    return string;
                }
            }
            if (query != null) {
                $closeResource(null, query);
            }
            return "";
        } catch (NullPointerException unused) {
            return "";
        } catch (Throwable th2) {
            if (query != null) {
                $closeResource(th, query);
            }
            throw th2;
        }
    }
}
