package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchBaseFragment.C26932a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.status.C27092b;
import com.p280ss.android.ugc.aweme.discover.presenter.C26826h;
import com.p280ss.android.ugc.aweme.discover.presenter.C26827i;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment */
public abstract class SearchOriginalFragment<D> extends SearchFragment<D> {

    /* renamed from: e */
    private HashMap f71206e;

    /* renamed from: f */
    protected C26827i<?> f71207f;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.SearchOriginalFragment$a */
    static final class C26965a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchOriginalFragment f71208a;

        C26965a(SearchOriginalFragment searchOriginalFragment) {
            this.f71208a = searchOriginalFragment;
        }

        public final void run() {
            if (this.f71208a.isViewValid()) {
                this.f71208a.mo69676G();
            }
        }
    }

    /* renamed from: a */
    public View mo68429a(int i) {
        if (this.f71206e == null) {
            this.f71206e = new HashMap();
        }
        View view = (View) this.f71206e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f71206e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public void mo68430g() {
        if (this.f71206e != null) {
            this.f71206e.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final C26827i<?> mo69749N() {
        C26827i<?> iVar = this.f71207f;
        if (iVar == null) {
            C7573i.m23583a("mPresenter");
        }
        return iVar;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C26827i<?> iVar = this.f71207f;
        if (iVar == null) {
            C7573i.m23583a("mPresenter");
        }
        iVar.mo59134U_();
        mo68430g();
    }

    public void ae_() {
        C26827i<?> iVar = this.f71207f;
        if (iVar == null) {
            C7573i.m23583a("mPresenter");
        }
        if (iVar.mo66539h() instanceof C26826h) {
            C27092b B = mo69673B();
            C26827i<?> iVar2 = this.f71207f;
            if (iVar2 == null) {
                C7573i.m23583a("mPresenter");
            }
            C26826h hVar = (C26826h) iVar2.mo66539h();
            C7573i.m23582a((Object) hVar, "mPresenter.model");
            C10805b a = C27092b.m88896a(B, (SearchApiResult) hVar.getData(), null, 2, null);
            if (a != null) {
                mo69684a(a);
                return;
            }
        }
        mo69677H();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo68438l() {
        FilterOption filterOption;
        if ((this.f71093l == 2 || this.f71093l == 5) && TextUtils.equals(this.f71090i, this.f71091j)) {
            C26827i<?> iVar = this.f71207f;
            if (iVar == null) {
                C7573i.m23583a("mPresenter");
            }
            iVar.mo69495b(C26932a.m88487a());
        } else {
            C26827i<?> iVar2 = this.f71207f;
            if (iVar2 == null) {
                C7573i.m23583a("mPresenter");
            }
            iVar2.mo69495b(0);
        }
        C26827i<?> iVar3 = this.f71207f;
        if (iVar3 == null) {
            C7573i.m23583a("mPresenter");
        }
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(4);
        objArr[1] = mo69679J();
        objArr[2] = Integer.valueOf(1);
        objArr[3] = Integer.valueOf(this.f71097p);
        SearchResultParam searchResultParam = this.f71088g;
        if (searchResultParam != null) {
            filterOption = searchResultParam.getFilterOption();
        } else {
            filterOption = null;
        }
        objArr[4] = filterOption;
        iVar3.mo56976a(objArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69750a(C26827i<?> iVar) {
        C7573i.m23587b(iVar, "<set-?>");
        this.f71207f = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo69467b(int i) {
        C26827i<?> iVar = this.f71207f;
        if (iVar == null) {
            C7573i.m23583a("mPresenter");
        }
        iVar.mo56976a(Integer.valueOf(1), this.f71090i, Integer.valueOf(i), Integer.valueOf(this.f71097p));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68434b(boolean z) {
        String k = mo68437k();
        C26827i<?> iVar = this.f71207f;
        if (iVar == null) {
            C7573i.m23583a("mPresenter");
        }
        C26826h hVar = (C26826h) iVar.mo66539h();
        if (hVar != null) {
            mo69692a(k, hVar.f70790f, this.f71090i, z, hVar.mo69493f());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchBaseModel<*, *>");
    }

    /* renamed from: a */
    public void mo68431a(int i, FilterOption filterOption) {
        super.mo68431a(i, filterOption);
        if (C27027az.m88788a(getActivity())) {
            if ((this.f71093l == 2 || this.f71093l == 5) && TextUtils.equals(this.f71090i, this.f71091j)) {
                C26827i<?> iVar = this.f71207f;
                if (iVar == null) {
                    C7573i.m23583a("mPresenter");
                }
                iVar.mo69495b(C26932a.m88487a());
            } else {
                C26827i<?> iVar2 = this.f71207f;
                if (iVar2 == null) {
                    C7573i.m23583a("mPresenter");
                }
                iVar2.mo69495b(0);
            }
            mo69467b(i);
            return;
        }
        C6726a.m20843a(new C26965a(this), 100);
    }
}
