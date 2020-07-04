package com.bytedance.p263im.core.model;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.internal.p589b.C11317c;
import com.bytedance.p263im.core.internal.p589b.C11318d;
import com.bytedance.p263im.core.internal.p589b.C11319e;
import com.bytedance.p263im.core.internal.p590db.C11368l;
import com.bytedance.p263im.core.internal.p590db.C11369m;
import com.bytedance.p263im.core.internal.utils.C11407f;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.model.b */
public final class C6425b extends C6434i implements C6433e {

    /* renamed from: a */
    public String f18778a;

    /* renamed from: b */
    private C6433e f18779b;

    /* renamed from: a */
    public final void mo15570a(Map<String, String> map, Runnable runnable) {
        m20077a(this.f18778a, map, (Runnable) null);
    }

    /* renamed from: a */
    public final void mo15571a(boolean z, C11195b<Conversation> bVar) {
        if (C6417a.m20015a().mo15530a(this.f18778a) != null) {
            C11283p.m33057a();
            C11283p.m33076a(this.f18778a, z, bVar);
        }
    }

    /* renamed from: a */
    public final void mo15566a(String str, C11195b<Conversation> bVar) {
        if (C6417a.m20015a().mo15530a(this.f18778a) != null) {
            C11283p.m33057a();
            C11283p.m33056a(this.f18778a, str, bVar);
        }
    }

    /* renamed from: a */
    public final void mo15569a(Map<String, String> map, C11195b bVar) {
        if (C6417a.m20015a().mo15530a(this.f18778a) != null) {
            C11283p.m33057a();
            C11283p.m33075a(this.f18778a, map, bVar);
        }
    }

    /* renamed from: a */
    public final void mo15567a(final String str, final String str2, final C11195b<Member> bVar) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C11319e.m33191a(new C11318d<Member>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public Member mo15560a() {
                    C11369m.m33392a();
                    return C11369m.m33394a(str, str2);
                }
            }, new C11317c<Member>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15561a(Member member) {
                    bVar.mo18089a(member);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo15568a(List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        C11283p.m33057a();
        C11283p.m33074a(this.f18778a, list, map, bVar);
    }

    /* renamed from: a */
    public final void mo15536a(String str, List<Member> list) {
        if (this.f18779b != null) {
            this.f18779b.mo15536a(str, list);
        }
    }

    /* renamed from: a */
    public final void mo15537a(List<Member> list) {
        if (this.f18779b != null) {
            this.f18779b.mo15537a(list);
        }
    }

    /* renamed from: c */
    public final void mo15577c() {
        mo15564a(null);
    }

    /* renamed from: b */
    public final void mo15572b() {
        this.f18779b = null;
        C11407f.m33601a().mo27457b(this);
        super.mo15572b();
    }

    /* renamed from: a */
    public final Conversation mo15562a() {
        return C6417a.m20015a().mo15530a(this.f18778a);
    }

    public C6425b(String str) {
        this.f18778a = str;
    }

    /* renamed from: a */
    public static String m20076a(long j) {
        return m20075a(0, j);
    }

    /* renamed from: c */
    public final void mo15545c(Conversation conversation) {
        if (this.f18779b != null) {
            this.f18779b.mo15545c(conversation);
        }
    }

    /* renamed from: d */
    public final void mo15548d(Conversation conversation) {
        if (this.f18779b != null) {
            this.f18779b.mo15548d(conversation);
        }
    }

    /* renamed from: e */
    public final void mo15550e(Conversation conversation) {
        if (this.f18779b != null) {
            this.f18779b.mo15550e(conversation);
        }
    }

    /* renamed from: b */
    public final void mo15573b(C11195b<String> bVar) {
        C11283p.m33057a();
        C11283p.m33055a(this.f18778a, bVar);
    }

    /* renamed from: a */
    public static long m20074a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 4) {
            return -1;
        }
        long longValue = Long.valueOf(split[2]).longValue();
        long longValue2 = Long.valueOf(split[3]).longValue();
        long a = C11198c.m32777a().f30372b.mo27230a();
        if (a == longValue) {
            return longValue2;
        }
        if (a == longValue2) {
            return longValue;
        }
        return -1;
    }

    /* renamed from: b */
    public final void mo15540b(Conversation conversation) {
        if (this.f18779b != null) {
            this.f18779b.mo15540b(conversation);
        }
    }

    /* renamed from: b */
    public final void mo15542b(List<Member> list) {
        if (this.f18779b != null) {
            this.f18779b.mo15542b(list);
        }
    }

    /* renamed from: a */
    public final void mo15564a(final C11195b<List<Member>> bVar) {
        C11319e.m33191a(new C11318d<List<Member>>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public List<Member> mo15560a() {
                C11369m.m33392a();
                return C11369m.m33400b(C6425b.this.f18778a);
            }
        }, new C11317c<List<Member>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(List<Member> list) {
                C6425b.this.mo15536a(C6425b.this.f18778a, list);
                if (bVar != null) {
                    bVar.mo18089a(list);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo15534a(Conversation conversation) {
        if (this.f18779b != null) {
            this.f18779b.mo15534a(conversation);
        }
    }

    /* renamed from: a */
    public final void mo15565a(C6433e eVar) {
        this.f18779b = eVar;
        C11407f.m33601a().mo27448a(this);
    }

    /* renamed from: a */
    public static String m20075a(int i, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.max(0, i));
        sb.append(":");
        sb.append(C11203a.f30380a);
        sb.append(":");
        long a = C11198c.m32777a().f30372b.mo27230a();
        if (a < j) {
            sb.append(a);
            sb.append(":");
            sb.append(j);
        } else {
            sb.append(j);
            sb.append(":");
            sb.append(a);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo15574b(String str, C11195b<Conversation> bVar) {
        if (C6417a.m20015a().mo15530a(this.f18778a) != null) {
            C11283p.m33057a();
            C11283p.m33083b(this.f18778a, str, bVar);
        }
    }

    /* renamed from: b */
    public final void mo15576b(boolean z, C11195b<Conversation> bVar) {
        if (C6417a.m20015a().mo15530a(this.f18778a) != null) {
            C11283p.m33057a();
            C11283p.m33085b(this.f18778a, z, bVar);
        }
    }

    /* renamed from: a */
    public static void m20077a(final String str, final Map<String, String> map, final Runnable runnable) {
        C11319e.m33191a(new C11318d<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public Conversation mo15560a() {
                Conversation a = C6417a.m20015a().mo15530a(str);
                a.setLocalExt(map);
                C11368l.m33375a();
                C11368l.m33384b(a);
                return a;
            }
        }, new C11317c<Conversation>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo15561a(Conversation conversation) {
                if (conversation != null) {
                    C6417a.m20015a().mo15540b(conversation);
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo15575b(List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        C11283p.m33057a();
        C11283p.m33084b(this.f18778a, list, null, bVar);
    }

    /* renamed from: a */
    public final void mo15563a(long j, List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        C11283p.m33057a();
        C11283p.m33073a(this.f18778a, j, list, map, bVar);
    }
}
