package com.p280ss.android.ugc.trill.language.view;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.language.view.LanguageListFragment_ViewBinding */
public class LanguageListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LanguageListFragment f115756a;

    public void unbind() {
        LanguageListFragment languageListFragment = this.f115756a;
        if (languageListFragment != null) {
            this.f115756a = null;
            languageListFragment.mBtnFinish = null;
            languageListFragment.mListLanguage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LanguageListFragment_ViewBinding(LanguageListFragment languageListFragment, View view) {
        this.f115756a = languageListFragment;
        languageListFragment.mBtnFinish = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mBtnFinish'", TextTitleBar.class);
        languageListFragment.mListLanguage = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bna, "field 'mListLanguage'", RecyclerView.class);
    }
}
