package com.bytedance.scene;

import android.app.Fragment;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.util.C0905l;
import com.bytedance.scene.navigation.C12646b;
import com.bytedance.scene.p642b.C12582a;
import com.bytedance.scene.p642b.C12585d;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.k */
public class C12634k extends Fragment {

    /* renamed from: a */
    public final C0905l<C12582a> f33545a = new C0905l<>();

    /* renamed from: b */
    public final C0905l<C12585d> f33546b = new C0905l<>();

    /* renamed from: c */
    public final List<C12646b> f33547c = new ArrayList();

    /* renamed from: d */
    private final Set<C12635a> f33548d = new HashSet();

    /* renamed from: com.bytedance.scene.k$a */
    public interface C12635a {
        /* renamed from: a */
        void mo30834a();
    }

    /* renamed from: a */
    static C12634k m36703a() {
        return new C12634k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31025b(C12635a aVar) {
        this.f33548d.remove(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31024a(C12635a aVar) {
        this.f33548d.add(aVar);
    }

    /* renamed from: a */
    private boolean m36704a(C0043i iVar) {
        C12699i.m36905a();
        if (C12700j.m36913a(getActivity()) && iVar.getLifecycle().mo54a() != State.DESTROYED) {
            return true;
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        for (C12635a a : new HashSet(this.f33548d)) {
            a.mo30834a();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ArrayList arrayList = new ArrayList(this.f33547c);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C12582a aVar = (C12582a) this.f33545a.mo3433a(i);
        if (aVar != null) {
            aVar.mo30856a(i2, intent);
            this.f33545a.mo3436b(i);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((C12585d) this.f33546b.mo3433a(i)) != null) {
            this.f33546b.mo3436b(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31023a(C0043i iVar, Intent intent, int i, C12582a aVar) {
        if (m36704a(iVar)) {
            if (i < 0) {
                startActivity(intent);
                return;
            }
            this.f33545a.mo3437b(i, aVar);
            startActivityForResult(intent, i);
            iVar.getLifecycle().mo55a(new SceneActivityCompatibilityLayerFragment$1(this, iVar, i));
        }
    }
}
