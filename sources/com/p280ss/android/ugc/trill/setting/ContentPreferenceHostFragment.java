package com.p280ss.android.ugc.trill.setting;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.widget.setting.Divider;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.trill.language.ContentLanguageAdapter;
import com.p280ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment */
public final class ContentPreferenceHostFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f115784e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ContentPreferenceHostFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/trill/language/viewmodel/ContentPreferenceViewModel;"))};

    /* renamed from: f */
    public ContentLanguageAdapter f115785f;

    /* renamed from: g */
    public C45050a f115786g;

    /* renamed from: h */
    private final C7541d f115787h = C7546e.m23569a(new C45055f(this));

    /* renamed from: i */
    private HashMap f115788i;

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$a */
    public interface C45050a {
        /* renamed from: c */
        void mo58711c();

        /* renamed from: d */
        void mo59893d();
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$b */
    static final class C45051b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceHostFragment f115789a;

        C45051b(ContentPreferenceHostFragment contentPreferenceHostFragment) {
            this.f115789a = contentPreferenceHostFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f115789a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$c */
    static final class C45052c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceHostFragment f115790a;

        C45052c(ContentPreferenceHostFragment contentPreferenceHostFragment) {
            this.f115790a = contentPreferenceHostFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f115790a.f115786g != null) {
                C45050a aVar = this.f115790a.f115786g;
                if (aVar == null) {
                    C7573i.m23580a();
                }
                aVar.mo58711c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$d */
    static final class C45053d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceHostFragment f115791a;

        C45053d(ContentPreferenceHostFragment contentPreferenceHostFragment) {
            this.f115791a = contentPreferenceHostFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C45050a aVar = this.f115791a.f115786g;
            if (aVar != null) {
                aVar.mo59893d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$e */
    static final class C45054e<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceHostFragment f115792a;

        C45054e(ContentPreferenceHostFragment contentPreferenceHostFragment) {
            this.f115792a = contentPreferenceHostFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                ((CommonItemView) this.f115792a.mo107580a((int) R.id.eek)).setRightText(this.f115792a.getString(R.string.dns));
            } else if (num != null && num.intValue() == 2) {
                ((CommonItemView) this.f115792a.mo107580a((int) R.id.eek)).setRightText(this.f115792a.getString(R.string.dnv));
            } else {
                if (num != null && num.intValue() == 3) {
                    ((CommonItemView) this.f115792a.mo107580a((int) R.id.eek)).setRightText(this.f115792a.getString(R.string.b61));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceHostFragment$f */
    static final class C45055f extends Lambda implements C7561a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceHostFragment f115793a;

        C45055f(ContentPreferenceHostFragment contentPreferenceHostFragment) {
            this.f115793a = contentPreferenceHostFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ContentPreferenceViewModel invoke() {
            FragmentActivity activity = this.f115793a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            return (ContentPreferenceViewModel) C0069x.m159a(activity).mo147a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: a */
    private ContentPreferenceViewModel m142106a() {
        return (ContentPreferenceViewModel) this.f115787h.getValue();
    }

    /* renamed from: d */
    private void m142108d() {
        if (this.f115788i != null) {
            this.f115788i.clear();
        }
    }

    /* renamed from: a */
    public final View mo107580a(int i) {
        if (this.f115788i == null) {
            this.f115788i = new HashMap();
        }
        View view = (View) this.f115788i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f115788i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m142108d();
    }

    /* renamed from: a */
    public final void mo107581a(C45050a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f115786g = aVar;
    }

    /* renamed from: a */
    private void m142107a(View view) {
        C7573i.m23587b(view, "view");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.dnq);
        ((ImageView) view.findViewById(R.id.jo)).setOnClickListener(new C45051b(this));
        if (C6399b.m19946v()) {
            View a = mo107580a((int) R.id.dke);
            if (a == null) {
                C7573i.m23580a();
            }
            a.setBackgroundColor(getResources().getColor(R.color.a6c));
        }
        if (C6399b.m19944t()) {
            CommonItemView commonItemView = (CommonItemView) mo107580a((int) R.id.ea);
            if (commonItemView == null) {
                C7573i.m23580a();
            }
            commonItemView.setRightIconRes(0);
        }
        RecyclerView recyclerView = (RecyclerView) mo107580a((int) R.id.ee);
        if (recyclerView == null) {
            C7573i.m23580a();
        }
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.f115785f = new ContentLanguageAdapter(getActivity());
        RecyclerView recyclerView2 = (RecyclerView) mo107580a((int) R.id.ee);
        if (recyclerView2 == null) {
            C7573i.m23580a();
        }
        ContentLanguageAdapter contentLanguageAdapter = this.f115785f;
        if (contentLanguageAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView2.setAdapter(contentLanguageAdapter);
        ((CommonItemView) mo107580a((int) R.id.ea)).setOnClickListener(new C45052c(this));
        if (!C25789b.m84760f() || TimeLockRuler.isInTeenagerModeNewVersion()) {
            Divider divider = (Divider) mo107580a((int) R.id.a9n);
            C7573i.m23582a((Object) divider, "div");
            divider.setVisibility(8);
            CommonItemView commonItemView2 = (CommonItemView) mo107580a((int) R.id.eek);
            C7573i.m23582a((Object) commonItemView2, "vpa_account_item");
            commonItemView2.setVisibility(8);
            return;
        }
        Divider divider2 = (Divider) mo107580a((int) R.id.a9n);
        C7573i.m23582a((Object) divider2, "div");
        divider2.setVisibility(0);
        CommonItemView commonItemView3 = (CommonItemView) mo107580a((int) R.id.eek);
        C7573i.m23582a((Object) commonItemView3, "vpa_account_item");
        commonItemView3.setVisibility(0);
        ((CommonItemView) mo107580a((int) R.id.eek)).setOnClickListener(new C45053d(this));
        m142106a().mo107570c().observe(this, new C45054e(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m142107a(view);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.nk, viewGroup, false);
    }
}
