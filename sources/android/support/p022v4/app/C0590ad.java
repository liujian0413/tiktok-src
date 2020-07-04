package android.support.p022v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: android.support.v4.app.ad */
public final class C0590ad {

    /* renamed from: a */
    public final String f2349a;

    /* renamed from: b */
    public final CharSequence f2350b;

    /* renamed from: c */
    public final CharSequence[] f2351c;

    /* renamed from: d */
    public final boolean f2352d;

    /* renamed from: e */
    public final Bundle f2353e;

    /* renamed from: f */
    public final Set<String> f2354f;

    /* renamed from: a */
    static RemoteInput[] m2468a(C0590ad[] adVarArr) {
        if (adVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[adVarArr.length];
        for (int i = 0; i < adVarArr.length; i++) {
            remoteInputArr[i] = m2467a(adVarArr[i]);
        }
        return remoteInputArr;
    }

    /* renamed from: a */
    private static RemoteInput m2467a(C0590ad adVar) {
        return new Builder(adVar.f2349a).setLabel(adVar.f2350b).setChoices(adVar.f2351c).setAllowFreeFormInput(adVar.f2352d).addExtras(adVar.f2353e).build();
    }
}
