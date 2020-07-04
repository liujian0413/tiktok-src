package com.p280ss.android.ugc.aweme.miniapp.anchor.fragment;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.ElementAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.adapter.HistoryAdapter;
import com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a.C33301c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.fragment.SearchElementsFragment */
public class SearchElementsFragment<E, VH extends C1293v> extends Fragment implements C25675c<E>, C28532n {

    /* renamed from: a */
    String f87102a;

    /* renamed from: b */
    String f87103b;

    /* renamed from: c */
    String f87104c;

    /* renamed from: d */
    EditText f87105d;

    /* renamed from: e */
    ElementAdapter<E, VH> f87106e;

    /* renamed from: f */
    public RecyclerView f87107f;

    /* renamed from: g */
    public HistoryAdapter f87108g;

    /* renamed from: h */
    public DmtTextView f87109h;

    /* renamed from: i */
    C33301c f87110i;

    /* renamed from: j */
    private DmtTextView f87111j;

    /* renamed from: k */
    private ImageView f87112k;

    /* renamed from: l */
    private RecyclerView f87113l;

    /* renamed from: m */
    private C1273i f87114m;

    /* renamed from: n */
    private LoadMoreAdapter f87115n;

    /* renamed from: o */
    private DmtLoadingLayout f87116o;

    /* renamed from: p */
    private DmtTextView f87117p;

    /* renamed from: q */
    private DmtTextView f87118q;

    /* renamed from: r */
    private C1273i f87119r;

