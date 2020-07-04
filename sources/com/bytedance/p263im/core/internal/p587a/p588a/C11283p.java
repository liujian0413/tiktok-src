package com.bytedance.p263im.core.internal.p587a.p588a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.p263im.core.internal.queue.C11379a;
import com.bytedance.p263im.core.internal.queue.C11390d;
import com.bytedance.p263im.core.internal.queue.C11391e;
import com.bytedance.p263im.core.internal.utils.C11433k;
import com.bytedance.p263im.core.internal.utils.C11433k.C11434a;
import com.bytedance.p263im.core.model.C11472n;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.model.Member;
import com.bytedance.p263im.core.p584a.p585a.C11194a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.bytedance.p263im.core.proto.IMCMD;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.ParticipantMinIndex;
import com.bytedance.p263im.core.proto.ParticipantReadIndex;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.im.core.internal.a.a.p */
public final class C11283p implements C11434a {

    /* renamed from: b */
    private static C11283p f30588b;

    /* renamed from: a */
    public boolean f30589a;

    /* renamed from: c */
    private C11433k f30590c = new C11433k(Looper.getMainLooper(), this);

    /* renamed from: d */
    public final void mo27311d() {
        this.f30589a = true;
    }

    /* renamed from: a */
    public final void mo27309a(Message message) {
        if (message.obj instanceof C11391e) {
            C11391e eVar = (C11391e) message.obj;
            if (eVar.f30859h != null) {
                eVar.f30859h.mo27306c(eVar);
            }
        }
    }

    /* renamed from: a */
    public static void m33069a(com.bytedance.p263im.core.model.Message message, C11195b<com.bytedance.p263im.core.model.Message> bVar) {
        new C11220ad(bVar).mo27269a(message);
    }

    /* renamed from: a */
    public static void m33077a(int[] iArr, C11195b<int[]> bVar) {
        new C11241c(bVar).mo27277a(iArr);
    }

    /* renamed from: a */
    public static void m33072a(String str) {
        new C11292s().mo27318a(str);
    }

    /* renamed from: a */
    public static void m33062a(int i, long j, C11195b<Conversation> bVar) {
        new C11252e(bVar).mo27288a(i, j, null);
    }

    /* renamed from: a */
    public static void m33063a(int i, List<Long> list, String str, Map<String, String> map, C11195b<Conversation> bVar) {
        new C11252e(bVar).mo27289a(i, list, str, map, null);
    }

    /* renamed from: a */
    public static void m33068a(com.bytedance.p263im.core.model.Message message) {
        new C11258g().mo27292a(message);
    }

    /* renamed from: a */
    public static void m33070a(com.bytedance.p263im.core.model.Message message, boolean z, C11195b<com.bytedance.p263im.core.model.Message> bVar) {
        new C11258g(bVar).mo27293a(message, z);
    }

    /* renamed from: a */
    public static void m33074a(String str, List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        new C11212a(bVar).mo27262a(str, list, map, (C11390d) null);
    }

    /* renamed from: a */
    public static void m33073a(String str, long j, List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        new C11212a(bVar).mo27261a(str, j, list, map);
    }

    /* renamed from: a */
    public static void m33076a(String str, boolean z, C11195b<Conversation> bVar) {
        new C11233ai(bVar).mo27273a(str, z, null);
    }

    /* renamed from: a */
    public static void m33075a(String str, Map<String, String> map, C11195b<Conversation> bVar) {
        new C11237ak(bVar).mo27276a(str, map, null);
    }

    /* renamed from: a */
    public static void m33065a(long j, long j2, C11194a<List<Conversation>> aVar) {
        new C11279n(null).mo27300a(0, j2);
    }

    /* renamed from: a */
    public static void m33066a(long j, C11195b<Boolean> bVar) {
        new C11307x(bVar).mo27323a(j);
    }

    /* renamed from: a */
    public static void m33067a(C11195b<Boolean> bVar) {
        new C11300u(bVar).mo27320b();
    }

    /* renamed from: a */
    public static void m33071a(C11472n nVar, C11195b<Boolean> bVar) {
        new C11219ac(null).mo27268a(nVar);
    }

