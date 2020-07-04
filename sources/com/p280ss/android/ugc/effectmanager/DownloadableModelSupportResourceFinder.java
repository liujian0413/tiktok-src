package com.p280ss.android.ugc.effectmanager;

import android.text.TextUtils;
import android.util.Log;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.effectmanager.C43681b.C43687a;
import com.p280ss.android.ugc.effectmanager.common.C43723d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43734f;
import com.p280ss.android.ugc.effectmanager.model.LocalModelInfo;
import java.io.File;

/* renamed from: com.ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder */
public class DownloadableModelSupportResourceFinder implements C1942b {
    public static final String TAG = "ResourceFinder";
    private static volatile boolean sLibraryLoaded;
    private final C43856m mArbiter;
    private C43679a mAssetManagerWrapper;
    private AssetResourceFinder mAssetResourceFinder;
    C43831f mDownloadedModelStorage;
    private final C43687a mEventListener;

    private native long nativeCreateResourceFinder(long j);

    public void release(long j) {
        this.mAssetResourceFinder.release(j);
    }

    public boolean isResourceAvailable(String str) {
        if (findResourceUri(str) != null) {
            return true;
        }
        return false;
    }

    private boolean isExactBuiltInResource(String str) {
        C43679a aVar = this.mAssetManagerWrapper;
        StringBuilder sb = new StringBuilder("model/");
        sb.append(str);
        return aVar.mo105676a(sb.toString());
    }

    private void onModelNotFound(String str) {
        StringBuilder sb = new StringBuilder("model not found neither in asset nor disk ");
        sb.append(str);
        RuntimeException runtimeException = new RuntimeException(sb.toString());
        if (this.mEventListener != null) {
            this.mEventListener.mo90379a(null, runtimeException);
        }
    }

    public long createNativeResourceFinder(long j) {
        if (!sLibraryLoaded) {
            C43681b.f113070a.mo90381a("downloadable_model_support");
            sLibraryLoaded = true;
        }
        this.mAssetResourceFinder.createNativeResourceFinder(j);
        return nativeCreateResourceFinder(j);
    }

    public String findResourceUri(String str) {
        boolean z;
        LocalModelInfo a = this.mDownloadedModelStorage.mo105969a(C43723d.m138564a(str));
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a.getUri().toString();
        }
        if (!isExactBuiltInResource(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("asset://model/");
        sb.append(str);
        return sb.toString();
    }

    public static String findResourceUri(String str, String str2) {
        DownloadableModelSupportResourceFinder f = C43681b.m138407b().mo105682f();
        String findResourceUri = f.findResourceUri(str2);
        try {
            String a = C43723d.m138564a(str2);
            LocalModelInfo a2 = f.mDownloadedModelStorage.mo105969a(a);
            if (!f.isExactBuiltInResource(str2)) {
                String a3 = C43734f.m138604a(new File(a2.getUri().getPath()));
                String uri = f.mArbiter.f113627b.mo106061a(a).getUri();
                if (!TextUtils.equals(a3, uri)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(" md5 = ");
                    sb.append(a3);
                    sb.append(" expectedMd5 = ");
                    sb.append(uri);
                    f.onModelNotFound(sb.toString());
                    return "asset://md5_error";
                }
            }
        } catch (RuntimeException e) {
            String stackTraceString = Log.getStackTraceString(e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(stackTraceString);
            f.onModelNotFound(sb2.toString());
        }
        if (findResourceUri != null) {
            return findResourceUri;
        }
        f.onModelNotFound(str2);
        return "asset://not_found";
    }

    public DownloadableModelSupportResourceFinder(C43856m mVar, C43831f fVar, C43679a aVar, C43687a aVar2) {
        this.mArbiter = mVar;
        this.mDownloadedModelStorage = fVar;
        this.mAssetResourceFinder = new AssetResourceFinder(aVar.f113066a, fVar.f113503a);
        this.mAssetManagerWrapper = aVar;
        this.mEventListener = aVar2;
    }
}
