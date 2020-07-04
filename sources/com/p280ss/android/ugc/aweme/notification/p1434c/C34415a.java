package com.p280ss.android.ugc.aweme.notification.p1434c;

import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.framwork.core.p523b.C10233a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.message.p1392a.C33210a;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34312e;
import com.p280ss.android.ugc.aweme.notice.api.bean.NoticeCount;
import com.p280ss.android.ugc.aweme.notice.api.bean.StrangerNoticeMessage;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34321b;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34359h;
import com.p280ss.android.ugc.aweme.notification.C34380a;
import com.p280ss.android.ugc.aweme.notification.C34441f.C34442a;
import com.p280ss.android.ugc.aweme.notification.p1435d.C34424a;
import com.p280ss.android.ugc.aweme.notification.p1435d.C34427d;
import com.p280ss.android.ugc.aweme.notification.p1435d.C34429e;
import com.p280ss.android.ugc.aweme.notification.p1435d.C34432f;
import com.p280ss.android.ugc.aweme.notification.p1435d.C34435g;
import com.p280ss.android.ugc.aweme.notification.util.C34616e;
import com.p280ss.android.ugc.aweme.notification.util.C34616e.C34619b;
import com.p280ss.android.ugc.aweme.notification.view.C34641a;
import com.p280ss.android.ugc.aweme.notification.view.C34641a.C34642a;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.notification.c.a */
public final class C34415a implements C33210a {

    /* renamed from: a */
    private C34641a f89854a;

