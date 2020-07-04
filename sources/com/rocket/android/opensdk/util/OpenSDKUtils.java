package com.rocket.android.opensdk.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.lancet.p327a.C7108b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;

public class OpenSDKUtils {

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo */
        static ApplicationInfo m61103x89c42dc8(PackageManager packageManager, String str, int i) throws NameNotFoundException {
            if (!TextUtils.equals(str, C6399b.m19921a().getPackageName()) || i != 128) {
                return packageManager.getApplicationInfo(str, i);
            }
            if (C7108b.f19972a == null) {
                C7108b.f19972a = packageManager.getApplicationInfo(str, i);
            }
            return C7108b.f19972a;
        }
    }

    private static Signature[] getRawSignature(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    public static int getSDKVersionFromMetaData(Context context, int i) {
        try {
            ApplicationInfo com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo = _lancet.m61103x89c42dc8(context.getPackageManager(), "com.feiliao.flipchat.android", PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData != null) {
                return com_ss_android_ugc_aweme_lancet_lanch_AwemeMetaDataLancet_getApplicationInfo.metaData.getInt("ROCKET_OPEN_SDK_SUPPORT_VERSION");
            }
            return i;
        } catch (NameNotFoundException unused) {
            return i;
        }
    }

    public static String getMD5Signature(Context context, String str) {
        Signature[] rawSignature = getRawSignature(context, str);
        if (rawSignature == null || rawSignature.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Signature byteArray : rawSignature) {
            sb.append(MD5.getMessageDigest(byteArray.toByteArray()));
        }
        return sb.toString();
    }
}