    /* renamed from: b */
    public static void m33078b() {
        new C11226af();
        C11226af.m32897b();
    }

    /* renamed from: c */
    public static void m33086c() {
        new C11225ae();
        C11225ae.m32894b();
    }

    private C11283p() {
        C11379a.m33470a().mo27401a(this.f30590c);
    }

    /* renamed from: e */
    public final void mo27312e() {
        this.f30589a = false;
        this.f30590c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public static C11283p m33057a() {
        if (f30588b == null) {
            synchronized (C11283p.class) {
                if (f30588b == null) {
                    f30588b = new C11283p();
                }
            }
        }
        return f30588b;
    }

    /* renamed from: a */
    public final void mo27310a(Runnable runnable) {
        this.f30590c.post(runnable);
    }

    /* renamed from: d */
    public static void m33089d(String str) {
        new C11301v().mo27322a(str);
    }

    /* renamed from: e */
    public static void m33090e(String str) {
        new C11297t().mo27319a(str, (C11390d) null);
    }

    /* renamed from: b */
    public static void m33079b(int i) {
        new C11218ab(i).mo27267b();
    }

    /* renamed from: c */
    public static void m33087c(String str) {
        new C11255f().mo27291a(str);
    }

    /* renamed from: b */
    public static void m33081b(String str) {
        new C11261h().mo27295a(str);
    }

    /* renamed from: a */
    public static void m33059a(int i) {
        new C11284q(i).mo27315b();
    }

    /* renamed from: a */
    public static void m33064a(int i, Map<String, MessageBody> map) {
        C11266i.m33000a(i, map);
    }

    /* renamed from: a */
    public static long m33055a(String str, C11195b<String> bVar) {
        return new C11289r(bVar).mo27316a(str, (C11390d) null);
    }

    /* renamed from: b */
    public static void m33080b(com.bytedance.p263im.core.model.Message message, C11195b<com.bytedance.p263im.core.model.Message> bVar) {
        new C11311z(bVar).mo27324a(message);
    }

    /* renamed from: c */
    public static void m33088c(String str, C11195b<List<ParticipantReadIndex>> bVar) {
        new C11272k(bVar).mo27297a(str);
    }

    /* renamed from: a */
    public static C11391e m33058a(IMCMD imcmd, C11391e eVar) {
        if (imcmd == IMCMD.NEW_MSG_NOTIFY) {
            eVar.f30859h = new C11308y();
        } else if (imcmd == IMCMD.MARK_READ_NOTIFY) {
            eVar.f30859h = new C11304w();
        } else if (imcmd != IMCMD.STRANGER_NEW_MSG_NOTIFY) {
            return null;
        } else {
            eVar.f30859h = new C11236aj();
        }
        return eVar;
    }

    /* renamed from: b */
    public static void m33082b(String str, C11195b<List<ParticipantMinIndex>> bVar) {
        new C11271j(bVar).mo27296a(str);
    }

    /* renamed from: a */
    public static void m33060a(int i, int i2) {
        new C11276m(i).mo27299a(i2);
    }

    /* renamed from: a */
    public static long m33054a(int i, long j, C11390d dVar) {
        return new C11252e().mo27288a(i, j, dVar);
    }

    /* renamed from: a */
    public static long m33056a(String str, String str2, C11195b<Conversation> bVar) {
        return new C11230ah(bVar).mo27271a(str, str2, null);
    }

    /* renamed from: b */
    public static void m33083b(String str, String str2, C11195b<Conversation> bVar) {
        new C11230ah(bVar).mo27272b(str, str2, null);
    }

    /* renamed from: b */
    public static void m33085b(String str, boolean z, C11195b<Conversation> bVar) {
        new C11233ai(bVar).mo27274b(str, z, null);
    }

    /* renamed from: b */
    public static void m33084b(String str, List<Long> list, Map<String, String> map, C11195b<List<Member>> bVar) {
        new C11215aa(bVar).mo27266a(str, list, map, null);
    }

    /* renamed from: a */
    public static void m33061a(int i, int i2, long j, C11194a<List<Conversation>> aVar) {
        new C11273l(aVar, i2).mo27298a(i, j);
    }
}
