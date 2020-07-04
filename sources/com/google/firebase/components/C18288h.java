package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.h */
final class C18288h implements C18289i<Context> {
    private C18288h() {
    }

    /* synthetic */ C18288h(byte b) {
        this();
    }

    /* renamed from: a */
    private static Bundle m60292a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (serviceInfo == null) {
                return null;
            }
            return serviceInfo.metaData;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ List mo47169a(Object obj) {
        Bundle a = m60292a((Context) obj);
        if (a == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(a.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }
}
