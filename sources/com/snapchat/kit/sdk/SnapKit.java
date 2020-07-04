package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Arrays;

public class SnapKit {

    /* renamed from: a */
    private static SnapKit f50364a;

    /* renamed from: b */
    private final SnapKitComponent f50365b;

    public static void start(Context context) throws IllegalStateException {
        m61138a(context);
    }

    static SnapKitComponent getComponent(Context context) {
        return m61138a(context).f50365b;
    }

    public static void unlink(Context context) {
        getComponent(context).authTokenManager().revokeToken();
    }

    /* renamed from: a */
    private static synchronized SnapKit m61138a(Context context) {
        SnapKit snapKit;
        synchronized (SnapKit.class) {
            if (f50364a == null) {
                f50364a = new SnapKit(context.getApplicationContext());
            }
            snapKit = f50364a;
        }
        return snapKit;
    }

    private SnapKit(Context context) throws IllegalStateException {
        String[] strArr;
        try {
            Bundle bundle = C18640a.m61139a(context.getPackageManager(), context.getPackageName(), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH).metaData;
            if (bundle != null) {
                String string = bundle.getString("com.snapchat.kit.sdk.clientId");
                String string2 = bundle.getString("com.snapchat.kit.sdk.redirectUrl", "");
                int i = bundle.getInt("com.snapchat.kit.sdk.scopes", 0);
                if (i == 0) {
                    strArr = new String[0];
                } else {
                    strArr = context.getResources().getStringArray(i);
                }
                if (!TextUtils.isEmpty(string)) {
                    this.f50365b = C18644c.m61151a().mo48880a(new C18713e(context, string, string2, Arrays.asList(strArr))).mo48879a();
                    return;
                }
                throw new IllegalStateException("client id must be set!");
            }
            throw new IllegalStateException("No metadata for the current app!");
        } catch (NameNotFoundException unused) {
            throw new IllegalStateException("Could not get metadata for current package");
        }
    }
}
