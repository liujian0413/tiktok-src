package com.p280ss.android.ugc.aweme.user.p1689d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.user.d.b */
public class C42829b implements C6310a {

    /* renamed from: a */
    private static volatile C42829b f111306a;

    /* renamed from: b */
    private C6309f f111307b = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: b */
    public final void mo104530b() {
        mo104529a(this.f111307b, 115);
    }

    private C42829b() {
    }

    /* renamed from: a */
    public static final C42829b m135986a() {
        if (f111306a == null) {
            synchronized (C42829b.class) {
                if (f111306a == null) {
                    f111306a = new C42829b();
                }
            }
        }
        return f111306a;
    }

    /* renamed from: c */
    static final /* synthetic */ Object m135988c() throws Exception {
        List a = C42925am.m136270a(AwemeApplication.m21341a());
        if (C6307b.m19566a((Collection<T>) a)) {
            return null;
        }
        return UploadContactsApi.m98489a(a, 1);
    }

    public void handleMsg(Message message) {
        if (message.what == 115) {
            m135987a(message);
        }
    }

    /* renamed from: a */
    private static void m135987a(Message message) {
        if (!C6399b.m19944t()) {
            SharePrefCache.inst().getIsContactsUploaded().mo59871a(Boolean.valueOf(true));
            SharePrefCache.inst().getContactsUploadedLastTime().mo59871a(Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: a */
    public final void mo104529a(Handler handler, int i) {
        if (C6399b.m19944t()) {
            C23397p.m76735a().mo60807a(handler, C42831c.f111309a, 115);
        } else {
            C23397p.m76735a().mo60807a(handler, new Callable() {
                public final Object call() throws Exception {
                    List a = C42925am.m136270a(AwemeApplication.m21341a());
                    if (C6307b.m19566a((Collection<T>) a)) {
                        return null;
                    }
                    UploadContactsApi.m98490a(a);
                    return null;
                }
            }, 115);
        }
    }
}
