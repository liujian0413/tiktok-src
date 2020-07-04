package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.effect.VETimeEffectAdapter.C27355a;
import com.p280ss.android.ugc.aweme.port.internal.C35609b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47520y;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.TimeEffectTabFragment */
public final class TimeEffectTabFragment extends Fragment {

    /* renamed from: a */
    private HashMap f72159a;

    /* renamed from: com.ss.android.ugc.aweme.effect.TimeEffectTabFragment$a */
    static final class C27347a<T> implements C0053p<C47520y> {

        /* renamed from: a */
        final /* synthetic */ TimeEffectTabFragment f72160a;

        /* renamed from: b */
        final /* synthetic */ VETimeEffectAdapter f72161b;

        C27347a(TimeEffectTabFragment timeEffectTabFragment, VETimeEffectAdapter vETimeEffectAdapter) {
            this.f72160a = timeEffectTabFragment;
            this.f72161b = vETimeEffectAdapter;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47520y yVar) {
            if (yVar != null) {
                String str = yVar.f121995a;
                if (str != null) {
                    switch (str.hashCode()) {
                        case 49:
                            if (str.equals("1")) {
                                this.f72161b.mo70448a(1);
                                return;
                            }
                            break;
                        case 50:
                            if (str.equals("2")) {
                                this.f72161b.mo70448a(2);
                                return;
                            }
                            break;
                        case 51:
                            if (str.equals("3")) {
                                this.f72161b.mo70448a(3);
                                return;
                            }
                            break;
                    }
                }
                this.f72161b.mo70447a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.TimeEffectTabFragment$b */
    static final class C27348b<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TimeEffectTabFragment f72162a;

        /* renamed from: b */
        final /* synthetic */ VETimeEffectAdapter f72163b;

        C27348b(TimeEffectTabFragment timeEffectTabFragment, VETimeEffectAdapter vETimeEffectAdapter) {
            this.f72162a = timeEffectTabFragment;
            this.f72163b = vETimeEffectAdapter;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                this.f72163b.mo70449a(bool.booleanValue());
                if (!bool.booleanValue()) {
                    this.f72163b.mo70450b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.TimeEffectTabFragment$c */
    static final class C27349c implements C27355a {

        /* renamed from: a */
        final /* synthetic */ TimeEffectTabFragment f72164a;

        C27349c(TimeEffectTabFragment timeEffectTabFragment) {
            this.f72164a = timeEffectTabFragment;
        }

        /* renamed from: a */
        public final void mo70407a(int i) {
            FragmentActivity activity = this.f72164a.getActivity();
            if (activity != null) {
                C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
                ((EditEffectVideoModel) a).mo70340f().setValue(VEEffectSelectOp.selectTime(i));
            }
        }
    }

    /* renamed from: a */
    private View m89667a(int i) {
        if (this.f72159a == null) {
            this.f72159a = new HashMap();
        }
        View view = (View) this.f72159a.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f72159a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    private void m89668a() {
        if (this.f72159a != null) {
            this.f72159a.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m89668a();
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

    public final void onAttach(Context context) {
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

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) m89667a(R.id.dpv);
        C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(view.getContext());
        wrapLinearLayoutManager.mo5427b(0);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) m89667a(R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "recyerview");
        aVDmtPanelRecyleView.setLayoutManager(wrapLinearLayoutManager);
        VETimeEffectAdapter vETimeEffectAdapter = new VETimeEffectAdapter();
        vETimeEffectAdapter.f72213b = new C27349c(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = (AVDmtPanelRecyleView) m89667a(R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView2, "recyerview");
        aVDmtPanelRecyleView2.setAdapter(vETimeEffectAdapter);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) a;
            C0043i iVar = this;
            editEffectVideoModel.mo70334a().mo70546m().observe(iVar, new C27347a(this, vETimeEffectAdapter));
            editEffectVideoModel.mo70334a().mo70540g().observe(iVar, new C27348b(this, vETimeEffectAdapter));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.o6, viewGroup, false);
    }
}
