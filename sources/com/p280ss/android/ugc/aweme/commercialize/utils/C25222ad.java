package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggActivityV2.C24492a;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.egg.C24664i;
import com.p280ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3.C24631a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24972q;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment;
import com.p280ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.C25576a;
import com.p280ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2;
import com.p280ss.android.ugc.aweme.commercialize.views.form.C25584a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.C42722c;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ad */
public final class C25222ad {

    /* renamed from: a */
    public static final C25222ad f66541a = new C25222ad();

    /* renamed from: b */
    private static int f66542b = 1;

    private C25222ad() {
    }

    /* renamed from: a */
    public static final Intent m82926a(Context context) {
        return new Intent(context, BottomFormDialogV2.class);
    }

    /* renamed from: a */
    public static final void m82931a(AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            f66542b = awemeSettings.adWebContainer;
        }
    }

    /* renamed from: a */
    public static final void m82927a(Context context, EasterEggPageParams easterEggPageParams, int i) {
        C7573i.m23587b(easterEggPageParams, "easterEggPageParams");
        if (context != null && easterEggPageParams.getEasterEggInfo() != null) {
            C24972q.f65846a.mo65288a(easterEggPageParams.getEasterEggInfo());
            EasterEggInfo easterEggInfo = easterEggPageParams.getEasterEggInfo();
            C7573i.m23582a((Object) easterEggInfo, "easterEggPageParams.easterEggInfo");
            if (!C42722c.m135620a(context, easterEggInfo.getOpenUrl(), "AdWebContainerTest")) {
                if (i != -1) {
                    if (context instanceof Activity) {
                        if (C24664i.m80834c()) {
                            C24631a.m80754a((Activity) context, easterEggPageParams, i);
                            return;
                        }
                        C24492a.m80466a((Activity) context, easterEggPageParams, i);
                    }
                } else if (C24664i.m80834c()) {
                    C24631a.m80755a(context, easterEggPageParams);
                } else {
                    C24492a.m80467a(context, easterEggPageParams);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m82929a(C0608j jVar, ViewGroup viewGroup, int i, boolean z) {
        C7573i.m23587b(jVar, "fragmentManager");
        C7573i.m23587b(viewGroup, "containerLayout");
        C25576a.m84092a(jVar, viewGroup, i, z);
    }

    /* renamed from: a */
    public static final void m82930a(Aweme aweme, C25584a aVar, C0608j jVar, ViewGroup viewGroup, int i) {
        C7573i.m23587b(aweme, "mAweme");
        C7573i.m23587b(jVar, "fragmentManager");
        C7573i.m23587b(viewGroup, "containerLayout");
        Bundle ae = C25352e.m83333ae(aweme);
        C7573i.m23582a((Object) ae, "AdDataUtils.initAdMaskFormPageBundle(mAweme)");
        AdFormMaskFragment a = C25576a.m84090a(ae);
        a.f67361h = aVar;
        C25576a.m84091a(jVar, viewGroup, i, a);
    }
}
