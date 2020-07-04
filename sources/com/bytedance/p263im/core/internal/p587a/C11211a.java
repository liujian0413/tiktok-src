package com.bytedance.p263im.core.internal.p587a;

import android.text.TextUtils;
import com.bytedance.p263im.core.internal.p587a.p588a.C11283p;
import com.bytedance.p263im.core.model.Message;
import com.bytedance.p263im.core.p584a.C11198c;
import com.bytedance.p263im.core.proto.MessageBody;
import com.bytedance.p263im.core.proto.MessageBody.Builder;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.im.core.internal.a.a */
public final class C11211a {

    /* renamed from: a */
    private static final Set<Integer> f30433a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private static final Set<String> f30434b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private static final Set<Integer> f30435c = new CopyOnWriteArraySet();

    /* renamed from: d */
    private static final Set<Integer> f30436d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private static final Set<String> f30437e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private static final Map<Integer, Map<String, MessageBody>> f30438f = new ConcurrentHashMap();

    /* renamed from: g */
    private static final Set<String> f30439g = new CopyOnWriteArraySet();

    /* renamed from: a */
    public static void m32833a() {
        f30433a.clear();
        f30434b.clear();
        f30435c.clear();
        f30436d.clear();
        f30438f.clear();
        f30437e.clear();
        f30439g.clear();
    }

    /* renamed from: b */
    public static void m32841b() {
        if (!f30438f.isEmpty()) {
            for (Integer num : f30438f.keySet()) {
                C11283p.m33057a();
                C11283p.m33064a(num.intValue(), (Map) f30438f.get(num));
            }
            f30438f.clear();
        }
        if (!f30439g.isEmpty()) {
            for (String str : f30439g) {
                C11283p.m33057a();
                C11283p.m33090e(str);
            }
            f30439g.clear();
        }
    }

    /* renamed from: b */
    public static boolean m32844b(String str) {
        return f30434b.contains(str);
    }

    /* renamed from: c */
    public static void m32845c(String str) {
        f30434b.add(str);
    }

    /* renamed from: d */
    public static void m32848d(String str) {
        f30434b.remove(str);
    }

    /* renamed from: e */
    public static boolean m32850e(String str) {
        return f30437e.contains(str);
    }

    /* renamed from: f */
    public static void m32851f(String str) {
        f30437e.add(str);
    }

    /* renamed from: g */
    public static void m32854g(String str) {
        f30437e.remove(str);
    }

    /* renamed from: a */
    public static void m32839a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f30439g.add(str);
        }
    }

    /* renamed from: c */
    public static boolean m32846c(int i) {
        return f30435c.contains(Integer.valueOf(i));
    }

    /* renamed from: d */
    public static void m32847d(int i) {
        f30435c.add(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static void m32849e(int i) {
        f30435c.remove(Integer.valueOf(i));
    }

    /* renamed from: f */
    public static boolean m32852f(int i) {
        return f30436d.contains(Integer.valueOf(i));
    }

    /* renamed from: g */
    public static void m32853g(int i) {
        f30436d.add(Integer.valueOf(i));
    }

    /* renamed from: h */
    public static void m32855h(int i) {
        f30436d.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m32834a(int i) {
        if (C11198c.m32777a().mo27248b().f30420t == 2) {
            f30433a.add(Integer.valueOf(i));
            C11198c.m32777a();
        }
    }

    /* renamed from: b */
    public static boolean m32843b(int i) {
        if (!f30438f.containsKey(Integer.valueOf(i)) || ((Map) f30438f.get(Integer.valueOf(i))).isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m32842b(int i, String str) {
        if (f30438f.containsKey(Integer.valueOf(i))) {
            ((Map) f30438f.get(Integer.valueOf(i))).remove(str);
        }
    }

    /* renamed from: a */
    public static void m32835a(int i, int i2) {
        if (f30433a.contains(Integer.valueOf(i))) {
            f30433a.remove(Integer.valueOf(i));
            C11198c.m32777a();
        }
    }

    /* renamed from: a */
    public static void m32836a(int i, Message message) {
        if (message != null) {
            m32837a(i, new Builder().conversation_id(message.getConversationId()).conversation_short_id(Long.valueOf(message.getConversationShortId())).conversation_type(Integer.valueOf(message.getConversationType())).create_time(Long.valueOf(message.getCreatedAt())).build());
        }
    }

    /* renamed from: a */
    public static void m32837a(int i, MessageBody messageBody) {
        if (!(messageBody.conversation_id == null || messageBody.conversation_short_id == null || messageBody.conversation_type == null)) {
            if (f30438f.get(Integer.valueOf(i)) == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                concurrentHashMap.put(messageBody.conversation_id, messageBody);
                f30438f.put(Integer.valueOf(i), concurrentHashMap);
                return;
            }
            ((Map) f30438f.get(Integer.valueOf(i))).put(messageBody.conversation_id, messageBody);
        }
    }

    /* renamed from: a */
    public static boolean m32840a(int i, String str) {
        if (!f30438f.containsKey(Integer.valueOf(i)) || !((Map) f30438f.get(Integer.valueOf(i))).containsKey(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m32838a(int i, String str, long j, int i2, long j2) {
        m32837a(i, new Builder().conversation_id(str).conversation_short_id(Long.valueOf(j)).conversation_type(Integer.valueOf(i2)).create_time(Long.valueOf(j2)).build());
    }
}
