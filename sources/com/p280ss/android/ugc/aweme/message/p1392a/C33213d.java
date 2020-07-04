package com.p280ss.android.ugc.aweme.message.p1392a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34308b;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34312e;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.api.bean.MessageType;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeList;
import com.p280ss.android.ugc.aweme.notice.api.p1425a.C34297a;
import com.p280ss.android.ugc.aweme.notice.api.p1425a.C34298b;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34304c;
import com.p280ss.android.ugc.aweme.notice.api.p1427b.C34305d;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34331e;
import com.p280ss.android.ugc.aweme.notice.api.p1430ws.C34334h;
import com.p280ss.android.ugc.aweme.notice.repo.api.NotificationApi;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.C34380a;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.message.a.d */
public class C33213d implements C6310a, C34297a, C34304c, C34305d {

    /* renamed from: a */
    private static long f86424a = System.currentTimeMillis();

    /* renamed from: h */
    private static volatile C33213d f86425h;

    /* renamed from: b */
    private SparseArray<C33210a> f86426b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<Integer> f86427c = new SparseArray<>();

    /* renamed from: d */
    private int[] f86428d = {0, 4, 5, 7, 3, 2, 6, 1, 47, 46, 35, 9, 21, 12, 13, 37, 26, 11, 99, BaseNotice.HASHTAG, 998, 997, 43, 1000, 62, 61};

    /* renamed from: e */
    private SharedPreferences f86429e;

    /* renamed from: f */
    private Handler f86430f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: g */
    private boolean f86431g = false;

    /* renamed from: c */
    private static boolean m107139c(int i, int i2) {
        if (i == 3 || i == 2 || i == 44 || i == 6 || i == 7 || i == 12 || i == 52) {
            return true;
        }
        return i2 > 0 && (i == 46 || i == 57 || i == 47 || i == 16 || i == 29 || i == 32 || i == 21 || i == 33 || i == 103 || i == 45 || i == 31 || i == 19);
    }

