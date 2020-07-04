package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.app.Fragment;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.choosemusic.MusicSearchStateViewModel;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.C23933i;
import com.p280ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.p280ss.android.ugc.aweme.common.C25705n;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;
import com.p280ss.android.ugc.aweme.music.experiment.SearchSugCompletionExperiment;
import com.p280ss.android.ugc.aweme.music.p1408b.C33767b;
import com.p280ss.android.ugc.aweme.music.p1409c.C33781b;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicFragmentView */
public class ChooseMusicFragmentView {

    /* renamed from: a */
    private ChooseMusicFragment f63276a;

    /* renamed from: b */
    private int f63277b;

    /* renamed from: c */
    private TextWatcher f63278c;

    /* renamed from: d */
    private MusicSearchStateViewModel f63279d;
    View mBackView;
    TextView mCancelSearch;
    ImageView mClearView;
    LinearLayout mLinearSearch;
    FrameLayout mMainLayout;
    LinearLayout mRelativeSearch;
    LinearLayout mSearchEditTextContainer;
    EditText mSearchEditView;
    SearchResultView mSearchLayout;
    TextView mSearchTextView;
    View mSkipView;
    StarTcmItem starTcmItem;
    TextView txtClickRecommend;

    /* renamed from: l */
    private void m78605l() {
        this.mRelativeSearch.setOnClickListener(this.f63276a);
    }

