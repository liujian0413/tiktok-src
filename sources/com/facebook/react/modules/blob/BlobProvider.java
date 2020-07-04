package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import com.facebook.react.ReactApplication;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class BlobProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        BlobModule blobModule;
        if (str.equals("r")) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext instanceof ReactApplication) {
                blobModule = (BlobModule) ((ReactApplication) applicationContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class);
            } else {
                blobModule = null;
            }
            if (blobModule != null) {
                byte[] resolve = blobModule.resolve(uri);
                if (resolve != null) {
                    try {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                        AutoCloseOutputStream autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
                        try {
                            autoCloseOutputStream.write(resolve);
                            autoCloseOutputStream.close();
                            return parcelFileDescriptor;
                        } catch (IOException unused) {
                            return null;
                        }
                    } catch (IOException unused2) {
                        return null;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Cannot open ");
                    sb.append(uri.toString());
                    sb.append(", blob not found.");
                    throw new FileNotFoundException(sb.toString());
                }
            } else {
                throw new RuntimeException("No blob module associated with BlobProvider");
            }
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot open ");
            sb2.append(uri.toString());
            sb2.append(" in mode '");
            sb2.append(str);
            sb2.append("'");
            throw new FileNotFoundException(sb2.toString());
        }
    }
}
