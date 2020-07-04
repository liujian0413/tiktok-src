package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzaby;

public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a */
    private final zzaby f38067a = new zzaby();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        C14870j.m43201a(this, context, providerInfo);
    }

    public boolean onCreate() {
        return C14870j.m43202a(this);
    }

    /* renamed from: a */
    public final void mo37378a(Context context, ProviderInfo providerInfo) {
        this.f38067a.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    public final boolean mo37379a() {
        return this.f38067a.onCreate();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return this.f38067a.query(uri, strArr, str, strArr2, str2);
    }

    public String getType(Uri uri) {
        return this.f38067a.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return this.f38067a.insert(uri, contentValues);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f38067a.delete(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return this.f38067a.update(uri, contentValues, str, strArr);
    }
}
