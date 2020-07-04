package android.support.p022v4.content;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p280ss.android.ugc.aweme.lancet.p328b.C32275a;
import java.io.FileNotFoundException;

/* renamed from: android.support.v4.content.c */
final class C0684c {
    /* renamed from: a */
    static int m2915a(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.delete$___twin___(uri, str, strArr);
    }

    /* renamed from: a */
    static Cursor m2916a(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.query$___twin___(uri, strArr, str, strArr2, str2);
    }

    /* renamed from: a */
    static ParcelFileDescriptor m2917a(FileProvider fileProvider, Uri uri, String str) throws FileNotFoundException {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.openFile$___twin___(uri, str);
    }

    /* renamed from: a */
    static String m2918a(FileProvider fileProvider, Uri uri) {
        FileProvider fileProvider2 = fileProvider;
        synchronized (fileProvider2) {
            Object obj = fileProvider.mLazyProviderInfo;
            if (obj != null && (obj instanceof ProviderInfo)) {
                try {
                    fileProvider2.attachInfo(fileProvider2.getContext(), (ProviderInfo) obj);
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return fileProvider.getType$___twin___(uri);
    }

    /* renamed from: a */
    static void m2919a(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider.getContext() == null) {
            C32275a.m104797a(providerInfo);
            fileProvider.mLazyProviderInfo = providerInfo;
            providerInfo.grantUriPermissions = false;
            try {
                fileProvider.attachInfo$___twin___(context, providerInfo);
            } catch (SecurityException unused) {
            }
            providerInfo.grantUriPermissions = true;
            return;
        }
        fileProvider.attachInfo$___twin___(context, providerInfo);
    }
}
