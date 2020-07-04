package com.p280ss.android.ugc.aweme.setting;

import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.google.gson.C6600e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.setting.model.ShareSettings;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.setting.ay */
public class C37579ay implements C6310a {

    /* renamed from: d */
    private static C37579ay f98002d;

    /* renamed from: a */
    protected ShareSettingApi f98003a = ((ShareSettingApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(ShareSettingApi.class));

    /* renamed from: b */
    protected C6309f f98004b = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: c */
    public ShareSettings f98005c;

    /* renamed from: b */
    public final void mo94876b() {
        C23397p.m76735a().mo60807a(this.f98004b, new Callable() {
            public final Object call() throws Exception {
                try {
                    return (ShareSettings) C37579ay.this.f98003a.queryRawSetting().get();
                } catch (ExecutionException e) {
                    throw C22838j.m75277a(e);
                }
            }
        }, 0);
    }

    /* renamed from: c */
    public final C1592h<Boolean> mo94877c() {
        return C1592h.m7853a((Callable<TResult>) new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() throws Exception {
                String a = C37583az.m120355a();
                if (TextUtils.isEmpty(a)) {
                    return Boolean.valueOf(false);
                }
                try {
                    ShareSettings shareSettings = (ShareSettings) new C6600e().mo15974a(a, ShareSettings.class);
                    C37541ab shareSetting = C37984ap.m121302b().getShareSetting();
                    shareSetting.mo94827a(shareSettings.sharePlatforms);
                    shareSetting.mo94828b(shareSettings.shareGifPlatforms);
                    shareSetting.mo94829c(shareSettings.shareOrderList);
                    shareSetting.mo94830d(shareSettings.mutedSharePlatforms);
                    C37579ay.this.f98005c = shareSettings;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(true);
            }
        });
    }

    /* renamed from: a */
    public static C37579ay m120349a() {
        if (f98002d == null) {
            synchronized (C37579ay.class) {
                if (f98002d == null) {
                    f98002d = new C37579ay();
                }
            }
        }
        return f98002d;
    }

    protected C37579ay() {
        mo94877c();
    }

    public void handleMsg(Message message) {
        mo94875a(message.obj);
    }

    /* renamed from: a */
    private void m120350a(final ShareSettings shareSettings) {
        if (shareSettings == null) {
            C37585ba.m120360a(TEVideoRecorder.FACE_BEAUTY_NULL);
            return;
        }
        if (C6307b.m19566a((Collection<T>) shareSettings.sharePlatforms)) {
            C37585ba.m120360a("size0");
        }
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C37583az.m120356a(new C6600e().mo15979b((Object) shareSettings));
                C37579ay.this.mo94877c();
            }
        });
    }

    /* renamed from: a */
    public final void mo94875a(Object obj) {
        if (obj instanceof Exception) {
            mo94877c();
            C37585ba.m120360a(((Exception) obj).getMessage());
            return;
        }
        if (obj instanceof ShareSettings) {
            m120350a((ShareSettings) obj);
        }
    }
}
