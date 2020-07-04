package com.p280ss.android.ugc.aweme.shortvideo.sticker.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.transition.C0476c;
import android.support.transition.C0516o;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ttve.utils.C20505c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.SearchStickerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.widget.animation.C41684a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c.C42080a;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.SearchEffectResponse;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b */
public final class C40916b implements OnEditorActionListener {

    /* renamed from: i */
    public static final C40918a f106400i = new C40918a(null);

    /* renamed from: a */
    public final float f106401a = C20505c.m68010a(this.f106406f, 272.0f);

    /* renamed from: b */
    public View f106402b;

    /* renamed from: c */
    public ImageView f106403c;

    /* renamed from: d */
    public EditText f106404d;

    /* renamed from: e */
    public SearchStickerAdapter f106405e;

    /* renamed from: f */
    public final FragmentActivity f106406f;

    /* renamed from: g */
    public final ShortVideoContext f106407g;

    /* renamed from: h */
    public final EffectStickerManager f106408h;

    /* renamed from: j */
    private final float f106409j = C20505c.m68010a(this.f106406f, 52.0f);

    /* renamed from: k */
    private View f106410k;

    /* renamed from: l */
    private View f106411l;

    /* renamed from: m */
    private View f106412m;

    /* renamed from: n */
    private ImageView f106413n;

    /* renamed from: o */
    private TextView f106414o;

    /* renamed from: p */
    private DmtStatusView f106415p;

    /* renamed from: q */
    private RecyclerView f106416q;

    /* renamed from: r */
    private final C40914a f106417r;

    /* renamed from: s */
    private int f106418s = -1;

    /* renamed from: t */
    private final View f106419t;

    /* renamed from: u */
    private final C40933d f106420u;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$a */
    public static final class C40918a {
        private C40918a() {
        }

        public /* synthetic */ C40918a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$b */
    public static final class C40919b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40916b f106422a;

