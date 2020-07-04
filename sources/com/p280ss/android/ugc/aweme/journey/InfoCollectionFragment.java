package com.p280ss.android.ugc.aweme.journey;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.initial.C30489i;
import com.p280ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.main.C32982di;
import com.p280ss.android.ugc.aweme.user.C42811c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONArray;
import org.json.JSONObject;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment */
public final class InfoCollectionFragment extends AmeBaseFragment {

    /* renamed from: e */
    public int f84092e = 1;

    /* renamed from: f */
    public C32243g f84093f;

    /* renamed from: g */
    public List<C32246j> f84094g;

    /* renamed from: h */
    public long f84095h = System.currentTimeMillis();

    /* renamed from: i */
    public long f84096i = System.currentTimeMillis();

    /* renamed from: j */
    public long f84097j;

    /* renamed from: k */
    public boolean f84098k;

    /* renamed from: l */
    public boolean f84099l;

    /* renamed from: m */
    public Runnable f84100m;

    /* renamed from: n */
    public boolean f84101n;

    /* renamed from: o */
    public TextView f84102o;

    /* renamed from: p */
    public RecyclerView f84103p;

    /* renamed from: q */
    private HashMap f84104q;

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$a */
    static final class C32200a extends Lambda implements C7562b<C7120e, C7581n> {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84105a;

