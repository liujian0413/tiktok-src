package com.p280ss.android.ugc.trill.language;

import android.app.Dialog;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import butterknife.ButterKnife;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.C30476b;
import com.p280ss.android.ugc.aweme.i18n.language.C30477c;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialog */
public class ChooseLanguageDialog extends C43374j {
    RecyclerView mLanguageList;

    public ChooseLanguageDialog(Context context) {
        super(context, (int) R.style.uu, false, false);
        setContentView(R.layout.ju);
        ButterKnife.bind((Dialog) this);
        ArrayList arrayList = new ArrayList();
        for (C7120e eVar : ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getLocaleMap().values()) {
            arrayList.add(new C30477c(eVar, TextUtils.equals(C30476b.m99557c(context), eVar.mo18535f())));
        }
        this.mLanguageList.setLayoutManager(new WrapLinearLayoutManager(context));
        this.mLanguageList.setAdapter(new ChooseLanguageDialogAdapter(context, arrayList, this));
    }
}
