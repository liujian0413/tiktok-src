package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p354j.C7486b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter */
public class SearchInfoStickerPresenter implements C0042h, C0043i, OnClickListener, OnEditorActionListener {

    /* renamed from: a */
    public C40682ad f105775a;

    /* renamed from: b */
    public C40676a f105776b;

    /* renamed from: c */
    public C7486b<String> f105777c;

    /* renamed from: d */
    private FragmentActivity f105778d;

    /* renamed from: e */
    private boolean f105779e;

    /* renamed from: f */
    private C0044j f105780f;

    /* renamed from: g */
    private List<C40816v> f105781g;

    /* renamed from: h */
    private int f105782h;

    /* renamed from: i */
    private int f105783i;

    /* renamed from: j */
    private boolean f105784j = true;

    /* renamed from: k */
    private TextWatcher f105785k = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            SearchInfoStickerPresenter.this.f105775a.mo100856a(obj);
            SearchInfoStickerPresenter.this.f105777c.onNext(obj);
            if (C6319n.m19593a(obj)) {
                SearchInfoStickerPresenter.this.mo100833a(0);
            }
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerPresenter$a */
    interface C40676a {
        /* renamed from: a */
        void mo100806a();
    }

    public Lifecycle getLifecycle() {
        return this.f105780f;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onActivityDestroy() {
        this.f105780f.mo117a(State.DESTROYED);
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_STOP)
    public void onActivityStop() {
        this.f105780f.mo117a(State.CREATED);
    }

    /* renamed from: d */
    private void m130088d() {
        this.f105775a.mo100851a();
        mo100833a(0);
    }

    /* renamed from: a */
    public final void mo100832a() {
        this.f105775a.mo100855a(this);
        this.f105775a.mo100854a((C6905a) new C40819y(this));
    }

    /* renamed from: b */
    public final void mo100837b() {
        if (!this.f105779e) {
            this.f105779e = true;
            this.f105775a.mo100860c();
            mo100833a(0);
        }
    }

    public void dismiss() {
        this.f105779e = false;
        this.f105775a.mo100863e();
        if (this.f105776b != null) {
            this.f105776b.mo100806a();
        }
    }

    /* renamed from: c */
    public final void mo100840c() {
        C0052o<Boolean> oVar = ((SearchInfoStickerViewModel) C0069x.m159a(this.f105778d).mo147a(SearchInfoStickerViewModel.class)).f105788a;
        if (oVar.getValue() == null || !((Boolean) oVar.getValue()).booleanValue()) {
            m130085b(this.f105782h);
        } else {
            m130089d(this.f105775a.mo100862d());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100838b(LiveDataWrapper liveDataWrapper) {
        m130083a(liveDataWrapper.f88768b, (ProviderEffectModel) liveDataWrapper.f88767a, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo100841c(LiveDataWrapper liveDataWrapper) {
        m130086b(liveDataWrapper.f88768b, (ProviderEffectModel) liveDataWrapper.f88767a, false);
    }

    /* renamed from: c */
    private void m130087c(String str) {
        C40805n.m130407a(this.f105778d).mo100819b(str, "giphy", 0, 30).observe(this, new C40680ab(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100834a(LiveDataWrapper liveDataWrapper) {
        m130086b(liveDataWrapper.f88768b, (ProviderEffectModel) liveDataWrapper.f88767a, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo100842d(LiveDataWrapper liveDataWrapper) {
        m130083a(liveDataWrapper.f88768b, (ProviderEffectModel) liveDataWrapper.f88767a, false);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.e1a) {
            dismiss();
            return;
        }
        if (view.getId() == R.id.pw) {
            m130088d();
        }
    }

    /* renamed from: b */
    private void m130085b(int i) {
        if (!this.f105784j) {
            this.f105775a.mo100859b(1);
        } else {
            C40805n.m130407a(this.f105778d).mo100812a("giphy", i, 30).observe(this, new C40679aa(this));
        }
    }

    /* renamed from: d */
    private void m130089d(String str) {
        if (!this.f105784j) {
            this.f105775a.mo100859b(1);
        } else {
            C40805n.m130407a(this.f105778d).mo100819b(str, "giphy", this.f105783i, 30).observe(this, new C40681ac(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100833a(int i) {
        if (!C6311g.m19573a(this.f105781g)) {
            ((SearchInfoStickerViewModel) C0069x.m159a(this.f105778d).mo147a(SearchInfoStickerViewModel.class)).f105788a.setValue(Boolean.valueOf(false));
            this.f105775a.mo100857a(this.f105781g, false);
            return;
        }
        C40805n.m130407a(this.f105778d).mo100812a("giphy", 0, 30).observe(this, new C40820z(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo100839b(String str) throws Exception {
        if (!C6319n.m19593a(str)) {
            mo100835a(str);
        }
    }

    /* renamed from: a */
    public final void mo100835a(String str) {
        if (C6319n.m19593a(str)) {
            C10761a.m31399c((Context) this.f105778d, (int) R.string.fic).mo25750a();
        } else {
            m130087c(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100836a(boolean z) {
        State state;
        C0044j jVar = this.f105780f;
        if (z) {
            state = State.RESUMED;
        } else {
            state = State.CREATED;
        }
        jVar.mo117a(state);
    }

    SearchInfoStickerPresenter(View view, FragmentActivity fragmentActivity) {
        this.f105778d = fragmentActivity;
        this.f105781g = new ArrayList();
        fragmentActivity.getLifecycle().mo55a(this);
        this.f105780f = new C0044j(fragmentActivity);
        this.f105775a = new C40682ad(view, this.f105778d, this.f105785k);
        this.f105777c = C7486b.m23223a();
        this.f105777c.mo19315d(600, TimeUnit.MILLISECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C40818x<Object>(this));
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo100835a(this.f105775a.mo100862d());
        return true;
    }

    /* renamed from: a */
    private void m130084a(ProviderEffectModel providerEffectModel, boolean z, boolean z2) {
        ((SearchInfoStickerViewModel) C0069x.m159a(this.f105778d).mo147a(SearchInfoStickerViewModel.class)).f105788a.setValue(Boolean.valueOf(z));
        List a = C40816v.m130433a(providerEffectModel.sticker_list);
        this.f105784j = providerEffectModel.has_more;
        if (z) {
            this.f105783i = providerEffectModel.cursor;
        } else {
            this.f105782h = providerEffectModel.cursor;
            this.f105781g.addAll(a);
        }
        this.f105775a.mo100857a(a, z2);
    }

    /* renamed from: a */
    private void m130083a(STATUS status, ProviderEffectModel providerEffectModel, boolean z) {
        switch (status) {
            case LOADING:
                this.f105775a.mo100858b();
                return;
            case ERROR:
                this.f105775a.mo100852a(2);
                return;
            case SUCCESS:
                this.f105775a.mo100859b(-1);
                if (!C6311g.m19573a(providerEffectModel.sticker_list)) {
                    this.f105775a.mo100852a(-1);
                    m130084a(providerEffectModel, z, false);
                    break;
                } else {
                    this.f105775a.mo100852a(1);
                    return;
                }
        }
    }

    /* renamed from: b */
    private void m130086b(STATUS status, ProviderEffectModel providerEffectModel, boolean z) {
        switch (status) {
            case LOADING:
                this.f105775a.mo100859b(0);
                return;
            case ERROR:
                this.f105775a.mo100859b(2);
                return;
            case SUCCESS:
                if (!C6311g.m19573a(providerEffectModel.sticker_list)) {
                    this.f105775a.mo100859b(-1);
                    m130084a(providerEffectModel, z, true);
                    break;
                } else {
                    this.f105775a.mo100859b(1);
                    return;
                }
        }
    }
}
