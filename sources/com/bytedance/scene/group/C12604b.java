package com.bytedance.scene.group;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.C1642a;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.C12672q;
import com.bytedance.scene.State;
import com.bytedance.scene.p639a.C12562b;
import com.bytedance.scene.p642b.C12584c;
import com.bytedance.scene.utlity.C12696f;
import com.bytedance.scene.utlity.C12699i;
import com.bytedance.scene.utlity.C12700j;
import com.bytedance.scene.utlity.SceneInstanceUtility;
import com.bytedance.scene.utlity.SceneInternalException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.group.b */
public abstract class C12604b extends C12629j implements C12672q {

    /* renamed from: l */
    private static final C12562b f33449l = new C12562b() {
    };

    /* renamed from: i */
    public final C12606c f33450i = new C12606c(this);

    /* renamed from: j */
    private final List<C12696f<C12584c, Boolean>> f33451j = new ArrayList();

    /* renamed from: k */
    private boolean f33452k = true;

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public void mo30922I() {
    }

    /* renamed from: b */
    public abstract ViewGroup mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void bT_() {
        this.f33452k = false;
    }

    /* renamed from: l */
    public final void mo30955l() {
        super.mo30955l();
    }

    /* renamed from: m */
    public final void mo30956m() {
        super.mo30956m();
    }

    /* renamed from: n */
    public final void mo30957n() {
        super.mo30957n();
    }

    /* renamed from: r */
    public final boolean mo30958r() {
        return this.f33452k;
    }

    /* renamed from: a */
    public final void mo30930a(C12629j jVar) {
        super.mo30930a(jVar);
        if (jVar == null) {
            return;
        }
        if (jVar instanceof C12672q) {
            if (!((C12672q) jVar).mo30958r()) {
                bT_();
            }
            return;
        }
        StringBuilder sb = new StringBuilder("unknown parent Scene type ");
        sb.append(jVar.getClass());
        throw new SceneInternalException(sb.toString());
    }

