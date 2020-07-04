package com.p280ss.android.ugc.aweme.p313im.sdk.p314d;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.content.C0688e;
import android.text.TextUtils;
import android.util.Pair;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.internal.utils.C11432j;
import com.bytedance.p263im.core.model.C6417a;
import com.bytedance.p263im.core.model.C6432c;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31001v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31001v.C31002a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.C31482a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.p1335a.C31483a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31511a;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31517b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C31521c;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7018d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7020e;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger.C7023c.C7024b;
import com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a;
import com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31861ag;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.d.j */
public final class C6978j {

    /* renamed from: a */
    public static boolean f19703a;

    /* renamed from: k */
    private static volatile C6978j f19704k;

    /* renamed from: b */
    public C31511a f19705b;

    /* renamed from: c */
    public Map<String, C7102a> f19706c = new ConcurrentHashMap();

    /* renamed from: d */
    public Map<String, C7102a> f19707d = new ConcurrentHashMap();

    /* renamed from: e */
    public volatile int f19708e;

    /* renamed from: f */
    public volatile int f19709f;

    /* renamed from: g */
    public volatile boolean f19710g;

    /* renamed from: h */
    public C1590f f19711h;

    /* renamed from: i */
    public Handler f19712i = new C31001v(this.f19717o);

    /* renamed from: j */
    public Comparator<C7102a> f19713j = new Comparator<C7102a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m21752a((C7102a) obj, (C7102a) obj2);
        }

        /* renamed from: a */
        private static int m21752a(C7102a aVar, C7102a aVar2) {
            if (aVar.f19948l == aVar2.f19948l) {
                return (aVar2.f19945i > aVar.f19945i ? 1 : (aVar2.f19945i == aVar.f19945i ? 0 : -1));
            }
            return Integer.compare(aVar2.f19948l, aVar.f19948l);
        }
    };

    /* renamed from: l */
    private C1592h f19714l;

    /* renamed from: m */
    private Set<C31483a<C7102a>> f19715m = new HashSet();

    /* renamed from: n */
    private C6432c f19716n = new C6432c() {
        /* renamed from: a */
        public final void mo15536a(String str, List<Member> list) {
        }

        /* renamed from: a */
        public final void mo15537a(List<Member> list) {
        }

        /* renamed from: b */
        public final void mo15542b(List<Member> list) {
        }

        /* renamed from: d */
        public final void mo15548d(Conversation conversation) {
        }

        /* renamed from: e */
        public final void mo15550e(Conversation conversation) {
        }

        /* renamed from: a */
        public final void mo15534a(Conversation conversation) {
            C6978j.this.f19710g = true;
            C6978j.this.f19712i.sendEmptyMessage(2);
        }

        /* renamed from: b */
        public final void mo15540b(Conversation conversation) {
            C6978j.this.f19710g = true;
            C6978j.this.f19712i.sendEmptyMessage(2);
        }

        /* renamed from: c */
        public final void mo15545c(Conversation conversation) {
            C6978j.this.f19710g = true;
            C6978j.this.f19712i.sendEmptyMessage(2);
        }

        /* renamed from: a */
        public final void mo15578a(Map<String, Conversation> map) {
            C6978j.f19703a = true;
            C6978j.this.f19710g = true;
            C6978j.this.f19712i.sendEmptyMessage(2);
        }
    };

    /* renamed from: o */
    private C31002a f19717o = new C31002a() {
        /* renamed from: a */
        public final void mo18064a(Object obj, int i) {
        }

        /* renamed from: c */
        public final void mo18065c() {
        }

        /* renamed from: a */
        public final void mo18063a() {
            C7103h f = C6956a.m21632a().mo18009f();
            if (f == null || !f.enableIM()) {
                C6978j.this.mo18053d();
            } else if (C31915n.m103671a()) {
                C6978j.this.mo18049b();
            } else {
                C6978j.this.mo18052c();
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.d.j$a */
    public static final class C6989a {

        /* renamed from: a */
        public final C31521c f19728a;

        /* renamed from: b */
        public final List<C7102a> f19729b;

        /* renamed from: c */
        public final List<C7102a> f19730c;

        /* renamed from: d */
        public final boolean f19731d;

        public C6989a(C31521c cVar, List<C7102a> list, List<C7102a> list2, boolean z) {
            this.f19728a = cVar;
            this.f19729b = list;
            this.f19730c = list2;
            this.f19731d = z;
        }
    }

    /* renamed from: h */
    public final void mo18057h() {
        this.f19712i.sendEmptyMessage(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo18055f() {
        C6417a.m20015a().mo15535a(this.f19716n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo18056g() {
        C6417a.m20015a().mo15541b(this.f19716n);
        m21718l();
    }

    /* renamed from: i */
    public final void mo18058i() {
        C7023c.m21847a().mo18122a((C7024b) new C7024b() {
            public final void onFetch(C7020e eVar) {
                if (eVar != null) {
                    C6978j.m21717a().mo18045a((C7102a) C7018d.m21837a(eVar));
                    return;
                }
                C6978j.m21717a().mo18046a("stranger_1");
            }
        });
    }

    /* renamed from: a */
    public static C6978j m21717a() {
        if (f19704k == null) {
            synchronized (C6978j.class) {
                if (f19704k == null) {
                    f19704k = new C6978j();
                }
            }
        }
        return f19704k;
    }

    /* renamed from: m */
    private void m21719m() {
        if (this.f19705b == null) {
            this.f19705b = new C31511a();
            this.f19705b.f19951o = true;
        }
    }

    /* renamed from: j */
    public final void mo18059j() {
        if (this.f19705b != null) {
            this.f19710g = true;
            this.f19705b = null;
            this.f19712i.sendEmptyMessage(2);
        }
    }

    /* renamed from: k */
    public final void mo18060k() {
        if (C7063bg.m22048a()) {
            C7076p.m22077a().mo18299b(this.f19709f);
            if (this.f19708e > 0 || this.f19709f > 0) {
                mo18054e();
            }
        }
    }

    private C6978j() {
    }

    /* renamed from: l */
    private void m21718l() {
        this.f19712i.removeMessages(2);
        if (this.f19711h != null && !this.f19711h.mo6869a()) {
            this.f19711h.mo6871c();
        }
        this.f19711h = null;
        this.f19706c.clear();
        this.f19707d.clear();
        this.f19710g = false;
        this.f19709f = 0;
        this.f19708e = 0;
        mo18054e();
    }

    /* renamed from: b */
    public final synchronized void mo18049b() {
        C11432j.m33706a();
        if (this.f19714l == null || this.f19714l.mo6887c() || this.f19714l.mo6882b() || this.f19714l.mo6889d()) {
            this.f19711h = new C1590f();
            this.f19714l = C1592h.m7854a((Callable<TResult>) new Callable<Pair<List<C7102a>, Integer>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Pair<List<C7102a>, Integer> call() {
                    boolean z;
                    ArrayList arrayList = new ArrayList(C6978j.this.f19707d.values());
                    if (C6978j.this.f19710g) {
                        C6978j.this.f19706c.clear();
                        int i = 0;
                        int i2 = 0;
                        for (Conversation conversation : C6417a.m20015a().mo15549e().values()) {
                            C7102a a = C31482a.m102378a(conversation);
                            if (a != null) {
                                if (!a.mo18371h() || !conversation.isMute()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                C6978j.this.f19706c.put(a.bf_(), a);
                                arrayList.add(a);
                                if (!z) {
                                    i += a.f19946j;
                                } else {
                                    i2 += a.f19946j;
                                }
                            }
                        }
                        C6978j.this.f19708e = i;
                        C6978j.this.f19709f = i2;
                        Collections.sort(arrayList, C6978j.this.f19713j);
                        return new Pair<>(arrayList, Integer.valueOf(i));
                    }
                    arrayList.addAll(C6978j.this.f19706c.values());
                    Collections.sort(arrayList, C6978j.this.f19713j);
                    return new Pair<>(arrayList, Integer.valueOf(C6978j.this.f19708e));
                }
            }, this.f19711h.mo6870b()).mo6886c(new C1591g<Pair<List<C7102a>, Integer>, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<Pair<List<C7102a>, Integer>> hVar) {
                    Pair pair = (Pair) hVar.mo6890e();
                    if (pair != null) {
                        C6978j.this.f19710g = false;
                        C6978j.this.mo18047a((List) pair.first);
                        C6978j.this.f19708e = ((Integer) pair.second).intValue();
                        C6978j.this.mo18054e();
                    }
                    C6978j.this.f19711h = null;
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: c */
    public final synchronized void mo18052c() {
        C11432j.m33706a();
        if (this.f19714l == null || this.f19714l.mo6887c() || this.f19714l.mo6882b() || this.f19714l.mo6889d()) {
            this.f19711h = new C1590f();
            this.f19714l = C1592h.m7854a((Callable<TResult>) new Callable<C6989a>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C6989a call() {
                    int i;
                    C31521c cVar;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C6978j.this.f19706c.clear();
                    boolean z = C6978j.f19703a;
                    Iterator it = C6417a.m20015a().mo15549e().values().iterator();
                    int i2 = 0;
                    while (true) {
                        boolean z2 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Conversation conversation = (Conversation) it.next();
                        C7102a a = C31482a.m102378a(conversation);
                        if (a != null) {
                            if (IMService.inst().isImReduction()) {
                                a.f19946j = 0;
                            }
                            C6978j.this.f19706c.put(a.bf_(), a);
                            arrayList.add(a);
                            if (!a.mo18371h() || !conversation.isMute()) {
                                z2 = false;
                            }
                            if (!z2) {
                                if (a instanceof ChatSession) {
                                    i2 += a.f19946j;
                                } else if (a instanceof C31517b) {
                                    i2 += a.f19946j;
                                }
                            }
                        }
                    }
                    if (C7076p.m22077a().mo18318f() || C6978j.this.f19705b == null) {
                        i = 0;
                    } else {
                        arrayList.add(C6978j.this.f19705b);
                        i2 += C6978j.this.f19705b.f19946j;
                        i = C6978j.this.f19705b.f82509a + 0;
                    }
                    if (IMService.inst().isImReduction()) {
                        i = 0;
                        i2 = 0;
                    }
                    int i3 = 0;
                    for (C7102a aVar : C6978j.this.f19707d.values()) {
                        if (aVar.mo18115b() == 2 || aVar.mo18115b() == 16 || aVar.mo18115b() == 5 || aVar.mo18115b() == 14 || aVar.mo18115b() == 19 || aVar.mo18115b() == 15 || aVar.mo18115b() == 18 || aVar.mo18115b() == 6 || aVar.mo18115b() == 3 || aVar.mo18115b() == 24 || aVar.mo18115b() == 4 || aVar.mo18115b() == 21 || aVar.mo18115b() == 23 || aVar.mo18115b() == 22 || aVar.mo18115b() == 25) {
                            arrayList.add(aVar);
                        } else if (aVar.mo18115b() == 7 && !C6399b.m19944t()) {
                            arrayList.add(aVar);
                        } else if (aVar.mo18115b() != 10) {
                            arrayList2.add(aVar);
                            i3 += aVar.f19946j;
                        }
                    }
                    Collections.sort(arrayList2, C6978j.this.f19713j);
                    if (!arrayList2.isEmpty()) {
                        C7102a aVar2 = (C7102a) arrayList2.get(0);
                        if (aVar2.f19948l == 1 && arrayList2.size() > 1 && ((C7102a) arrayList2.get(1)).f19945i > aVar2.f19945i) {
                            aVar2 = (C7102a) arrayList2.get(1);
                        }
                        cVar = new C31521c();
                        StringBuilder sb = new StringBuilder();
                        sb.append(aVar2.f19943g);
                        sb.append("：");
                        sb.append(aVar2.f19944h);
                        cVar.f19944h = sb.toString();
                        cVar.mo18368a(aVar2.f19945i);
                        cVar.f19946j = i3;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        arrayList.add(cVar);
                    }
                    Collections.sort(arrayList, C6978j.this.f19713j);
                    C6978j.this.f19708e = i2;
                    C6978j.this.f19709f = i;
                    return new C6989a(cVar, arrayList, arrayList2, z);
                }
            }, this.f19711h.mo6870b()).mo6886c(new C1591g<C6989a, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<C6989a> hVar) {
                    C6989a aVar = (C6989a) hVar.mo6890e();
                    if (aVar != null) {
                        C6978j.this.mo18043a(aVar);
                        C6978j.this.mo18054e();
                    }
                    C6978j.this.f19711h = null;
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: d */
    public final synchronized void mo18053d() {
        C11432j.m33706a();
        if (this.f19714l == null || this.f19714l.mo6887c() || this.f19714l.mo6882b() || this.f19714l.mo6889d()) {
            this.f19711h = new C1590f();
            this.f19714l = C1592h.m7854a((Callable<TResult>) new Callable<List<C7102a>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public List<C7102a> call() {
                    int i;
                    ArrayList arrayList = new ArrayList(C6978j.this.f19707d.values());
                    int i2 = 0;
                    if (C7076p.m22077a().mo18318f() || C6978j.this.f19705b == null) {
                        i = 0;
                    } else {
                        arrayList.add(C6978j.this.f19705b);
                        i = C6978j.this.f19705b.f19946j + 0;
                        i2 = 0 + C6978j.this.f19705b.f82509a;
                    }
                    C6978j.this.f19708e = i;
                    C6978j.this.f19709f = i2;
                    Collections.sort(arrayList, C6978j.this.f19713j);
                    return arrayList;
                }
            }, this.f19711h.mo6870b()).mo6886c(new C1591g<List<C7102a>, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<List<C7102a>> hVar) {
                    List list = (List) hVar.mo6890e();
                    if (list != null) {
                        C6978j.this.mo18047a(list);
                        C6978j.this.mo18054e();
                    }
                    C6978j.this.f19711h = null;
                    return null;
                }
            }, C1592h.f5958b);
        }
    }

    /* renamed from: e */
    public final void mo18054e() {
        C0688e a = C0688e.m2941a(C6399b.m19921a());
        Intent intent = new Intent("com.msg.count.action.arrived");
        int max = Math.max(0, Math.abs(C7076p.m22077a().mo18304c() - this.f19709f));
        intent.putExtra("msg_count", this.f19708e);
        if (C7063bg.m22048a() || C7027a.f19815b.mo18138n()) {
            String str = "msg_dot";
            if (max == 0) {
                max = -1;
            }
            intent.putExtra(str, max);
        }
        a.mo2839a(intent);
    }

    /* renamed from: b */
    public final void mo18050b(C31483a<C7102a> aVar) {
        this.f19715m.remove(aVar);
    }

    /* renamed from: a */
    public final void mo18044a(C31483a<C7102a> aVar) {
        this.f19715m.add(aVar);
        this.f19712i.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public final C7102a mo18048b(String str) {
        return (C7102a) this.f19707d.get(str);
    }

    /* renamed from: b */
    public final void mo18051b(C7102a aVar) {
        this.f19707d.remove(aVar.bf_());
        this.f19712i.sendEmptyMessage(2);
    }

    /* renamed from: a */
    public final void mo18043a(C6989a aVar) {
        for (C31483a a : this.f19715m) {
            a.mo82167a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo18042a(Bundle bundle) {
        C32025c iMSetting = C6956a.m21632a().mo18009f().getIMSetting();
        if (!(iMSetting == null || iMSetting.f83741d == null || !iMSetting.f83741d.getShowMsgCell().booleanValue() || !iMSetting.f83741d.getMainSwitch().booleanValue() || bundle == null)) {
            this.f19710g = true;
            m21719m();
            long j = bundle.getLong("flip_chat_msg_unread_dot_count");
            long j2 = bundle.getLong("flip_chat_msg_unread_count");
            long j3 = bundle.getLong("flip_chat_msg_update_time");
            String string = bundle.getString("flip_chat_msg_content");
            this.f19705b.f82509a = C31861ag.m103523a(j);
            this.f19705b.f19946j = C31861ag.m103523a(j2);
            this.f19705b.mo18368a(j3);
            this.f19705b.f19944h = string;
            this.f19712i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo18045a(C7102a aVar) {
        if (aVar.mo18115b() != 10) {
            this.f19707d.put(aVar.bf_(), aVar);
            this.f19712i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo18046a(String str) {
        if (!TextUtils.isEmpty(str) && this.f19707d.containsKey(str)) {
            this.f19707d.remove(str);
            this.f19712i.sendEmptyMessage(2);
        }
    }

    /* renamed from: a */
    public final void mo18047a(List<C7102a> list) {
        for (C31483a a : this.f19715m) {
            a.mo82168a(list);
        }
    }
}
