package com.bytedance.ies.settings;

import com.squareup.wire.Message;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.settings.a */
public class C10938a {

    /* renamed from: a */
    private static volatile C10938a f29603a;

    /* renamed from: b */
    private final Map<Class, Message> f29604b = new HashMap();

    private C10938a() {
    }

    /* renamed from: a */
    public static C10938a m32097a() {
        if (f29603a != null) {
            return f29603a;
        }
        synchronized (C10938a.class) {
            if (f29603a == null) {
                f29603a = new C10938a();
            }
        }
        return f29603a;
    }

    /* renamed from: a */
    public final <T extends Message> T mo26424a(Class<T> cls) {
        return (Message) this.f29604b.get(cls);
    }

    /* renamed from: a */
    public final void mo26426a(Message message) {
        this.f29604b.put(message.getClass(), message);
    }

    /* renamed from: a */
    public final <T extends Message> T mo26425a(Class<T> cls, T t) {
        if (t != null) {
            return t;
        }
        return mo26424a(cls);
    }
}
