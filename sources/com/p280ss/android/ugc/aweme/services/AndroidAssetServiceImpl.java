package com.p280ss.android.ugc.aweme.services;

import android.app.Application;
import com.p280ss.android.ugc.aweme.common.p1140a.C25641a;
import com.p280ss.android.ugc.aweme.common.p1140a.C25642b;
import com.p280ss.android.ugc.aweme.common.p1140a.C25643c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.C7573i;
import kotlin.p1884io.C47973b;
import kotlin.p1884io.C47991m;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.aweme.services.AndroidAssetServiceImpl */
public final class AndroidAssetServiceImpl implements C25642b {
    public final <T> T convertJsonToObject(String str, Class<T> cls) {
        C7573i.m23587b(str, "fileName");
        C7573i.m23587b(cls, "type");
        return convertJsonToObject(str, cls, new C25641a());
    }

    public final <T> T convertJsonToObject(String str, Class<T> cls, C25643c<String, T> cVar) {
        Throwable th;
        C7573i.m23587b(str, "fileName");
        C7573i.m23587b(cls, "type");
        C7573i.m23587b(cVar, "transformer");
        Application b = C35574k.m114861b();
        C7573i.m23582a((Object) b, "CameraClient.getApplication()");
        InputStream open = b.getAssets().open(str);
        C7573i.m23582a((Object) open, "CameraClient.getApplicat…n().assets.open(fileName)");
        Closeable bufferedReader = new BufferedReader(new InputStreamReader(open, C48038d.f122880a), VideoCacheReadBuffersizeExperiment.DEFAULT);
        try {
            String b2 = C47991m.m148954b((BufferedReader) bufferedReader);
            C47973b.m148917a(bufferedReader, null);
            return cVar.mo66483a(b2, cls);
        } catch (Throwable th2) {
            C47973b.m148917a(bufferedReader, th);
            throw th2;
        }
    }
}
