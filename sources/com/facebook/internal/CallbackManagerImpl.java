package com.facebook.internal;

import android.content.Intent;
import com.facebook.C13447e;
import com.facebook.C13499h;
import java.util.HashMap;
import java.util.Map;

public final class CallbackManagerImpl implements C13447e {

    /* renamed from: a */
    private static final String f36720a = "CallbackManagerImpl";

    /* renamed from: b */
    private static Map<Integer, C13855a> f36721b = new HashMap();

    /* renamed from: c */
    private Map<Integer, C13855a> f36722c = new HashMap();

    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        
        private final int offset;

        public final int toRequestCode() {
            return C13499h.m39732r() + this.offset;
        }

        private RequestCodeOffset(int i) {
            this.offset = i;
        }
    }

    /* renamed from: com.facebook.internal.CallbackManagerImpl$a */
    public interface C13855a {
        /* renamed from: a */
        boolean mo33483a(int i, Intent intent);
    }

    /* renamed from: a */
    private static synchronized C13855a m40920a(Integer num) {
        C13855a aVar;
        synchronized (CallbackManagerImpl.class) {
            aVar = (C13855a) f36721b.get(num);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo33480a(int i) {
        this.f36722c.remove(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo33481b(int i, C13855a aVar) {
        C13876aa.m40978a((Object) aVar, "callback");
        this.f36722c.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public static synchronized void m40921a(int i, C13855a aVar) {
        synchronized (CallbackManagerImpl.class) {
            C13876aa.m40978a((Object) aVar, "callback");
            if (!f36721b.containsKey(Integer.valueOf(i))) {
                f36721b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: b */
    private static boolean m40922b(int i, int i2, Intent intent) {
        C13855a a = m40920a(Integer.valueOf(i));
        if (a != null) {
            return a.mo33483a(i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo32944a(int i, int i2, Intent intent) {
        C13855a aVar = (C13855a) this.f36722c.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.mo33483a(i2, intent);
        }
        return m40922b(i, i2, intent);
    }
}
