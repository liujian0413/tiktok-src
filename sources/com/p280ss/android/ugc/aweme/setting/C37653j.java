package com.p280ss.android.ugc.aweme.setting;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.experiment.DataSaverSettingExperiment;
import com.p280ss.android.ugc.aweme.framework.p1275d.C29958a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.setting.j */
public final class C37653j {

    /* renamed from: a */
    public static final C37653j f98123a = new C37653j();

    private C37653j() {
    }

    /* renamed from: d */
    public final int mo94946d() {
        if (mo94945b() != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m120481c() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(DataSaverSettingExperiment.class, true, "data_saver_mode", C6384b.m19835a().mo15295d().data_saver_mode, 0) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final int mo94945b() {
        if (!C6399b.m19944t() || !m120479a() || C29958a.m98225a(C6399b.m19921a())) {
            return 0;
        }
        return C6384b.m19835a().mo15287a(DataSaverSettingExperiment.class, true, "data_saver_mode", C6384b.m19835a().mo15295d().data_saver_mode, 0);
    }

    /* renamed from: a */
    public static boolean m120479a() {
        C23060u a = C23060u.m75742a();
        C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
        C22903bl ao = a.mo60071ao();
        C7573i.m23582a((Object) ao, "CommonSharePrefCache.inst().dataSaver");
        Integer num = (Integer) ao.mo59877d();
        if (num != null && num.intValue() == 0) {
            try {
                IESSettingsProxy a2 = C30199h.m98861a();
                C7573i.m23582a((Object) a2, "SettingsReader.get()");
                num = a2.getDataSaverSetting();
                C23060u a3 = C23060u.m75742a();
                C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                C22903bl ao2 = a3.mo60071ao();
                C7573i.m23582a((Object) ao2, "CommonSharePrefCache.inst().dataSaver");
                ao2.mo59871a(num);
            } catch (NullValueException unused) {
                num = Integer.valueOf(2);
            }
        }
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120480a(int i) {
        try {
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl ao = a.mo60071ao();
            C7573i.m23582a((Object) ao, "CommonSharePrefCache.inst().dataSaver");
            ao.mo59871a(Integer.valueOf(i));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
