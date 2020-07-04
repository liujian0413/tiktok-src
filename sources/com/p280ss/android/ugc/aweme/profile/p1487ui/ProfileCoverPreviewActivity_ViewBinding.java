package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.StatedButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverPreviewActivity_ViewBinding */
public class ProfileCoverPreviewActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverPreviewActivity f95006a;

    /* renamed from: b */
    private View f95007b;

    /* renamed from: c */
    private View f95008c;

    /* renamed from: d */
    private View f95009d;

    public void unbind() {
        ProfileCoverPreviewActivity profileCoverPreviewActivity = this.f95006a;
        if (profileCoverPreviewActivity != null) {
            this.f95006a = null;
            profileCoverPreviewActivity.mCoverImage = null;
            profileCoverPreviewActivity.mChangeBtn = null;
            profileCoverPreviewActivity.mDownloadBtn = null;
            this.f95007b.setOnClickListener(null);
            this.f95007b = null;
            this.f95008c.setOnClickListener(null);
            this.f95008c = null;
            this.f95009d.setOnClickListener(null);
            this.f95009d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverPreviewActivity_ViewBinding(final ProfileCoverPreviewActivity profileCoverPreviewActivity, View view) {
        this.f95006a = profileCoverPreviewActivity;
        View findRequiredView = Utils.findRequiredView(view, R.id.b7x, "field 'mCoverImage' and method 'onViewClicked'");
        profileCoverPreviewActivity.mCoverImage = (RemoteImageView) Utils.castView(findRequiredView, R.id.b7x, "field 'mCoverImage'", RemoteImageView.class);
        this.f95007b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.drh, "field 'mChangeBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mChangeBtn = (TextView) Utils.castView(findRequiredView2, R.id.drh, "field 'mChangeBtn'", TextView.class);
        this.f95008c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.b8n, "field 'mDownloadBtn' and method 'onViewClicked'");
        profileCoverPreviewActivity.mDownloadBtn = (StatedButton) Utils.castView(findRequiredView3, R.id.b8n, "field 'mDownloadBtn'", StatedButton.class);
        this.f95009d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                profileCoverPreviewActivity.onViewClicked(view);
            }
        });
    }
}
