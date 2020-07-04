package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.support.p022v4.util.C0893e;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.message.C8451a;
import com.bytedance.android.livesdk.message.p407a.C8452a;
import com.bytedance.android.livesdk.message.p407a.C8453b;
import com.bytedance.android.livesdk.message.p407a.C8454c;
import com.bytedance.android.livesdk.message.p408b.C8458b;
import com.bytedance.android.livesdk.message.p408b.C8459c;
import com.bytedance.android.livesdk.message.p408b.C8464e;
import com.bytedance.android.livesdk.message.p408b.C8465f;
import com.p280ss.ugc.live.sdk.message.MessageManagerFactory;
import com.p280ss.ugc.live.sdk.message.data.Configuration;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.bytedance.android.livesdk.utils.ag */
public final class C9038ag {

    /* renamed from: a */
    private static C0893e<IMessageManager> f24703a = new C0893e<>(2);

    /* renamed from: b */
    private static C0893e<C8465f> f24704b = new C0893e<>(2);

    /* renamed from: c */
    private static long f24705c;

    /* renamed from: d */
    private static C8451a f24706d;

    /* renamed from: a */
    public static IMessageManager m26996a() {
        return (IMessageManager) f24703a.mo3327a(f24705c);
    }

    /* renamed from: a */
    public static void m26999a(long j) {
        IMessageManager iMessageManager = (IMessageManager) f24703a.mo3327a(j);
        if (iMessageManager != null) {
            iMessageManager.release();
            if (f24706d != null) {
                f24706d.mo21618a();
            }
            C8465f fVar = (C8465f) f24704b.mo3327a(j);
            if (fVar != null) {
                fVar.mo21640a();
            }
            f24703a.mo3336c(j);
        }
    }

    /* renamed from: a */
    public static IMessageManager m26997a(long j, boolean z, Context context) {
        return m26998a(j, z, context, false);
    }

    /* renamed from: a */
    public static IMessageManager m26998a(long j, boolean z, Context context, boolean z2) {
        IMessageClient iMessageClient;
        f24705c = j;
        if (z2) {
            iMessageClient = new C8452a(z);
        } else {
            iMessageClient = new C8453b(z);
        }
        if (iMessageClient instanceof C8453b) {
            ((C8453b) iMessageClient).mo21626a(j, context);
        } else {
            ((C8452a) iMessageClient).mo21620a(j, context);
        }
        C8451a giftInterceptor = ((IGiftService) C3596c.m13172a(IGiftService.class)).getGiftInterceptor(j, z);
        f24706d = ((IGiftService) C3596c.m13172a(IGiftService.class)).getAssetsInterceptor(z);
        C8465f fVar = new C8465f();
        f24704b.mo3333b(j, fVar);
        IMessageManager iMessageManager = MessageManagerFactory.get(new Configuration().setHttpClient(iMessageClient).setMessageConverter(new C8454c()).addInterceptor(fVar).addInterceptor(new C8459c(j)).addInterceptor(giftInterceptor).addInterceptor(f24706d).addInterceptor(new C8458b()).addInterceptor(new C8464e()).setAnchor(z).setEnablePriority(false).setEnableSmoothlyDispatch(true));
        f24703a.mo3333b(j, iMessageManager);
        giftInterceptor.mo21619a(iMessageManager);
        f24706d.mo21619a(iMessageManager);
        return iMessageManager;
    }
}
