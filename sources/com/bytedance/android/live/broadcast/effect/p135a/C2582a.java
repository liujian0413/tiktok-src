package com.bytedance.android.live.broadcast.effect.p135a;

import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.p126b.C2419a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c;
import com.bytedance.android.live.broadcast.api.p126b.C2421c.C2422a;
import com.bytedance.android.live.broadcast.api.p126b.C2421c.C2423b;
import com.bytedance.android.live.broadcast.api.p126b.C2427e;
import com.bytedance.android.live.broadcast.effect.sticker.C2652a;
import com.bytedance.android.live.broadcast.effect.sticker.C2663f;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b;
import com.bytedance.android.live.broadcast.p132c.C2508d.C2511b.C2512a;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.C9355c;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.C18373n;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcast.effect.a.a */
public final class C2582a implements C2421c {

    /* renamed from: a */
    private C2427e f8293a;

    /* renamed from: b */
    private boolean f8294b;

    /* renamed from: c */
    private final Map<String, Map<String, C9355c>> f8295c;

    /* renamed from: d */
    private final Map<C9355c, Map<String, Float>> f8296d;

    /* renamed from: e */
    private final List<C9355c> f8297e;

    /* renamed from: f */
    private final List<C2423b> f8298f;

    /* renamed from: g */
    private final List<C2422a> f8299g;

    /* renamed from: h */
    private final Map<String, List<String>> f8300h;

    /* renamed from: i */
    private final Map<String, List<String>> f8301i;

    /* renamed from: j */
    private final Map<String, Map<String, Float>> f8302j;

    /* renamed from: k */
    private final Map<String, Map<String, Float>> f8303k;

    /* renamed from: l */
    private final Map<String, Integer> f8304l;

    /* renamed from: com.bytedance.android.live.broadcast.effect.a.a$a */
    public static final class C2584a implements C2511b<C2421c> {
        /* renamed from: a */
        public final C2512a<C2421c> mo8847a(C2512a<C2421c> aVar) {
            return aVar.mo9081a(new C2582a()).mo9080a();
        }
    }

    /* renamed from: a */
    public final Map<String, Map<String, C9355c>> mo8885a() {
        return this.f8295c;
    }

    /* renamed from: a */
    public final void mo8887a(C2423b bVar) {
        if (bVar != null && !this.f8298f.contains(bVar)) {
            this.f8298f.add(bVar);
        }
    }