        C40919b(C40916b bVar) {
            this.f106422a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C40916b.m130741c(this.f106422a).setVisibility(8);
            C40916b.m130741c(this.f106422a).setTranslationY(this.f106422a.f106401a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$c */
    static final class C40920c implements OnClickListener {

        /* renamed from: a */
        public static final C40920c f106423a = new C40920c();

        C40920c() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$d */
    static final class C40921d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106424a;

        C40921d(C40916b bVar) {
            this.f106424a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106424a.mo101204a(this.f106424a.mo101209f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$e */
    static final class C40922e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106425a;

        C40922e(C40916b bVar) {
            this.f106425a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77056b(C40916b.m130738a(this.f106425a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$f */
    static final class C40923f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106426a;

        C40923f(C40916b bVar) {
            this.f106426a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106426a.mo101204a(this.f106426a.mo101209f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$g */
    static final class C40924g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106427a;

        C40924g(C40916b bVar) {
            this.f106427a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C40916b.m130738a(this.f106427a).setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$h */
    public static final class C40925h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C40916b f106428a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C40925h(C40916b bVar) {
            this.f106428a = bVar;
        }

        public final void afterTextChanged(Editable editable) {
            int i;
            C7573i.m23587b(editable, "s");
            String obj = editable.toString();
            ImageView b = C40916b.m130740b(this.f106428a);
            if (TextUtils.isEmpty(obj)) {
                i = 8;
            } else {
                i = 0;
            }
            b.setVisibility(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$i */
    static final class C40926i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106429a;

        C40926i(C40916b bVar) {
            this.f106429a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42962b.f111525a.mo104671a("enter_prop_search", C22984d.m75611a().mo59973a("creation_id", this.f106429a.f106407g.f99787w).mo59973a("shoot_way", this.f106429a.f106407g.f99788x).mo59973a("enter_from", "video_shoot_page").f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$j */
    static final class C40927j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106430a;

        C40927j(C40916b bVar) {
            this.f106430a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f106430a.f106405e.f105575a != -1) {
                ((SearchStickerViewModel) C0069x.m159a(this.f106430a.f106406f).mo147a(SearchStickerViewModel.class)).f106396a.setValue(this.f106430a.f106408h.f104783a);
            }
            this.f106430a.mo101205b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$k */
    static final class C40928k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40916b f106431a;

        C40928k(C40916b bVar) {
            this.f106431a = bVar;
        }

        public final void run() {
            C40916b.m130741c(this.f106431a).setTranslationY(this.f106431a.f106401a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$l */
    static final class C40929l<T> implements C0053p<LiveDataWrapper<SearchEffectResponse>> {

        /* renamed from: a */
        final /* synthetic */ C40916b f106432a;

        /* renamed from: b */
        final /* synthetic */ String f106433b;

        C40929l(C40916b bVar, String str) {
            this.f106432a = bVar;
            this.f106433b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<SearchEffectResponse> liveDataWrapper) {
            if (liveDataWrapper != null) {
                STATUS status = liveDataWrapper.f88768b;
                if (status != null) {
                    switch (C40932c.f106436a[status.ordinal()]) {
                        case 1:
                            this.f106432a.mo101208e();
                            return;
                        case 2:
                            this.f106432a.mo101207d();
                            return;
                        case 3:
                            this.f106432a.mo101203a((SearchEffectResponse) liveDataWrapper.f88767a, this.f106433b);
                            break;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$m */
    static final class C40930m implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C40916b f106434a;

        C40930m(C40916b bVar) {
            this.f106434a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C40916b.m130741c(this.f106434a);
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                c.setTranslationY(((Float) animatedValue).floatValue() * this.f106434a.f106401a);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.search.b$n */
    public static final class C40931n extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C40916b f106435a;

        C40931n(C40916b bVar) {
            this.f106435a = bVar;
        }

        public final void onAnimationEnd(Animator animator) {
            KeyboardUtils.m77056b(C40916b.m130738a(this.f106435a));
        }
    }

    /* renamed from: d */
    public final void mo101207d() {
        DmtStatusView dmtStatusView = this.f106415p;
        if (dmtStatusView == null) {
            C7573i.m23583a("statusView");
        }
        dmtStatusView.mo25934a(false);
    }

    /* renamed from: c */
    public final void mo101206c() {
        EditText editText = this.f106404d;
        if (editText == null) {
            C7573i.m23583a("searchEditText");
        }
        KeyboardUtils.m77057c(editText);
    }

    /* renamed from: e */
    public final void mo101208e() {
        RecyclerView recyclerView = this.f106416q;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setVisibility(8);
        DmtStatusView dmtStatusView = this.f106415p;
        if (dmtStatusView == null) {
            C7573i.m23583a("statusView");
        }
        dmtStatusView.mo25942f();
    }

    /* renamed from: f */
    public final String mo101209f() {
        EditText editText = this.f106404d;
        if (editText == null) {
            C7573i.m23583a("searchEditText");
        }
        return editText.getText().toString();
    }

    /* renamed from: h */
    private final void m130743h() {
        View view = this.f106402b;
        if (view == null) {
            C7573i.m23583a("curView");
        }
        view.setVisibility(0);
        View view2 = this.f106402b;
        if (view2 == null) {
            C7573i.m23583a("curView");
        }
        view2.setAlpha(1.0f);
        DmtStatusView dmtStatusView = this.f106415p;
        if (dmtStatusView == null) {
            C7573i.m23583a("statusView");
        }
        dmtStatusView.mo25939d();
        EditText editText = this.f106404d;
        if (editText == null) {
            C7573i.m23583a("searchEditText");
        }
        editText.setText("");
        EditText editText2 = this.f106404d;
        if (editText2 == null) {
            C7573i.m23583a("searchEditText");
        }
        editText2.requestFocus();
        this.f106405e.mo58045a((List<? extends StickerWrapper>) new ArrayList<Object>());
    }

    /* renamed from: a */
    public final void mo101201a() {
        ((SearchStickerViewModel) C0069x.m159a(this.f106406f).mo147a(SearchStickerViewModel.class)).f106397b.setValue(Boolean.valueOf(true));
        m130743h();
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(200);
        C7573i.m23582a((Object) duration, "animator");
        duration.setInterpolator(new C41684a(0.15f, 0.12f, 1.0f, 0.0f));
        duration.addUpdateListener(new C40930m(this));
        duration.addListener(new C40931n(this));
        duration.start();
        this.f106420u.mo100716a();
    }

    /* renamed from: b */
    public final void mo101205b() {
        ((SearchStickerViewModel) C0069x.m159a(this.f106406f).mo147a(SearchStickerViewModel.class)).f106397b.setValue(Boolean.valueOf(false));
        EditText editText = this.f106404d;
        if (editText == null) {
            C7573i.m23583a("searchEditText");
        }
        KeyboardUtils.m77057c(editText);
        View view = this.f106402b;
        if (view == null) {
            C7573i.m23583a("curView");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setDuration(250);
        ofFloat.start();
        ofFloat.addListener(new C40919b(this));
        this.f106420u.mo100717b();
    }

    /* renamed from: g */
    private final void m130742g() {
        View findViewById = this.f106419t.findViewById(R.id.dcs);
        if (findViewById != null) {
            View inflate = ((ViewStub) findViewById).inflate();
            C7573i.m23582a((Object) inflate, "(rootView.findViewById(R…r) as ViewStub).inflate()");
            this.f106402b = inflate;
            View view = this.f106402b;
            if (view == null) {
                C7573i.m23583a("curView");
            }
            View findViewById2 = view.findViewById(R.id.e1a);
            C7573i.m23582a((Object) findViewById2, "curView.findViewById(R.id.tv_search_action)");
            this.f106414o = (TextView) findViewById2;
            View view2 = this.f106402b;
            if (view2 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById3 = view2.findViewById(R.id.cuz);
            C7573i.m23582a((Object) findViewById3, "curView.findViewById(R.id.rl_search_container)");
            this.f106412m = findViewById3;
            View view3 = this.f106402b;
            if (view3 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById4 = view3.findViewById(R.id.d0a);
            C7573i.m23582a((Object) findViewById4, "curView.findViewById(R.id.search_back)");
            this.f106413n = (ImageView) findViewById4;
            View view4 = this.f106402b;
            if (view4 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById5 = view4.findViewById(R.id.pw);
            C7573i.m23582a((Object) findViewById5, "curView.findViewById(R.id.btn_clear)");
            this.f106403c = (ImageView) findViewById5;
            View view5 = this.f106402b;
            if (view5 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById6 = view5.findViewById(R.id.dav);
            C7573i.m23582a((Object) findViewById6, "curView.findViewById(R.id.status_view)");
            this.f106415p = (DmtStatusView) findViewById6;
            View view6 = this.f106402b;
            if (view6 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById7 = view6.findViewById(R.id.e19);
            C7573i.m23582a((Object) findViewById7, "curView.findViewById(R.id.tv_search)");
            this.f106404d = (EditText) findViewById7;
            View view7 = this.f106402b;
            if (view7 == null) {
                C7573i.m23583a("curView");
            }
            View findViewById8 = view7.findViewById(R.id.d1k);
            C7573i.m23582a((Object) findViewById8, "curView.findViewById(R.id.search_sticker_list)");
            this.f106416q = (RecyclerView) findViewById8;
            View inflate2 = LayoutInflater.from(this.f106406f).inflate(R.layout.gz, null, false);
            C7573i.m23582a((Object) inflate2, "LayoutInflater.from(acti…error_retry, null, false)");
            this.f106410k = inflate2;
            View view8 = this.f106410k;
            if (view8 == null) {
                C7573i.m23583a("errorView");
            }
            View findViewById9 = view8.findViewById(R.id.afm);
            C7573i.m23582a((Object) findViewById9, "errorView.findViewById(R.id.error_retry_button)");
            this.f106411l = findViewById9;
            View view9 = this.f106410k;
            if (view9 == null) {
                C7573i.m23583a("errorView");
            }
            view9.setOnClickListener(C40920c.f106423a);
            View view10 = this.f106411l;
            if (view10 == null) {
                C7573i.m23583a("retryView");
            }
            view10.setOnClickListener(new C40921d(this));
            View view11 = this.f106412m;
            if (view11 == null) {
                C7573i.m23583a("searchContainer");
            }
            view11.setOnClickListener(new C40922e(this));
            DmtStatusView dmtStatusView = this.f106415p;
            if (dmtStatusView == null) {
                C7573i.m23583a("statusView");
            }
            C10803a a = C10803a.m31631a((Context) this.f106406f);
            View view12 = this.f106410k;
            if (view12 == null) {
                C7573i.m23583a("errorView");
            }
            dmtStatusView.setBuilder(a.mo25966c(view12).mo25954a((int) R.string.al9).mo25965c(1));
            TextView textView = this.f106414o;
            if (textView == null) {
                C7573i.m23583a("searchTextView");
            }
            textView.setOnClickListener(new C40923f(this));
            ImageView imageView = this.f106403c;
            if (imageView == null) {
                C7573i.m23583a("clearText");
            }
            imageView.setOnClickListener(new C40924g(this));
            EditText editText = this.f106404d;
            if (editText == null) {
                C7573i.m23583a("searchEditText");
            }
            editText.addTextChangedListener(new C40925h(this));
            EditText editText2 = this.f106404d;
            if (editText2 == null) {
                C7573i.m23583a("searchEditText");
            }
            editText2.setOnEditorActionListener(this);
            EditText editText3 = this.f106404d;
            if (editText3 == null) {
                C7573i.m23583a("searchEditText");
            }
            editText3.setOnClickListener(new C40926i(this));
            ImageView imageView2 = this.f106413n;
            if (imageView2 == null) {
                C7573i.m23583a("back");
            }
            imageView2.setOnClickListener(new C40927j(this));
            View view13 = this.f106402b;
            if (view13 == null) {
                C7573i.m23583a("curView");
            }
            view13.post(new C40928k(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m130738a(C40916b bVar) {
        EditText editText = bVar.f106404d;
        if (editText == null) {
            C7573i.m23583a("searchEditText");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m130740b(C40916b bVar) {
        ImageView imageView = bVar.f106403c;
        if (imageView == null) {
            C7573i.m23583a("clearText");
        }
        return imageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m130741c(C40916b bVar) {
        View view = bVar.f106402b;
        if (view == null) {
            C7573i.m23583a("curView");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo101204a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C42962b.f111525a.mo104671a("search_prop", C22984d.m75611a().mo59973a("creation_id", this.f106407g.f99787w).mo59973a("shoot_way", this.f106407g.f99788x).mo59973a("enter_from", "video_shoot_page").mo59973a("enter_method", "normal_search").mo59973a("search_keyword", str).f60753a);
            EditText editText = this.f106404d;
            if (editText == null) {
                C7573i.m23583a("searchEditText");
            }
            KeyboardUtils.m77057c(editText);
            this.f106417r.mo101200a("default", str, 0, 0, null).observe(this.f106406f, new C40929l(this, str));
        }
    }

    /* renamed from: a */
    private final void m130739a(Effect effect, List<Effect> list) {
        if (effect == null) {
            this.f106418s = -1;
            return;
        }
        int i = 0;
        for (Effect effectId : list) {
            if (C7573i.m23585a((Object) effectId.getEffectId(), (Object) effect.getEffectId())) {
                list.remove(i);
                list.add(0, effect);
                this.f106418s = 0;
                return;
            }
            i++;
        }
        this.f106418s = -1;
    }

    /* renamed from: a */
    public final void mo101202a(int i, boolean z) {
        View view = this.f106402b;
        if (view == null) {
            C7573i.m23583a("curView");
        }
        LayoutParams layoutParams = view.getLayoutParams();
        C7573i.m23582a((Object) layoutParams, "curView.layoutParams");
        if (z) {
            layoutParams.height = (int) (this.f106409j + ((float) i));
        } else {
            layoutParams.height = (int) this.f106401a;
        }
        C0476c cVar = new C0476c();
        View view2 = this.f106402b;
        if (view2 == null) {
            C7573i.m23583a("curView");
        }
        cVar.mo2131b(view2);
        cVar.mo2116a((TimeInterpolator) new C41684a(0.15f, 0.12f, 1.0f, 0.0f));
        cVar.mo2115a(250);
        View view3 = this.f106402b;
        if (view3 == null) {
            C7573i.m23583a("curView");
        }
        if (view3 != null) {
            C0516o.m2171a((ViewGroup) view3, cVar);
            View view4 = this.f106402b;
            if (view4 == null) {
                C7573i.m23583a("curView");
            }
            view4.setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void mo101203a(SearchEffectResponse searchEffectResponse, String str) {
        if (searchEffectResponse != null) {
            if (searchEffectResponse.effects.size() == 0) {
                DmtStatusView dmtStatusView = this.f106415p;
                if (dmtStatusView == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView.mo25936b(false);
                C42962b.f111525a.mo104671a("search_prop_empty", C22984d.m75611a().mo59973a("creation_id", this.f106407g.f99787w).mo59973a("shoot_way", this.f106407g.f99788x).mo59973a("enter_from", "video_shoot_page").mo59973a("enter_method", "normal_search").mo59973a("search_keyword", str).f60753a);
                return;
            }
            DmtStatusView dmtStatusView2 = this.f106415p;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("statusView");
            }
            dmtStatusView2.mo25939d();
            RecyclerView recyclerView = this.f106416q;
            if (recyclerView == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView.setVisibility(0);
            this.f106408h.mo100229c(searchEffectResponse.effects);
            this.f106408h.mo100227b(searchEffectResponse.collection);
            Effect effect = this.f106408h.f104783a;
            List<Effect> list = searchEffectResponse.effects;
            C7573i.m23582a((Object) list, "response.effects");
            m130739a(effect, list);
            this.f106405e.mo58045a(StickerWrapper.m129069a(searchEffectResponse.effects, (String) null));
            RecyclerView recyclerView2 = this.f106416q;
            if (recyclerView2 == null) {
                C7573i.m23583a("recyclerView");
            }
            recyclerView2.mo5541b(0);
            if (this.f106418s != -1) {
                this.f106405e.f105575a = 0;
                this.f106420u.mo100718c();
            }
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo101204a(mo101209f());
        return true;
    }

    public C40916b(View view, FragmentActivity fragmentActivity, ShortVideoContext shortVideoContext, EffectStickerManager effectStickerManager, EffectPlatform effectPlatform, C40933d dVar) {
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(shortVideoContext, "shortVideoContext");
        C7573i.m23587b(effectStickerManager, "effectStickerManager");
        C7573i.m23587b(effectPlatform, "effectPlatform");
        C7573i.m23587b(dVar, "listener");
        this.f106419t = view;
        this.f106406f = fragmentActivity;
        this.f106407g = shortVideoContext;
        this.f106408h = effectStickerManager;
        this.f106420u = dVar;
        m130742g();
        this.f106417r = new C40914a(effectPlatform);
        new C42078c(this.f106406f).mo103394a(new C42080a(this) {

            /* renamed from: a */
            final /* synthetic */ C40916b f106421a;

            /* renamed from: c */
            public final void mo96461c(int i) {
            }

            {
                this.f106421a = r1;
            }

            /* renamed from: a */
            public final void mo96459a(int i) {
                this.f106421a.mo101202a(i, true);
            }

            /* renamed from: b */
            public final void mo96460b(int i) {
                this.f106421a.mo101202a(i, false);
            }
        });
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager((Context) this.f106406f, 5, 1, false);
        RecyclerView recyclerView = this.f106416q;
        if (recyclerView == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView2 = this.f106416q;
        if (recyclerView2 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView2.setItemViewCacheSize(5);
        this.f106405e = new SearchStickerAdapter(this.f106406f, this.f106407g, this.f106408h);
        this.f106405e.mo66516d(false);
        RecyclerView recyclerView3 = this.f106416q;
        if (recyclerView3 == null) {
            C7573i.m23583a("recyclerView");
        }
        recyclerView3.setAdapter(this.f106405e);
    }
}