    /* renamed from: c */
    public final void mo62129c() {
        this.mCancelSearch.setVisibility(4);
        this.mSearchTextView.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo62130d() {
        this.mCancelSearch.setVisibility(0);
        this.mSearchTextView.setVisibility(4);
    }

    /* renamed from: f */
    public final String mo62132f() {
        return this.mSearchEditView.getText().toString();
    }

    /* renamed from: h */
    public final void mo62134h() {
        C25713b.m84474a((Activity) this.f63276a.getActivity(), (View) this.mSearchEditView);
    }

    /* renamed from: b */
    public final void mo62128b() {
        if (this.mSearchLayout != null) {
            this.mSearchLayout.setVisibility(0);
            this.mMainLayout.setVisibility(8);
            this.mCancelSearch.setVisibility(0);
            this.mSearchTextView.setVisibility(4);
        }
    }

    /* renamed from: e */
    public final void mo62131e() {
        if (this.f63276a.getActivity() != null) {
            this.mSearchEditView.post(new C23961f(this));
        }
    }

    /* renamed from: i */
    public final String mo62135i() {
        if (this.mSearchEditView == null) {
            return "";
        }
        return this.mSearchEditView.getText().toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo62136j() {
        if (this.mSearchEditView != null) {
            this.mSearchEditView.requestFocus();
            KeyboardUtils.m77056b(this.mSearchEditView);
            C42961az.m136380a(new C33767b(false));
        }
    }

    /* renamed from: k */
    private void m78604k() {
        if (this.mSearchEditView != null) {
            String obj = this.mSearchEditView.getText().toString();
            if (this.f63276a != null) {
                if (!TextUtils.isEmpty(obj)) {
                    this.f63276a.mo62015f();
                    return;
                }
                this.f63276a.mo62014e();
            }
        }
    }

    /* renamed from: g */
    public final void mo62133g() {
        this.mSearchEditView.setText("");
        this.mMainLayout.setVisibility(0);
        this.mSearchLayout.setVisibility(8);
        this.mSearchTextView.setVisibility(0);
        this.mCancelSearch.setVisibility(4);
        KeyboardUtils.m77057c(this.mSearchEditView);
    }

    /* renamed from: a */
    public final void mo62121a() {
        m78605l();
        if (this.f63277b == 0) {
            this.mSkipView.setVisibility(8);
        }
        this.mSearchEditView.setOnEditorActionListener(this.f63276a);
        this.mSearchEditView.addTextChangedListener(this.f63278c);
        this.mSearchEditView.setOnTouchListener(new C23958c(this));
        if (C6399b.m19944t()) {
            this.mSearchEditView.setFilters(new InputFilter[]{new C25705n()});
        }
        this.mSearchEditTextContainer.setOnClickListener(this.f63276a);
        this.mSearchTextView.setOnClickListener(this.f63276a);
        this.mCancelSearch.setOnClickListener(this.f63276a);
        this.mBackView.setOnClickListener(this.f63276a);
        this.mSkipView.setOnClickListener(this.f63276a);
        this.txtClickRecommend.setOnClickListener(this.f63276a);
        this.mClearView.setOnClickListener(new C23959d(this));
        this.mSearchEditView.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(8);
                } else {
                    ChooseMusicFragmentView.this.mClearView.setVisibility(0);
                }
            }
        });
        if (!C33781b.m108911a("show_tcm_info", Boolean.valueOf(true), "music_sp") || ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60018b() || !C6399b.m19944t()) {
            this.starTcmItem.setVisibility(8);
        } else {
            this.starTcmItem.setVisibility(0);
        }
        this.starTcmItem.setUnderView(this.mMainLayout);
        this.f63276a.f63062e.f63151e = new C23933i() {
            /* renamed from: a */
            public final void mo62103a() {
                ChooseMusicFragmentView.this.starTcmItem.mo62144b();
            }

            /* renamed from: b */
            public final void mo62104b() {
                ChooseMusicFragmentView.this.starTcmItem.mo62143a();
            }
        };
        this.mSearchLayout.setOnDispatchTouchEventListener(new C23960e(this, C6384b.m19835a().mo15292a(SearchSugCompletionExperiment.class, true, "search_sug_completion", C6384b.m19835a().mo15295d().search_sug_completion, false)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62123a(View view) {
        this.mSearchEditView.setText("");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62124a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            KeyboardUtils.m77057c(this.mSearchEditView);
        }
    }

    /* renamed from: a */
    public final void mo62125a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mSearchEditView.setText(charSequence);
            this.mSearchEditView.setSelection(charSequence.length());
        }
    }

    /* renamed from: b */
    private ViewGroup m78603b(View view) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C0355d) && (((C0355d) layoutParams).f1407a instanceof ViewPagerBottomSheetBehavior)) {
                return viewGroup;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo62122a(Fragment fragment) {
        ViewGroup b = m78603b(this.f63276a.getView());
        if (fragment != null) {
            this.mLinearSearch.setVisibility(0);
            this.mRelativeSearch.setVisibility(8);
            if (b != null) {
                ViewPagerBottomSheetBehavior.m76628a(b).mo60684b(fragment.getView());
            }
        } else {
            this.mLinearSearch.setVisibility(8);
            this.mRelativeSearch.setVisibility(0);
            if (b != null) {
                ViewPagerBottomSheetBehavior.m76628a(b).mo60684b((View) null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62126a(boolean z, MotionEvent motionEvent) {
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (z) {
                if (actionMasked == 0 && this.f63279d != null && this.f63279d.mo61866f()) {
                    KeyboardUtils.m77057c(this.mSearchEditView);
                }
            } else if (actionMasked == 0) {
                KeyboardUtils.m77057c(this.mSearchEditView);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo62127a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            m78604k();
        }
        return false;
    }

    public ChooseMusicFragmentView(View view, ChooseMusicFragment chooseMusicFragment, int i, TextWatcher textWatcher) {
        this.f63276a = chooseMusicFragment;
        this.f63277b = i;
        this.f63278c = textWatcher;
        if (!(this.f63276a == null || this.f63276a.getActivity() == null)) {
            this.f63279d = (MusicSearchStateViewModel) C0069x.m159a(this.f63276a.getActivity()).mo147a(MusicSearchStateViewModel.class);
            this.f63279d.mo61864d().observe(this.f63276a, new C23957b(this));
        }
        ButterKnife.bind((Object) this, view);
    }
}
