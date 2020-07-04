package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.text.TextUtils;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.chatroom.viewmodule.p221a.p222a.C5570c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.google.gson.p276a.C6593c;
import com.google.gson.p277b.C6597a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.k */
public final class C5748k {

    /* renamed from: a */
    private ArrayList<C5750a> f16858a;

    /* renamed from: b */
    private ArrayList<C5750a> f16859b;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.k$a */
    class C5750a {
        @C6593c(mo15949a = "key")

        /* renamed from: a */
        public String f16861a;
        @C6593c(mo15949a = "version")

        /* renamed from: b */
        public int f16862b;
        @C6593c(mo15949a = "local_version")

        /* renamed from: c */
        public int f16863c;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.k$b */
    static class C5751b {

        /* renamed from: a */
        public static C5748k f16864a = new C5748k();
    }

    /* renamed from: a */
    public static C5748k m18109a() {
        return C5751b.f16864a;
    }

    private C5748k() {
        m18112c();
    }

    /* renamed from: d */
    private void m18114d() {
        if (!mo14183b()) {
            C5747j.m18103a().mo14164a(ToolbarButton.MORE, (C5735a) new C5570c(false));
        }
    }

    /* renamed from: e */
    private void m18115e() {
        if (this.f16858a != null) {
            try {
                String b = C2317a.m9932a().mo15979b((Object) this.f16858a);
                StringBuilder sb = new StringBuilder("saveRedDotSetting fullInfo: ");
                sb.append(b);
                C3166a.m11966e("ToolbarMoreRedDotManager", sb.toString());
                C8946b.f24468bv.mo22118a(b);
            } catch (Exception e) {
                C3166a.m11963b("ToolbarMoreRedDotManager", (Throwable) e);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo14183b() {
        if (this.f16859b != null && this.f16859b.size() > 0) {
            Iterator it = this.f16859b.iterator();
            while (it.hasNext()) {
                if (m18110a((C5750a) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m18112c() {
        String str = (String) LiveSettingKeys.LIVE_GROUP_TOOLBAR_RED_DOT_SETTING.mo10240a();
        StringBuilder sb = new StringBuilder("intRedDotSettingList onlineRedDotStr: ");
        sb.append(str);
        C3166a.m11966e("ToolbarMoreRedDotManager", sb.toString());
        ArrayList<C5750a> c = m18111c(str);
        if (c != null && c.size() != 0) {
            String str2 = (String) C8946b.f24468bv.mo22117a();
            StringBuilder sb2 = new StringBuilder("intRedDotSettingList localRedDotStr: ");
            sb2.append(str2);
            C3166a.m11966e("ToolbarMoreRedDotManager", sb2.toString());
            ArrayList c2 = m18111c(str2);
            if (c2 != null && c2.size() > 0) {
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    C5750a aVar = (C5750a) it.next();
                    C5750a a = m18108a(aVar.f16861a, c2);
                    if (a != null) {
                        aVar.f16863c = a.f16863c;
                        c2.remove(a);
                    }
                }
            }
            this.f16858a = c;
            this.f16859b = new ArrayList<>();
        }
    }

    /* renamed from: d */
    private C5750a m18113d(String str) {
        return m18108a(str, this.f16859b);
    }

    /* renamed from: a */
    private static boolean m18110a(C5750a aVar) {
        if (aVar == null || aVar.f16863c >= aVar.f16862b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo14181a(String str) {
        StringBuilder sb = new StringBuilder("showRedDot key: ");
        sb.append(str);
        C3166a.m11966e("ToolbarMoreRedDotManager", sb.toString());
        return m18110a(m18113d(str));
    }

    /* renamed from: b */
    public final void mo14182b(String str) {
        C5750a d = m18113d(str);
        if (d != null) {
            d.f16863c = d.f16862b;
            m18115e();
            m18114d();
        }
    }

    /* renamed from: c */
    private ArrayList<C5750a> m18111c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return (ArrayList) C9178j.m27302j().mo22372a().mo15975a(str, new C6597a<List<C5750a>>() {
                }.type);
            } catch (Exception e) {
                C3166a.m11963b("ToolbarMoreRedDotManager", (Throwable) e);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo14180a(List<String> list) {
        if (this.f16858a != null && this.f16858a.size() != 0) {
            if (this.f16859b != null) {
                this.f16859b.clear();
            }
            if (list != null && list.size() > 0) {
                for (String a : list) {
                    C5750a a2 = m18108a(a, this.f16858a);
                    if (m18110a(a2)) {
                        this.f16859b.add(a2);
                    }
                }
                if (mo14183b()) {
                    C3166a.m11966e("ToolbarMoreRedDotManager", "intRedDotSettingList sendCommand true: ");
                    C5747j.m18103a().mo14164a(ToolbarButton.MORE, (C5735a) new C5570c(true));
                }
            }
        }
    }

    /* renamed from: a */
    private static C5750a m18108a(String str, ArrayList<C5750a> arrayList) {
        if (!TextUtils.isEmpty(str) && arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C5750a aVar = (C5750a) it.next();
                if (aVar.f16861a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }
}
