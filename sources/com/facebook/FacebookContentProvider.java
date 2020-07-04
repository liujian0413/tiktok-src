package com.facebook;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.C1642a;
import com.facebook.internal.C13950u;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

public class FacebookContentProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f34648a = "com.facebook.FacebookContentProvider";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    private static Pair<UUID, String> m38243a(Uri uri) {
        try {
            String[] split = uri.getPath().substring(1).split("/");
            String str = split[0];
            String str2 = split[1];
            if (!"..".contentEquals(str) && !"..".contentEquals(str2)) {
                return new Pair<>(UUID.fromString(str), str2);
            }
            throw new Exception();
        } catch (Exception unused) {
            return null;
        }
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        Pair a = m38243a(uri);
        if (a != null) {
            try {
                File a2 = C13950u.m41144a((UUID) a.first, (String) a.second);
                if (a2 != null) {
                    return ParcelFileDescriptor.open(a2, 268435456);
                }
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                throw e;
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    /* renamed from: a */
    public static String m38244a(String str, UUID uuid, String str2) {
        return C1642a.m8034a("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", str, uuid.toString(), str2});
    }
}
