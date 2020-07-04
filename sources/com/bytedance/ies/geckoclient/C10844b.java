package com.bytedance.ies.geckoclient;

import android.accounts.NetworkErrorException;
import android.content.Context;
import com.bytedance.ies.geckoclient.model.C10893a;
import com.bytedance.ies.geckoclient.model.C10893a.C10894a;
import com.bytedance.ies.geckoclient.model.C10893a.C10895b;
import com.bytedance.ies.geckoclient.model.C10893a.C10896c;
import com.bytedance.ies.geckoclient.model.C10893a.C10897d;
import com.bytedance.ies.geckoclient.model.C10898b;
import com.bytedance.ies.geckoclient.model.C10902c;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10907h;
import com.bytedance.ies.geckoclient.p568b.C10848b;
import com.bytedance.ies.geckoclient.p570d.C10852a;
import com.bytedance.ies.geckoclient.p571e.C10863b;
import com.bytedance.ies.geckoclient.p571e.C10866c;
import com.bytedance.ies.geckoclient.p571e.C10867d;
import com.bytedance.ies.geckoclient.p571e.C10869f;
import com.google.gson.p277b.C6597a;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.geckoclient.b */
final class C10844b extends C10835a {

    /* renamed from: b */
    private Context f29354b;

    /* renamed from: c */
    private C10873f f29355c;

    /* renamed from: d */
    private List<C10903d> f29356d;

    /* renamed from: e */
    private C10886h f29357e;

    /* renamed from: f */
    private C10890l f29358f;

    /* renamed from: g */
    private C10902c f29359g;

    /* renamed from: h */
    private boolean f29360h;

    /* renamed from: i */
    private String f29361i;

    /* renamed from: j */
    private String f29362j;

    /* renamed from: k */
    private Map<String, String> f29363k;

    /* renamed from: l */
    private Map<String, Object> f29364l;

    /* renamed from: a */
    private String m31807a() {
        HashMap hashMap = new HashMap();
        if (this.f29363k != null) {
            hashMap.putAll(this.f29363k);
        }
        hashMap.putAll(C10867d.m31882a(this.f29354b, this.f29359g));
        StringBuilder sb = new StringBuilder();
        for (Entry entry : hashMap.entrySet()) {
            sb.append("&");
            sb.append(URLEncoder.encode((String) entry.getKey()));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue()));
        }
        return sb.substring(1, sb.length());
    }

    /* renamed from: b */
    private Map<String, C10896c> m31810b() {
        HashMap hashMap = new HashMap();
        File[] listFiles = new File(this.f29361i).getParentFile().listFiles();
        if (listFiles == null) {
            return hashMap;
        }
        for (File file : listFiles) {
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                C10896c cVar = (C10896c) hashMap.get(file.getName());
                if (cVar == null) {
                    cVar = new C10896c();
                    hashMap.put(file.getName(), cVar);
                }
                for (File file2 : listFiles2) {
                    if (!file2.isFile() && !".inactive".equals(file2.getName())) {
                        if (cVar.f29477a.size() > 200) {
                            return hashMap;
                        }
                        String name = file2.getName();
                        if (name.endsWith("--PendingDelete")) {
                            name = name.substring(0, name.indexOf("--PendingDelete"));
                        }
                        cVar.f29477a.add(new C10894a(name));
                    }
                }
                continue;
            }
        }
        return hashMap;
    }

    public final void run() {
        if (this.f29356d != null && this.f29357e != null) {
            HashMap hashMap = new HashMap();
            for (C10903d dVar : this.f29356d) {
                hashMap.put(dVar.f29508c, dVar);
            }
            this.f29358f.mo26266a((Map<String, C10903d>) hashMap);
            String str = this.f29359g.f29502a;
            C10869f.m31887a().mo26199a(str);
            if (C10869f.m31887a().f29403a) {
                this.f29358f.mo26265a((Iterable<C10903d>) this.f29356d, this.f29362j, this.f29361i);
            } else {
                this.f29358f.mo26270b((Map<String, C10903d>) hashMap, this.f29362j, this.f29361i);
            }
            C10869f.m31887a().mo26202b(str);
            String a = m31807a();
            String a2 = m31808a(this.f29356d);
            StringBuilder sb = new StringBuilder("https://");
            sb.append(this.f29339a.f29370a);
            sb.append("gecko/server/v2/package?");
            sb.append(a);
            String sb2 = sb.toString();
            new StringBuilder("check update :").append(sb2);
            try {
                String a3 = C10852a.m31828a(sb2, a2);
                C10907h hVar = (C10907h) C10848b.m31813a().f29368a.mo15975a(a3, new C6597a<C10907h<C10898b>>() {
                }.type);
                new JSONObject(a3);
                if (hVar.f29535a != 0) {
                    if (hVar.f29535a != 2000) {
                        StringBuilder sb3 = new StringBuilder("response=");
                        sb3.append(a3);
                        throw new NetworkErrorException(sb3.toString());
                    }
                }
                C10863b.m31871a(this.f29354b, ((C10898b) hVar.f29536b).f29489b, new File(this.f29361i).getParentFile());
                this.f29357e.mo26215a(this.f29356d, (List) ((C10898b) hVar.f29536b).f29488a.get(this.f29359g.f29502a), this.f29360h);
            } catch (Exception e) {
                this.f29357e.mo26212a(e);
                new StringBuilder("check update fail:").append(e.toString());
                try {
                    C10915o oVar = new C10915o(this.f29355c);
                    oVar.f29559a.f29556b.addAll(C10866c.m31876a(this.f29354b).mo26195a());
                    C10916p pVar = new C10916p(this.f29339a);
                    pVar.f29560b = oVar;
                    pVar.run();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private String m31808a(List<C10903d> list) {
        return C10848b.m31813a().f29368a.mo15979b((Object) m31809b(list));
    }

    /* renamed from: b */
    private C10893a m31809b(List<C10903d> list) {
        C10893a aVar = new C10893a();
        String a = C10867d.m31881a(this.f29354b);
        String b = C10867d.m31884b(this.f29354b);
        StringBuilder sb = new StringBuilder();
        sb.append(C10867d.m31885c(this.f29354b));
        C10897d dVar = new C10897d(this.f29359g.f29505d, this.f29359g.f29503b, this.f29359g.f29504c, a, b, sb.toString());
        aVar.f29469a = dVar;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C10903d dVar2 = (C10903d) list.get(i);
            if (dVar2 != null) {
                arrayList.add(new C10895b(dVar2.f29508c, dVar2.f29506a));
            }
        }
        aVar.mo26306a(this.f29359g.f29502a, arrayList);
        aVar.f29471c = m31810b();
        HashMap hashMap = new HashMap();
        hashMap.put(this.f29355c.mo26222b(), this.f29364l);
        aVar.f29472d = hashMap;
        return aVar;
    }

    C10844b(Context context, C10873f fVar, C10852a aVar, List<C10903d> list, C10890l lVar, C10902c cVar, boolean z, C10886h hVar, String str, String str2, Map<String, String> map, Map<String, Object> map2) {
        super(aVar);
        this.f29354b = context;
        this.f29355c = fVar;
        this.f29360h = z;
        this.f29356d = list;
        this.f29357e = hVar;
        this.f29358f = lVar;
        this.f29359g = cVar;
        this.f29361i = str2;
        this.f29362j = str;
        this.f29363k = map;
        this.f29364l = map2;
    }
}
