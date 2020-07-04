package com.p280ss.android.ugc.trill.share;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.trill.share.SyncShareView_ViewBinding */
public class SyncShareView_ViewBinding implements Unbinder {

    /* renamed from: a */
    private SyncShareView f115842a;

    /* renamed from: b */
    private View f115843b;

    /* renamed from: c */
    private View f115844c;

    public void unbind() {
        SyncShareView syncShareView = this.f115842a;
        if (syncShareView != null) {
            this.f115842a = null;
            syncShareView.mGroupHelo = null;
            syncShareView.mBtnHelo = null;
            syncShareView.mBtnTwitter = null;
            syncShareView.mLayoutAutoShare = null;
            syncShareView.mRadioGroup = null;
            syncShareView.mBtnSave = null;
            syncShareView.mBtnIns = null;
            syncShareView.mBtnInsStory = null;
            syncShareView.mSyncTitle = null;
            if (this.f115843b != null) {
                this.f115843b.setOnClickListener(null);
                this.f115843b = null;
            }
            this.f115844c.setOnClickListener(null);
            this.f115844c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public SyncShareView_ViewBinding(final SyncShareView syncShareView, View view) {
        this.f115842a = syncShareView;
        syncShareView.mGroupHelo = (RadioGroup) Utils.findOptionalViewAsType(view, R.id.asy, "field 'mGroupHelo'", RadioGroup.class);
        View findViewById = view.findViewById(R.id.qb);
        syncShareView.mBtnHelo = (CanCancelRadioButton) Utils.castView(findViewById, R.id.qb, "field 'mBtnHelo'", CanCancelRadioButton.class);
        if (findViewById != null) {
            this.f115843b = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {
                public final void doClick(View view) {
                    syncShareView.onClickHelo(view);
                }
            });
        }
        View findRequiredView = Utils.findRequiredView(view, R.id.rv, "field 'mBtnTwitter' and method 'onClick'");
        syncShareView.mBtnTwitter = (ImageView) Utils.castView(findRequiredView, R.id.rv, "field 'mBtnTwitter'", ImageView.class);
        this.f115844c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                syncShareView.onClick(view);
            }
        });
        syncShareView.mLayoutAutoShare = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bgn, "field 'mLayoutAutoShare'", LinearLayout.class);
        syncShareView.mRadioGroup = (RadioGroup) Utils.findRequiredViewAsType(view, R.id.cmx, "field 'mRadioGroup'", RadioGroup.class);
        syncShareView.mBtnSave = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.re, "field 'mBtnSave'", CanCancelRadioButton.class);
        syncShareView.mBtnIns = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.qf, "field 'mBtnIns'", CanCancelRadioButton.class);
        syncShareView.mBtnInsStory = (CanCancelRadioButton) Utils.findRequiredViewAsType(view, R.id.qg, "field 'mBtnInsStory'", CanCancelRadioButton.class);
        syncShareView.mSyncTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.df8, "field 'mSyncTitle'", TextView.class);
    }
}
