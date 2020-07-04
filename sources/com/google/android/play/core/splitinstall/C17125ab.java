package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.play.core.internal.C17097af;
import com.google.android.play.core.internal.C17112bc;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.internal.C17116bg;
import com.google.android.play.core.internal.C6525f;
import com.google.android.play.core.tasks.C17147c;
import com.google.android.play.core.tasks.C17157l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ab */
final class C17125ab {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6525f f47838b = new C6525f("SplitInstallService");

    /* renamed from: c */
    private static final Intent f47839c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    final C17112bc<C17097af> f47840a;

    /* renamed from: d */
    private final Context f47841d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final String f47842e;

    /* renamed from: f */
    private final C17116bg f47843f;

    public C17125ab(Context context) {
        this(context, context.getPackageName());
    }

    private C17125ab(Context context, String str) {
        this.f47843f = new C17138h(this);
        this.f47841d = context;
        this.f47842e = str;
        C17112bc bcVar = new C17112bc(context.getApplicationContext(), f47838b, "SplitInstallService", f47839c, C17124aa.f47837a, this.f47843f);
        this.f47840a = bcVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static ArrayList<Bundle> m56766c(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static Bundle m56767d() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10500);
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static ArrayList<Bundle> m56768d(Collection<String> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        for (String str : collection) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C17147c<C6563f> mo44395a(int i) {
        f47838b.mo15889a("getSessionState(%d)", Integer.valueOf(i));
        C17157l lVar = new C17157l();
        this.f47840a.mo44387a((C17113bd) new C17128ae(this, lVar, i, lVar));
        return lVar.f47887a;
    }

    /* renamed from: a */
    public final C17147c<Integer> mo44396a(Collection<String> collection, Collection<String> collection2) {
        f47838b.mo15889a("startInstall(%s,%s)", collection, collection2);
        C17157l lVar = new C17157l();
        C17112bc<C17097af> bcVar = this.f47840a;
        C17126ac acVar = new C17126ac(this, lVar, collection, collection2, lVar);
        bcVar.mo44387a((C17113bd) acVar);
        return lVar.f47887a;
    }

    /* renamed from: a */
    public final C17147c<Void> mo44397a(List<String> list) {
        f47838b.mo15889a("deferredInstall(%s)", list);
        C17157l lVar = new C17157l();
        this.f47840a.mo44387a((C17113bd) new C17127ad(this, lVar, list, lVar));
        return lVar.f47887a;
    }

    /* renamed from: b */
    public final C17147c<Void> mo44398b(int i) {
        f47838b.mo15889a("cancelInstall(%d)", Integer.valueOf(i));
        C17157l lVar = new C17157l();
        this.f47840a.mo44387a((C17113bd) new C17129af(this, lVar, i, lVar));
        return lVar.f47887a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo44399c() {
        f47838b.mo15889a("onBinderDied", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", -1);
        bundle.putInt("status", 6);
        bundle.putInt("error_code", -9);
        Intent intent = new Intent();
        intent.setPackage(this.f47842e);
        intent.setAction("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.putExtra("session_state", bundle);
        intent.addFlags(1073741824);
        if (VERSION.SDK_INT >= 26) {
            intent.addFlags(2097152);
        }
        this.f47841d.sendBroadcast(intent);
    }
}
