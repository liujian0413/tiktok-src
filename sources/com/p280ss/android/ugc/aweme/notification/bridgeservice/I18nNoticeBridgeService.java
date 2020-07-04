package com.p280ss.android.ugc.aweme.notification.bridgeservice;

import android.app.Activity;
import android.support.p022v4.app.Fragment;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34302a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.adapter.MsgHeadExtraAdapter;
import com.p280ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.C34538e;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.TikTokNewNotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.util.C34611b;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.notification.bridgeservice.I18nNoticeBridgeService */
public final class I18nNoticeBridgeService implements INoticeBridgeService {
    public final C34302a getOvRedPointManager() {
        return null;
    }

    public final C34408a getViewModelHelper() {
        return new C34611b();
    }

    public final <T extends AmeBaseFragment> Class<? extends T> getNoticeFragmentClass() {
        if (C27688b.m90837a()) {
            return MusNewNotificationFragment.class;
        }
        return null;
    }

    public final BaseAdapter<BaseNotice> getMsgHeadExtraAdapter(Fragment fragment, C7561a<C7581n> aVar) {
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(aVar, "onEmptyListener");
        if (!C6399b.m19946v() || !C27688b.m90838b()) {
            return null;
        }
        return new MsgHeadExtraAdapter<>(fragment, aVar);
    }

    public final NotificationAdapter getNotificationAdapter(int i, Activity activity, int i2, String str, int i3) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "enterFrom");
        if (!C34538e.m111692c()) {
            return new NotificationAdapter(i, activity, i2, str);
        }
        TikTokNewNotificationAdapter tikTokNewNotificationAdapter = new TikTokNewNotificationAdapter(activity, str, i3, i, i2);
        return tikTokNewNotificationAdapter;
    }
}
