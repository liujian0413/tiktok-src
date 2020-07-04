package com.kakao.util.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.kakao.util.exception.KakaoException;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Map.Entry;

public final class Utility {
    private static final String TAG = Utility.class.getCanonicalName();

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m60924x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    public static String getAppPackageName(Context context) {
        return getPackageInfo(context).packageName;
    }

    public static int getAppVersion(Context context) {
        return getPackageInfo(context).versionCode;
    }

    public static PackageInfo getPackageInfo(Context context) {
        return getPackageInfo(context, 0);
    }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static String getKeyHash(Context context) {
        PackageInfo packageInfo = getPackageInfo(context, 64);
        if (packageInfo == null) {
            return null;
        }
        Signature[] signatureArr = packageInfo.signatures;
        int length = signatureArr.length;
        int i = 0;
        while (i < length) {
            Signature signature = signatureArr[i];
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA");
                instance.update(signature.toByteArray());
                return Base64.encodeToString(instance.digest(), 2);
            } catch (NoSuchAlgorithmException unused) {
                i++;
            }
        }
        return null;
    }

    public static String buildQueryString(Map<String, String> map) {
        if (map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append('&');
            }
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    public static PackageInfo getPackageInfo(Context context, int i) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean isPackageInstalled(Context context, String str) {
        if (context.getPackageManager().getLaunchIntentForPackage(str) != null) {
            return true;
        }
        return false;
    }

    public static boolean isUsablePermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public static ResolveInfo resolveIntent(Context context, Intent intent) {
        return context.getPackageManager().resolveActivity(intent, 0);
    }

    public static Uri buildUri(String str, String str2) {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(str);
        builder.path(str2);
        return builder.build();
    }

    public static String getMetadata(Context context, String str) {
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m60924x89c42dc8(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo == null || com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData == null) {
                return null;
            }
            return com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData.getString(str);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static void notNull(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    public static boolean getBooleanMetadata(Context context, String str, boolean z) {
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m60924x89c42dc8(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo == null || com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData == null) {
                return z;
            }
            return com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData.getBoolean(str, z);
        } catch (NameNotFoundException unused) {
            return z;
        }
    }

    public static Uri buildUri(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme(WebKitApi.SCHEME_HTTPS);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static void putObjectInBundle(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else {
            throw new KakaoException("attempted to add unsupported type to Bundle");
        }
    }
}
