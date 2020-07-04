package com.p280ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.location.Address;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.ttnet.C12953c;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.MultiProcessSharedProvider;
import com.p280ss.android.common.util.MultiProcessSharedProvider.C19285a;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.utils.C43013ch;
import com.p280ss.android.ugc.aweme.utils.C43056dh;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend */
public class IESNetDepend implements C12953c {

    /* renamed from: a */
    private static volatile IESNetDepend f88811a;

    /* renamed from: b */
    private static Map<String, String> f88812b;

    /* renamed from: c */
    private boolean f88813c = true;

    /* renamed from: d */
    private volatile IESNetDependApi f88814d;

    /* renamed from: com.ss.android.ugc.aweme.net.corenet.IESNetDepend$IESNetDependApi */
    interface IESNetDependApi {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);
    }

    /* renamed from: e */
    public final String mo31471e() {
        return "ib";
    }

    /* renamed from: f */
    public final Map<String, String> mo31472f() {
        return f88812b;
    }

    /* renamed from: g */
    public final String mo31473g() {
        return "";
    }

    /* renamed from: d */
    public final String mo31470d() {
        if (!C6399b.m19944t()) {
            return ".snssdk.com";
        }
        return ".tiktokv.com";
    }

    /* renamed from: h */
    public static IESNetDepend m109639h() {
        if (f88811a == null) {
            synchronized (IESNetDepend.class) {
                if (f88811a == null) {
                    f88811a = new IESNetDepend();
                }
            }
        }
        return f88811a;
    }

    /* renamed from: a */
    public final Context mo31461a() {
        return C6399b.m19921a();
    }

    static {
        HashMap hashMap = new HashMap();
        f88812b = hashMap;
        hashMap.put("ib.snssdk.com", "ib");
        f88812b.put("security.snssdk.com", "si");
        f88812b.put("isub.snssdk.com", "isub");
        f88812b.put("ichannel.snssdk.com", "ichannel");
        f88812b.put("log.snssdk.com", "log");
        f88812b.put("mon.snssdk.com", "mon");
    }

    /* renamed from: c */
    public final String[] mo31469c() {
        if (C6399b.m19946v()) {
            return new String[]{"dm16.musical.ly", "dm-maliva16.byteoversea.com", "dm16.byteoversea.com"};
        } else if (C6399b.m19947w()) {
            return new String[]{"dm16.tiktokv.com", "dm16.byteoversea.com", "dm-maliva16.byteoversea.com"};
        } else {
            return new String[]{"dm.toutiao.com", "dm.bytedance.com", "dm-hl.toutiao.com"};
        }
    }

    /* renamed from: b */
    public final boolean mo31468b() {
        if (!C6384b.m19835a().mo15292a(CronetPluginExperiment.class, true, "cronet_plugin_test", C6384b.m19835a().mo15295d().cronet_plugin_test, false)) {
            return true;
        }
        SharedPreferences a = C7285c.m22838a(mo31461a(), "cronet_plugin_sp", 0);
        if (a.getBoolean("cronet_plugin_first", true)) {
            Editor edit = a.edit();
            edit.putBoolean("cronet_plugin_first", false);
            edit.apply();
            this.f88813c = false;
        }
        new StringBuilder("isCronetPluginInstalled:").append(this.f88813c);
        return this.f88813c;
    }

    /* renamed from: a */
    public final Address mo31462a(Context context) {
        LocationBundle locationBundle;
        if (C43056dh.m136600a()) {
            locationBundle = C32630h.m105696b(context).mo83993a();
        } else {
            locationBundle = null;
        }
        if (locationBundle == null) {
            return null;
        }
        Address address = new Address(C43013ch.m136515b());
        address.setLatitude(locationBundle.latitude);
        address.setLongitude(locationBundle.longitude);
        address.setLocality(locationBundle.city);
        return address;
    }

    /* renamed from: a */
    public final void mo31467a(String str, JSONObject jSONObject) {
        C6877n.m21447a(str, jSONObject);
    }

    /* renamed from: a */
    public final int mo31460a(Throwable th, String[] strArr) {
        return NetUtil.checkHttpRequestException(th, null);
    }

    /* renamed from: a */
    public final String mo31463a(int i, String str) throws Exception {
        try {
            if (this.f88814d == null) {
                this.f88814d = (IESNetDependApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(IESNetDependApi.class);
            }
            return (String) this.f88814d.doGet(str).get();
        } catch (ExecutionException e) {
            throw ((Exception) e.getCause());
        }
    }

    /* renamed from: a */
    public final void mo31466a(Context context, Map<String, ?> map) {
        try {
            C19285a a = MultiProcessSharedProvider.m63189a(context);
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        a.mo51176a((String) entry.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a.mo51177a((String) entry.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        a.mo51175a((String) entry.getKey(), ((Float) value).floatValue());
                    } else if (value instanceof Boolean) {
                        a.mo51179a((String) entry.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a.mo51178a((String) entry.getKey(), (String) value);
                    }
                }
                a.mo51180a();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final int mo31459a(Context context, String str, int i) {
        return MultiProcessSharedProvider.m63193b(context).mo51181a(str, i);
    }

    /* renamed from: a */
    public final String mo31464a(Context context, String str, String str2) {
        return MultiProcessSharedProvider.m63193b(context).mo51183a(str, str2);
    }

    /* renamed from: a */
    public final void mo31465a(Context context, String str, String str2, JSONObject jSONObject) {
        if (context != null) {
            C6906g.m21514a(context, "umeng", str, str2, 0, 0, jSONObject);
        }
    }
}