    /* renamed from: a */
    public final void mo8892a(String str, C9355c cVar) {
        if (cVar != null && this.f8293a != null) {
            if (!this.f8295c.containsKey(str)) {
                this.f8295c.put(str, new HashMap());
            }
            Map map = (Map) this.f8295c.get(str);
            if (map.containsKey(cVar.f25581t)) {
                ((C9355c) map.get(cVar.f25581t)).f25572k.addAll(cVar.f25572k);
                return;
            }
            map.put(cVar.f25581t, cVar);
            if (this.f8293a.f7958b.contains(str)) {
                m10617c(str, cVar);
            }
            m10618d();
            for (C2423b a : this.f8298f) {
                a.mo8902a(true, str, cVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo8893a(String str, C9355c cVar, C9355c cVar2) {
        if (this.f8293a != null) {
            if (cVar != null && this.f8295c.containsKey(str) && ((Map) this.f8295c.get(str)).size() > 0) {
                ((Map) this.f8295c.get(str)).remove(cVar.f25581t);
                if (this.f8293a.f7958b.contains(str)) {
                    m10619d(str, cVar);
                }
                for (C2423b a : this.f8298f) {
                    a.mo8902a(false, str, cVar);
                }
            }
            if (cVar2 != null) {
                if (!this.f8295c.containsKey(str)) {
                    this.f8295c.put(str, new HashMap());
                }
                Map map = (Map) this.f8295c.get(str);
                if (map.containsKey(cVar2.f25581t)) {
                    ((C9355c) map.get(cVar2.f25581t)).f25572k.addAll(cVar2.f25572k);
                    return;
                }
                map.put(cVar2.f25581t, cVar2);
                if (this.f8293a.f7958b.contains(str)) {
                    m10617c(str, cVar2);
                }
                for (C2423b a2 : this.f8298f) {
                    a2.mo8902a(true, str, cVar2);
                }
            }
            if (!(cVar2 == null && cVar == null)) {
                m10618d();
            }
        }
    }

    /* renamed from: a */
    public final void mo8890a(EffectChannelResponse effectChannelResponse) {
        if (this.f8293a != null) {
            String str = effectChannelResponse.panel;
            if (this.f8293a.f7958b.contains(str) && this.f8301i != null && !this.f8301i.isEmpty() && this.f8301i.containsKey(str)) {
                List list = (List) this.f8301i.get(str);
                for (Effect effect : effectChannelResponse.allCategoryEffects) {
                    if (effect != null) {
                        boolean z = true;
                        if (effect.getEffectType() != 1 || C6307b.m19566a((Collection<T>) effect.getChildEffects())) {
                            z = false;
                        }
                        if (z) {
                            for (int i = 0; i < effect.getChildEffects().size(); i++) {
                                Effect effect2 = (Effect) effect.getChildEffects().get(i);
                                if (!(list == null || effect2 == null || !list.contains(effect2.getUnzipPath()))) {
                                    this.f8304l.put(effect.getEffectId(), Integer.valueOf(i));
                                }
                                m10613a(effect2, str, list);
                            }
                        } else {
                            m10613a(effect, str, list);
                        }
                    }
                }
                this.f8301i.remove(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo8891a(String str, float f) {
        if (this.f8293a != null) {
            for (C9355c cVar : this.f8297e) {
                if (!C6311g.m19573a(cVar.f25572k) && cVar.f25572k.contains(str)) {
                    if (!this.f8296d.containsKey(cVar) || !((Map) this.f8296d.get(cVar)).containsKey(str) || !((Float) ((Map) this.f8296d.get(cVar)).get(str)).equals(Float.valueOf(f))) {
                        int a = this.f8293a.f7959c.mo8879a(cVar.f25581t, str, f);
                        StringBuilder sb = new StringBuilder("updateTagValue path:");
                        sb.append(cVar.f25581t);
                        sb.append(" tag:");
                        sb.append(str);
                        sb.append(" value:");
                        sb.append(f);
                        sb.append(" return:");
                        sb.append(a);
                        C3166a.m11961b("LiveComposerManager", sb.toString());
                        C9355c cVar2 = null;
                        Iterator it = this.f8296d.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C9355c cVar3 = (C9355c) it.next();
                            if (cVar3.f25581t.equals(cVar.f25581t) && cVar3.f25572k.contains(str)) {
                                cVar2 = cVar3;
                                break;
                            }
                        }
                        if (cVar2 == null) {
                            this.f8296d.put(cVar, new HashMap());
                            Map map = (Map) this.f8296d.get(cVar);
                            if (map != null) {
                                map.put(str, Float.valueOf(f));
                            }
                        } else {
                            Map map2 = (Map) this.f8296d.get(cVar2);
                            if (map2 != null) {
                                map2.put(str, Float.valueOf(f));
                            }
                        }
                        String str2 = "";
                        Iterator it2 = this.f8295c.keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            String str3 = (String) it2.next();
                            if (((Map) this.f8295c.get(str3)).containsValue(cVar2 != null ? cVar2 : cVar)) {
                                str2 = str3;
                                break;
                            }
                        }
                        m10614a(str2, cVar, str, f);
                        if (!this.f8299g.isEmpty()) {
                            for (C2422a aVar : this.f8299g) {
                                if (aVar != null) {
                                    aVar.mo8901a(str2, cVar, str, f);
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo8889a(C9355c cVar, String str, float f, boolean z) {
        if (this.f8293a != null && !C6311g.m19573a(cVar.f25572k) && cVar.f25572k.contains(str) && (z || !this.f8296d.containsKey(cVar) || !((Map) this.f8296d.get(cVar)).containsKey(str) || !((Float) ((Map) this.f8296d.get(cVar)).get(str)).equals(Float.valueOf(f)))) {
            int a = this.f8293a.f7959c.mo8879a(cVar.f25581t, str, f);
            StringBuilder sb = new StringBuilder("updateTagValue path:");
            sb.append(cVar.f25581t);
            sb.append(" tag:");
            sb.append(str);
            sb.append(" value:");
            sb.append(f);
            sb.append(" return:");
            sb.append(a);
            C3166a.m11961b("LiveComposerManager", sb.toString());
            C9355c cVar2 = null;
            Iterator it = this.f8296d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C9355c cVar3 = (C9355c) it.next();
                if (cVar3.f25581t.equals(cVar.f25581t) && cVar3.f25572k.contains(str)) {
                    cVar2 = cVar3;
                    break;
                }
            }
            if (cVar2 == null) {
                this.f8296d.put(cVar, new HashMap());
                Map map = (Map) this.f8296d.get(cVar);
                if (map != null) {
                    map.put(str, Float.valueOf(f));
                }
            } else {
                Map map2 = (Map) this.f8296d.get(cVar2);
                if (map2 != null) {
                    map2.put(str, Float.valueOf(f));
                }
            }
            String str2 = "";
            Iterator it2 = this.f8295c.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str3 = (String) it2.next();
                if (((Map) this.f8295c.get(str3)).containsValue(cVar2 != null ? cVar2 : cVar)) {
                    str2 = str3;
                    break;
                }
            }
            m10614a(str2, cVar, str, f);
            if (!this.f8299g.isEmpty()) {
                for (C2422a aVar : this.f8299g) {
                    if (aVar != null) {
                        aVar.mo8901a(str2, cVar, str, f);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m10618d() {
        m10615a(false);
    }

    private C2582a() {
        this.f8296d = new HashMap();
        this.f8302j = new HashMap();
        this.f8298f = new ArrayList();
        this.f8301i = (Map) C8946b.f24419ar.mo22117a();
        this.f8303k = (Map) C8946b.f24420as.mo22117a();
        this.f8300h = new HashMap();
        this.f8295c = new HashMap();
        this.f8297e = new ArrayList();
        this.f8299g = new ArrayList();
        this.f8304l = new HashMap();
    }

    /* renamed from: b */
    public final void mo8894b() {
        this.f8294b = true;
        this.f8297e.clear();
        m10618d();
        HashMap hashMap = new HashMap(this.f8296d);
        this.f8296d.clear();
        for (Map map : hashMap.values()) {
            if (!(map == null || map.size() == 0)) {
                for (String str : map.keySet()) {
                    if (map.get(str) != null) {
                        mo8891a(str, ((Float) map.get(str)).floatValue());
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8900c() {
        if (!this.f8301i.isEmpty()) {
            this.f8300h.putAll(this.f8301i);
        }
        this.f8294b = true;
        C8946b.f24419ar.mo22118a(this.f8300h);
        C8946b.f24420as.mo22118a(this.f8302j);
        if (!(this.f8293a == null || this.f8293a.f7959c == null)) {
            try {
                this.f8293a.f7959c.mo8882a(new String[0]);
                this.f8293a.f7959c.mo8878a();
            } catch (Throwable th) {
                C3166a.m11963b("LiveComposerManager", th);
            }
        }
        this.f8301i.clear();
        this.f8301i.putAll(this.f8300h);
        this.f8303k.clear();
        this.f8303k.putAll(this.f8302j);
        this.f8295c.clear();
        this.f8298f.clear();
        this.f8299g.clear();
        this.f8300h.clear();
        this.f8297e.clear();
        this.f8296d.clear();
        this.f8302j.clear();
        this.f8293a = null;
    }

    /* renamed from: a */
    public final void mo8888a(C2427e eVar) {
        this.f8293a = eVar;
        this.f8294b = true;
    }

    /* renamed from: b */
    public final void mo8895b(C2422a aVar) {
        if (aVar != null) {
            this.f8299g.remove(aVar);
        }
    }

    /* renamed from: a */
    public final Integer mo8883a(Effect effect) {
        if (effect != null) {
            Integer num = (Integer) this.f8304l.get(effect.getEffectId());
            if (num != null) {
                this.f8304l.remove(effect.getEffectId());
                return num;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo8896b(C2423b bVar) {
        if (bVar != null) {
            this.f8298f.remove(bVar);
        }
    }

    /* renamed from: c */
    public final Float mo8899c(String str) {
        for (Map map : this.f8296d.values()) {
            if (map != null && map.containsKey(str)) {
                return (Float) map.get(str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo8897b(String str) {
        if (this.f8295c.containsKey(str) && ((Map) this.f8295c.get(str)).size() > 0) {
            for (C9355c d : ((Map) this.f8295c.get(str)).values()) {
                m10619d(str, d);
            }
            this.f8295c.remove(str);
            m10618d();
            for (C2423b a : this.f8298f) {
                a.mo8902a(false, str, null);
            }
        }
    }

    /* renamed from: a */
    private void m10615a(boolean z) {
        if (this.f8293a != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C2419a aVar : this.f8293a.f7957a) {
                if (this.f8295c.containsKey(aVar.f7955b) && m10616a((List<Integer>) arrayList2, aVar.f7954a)) {
                    if (arrayList2.isEmpty()) {
                        arrayList2.addAll(aVar.f7954a);
                    } else {
                        arrayList2.retainAll(aVar.f7954a);
                    }
                    if (this.f8293a.f7960d.contains(aVar.f7955b)) {
                        z2 = true;
                    }
                    arrayList.addAll(((Map) this.f8295c.get(aVar.f7955b)).values());
                }
            }
            if (!this.f8297e.containsAll(arrayList) || !arrayList.containsAll(this.f8297e)) {
                this.f8297e.clear();
                this.f8297e.addAll(arrayList);
                if (this.f8294b) {
                    int a = this.f8293a.f7959c.mo8880a(LiveCameraResManager.INST.getLiveComposerFilePath(), z2);
                    StringBuilder sb = new StringBuilder("show sticker: ");
                    sb.append(LiveCameraResManager.INST.getLiveComposerFilePath());
                    sb.append(" return: ");
                    sb.append(a);
                    C3166a.m11961b("LiveComposerManager", sb.toString());
                    this.f8294b = false;
                }
                this.f8293a.f7959c.mo8881a(z2);
                String[] a2 = C2652a.m10809a(arrayList);
                int a3 = this.f8293a.f7959c.mo8882a(a2);
                StringBuilder sb2 = new StringBuilder("show sticker composer: ");
                sb2.append(Arrays.toString(a2));
                sb2.append(" return: ");
                sb2.append(a3);
                C3166a.m11961b("LiveComposerManager", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final List<C9355c> mo8884a(String str) {
        if (this.f8295c.containsKey(str)) {
            return new ArrayList(((Map) this.f8295c.get(str)).values());
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo8886a(C2422a aVar) {
        if (aVar != null && !this.f8299g.contains(aVar)) {
            this.f8299g.add(aVar);
        }
    }

    /* renamed from: a */
    private static boolean m10616a(List<Integer> list, List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        for (Integer contains : list) {
            if (list2.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private void m10619d(String str, C9355c cVar) {
        if (this.f8300h.containsKey(str) && cVar != null && !C6319n.m19593a(cVar.f25581t)) {
            ((List) this.f8300h.get(str)).remove(cVar.f25581t);
        }
    }

    /* renamed from: c */
    private void m10617c(String str, C9355c cVar) {
        if (this.f8293a != null && cVar != null) {
            if (!this.f8300h.containsKey(str)) {
                this.f8300h.put(str, new ArrayList());
            }
            if (!((List) this.f8300h.get(str)).contains(cVar.f25581t) && !C6319n.m19593a(cVar.f25581t) && this.f8293a.f7958b.contains(str)) {
                ((List) this.f8300h.get(str)).add(cVar.f25581t);
            }
        }
    }

    /* renamed from: b */
    public final void mo8898b(String str, C9355c cVar) {
        if (this.f8293a != null && this.f8295c.containsKey(str) && ((Map) this.f8295c.get(str)).size() > 0) {
            ((Map) this.f8295c.get(str)).remove(cVar.f25581t);
            if (this.f8293a.f7958b.contains(str)) {
                m10619d(str, cVar);
            }
            m10618d();
            for (C2423b a : this.f8298f) {
                a.mo8902a(false, str, cVar);
            }
        }
    }

    /* renamed from: a */
    private void m10613a(Effect effect, String str, List<String> list) {
        Float f;
        if (effect != null && list.contains(effect.getUnzipPath())) {
            try {
                C6711m m = new C18373n().mo47346a(effect.getExtra()).mo16136m();
                if (m.mo16148a("ab_group") && ((Integer) LiveSettingKeys.LIVE_SMALL_BEAUTY_AB_GROUP.mo10240a()).intValue() != m.mo16149b("ab_group").mo16003g()) {
                    return;
                }
            } catch (Exception e) {
                C3166a.m11963b("LiveComposerManager", (Throwable) e);
            }
            if (this.f8303k.containsKey(effect.getUnzipPath())) {
                C9355c a = C2663f.m10852a(effect);
                Map map = (Map) this.f8303k.get(effect.getUnzipPath());
                a.f25572k.addAll(map.keySet());
                mo8892a(str, a);
                for (Object next : map.keySet()) {
                    if (!this.f8302j.containsKey(effect.getUnzipPath()) || !((Map) this.f8302j.get(effect.getUnzipPath())).containsKey(next)) {
                        String str2 = (String) next;
                        if (effect.getExtra().contains(str2)) {
                            a.f25572k.add(str2);
                            Object obj = map.get(next);
                            if (obj instanceof Double) {
                                f = Float.valueOf(((Double) obj).floatValue());
                            } else {
                                f = (Float) obj;
                            }
                            mo8891a(str2, f.floatValue());
                        }
                    }
                }
                return;
            }
            mo8892a(str, C2663f.m10852a(effect));
        }
    }

    /* renamed from: a */
    private void m10614a(String str, C9355c cVar, String str2, float f) {
        if (this.f8300h.containsKey(str) && ((List) this.f8300h.get(str)).contains(cVar.f25581t)) {
            if (!this.f8302j.containsKey(cVar.f25581t)) {
                this.f8302j.put(cVar.f25581t, new HashMap());
            }
            ((Map) this.f8302j.get(cVar.f25581t)).put(str2, Float.valueOf(f));
        }
    }
}
