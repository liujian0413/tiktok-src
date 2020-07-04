package com.p280ss.android.ugc.aweme.notification.newstyle.p1440a;

import android.os.Bundle;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.message.model.SimpleUser;
import com.p280ss.android.ugc.aweme.message.p1392a.C33210a;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34312e;
import com.p280ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34559d;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a.C32264a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.a.b */
public final class C34500b extends C25674b<C34559d> implements C33210a {

    /* renamed from: a */
    private final int f89984a = 1;

    /* renamed from: d */
    private final int f89985d = 3;

    /* renamed from: e */
    private final int f89986e = 4;

    /* renamed from: U_ */
    public final void mo59134U_() {
        super.mo59134U_();
        C42961az.m136383d(this);
        C33213d.m107132a().mo84999a(2);
    }

    /* renamed from: e */
    private final void m111549e() {
        IIMService a = C32264a.m104777a(false);
        if (a != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("unread_count", C33213d.m107132a().mo85008c(11));
            a.onNewNoticeArrived(this.f89984a, bundle);
        }
    }

    /* renamed from: b */
    private final void m111547b(C34312e eVar) {
        C32263a.f84322a.mo83487a().onNewNoticeArrived(this.f89986e, new Bundle());
    }

    /* renamed from: a */
    public final void mo66537a(C25675c<?> cVar) {
        C7573i.m23587b(cVar, "view");
        super.mo66537a(cVar);
        C42961az.m136382c(this);
        C33213d.m107132a().mo85001a(2, (C33210a) this);
    }

    @C7709l
    public final void onEvent(String str) {
        C7573i.m23587b(str, "action");
        if (C7573i.m23585a((Object) "sessionListFragment-onMain", (Object) str)) {
            m111549e();
        }
    }

    /* renamed from: a */
    public final void mo84994a(C34312e eVar) {
        C7573i.m23587b(eVar, "noticeCountMessage");
        if (eVar.f89454a == 11) {
            int i = eVar.f89458e;
            if (i == 0) {
                m111548c(eVar);
            } else if (i == 1) {
                m111547b(eVar);
            }
        }
    }

    /* renamed from: c */
    private final void m111548c(C34312e eVar) {
        IIMService a = C32264a.m104777a(false);
        if (a != null) {
            Bundle bundle = new Bundle();
            StrangerNoticeMessage strangerNoticeMessage = eVar.f89457d;
            if (strangerNoticeMessage != null) {
                bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                SimpleUser fromUser = strangerNoticeMessage.getFromUser();
                C7573i.m23582a((Object) fromUser, "msg.fromUser");
                bundle.putString("from_user_name", fromUser.getNickName());
                bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
            }
            bundle.putInt("unread_count", C33213d.m107132a().mo85008c(11));
            a.onNewNoticeArrived(this.f89985d, bundle);
        }
    }
}
