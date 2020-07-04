package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.network.CustomApiServerException;
import com.bytedance.android.live.core.p147c.C3166a;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.user.g */
public class C8986g<T> implements C47557ad<T>, C7498y<T> {
    public void onComplete() {
    }

    public void onNext(T t) {
    }

    public void onSubscribe(C7321c cVar) {
    }

    public void onSuccess(T t) {
    }

    public void onError(Throwable th) {
        C3166a.m11963b("LiveEmptyObserver", th);
        if (th instanceof CustomApiServerException) {
            StringBuilder sb = new StringBuilder("ApiServerException thrown, url: ");
            sb.append(((CustomApiServerException) th).getUrl());
            C3166a.m11966e("LiveEmptyObserver", sb.toString());
        }
    }
}
