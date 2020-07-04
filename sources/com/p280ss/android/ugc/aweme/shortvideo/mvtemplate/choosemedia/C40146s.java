package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.p280ss.android.vesdk.VEImageDetectUtils.IDetectImageResultListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.s */
final /* synthetic */ class C40146s implements IDetectImageResultListener {

    /* renamed from: a */
    private final AtomicBoolean f104346a;

    C40146s(AtomicBoolean atomicBoolean) {
        this.f104346a = atomicBoolean;
    }

    public final void onDetectResult(String str, String str2, String str3, boolean z) {
        this.f104346a.set(z);
    }
}
