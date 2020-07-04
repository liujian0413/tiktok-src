package com.p280ss.android.ugc.aweme.forward.view;

import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.detail.p1167ui.FadeImageView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.forward.view.BaseAwemeDetailFragment_ViewBinding */
public class BaseAwemeDetailFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAwemeDetailFragment f78706a;

    /* renamed from: b */
    private View f78707b;

    /* renamed from: c */
    private View f78708c;

    /* renamed from: d */
    private View f78709d;

    public void unbind() {
        BaseAwemeDetailFragment baseAwemeDetailFragment = this.f78706a;
        if (baseAwemeDetailFragment != null) {
            this.f78706a = null;
            baseAwemeDetailFragment.mAuthorAvatarLayout = null;
            baseAwemeDetailFragment.mAuthorAvatarImageView = null;
            baseAwemeDetailFragment.mAuthorAvatarLiveView = null;
            baseAwemeDetailFragment.mAuthorAvatarBorderView = null;
            baseAwemeDetailFragment.mAuthorNameView = null;
            baseAwemeDetailFragment.mRecyclerView = null;
            baseAwemeDetailFragment.mEditText = null;
            baseAwemeDetailFragment.mAtView = null;
            baseAwemeDetailFragment.mEmojiView = null;
            this.f78707b.setOnClickListener(null);
            this.f78707b = null;
            this.f78708c.setOnClickListener(null);
            this.f78708c = null;
            this.f78709d.setOnClickListener(null);
            this.f78709d = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAwemeDetailFragment_ViewBinding(final BaseAwemeDetailFragment baseAwemeDetailFragment, View view) {
        this.f78706a = baseAwemeDetailFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.bgo, "field 'mAuthorAvatarLayout' and method 'onAvatarClick'");
        baseAwemeDetailFragment.mAuthorAvatarLayout = (ViewGroup) Utils.castView(findRequiredView, R.id.bgo, "field 'mAuthorAvatarLayout'", ViewGroup.class);
        this.f78707b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onAvatarClick();
            }
        });
        baseAwemeDetailFragment.mAuthorAvatarImageView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.e8m, "field 'mAuthorAvatarImageView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarLiveView = (AvatarImageView) Utils.findRequiredViewAsType(view, R.id.e8s, "field 'mAuthorAvatarLiveView'", AvatarImageView.class);
        baseAwemeDetailFragment.mAuthorAvatarBorderView = (LiveCircleView) Utils.findRequiredViewAsType(view, R.id.e9k, "field 'mAuthorAvatarBorderView'", LiveCircleView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e4i, "field 'mAuthorNameView' and method 'onNickNameClick'");
        baseAwemeDetailFragment.mAuthorNameView = (TextView) Utils.castView(findRequiredView2, R.id.e4i, "field 'mAuthorNameView'", TextView.class);
        this.f78708c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onNickNameClick();
            }
        });
        baseAwemeDetailFragment.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ed9, "field 'mRecyclerView'", RecyclerView.class);
        baseAwemeDetailFragment.mEditText = (MentionEditText) Utils.findRequiredViewAsType(view, R.id.z8, "field 'mEditText'", MentionEditText.class);
        baseAwemeDetailFragment.mAtView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.ha, "field 'mAtView'", FadeImageView.class);
        baseAwemeDetailFragment.mEmojiView = (FadeImageView) Utils.findRequiredViewAsType(view, R.id.adx, "field 'mEmojiView'", FadeImageView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.jo, "method 'onBack'");
        this.f78709d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAwemeDetailFragment.onBack();
            }
        });
    }
}
