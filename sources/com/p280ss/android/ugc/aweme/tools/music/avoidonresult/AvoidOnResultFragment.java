package com.p280ss.android.ugc.aweme.tools.music.avoidonresult;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.tools.music.avoidonresult.C42434a.C42435a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.tools.music.avoidonresult.AvoidOnResultFragment */
public final class AvoidOnResultFragment extends Fragment {

    /* renamed from: a */
    private final HashMap<Integer, List<C42435a>> f110330a = new HashMap<>();

    /* renamed from: b */
    private HashMap f110331b;

    /* renamed from: a */
    private void m134885a() {
        if (this.f110331b != null) {
            this.f110331b.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m134885a();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final void onDestroy() {
        super.onDestroy();
        Set<Integer> keySet = this.f110330a.keySet();
        C7573i.m23582a((Object) keySet, "mCallbacks.keys");
        for (Integer remove : keySet) {
            this.f110330a.remove(remove);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mRetainInstance = true;
    }

    /* renamed from: a */
    private final C42435a m134884a(int i) {
        List list = (List) this.f110330a.get(Integer.valueOf(i));
        if (list == null || list.isEmpty()) {
            this.f110330a.remove(Integer.valueOf(i));
            return null;
        }
        C42435a aVar = (C42435a) list.remove(list.size() - 1);
        if (list.isEmpty()) {
            this.f110330a.remove(Integer.valueOf(i));
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m134886a(int i, C42435a aVar) {
        List list = (List) this.f110330a.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList();
        }
        list.add(list.size(), aVar);
        this.f110330a.put(Integer.valueOf(i), list);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C42435a a = m134884a(i);
        if (a != null) {
            a.mo103870a(i2, intent);
        }
    }

    /* renamed from: a */
    public final void mo103946a(int i, C7562b<? super Fragment, C7581n> bVar, C42435a aVar) {
        C7573i.m23587b(bVar, "runnable");
        C7573i.m23587b(aVar, "callback");
        m134886a(i, aVar);
        bVar.invoke(this);
    }
}
