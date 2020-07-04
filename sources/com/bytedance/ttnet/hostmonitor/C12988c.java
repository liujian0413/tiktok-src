package com.bytedance.ttnet.hostmonitor;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.utils.C13006h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.hostmonitor.c */
public final class C12988c {

    /* renamed from: a */
    private final Context f34391a;

    /* renamed from: b */
    private SharedPreferences f34392b;

    /* renamed from: c */
    private Map<C12987b, C12989d> f34393c;

    /* renamed from: d */
    private String f34394d;

    /* renamed from: e */
    private int f34395e = -1;

    /* renamed from: f */
    private int f34396f = -1;

    /* renamed from: g */
    private int f34397g = -1;

    /* renamed from: g */
    private SharedPreferences m37875g() {
        if (this.f34392b == null) {
            this.f34392b = C7285c.m22838a(this.f34391a, "host_monitor_config", 0);
        }
        return this.f34392b;
    }

    /* renamed from: h */
    private int m37876h() {
        if (this.f34396f <= 0) {
            this.f34396f = m37875g().getInt("checkInterval", 0);
        }
        return this.f34396f;
    }

    /* renamed from: c */
    public final int mo31527c() {
        if (this.f34395e <= 0) {
            this.f34395e = m37875g().getInt("socketTimeout", 5000);
        }
        return this.f34395e;
    }

    /* renamed from: d */
    public final int mo31528d() {
        if (this.f34397g <= 0) {
            this.f34397g = m37875g().getInt("maxAttempts", 3);
        }
        return this.f34397g;
    }

    /* renamed from: b */
    public final String mo31526b() {
        if (this.f34394d == null) {
            this.f34394d = m37875g().getString("broadcastAction", "com.bytedance.ttnet.hostmonitor.status");
        }
        return this.f34394d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo31529e() {
        try {
            Logger.m37870c("HostMonitor", "saving hosts status map");
            m37875g().edit().putString("host_status", m37874a(this.f34393c).toString()).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public final void mo31530f() {
        try {
            Logger.m37870c("HostMonitor", "saving configuration");
            Editor edit = m37875g().edit();
            if (this.f34393c != null && !this.f34393c.isEmpty()) {
                edit.putString("host_status", m37874a(this.f34393c).toString());
            }
            if (this.f34394d != null && !this.f34394d.isEmpty()) {
                edit.putString("broadcastAction", this.f34394d);
            }
            if (this.f34395e > 0) {
                edit.putInt("socketTimeout", this.f34395e);
            }
            if (this.f34396f >= 0) {
                edit.putInt("checkInterval", this.f34396f);
            }
            if (this.f34397g > 0) {
                edit.putInt("maxAttempts", this.f34397g);
            }
            edit.apply();
            boolean z = !mo31523a().isEmpty();
            C13006h.m37954a(this.f34391a, ConnectivityReceiver.class, z);
            AlarmManager alarmManager = (AlarmManager) this.f34391a.getSystemService("alarm");
            PendingIntent a = m37872a(this.f34391a);
            Logger.m37870c("HostMonitor", "cancelling scheduled checks");
            alarmManager.cancel(a);
            if (z) {
                if (m37876h() > 0) {
                    StringBuilder sb = new StringBuilder("scheduling periodic checks every ");
                    sb.append(m37876h() / 1000);
                    sb.append(" seconds");
                    Logger.m37870c("HostMonitor", sb.toString());
                    C12961d.m37772a();
                    alarmManager.setRepeating(1, ((long) m37876h()) + System.currentTimeMillis(), (long) m37876h(), a);
                }
                Logger.m37870c("HostMonitor", "triggering reachability check");
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<C12987b, C12989d> mo31523a() {
        String string;
        try {
            if (this.f34393c == null) {
                string = m37875g().getString("host_status", "");
                if (string.isEmpty()) {
                    this.f34393c = new ConcurrentHashMap();
                } else {
                    this.f34393c = m37873a(new JSONArray(string));
                }
            }
        } catch (Exception e) {
            String str = "HostMonitor";
            StringBuilder sb = new StringBuilder("Error while deserializing host status map: ");
            sb.append(string);
            sb.append(". Ignoring values.");
            Logger.m37868a(str, sb.toString(), e);
            this.f34393c = new ConcurrentHashMap();
        } catch (Throwable unused) {
        }
        return this.f34393c;
    }

    /* renamed from: a */
    public final C12988c mo31522a(int i) {
        this.f34396f = 1800000;
        return this;
    }

    /* renamed from: a */
    private static PendingIntent m37872a(Context context) {
        return PendingIntent.getBroadcast(context, 0, HostMonitor.m37848a(context), 0);
    }

    public C12988c(Context context) {
        this.f34391a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final boolean mo31524a(C12987b bVar) {
        if (bVar == null) {
            return false;
        }
        try {
            Map a = mo31523a();
            if (a == null) {
                return false;
            }
            C12989d dVar = (C12989d) a.get(bVar);
            if (dVar == null || !dVar.f34398a) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final C12988c mo31525b(C12987b bVar) {
        if (bVar == null || mo31523a().keySet().contains(bVar)) {
            return this;
        }
        this.f34393c.put(bVar, new C12989d());
        return this;
    }

    /* renamed from: a */
    private static Map<C12987b, C12989d> m37873a(JSONArray jSONArray) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (jSONArray.length() <= 0) {
            return concurrentHashMap;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("host");
                int optInt = optJSONObject.optInt("port");
                boolean optBoolean = optJSONObject.optBoolean("reachable");
                int optInt2 = optJSONObject.optInt("connection_type");
                if (!C6319n.m19593a(optString) && optInt > 0) {
                    C12987b bVar = new C12987b(optString, optInt);
                    ConnectionType connectionType = ConnectionType.NONE;
                    if (optInt2 == 1) {
                        connectionType = ConnectionType.WIFI;
                    } else if (optInt2 == 2) {
                        connectionType = ConnectionType.MOBILE;
                    }
                    concurrentHashMap.put(bVar, new C12989d(optBoolean, connectionType));
                }
            }
        } catch (Throwable unused) {
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    private static JSONArray m37874a(Map<C12987b, C12989d> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null || map.isEmpty()) {
            return jSONArray;
        }
        try {
            for (Entry entry : map.entrySet()) {
                if (entry != null) {
                    C12987b bVar = (C12987b) entry.getKey();
                    C12989d dVar = (C12989d) entry.getValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("host", bVar.f34389a);
                    jSONObject.put("port", bVar.f34390b);
                    jSONObject.put("reachable", dVar.f34398a);
                    jSONObject.put("connection_type", dVar.f34399b.value);
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
