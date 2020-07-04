package com.p280ss.android.ugc.aweme.setting;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.detail.api.C26048b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: com.ss.android.ugc.aweme.setting.ak */
public final class C37558ak {

    /* renamed from: a */
    public static int f97962a = 1;

    /* renamed from: b */
    public static int f97963b = 2;

    /* renamed from: c */
    public static int f97964c = 3;

    /* renamed from: d */
    public static int f97965d = 2;

    /* renamed from: e */
    public static int f97966e = 1;

    /* renamed from: f */
    public static int f97967f;

    /* renamed from: a */
    public static boolean m120317a() {
        if (C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m120319b() {
        if (C6399b.m19944t() && !C35563c.f93230L.mo93342a(Property.ReactDuetSettingChanged)) {
            C1592h.m7853a(C37559al.f97968a).mo6875a(C37560am.f97969a);
        }
    }

    /* renamed from: a */
    public static boolean m120318a(BaseShortVideoContext baseShortVideoContext) {
        if (m120320b(baseShortVideoContext) || m120322c(baseShortVideoContext)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m120322c(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m120316a(C1592h hVar) throws Exception {
        if (!hVar.mo6889d()) {
            C26048b bVar = (C26048b) hVar.mo6890e();
            if (bVar.f68854b == 0 || bVar.f68853a == 0) {
                C35563c.f93230L.mo93338a(Property.ReactDuetSettingCurrent, f97967f);
            } else {
                C35563c.f93230L.mo93338a(Property.ReactDuetSettingCurrent, f97966e);
            }
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m120320b(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            if ((baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500) && ((VideoPublishEditModel) baseShortVideoContext).recordMode != 1) {
                return false;
            }
            return true;
        } else if (baseShortVideoContext == null || baseShortVideoContext.getVideoLength() <= 0 || ((long) baseShortVideoContext.getVideoLength()) > 60500) {
            return false;
        } else {
            return true;
        }
    }
}
