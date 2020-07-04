package android.support.p022v4.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.p022v4.p027os.C0879b;

/* renamed from: android.support.v4.content.a */
public final class C0682a {
    /* renamed from: a */
    public static Cursor m2902a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0879b bVar) {
        Object obj;
        if (VERSION.SDK_INT >= 16) {
            if (bVar != null) {
                try {
                    obj = bVar.mo3281d();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new android.support.p022v4.p027os.OperationCanceledException();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (bVar != null) {
            bVar.mo3279b();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