        C32200a(InfoCollectionFragment infoCollectionFragment) {
            this.f84105a = infoCollectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104493a((C7120e) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104493a(C7120e eVar) {
            boolean z;
            InfoCollectionFragment infoCollectionFragment = this.f84105a;
            if (eVar != null) {
                z = true;
            } else {
                z = false;
            }
            infoCollectionFragment.mo83340a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$b */
    static final class C32201b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84106a;

        C32201b(InfoCollectionFragment infoCollectionFragment) {
            this.f84106a = infoCollectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84106a.f84098k = true;
            C1262a adapter = this.f84106a.mo83337a().getAdapter();
            if (adapter != null) {
                C7120e eVar = ((ChooseAppLanguageAdapter) adapter).f84077a;
                if (eVar == null) {
                    C7573i.m23580a();
                }
                InfoCollectionFragment infoCollectionFragment = this.f84106a;
                String g = eVar.mo18536g();
                C7573i.m23582a((Object) g, "selectItem.isO639");
                infoCollectionFragment.mo83342b(false, g);
                FragmentActivity activity = this.f84106a.getActivity();
                if (activity != null) {
                    NewUserJourneyActivity newUserJourneyActivity = (NewUserJourneyActivity) activity;
                    newUserJourneyActivity.f84160c = eVar;
                    newUserJourneyActivity.m104517a((Boolean) null);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.NewUserJourneyActivity");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.ChooseAppLanguageAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$c */
    static final class C32202c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84107a;

        C32202c(InfoCollectionFragment infoCollectionFragment) {
            this.f84107a = infoCollectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84107a.f84098k = true;
            this.f84107a.mo83342b(false, "cancel");
            C42961az.m136380a(new C32256n(null, 1, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$d */
    static final class C32203d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84108a;

        /* renamed from: b */
        final /* synthetic */ ContentLanguageAdapter f84109b;

        /* renamed from: c */
        final /* synthetic */ C32982di f84110c;

        C32203d(InfoCollectionFragment infoCollectionFragment, ContentLanguageAdapter contentLanguageAdapter, C32982di diVar) {
            this.f84108a = infoCollectionFragment;
            this.f84109b = contentLanguageAdapter;
            this.f84110c = diVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            if (!C32228a.m104531a(view.getContext())) {
                C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
                return;
            }
            this.f84108a.f84098k = true;
            if (!this.f84109b.f84085a.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (Number intValue : this.f84109b.f84085a) {
                    int intValue2 = intValue.intValue();
                    C32243g gVar = this.f84108a.f84093f;
                    if (gVar == null) {
                        C7573i.m23580a();
                    }
                    List<C32232e> list = gVar.f84271a;
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    sb.append(((C32232e) list.get(intValue2)).f84179a);
                    if (i != this.f84109b.f84085a.size() - 1) {
                        sb.append(",");
                    }
                    i++;
                }
                String sb2 = sb.toString();
                C7573i.m23582a((Object) sb2, "languageList.toString()");
                this.f84108a.mo83341a(false, sb2);
                this.f84110c.mo84682a(sb2);
            }
            C42961az.m136380a(new C32256n(Boolean.valueOf(false)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$e */
    static final class C32204e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84111a;

        C32204e(InfoCollectionFragment infoCollectionFragment) {
            this.f84111a = infoCollectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84111a.f84098k = true;
            this.f84111a.mo83341a(false, "cancel");
            C42961az.m136380a(new C32256n(Boolean.valueOf(true)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$f */
    static final class C32205f extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84112a;

        C32205f(InfoCollectionFragment infoCollectionFragment) {
            this.f84112a = infoCollectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104494a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104494a(int i) {
            if (i == 1) {
                this.f84112a.mo83340a(true);
                return;
            }
            if (i == 0) {
                this.f84112a.mo83340a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$g */
    static final class C32206g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84113a;

        /* renamed from: b */
        final /* synthetic */ C7561a f84114b;

        C32206g(InfoCollectionFragment infoCollectionFragment, C7561a aVar) {
            this.f84113a = infoCollectionFragment;
            this.f84114b = aVar;
        }

        public final void run() {
            if (this.f84113a.isViewValid() && this.f84113a.mo83337a().getAdapter() != null) {
                this.f84114b.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$h */
    static final class C32207h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84115a;

        /* renamed from: b */
        final /* synthetic */ C7562b f84116b;

        /* renamed from: c */
        final /* synthetic */ C7561a f84117c;

        C32207h(InfoCollectionFragment infoCollectionFragment, C7562b bVar, C7561a aVar) {
            this.f84115a = infoCollectionFragment;
            this.f84116b = bVar;
            this.f84117c = aVar;
        }

        public final void run() {
            if (this.f84115a.f84094g == null) {
                InfoCollectionFragment infoCollectionFragment = this.f84115a;
                Context context = this.f84115a.mo83337a().getContext();
                C7573i.m23582a((Object) context, "infoListView.context");
                infoCollectionFragment.f84094g = C32230c.m104534a(context);
                this.f84115a.f84099l = true;
            }
            this.f84115a.f84095h = System.currentTimeMillis();
            RecyclerView a = this.f84115a.mo83337a();
            List<C32246j> list = this.f84115a.f84094g;
            if (list == null) {
                C7573i.m23580a();
            }
            a.setAdapter(new InterestAdapter(list, this.f84116b));
            this.f84115a.mo83337a().setVisibility(0);
            DmtStatusView dmtStatusView = (DmtStatusView) this.f84115a.mo83338a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
            C6907h.m21524a("show_interest_selection", (Map) new C22984d().mo59970a("is_default_interests_list", this.f84115a.f84099l ? 1 : 0).f60753a);
            this.f84115a.f84101n = true;
            C23485m.m77118b(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C32207h f84118a;

                {
                    this.f84118a = r1;
                }

                public final void run() {
                    if (this.f84118a.f84115a.isViewValid()) {
                        this.f84118a.f84117c.invoke();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$i */
    static final class C32209i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84119a;

        C32209i(InfoCollectionFragment infoCollectionFragment) {
            this.f84119a = infoCollectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C7573i.m23582a((Object) view, "it");
            if (!C32229b.m104532a(view.getContext())) {
                C10761a.m31399c(view.getContext(), (int) R.string.cjs).mo25750a();
                return;
            }
            this.f84119a.f84098k = true;
            C1262a adapter = this.f84119a.mo83337a().getAdapter();
            if (adapter != null) {
                List<Number> h = C7525m.m23516h((Iterable<? extends T>) ((InterestAdapter) adapter).f84128a);
                JSONArray jSONArray = new JSONArray();
                LinkedList linkedList = new LinkedList();
                int i = 0;
                for (Number intValue : h) {
                    int intValue2 = intValue.intValue();
                    List<C32246j> list = this.f84119a.f84094g;
                    if (list == null) {
                        C7573i.m23580a();
                    }
                    C32246j jVar = (C32246j) list.get(intValue2);
                    C32246j jVar2 = new C32246j(jVar.f84277a, null, null);
                    JSONObject jSONObject = new JSONObject();
                    i++;
                    jSONObject.put("select_rank", i).put("show_rank", intValue2 + 1).put("interest", jVar.f84277a);
                    jSONArray.put(jSONObject);
                    linkedList.add(jVar2);
                }
                C6600e f = new C6607f().mo15991e().mo15992f();
                C32257o oVar = new C32257o(linkedList, C32250l.f84286c.mo83473g(), Integer.valueOf(C32250l.m104756h()), Integer.valueOf((int) (((System.currentTimeMillis() - this.f84119a.f84095h) + this.f84119a.f84097j) / 1000)), null, 16, null);
                C32250l.m104752a(f.mo15979b((Object) oVar));
                C32231d.m104535a().uploadInterest(C32250l.m104749a()).mo19304b(C7333a.m23044b()).mo19280a((C7326g<? super T>) C322101.f84120a, (C7326g<? super Throwable>) C322112.f84121a);
                String jSONArray2 = jSONArray.toString();
                C7573i.m23582a((Object) jSONArray2, "mobJsonArray.toString()");
                this.f84119a.mo83339a("done", jSONArray2);
                C42961az.m136380a(new C32256n(Boolean.valueOf(false)));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.InterestAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$j */
    static final class C32212j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84122a;

        C32212j(InfoCollectionFragment infoCollectionFragment) {
            this.f84122a = infoCollectionFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f84122a.f84098k = true;
            this.f84122a.mo83339a("skip", "");
            C42961az.m136380a(new C32256n(Boolean.valueOf(true)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$k */
    static final class C32213k extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84123a;

        C32213k(InfoCollectionFragment infoCollectionFragment) {
            this.f84123a = infoCollectionFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m104495a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104495a() {
            int computeVerticalScrollRange = this.f84123a.mo83337a().computeVerticalScrollRange();
            int height = this.f84123a.mo83337a().getHeight();
            if (computeVerticalScrollRange > height) {
                View a = this.f84123a.mo83338a((int) R.id.cze);
                C7573i.m23582a((Object) a, "scroll_bar");
                a.getLayoutParams().height = (int) ((((float) this.f84123a.mo83337a().getHeight()) * (((float) height) + 0.0f)) / ((float) computeVerticalScrollRange));
                View a2 = this.f84123a.mo83338a((int) R.id.cze);
                C7573i.m23582a((Object) a2, "scroll_bar");
                View a3 = this.f84123a.mo83338a((int) R.id.cze);
                C7573i.m23582a((Object) a3, "scroll_bar");
                a2.setLayoutParams(a3.getLayoutParams());
                View a4 = this.f84123a.mo83338a((int) R.id.cze);
                C7573i.m23582a((Object) a4, "scroll_bar");
                a4.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$l */
    static final class C32214l extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ InfoCollectionFragment f84124a;

        C32214l(InfoCollectionFragment infoCollectionFragment) {
            this.f84124a = infoCollectionFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m104496a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m104496a(int i) {
            if (i == 1) {
                this.f84124a.mo83340a(true);
                return;
            }
            if (i == 0) {
                this.f84124a.mo83340a(false);
            }
        }
    }

    /* renamed from: g */
    private void m104486g() {
        if (this.f84104q != null) {
            this.f84104q.clear();
        }
    }

    /* renamed from: a */
    public final View mo83338a(int i) {
        if (this.f84104q == null) {
            this.f84104q = new HashMap();
        }
        View view = (View) this.f84104q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f84104q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final RecyclerView mo83337a() {
        RecyclerView recyclerView = this.f84103p;
        if (recyclerView == null) {
            C7573i.m23583a("infoListView");
        }
        return recyclerView;
    }

    public final void onDestroyView() {
        if (this.f84100m != null) {
            C23485m.m77120c(this.f84100m);
        }
        super.onDestroyView();
        m104486g();
    }

    public final void onResume() {
        super.onResume();
        this.f84095h = System.currentTimeMillis();
        this.f84096i = this.f84095h;
    }

    public final void onStop() {
        this.f84097j += System.currentTimeMillis() - this.f84095h;
        if (!this.f84101n) {
            C6907h.m21524a("show_interest_selection", (Map) new C22984d().mo59970a("is_default_interests_list", 1).f60753a);
            this.f84101n = true;
        }
        if (!this.f84098k) {
            switch (this.f84092e) {
                case 1:
                    mo83339a("background", "");
                    break;
                case 2:
                    mo83341a(true, "");
                    break;
                case 3:
                    mo83342b(true, "");
                    break;
            }
        }
        super.onStop();
    }

    /* renamed from: d */
    private final void m104483d() {
        String str;
        C32982di diVar = new C32982di();
        C32243g gVar = this.f84093f;
        if (gVar == null) {
            C7573i.m23580a();
        }
        List<C32232e> list = gVar.f84271a;
        if (list == null) {
            C7573i.m23580a();
        }
        ContentLanguageAdapter contentLanguageAdapter = new ContentLanguageAdapter(list, new C32205f(this));
        RecyclerView recyclerView = this.f84103p;
        if (recyclerView == null) {
            C7573i.m23583a("infoListView");
        }
        RecyclerView recyclerView2 = this.f84103p;
        if (recyclerView2 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView2.getContext(), 2));
        RecyclerView recyclerView3 = this.f84103p;
        if (recyclerView3 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView3.setAdapter(contentLanguageAdapter);
        TextView textView = this.f84102o;
        if (textView == null) {
            C7573i.m23583a("doneView");
        }
        textView.setOnClickListener(new C32203d(this, contentLanguageAdapter, diVar));
        ((DmtTextView) mo83338a((int) R.id.d7j)).setOnClickListener(new C32204e(this));
        diVar.mo84683a(true);
        String str2 = "show_content_language_popup";
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "new_user_journey");
        String str3 = "is_login";
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        if (C42811c.m135867c()) {
            str = "1";
        } else {
            str = "0";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: e */
    private final void m104484e() {
        String str;
        RecyclerView recyclerView = this.f84103p;
        if (recyclerView == null) {
            C7573i.m23583a("infoListView");
        }
        RecyclerView recyclerView2 = this.f84103p;
        if (recyclerView2 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        String[] strArr = {"ms-MY", "zh-Hant-TW", "en"};
        ArrayList arrayList = new ArrayList();
        Object service = ServiceManager.get().getService(I18nManagerService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…nagerService::class.java)");
        Map localeMap = ((I18nManagerService) service).getLocaleMap();
        for (int i = 0; i < 3; i++) {
            Object obj = localeMap.get(strArr[i]);
            if (obj == null) {
                C7573i.m23580a();
            }
            arrayList.add(obj);
        }
        RecyclerView recyclerView3 = this.f84103p;
        if (recyclerView3 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView3.setAdapter(new ChooseAppLanguageAdapter(arrayList, new C32200a(this)));
        TextView textView = this.f84102o;
        if (textView == null) {
            C7573i.m23583a("doneView");
        }
        textView.setOnClickListener(new C32201b(this));
        ((DmtTextView) mo83338a((int) R.id.d7j)).setOnClickListener(new C32202c(this));
        RecyclerView recyclerView4 = this.f84103p;
        if (recyclerView4 == null) {
            C7573i.m23583a("infoListView");
        }
        ((C30489i) C23336d.m76560a(recyclerView4.getContext(), C30489i.class)).mo60442b(3);
        String str2 = "show_language_popup";
        C22984d a = new C22984d().mo59973a("enter_from", "new_user_journey");
        String str3 = "is_login";
        C7573i.m23582a((Object) C42811c.m135845a(), "UserManager.inst()");
        if (C42811c.m135867c()) {
            str = "1";
        } else {
            str = "0";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
    }

    /* renamed from: f */
    private final void m104485f() {
        IntRef intRef = new IntRef();
        intRef.element = -1;
        IntRef intRef2 = new IntRef();
        intRef2.element = 0;
        RecyclerView recyclerView = this.f84103p;
        if (recyclerView == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView.mo5528a((C1281m) new InfoCollectionFragment$createInterestSelect$1(this, intRef2, intRef));
        C7561a kVar = new C32213k(this);
        RecyclerView recyclerView2 = this.f84103p;
        if (recyclerView2 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView2.post(new C32206g(this, kVar));
        RecyclerView recyclerView3 = this.f84103p;
        if (recyclerView3 == null) {
            C7573i.m23583a("infoListView");
        }
        RecyclerView recyclerView4 = this.f84103p;
        if (recyclerView4 == null) {
            C7573i.m23583a("infoListView");
        }
        recyclerView3.setLayoutManager(new FlexboxLayoutManager(recyclerView4.getContext()));
        C7562b lVar = new C32214l(this);
        if (this.f84094g != null) {
            RecyclerView recyclerView5 = this.f84103p;
            if (recyclerView5 == null) {
                C7573i.m23583a("infoListView");
            }
            List<C32246j> list = this.f84094g;
            if (list == null) {
                C7573i.m23580a();
            }
            recyclerView5.setAdapter(new InterestAdapter(list, lVar));
            C6907h.m21524a("show_interest_selection", (Map) new C22984d().mo59970a("is_default_interests_list", this.f84099l ? 1 : 0).f60753a);
            this.f84101n = true;
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) mo83338a((int) R.id.dav);
            DmtStatusView dmtStatusView2 = (DmtStatusView) mo83338a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView2, "status_view");
            dmtStatusView.setBuilder(C10803a.m31631a(dmtStatusView2.getContext()));
            dmtStatusView.mo25942f();
            dmtStatusView.setVisibility(0);
            RecyclerView recyclerView6 = this.f84103p;
            if (recyclerView6 == null) {
                C7573i.m23583a("infoListView");
            }
            recyclerView6.setVisibility(8);
            this.f84100m = new C32207h(this, lVar, kVar);
            C23485m.m77117a(this.f84100m, 2000);
        }
        TextView textView = this.f84102o;
        if (textView == null) {
            C7573i.m23583a("doneView");
        }
        textView.setOnClickListener(new C32209i(this));
        ((DmtTextView) mo83338a((int) R.id.d7j)).setOnClickListener(new C32212j(this));
    }

    /* renamed from: a */
    public final void mo83340a(boolean z) {
        TextView textView = this.f84102o;
        if (textView == null) {
            C7573i.m23583a("doneView");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.f84102o;
            if (textView2 == null) {
                C7573i.m23583a("doneView");
            }
            textView2.setTextColor(getResources().getColor(R.color.l7));
            return;
        }
        TextView textView3 = this.f84102o;
        if (textView3 == null) {
            C7573i.m23583a("doneView");
        }
        textView3.setTextColor(getResources().getColor(R.color.m0));
    }

    /* renamed from: b */
    public final void mo83342b(boolean z, String str) {
        if (!z) {
            C6907h.m21524a("choose_language_popup", (Map) new C22984d().mo59973a("enter_from", "new_user_journey").mo59973a("language_type", str).f60753a);
        }
        C6907h.m21524a("language_popup_duration", (Map) new C22984d().mo59973a("enter_from", "new_user_journey").mo59971a("duration", System.currentTimeMillis() - this.f84096i).f60753a);
    }

    /* renamed from: a */
    public final void mo83339a(String str, String str2) {
        C22984d a = C22984d.m75611a().mo59971a("stay_time", System.currentTimeMillis() - this.f84096i);
        if (!TextUtils.isEmpty(str2)) {
            a.mo59973a("interests_list", str2);
        }
        if (isViewValid()) {
            RecyclerView recyclerView = this.f84103p;
            if (recyclerView == null) {
                C7573i.m23583a("infoListView");
            }
            if (recyclerView.getAdapter() != null) {
                StringBuilder sb = new StringBuilder();
                RecyclerView recyclerView2 = this.f84103p;
                if (recyclerView2 == null) {
                    C7573i.m23583a("infoListView");
                }
                C1273i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    int G = ((FlexboxLayoutManager) layoutManager).mo83406G();
                    RecyclerView recyclerView3 = this.f84103p;
                    if (recyclerView3 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    C1262a adapter = recyclerView3.getAdapter();
                    if (adapter != null) {
                        InterestAdapter interestAdapter = (InterestAdapter) adapter;
                        int i = 0;
                        if (G >= 0) {
                            while (true) {
                                sb.append(((C32246j) interestAdapter.f84129b.get(i)).f84277a);
                                if (i != G) {
                                    sb.append(",");
                                }
                                if (i == G) {
                                    break;
                                }
                                i++;
                            }
                        }
                        a.mo59973a("interests_show_list", sb.toString());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.InterestAdapter");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.journey.flexbox.FlexboxLayoutManager");
                }
            }
        }
        C6907h.m21524a("exit_interest_selection", (Map) a.mo59973a("exit_method", str).f60753a);
    }

    /* renamed from: a */
    public final void mo83341a(boolean z, String str) {
        if (!z) {
            C6907h.m21524a("choose_content_language_popup", (Map) C22984d.m75611a().mo59973a("enter_from", "new_user_journey").mo59973a("language_type", str).f60753a);
        }
        C6907h.m21524a("popup_duration", (Map) C22984d.m75611a().mo59973a("enter_from", "new_user_journey").mo59971a("duration", System.currentTimeMillis() - this.f84096i).f60753a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        CharSequence charSequence;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        DmtTextView dmtTextView = (DmtTextView) mo83338a((int) R.id.a_7);
        C7573i.m23582a((Object) dmtTextView, "done");
        this.f84102o = dmtTextView;
        RecyclerView recyclerView = (RecyclerView) mo83338a((int) R.id.cx3);
        C7573i.m23582a((Object) recyclerView, "rv");
        this.f84103p = recyclerView;
        RecyclerView recyclerView2 = this.f84103p;
        if (recyclerView2 == null) {
            C7573i.m23583a("infoListView");
        }
        String str = null;
        recyclerView2.setItemAnimator(null);
        switch (this.f84092e) {
            case 1:
                DmtTextView dmtTextView2 = (DmtTextView) mo83338a((int) R.id.title);
                C7573i.m23582a((Object) dmtTextView2, "title");
                dmtTextView2.setText(getString(R.string.cl8));
                DmtTextView dmtTextView3 = (DmtTextView) mo83338a((int) R.id.d1p);
                C7573i.m23582a((Object) dmtTextView3, "second_title");
                dmtTextView3.setText(getString(R.string.ckd));
                View a = mo83338a((int) R.id.cxk);
                C7573i.m23582a((Object) a, "rv_mask");
                a.setVisibility(0);
                RecyclerView recyclerView3 = this.f84103p;
                if (recyclerView3 == null) {
                    C7573i.m23583a("infoListView");
                }
                LayoutParams layoutParams = recyclerView3.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    RecyclerView recyclerView4 = this.f84103p;
                    if (recyclerView4 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams.topMargin = (int) C9738o.m28708b(recyclerView4.getContext(), 40.0f);
                    int i = marginLayoutParams.leftMargin;
                    RecyclerView recyclerView5 = this.f84103p;
                    if (recyclerView5 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams.leftMargin = i - ((int) C9738o.m28708b(recyclerView5.getContext(), 8.0f));
                    marginLayoutParams.rightMargin = marginLayoutParams.leftMargin;
                    m104485f();
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            case 2:
                DmtTextView dmtTextView4 = (DmtTextView) mo83338a((int) R.id.title);
                C7573i.m23582a((Object) dmtTextView4, "title");
                C32243g gVar = this.f84093f;
                if (gVar == null) {
                    C7573i.m23580a();
                }
                C32233f fVar = gVar.f84272b;
                if (fVar != null) {
                    charSequence = fVar.f84182a;
                } else {
                    charSequence = null;
                }
                dmtTextView4.setText(charSequence);
                DmtTextView dmtTextView5 = (DmtTextView) mo83338a((int) R.id.d1p);
                C7573i.m23582a((Object) dmtTextView5, "second_title");
                C32243g gVar2 = this.f84093f;
                if (gVar2 == null) {
                    C7573i.m23580a();
                }
                C32233f fVar2 = gVar2.f84272b;
                if (fVar2 != null) {
                    str = fVar2.f84183b;
                }
                dmtTextView5.setText(str);
                RecyclerView recyclerView6 = this.f84103p;
                if (recyclerView6 == null) {
                    C7573i.m23583a("infoListView");
                }
                LayoutParams layoutParams2 = recyclerView6.getLayoutParams();
                if (layoutParams2 != null) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                    RecyclerView recyclerView7 = this.f84103p;
                    if (recyclerView7 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams2.topMargin = (int) C9738o.m28708b(recyclerView7.getContext(), 48.0f);
                    int i2 = marginLayoutParams2.leftMargin;
                    RecyclerView recyclerView8 = this.f84103p;
                    if (recyclerView8 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams2.leftMargin = i2 - ((int) C9738o.m28708b(recyclerView8.getContext(), 4.0f));
                    marginLayoutParams2.rightMargin = marginLayoutParams2.leftMargin;
                    m104483d();
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            case 3:
                DmtTextView dmtTextView6 = (DmtTextView) mo83338a((int) R.id.title);
                C7573i.m23582a((Object) dmtTextView6, "title");
                dmtTextView6.setText(getString(R.string.ck4));
                DmtTextView dmtTextView7 = (DmtTextView) mo83338a((int) R.id.d1p);
                C7573i.m23582a((Object) dmtTextView7, "second_title");
                dmtTextView7.setVisibility(8);
                RecyclerView recyclerView9 = this.f84103p;
                if (recyclerView9 == null) {
                    C7573i.m23583a("infoListView");
                }
                LayoutParams layoutParams3 = recyclerView9.getLayoutParams();
                if (layoutParams3 != null) {
                    MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) layoutParams3;
                    RecyclerView recyclerView10 = this.f84103p;
                    if (recyclerView10 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams3.topMargin = (int) C9738o.m28708b(recyclerView10.getContext(), 40.0f);
                    int i3 = marginLayoutParams3.leftMargin;
                    RecyclerView recyclerView11 = this.f84103p;
                    if (recyclerView11 == null) {
                        C7573i.m23583a("infoListView");
                    }
                    marginLayoutParams3.leftMargin = i3 - ((int) C9738o.m28708b(recyclerView11.getContext(), 8.0f));
                    marginLayoutParams3.rightMargin = marginLayoutParams3.leftMargin;
                    m104484e();
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
        }
        mo83340a(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.oi, viewGroup, false);
    }
}
