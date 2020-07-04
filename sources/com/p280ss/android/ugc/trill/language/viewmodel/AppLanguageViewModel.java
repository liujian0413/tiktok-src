package com.p280ss.android.ugc.trill.language.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel */
public class AppLanguageViewModel extends C0063u {

    /* renamed from: a */
    private C0052o<ArrayList<C30477c>> f115757a;

    /* renamed from: b */
    private int f115758b = -1;

    /* renamed from: a */
    public final C0052o<ArrayList<C30477c>> mo107560a() {
        if (this.f115757a == null) {
            this.f115757a = new C0052o<>();
        }
        return this.f115757a;
    }

    /* renamed from: a */
    public final int mo107559a(Context context) {
        String c = C30476b.m99557c(context);
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (C7120e eVar : ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getLocaleMap().values()) {
            if (TextUtils.equals(eVar.mo18535f(), c)) {
                arrayList.add(new C30477c(eVar, true));
                i = arrayList.size() - 1;
            } else {
                arrayList.add(new C30477c(eVar, false));
            }
        }
        this.f115757a.postValue(arrayList);
        return i;
    }

    /* renamed from: a */
    public final void mo107561a(int i, int i2) {
        C0052o<ArrayList<C30477c>> oVar = this.f115757a;
        if (!C6307b.m19566a((Collection) oVar.getValue())) {
            if (i >= 0) {
                ((C30477c) ((ArrayList) oVar.getValue()).get(i)).f80071a = false;
            }
            ((C30477c) ((ArrayList) oVar.getValue()).get(i2)).f80071a = true;
            this.f115758b = i2;
        }
    }
}
