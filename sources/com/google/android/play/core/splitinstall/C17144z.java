package com.google.android.play.core.splitinstall;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender.SendIntentException;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.p275b.C6506a;
import com.google.android.play.core.tasks.C17147c;
import com.google.android.play.core.tasks.C17150e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.z */
final class C17144z implements C17133c {

    /* renamed from: a */
    private final C17125ab f47867a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6575x f47868b;

    /* renamed from: c */
    private final C6572u f47869c;

    /* renamed from: d */
    private final Handler f47870d;

    C17144z(C17125ab abVar, Context context) {
        this(abVar, context, context.getPackageName());
    }

    private C17144z(C17125ab abVar, Context context, String str) {
        this.f47870d = new Handler(Looper.getMainLooper());
        this.f47869c = new C6572u(context, str);
        this.f47867a = abVar;
        this.f47868b = C6575x.m20415a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static List<String> m56817c(List<Locale> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Locale locale : list) {
            if (VERSION.SDK_INT >= 21) {
                arrayList.add(locale.toLanguageTag());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C17147c<Void> mo44400a(int i) {
        return this.f47867a.mo44398b(i);
    }

    /* renamed from: a */
    public final C17147c<Integer> mo44401a(C17135e eVar) {
        boolean z;
        if (!eVar.f47858b.isEmpty() && VERSION.SDK_INT < 21) {
            return C17150e.m56835a((Exception) new SplitInstallException(-5));
        }
        if (mo44407b().containsAll(eVar.f47857a)) {
            List<Locale> list = eVar.f47858b;
            Set b = this.f47869c.mo15935b();
            if (b == null) {
                z = true;
            } else {
                HashSet hashSet = new HashSet();
                for (Locale language : list) {
                    hashSet.add(language.getLanguage());
                }
                z = b.containsAll(hashSet);
            }
            if (z) {
                this.f47870d.post(new C17143y(this, eVar));
                return C17150e.m56836a(Integer.valueOf(0));
            }
        }
        return this.f47867a.mo44396a(eVar.f47857a, m56817c(eVar.f47858b));
    }

    /* renamed from: a */
    public final C17147c<Void> mo44402a(List<String> list) {
        return this.f47867a.mo44397a(list);
    }

    /* renamed from: a */
    public final Set<String> mo44403a() {
        Set<String> b = this.f47869c.mo15935b();
        return b == null ? Collections.emptySet() : b;
    }

    /* renamed from: a */
    public final synchronized void mo44404a(C17137g gVar) {
        this.f47868b.mo15873a((C6506a<StateT>) gVar);
    }

    /* renamed from: a */
    public final boolean mo44405a(C6563f fVar, Activity activity, int i) throws SendIntentException {
        if (fVar.f18875b != 8 || fVar.f18879f == null) {
            return false;
        }
        activity.startIntentSenderForResult(fVar.f18879f.getIntentSender(), i, null, 0, 0, 0);
        return true;
    }

    /* renamed from: b */
    public final C17147c<C6563f> mo44406b(int i) {
        return this.f47867a.mo44395a(i);
    }

    /* renamed from: b */
    public final Set<String> mo44407b() {
        return this.f47869c.mo15934a();
    }

    /* renamed from: b */
    public final synchronized void mo44408b(C17137g gVar) {
        this.f47868b.mo15876b(gVar);
    }
}
