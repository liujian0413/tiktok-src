package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.effect.VEEffectAdapter.C27350a;
import com.p280ss.android.ugc.aweme.effect.VEEffectAdapter.ViewHolder;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.effect.p1196b.C27394a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41541au;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47479s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment */
public final class FilterEffectTabFragment extends EditEffectTabFragment {

    /* renamed from: h */
    static final /* synthetic */ C7595j[] f72135h = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FilterEffectTabFragment.class), "mAutoApplyRecorder", "getMAutoApplyRecorder()Ljava/util/Set;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FilterEffectTabFragment.class), "positionList", "getPositionList()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FilterEffectTabFragment.class), "effectList", "getEffectList()Ljava/util/List;"))};

    /* renamed from: m */
    public static final C27339a f72136m = new C27339a(null);

    /* renamed from: i */
    public VEEffectAdapter f72137i;

    /* renamed from: j */
    public EditEffectVideoModel f72138j;

    /* renamed from: k */
    public boolean f72139k;

    /* renamed from: l */
    public C27394a f72140l;

    /* renamed from: n */
    private boolean f72141n;

    /* renamed from: o */
    private final C7541d f72142o = C7546e.m23570a(new LinkedHashSet());

    /* renamed from: p */
    private final C7541d f72143p = C7546e.m23570a(new ArrayList());

    /* renamed from: q */
    private final C7541d f72144q = C7546e.m23570a(new ArrayList());

    /* renamed from: r */
    private HashMap f72145r;

    /* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment$a */
    public static final class C27339a {
        private C27339a() {
        }

        public /* synthetic */ C27339a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FilterEffectTabFragment m89648a(List<? extends Effect> list, String str) {
            C7573i.m23587b(list, "effects");
            C7573i.m23587b(str, "category");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) C7525m.m23509d((Collection<? extends T>) list));
            bundle.putString("effect_category", str);
            FilterEffectTabFragment filterEffectTabFragment = new FilterEffectTabFragment();
            filterEffectTabFragment.setArguments(bundle);
            return filterEffectTabFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment$b */
    static final class C27340b<T> implements C0053p<C47479s> {

        /* renamed from: a */
        final /* synthetic */ FilterEffectTabFragment f72146a;

        C27340b(FilterEffectTabFragment filterEffectTabFragment) {
            this.f72146a = filterEffectTabFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47479s sVar) {
            if (sVar == null || sVar.f121912d != 3) {
                if (sVar != null && sVar.f121912d == 4) {
                    for (int length = sVar.f121909a.length - 1; length >= 0; length--) {
                        if (this.f72146a.f72096f.isEmpty()) {
                            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f72146a.mo70328b((int) R.id.dpv);
                            C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                            aVDmtHorizontalImageTextLayout.setVisibility(8);
                            return;
                        }
                        int i = sVar.f121909a[length];
                        int size = this.f72146a.f72096f.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            Object obj = this.f72146a.f72096f.get(size);
                            C7573i.m23582a(obj, "mEffectPointModelStack[j]");
                            if (((EffectPointModel) obj).getIndex() == i) {
                                this.f72146a.f72096f.remove(size);
                                break;
                            }
                            size--;
                        }
                    }
                }
                return;
            }
            this.f72146a.f72096f.clear();
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f72146a.mo70328b((int) R.id.dpv);
            C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout2, "tvDelete");
            aVDmtHorizontalImageTextLayout2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment$c */
    static final class C27341c implements C27350a {

        /* renamed from: a */
        final /* synthetic */ FilterEffectTabFragment f72147a;

        C27341c(FilterEffectTabFragment filterEffectTabFragment) {
            this.f72147a = filterEffectTabFragment;
        }

        /* renamed from: a */
        public final void mo70401a(int i, int i2, EffectModel effectModel) {
            String str;
            EditEffectVideoModel a = FilterEffectTabFragment.m89633a(this.f72147a);
            ArrayList h = a.mo70334a().mo70541h();
            Effect effect = (Effect) this.f72147a.mo70329b().get(i2);
            if (5 == i) {
                this.f72147a.mo70325a(i2);
                if (this.f72147a.f72095e != null) {
                    EffectPlatform a2 = C27359a.m89722a();
                    if (a2 != null && a2.mo70640a(effect)) {
                        a.mo70340f().setValue(VEEffectSelectOp.selectTrans(effectModel));
                        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f72147a.mo70328b((int) R.id.dpv);
                        C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                        aVDmtHorizontalImageTextLayout.setVisibility(0);
                        if (!h.isEmpty()) {
                            this.f72147a.f72096f.add(h.get(h.size() - 1));
                        } else {
                            C42880h.m136156a("add effect fail");
                        }
                        FilterEffectTabFragment.m89635b(this.f72147a).mo70493a(i2, 3);
                    }
                }
                C27359a aVar = this.f72147a.f72095e;
                if (aVar != null) {
                    aVar.mo70459a(effect);
                }
            } else if (i == 0) {
                this.f72147a.mo70325a(i2);
                if (this.f72147a.f72095e != null) {
                    EffectPlatform a3 = C27359a.m89722a();
                    if (a3 != null && a3.mo70640a(effect)) {
                        if (TextUtils.isEmpty(effectModel.resDir)) {
                            StringBuilder sb = new StringBuilder("applyFilter_resdir_null:");
                            if (effectModel.key != null) {
                                str = effectModel.key;
                            } else {
                                str = "";
                            }
                            sb.append(str);
                            C2077a.m9159a(sb.toString());
                        }
                        this.f72147a.mo70399a(Integer.valueOf(i), effectModel);
                        FilterEffectTabFragment.m89635b(this.f72147a).mo70493a(i2, 3);
                    }
                }
                C27359a aVar2 = this.f72147a.f72095e;
                if (aVar2 != null) {
                    aVar2.mo70459a(effect);
                }
            } else if (1 == i && this.f72147a.f72095e != null) {
                EffectPlatform a4 = C27359a.m89722a();
                if (a4 != null && a4.mo70640a(effect)) {
                    a.mo70340f().setValue(VEEffectSelectOp.selectFilter(i, effectModel));
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout2 = (AVDmtHorizontalImageTextLayout) this.f72147a.mo70328b((int) R.id.dpv);
                    C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout2, "tvDelete");
                    aVDmtHorizontalImageTextLayout2.setVisibility(0);
                }
            }
            C27394a c = FilterEffectTabFragment.m89636c(this.f72147a);
            C7573i.m23582a((Object) effectModel, "model");
            c.mo70490a(i, i2, effectModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment$d */
    static final class C27342d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FilterEffectTabFragment f72148a;

        C27342d(FilterEffectTabFragment filterEffectTabFragment) {
            this.f72148a = filterEffectTabFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!this.f72148a.f72096f.isEmpty()) {
                Object obj = this.f72148a.f72096f.get(this.f72148a.f72096f.size() - 1);
                C7573i.m23582a(obj, "mEffectPointModelStack[m…PointModelStack.size - 1]");
                FilterEffectTabFragment.m89633a(this.f72148a).mo70334a().mo70542i().setValue(C47479s.m148209b(((EffectPointModel) obj).getIndex()));
                this.f72148a.f72096f.remove(this.f72148a.f72096f.size() - 1);
                if (this.f72148a.f72096f.isEmpty()) {
                    AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f72148a.mo70328b((int) R.id.dpv);
                    C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
                    aVDmtHorizontalImageTextLayout.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static final FilterEffectTabFragment m89634a(List<? extends Effect> list, String str) {
        return C27339a.m89648a(list, str);
    }

    /* renamed from: g */
    private final Set<Effect> m89637g() {
        return (Set) this.f72142o.getValue();
    }

    /* renamed from: h */
    private final List<Integer> m89638h() {
        return (List) this.f72143p.getValue();
    }

    /* renamed from: i */
    private final List<Effect> m89639i() {
        return (List) this.f72144q.getValue();
    }

    /* renamed from: b */
    public final View mo70328b(int i) {
        if (this.f72145r == null) {
            this.f72145r = new HashMap();
        }
        View view = (View) this.f72145r.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f72145r.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public final void mo70333f() {
        if (this.f72145r != null) {
            this.f72145r.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo70333f();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f72141n = true;
    }

    /* renamed from: a */
    public static final /* synthetic */ EditEffectVideoModel m89633a(FilterEffectTabFragment filterEffectTabFragment) {
        EditEffectVideoModel editEffectVideoModel = filterEffectTabFragment.f72138j;
        if (editEffectVideoModel == null) {
            C7573i.m23583a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VEEffectAdapter m89635b(FilterEffectTabFragment filterEffectTabFragment) {
        VEEffectAdapter vEEffectAdapter = filterEffectTabFragment.f72137i;
        if (vEEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        return vEEffectAdapter;
    }

    /* renamed from: c */
    public static final /* synthetic */ C27394a m89636c(FilterEffectTabFragment filterEffectTabFragment) {
        C27394a aVar = filterEffectTabFragment.f72140l;
        if (aVar == null) {
            C7573i.m23583a("mTouchStateHolder");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo70396a(Effect effect) {
        C7573i.m23587b(effect, "rawEffect");
        int indexOf = mo70329b().indexOf(effect);
        if (indexOf >= 0) {
            VEEffectAdapter vEEffectAdapter = this.f72137i;
            if (vEEffectAdapter == null) {
                C7573i.m23583a("mEffectAdapter");
            }
            vEEffectAdapter.mo70493a(indexOf, 2);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f72141n) {
            if (z) {
                mo70400a(true);
                return;
            }
            mo70400a(false);
        }
    }

    /* renamed from: a */
    public final void mo70400a(boolean z) {
        C1293v vVar;
        int j = mo70330c().mo5445j();
        int l = mo70330c().mo5447l();
        if (j <= l) {
            while (true) {
                AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b((int) R.id.cqw);
                if (aVDmtPanelRecyleView != null) {
                    vVar = aVDmtPanelRecyleView.mo5575f(j);
                } else {
                    vVar = null;
                }
                if (vVar instanceof ViewHolder) {
                    ((ViewHolder) vVar).mo70410a(z);
                }
                if (j != l) {
                    j++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70326a(C1146b bVar, List<? extends EffectModel> list) {
        C7573i.m23587b(bVar, "result");
        C7573i.m23587b(list, "newEffectSource");
        VEEffectAdapter vEEffectAdapter = this.f72137i;
        if (vEEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        bVar.mo4548a((C1262a) vEEffectAdapter);
        mo70327a(list);
        VEEffectAdapter vEEffectAdapter2 = this.f72137i;
        if (vEEffectAdapter2 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEEffectAdapter2.mo70494a((List) this.f72094d);
    }

    /* renamed from: a */
    public final void mo70397a(Effect effect, C43726c cVar) {
        if (effect != null) {
            int indexOf = mo70329b().indexOf(effect);
            if (indexOf >= 0) {
                VEEffectAdapter vEEffectAdapter = this.f72137i;
                if (vEEffectAdapter == null) {
                    C7573i.m23583a("mEffectAdapter");
                }
                vEEffectAdapter.mo70493a(indexOf, 4);
            }
        }
    }

    /* renamed from: a */
    public final void mo70399a(Integer num, EffectModel effectModel) {
        if (num != null) {
            num.intValue();
            if (effectModel != null) {
                EditEffectVideoModel editEffectVideoModel = this.f72138j;
                if (editEffectVideoModel == null) {
                    C7573i.m23583a("mViewModel");
                }
                editEffectVideoModel.mo70340f().setValue(VEEffectSelectOp.selectFilter(num.intValue(), effectModel));
                EditEffectVideoModel editEffectVideoModel2 = this.f72138j;
                if (editEffectVideoModel2 == null) {
                    C7573i.m23583a("mViewModel");
                }
                ArrayList h = editEffectVideoModel2.mo70334a().mo70541h();
                if (!h.isEmpty()) {
                    this.f72096f.add(h.get(h.size() - 1));
                } else {
                    C42880h.m136156a("add effect failed");
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ac…ctVideoModel::class.java)");
            this.f72138j = (EditEffectVideoModel) a;
            EditEffectVideoModel editEffectVideoModel = this.f72138j;
            if (editEffectVideoModel == null) {
                C7573i.m23583a("mViewModel");
            }
            editEffectVideoModel.mo70334a().mo70542i().observe(this, new C27340b(this));
        }
        this.f72140l = new C27394a();
        this.f72137i = new VEEffectAdapter((AVDmtPanelRecyleView) mo70328b((int) R.id.cqw), this.f72095e);
        VEEffectAdapter vEEffectAdapter = this.f72137i;
        if (vEEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEEffectAdapter.mo70494a((List) this.f72094d);
        VEEffectAdapter vEEffectAdapter2 = this.f72137i;
        if (vEEffectAdapter2 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEEffectAdapter2.f72165a = new C27341c(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b((int) R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "recyerview");
        VEEffectAdapter vEEffectAdapter3 = this.f72137i;
        if (vEEffectAdapter3 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(vEEffectAdapter3);
        ((AVDmtPanelRecyleView) mo70328b((int) R.id.cqw)).mo5528a((C1281m) new FilterEffectTabFragment$onViewCreated$3(this));
        if (C27431j.m89896a(mo70324a())) {
            AVDmtTextView aVDmtTextView = (AVDmtTextView) mo70328b((int) R.id.dpz);
            C7573i.m23582a((Object) aVDmtTextView, "tvHint");
            aVDmtTextView.setText(getString(R.string.aze));
        }
        C41541au.m132303a((AVDmtHorizontalImageTextLayout) mo70328b((int) R.id.dpv), 0.5f);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo70328b((int) R.id.dpv);
        C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        if (this.f72096f.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        aVDmtHorizontalImageTextLayout.setVisibility(i);
        ((AVDmtHorizontalImageTextLayout) mo70328b((int) R.id.dpv)).setOnClickListener(new C27342d(this));
        mo70332e();
    }

    /* renamed from: a */
    public final void mo70398a(Effect effect, Effect effect2, boolean z) {
        String str;
        String str2;
        String str3;
        C7573i.m23587b(effect, "rawEffect");
        boolean z2 = true;
        if (!C6399b.m19928c() || !(!C7573i.m23585a((Object) effect, (Object) effect2))) {
            int indexOf = mo70329b().indexOf(effect);
            if (indexOf >= 0) {
                VEEffectAdapter vEEffectAdapter = this.f72137i;
                if (vEEffectAdapter == null) {
                    C7573i.m23583a("mEffectAdapter");
                }
                vEEffectAdapter.mo70493a(indexOf, 3);
                C27394a aVar = this.f72140l;
                if (aVar == null) {
                    C7573i.m23583a("mTouchStateHolder");
                }
                if (aVar.mo70491a(indexOf) && !m89637g().contains(effect)) {
                    C27394a aVar2 = this.f72140l;
                    if (aVar2 == null) {
                        C7573i.m23583a("mTouchStateHolder");
                    }
                    Integer valueOf = Integer.valueOf(aVar2.f72278a);
                    C27394a aVar3 = this.f72140l;
                    if (aVar3 == null) {
                        C7573i.m23583a("mTouchStateHolder");
                    }
                    mo70399a(valueOf, aVar3.f72279b);
                    C27394a aVar4 = this.f72140l;
                    if (aVar4 == null) {
                        C7573i.m23583a("mTouchStateHolder");
                    }
                    if (aVar4.f72278a != 0) {
                        z2 = false;
                    }
                    m89637g().add(effect);
                    if (C6399b.m19928c()) {
                        m89638h().add(Integer.valueOf(indexOf));
                        m89639i().add(effect);
                        C27394a aVar5 = this.f72140l;
                        if (aVar5 == null) {
                            C7573i.m23583a("mTouchStateHolder");
                        }
                        EffectModel effectModel = aVar5.f72279b;
                        String str4 = null;
                        if (effectModel != null) {
                            str = effectModel.resDir;
                        } else {
                            str = null;
                        }
                        boolean b = C7276d.m22812b(str);
                        StringBuilder sb = new StringBuilder();
                        if (z2) {
                            str2 = "ACTION_DOWN";
                        } else {
                            str2 = "NOT";
                        }
                        sb.append(str2);
                        sb.append(", ");
                        if (b) {
                            str3 = "exist";
                        } else {
                            str3 = "not exist";
                        }
                        sb.append(str3);
                        sb.append(", apply ");
                        C27394a aVar6 = this.f72140l;
                        if (aVar6 == null) {
                            C7573i.m23583a("mTouchStateHolder");
                        }
                        EffectModel effectModel2 = aVar6.f72279b;
                        if (effectModel2 != null) {
                            str4 = effectModel2.name;
                        }
                        sb.append(str4);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("not equals");
    }
}
