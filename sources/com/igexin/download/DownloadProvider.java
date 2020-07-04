package com.igexin.download;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.p280ss.android.message.C19841i;

public class DownloadProvider extends ContentProvider {
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
        return false;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        try {
            Intent intent = new Intent(getContext(), C19841i.m65520b());
            intent.setAction("com.ss.android.message.action.PUSH_SERVICE");
            intent.setPackage(getContext().getPackageName());
            getContext().startService(intent);
        } catch (Throwable unused) {
        }
        return null;
    }
}
