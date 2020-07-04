package com.bytedance.p263im.core.internal.p590db.fts;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.model.p598a.C11435a;
import com.bytedance.p263im.core.p584a.C11198c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.im.core.internal.db.fts.a */
public class C11359a implements C11434a {

    /* renamed from: a */
    private static C11359a f30773a;

    /* renamed from: b */
    private C11433k f30774b;

    /* renamed from: com.bytedance.im.core.internal.db.fts.a$a */
    class C11361a {

        /* renamed from: a */
        List<C11435a> f30775a;

        /* renamed from: b */
        List<String> f30776b;

        /* renamed from: c */
        String f30777c;

        /* renamed from: d */
        int f30778d;

        private C11361a() {
        }
    }

    /* renamed from: a */
    public final void mo27386a(boolean z, Object obj) {
        if (m33344e() && obj != null) {
            C11361a aVar = new C11361a();
            aVar.f30775a = m33341b(obj);
            if (aVar.f30775a != null && !aVar.f30775a.isEmpty()) {
                Message message = new Message();
                if (z) {
                    message.what = BaseNotice.HASHTAG;
                } else {
                    message.what = 102;
                }
                message.obj = aVar;
                this.f30774b.sendMessage(message);
            }
        }
    }

    public C11359a() {
        m33343d();
    }

    /* renamed from: e */
    private static boolean m33344e() {
        C11198c.m32777a();
        return false;
    }

    /* renamed from: b */
    public static boolean m33342b() {
        C11198c.m32777a();
        return false;
    }

    /* renamed from: a */
    public static C11359a m33339a() {
        if (f30773a == null) {
            synchronized (C11359a.class) {
                f30773a = new C11359a();
            }
        }
        return f30773a;
    }

    /* renamed from: d */
    private void m33343d() {
        Looper looper = C11198c.m32777a().mo27248b().f30398H;
        if (looper != null) {
            this.f30774b = new C11433k(looper, this);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("FTS-MANGER-QUEUE");
        handlerThread.start();
        this.f30774b = new C11433k(handlerThread.getLooper(), this);
    }

    /* renamed from: c */
    public final void mo27387c() {
        this.f30774b.removeMessages(BaseNotice.HASHTAG);
        this.f30774b.removeMessages(102);
        this.f30774b.removeMessages(103);
        this.f30774b.removeMessages(104);
        this.f30774b.removeMessages(105);
    }

    /* renamed from: b */
    private static List<C11435a> m33341b(Object obj) {
        C11198c.m32777a();
        return null;
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        if (message.obj instanceof C11361a) {
            C11361a aVar = (C11361a) message.obj;
            switch (message.what) {
                case BaseNotice.HASHTAG /*101*/:
                    C11362b.m33353a().mo27388a(aVar.f30775a);
                    return;
                case 102:
                    C11362b.m33353a().mo27389b(aVar.f30775a);
                    return;
                case 103:
                    C11362b.m33353a();
                    C11362b.m33358c(aVar.f30775a);
                    return;
                case 104:
                    C11362b.m33353a();
                    C11362b.m33356a(aVar.f30776b, aVar.f30777c);
                    return;
                case 105:
                    C11362b.m33353a();
                    C11362b.m33357a(aVar.f30776b, aVar.f30777c, aVar.f30778d);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo27382a(Object obj) {
        if (m33344e() && obj != null) {
            C11361a aVar = new C11361a();
            aVar.f30775a = m33341b(obj);
            if (aVar.f30775a != null && !aVar.f30775a.isEmpty()) {
                Message message = new Message();
                message.what = 103;
                message.obj = aVar;
                this.f30774b.sendMessage(message);
            }
        }
    }

    /* renamed from: a */
    public final void mo27383a(String str, String str2) {
        if (m33344e() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            mo27385a((List<String>) arrayList, str2);
        }
    }

    /* renamed from: a */
    public final void mo27385a(List<String> list, String str) {
        if (m33344e() && list != null && !list.isEmpty()) {
            C11361a aVar = new C11361a();
            aVar.f30776b = list;
            aVar.f30777c = str;
            Message message = new Message();
            message.what = 104;
            message.obj = aVar;
            this.f30774b.sendMessage(message);
        }
    }

    /* renamed from: a */
    private void m33340a(List<String> list, String str, int i) {
        if (m33344e() && !list.isEmpty()) {
            C11361a aVar = new C11361a();
            aVar.f30776b = list;
            aVar.f30777c = str;
            aVar.f30778d = i;
            Message message = new Message();
            message.what = 105;
            message.obj = aVar;
            this.f30774b.sendMessage(message);
        }
    }

    /* renamed from: a */
    public final void mo27384a(String str, String str2, int i) {
        if (m33344e() && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            m33340a((List<String>) arrayList, str2, i);
        }
    }
}
