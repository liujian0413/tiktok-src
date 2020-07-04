package com.p280ss.android.ugc.aweme.emoji.p1207e;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.ArrayMap;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1202b.p1204b.C27507a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.emoji.e.a */
public class C27554a implements C27564h {

    /* renamed from: d */
    private static C27554a f72621d;

    /* renamed from: a */
    public LinkedHashMap<Resources, List<Emoji>> f72622a;

    /* renamed from: b */
    private Map<String, String> f72623b;

    /* renamed from: c */
    private Map<String, String> f72624c;

    /* renamed from: e */
    private List<C27564h> f72625e = new ArrayList();

    /* renamed from: a */
    public final void mo70781a(C27564h hVar) {
        if (!this.f72625e.contains(hVar)) {
            this.f72625e.add(hVar);
        }
    }

    /* renamed from: a */
    public final boolean mo70784a(long j) {
        Resources resources = new Resources();
        resources.setId(j);
        return m90299a(resources);
    }

    /* renamed from: a */
    public final void mo70783a(LinkedHashMap<Resources, List<Emoji>> linkedHashMap) {
        if (linkedHashMap != null) {
            this.f72622a = linkedHashMap;
        }
        C1592h.m7855a((Callable<TResult>) new C27555b<TResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27556c<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo70782a(Resources resources, List<Emoji> list) {
        if (list == null || list.size() <= 0) {
            for (C27564h a : this.f72625e) {
                a.mo70782a(resources, list);
            }
            return;
        }
        this.f72622a.put(resources, list);
        C1592h.m7855a((Callable<TResult>) new C27557d<TResult>(this), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C27558e<TResult,TContinuationResult>(this, resources, list), C1592h.f5958b);
    }

    /* renamed from: b */
    public static boolean m90301b() {
        return C27559f.m90317b().f72643a;
    }

    /* renamed from: c */
    public static void m90302c() {
        C27559f.m90317b().mo70791a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ Void mo70787e() throws Exception {
        m90303g();
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Void mo70788f() throws Exception {
        m90303g();
        return null;
    }

    private C27554a() {
        C27559f.m90317b().mo70792a((C27564h) this);
    }

    /* renamed from: a */
    public static C27554a m90296a() {
        if (f72621d == null) {
            synchronized (C27554a.class) {
                if (f72621d == null) {
                    f72621d = new C27554a();
                }
            }
        }
        return f72621d;
    }

    /* renamed from: d */
    public final boolean mo70786d() {
        if (this.f72622a == null || this.f72622a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private int m90304h() {
        int i = 0;
        if (this.f72622a == null) {
            return 0;
        }
        for (List size : this.f72622a.values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: g */
    private void m90303g() {
        if (this.f72623b != null) {
            this.f72623b.clear();
        }
        if (this.f72624c != null) {
            this.f72624c.clear();
        }
        int h = m90304h();
        if (VERSION.SDK_INT >= 19) {
            this.f72623b = new ArrayMap(h);
            this.f72624c = new ArrayMap(h);
        } else {
            this.f72623b = new HashMap(h);
            this.f72624c = new HashMap(h);
        }
        int i = 0;
        for (List<Emoji> list : this.f72622a.values()) {
            if (list != null) {
                for (Emoji emoji : list) {
                    String a = C27507a.m90160a(emoji);
                    if (TextUtils.isEmpty(a)) {
                        a = emoji.getDisplayName();
                    }
                    String str = (String) this.f72623b.get(a);
                    if (TextUtils.isEmpty(str)) {
                        this.f72623b.put(a, String.valueOf(i));
                    } else {
                        Map<String, String> map = this.f72623b;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(",");
                        sb.append(i);
                        map.put(a, sb.toString());
                    }
                    String displayName = emoji.getDisplayName();
                    String str2 = (String) this.f72624c.get(displayName);
                    if (TextUtils.isEmpty(str2)) {
                        this.f72624c.put(displayName, String.valueOf(i));
                    } else {
                        Map<String, String> map2 = this.f72624c;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(",");
                        sb2.append(i);
                        map2.put(displayName, sb2.toString());
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70785b(C27564h hVar) {
        this.f72625e.remove(hVar);
    }

    /* renamed from: a */
    private Emoji m90297a(int i) {
        int i2 = 0;
        for (List list : this.f72622a.values()) {
            if (list.size() + i2 > i) {
                return (Emoji) list.get(i - i2);
            }
            i2 += list.size();
        }
        return null;
    }

    /* renamed from: a */
    private boolean m90299a(Resources resources) {
        if (this.f72622a == null) {
            return false;
        }
        return new ArrayList(this.f72622a.keySet()).contains(resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70778a(C1592h hVar) throws Exception {
        for (C27564h a : this.f72625e) {
            a.mo70783a(this.f72622a);
        }
        return null;
    }

    /* renamed from: a */
    public final List<Emoji> mo70780a(String str) {
        if (this.f72623b == null || this.f72623b.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        List<Emoji> a = m90298a(this.f72624c, str);
        if (a == null) {
            a = m90298a(this.f72623b, str);
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m90300a(Resources resources, boolean z) {
        return C27559f.m90317b().mo70800b(resources, true);
    }

    /* renamed from: a */
    private List<Emoji> m90298a(Map<String, String> map, String str) {
        if (map == null) {
            return null;
        }
        String str2 = (String) map.get(str);
        if (str2 == null || TextUtils.isEmpty(str2)) {
            return null;
        }
        String[] split = str2.split(",");
        ArrayList arrayList = new ArrayList();
        for (String parseInt : split) {
            Emoji a = m90297a(Integer.parseInt(parseInt));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo70779a(Resources resources, List list, C1592h hVar) throws Exception {
        for (C27564h a : this.f72625e) {
            a.mo70782a(resources, list);
        }
        return null;
    }
}
