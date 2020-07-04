package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1146b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.effect.p1194a.p1195a.C27370b;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.port.internal.C35609b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.EditEffectTabFragment */
public abstract class EditEffectTabFragment extends Fragment implements C27370b, C27442s {

    /* renamed from: g */
    public static final C27327a f72090g = new C27327a(null);

    /* renamed from: a */
    public String f72091a;

    /* renamed from: b */
    public List<? extends Effect> f72092b;

    /* renamed from: c */
    public WrapLinearLayoutManager f72093c;

    /* renamed from: d */
    public List<? extends EffectModel> f72094d = C7525m.m23461a();

    /* renamed from: e */
    public C27359a f72095e;

    /* renamed from: f */
    public final ArrayList<EffectPointModel> f72096f = new ArrayList<>();

    /* renamed from: h */
    private DmtStatusView f72097h;

    /* renamed from: i */
    private HashMap f72098i;

    /* renamed from: com.ss.android.ugc.aweme.effect.EditEffectTabFragment$a */
    public static final class C27327a {
        private C27327a() {
        }

        public /* synthetic */ C27327a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public abstract void mo70326a(C1146b bVar, List<? extends EffectModel> list);

    /* renamed from: b */
    public View mo70328b(int i) {
        if (this.f72098i == null) {
            this.f72098i = new HashMap();
        }
        View view = (View) this.f72098i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f72098i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo70333f() {
        if (this.f72098i != null) {
            this.f72098i.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo70333f();
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: d */
    public final List<EffectPointModel> mo70331d() {
        return this.f72096f;
    }

    /* renamed from: a */
    public final String mo70324a() {
        String str = this.f72091a;
        if (str == null) {
            C7573i.m23583a("mCategory");
        }
        return str;
    }

    /* renamed from: b */
    public final List<Effect> mo70329b() {
        List<? extends Effect> list = this.f72092b;
        if (list == null) {
            C7573i.m23583a("mEffectList");
        }
        return list;
    }

    /* renamed from: c */
    public final WrapLinearLayoutManager mo70330c() {
        WrapLinearLayoutManager wrapLinearLayoutManager = this.f72093c;
        if (wrapLinearLayoutManager == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        return wrapLinearLayoutManager;
    }

    public void onDestroy() {
        super.onDestroy();
        C27359a aVar = this.f72095e;
        if (aVar != null) {
            aVar.mo70465b((C27370b) this);
        }
    }

    /* renamed from: g */
    private final void m89583g() {
        if (C6399b.m19928c()) {
            Set linkedHashSet = new LinkedHashSet();
            List<? extends Effect> list = this.f72092b;
            if (list == null) {
                C7573i.m23583a("mEffectList");
            }
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                String id = ((Effect) next).getId();
                C7573i.m23582a((Object) id, "effect.id");
                linkedHashSet.add(id);
                i = i2;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo70332e() {
        mo70400a(true);
        List<? extends Effect> list = this.f72092b;
        if (list == null) {
            C7573i.m23583a("mEffectList");
        }
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            Effect effect = (Effect) next;
            String str = this.f72091a;
            if (str == null) {
                C7573i.m23583a("mCategory");
            }
            EffectModel a = C27431j.m89891a(i, effect, str);
            C7573i.m23582a((Object) a, "EffectDataProvider.cover…index, effect, mCategory)");
            m89580a(a);
            i = i2;
        }
    }

    /* renamed from: a */
    public final void mo70327a(List<? extends EffectModel> list) {
        C7573i.m23587b(list, "<set-?>");
        this.f72094d = list;
    }

    /* renamed from: c */
    private final int m89582c(int i) {
        int i2 = i + 1;
        List<? extends Effect> list = this.f72092b;
        if (list == null) {
            C7573i.m23583a("mEffectList");
        }
        int size = list.size();
        while (i2 < size) {
            if (this.f72095e != null) {
                EffectPlatform a = C27359a.m89722a();
                if (a != null) {
                    List<? extends Effect> list2 = this.f72092b;
                    if (list2 == null) {
                        C7573i.m23583a("mEffectList");
                    }
                    if (a.mo70640a((Effect) list2.get(i2))) {
                        i2++;
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70325a(int i) {
        m89583g();
        IESSettingsProxy a = C30199h.m98861a();
        C7573i.m23582a((Object) a, "SettingsReader.get()");
        if (C7573i.m23576a(a.getEditEffectAutoDownloadSize().intValue(), 0) >= 0) {
            int c = m89582c(i);
            if (c != -1) {
                C27359a aVar = this.f72095e;
                if (aVar != null) {
                    List<? extends Effect> list = this.f72092b;
                    if (list == null) {
                        C7573i.m23583a("mEffectList");
                    }
                    aVar.mo70459a((Effect) list.get(c));
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            if (!editEffectVideoModel.mo70336b()) {
                C35609b g = C35574k.m114859a().mo70092g();
                C7573i.m23582a((Object) activity, "fragmentActivity");
                editEffectVideoModel.mo70335a(g.mo70112a(activity));
            }
        }
    }

    /* renamed from: a */
    private final void m89580a(EffectModel effectModel) {
        List<? extends EffectModel> list = this.f72094d;
        List d = C7525m.m23509d((Collection<? extends T>) this.f72094d);
        d.add(effectModel);
        boolean z = true;
        C1146b a = C1143a.m5067a(new EffectDiff(list, d), true);
        C7573i.m23582a((Object) a, "DiffUtil\n               …(oldList, newList), true)");
        mo70326a(a, d);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b(R.id.cqw);
        if (aVDmtPanelRecyleView != null) {
            if (aVDmtPanelRecyleView.getVisibility() != 8) {
                z = false;
            }
            if (!z) {
                aVDmtPanelRecyleView = null;
            }
            if (aVDmtPanelRecyleView != null) {
                mo70400a(false);
            }
        }
    }

    /* renamed from: a */
    private void mo70400a(boolean z) {
        if (z) {
            LinearLayout linearLayout = (LinearLayout) mo70328b(R.id.btf);
            C7573i.m23582a((Object) linearLayout, "loading_area");
            linearLayout.setVisibility(0);
            AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b(R.id.cqw);
            C7573i.m23582a((Object) aVDmtPanelRecyleView, "recyerview");
            aVDmtPanelRecyleView.setVisibility(8);
            DmtStatusView dmtStatusView = this.f72097h;
            if (dmtStatusView == null) {
                C7573i.m23583a("mStatusView");
            }
            dmtStatusView.mo25942f();
            return;
        }
        DmtStatusView dmtStatusView2 = this.f72097h;
        if (dmtStatusView2 == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView2.mo25939d();
        LinearLayout linearLayout2 = (LinearLayout) mo70328b(R.id.btf);
        C7573i.m23582a((Object) linearLayout2, "loading_area");
        linearLayout2.setVisibility(8);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) mo70328b(R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView2, "recyerview");
        aVDmtPanelRecyleView2.setVisibility(0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("effect_list");
            if (parcelableArrayList == null) {
                C7573i.m23580a();
            }
            this.f72092b = parcelableArrayList;
            String string = arguments.getString("effect_category");
            if (string == null) {
                C7573i.m23580a();
            }
            this.f72091a = string;
        }
        this.f72096f.clear();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            ArrayList<EffectPointModel> arrayList = this.f72096f;
            Iterable h = editEffectVideoModel.mo70334a().mo70541h();
            Collection arrayList2 = new ArrayList();
            for (Object next : h) {
                EffectPointModel effectPointModel = (EffectPointModel) next;
                String str = this.f72091a;
                if (str == null) {
                    C7573i.m23583a("mCategory");
                }
                if (C7573i.m23585a((Object) str, (Object) effectPointModel.getCategory())) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll((List) arrayList2);
        }
        C27359a aVar = this.f72095e;
        if (aVar != null) {
            aVar.mo70458a((C27370b) this);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(view.getContext());
        wrapLinearLayoutManager.mo5427b(0);
        this.f72093c = wrapLinearLayoutManager;
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b(R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "recyerview");
        WrapLinearLayoutManager wrapLinearLayoutManager2 = this.f72093c;
        if (wrapLinearLayoutManager2 == null) {
            C7573i.m23583a("mLinearLayoutManager");
        }
        aVDmtPanelRecyleView.setLayoutManager(wrapLinearLayoutManager2);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.o6, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.bu0);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.loading_status)");
        this.f72097h = (DmtStatusView) findViewById;
        DmtStatusView dmtStatusView = this.f72097h;
        if (dmtStatusView == null) {
            C7573i.m23583a("mStatusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(getContext()).mo25965c(1));
        return inflate;
    }
}
