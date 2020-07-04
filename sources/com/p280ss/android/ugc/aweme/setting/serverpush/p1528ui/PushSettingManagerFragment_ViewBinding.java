package com.p280ss.android.ugc.aweme.setting.serverpush.p1528ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.setting.Divider;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment_ViewBinding */
public class PushSettingManagerFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingManagerFragment f98314a;

    /* renamed from: b */
    private View f98315b;

    public void unbind() {
        PushSettingManagerFragment pushSettingManagerFragment = this.f98314a;
        if (pushSettingManagerFragment != null) {
            this.f98314a = null;
            pushSettingManagerFragment.mTitle = null;
            pushSettingManagerFragment.backBtn = null;
            pushSettingManagerFragment.itemPushMain = null;
            pushSettingManagerFragment.itemPushDig = null;
            pushSettingManagerFragment.itemPushComment = null;
            pushSettingManagerFragment.itemPushFollow = null;
            pushSettingManagerFragment.itemPushMention = null;
            pushSettingManagerFragment.itemPushFollowNewVideo = null;
            pushSettingManagerFragment.itemPushRecommendVideo = null;
            pushSettingManagerFragment.itemPushLive = null;
            pushSettingManagerFragment.itemOuterPushIm = null;
            pushSettingManagerFragment.itemInnerPushIm = null;
            pushSettingManagerFragment.interactionDivider = null;
            pushSettingManagerFragment.interactionDividerWithoutLine = null;
            pushSettingManagerFragment.messageDivider = null;
            pushSettingManagerFragment.pushDivider = null;
            pushSettingManagerFragment.liveDivider = null;
            pushSettingManagerFragment.itemInnerPushLive = null;
            this.f98315b.setOnClickListener(null);
            this.f98315b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingManagerFragment_ViewBinding(final PushSettingManagerFragment pushSettingManagerFragment, View view) {
        this.f98314a = pushSettingManagerFragment;
        pushSettingManagerFragment.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'backBtn' and method 'onClick'");
        pushSettingManagerFragment.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'backBtn'", ImageView.class);
        this.f98315b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                pushSettingManagerFragment.onClick(view);
            }
        });
        pushSettingManagerFragment.itemPushMain = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4x, "field 'itemPushMain'", CommonItemView.class);
        pushSettingManagerFragment.itemPushDig = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4t, "field 'itemPushDig'", CommonItemView.class);
        pushSettingManagerFragment.itemPushComment = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4s, "field 'itemPushComment'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollow = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4u, "field 'itemPushFollow'", CommonItemView.class);
        pushSettingManagerFragment.itemPushMention = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4y, "field 'itemPushMention'", CommonItemView.class);
        pushSettingManagerFragment.itemPushFollowNewVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4v, "field 'itemPushFollowNewVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushRecommendVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4z, "field 'itemPushRecommendVideo'", CommonItemView.class);
        pushSettingManagerFragment.itemPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4w, "field 'itemPushLive'", CommonItemView.class);
        pushSettingManagerFragment.itemOuterPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b47, "field 'itemOuterPushIm'", CommonItemView.class);
        pushSettingManagerFragment.itemInnerPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b3p, "field 'itemInnerPushIm'", CommonItemView.class);
        pushSettingManagerFragment.interactionDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.b2h, "field 'interactionDivider'", Divider.class);
        pushSettingManagerFragment.interactionDividerWithoutLine = (Divider) Utils.findRequiredViewAsType(view, R.id.b2i, "field 'interactionDividerWithoutLine'", Divider.class);
        pushSettingManagerFragment.messageDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.by9, "field 'messageDivider'", Divider.class);
        pushSettingManagerFragment.pushDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.cmb, "field 'pushDivider'", Divider.class);
        pushSettingManagerFragment.liveDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.boo, "field 'liveDivider'", Divider.class);
        pushSettingManagerFragment.itemInnerPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b3q, "field 'itemInnerPushLive'", CommonItemView.class);
    }
}
