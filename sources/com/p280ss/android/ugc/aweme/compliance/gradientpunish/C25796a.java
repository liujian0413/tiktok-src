package com.p280ss.android.ugc.aweme.compliance.gradientpunish;

import android.content.Context;
import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vast.p673a.C13015c;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.compliance.gradientpunish.a */
public final class C25796a {

    /* renamed from: a */
    public static final C25796a f68208a = new C25796a();

    /* renamed from: b */
    private static final C23339g f68209b = new C23339g(C6399b.m19921a(), "gradient_punish_warning");

    private C25796a() {
    }

    /* renamed from: a */
    public static final GradientPunishWarning m84785a() {
        try {
            return (GradientPunishWarning) C10292j.m30480a().mo25014a(GradientPunishWarningSettings.class, "gradient_punish_warning", C6384b.m19835a().mo15294c().getGradientPunishWarning(), "com.ss.android.ugc.aweme.compliance.gradientpunish.GradientPunishWarning", GradientPunishWarning.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m84790b(String str) {
        C7573i.m23587b(str, "uid");
        GradientPunishWarning a = m84785a();
        if (a == null || a.getWarnType() == 0) {
            m84792d(str, false);
            return false;
        } else if (a.getWarnType() < 2 || C13015c.m37973a(a.getBubbleText()) || C13015c.m37973a(a.getDetailUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static final void m84786a(Context context) {
        String str;
        C7573i.m23587b(context, "context");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//webview");
        String str2 = "url";
        GradientPunishWarning a = m84785a();
        if (a != null) {
            str = a.getDetailUrl();
        } else {
            str = null;
        }
        buildRoute.withParam(str2, str).withParam("hide_nav_bar", true).open();
    }

    /* renamed from: a */
    public static final boolean m84787a(String str) {
        C7573i.m23587b(str, "uid");
        GradientPunishWarning a = m84785a();
        if (a == null || a.getWarnType() == 0) {
            m84789b(str, false);
            return false;
        } else if (a.getWarnType() < 3 || C13015c.m37973a(a.getDialogMessage()) || C13015c.m37973a(a.getDialogButton()) || C13015c.m37973a(a.getDetailUrl())) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m84788a(String str, boolean z) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f68209b;
        StringBuilder sb = new StringBuilder("has_click_warning_dialog_");
        sb.append(str);
        return gVar.mo60627a(sb.toString(), false);
    }

    /* renamed from: b */
    public static final void m84789b(String str, boolean z) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f68209b;
        StringBuilder sb = new StringBuilder("has_click_warning_dialog_");
        sb.append(str);
        gVar.mo60634b(sb.toString(), z);
    }

    /* renamed from: c */
    public static final boolean m84791c(String str, boolean z) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f68209b;
        StringBuilder sb = new StringBuilder("has_click_warning_bubble_");
        sb.append(str);
        return gVar.mo60627a(sb.toString(), false);
    }

    /* renamed from: d */
    public static final void m84792d(String str, boolean z) {
        C7573i.m23587b(str, "userId");
        C23339g gVar = f68209b;
        StringBuilder sb = new StringBuilder("has_click_warning_bubble_");
        sb.append(str);
        gVar.mo60634b(sb.toString(), z);
    }
}
