package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bef.effectsdk.C1942b;
import com.bytedance.android.live.base.p117a.C2323a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.p457i.C9485l;
import com.bytedance.common.utility.p480a.C9706d;
import com.bytedance.dataplatform.C6324d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.effectmanager.C43837h;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.live.c.a */
public final class C32470a implements IHostContext {

    /* renamed from: a */
    private C43837h f84717a;

    public final int appId() {
        return 1233;
    }

    public final String appName() {
        return "musical_ly";
    }

    public final void enterRecorderActivity(Activity activity) {
    }

    public final C9485l getCurrentLocation() {
        return null;
    }

    public final Pair<String, String> getFreeFlowModel() {
        return null;
    }

    public final String getPackageName() {
        return null;
    }

    public final boolean hasLocation() {
        return false;
    }

    public final int liveId() {
        return 12;
    }

    public final void refreshClientABTestValues() {
        C6324d.m19638b();
    }

    public final Context context() {
        return C6399b.m19921a();
    }

    public final String getChannel() {
        return C6399b.m19941q();
    }

    public final String getServerDeviceId() {
        return C6789d.m21080d();
    }

    public final boolean isNeedProtectUnderage() {
        return TimeLockRuler.isContentFilterOn();
    }

    public C32470a() {
        C3596c.m13174a(IHostContext.class, this);
    }

    public final Locale currentLocale() {
        return C30476b.m99548a(context());
    }

    public final int getUpdateVersionCode() {
        try {
            return C9706d.m28643b(context(), "UPDATE_VERSION_CODE");
        } catch (Exception unused) {
            return 0;
        }
    }

    public final String getVersionCode() {
        return String.valueOf(C6399b.m19939o());
    }

    public final boolean isLocalTest() {
        return TextUtils.equals(getChannel(), "local_test");
    }

    public final int getLastVersionCode() {
        return ((Integer) C23060u.m75742a().mo60063ag().mo59877d()).intValue();
    }

    public final C1942b getResourceFinder() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).provideResourceFinder();
    }

    public final C43837h getEffectManager() {
        if (this.f84717a == null) {
            this.f84717a = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().createEffectPlatform(context(), C32326h.m104885g(), C34098r.m109769a().mo86751b()).mo70644f();
        }
        return this.f84717a;
    }

    public final <T> T getClientABTestValue(C2323a<T> aVar, boolean z) {
        return C6324d.m19632a(aVar.f7640a, aVar.f7641b, aVar.f7642c, aVar.f7643d, z);
    }
}
