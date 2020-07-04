package com.p280ss.android.ugc.aweme.notification.bridgeservice;

import android.app.Activity;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34302a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.notification.bridgeservice.INoticeBridgeService */
public interface INoticeBridgeService {
    BaseAdapter<BaseNotice> getMsgHeadExtraAdapter(Fragment fragment, C7561a<C7581n> aVar);

    <T extends AmeBaseFragment> Class<? extends T> getNoticeFragmentClass();

    NotificationAdapter getNotificationAdapter(int i, Activity activity, int i2, String str, int i3);

    C34302a getOvRedPointManager();

    C34408a getViewModelHelper();
}
