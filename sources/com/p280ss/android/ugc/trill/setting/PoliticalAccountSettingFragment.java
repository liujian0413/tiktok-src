package com.p280ss.android.ugc.trill.setting;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.setting.p337ui.ChooseOneOfMultiItemView;
import com.p280ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment */
public final class PoliticalAccountSettingFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f115803e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PoliticalAccountSettingFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/trill/language/viewmodel/ContentPreferenceViewModel;"))};

    /* renamed from: f */
    private final C7541d f115804f = C7546e.m23569a(new C45063f(this));

    /* renamed from: g */
    private HashMap f115805g;

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$a */
    static final class C45058a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115806a;

        C45058a(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115806a = politicalAccountSettingFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f115806a.getActivity();
            if (activity != null) {
                C0608j supportFragmentManager = activity.getSupportFragmentManager();
                if (supportFragmentManager != null) {
                    supportFragmentManager.mo2655c();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$b */
    static final class C45059b<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115807a;

        C45059b(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115807a = politicalAccountSettingFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == 1) {
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.fm)).setSelect(true);
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c96)).setSelect(false);
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c97)).setSelect(false);
            } else if (num != null && num.intValue() == 2) {
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.fm)).setSelect(false);
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c96)).setSelect(true);
                ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c97)).setSelect(false);
            } else {
                if (num != null && num.intValue() == 3) {
                    ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.fm)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c96)).setSelect(false);
                    ((ChooseOneOfMultiItemView) this.f115807a.mo107589a((int) R.id.c97)).setSelect(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$c */
    static final class C45060c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115808a;

        C45060c(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115808a = politicalAccountSettingFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f115808a.mo107590a().mo107563a(1);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$d */
    static final class C45061d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115809a;

        C45061d(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115809a = politicalAccountSettingFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f115809a.mo107590a().mo107563a(2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$e */
    static final class C45062e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115810a;

        C45062e(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115810a = politicalAccountSettingFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.setting.ui.ChooseOneOfMultiItemView");
            } else if (!((ChooseOneOfMultiItemView) view).getSelect()) {
                this.f115810a.mo107590a().mo107563a(3);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.PoliticalAccountSettingFragment$f */
    static final class C45063f extends Lambda implements C7561a<ContentPreferenceViewModel> {

        /* renamed from: a */
        final /* synthetic */ PoliticalAccountSettingFragment f115811a;

        C45063f(PoliticalAccountSettingFragment politicalAccountSettingFragment) {
            this.f115811a = politicalAccountSettingFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ContentPreferenceViewModel invoke() {
            FragmentActivity activity = this.f115811a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            return (ContentPreferenceViewModel) C0069x.m159a(activity).mo147a(ContentPreferenceViewModel.class);
        }
    }

    /* renamed from: d */
    private void m142123d() {
        if (this.f115805g != null) {
            this.f115805g.clear();
        }
    }

    /* renamed from: a */
    public final View mo107589a(int i) {
        if (this.f115805g == null) {
            this.f115805g = new HashMap();
        }
        View view = (View) this.f115805g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f115805g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final ContentPreferenceViewModel mo107590a() {
        return (ContentPreferenceViewModel) this.f115804f.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m142123d();
    }

    public final void onDetach() {
        super.onDetach();
        mo107590a().mo107574f();
    }

    /* renamed from: a */
    private void m142122a(View view) {
        C7573i.m23587b(view, "view");
        ((TextView) view.findViewById(R.id.title)).setText(R.string.dnr);
        ((ImageView) view.findViewById(R.id.jo)).setOnClickListener(new C45058a(this));
        mo107590a().mo107570c().observe(this, new C45059b(this));
        ((ChooseOneOfMultiItemView) mo107589a((int) R.id.fm)).setOnClickListener(new C45060c(this));
        ((ChooseOneOfMultiItemView) mo107589a((int) R.id.c96)).setOnClickListener(new C45061d(this));
        ((ChooseOneOfMultiItemView) mo107589a((int) R.id.c97)).setOnClickListener(new C45062e(this));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m142122a(view);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.q1, viewGroup, false);
    }
}
