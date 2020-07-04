package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C25705n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateData;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p280ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26577d;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.SearchIntermediateView.C26960c;
import com.p280ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.p280ss.android.ugc.aweme.music.experiment.SearchSugCompletionExperiment;
import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import com.p280ss.android.ugc.aweme.utils.C43095eh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.BaseDiscoveryAndSearchFragment */
public abstract class BaseDiscoveryAndSearchFragment extends AmeBaseFragment implements C0053p<C26568a<TypeWords>>, C26960c {

    /* renamed from: e */
    protected SearchStateViewModel f70892e;

    /* renamed from: f */
    protected GuessWordsViewModel f70893f;

    /* renamed from: g */
    protected String f70894g;

    /* renamed from: h */
    protected Word f70895h;

    /* renamed from: i */
    private C43095eh f70896i;

    /* renamed from: j */
    private SearchIntermediateViewModel f70897j;

    /* renamed from: k */
    private String f70898k;
    ImageView mBackView;
    FrameLayout mBottomContainer;
    ImageButton mBtnClear;
    View mGapStatusBar;
    SearchIntermediateView mIntermediateView;
    EditText mSearchInputView;
    TextView mTvSearch;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo69517a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo69518a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo69528b(SearchResultParam searchResultParam);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo69532d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo69533e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo69534f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo69535g();

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public abstract void mo69539l();

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo69525a(String str) {
        int a = C27029ba.m88789a();
        for (int i = 0; i < a; i++) {
            if (TextUtils.equals(str, mo69516a(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo69524a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo69518a(view);
        }
        return false;
    }

    /* renamed from: p */
    private void mo69760p() {
        C25713b.m84475a(this.mGapStatusBar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo69538k() {
        getActivity().getWindow().setSoftInputMode(50);
    }

    /* renamed from: a */
    private void mo67888a() {
        mo69530c(mo69533e());
        mo69760p();
        mo69591o();
        mo69537j();
        mo69534f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final String mo69536i() {
        return C23338f.m76567e().mo60623a("place_holder", C23481i.m77091b(R.string.cv7));
    }

    /* renamed from: n */
    public final int mo69541n() {
        Integer num = (Integer) this.f70892e.searchState.getValue();
        if (num == null) {
            return mo69533e();
        }
        return num.intValue();
    }

    /* renamed from: o */
    private void mo69591o() {
        this.mIntermediateView.mo69729a(this, this);
        this.mIntermediateView.setOnDispatchTouchEventListener(new C27038d(this, C6384b.m19835a().mo15292a(SearchSugCompletionExperiment.class, true, "search_sug_completion", C6384b.m19835a().mo15295d().search_sug_completion, false)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo69540m() {
        String obj = this.mSearchInputView.getText().toString();
        if (this.mIntermediateView.mo69734b()) {
            this.mIntermediateView.mo69731a(obj);
            return;
        }
        this.mIntermediateView.mo69731a(obj);
        this.mIntermediateView.setOpenSugFromState(mo69541n());
        mo69530c(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo69537j() {
        this.mBackView.setOnClickListener(new C26993a(this));
        this.mBtnClear.setOnClickListener(new C27028b(this));
        this.mTvSearch.setOnTouchListener(new C27009an() {
            /* renamed from: b */
            public final void mo67959b(View view, MotionEvent motionEvent) {
                if (BaseDiscoveryAndSearchFragment.this.mSearchInputView != null) {
                    BaseDiscoveryAndSearchFragment.this.mo69529b(BaseDiscoveryAndSearchFragment.this.mSearchInputView.getText().toString());
                }
            }
        });
        this.f70896i.mo104752a(this.mSearchInputView);
        this.mSearchInputView.setHint(mo69536i());
        if (C6399b.m19944t()) {
            this.mSearchInputView.setFilters(new InputFilter[]{new C25705n()});
        }
        this.mSearchInputView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                BaseDiscoveryAndSearchFragment.this.mo69520a((CharSequence) editable.toString());
            }
        });
        this.mSearchInputView.setOnTouchListener(new C27037c(this));
        this.mSearchInputView.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    C26612d.f70187a.mo68302a(0);
                    BaseDiscoveryAndSearchFragment.this.mo69529b(BaseDiscoveryAndSearchFragment.this.mSearchInputView.getText().toString());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo69531c(View view) {
        mo69535g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo69529b(String str) {
        mo69521a(str, null, false);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onMessageEvent(C26577d dVar) {
        this.mSearchInputView.setHint(dVar.f70103a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69522a(boolean z) {
        this.mIntermediateView.mo69733b(z);
    }

    /* renamed from: b */
    public final void mo69526b(int i) {
        this.mSearchInputView.setHint(mo69516a(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo69527b(View view) {
        this.mSearchInputView.setText("");
        this.mSearchInputView.setCursorVisible(true);
        KeyboardUtils.m77056b(this.mSearchInputView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo69516a(int i) {
        if (C6399b.m19944t()) {
            if (i == C27029ba.f71320b) {
                return getResources().getString(R.string.dkr);
            }
            if (i == C27029ba.f71319a) {
                return getResources().getString(R.string.djk);
            }
        }
        return mo69536i();
    }

    /* renamed from: c */
    public void mo69530c(int i) {
        this.f70892e.searchState.setValue(Integer.valueOf(i));
        ((SearchStateData) C0069x.m157a((Fragment) this).mo147a(SearchStateData.class)).getSearchState().setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.mBottomContainer.setVisibility(4);
        } else {
            this.mBottomContainer.setVisibility(0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70892e = (SearchStateViewModel) C0069x.m159a(getActivity()).mo147a(SearchStateViewModel.class);
        this.f70896i = new C43095eh();
        mo69517a(getArguments());
        this.f70893f = GuessWordsViewModel.m89232a(getActivity());
        this.f70897j = (SearchIntermediateViewModel) C0069x.m159a(getActivity()).mo147a(SearchIntermediateViewModel.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C26568a<TypeWords> aVar) {
        if (aVar.f70088a) {
            TypeWords typeWords = (TypeWords) aVar.f70089b;
            if (typeWords != null && !C6307b.m19566a((Collection<T>) typeWords.words)) {
                Word word = (Word) typeWords.words.get(0);
                if (!C26654b.m87576d()) {
                    this.mSearchInputView.setHint(word.getWord());
                }
                this.f70895h = word;
                C6907h.m21524a("trending_words_show", (Map) C22984d.m75611a().mo59970a("words_position", 0).mo59973a("words_source", "search_bar_outer").mo59973a("words_content", word.getWord()).mo59973a("group_id", word.getId()).f60753a);
            }
        }
    }

    /* renamed from: a */
    public void mo69519a(SearchResultParam searchResultParam) {
        if (SearchStateViewModel.isSearchIntermediate(mo69541n()) && !TextUtils.isEmpty(searchResultParam.getKeyword())) {
            mo69528b(searchResultParam);
        }
    }

    /* renamed from: a */
    public final void mo69520a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.mBtnClear.getVisibility() == 8) {
            this.mBtnClear.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.mBtnClear.getVisibility() == 0) {
            this.mBtnClear.setVisibility(8);
        }
        if (!TextUtils.equals(this.f70898k, charSequence)) {
            this.f70898k = charSequence.toString();
            if (TextUtils.isEmpty(charSequence)) {
                if (mo69541n() != 1) {
                    mo69539l();
                }
            } else if (mo69541n() != 2) {
                mo69540m();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo67888a();
        mo69538k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69523a(boolean z, MotionEvent motionEvent) {
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (!C6399b.m19945u() || !z) {
                if (actionMasked == 0) {
                    KeyboardUtils.m77057c(this.mSearchInputView);
                    this.mSearchInputView.setCursorVisible(false);
                }
            } else if (actionMasked == 0 && this.f70897j != null && this.f70897j.canDismissKeyboardOnActionDown()) {
                KeyboardUtils.m77057c(this.mSearchInputView);
                this.mSearchInputView.setCursorVisible(false);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo69532d(), viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69521a(String str, String str2, boolean z) {
        String str3;
        boolean z2;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!z) {
                str3 = "normal_search";
            } else if (C26654b.m87578f()) {
                str3 = "recom_search";
            } else {
                str3 = "default_search_keyword";
            }
            int i = 0;
            if (!C26654b.m87577e() || (!this.mIntermediateView.mo69735c() && (!this.mIntermediateView.mo69734b() || this.mIntermediateView.getOpenSugFromState() == 2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (C6399b.m19944t() && C26654b.m87579g() && z) {
                z2 = true;
            }
            if (C6399b.m19945u() && C26654b.m87577e()) {
                z2 = false;
            }
            SearchResultParam realSearchWord = new SearchResultParam().setKeyword(trim).setRealSearchWord(str2);
            if (z) {
                i = 5;
            }
            mo69528b(realSearchWord.setSearchFrom(i).setOpenNewSearchContainer(z2).setEnterFrom(str3));
            KeyboardUtils.m77057c(this.mSearchInputView);
            this.f70896i.mo104754b("search");
        }
    }
}
