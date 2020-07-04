package com.p280ss.android.ugc.aweme.notification.util;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34351a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34363k;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.ChallengeNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.NoticeResponse;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.p280ss.android.ugc.aweme.notice.repo.p1431a.C34346a;
import com.p280ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.notification.util.e */
public final class C34616e implements C6310a {

    /* renamed from: a */
    private C6309f f90358a;

    /* renamed from: b */
    private HashMap<Integer, C34619b> f90359b;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.e$a */
    static class C34618a {

        /* renamed from: a */
        public static final C34616e f90367a = new C34616e();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.util.e$b */
    public interface C34619b {
        /* renamed from: a */
        void mo87745a(BaseNotice baseNotice);
    }

    /* renamed from: a */
    public static C34616e m111865a() {
        return C34618a.f90367a;
    }

    /* renamed from: b */
    public final void mo87911b() {
        this.f90359b.clear();
    }

    private C34616e() {
        this.f90358a = new C6309f(this);
        this.f90359b = new HashMap<>();
    }

    public final void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ApiServerException) {
            C10761a.m31403c(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg()).mo25750a();
        } else if (obj instanceof Exception) {
            C10761a.m31403c(C6399b.m19921a(), C6399b.m19921a().getString(R.string.cjt)).mo25750a();
        } else {
            if (obj instanceof NoticeResponse) {
                C34619b bVar = (C34619b) this.f90359b.get(Integer.valueOf(i));
                if (bVar != null) {
                    List items = ((NoticeResponse) obj).getItems();
                    if (items == null || items.isEmpty()) {
                        bVar.mo87745a(null);
                    } else {
                        bVar.mo87745a((BaseNotice) items.get(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87910a(int i, C34619b bVar) {
        this.f90359b.put(Integer.valueOf(i), bVar);
        m111866a(0, 0, 1, i, null, 0);
    }

    /* renamed from: a */
    public static void m111867a(C7102a aVar, BaseNotice baseNotice) {
        if (aVar != null && baseNotice != null) {
            String str = "";
            String str2 = "";
            AnnouncementNotice announcement = baseNotice.getAnnouncement();
            ChallengeNotice challengeNotice = baseNotice.getChallengeNotice();
            UserTextNotice textNotice = baseNotice.getTextNotice();
            C34363k shopNotice = baseNotice.getShopNotice();
            FriendNotice friendNotice = baseNotice.getFriendNotice();
            C34351a adHelperNotice = baseNotice.getAdHelperNotice();
            C34366n tcmNotice = baseNotice.getTcmNotice();
            if (announcement != null) {
                Challenge challenge = announcement.getChallenge();
                if (challenge != null) {
                    str = challenge.getChallengeName();
                    str2 = announcement.getContent();
                    aVar.f19947k = 1;
                } else {
                    str = announcement.getTitle();
                }
            }
            if (challengeNotice != null) {
                Challenge challenge2 = challengeNotice.getChallenge();
                if (challenge2 != null) {
                    str = challenge2.getChallengeName();
                    str2 = challengeNotice.getContent();
                    aVar.f19947k = 1;
                } else {
                    str = challengeNotice.getTitle();
                }
            }
            if (textNotice != null) {
                str = textNotice.getTitle();
                str2 = textNotice.getContent();
            }
            if (shopNotice != null) {
                str = shopNotice.f89555b;
                str2 = shopNotice.f89554a;
            }
            if (friendNotice != null) {
                str2 = friendNotice.getContent();
            }
            if (adHelperNotice != null) {
                str = adHelperNotice.f89518b;
                str2 = adHelperNotice.f89517a;
            }
            if (tcmNotice != null) {
                str = tcmNotice.f89564a;
                str2 = tcmNotice.f89565b;
            }
            if (!TextUtils.isEmpty(str)) {
                aVar.f19944h = str;
            } else {
                aVar.f19944h = str2;
            }
            aVar.mo18368a(baseNotice.getCreateTime());
        }
    }

    /* renamed from: a */
    private void m111866a(long j, long j2, int i, int i2, Integer num, int i3) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.f90358a;
        final int i4 = i2;
        C346171 r1 = new Callable<NoticeResponse>(0, 0, 1, null, 0) {

            /* renamed from: a */
            final /* synthetic */ long f90360a;

            /* access modifiers changed from: private */
            /* renamed from: a */
            public NoticeResponse call() throws Exception {
                try {
                    return NoticeApiManager.m111258a(this.f90360a, 0, 1, i4, null, 0, C34346a.m111061a(), C34346a.m111063b());
                } catch (ExecutionException e) {
                    throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e);
                }
            }

            {
                this.f90360a = r2;
            }
        };
        a.mo60807a(fVar, r1, i2);
    }
}
