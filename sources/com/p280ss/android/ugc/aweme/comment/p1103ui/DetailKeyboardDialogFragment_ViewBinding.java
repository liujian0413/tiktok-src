package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.DetailKeyboardDialogFragment_ViewBinding */
public class DetailKeyboardDialogFragment_ViewBinding extends KeyboardDialogFragment_ViewBinding {

    /* renamed from: a */
    private DetailKeyboardDialogFragment f64127a;

    public void unbind() {
        DetailKeyboardDialogFragment detailKeyboardDialogFragment = this.f64127a;
        if (detailKeyboardDialogFragment != null) {
            this.f64127a = null;
            detailKeyboardDialogFragment.tabDivider = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DetailKeyboardDialogFragment_ViewBinding(DetailKeyboardDialogFragment detailKeyboardDialogFragment, View view) {
        super(detailKeyboardDialogFragment, view);
        this.f64127a = detailKeyboardDialogFragment;
        detailKeyboardDialogFragment.tabDivider = Utils.findRequiredView(view, R.id.dfd, "field 'tabDivider'");
    }
}
