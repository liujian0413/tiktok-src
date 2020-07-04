package com.p280ss.android.ugc.aweme.i18n.musically.p1304a.p1305a;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.feed.event.C28334q;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.a.a.a */
public final class C30491a implements C6310a {

    /* renamed from: a */
    private Timer f80102a;

    /* renamed from: b */
    private TimerTask f80103b;

    /* renamed from: c */
    private Handler f80104c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.a.a.a$a */
    static class C30493a {

        /* renamed from: a */
        public static final C30491a f80105a = new C30491a();
    }

    /* renamed from: a */
    public static C30491a m99589a() {
        return C30493a.f80105a;
    }

    private C30491a() {
        this.f80102a = new Timer();
        this.f80104c = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo80169a(int i) {
        long j = 90000;
        switch (i) {
            case 0:
                this.f80103b = new C30494b(this.f80104c);
                break;
            case 1:
                this.f80103b = new C30496c();
                j = 900000;
                break;
        }
        long j2 = j;
        try {
            if (!(this.f80103b == null || this.f80102a == null)) {
                this.f80102a.schedule(this.f80103b, 0, j2);
            }
        } catch (Exception unused) {
        }
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1000 && !(message.obj instanceof Exception) && message.obj != null && (message.obj instanceof NoticeList)) {
            NoticeList noticeList = (NoticeList) message.obj;
            if (noticeList != null && !C6307b.m19566a((Collection<T>) noticeList.getItems())) {
                Iterator it = noticeList.getItems().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NoticeCount noticeCount = (NoticeCount) it.next();
                    if (noticeCount != null && 5 == noticeCount.getGroup()) {
                        if (noticeCount.getCount() > 0) {
                            C42961az.m136380a(new C28334q(0));
                            return;
                        }
                    }
                }
            }
        }
    }
}
