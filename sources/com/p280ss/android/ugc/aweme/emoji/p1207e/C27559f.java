package com.p280ss.android.ugc.aweme.emoji.p1207e;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.utils.C27635f;
import com.p280ss.android.ugc.aweme.emoji.utils.C27641j;
import com.p280ss.android.ugc.aweme.emoji.utils.C27645l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.f */
public class C27559f extends C27568l implements C27564h {

    /* renamed from: c */
    private static volatile C27559f f72632c;

    /* renamed from: b */
    private List<C27564h> f72633b = new ArrayList();

    /* renamed from: a */
    public final void mo70791a() {
        mo70799a("STICKER");
    }

    /* renamed from: b */
    public static C27559f m90317b() {
        if (f72632c == null) {
            synchronized (C27559f.class) {
                if (f72632c == null) {
                    f72632c = new C27559f();
                }
            }
        }
        return f72632c;
    }

    /* renamed from: a */
    public final void mo70792a(C27564h hVar) {
        if (!this.f72633b.contains(hVar)) {
            this.f72633b.add(hVar);
        }
    }

    /* renamed from: a */
    public static List<List<Emoji>> m90316a(List<Resources> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            for (Resources c : list) {
                arrayList.add(m90318c(c));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static List<Emoji> m90318c(Resources resources) {
        JSONObject jSONObject;
        StringBuilder sb = new StringBuilder();
        sb.append(C27641j.m90630c(resources));
        sb.append("/info.json");
        String a = C27635f.m90604a(new File(sb.toString()));
        ArrayList arrayList = new ArrayList();
        if (C6319n.m19593a(a)) {
            return arrayList;
        }
        try {
            JSONArray jSONArray = new JSONObject(a).getJSONArray("stickers");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        Emoji emoji = new Emoji();
                        emoji.setAnimateType(jSONObject2.getString("animate_type"));
                        emoji.setDisplayName(jSONObject2.getString("display_name"));
                        emoji.setId(jSONObject2.getLong("id"));
                        emoji.setWidth(jSONObject2.getInt("width"));
                        emoji.setHeight(jSONObject2.getInt("height"));
                        String string = jSONObject2.getString("static_url");
                        String string2 = jSONObject2.getString("animate_url");
                        emoji.setStaticUrl(C27645l.m90635a(string, emoji.getWidth(), emoji.getHeight()));
                        emoji.setStaticType(jSONObject2.getString("static_type"));
                        emoji.setAnimateUrl(C27645l.m90635a(string2, emoji.getWidth(), emoji.getHeight()));
                        emoji.setVersion(resources.getVersion());
                        emoji.setResourcesId(resources.getId());
                        try {
                            jSONObject = jSONObject2.getJSONObject("display_name_lang");
                        } catch (JSONException unused) {
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            if (jSONObject.keys() != null) {
                                HashMap hashMap = new HashMap();
                                Iterator keys = jSONObject.keys();
                                while (keys.hasNext()) {
                                    String str = (String) keys.next();
                                    hashMap.put(str, jSONObject.getString(str));
                                }
                                emoji.setDisplayNameLangs(hashMap);
                            }
                        }
                        arrayList.add(emoji);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo70783a(LinkedHashMap<Resources, List<Emoji>> linkedHashMap) {
        for (C27564h a : this.f72633b) {
            a.mo70783a(linkedHashMap);
        }
    }

    /* renamed from: a */
    public final void mo70782a(Resources resources, List<Emoji> list) {
        for (C27564h a : this.f72633b) {
            a.mo70782a(resources, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70793a(final Resources resources, boolean z) {
        final List list;
        if (z) {
            list = m90318c(resources);
        } else {
            list = null;
        }
        C6726a.m20844b(new Runnable() {
            public final void run() {
                C27559f.this.mo70782a(resources, list);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70794a(String str, final List<Resources> list) {
        C1592h.m7855a((Callable<TResult>) new Callable<LinkedHashMap<Resources, List<Emoji>>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public LinkedHashMap<Resources, List<Emoji>> call() throws Exception {
                List a = C27559f.m90316a(list);
                LinkedHashMap<Resources, List<Emoji>> linkedHashMap = new LinkedHashMap<>(a.size());
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    linkedHashMap.put(list.get(i), a.get(i));
                }
                return linkedHashMap;
            }
        }, (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<LinkedHashMap<Resources, List<Emoji>>, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<LinkedHashMap<Resources, List<Emoji>>> hVar) throws Exception {
                LinkedHashMap linkedHashMap = (LinkedHashMap) hVar.mo6890e();
                if (linkedHashMap == null || linkedHashMap.size() == 0) {
                    C27559f.this.f72643a = true;
                } else {
                    C27559f.this.f72643a = false;
                }
                C27559f.this.mo70783a((LinkedHashMap) hVar.mo6890e());
                return null;
            }
        }, C1592h.f5958b);
    }
}
