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

/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion_ViewBinding */
public class PushSettingManagerFragmentSecondVersion_ViewBinding implements Unbinder {

    /* renamed from: a */
    private PushSettingManagerFragmentSecondVersion f98310a;

    /* renamed from: b */
    private View f98311b;

    public void unbind() {
        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = this.f98310a;
        if (pushSettingManagerFragmentSecondVersion != null) {
            this.f98310a = null;
            pushSettingManagerFragmentSecondVersion.mTitle = null;
            pushSettingManagerFragmentSecondVersion.backBtn = null;
            pushSettingManagerFragmentSecondVersion.itemPushMain = null;
            pushSettingManagerFragmentSecondVersion.itemPushDig = null;
            pushSettingManagerFragmentSecondVersion.itemPushComment = null;
            pushSettingManagerFragmentSecondVersion.itemPushFollow = null;
            pushSettingManagerFragmentSecondVersion.itemPushMention = null;
            pushSettingManagerFragmentSecondVersion.itemPushFollowNewVideo = null;
            pushSettingManagerFragmentSecondVersion.itemPushRecommendVideo = null;
            pushSettingManagerFragmentSecondVersion.itemPushLive = null;
            pushSettingManagerFragmentSecondVersion.itemOuterPushIm = null;
            pushSettingManagerFragmentSecondVersion.itemInnerPushIm = null;
            pushSettingManagerFragmentSecondVersion.interactionDivider = null;
            pushSettingManagerFragmentSecondVersion.interactionDividerWithoutLine = null;
            pushSettingManagerFragmentSecondVersion.messageDivider = null;
            pushSettingManagerFragmentSecondVersion.pushDivider = null;
            pushSettingManagerFragmentSecondVersion.liveDivider = null;
            pushSettingManagerFragmentSecondVersion.itemInnerPushLive = null;
            this.f98311b.setOnClickListener(null);
            this.f98311b = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public PushSettingManagerFragmentSecondVersion_ViewBinding(final PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion, View view) {
        this.f98310a = pushSettingManagerFragmentSecondVersion;
        pushSettingManagerFragmentSecondVersion.mTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.title, "field 'mTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.jo, "field 'backBtn' and method 'onClick'");
        pushSettingManagerFragmentSecondVersion.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.jo, "field 'backBtn'", ImageView.class);
        this.f98311b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                pushSettingManagerFragmentSecondVersion.onClick(view);
            }
        });
        pushSettingManagerFragmentSecondVersion.itemPushMain = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4x, "field 'itemPushMain'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushDig = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4t, "field 'itemPushDig'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushComment = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4s, "field 'itemPushComment'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushFollow = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4u, "field 'itemPushFollow'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushMention = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4y, "field 'itemPushMention'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushFollowNewVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4v, "field 'itemPushFollowNewVideo'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushRecommendVideo = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4z, "field 'itemPushRecommendVideo'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b4w, "field 'itemPushLive'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemOuterPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b47, "field 'itemOuterPushIm'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.itemInnerPushIm = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b3p, "field 'itemInnerPushIm'", CommonItemView.class);
        pushSettingManagerFragmentSecondVersion.interactionDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.b2h, "field 'interactionDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.interactionDividerWithoutLine = (Divider) Utils.findRequiredViewAsType(view, R.id.b2i, "field 'interactionDividerWithoutLine'", Divider.class);
        pushSettingManagerFragmentSecondVersion.messageDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.by9, "field 'messageDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.pushDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.cmb, "field 'pushDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.liveDivider = (Divider) Utils.findRequiredViewAsType(view, R.id.boo, "field 'liveDivider'", Divider.class);
        pushSettingManagerFragmentSecondVersion.itemInnerPushLive = (CommonItemView) Utils.findRequiredViewAsType(view, R.id.b3q, "field 'itemInnerPushLive'", CommonItemView.class);
    }
}
