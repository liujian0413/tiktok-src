package dmt.p1861av.video.superentrance;

import android.content.Context;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.ValidTimesConfig;
import com.p280ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import dmt.p1861av.video.superentrance.SuperEntranceActivity.C47482c;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.superentrance.f */
public final class C47512f implements ISuperEntranceService {

    /* renamed from: a */
    public final C47498b f121972a = new C47498b();

    /* renamed from: a */
    private final boolean m148271a() {
        return this.f121972a.mo119619e();
    }

    /* renamed from: c */
    private static boolean m148274c() {
        return C47507e.f121962a.mo119629b();
    }

    /* renamed from: d */
    private final boolean m148275d() {
        return m148277f();
    }

    /* renamed from: e */
    private static boolean m148276e() {
        return C47507e.m148260c();
    }

    public final boolean isSuperEntranceResReady() {
        return C47507e.f121962a.mo119629b();
    }

    public final void setShowedSuperEntranceTab() {
        this.f121972a.mo119614b(true);
    }

    /* renamed from: b */
    private final boolean m148273b() {
        if (!this.f121972a.mo119618d()) {
            return true;
        }
        return false;
    }

    public final List<String> getSuperEntranceEffectList() {
        SuperEntranceConfig superEntranceConfig;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            superEntranceConfig = a.getSuperEntranceConfig();
        } catch (Exception unused) {
            superEntranceConfig = null;
        }
        if (superEntranceConfig != null) {
            List<String> effectIds = superEntranceConfig.getEffectIds();
            if (effectIds != null) {
                return effectIds;
            }
        }
        return C7525m.m23461a();
    }

    public final boolean isNeedShowSuperEntranceTabDirect() {
        if ((this.f121972a.mo119617c() || this.f121972a.mo119618d()) && !this.f121972a.mo119615b() && m148277f()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m148277f() {
        SuperEntranceConfig superEntranceConfig;
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            superEntranceConfig = a.getSuperEntranceConfig();
        } catch (Exception unused) {
            superEntranceConfig = null;
        }
        boolean z = false;
        if (superEntranceConfig == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = superEntranceConfig.getValidTimes().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ValidTimesConfig validTimesConfig = (ValidTimesConfig) it.next();
            C7573i.m23582a((Object) validTimesConfig, "time");
            Long startTime = validTimesConfig.getStartTime();
            C7573i.m23582a((Object) startTime, "time.startTime");
            if (currentTimeMillis >= startTime.longValue()) {
                Long endTime = validTimesConfig.getEndTime();
                C7573i.m23582a((Object) endTime, "time.endTime");
                if (currentTimeMillis <= endTime.longValue()) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final void startSuperEntranceActivity(Context context) {
        C7573i.m23587b(context, "context");
        this.f121972a.mo119616c(false);
        C47482c.m148217a(context);
    }

    /* renamed from: a */
    private static boolean m148272a(Context context) {
        return ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).superEntrancePrivacyService().hasPrivacyPermission(context);
    }

    public final void preDownloadSuperEntranceRes(Context context) {
        C7573i.m23587b(context, "context");
        C47507e.f121962a.mo119627a(context);
        C47507e.f121962a.mo119628b(context);
        C47507e.f121962a.mo119630c(context);
        C47507e.f121962a.mo119631d(context);
    }

    public final boolean shouldShowSuperEntranceRecord(Context context) {
        C7573i.m23587b(context, "context");
        if (!this.f121972a.mo119615b() && m148277f() && isSuperEntranceResReady()) {
            return true;
        }
        return false;
    }

    public final boolean shouldStartSuperEntrance(Context context) {
        C7573i.m23587b(context, "context");
        if (!m148271a() || !m148273b() || !m148272a(context) || !m148274c() || !m148275d() || !m148276e()) {
            return false;
        }
        return true;
    }

    public final void setSuperEntranceRecordClicked(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        this.f121972a.mo119613a(z);
    }
}
