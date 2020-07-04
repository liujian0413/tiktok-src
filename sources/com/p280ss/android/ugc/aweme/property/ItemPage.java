package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.p280ss.android.ugc.aweme.property.WaveSideBar.C36953a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.property.ItemPage */
public final class ItemPage extends Fragment {

    /* renamed from: a */
    public RecyclerView f96809a;

    /* renamed from: b */
    public EditText f96810b;

    /* renamed from: c */
    public C36979n f96811c;

    /* renamed from: d */
    private WaveSideBar f96812d;

    /* renamed from: e */
    private HashMap f96813e;

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$a */
    static final class C36944a<T> implements C0053p<C36969j> {

        /* renamed from: a */
        final /* synthetic */ ABPageViewAdapter f96814a;

        C36944a(ABPageViewAdapter aBPageViewAdapter) {
            this.f96814a = aBPageViewAdapter;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C36969j jVar) {
            ABPageViewAdapter aBPageViewAdapter = this.f96814a;
            if (jVar == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) jVar, "it!!");
            aBPageViewAdapter.mo93294a(jVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$b */
    static final class C36945b<T> implements C0053p<Language> {

        /* renamed from: a */
        final /* synthetic */ ABPageViewAdapter f96815a;

        C36945b(ABPageViewAdapter aBPageViewAdapter) {
            this.f96815a = aBPageViewAdapter;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Language language) {
            ABPageViewAdapter aBPageViewAdapter = this.f96815a;
            if (language == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) language, "it!!");
            aBPageViewAdapter.mo93293a(language);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$c */
    static final class C36946c extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ItemPage f96816a;

        C36946c(ItemPage itemPage) {
            this.f96816a = itemPage;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m118881a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m118881a(String str) {
            C7573i.m23587b(str, "it");
            this.f96816a.mo93351a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$d */
    static final class C36947d<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ ItemPage f96817a;

        C36947d(ItemPage itemPage) {
            this.f96817a = itemPage;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null && num.intValue() == -1) {
                C36982q.m118976a(Toast.makeText(this.f96817a.getActivity(), "没有对应项~", 0));
                return;
            }
            RecyclerView a = ItemPage.m118869a(this.f96817a);
            if (num == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) num, "it!!");
            a.mo5541b(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$e */
    public static final class C36948e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ItemPage f96818a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C36948e(ItemPage itemPage) {
            this.f96818a = itemPage;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                if (C7634n.m23723c(editable.toString(), "\n", false)) {
                    editable.delete(editable.length() - 1, editable.length());
                }
                ItemPage.m118872b(this.f96818a).mo93404a(editable.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$f */
    static final class C36949f<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ ItemPage f96819a;

        C36949f(ItemPage itemPage) {
            this.f96819a = itemPage;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            ItemPage.m118874c(this.f96819a).setHint(new SpannableString(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$g */
    static final class C36950g implements C36953a {

        /* renamed from: a */
        final /* synthetic */ ItemPage f96820a;

        C36950g(ItemPage itemPage) {
            this.f96820a = itemPage;
        }

        /* renamed from: a */
        public final void mo93355a(String str) {
            C36979n b = ItemPage.m118872b(this.f96820a);
            C7573i.m23582a((Object) str, "it");
            b.mo93406b(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.ItemPage$h */
    static final class C36951h implements OnClickListener {

        /* renamed from: a */
        public static final C36951h f96821a = new C36951h();

        C36951h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: d */
    private void m118876d() {
        if (this.f96813e != null) {
            this.f96813e.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m118876d();
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

    /* renamed from: b */
    private final void m118873b() {
        WaveSideBar waveSideBar = this.f96812d;
        if (waveSideBar == null) {
            C7573i.m23583a("waveSideBar");
        }
        waveSideBar.setOnSelectIndexItemListener(new C36950g(this));
    }

    /* renamed from: c */
    private final void m118875c() {
        EditText editText = this.f96810b;
        if (editText == null) {
            C7573i.m23583a("searchEditView");
        }
        editText.addTextChangedListener(new C36948e(this));
        C36979n nVar = this.f96811c;
        if (nVar == null) {
            C7573i.m23583a("pagePresent");
        }
        nVar.mo93407c().observe(this, new C36949f(this));
    }

    /* renamed from: a */
    private final void m118870a() {
        RecyclerView recyclerView = this.f96809a;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        C36979n nVar = this.f96811c;
        if (nVar == null) {
            C7573i.m23583a("pagePresent");
        }
        Object value = nVar.mo93403a().getValue();
        if (value == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a(value, "pagePresent.showedItemsData.value!!");
        C36969j jVar = (C36969j) value;
        C36979n nVar2 = this.f96811c;
        if (nVar2 == null) {
            C7573i.m23583a("pagePresent");
        }
        Object value2 = nVar2.mo93408d().getValue();
        if (value2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a(value2, "pagePresent.currentLanguage.value!!");
        ABPageViewAdapter aBPageViewAdapter = new ABPageViewAdapter(jVar, (Language) value2);
        C36979n nVar3 = this.f96811c;
        if (nVar3 == null) {
            C7573i.m23583a("pagePresent");
        }
        C0043i iVar = this;
        nVar3.mo93403a().observe(iVar, new C36944a(aBPageViewAdapter));
        C36979n nVar4 = this.f96811c;
        if (nVar4 == null) {
            C7573i.m23583a("pagePresent");
        }
        nVar4.mo93408d().observe(iVar, new C36945b(aBPageViewAdapter));
        aBPageViewAdapter.mo93295a((C7562b<? super String, C7581n>) new C36946c<Object,C7581n>(this));
        RecyclerView recyclerView2 = this.f96809a;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setAdapter(aBPageViewAdapter);
        C36979n nVar5 = this.f96811c;
        if (nVar5 == null) {
            C7573i.m23583a("pagePresent");
        }
        nVar5.mo93405b().observe(iVar, new C36947d(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo93350a(C36979n nVar) {
        C7573i.m23587b(nVar, "present");
        this.f96811c = nVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecyclerView m118869a(ItemPage itemPage) {
        RecyclerView recyclerView = itemPage.f96809a;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        return recyclerView;
    }

    /* renamed from: b */
    public static final /* synthetic */ C36979n m118872b(ItemPage itemPage) {
        C36979n nVar = itemPage.f96811c;
        if (nVar == null) {
            C7573i.m23583a("pagePresent");
        }
        return nVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ EditText m118874c(ItemPage itemPage) {
        EditText editText = itemPage.f96810b;
        if (editText == null) {
            C7573i.m23583a("searchEditView");
        }
        return editText;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m118870a();
        m118873b();
        m118875c();
    }

    /* renamed from: a */
    private final void m118871a(View view) {
        View findViewById = view.findViewById(R.id.cqd);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.recyclerView)");
        this.f96809a = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.d6o);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.side_bar)");
        this.f96812d = (WaveSideBar) findViewById2;
        View findViewById3 = view.findViewById(R.id.czq);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.searchEditView)");
        this.f96810b = (EditText) findViewById3;
    }

    /* renamed from: a */
    public final void mo93351a(String str) {
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        new C1081a(context).mo4233a((CharSequence) "Item Detail Message").mo4240b((CharSequence) str).mo4241b((CharSequence) "ok", (OnClickListener) C36951h.f96821a).mo4242b().show();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.n0, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        m118871a(inflate);
        return inflate;
    }
}
