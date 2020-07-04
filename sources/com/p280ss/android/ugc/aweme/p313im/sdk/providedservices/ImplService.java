package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$drawable;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.MusItemDivider;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.ImplService */
public class ImplService implements IImplService {
    public boolean enableExpressionTab() {
        return true;
    }

    public boolean enableMediaRecord() {
        return false;
    }

    public boolean enableSendEmoji() {
        return true;
    }

    public boolean enableSendVoice() {
        return false;
    }

    public Class getEmojiRClass() {
        return R$drawable.class;
    }

    public boolean needAwemeMsgShowFollow() {
        return true;
    }

    public boolean needSessionListShowMore() {
        return false;
    }

    public AbsRelationListAdapter getRelationListAdapter(boolean z) {
        return new RelationListAdapter();
    }

    public boolean isUserVerified(IMUser iMUser) {
        if (!TextUtils.isEmpty(iMUser.getCustomVerify())) {
            return true;
        }
        return false;
    }

    public void setTitleStyle(TextView textView) {
        textView.getPaint().setFakeBoldText(true);
    }

    private static void setLightStatusBar(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    public C1272h getItemDecoration(Context context) {
        return new MusItemDivider(context.getResources().getColor(R.color.a7u), (int) C9738o.m28708b(context, 0.5f), (int) C9738o.m28708b(context, 15.0f));
    }

    public void setupStatusBar(Activity activity) {
        setStatusBarColor(activity, activity.getResources().getColor(R.color.vd));
        setLightStatusBar(activity);
    }

    public void setupStatusBarWithHolder(Activity activity, View view) {
        view.setVisibility(8);
        setupStatusBar(activity);
    }

    private static void setStatusBarColor(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(activity, i);
        }
    }
}
