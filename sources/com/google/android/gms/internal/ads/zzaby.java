package com.google.android.gms.internal.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.p749d.C15176d;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

@C6505uv
public final class zzaby extends ContentProvider {
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
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        String str;
        Bundle a = m52660a(context);
        Boolean bool = null;
        if (a != null) {
            try {
                str = (String) a.get("com.google.android.gms.ads.APPLICATION_ID");
            } catch (ClassCastException unused) {
                afm.m45779c("The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value");
                str = null;
            }
            try {
                bool = (Boolean) a.get("com.google.android.gms.ads.AD_MANAGER_APP");
            } catch (ClassCastException unused2) {
                afm.m45779c("The com.google.android.gms.ads.AD_MANAGER_APP metadata must have a boolean value");
            }
        } else {
            str = null;
        }
        if ((bool == null || !bool.booleanValue()) && str == null) {
            throw new IllegalStateException("\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here: https://goo.gl/fQ2neu to add a valid  *\n* App ID inside the AndroidManifest. Google Ad Manager publishers should     *\n* follow instructions here: https://goo.gl/h17b6x.                           *\n******************************************************************************\n\n");
        }
        if (str != null) {
            if (str.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$")) {
                String str2 = "Publisher provided Google AdMob App ID in manifest: ";
                String valueOf = String.valueOf(str);
                afm.m45777b(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                Bundle bundle = new Bundle();
                bundle.putBoolean("measurementEnabled", false);
                C15910nw.m51402a(context, str, bundle);
            } else {
                throw new IllegalStateException("\n\n******************************************************************************\n* Invalid application ID. Follow instructions here: https://goo.gl/fQ2neu to *\n* find your app ID.                                                          *\n******************************************************************************\n\n");
            }
        }
        super.attachInfo(context, providerInfo);
    }

    /* renamed from: a */
    private static Bundle m52660a(Context context) {
        try {
            return C15176d.m44159a(context).mo38462a(context.getPackageName(), (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
        } catch (NullPointerException e) {
            afm.m45778b("Failed to load metadata: Null pointer exception", e);
            return null;
        } catch (NameNotFoundException e2) {
            afm.m45778b("Failed to load metadata: Package name not found", e2);
            return null;
        }
    }
}
