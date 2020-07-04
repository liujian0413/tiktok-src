package com.p280ss.android.ugc.aweme.p313im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.IImplService */
public interface IImplService {
    boolean enableExpressionTab();

    boolean enableMediaRecord();

    boolean enableSendEmoji();

    boolean enableSendVoice();

    Class getEmojiRClass();

    C1272h getItemDecoration(Context context);

    AbsRelationListAdapter getRelationListAdapter(boolean z);

    boolean isUserVerified(IMUser iMUser);

    boolean needAwemeMsgShowFollow();

    boolean needSessionListShowMore();

    void setTitleStyle(TextView textView);

    void setupStatusBar(Activity activity);

    void setupStatusBarWithHolder(Activity activity, View view);
}
