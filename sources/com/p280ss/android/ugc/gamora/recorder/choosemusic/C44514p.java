package com.p280ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.p */
public final class C44514p extends C44480d {
    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final int mo96987K() {
        return R.layout.b20;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo106937M() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final View mo106936L() {
        return mo30921H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final Pair<Integer, int[]> mo106938N() {
        int i;
        int i2;
        int[] iArr = new int[2];
        mo30921H().getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int measuredWidth = mo30921H().getMeasuredWidth();
        C10751a aVar = this.f114756k;
        if (aVar != null) {
            i = aVar.mo25724d();
        } else {
            i = 0;
        }
        int i4 = i3 + ((measuredWidth - i) / 2);
        float f = (float) iArr[1];
        Activity activity = this.f33526d_;
        if (activity == null) {
            C7573i.m23580a();
        }
        int b = (int) (f - C9738o.m28708b((Context) activity, 50.0f));
        C10751a aVar2 = this.f114756k;
        if (aVar2 != null) {
            i2 = aVar2.mo25724d();
        } else {
            i2 = 0;
        }
        int i5 = i2 / 2;
        return new Pair<>(Integer.valueOf(48), new int[]{i4, b, i5});
    }

    /* renamed from: a */
    public final void mo31001a(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.mo31001a(view, bundle);
        if (C6399b.m19944t()) {
            I18nManagerService i18nManagerService = (I18nManagerService) ServiceManager.get().getService(I18nManagerService.class);
            if (i18nManagerService != null) {
                String appLanguage = i18nManagerService.getAppLanguage();
                C7573i.m23582a((Object) appLanguage, "it.appLanguage");
                if (!C7634n.m23721b(appLanguage, "en", false)) {
                    String appLanguage2 = i18nManagerService.getAppLanguage();
                    C7573i.m23582a((Object) appLanguage2, "it.appLanguage");
                    if (!C7634n.m23721b(appLanguage2, "zh", false)) {
                        this.f114755j = false;
                        mo30920G().setVisibility(8);
                    }
                }
            }
        }
    }
}