    /* renamed from: a */
    public final void mo85005a(boolean z, int i) {
        if (C6861a.m21337f().isLogin() && !TextUtils.isEmpty(C6861a.m21337f().getCurUserId())) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z || currentTimeMillis >= f86424a + 300000) {
                if (i == 2 || ((C34320a) C34323d.m111009a(C34320a.class)).mo60342e() > 0) {
                    C1592h.m7848a((long) ((C34320a) C34323d.m111009a(C34320a.class)).mo60342e()).mo6875a((C1591g<TResult, TContinuationResult>) new C33215e<TResult,TContinuationResult>(this, i));
                } else {
                    m107141d(i);
                }
                f86424a = currentTimeMillis;
            }
        }
    }

    /* renamed from: a */
    public final void mo85004a(boolean z) {
        this.f86431g = z;
    }

    /* renamed from: a */
    public static C33213d m107132a() {
        if (f86425h == null) {
            synchronized (C33213d.class) {
                if (f86425h == null) {
                    f86425h = new C33213d();
                }
            }
        }
        return f86425h;
    }

    /* renamed from: c */
    private void m107138c() {
        int[] iArr;
        for (int i : this.f86428d) {
            this.f86427c.append(i, Integer.valueOf(this.f86429e.getInt(m107146g(i), 0)));
        }
    }

    /* renamed from: e */
    private static void m107143e() {
        ((C34320a) ServiceManager.get().getService(C34320a.class)).mo60336a(true);
    }

    /* renamed from: d */
    private int m107140d() {
        return mo85008c(7) + 0 + mo85008c(3) + mo85008c(2) + mo85008c(43) + mo85008c(6) + mo85008c(14) + mo85008c(13) + mo85008c(37);
    }

    private C33213d() {
        m107133a(C6399b.m19921a());
    }

    /* renamed from: b */
    public final void mo85006b() {
        this.f86427c.clear();
        Editor edit = this.f86429e.edit();
        edit.clear();
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public final void mo85002a(Message message) {
        handleMsg(message);
    }

    /* renamed from: d */
    private void m107141d(final int i) {
        C23397p.m76735a().mo60807a(this.f86430f, new Callable() {
            public final Object call() throws Exception {
                return NotificationApi.m111064a(i);
            }
        }, 0);
    }

    /* renamed from: g */
    private static String m107146g(int i) {
        StringBuilder sb = new StringBuilder("unread_");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo84999a(int i) {
        this.f86426b.remove(2);
    }

    /* renamed from: b */
    private static boolean m107137b(C34312e eVar) {
        if (!C6399b.m19946v() || eVar == null || eVar.f89454a != 5 || C34439a.f89873b.getShowRedDotType() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m107133a(Context context) {
        C34331e.m111025a().mo87177a(new C34298b());
        C34334h.m111033d().mo87178a(MessageType.NOTICE, this);
        this.f86429e = C7285c.m22838a(context, "red-point-cache", 0);
        m107138c();
    }

    /* renamed from: e */
    private boolean m107144e(int i) {
        if (i == 11) {
            if (mo85008c(i) <= 0 || mo85008c(998) <= 0) {
                return false;
            }
            return true;
        } else if (mo85008c(i) > 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m107145f(int i) {
        if (C27688b.m90840d()) {
            if (i == 99 || i == 7 || i == 3 || i == 6 || i == 2) {
                return true;
            }
            return false;
        } else if (i == 47 || i == 99 || i == 21 || i == 7 || i == 3 || i == 6 || i == 44) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final int mo85008c(int i) {
        if (i == 36) {
            return m107140d();
        }
        if (this.f86427c.get(i) == null) {
            return 0;
        }
        return ((Integer) this.f86427c.get(i)).intValue();
    }

    /* renamed from: a */
    private void m107134a(C34312e eVar) {
        m107142d(eVar.f89454a, eVar.f89455b);
        this.f86427c.put(eVar.f89454a, Integer.valueOf(eVar.f89455b));
        Editor edit = this.f86429e.edit();
        edit.putInt(m107146g(eVar.f89454a), eVar.f89455b);
        C9721b.m28656a(edit);
    }

    public void handleMsg(Message message) {
        if (message.what == 0 && !(message.obj instanceof Exception)) {
            NoticeList noticeList = (NoticeList) message.obj;
            if (!(noticeList == null || noticeList.getItems() == null || noticeList.getItems().isEmpty())) {
                C42961az.m136380a(new C34314g(-2));
                for (NoticeCount noticeCount : noticeList.getItems()) {
                    if (noticeCount != null) {
                        m107136b(noticeCount.getGroup(), noticeCount.getCount());
                    }
                }
                C42961az.m136380a(new C34314g(-3));
            }
        }
    }

    /* renamed from: b */
    public final void mo85007b(int i) {
        this.f86427c.remove(i);
        Editor edit = this.f86429e.edit();
        edit.putInt(m107146g(i), 0);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public final void mo85003a(C34308b bVar) {
        if (bVar instanceof C34312e) {
            C34312e eVar = (C34312e) bVar;
            if (!m107137b(eVar)) {
                m107134a(eVar);
                mo85005a(false, 2);
                if (eVar.f89454a == 100) {
                    m107143e();
                }
                m107135a(eVar, eVar.f89454a);
                if (C34439a.f89873b.isEnableMultiAccountLogin() && C6861a.m21337f().allUidList().size() > 1) {
                    C33211b.m107126a().mo84997a(C6861a.m21337f().allUidList());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo84998a(int i, C1592h hVar) throws Exception {
        m107141d(i);
        return null;
    }

    /* renamed from: b */
    private void m107136b(int i, int i2) {
        mo85000a(i, i2);
        if (m107139c(i, i2)) {
            C42961az.m136380a(new C34380a(i, i2));
        }
        if (m107145f(i)) {
            C42961az.m136380a(new C34314g(i, i2));
        }
        if (!m107145f(i) && m107144e(i)) {
            C42961az.m136380a(new C34314g(i, mo85008c(i)));
        }
    }

    /* renamed from: d */
    private void m107142d(int i, int i2) {
        if (i == 11) {
            int c = i2 - mo85008c(11);
            if (!this.f86431g && c > 0) {
                this.f86427c.put(998, Integer.valueOf(c));
                this.f86427c.put(997, Integer.valueOf(c));
                Editor edit = this.f86429e.edit();
                edit.putInt(m107146g(998), c);
                edit.putInt(m107146g(997), c);
                C9721b.m28656a(edit);
            }
        }
    }

    /* renamed from: a */
    private void m107135a(C34312e eVar, int i) {
        C33210a aVar = (C33210a) this.f86426b.get(2);
        if (!(aVar == null || eVar == null)) {
            aVar.mo84994a(eVar);
        }
        if (!m107145f(i) && m107144e(i)) {
            C42961az.m136380a(new C34314g(i, mo85008c(i)));
        }
    }

    /* renamed from: a */
    public final void mo85000a(int i, int i2) {
        m107142d(i, i2);
        this.f86427c.put(i, Integer.valueOf(i2));
        Editor edit = this.f86429e.edit();
        edit.putInt(m107146g(i), i2);
        C9721b.m28656a(edit);
    }

    /* renamed from: a */
    public final void mo85001a(int i, C33210a aVar) {
        this.f86426b.put(2, aVar);
    }
}