    /* renamed from: a */
    public final void mo87739a(C34641a aVar) {
        this.f89854a = aVar;
        C42961az.m136382c(this);
        int c = C33213d.m107132a().mo85008c(3);
        int c2 = C33213d.m107132a().mo85008c(44);
        int c3 = C33213d.m107132a().mo85008c(6);
        int c4 = C33213d.m107132a().mo85008c(7);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C34642a(0, c4));
        arrayList.add(new C34642a(1, c));
        arrayList.add(new C34642a(2, c3));
        arrayList.add(new C34642a(3, c2));
        this.f89854a.mo87624a(arrayList);
        C33213d.m107132a().mo85001a(2, (C33210a) this);
    }

    /* renamed from: a */
    public final void mo84994a(C34312e eVar) {
        if (eVar.f89454a == 11) {
            int i = eVar.f89458e;
            if (i == 0) {
                m111315b(eVar);
                if (this.f89854a != null) {
                }
            } else if (i == 1) {
                m111317c();
            }
        }
    }

    /* renamed from: c */
    private static void m111317c() {
        C32263a.m104774a().onNewNoticeArrived(4, new Bundle());
    }

    /* renamed from: i */
    private void m111332i() {
        if (C6399b.m19945u()) {
            m111311a(m111314b(33));
        }
    }

    /* renamed from: t */
    private void m111351t() {
        if (C6399b.m19945u()) {
            m111311a(m111314b(45));
        }
    }

    /* renamed from: f */
    private void m111325f() {
        if (C6399b.m19945u()) {
            m111311a(m111314b(46));
        } else {
            C34616e.m111865a().mo87910a(46, (C34619b) new C34417c(this));
        }
    }

    /* renamed from: g */
    private void m111328g() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(57));
        }
    }

    /* renamed from: h */
    private void m111330h() {
        if (C6399b.m19945u()) {
            m111311a(m111314b(47));
        } else {
            C34616e.m111865a().mo87910a(47, (C34619b) new C34418d(this));
        }
    }

    /* renamed from: k */
    private void m111336k() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(29));
        }
    }

    /* renamed from: l */
    private void m111338l() {
        if (!C6399b.m19944t() && ((C34321b) C34323d.m111009a(C34321b.class)).mo60346a()) {
            m111311a(m111314b(32));
        }
    }

    /* renamed from: m */
    private void m111340m() {
        if (C6399b.m19945u()) {
            m111311a(m111314b(21));
        } else {
            C34616e.m111865a().mo87910a(21, (C34619b) new C34419e(this));
        }
    }

    /* renamed from: n */
    private void m111342n() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(31));
        }
    }

    /* renamed from: p */
    private void m111346p() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(60));
        }
    }

    /* renamed from: r */
    private void m111349r() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(103));
        }
    }

    /* renamed from: s */
    private void m111350s() {
        if (!C6399b.m19944t()) {
            m111311a(m111314b(52));
        }
    }

    /* renamed from: d */
    private static void m111319d() {
        IIMService a = C32263a.m104775a(false);
        if (a != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("unread_count", C33213d.m107132a().mo85008c(11));
            a.onNewNoticeArrived(1, bundle);
        }
    }

    /* renamed from: e */
    private void m111322e() {
        ArrayList arrayList = new ArrayList();
        m111316b((List<C34359h>) arrayList);
        m111318c((List<C34359h>) arrayList);
        m111321d((List<C34359h>) arrayList);
        m111327f((List<C34359h>) arrayList);
        m111329g(arrayList);
        m111331h(arrayList);
        m111333i(arrayList);
        m111324e((List<C34359h>) arrayList);
        m111343n(arrayList);
        m111347p(arrayList);
        m111337k(arrayList);
        m111335j(arrayList);
        m111345o(arrayList);
        m111339l(arrayList);
        m111341m(arrayList);
        m111311a((List<C34359h>) arrayList);
    }

    /* renamed from: j */
    private void m111334j() {
        if (!C6399b.m19944t() && ((C34320a) C34323d.m111009a(C34320a.class)).mo60337a() && ((C34320a) C34323d.m111009a(C34320a.class)).mo60339b()) {
            m111311a(m111314b(16));
        }
    }

    /* renamed from: o */
    private void m111344o() {
        if (!C6399b.m19944t()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && iUserService.getCurrentUser() != null && iUserService.getCurrentUser().isWithDouplusEntry()) {
                m111311a(m111314b(19));
            }
        }
    }

    /* renamed from: q */
    private void m111348q() {
        if (!C6399b.m19945u()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && iUserService.getCurrentUser() != null) {
                C34616e.m111865a().mo87910a(62, (C34619b) new C34420f(this, 62));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo87740b() throws Exception {
        m111319d();
        if (C6399b.m19945u()) {
            m111322e();
        } else {
            m111325f();
            m111328g();
            m111330h();
            m111334j();
            m111336k();
            m111338l();
            m111340m();
            m111332i();
            m111349r();
            m111351t();
            m111344o();
            m111342n();
            m111350s();
            m111348q();
            m111346p();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo87736a() {
        C42961az.m136383d(this);
        C33213d.m107132a().mo84999a(2);
        this.f89854a = null;
        C34616e.m111865a().mo87911b();
    }

    /* renamed from: a */
    private void m111311a(List<C34359h> list) {
        new C34416b(this);
    }

    /* renamed from: b */
    private List<C34359h> m111314b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m111307a(i));
        return arrayList;
    }

    /* renamed from: d */
    private void m111321d(List<C34359h> list) {
        list.add(m111307a(47));
    }

    /* renamed from: e */
    private void m111324e(List<C34359h> list) {
        list.add(m111307a(33));
    }

    /* renamed from: p */
    private void m111347p(List<C34359h> list) {
        list.add(m111307a(45));
    }

    /* renamed from: a */
    private static C34359h m111307a(int i) {
        C34359h hVar = new C34359h();
        hVar.f89548d = i;
        hVar.f89549e = 0;
        hVar.f89545a = 0;
        hVar.f89546b = 0;
        hVar.f89547c = 1;
        return hVar;
    }

    /* renamed from: b */
    private void m111316b(List<C34359h> list) {
        list.add(m111307a(46));
    }

    /* renamed from: c */
    private void m111318c(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(57));
        }
    }

    /* renamed from: i */
    private void m111333i(List<C34359h> list) {
        list.add(m111307a(21));
    }

    /* renamed from: j */
    private void m111335j(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(31));
        }
    }

    /* renamed from: o */
    private void m111345o(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(52));
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onEvent(String str) {
        if (TextUtils.equals("sessionListFragment-onMain", str)) {
            C1592h.m7855a((Callable<TResult>) new C34421g<TResult>(this), C1592h.f5958b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo87741b(BaseNotice baseNotice) {
        int c = C33213d.m107132a().mo85008c(21);
        C34424a aVar = new C34424a();
        if (!m111313a(baseNotice, (C34427d) aVar, c) && !C34442a.m111397a(21, baseNotice.getCreateTime())) {
            C34616e.m111867a((C7102a) aVar, baseNotice);
            aVar.f19946j = c;
            C32263a.m104774a().updateNoticeSession(aVar);
        }
    }

    /* renamed from: g */
    private void m111329g(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(29));
        }
    }

    /* renamed from: h */
    private void m111331h(List<C34359h> list) {
        if (!C6399b.m19944t() && ((C34321b) C34323d.m111009a(C34321b.class)).mo60346a()) {
            list.add(m111307a(32));
        }
    }

    /* renamed from: k */
    private void m111337k(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && iUserService.getCurrentUser() != null && iUserService.getCurrentUser().isWithDouplusEntry()) {
                list.add(m111307a(19));
            }
        }
    }

    /* renamed from: l */
    private void m111339l(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(60));
        }
    }

    /* renamed from: m */
    private void m111341m(List<C34359h> list) {
        if (!C6399b.m19945u()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null && iUserService.getCurrentUser() != null) {
                list.add(m111307a(62));
            }
        }
    }

    /* renamed from: n */
    private void m111343n(List<C34359h> list) {
        if (!C6399b.m19944t()) {
            list.add(m111307a(103));
        }
    }

    /* renamed from: a */
    private void m111309a(String str) {
        m111310a("notice_log", "notice_fetch_failed", C6869c.m21381a().mo16887a("notice_type", str).mo16888b());
    }

    /* renamed from: b */
    private static void m111315b(C34312e eVar) {
        IIMService a = C32263a.m104775a(false);
        if (a != null) {
            Bundle bundle = new Bundle();
            StrangerNoticeMessage strangerNoticeMessage = eVar.f89457d;
            if (strangerNoticeMessage != null) {
                bundle.putLong("last_create_time", strangerNoticeMessage.getCreateTime());
                bundle.putString("from_user_id", strangerNoticeMessage.getFromUser().getUid());
                bundle.putString("from_user_name", strangerNoticeMessage.getFromUser().getNickName());
                bundle.putString("from_user_content", strangerNoticeMessage.getContent());
                bundle.putInt("from_user_msg_type", strangerNoticeMessage.getMsgType());
                bundle.putBoolean("is_recalled", strangerNoticeMessage.isRecalled());
            }
            bundle.putInt("unread_count", C33213d.m107132a().mo85008c(11));
            a.onNewNoticeArrived(3, bundle);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void mo87738a(BaseNotice baseNotice) {
        int c = C33213d.m107132a().mo85008c(46);
        C34429e eVar = new C34429e();
        if (!m111313a(baseNotice, (C34427d) eVar, c) && !C34442a.m111397a(46, baseNotice.getCreateTime())) {
            C34616e.m111867a((C7102a) eVar, baseNotice);
            eVar.f19946j = c;
            C32263a.m104774a().updateNoticeSession(eVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo87742c(BaseNotice baseNotice) {
        int c = C33213d.m107132a().mo85008c(47);
        C34432f fVar = new C34432f();
        if (!m111313a(baseNotice, (C34427d) fVar, c)) {
            if (c > 0 || !C34442a.m111397a(47, baseNotice.getCreateTime())) {
                C34616e.m111867a((C7102a) fVar, baseNotice);
                fVar.f19946j = c;
                C32263a.m104774a().updateNoticeSession(fVar);
            }
        }
    }

    /* renamed from: f */
    private void m111327f(List<C34359h> list) {
        if (!C6399b.m19944t() && ((C34320a) C34323d.m111009a(C34320a.class)).mo60337a() && ((C34320a) C34323d.m111009a(C34320a.class)).mo60339b()) {
            list.add(m111307a(16));
        }
    }

    @C7709l
    public final void onAggregatedEvent(C34380a aVar) {
        if (!C10233a.m30356a(aVar.f89640c)) {
            ArrayList arrayList = new ArrayList();
            for (NoticeCount noticeCount : aVar.f89640c) {
                if (noticeCount != null && noticeCount.getCount() > 0) {
                    m111312a((List<C34359h>) arrayList, noticeCount.getGroup());
                }
            }
            int size = arrayList.size();
            if (size > 0) {
                if (size > 1) {
                    m111311a((List<C34359h>) arrayList);
                    return;
                }
                C34359h hVar = (C34359h) arrayList.get(0);
                aVar.f89638a = hVar.f89548d;
                aVar.f89639b = hVar.f89547c;
            } else {
                return;
            }
        }
        switch (aVar.f89638a) {
            case 2:
            case 44:
                if (this.f89854a != null) {
                    this.f89854a.mo87622a(3, aVar.f89639b);
                    return;
                }
                break;
            case 3:
                if (this.f89854a != null) {
                    this.f89854a.mo87622a(1, aVar.f89639b);
                    return;
                }
                break;
            case 6:
                if (this.f89854a != null) {
                    this.f89854a.mo87622a(2, aVar.f89639b);
                    return;
                }
                break;
            case 7:
                if (this.f89854a != null) {
                    this.f89854a.mo87622a(0, aVar.f89639b);
                    return;
                }
                break;
            case 12:
                if (this.f89854a != null) {
                    this.f89854a.mo87627g();
                    return;
                }
                break;
            case 16:
                if (aVar.f89639b > 0) {
                    m111334j();
                    return;
                }
                break;
            case 19:
                if (aVar.f89639b > 0) {
                    m111344o();
                    return;
                }
                break;
            case 21:
                if (aVar.f89639b > 0) {
                    m111340m();
                    return;
                }
                break;
            case 29:
                if (aVar.f89639b > 0) {
                    m111336k();
                    return;
                }
                break;
            case 31:
                if (aVar.f89639b > 0) {
                    m111342n();
                    return;
                }
                break;
            case 32:
                if (aVar.f89639b > 0) {
                    m111338l();
                    return;
                }
                break;
            case 33:
                if (aVar.f89639b > 0) {
                    m111332i();
                    return;
                }
                break;
            case BaseNotice.f89516AT /*45*/:
                if (aVar.f89639b > 0) {
                    m111351t();
                    return;
                }
                break;
            case 46:
                if (aVar.f89639b > 0) {
                    m111325f();
                    return;
                }
                break;
            case 47:
                if (aVar.f89639b > 0) {
                    m111330h();
                    return;
                }
                break;
            case 52:
                if (aVar.f89639b > 0) {
                    m111350s();
                    return;
                }
                break;
            case 57:
                if (aVar.f89639b > 0) {
                    m111328g();
                    return;
                }
                break;
            case 60:
                if (aVar.f89639b > 0) {
                    m111346p();
                    break;
                }
                break;
            case BaseNotice.CREATOR /*62*/:
                break;
            case 103:
                if (aVar.f89639b > 0) {
                    m111349r();
                    return;
                }
                break;
        }
        if (aVar.f89639b > 0) {
            m111348q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87737a(int i, BaseNotice baseNotice) {
        m111308a(i, baseNotice, (C34427d) new C34435g());
    }

    /* renamed from: a */
    private void m111312a(List<C34359h> list, int i) {
        switch (i) {
            case 16:
                m111327f(list);
                return;
            case 19:
                m111337k(list);
                return;
            case 21:
                m111333i(list);
                return;
            case 29:
                m111329g(list);
                return;
            case 31:
                m111335j(list);
                return;
            case 32:
                m111331h(list);
                return;
            case 33:
                m111324e(list);
                return;
            case BaseNotice.f89516AT /*45*/:
                m111347p(list);
                return;
            case 46:
                m111316b(list);
                return;
            case 47:
                m111321d(list);
                return;
            case 52:
                m111345o(list);
                return;
            case 57:
                m111318c(list);
                return;
            case 60:
                m111339l(list);
                return;
            case BaseNotice.CREATOR /*62*/:
                m111341m(list);
                break;
            case 103:
                m111343n(list);
                return;
        }
    }

    /* renamed from: a */
    private void m111308a(int i, BaseNotice baseNotice, C34427d dVar) {
        int c = C33213d.m107132a().mo85008c(i);
        if (!m111313a(baseNotice, dVar, c)) {
            if (c > 0 || !C34442a.m111397a(i, baseNotice.getCreateTime())) {
                C34616e.m111867a((C7102a) dVar, baseNotice);
                dVar.f19946j = c;
                if (c > 0 && i == 62) {
                    dVar.f19948l = 1;
                }
                C32263a.m104774a().updateNoticeSession(dVar);
            }
        }
    }

    /* renamed from: a */
    private static void m111310a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }

    /* renamed from: a */
    private boolean m111313a(BaseNotice baseNotice, C34427d dVar, int i) {
        if (baseNotice != null) {
            return false;
        }
        if (i > 0) {
            if (C32263a.m104774a().getNoticeSession(dVar.bf_()) == null) {
                dVar.mo87749f();
            }
            m111309a(dVar.bf_());
        }
        return true;
    }
}
