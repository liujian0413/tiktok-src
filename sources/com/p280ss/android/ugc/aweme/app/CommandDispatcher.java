package com.p280ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.util.NetworkUtils.C6767d;
import com.p280ss.android.newmedia.C19913a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.tools.extract.C42323i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher */
public final class CommandDispatcher implements C6767d {

    /* renamed from: a */
    public static final String f60335a = C19913a.m62957a("/command/feedback/");

    /* renamed from: b */
    public static AtomicBoolean f60336b = new AtomicBoolean(false);

    /* renamed from: c */
    public LinkedHashSet<Long> f60337c;

    /* renamed from: d */
    private ArrayList<Object> f60338d;

    /* renamed from: e */
    private volatile List<Object> f60339e;

    /* renamed from: f */
    private HandlerThread f60340f;

    /* renamed from: g */
    private Handler f60341g;

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$CommandDispatcherApi */
    interface CommandDispatcherApi {
        @C6456g
        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6455f Map<String, String> map);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$a */
    static class C22670a {

        /* renamed from: a */
        public static final CommandDispatcher f60342a = new CommandDispatcher();
    }

    /* renamed from: com.ss.android.ugc.aweme.app.CommandDispatcher$b */
    public class C22671b extends Thread {
        public final void run() {
            long lastActiveTime = AppLog.getLastActiveTime();
            while (System.currentTimeMillis() - lastActiveTime < 60000 && m74914a()) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException unused) {
                }
            }
            CommandDispatcher.f60336b.set(false);
        }

        /* renamed from: a */
        private boolean m74914a() {
            boolean z;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (CommandDispatcher.this.f60337c) {
                linkedHashSet.addAll(CommandDispatcher.this.f60337c);
            }
            if (linkedHashSet.isEmpty()) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                if (longValue > 0) {
                    sb.append(longValue);
                    sb.append(",");
                }
            }
            if (sb.length() == 0) {
                return false;
            }
            try {
                z = m74913a(sb.substring(0, sb.length() - 1)).booleanValue();
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            synchronized (CommandDispatcher.this.f60337c) {
                CommandDispatcher.this.f60337c.removeAll(linkedHashSet);
            }
            return true;
        }

        public C22671b() {
        }

        /* renamed from: a */
        private static Boolean m74913a(String str) throws Exception {
            if (C6319n.m19593a(str)) {
                return Boolean.valueOf(false);
            }
            CommandDispatcherApi commandDispatcherApi = (CommandDispatcherApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(CommandDispatcherApi.class);
            HashMap hashMap = new HashMap();
            hashMap.put("command_ids", str);
            try {
                String str2 = (String) commandDispatcherApi.doPost(CommandDispatcher.f60335a, hashMap).get();
                if (str2 == null || str2.length() == 0) {
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf("success".equals(new JSONObject(str2).getString("message")));
            } catch (ExecutionException e) {
                throw ((Exception) e.getCause());
            }
        }
    }

    /* renamed from: b */
    public static CommandDispatcher m74907b() {
        return C22670a.f60342a;
    }

    /* renamed from: a */
    public final String mo16556a() {
        return "X-SS-Command";
    }

    private CommandDispatcher() {
        this.f60337c = new LinkedHashSet<>();
        this.f60338d = new ArrayList<>();
    }

    /* renamed from: c */
    private synchronized Handler m74909c() {
        if (this.f60340f == null) {
            this.f60340f = new HandlerThread("AppData-AsyncOp");
            this.f60340f.start();
            this.f60341g = new C6309f(this.f60340f.getLooper(), new C23059t(this));
            C6921a.m21558a("command_dispatcher_handler", null);
        }
        return this.f60341g;
    }

    /* renamed from: a */
    public final void mo16557a(List<String> list) {
        for (String a : list) {
            m74905a(a);
        }
    }

    /* renamed from: a */
    private void m74906a(LinkedHashSet<Long> linkedHashSet) {
        if (!linkedHashSet.isEmpty()) {
            synchronized (this.f60337c) {
                linkedHashSet.addAll(this.f60337c);
            }
            int i = 0;
            int size = linkedHashSet.size() - 100;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                Long l = (Long) it.next();
                if (i > size) {
                    break;
                }
                linkedHashSet.remove(l);
                i++;
            }
            synchronized (this.f60337c) {
                this.f60337c.addAll(linkedHashSet);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo59396a(Message message) {
        if (message.what == 104) {
            try {
                JSONObject jSONObject = (JSONObject) message.obj;
                jSONObject.optLong(C42323i.f110089f);
                jSONObject.optString("t");
                List<Object> list = this.f60339e;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        it.next();
                        jSONObject.optJSONObject("p");
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private void m74905a(String str) {
        if (str != null && !C6319n.m19593a(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    long optLong = jSONObject.optLong(C42323i.f110089f);
                    if (optLong > 0) {
                        linkedHashSet.add(Long.valueOf(optLong));
                        m74909c().sendMessage(m74909c().obtainMessage(104, jSONObject));
                    }
                }
                if (!linkedHashSet.isEmpty()) {
                    m74906a(linkedHashSet);
                    if (f60336b.compareAndSet(false, true)) {
                        new C22671b().start();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
