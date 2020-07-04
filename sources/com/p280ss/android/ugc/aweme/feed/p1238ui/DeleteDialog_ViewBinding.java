package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DeleteDialog_ViewBinding */
public class DeleteDialog_ViewBinding implements Unbinder {

    /* renamed from: a */
    private DeleteDialog f75606a;

    /* renamed from: b */
    private View f75607b;

    /* renamed from: c */
    private View f75608c;

    public void unbind() {
        DeleteDialog deleteDialog = this.f75606a;
        if (deleteDialog != null) {
            this.f75606a = null;
            deleteDialog.mRootView = null;
            this.f75607b.setOnClickListener(null);
            this.f75607b = null;
            this.f75608c.setOnClickListener(null);
            this.f75608c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public DeleteDialog_ViewBinding(final DeleteDialog deleteDialog, View view) {
        this.f75606a = deleteDialog;
        deleteDialog.mRootView = (CoordinatorLayout) Utils.findRequiredViewAsType(view, R.id.cwn, "field 'mRootView'", CoordinatorLayout.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.a76, "method 'onClick'");
        this.f75607b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                deleteDialog.onClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.sp, "method 'cancel'");
        this.f75608c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                deleteDialog.cancel();
            }
        });
    }
}
