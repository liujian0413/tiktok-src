package com.facebook.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.C13499h;

public final class FacebookInitProvider extends ContentProvider {

    /* renamed from: a */
    private static final String f36726a = "FacebookInitProvider";

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
        return C13911h.m41072a(this);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public final boolean mo33487a() {
        try {
            C13499h.m39703a(getContext());
        } catch (Exception unused) {
        }
        return false;
    }
}
