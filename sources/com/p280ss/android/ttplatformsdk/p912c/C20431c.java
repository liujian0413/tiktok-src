package com.p280ss.android.ttplatformsdk.p912c;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

/* renamed from: com.ss.android.ttplatformsdk.c.c */
final class C20431c implements C20429a {

    /* renamed from: a */
    private static final String f55169a = "c";

    /* renamed from: b */
    private Context f55170b;

    C20431c(Context context) {
        this.f55170b = context;
    }

    /* renamed from: a */
    private boolean m67787a(String str) {
        boolean z = false;
        if (this.f55170b == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                if (this.f55170b.getPackageManager().getPackageInfo(str, 16777216) != null) {
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    /* renamed from: b */
    private int m67789b(String str) {
        if (this.f55170b == null || TextUtils.isEmpty(str) || !m67787a(str)) {
            return -1;
        }
        try {
            ApplicationInfo a = C20432d.m67792a(this.f55170b.getPackageManager(), str, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (!(a == null || a.metaData == null)) {
                return a.metaData.getInt("TTOPEN_SDK_VERSION", 0);
            }
        } catch (NameNotFoundException unused) {
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m67788a(String str, int i) {
        if (m67789b(str) < i) {
            return false;
        }
        Intent intent = new Intent();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".ttopenapi.TtEntryActivity");
        intent.setComponent(new ComponentName(str, sb.toString()));
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.f55170b.getPackageManager(), 65536);
        if (resolveActivityInfo == null || !resolveActivityInfo.exported) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo54978a(String str, String str2, boolean z) {
        if (this.f55170b != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_login", Boolean.valueOf(z));
                String str3 = "user_name";
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                contentValues.put(str3, str);
                String str4 = "user_avatar";
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                contentValues.put(str4, str2);
                StringBuilder sb = new StringBuilder("content://");
                sb.append(this.f55170b.getPackageName());
                sb.append(".ttplatformapi.AccountProvider/account");
                this.f55170b.getContentResolver().insert(Uri.parse(sb.toString()), contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo54977a(String str, long j, String str2, Bundle bundle) {
        m67786a(str, j, str2, 2, null);
    }

    /* renamed from: a */
    private void m67786a(String str, long j, String str2, int i, Bundle bundle) {
        if (TextUtils.isEmpty(str) || !m67788a(str, 2)) {
            StringBuilder sb = new StringBuilder("target package: ");
            sb.append(str);
            sb.append(" not supported");
            throw new IllegalStateException(sb.toString());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("_tt_params_intent_type", 1);
        bundle2.putBundle("_tt_params_extra", bundle);
        bundle2.putString("_tt_params_sessionid", str2);
        bundle2.putLong("_tt_params_userid", j);
        bundle2.putString("_tt_params_package_name", this.f55170b.getPackageName());
        Intent intent = new Intent();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".ttopenapi.TtEntryActivity");
        intent.setComponent(new ComponentName(str, sb2.toString()));
        intent.putExtras(bundle2);
        intent.addFlags(268435456);
        this.f55170b.startActivity(intent);
    }
}
