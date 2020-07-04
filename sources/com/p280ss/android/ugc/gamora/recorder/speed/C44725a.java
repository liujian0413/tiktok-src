package com.p280ss.android.ugc.gamora.recorder.speed;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12629j;
import com.p280ss.android.ugc.aweme.shortvideo.C39382ed;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.ugc.gamora.jedi.C44396a;
import com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a;
import com.p280ss.android.ugc.gamora.jedi.C44403b;
import com.p280ss.android.ugc.gamora.jedi.C44413i;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.recorder.speed.a */
public final class C44725a extends C12629j implements C44396a {

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f115101i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44725a.class), "recordViewModel", "getRecordViewModel()Lcom/ss/android/ugc/gamora/recorder/RecordViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C44725a.class), "recordSpeedGroupViewModel", "getRecordSpeedGroupViewModel()Lcom/ss/android/ugc/gamora/recorder/speed/RecordSpeedGroupViewModel;"))};

    /* renamed from: j */
    public static final C44726a f115102j = new C44726a(null);

    /* renamed from: k */
    private C39382ed f115103k;

    /* renamed from: l */
    private final C7541d f115104l;

    /* renamed from: m */
    private final C7541d f115105m;

    /* renamed from: n */
    private RadioGroup f115106n;

    /* renamed from: com.ss.android.ugc.gamora.recorder.speed.a$a */
    public static final class C44726a {
        private C44726a() {
        }

        public /* synthetic */ C44726a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.speed.a$b */
    static final class C44727b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C44725a f115107a;

        C44727b(C44725a aVar) {
            this.f115107a = aVar;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            this.f115107a.mo30920G().mo107139a(C44725a.m141176d(i));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.speed.a$c */
    static final class C44728c extends Lambda implements C7563m<C44396a, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C44725a f115108a;

        C44728c(C44725a aVar) {
            this.f115108a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m141194a((C44396a) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m141194a(C44396a aVar, boolean z) {
            Context t;
            float f;
            C7573i.m23587b(aVar, "$receiver");
            View view = this.f115108a.f33523b;
            C7573i.m23582a((Object) view, "view");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (z) {
                    t = this.f115108a.mo31012t();
                    f = 183.0f;
                } else {
                    t = this.f115108a.mo31012t();
                    f = 150.0f;
                }
                marginLayoutParams.bottomMargin = (int) C9738o.m28708b(t, f);
                View view2 = this.f115108a.f33523b;
                C7573i.m23582a((Object) view2, "view");
                view2.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: H */
    private final RecordViewModel m141174H() {
        return (RecordViewModel) this.f115104l.getValue();
    }

    /* renamed from: G */
    public final RecordSpeedGroupViewModel mo30920G() {
        return (RecordSpeedGroupViewModel) this.f115105m.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public C11585f mo29191e() {
        return C44397a.m140506c(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C44397a.m140503b(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C44397a.m140509d(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C44397a.m140511e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C44397a.m140494a(this);
    }

    public C44725a() {
        C7584c a = C7575l.m23595a(RecordViewModel.class);
        this.f115104l = C7546e.m23569a(new RecordSpeedGroupScene$$special$$inlined$activityViewModel$1(this, a, a));
        C7584c a2 = C7575l.m23595a(RecordSpeedGroupViewModel.class);
        this.f115105m = C7546e.m23569a(new RecordSpeedGroupScene$$special$$inlined$activityViewModel$2(this, a2, a2));
    }

    /* renamed from: d */
    public static RecordingSpeed m141176d(int i) {
        if (i == R.id.cno) {
            return RecordingSpeed.EPIC;
        }
        if (i == R.id.cnp) {
            return RecordingSpeed.SLOW;
        }
        if (i != R.id.cnq) {
            if (i == R.id.cnr) {
                return RecordingSpeed.FAST;
            }
            if (i == R.id.cns) {
                return RecordingSpeed.LAPSE;
            }
        }
        return RecordingSpeed.NORMAL;
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        int i;
        super.mo30985e(bundle);
        Object b = mo30998F().mo31126b((Object) "owner");
        if (b == null) {
            C7573i.m23580a();
        }
        this.f115103k = (C39382ed) b;
        View findViewById = this.f33523b.findViewById(R.id.cq6);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.record_speedgroup_scene)");
        this.f115106n = (RadioGroup) findViewById;
        RecordingSpeed speed = ((RecordSpeedGroupViewState) mo30920G().mo106825a(this)).getSpeed();
        if (speed != null) {
            switch (C44729b.f115109a[speed.ordinal()]) {
                case 1:
                    i = R.id.cno;
                    break;
                case 2:
                    i = R.id.cnp;
                    break;
                case 3:
                    i = R.id.cnq;
                    break;
                case 4:
                    i = R.id.cnr;
                    break;
                case 5:
                    i = R.id.cns;
                    break;
            }
        }
        i = -1;
        if (i != -1) {
            RadioGroup radioGroup = this.f115106n;
            if (radioGroup == null) {
                C7573i.m23583a("speedRadioGroup");
            }
            View findViewById2 = radioGroup.findViewById(i);
            C7573i.m23582a((Object) findViewById2, "speedRadioGroup.findView…Button>(currentCheckedId)");
            ((RadioButton) findViewById2).setChecked(true);
        }
        RadioGroup radioGroup2 = this.f115106n;
        if (radioGroup2 == null) {
            C7573i.m23583a("speedRadioGroup");
        }
        radioGroup2.setOnCheckedChangeListener(new C44727b(this));
        mo91870d(m141174H(), C44730c.f115110a, new C11672v(), new C44728c(this));
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C44397a.m140500a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.b2b, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140496a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: b */
    public final <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140501a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: c */
    public final <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140504b(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: d */
    public final <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        C44397a.m140507c(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C44397a.m140510d(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C44397a.m140498a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C44397a.m140497a((C44396a) this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C44397a.m140499a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
