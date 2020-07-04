package com.p280ss.android.ugc.trill.language;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.language.ChooseLanguageDialog_ViewBinding */
public class ChooseLanguageDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ChooseLanguageDialog f115685a;

    public void unbind() {
        ChooseLanguageDialog chooseLanguageDialog = this.f115685a;
        if (chooseLanguageDialog != null) {
            this.f115685a = null;
            chooseLanguageDialog.mLanguageList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ChooseLanguageDialog_ViewBinding(ChooseLanguageDialog chooseLanguageDialog, View view) {
        this.f115685a = chooseLanguageDialog;
        chooseLanguageDialog.mLanguageList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bna, "field 'mLanguageList'", RecyclerView.class);
    }
}
