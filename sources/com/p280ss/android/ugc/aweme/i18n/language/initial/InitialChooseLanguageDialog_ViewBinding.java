package com.p280ss.android.ugc.aweme.i18n.language.initial;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.initial.InitialChooseLanguageDialog_ViewBinding */
public class InitialChooseLanguageDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private InitialChooseLanguageDialog f80079a;

    /* renamed from: b */
    private View f80080b;

    public void unbind() {
        InitialChooseLanguageDialog initialChooseLanguageDialog = this.f80079a;
        if (initialChooseLanguageDialog != null) {
            this.f80079a = null;
            initialChooseLanguageDialog.mLanguageList = null;
            this.f80080b.setOnClickListener(null);
            this.f80080b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public InitialChooseLanguageDialog_ViewBinding(final InitialChooseLanguageDialog initialChooseLanguageDialog, View view) {
        this.f80079a = initialChooseLanguageDialog;
        initialChooseLanguageDialog.mLanguageList = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bna, "field 'mLanguageList'", RecyclerView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ss, "method 'cancelClick'");
        this.f80080b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                initialChooseLanguageDialog.cancelClick();
            }
        });
    }
}
