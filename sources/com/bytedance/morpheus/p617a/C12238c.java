package com.bytedance.morpheus.p617a;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;
import android.os.Handler;
import android.support.p022v4.p027os.C0878a;
import com.bytedance.morpheus.C12248b;
import com.bytedance.morpheus.C12249c;
import com.bytedance.morpheus.C12253e;
import com.bytedance.morpheus.core.C12250a;
import com.google.android.play.core.splitinstall.C17123a;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17134d;
import com.google.android.play.core.splitinstall.C17135e;
import com.google.android.play.core.splitinstall.C17137g;
import com.google.android.play.core.splitinstall.C6563f;
import com.google.android.play.core.tasks.C17145a;
import com.google.android.play.core.tasks.C17146b;
import com.google.android.play.core.tasks.C17147c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.morpheus.a.c */
public class C12238c implements C12248b {

    /* renamed from: c */
    private static volatile C12238c f32543c;

    /* renamed from: a */
    List<C17137g> f32544a = new CopyOnWriteArrayList();

    /* renamed from: b */
    C17133c f32545b = C17134d.m56791a(C12249c.m35630a());

    /* renamed from: d */
    private final C17137g f32546d = new C17137g() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo15871a(final C6563f fVar) {
            if (fVar.f18875b == 5 && C0878a.m3740a()) {
                C17123a.m56758a(C12249c.m35630a());
                new Handler().post(new Runnable() {
                    public final void run() {
                        C12249c.m35630a().getAssets();
                    }
                });
            }
            new Handler().post(new Runnable() {
                public final void run() {
                    C12238c.m35605a(fVar);
                }
            });
            for (C17137g a : C12238c.this.f32544a) {
                a.mo15871a(fVar);
            }
        }
    };

    /* renamed from: a */
    public final Map<String, C12250a> mo29997a() {
        return C12253e.m35640a().f32577b;
    }

    /* renamed from: b */
    public static C12238c m35606b() {
        if (f32543c == null) {
            synchronized (C12238c.class) {
                if (f32543c == null) {
                    f32543c = new C12238c();
                }
            }
        }
        return f32543c;
    }

    private C12238c() {
        this.f32545b.mo44404a(this.f32546d);
        m35607c();
    }

    /* renamed from: c */
    private void m35607c() {
        HashMap hashMap = new HashMap();
        Set b = this.f32545b.mo44407b();
        try {
            JSONArray jSONArray = new JSONArray(C12245d.m35619a(C12249c.m35630a(), "plugins.json"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("packageName");
                    String optString2 = optJSONObject.optString("aabName");
                    if (optString2 == null) {
                        optString2 = optString;
                    }
                    C12246e.m35620a().mo30005a(optString, optString2);
                    if (b.contains(optString2)) {
                        hashMap.put(optString, new C12250a(optString, C12249c.m35634b().mo29994b(), 5));
                    } else {
                        int a = C12247f.m35624a().mo30007a(optString);
                        if (a == -1) {
                            hashMap.put(optString, new C12250a(optString, C12249c.m35634b().mo29994b(), 0));
                        } else {
                            C17147c b2 = this.f32545b.mo44406b(a);
                            if (!b2.mo44418a()) {
                                hashMap.put(optString, new C12250a(optString, C12249c.m35634b().mo29994b(), 0));
                            } else {
                                hashMap.put(optString, m35604a(optString, (C6563f) b2.mo44420c()));
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        C12253e.m35640a().mo30014a((Map<String, C12250a>) hashMap);
    }

    /* renamed from: b */
    public final C12250a mo30000b(String str) {
        return C12253e.m35640a().mo30011a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo30001c(final String str) {
        this.f32545b.mo44402a(Arrays.asList(new String[]{str})).mo44416a((C17145a) new C17145a() {
            /* renamed from: a */
            public final void mo24985a(Exception exc) {
                C12250a aVar = new C12250a(str, C12249c.m35634b().mo29994b(), 6);
                aVar.f32572g = -100;
                aVar.f32574i = exc;
                C12253e.m35640a().mo30012a(aVar);
            }
        });
    }

    /* renamed from: a */
    public static void m35605a(C6563f fVar) {
        for (String b : fVar.mo15926a()) {
            String b2 = C12246e.m35620a().mo30006b(b);
            C12253e.m35640a().mo30012a(m35604a(b2, fVar));
            C12237b.m35601a().mo29996a(b2, fVar);
        }
    }

    /* renamed from: a */
    public final void mo29998a(final String str) {
        this.f32545b.mo44401a(C17135e.m56792a().mo44410a(C12246e.m35620a().mo30004a(str)).mo44412a()).mo44417a((C17146b<? super TResult>) new C17146b<Integer>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo24986a(Integer num) {
                C12247f.m35624a().mo30008a(str, num.intValue());
            }
        }).mo44416a((C17145a) new C17145a() {
            /* renamed from: a */
            public final void mo24985a(Exception exc) {
                C12250a aVar = new C12250a(str, C12249c.m35634b().mo29994b(), 6);
                aVar.f32572g = -100;
                aVar.f32574i = exc;
                C12253e.m35640a().mo30012a(aVar);
            }
        });
    }

    /* renamed from: a */
    private static C12250a m35604a(String str, C6563f fVar) {
        C12250a aVar = new C12250a(str, C12249c.m35634b().mo29994b(), fVar.f18875b);
        aVar.f32569d = fVar.f18878e;
        aVar.f32570e = fVar.f18877d;
        aVar.f32573h = fVar.f18879f;
        aVar.f32572g = fVar.f18876c;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo29999a(C12250a aVar, Activity activity, int i) throws SendIntentException {
        C6563f a = C12237b.m35601a().mo29995a(aVar.f32566a);
        if (a == null) {
            return false;
        }
        return this.f32545b.mo44405a(a, activity, i);
    }
}
