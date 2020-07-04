package com.p280ss.android.ugc.trill.language.view;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.language.view.AppLanguageListFragment_ViewBinding */
public class AppLanguageListFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private AppLanguageListFragment f115750a;

    public void unbind() {
        AppLanguageListFragment appLanguageListFragment = this.f115750a;
        if (appLanguageListFragment != null) {
            this.f115750a = null;
            appLanguageListFragment.mBtnFinish = null;
            appLanguageListFragment.mListLanguage = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public AppLanguageListFragment_ViewBinding(AppLanguageListFragment appLanguageListFragment, View view) {
        this.f115750a = appLanguageListFragment;
        appLanguageListFragment.mBtnFinish = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.djz, "field 'mBtnFinish'", TextTitleBar.class);
        appLanguageListFragment.mListLanguage = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bna, "field 'mListLanguage'", RecyclerView.class);
    }
}
