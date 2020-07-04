package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h */
public final class C31083h {

    /* renamed from: a */
    public static final C31083h f81575a = new C31083h();

    /* renamed from: b */
    private static Handler f81576b;

    /* renamed from: c */
    private static List<String> f81577c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.h$a */
    public static final class C31084a extends Handler {
        C31084a() {
        }

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            super.handleMessage(message);
            if (message.what == 220) {
                C31083h.m101385c();
            }
        }
    }

    private C31083h() {
    }

    /* renamed from: a */
    public static final void m101379a() {
        if (f81577c == null) {
            f81577c = new CopyOnWriteArrayList();
        }
        if (f81576b == null) {
            f81576b = new C31084a();
        }
    }

    /* renamed from: b */
    public static final void m101383b() {
        if (f81576b != null) {
            Handler handler = f81576b;
            if (handler == null) {
                C7573i.m23580a();
            }
            handler.removeMessages(220);
            f81576b = null;
        }
        if (f81577c != null) {
            f81577c = null;
        }
    }

    /* renamed from: c */
    public static final void m101385c() {
        Integer num;
        List<String> list = f81577c;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        if (num != null && num.intValue() > 0) {
            C6417a.m20015a().mo15546c(f81577c);
            List<String> list2 = f81577c;
            if (list2 == null) {
                C7573i.m23580a();
            }
            list2.clear();
            Handler handler = f81576b;
            if (handler != null) {
                handler.removeMessages(220);
            }
        }
    }

    /* renamed from: a */
    public static final void m101381a(List<? extends C7102a> list) {
        if (list != null && (!list.isEmpty())) {
            List b = m101382b(list);
            if (!b.isEmpty()) {
                C6417a.m20015a().mo15546c(b);
            }
        }
    }

    /* renamed from: b */
    public static final void m101384b(String str) {
        C7573i.m23587b(str, "sessionId");
        List<String> list = f81577c;
        if (list != null && list.contains(str)) {
            List<String> list2 = f81577c;
            if (list2 == null) {
                C7573i.m23580a();
            }
            list2.remove(str);
        }
    }

    /* renamed from: a */
    public static final void m101380a(String str) {
        C7573i.m23587b(str, "sessionId");
        List<String> list = f81577c;
        if (list != null && !list.contains(str)) {
            List<String> list2 = f81577c;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (list2.isEmpty()) {
                Handler handler = f81576b;
                if (handler != null) {
                    handler.sendEmptyMessageDelayed(220, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                }
            }
            List<String> list3 = f81577c;
            if (list3 == null) {
                C7573i.m23580a();
            }
            list3.add(str);
            List<String> list4 = f81577c;
            if (list4 == null) {
                C7573i.m23580a();
            }
            if (list4.size() == 25) {
                m101385c();
            }
        }
    }

    /* renamed from: b */
    private static List<String> m101382b(List<? extends C7102a> list) {
        ArrayList arrayList = new ArrayList();
        for (C7102a aVar : list) {
            if (aVar.mo18115b() == 0) {
                IMUser b = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(aVar.bf_())));
                if (b != null && TextUtils.isEmpty(b.getSecUid())) {
                    arrayList.add(aVar.bf_());
                }
                if (arrayList.size() == 25) {
                    break;
                }
            }
        }
        return arrayList;
    }
}