    /* renamed from: a */
    public final void mo30928a(Bundle bundle, ViewGroup viewGroup) {
        super.mo30928a(bundle, viewGroup);
        if (this.f33523b instanceof ViewGroup) {
            this.f33450i.f33456b = (ViewGroup) this.f33523b;
            m36537a(State.VIEW_CREATED);
            mo29060a();
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    /* renamed from: a */
    public final void mo30929a(C12584c cVar, boolean z) {
        C12699i.m36905a();
        this.f33451j.add(C12696f.m36901a(cVar, Boolean.valueOf(true)));
    }

    /* renamed from: a */
    public final void mo30931a(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30931a(jVar, bundle, z);
    }

    /* renamed from: a */
    public final void mo30932a(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30857a(jVar);
                }
            }
        }
        super.mo30932a(jVar, z);
    }

    /* renamed from: G */
    public final void mo30920G() {
        this.f33450i.mo30961a();
    }

    /* renamed from: H */
    public final void mo30921H() {
        this.f33450i.mo30968b();
    }

    /* renamed from: g */
    public final void mo30950g() {
        super.mo30950g();
        m36540b(State.STARTED);
    }

    /* renamed from: h */
    public final void mo30951h() {
        super.mo30951h();
        m36540b(State.RESUMED);
    }

    /* renamed from: i */
    public final void mo30952i() {
        m36540b(State.STARTED);
        super.mo30952i();
    }

    /* renamed from: j */
    public final void mo30953j() {
        m36540b(State.ACTIVITY_CREATED);
        super.mo30953j();
    }

    /* renamed from: k */
    public final void mo30954k() {
        m36537a(State.NONE);
        super.mo30954k();
    }

    /* renamed from: a */
    private void mo29060a() {
        ArrayList arrayList = new ArrayList();
        m36539a((List<ScenePlaceHolderView>) arrayList, (ViewGroup) mo31010r_());
        if (arrayList.size() != 0) {
            if (!mo30958r()) {
                SparseArray sparseArray = new SparseArray();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    ScenePlaceHolderView scenePlaceHolderView = (ScenePlaceHolderView) arrayList.get(i);
                    ViewGroup viewGroup = (ViewGroup) scenePlaceHolderView.getParent();
                    int id = viewGroup.getId();
                    if (id != -1) {
                        if (sparseArray.get(id) == null) {
                            sparseArray.put(id, viewGroup);
                        } else if (sparseArray.get(id) != viewGroup) {
                            StringBuilder sb = new StringBuilder("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is ");
                            sb.append(C12700j.m36908a(mo31014u(), id));
                            throw new IllegalArgumentException(sb.toString());
                        }
                        LayoutParams layoutParams = scenePlaceHolderView.getLayoutParams();
                        String sceneName = scenePlaceHolderView.getSceneName();
                        String sceneTag = scenePlaceHolderView.getSceneTag();
                        Bundle arguments = scenePlaceHolderView.getArguments();
                        C12629j jVar = null;
                        C12640l sceneComponentFactory = scenePlaceHolderView.getSceneComponentFactory();
                        if (sceneComponentFactory != null) {
                            jVar = sceneComponentFactory.mo31032a(mo31014u().getClassLoader(), sceneName, arguments);
                        }
                        if (jVar == null) {
                            jVar = SceneInstanceUtility.m36886a(mo31014u(), sceneName, arguments);
                        }
                        int indexOfChild = viewGroup.indexOfChild(scenePlaceHolderView);
                        viewGroup.removeView(scenePlaceHolderView);
                        if (scenePlaceHolderView.getVisibility() == 0) {
                            mo30925a(id, jVar, sceneTag);
                        } else if (scenePlaceHolderView.getVisibility() == 8) {
                            mo30920G();
                            mo30925a(id, jVar, sceneTag);
                            mo30940c(jVar);
                            mo30921H();
                        } else {
                            throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                        }
                        View r_ = jVar.mo31010r_();
                        if (scenePlaceHolderView.getId() != -1) {
                            if (r_.getId() == -1) {
                                r_.setId(scenePlaceHolderView.getId());
                            } else if (scenePlaceHolderView.getId() != r_.getId()) {
                                throw new IllegalStateException(C1642a.m8034a("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{C12700j.m36908a(mo31014u(), scenePlaceHolderView.getId()), C12700j.m36908a(mo31014u(), r_.getId())}));
                            }
                        }
                        viewGroup.removeView(r_);
                        viewGroup.addView(r_, indexOfChild, layoutParams);
                        i++;
                    } else {
                        throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                    }
                }
                return;
            }
            throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
        }
    }

    /* renamed from: a */
    public final void mo30926a(Activity activity) {
        super.mo30926a(activity);
    }

    /* renamed from: c */
    public final void mo30939c(Bundle bundle) {
        super.mo30939c(bundle);
    }

    /* renamed from: a */
    private void m36537a(State state) {
        this.f33450i.mo30965a(state);
    }

    /* renamed from: b */
    private void m36540b(State state) {
        this.f33450i.mo30969b(state);
    }

    /* renamed from: c */
    public final void mo30940c(C12629j jVar) {
        m36541b(jVar, f33449l);
    }

    /* renamed from: d */
    public final void mo30945d(C12629j jVar) {
        m36542c(jVar, f33449l);
    }

    /* renamed from: e */
    private boolean m36543e(C12629j jVar) {
        if (this.f33450i.mo30972c(jVar) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo30934b(Bundle bundle) {
        super.mo30934b(bundle);
        m36537a(State.ACTIVITY_CREATED);
        mo30922I();
    }

    /* renamed from: b */
    public final void mo30935b(C12629j jVar) {
        m36538a(jVar, f33449l);
    }

    /* renamed from: d */
    public void mo30944d(Bundle bundle) {
        super.mo30944d(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", mo30958r())) {
                bT_();
            }
            if (mo30958r()) {
                this.f33450i.mo30963a((Context) mo31015v(), bundle);
            }
        }
    }

    /* renamed from: f */
    public final void mo30948f(Bundle bundle) {
        super.mo30948f(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", mo30958r());
            if (mo30958r()) {
                this.f33450i.mo30964a(bundle);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    /* renamed from: a */
    public final <T extends C12629j> T mo30924a(String str) {
        C12699i.m36905a();
        if (str == null) {
            return null;
        }
        GroupRecord a = this.f33450i.mo30960a(str);
        if (a != null) {
            return a.f33437b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final ViewGroup mo30943d(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f33523b.findViewById(i);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            while (viewGroup2 != null && viewGroup2 != this.f33523b) {
                GroupRecord a = this.f33450i.mo30959a((View) viewGroup2);
                if (a == null) {
                    viewGroup2 = (ViewGroup) viewGroup2.getParent();
                } else {
                    throw new IllegalArgumentException(C1642a.m8034a("cant add Scene to child Scene %s view hierarchy ", new Object[]{a.f33437b.toString()}));
                }
            }
            return viewGroup;
        }
        try {
            String resourceName = mo31017x().getResourceName(i);
            StringBuilder sb = new StringBuilder(" ");
            sb.append(resourceName);
            sb.append(" view not found");
            throw new IllegalArgumentException(sb.toString());
        } catch (NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(" ");
            sb2.append(i);
            sb2.append(" view not found");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo30927a(Bundle bundle) {
        super.mo30927a(bundle);
    }

    /* renamed from: a */
    private void m36538a(C12629j jVar, C12562b bVar) {
        C12699i.m36905a();
        this.f33450i.mo30967a(jVar, bVar);
    }

    /* renamed from: b */
    private void m36541b(C12629j jVar, C12562b bVar) {
        C12699i.m36905a();
        this.f33450i.mo30971b(jVar, bVar);
    }

    /* renamed from: c */
    private void m36542c(C12629j jVar, C12562b bVar) {
        C12699i.m36905a();
        this.f33450i.mo30973c(jVar, bVar);
    }

    /* renamed from: a */
    private static void m36539a(List<ScenePlaceHolderView> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount != 0) {
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ScenePlaceHolderView) {
                    list.add((ScenePlaceHolderView) childAt);
                } else if (childAt instanceof ViewGroup) {
                    m36539a(list, (ViewGroup) childAt);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo30947e(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30947e(jVar, z);
    }

    /* renamed from: c */
    public final void mo30942c(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30942c(jVar, z);
    }

    /* renamed from: f */
    public final void mo30949f(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30859b(jVar);
                }
            }
        }
        super.mo30949f(jVar, z);
    }

    /* renamed from: b */
    public final void mo30937b(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30937b(jVar, z);
    }

    /* renamed from: d */
    public final void mo30946d(C12629j jVar, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30946d(jVar, z);
    }

    /* renamed from: c */
    public final void mo30941c(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (!z) {
                    ((Boolean) fVar.f33696b).booleanValue();
                }
            }
        }
        super.mo30941c(jVar, bundle, z);
    }

    /* renamed from: b */
    public final void mo30936b(C12629j jVar, Bundle bundle, boolean z) {
        if (jVar != this) {
            for (C12696f fVar : new ArrayList(this.f33451j)) {
                if (z || ((Boolean) fVar.f33696b).booleanValue()) {
                    ((C12584c) fVar.f33695a).mo30858a(jVar, bundle);
                }
            }
        }
        super.mo30936b(jVar, bundle, z);
    }

    /* renamed from: a */
    public final void mo30925a(int i, C12629j jVar, String str) {
        m36536a(i, jVar, str, f33449l);
    }

    /* renamed from: a */
    private void m36536a(int i, C12629j jVar, String str, C12562b bVar) {
        String str2;
        C12699i.m36905a();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag can't be empty");
        } else if (jVar != this) {
            if (m36543e(jVar)) {
                int d = this.f33450i.mo30974d(jVar);
                if (d == i) {
                    String e = this.f33450i.mo30975e(jVar);
                    if (!e.equals(str)) {
                        StringBuilder sb = new StringBuilder("Scene is already added, tag ");
                        sb.append(e);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else {
                    try {
                        str2 = mo31017x().getResourceName(d);
                    } catch (NotFoundException unused) {
                        str2 = String.valueOf(d);
                    }
                    StringBuilder sb2 = new StringBuilder("Scene is already added to another container, viewId ");
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            } else {
                C12629j a = mo30924a(str);
                if (a != null) {
                    StringBuilder sb3 = new StringBuilder("already have a Scene ");
                    sb3.append(a.toString());
                    sb3.append(" with tag ");
                    sb3.append(str);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            if (jVar.f33524c != null && jVar.f33524c != this) {
                StringBuilder sb4 = new StringBuilder("Scene already has a parent, parent ");
                sb4.append(jVar.f33524c);
                throw new IllegalArgumentException(sb4.toString());
            } else if (!mo30958r() || SceneInstanceUtility.m36888a(jVar)) {
                this.f33450i.mo30962a(i, jVar, str, bVar);
            } else {
                StringBuilder sb5 = new StringBuilder("Scene ");
                sb5.append(jVar.getClass().getName());
                sb5.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                throw new IllegalArgumentException(sb5.toString());
            }
        } else {
            throw new IllegalArgumentException("GroupScene can't be added to itself");
        }
    }
}