    /* renamed from: s */
    private C25674b f87120s;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<E> list, boolean z) {
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

    /* renamed from: S_ */
    public final void mo59098S_() {
        this.f87116o.setVisibility(0);
    }

    public final void aD_() {
        this.f87115n.mo67986a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final MoreElementsActivity mo85503m() {
        return (MoreElementsActivity) getActivity();
    }

    public final boolean aR_() {
        if (this.f87115n.f69540a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    private void m107863o() {
        this.f87120s = new C25674b();
        this.f87120s.mo66536a(this.f87110i);
        this.f87120s.mo66537a(this);
    }

    public final void aP_() {
        this.f87120s.mo56976a(Integer.valueOf(4));
    }

    public void ae_() {
        this.f87117p.setVisibility(0);
        this.f87118q.setVisibility(0);
        this.f87116o.setVisibility(8);
        this.f87113l.setVisibility(8);
    }

    /* renamed from: j */
    public final void mo85500j() {
        C7285c.m22838a(getContext(), this.f87102a, 0).edit().clear().apply();
        this.f87109h.setVisibility(0);
    }

    /* renamed from: l */
    public final void mo85502l() {
        this.f87117p.setVisibility(8);
        this.f87118q.setVisibility(8);
        this.f87116o.setVisibility(8);
        this.f87113l.setVisibility(8);
    }

    public void onDestroy() {
        if (this.f87120s != null) {
            this.f87120s.mo66535W_();
            this.f87120s.mo59134U_();
        }
        super.onDestroy();
    }

    /* renamed from: n */
    private void m107862n() {
        this.f87119r = new LinearLayoutManager(getContext());
        this.f87107f.setLayoutManager(this.f87119r);
        this.f87108g = new HistoryAdapter(this);
        this.f87107f.setAdapter(this.f87108g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo85489h() {
        this.f87114m = new LinearLayoutManager(getContext());
        this.f87113l.setLayoutManager(this.f87114m);
        this.f87115n = LoadMoreAdapter.m86888a((C1262a<VH>) this.f87106e);
        this.f87113l.setOnFlingListener(new OnRecyclerViewFlingListener(this.f87113l, this));
        this.f87113l.setAdapter(this.f87115n);
    }

    /* renamed from: i */
    public final void mo85499i() {
        String string = C7285c.m22838a(getContext(), this.f87102a, 0).getString(this.f87102a, "");
        if (!string.equals("")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(string.split(",")));
            this.f87108g.mo85458a(arrayList);
            if (arrayList.size() > 2) {
                this.f87109h.setVisibility(0);
            }
        }
    }

    /* renamed from: k */
    public final void mo85501k() {
        if (this.f87120s != null) {
            String trim = this.f87105d.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                this.f87104c = trim;
                this.f87120s.mo56976a(Integer.valueOf(1), trim);
                this.f87107f.setVisibility(8);
                mo85503m().mo85435b();
                m107860a(trim);
                this.f87109h.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo85488g() {
        this.f87111j = (DmtTextView) m107861b((int) R.id.sy);
        this.f87111j.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchElementsFragment.this.mo85503m().mo85434a(this);
            }
        });
        this.f87105d = (EditText) m107861b((int) R.id.d0q);
        this.f87105d.setImeOptions(3);
        this.f87105d.setInputType(1);
        this.f87105d.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3 || i == 4 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                    SearchElementsFragment.this.mo85501k();
                }
                return false;
            }
        });
        this.f87105d.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchElementsFragment.this.f87107f.setVisibility(0);
                SearchElementsFragment.this.mo85502l();
                SearchElementsFragment.this.mo85499i();
            }
        });
        m107859a(this.f87105d);
        this.f87112k = (ImageView) m107861b((int) R.id.d0p);
        this.f87112k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchElementsFragment.this.f87105d.setText("");
            }
        });
        this.f87116o = (DmtLoadingLayout) m107861b((int) R.id.btw);
        this.f87113l = (RecyclerView) m107861b((int) R.id.cql);
        this.f87117p = (DmtTextView) m107861b((int) R.id.e79);
        this.f87118q = (DmtTextView) m107861b((int) R.id.e78);
        this.f87109h = (DmtTextView) m107861b((int) R.id.wk);
        this.f87109h.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SearchElementsFragment.this.mo85500j();
                SearchElementsFragment.this.f87108g.mo85457a();
                SearchElementsFragment.this.f87109h.setVisibility(8);
            }
        });
        this.f87107f = (RecyclerView) m107861b((int) R.id.cqk);
        mo85489h();
        m107862n();
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f87115n.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        this.f87116o.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        this.f87115n.mo67986a(2);
    }

    /* renamed from: b */
    private <T extends View> T m107861b(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m107863o();
        mo85488g();
        mo85499i();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87103b = getArguments().getString("page_from");
    }

    /* renamed from: a */
    private void m107859a(EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(editText, 0);
    }

    /* renamed from: a */
    public final void mo85498a(CharSequence charSequence) {
        this.f87105d.setText(charSequence);
        this.f87105d.setSelection(charSequence.length());
        mo85501k();
    }

    /* renamed from: a */
    public final List<String> mo85497a(int i) {
        SharedPreferences a = C7285c.m22838a(getContext(), this.f87102a, 0);
        ArrayList arrayList = new ArrayList(Arrays.asList(a.getString(this.f87102a, "").split(",")));
        arrayList.remove(i);
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) arrayList.get(i2));
                sb2.append(",");
                sb.append(sb2.toString());
            }
            a.edit().putString(this.f87102a, sb.toString()).apply();
        } else {
            a.edit().clear().apply();
        }
        if (arrayList.size() < 3) {
            this.f87109h.setVisibility(8);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m107860a(String str) {
        if (str.length() > 0) {
            SharedPreferences a = C7285c.m22838a(getContext(), this.f87102a, 0);
            ArrayList arrayList = new ArrayList(Arrays.asList(a.getString(this.f87102a, "").split(",")));
            if (arrayList.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (str.equals(arrayList.get(i))) {
                        arrayList.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                arrayList.add(0, str);
                if (arrayList.size() > 10) {
                    arrayList.remove(10);
                }
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) arrayList.get(i2));
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
                a.edit().putString(this.f87102a, sb.toString()).apply();
                return;
            }
            Editor edit = a.edit();
            String str2 = this.f87102a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(",");
            edit.putString(str2, sb3.toString()).apply();
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<E> list, boolean z) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            this.f87106e.mo85448a(list);
        }
        this.f87115n.mo67986a(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo59099a(List<E> list, boolean z) {
        this.f87117p.setVisibility(8);
        this.f87118q.setVisibility(8);
        this.f87116o.setVisibility(8);
        this.f87113l.setVisibility(0);
        this.f87106e.mo85448a(list);
        this.f87115n.mo67986a(z ? 1 : 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.qo, viewGroup, false);
    }
}
