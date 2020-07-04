package com.p280ss.android.ugc.aweme.pay.service;

import android.content.Context;
import com.p280ss.android.ugc.aweme.pay.service.p972a.C21770a;
import com.p280ss.android.ugc.aweme.pay.service.p972a.C21772b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.pay.service.IPayService */
public interface IPayService {
    void initWalletSDKContext(String str);

    C21770a newPayTransaction(WeakReference<Context> weakReference, C21772b bVar);
}
