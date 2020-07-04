package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27535a;
import com.p280ss.android.ugc.aweme.emoji.p1206d.C27536b;
import com.p280ss.android.ugc.aweme.emoji.utils.C27636g;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity */
public final class GifEmojiDetailActivity extends AmeSSActivity implements C27535a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f64130a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mStatusBar", "getMStatusBar()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mTitleBar", "getMTitleBar()Lcom/bytedance/ies/dmt/ui/titlebar/TextTitleBar;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mImage", "getMImage()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mAction", "getMAction()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(GifEmojiDetailActivity.class), "mMaxSize", "getMMaxSize()I"))};

    /* renamed from: b */
    public static final C24280a f64131b = new C24280a(null);

    /* renamed from: c */
    private Emoji f64132c;

    /* renamed from: d */
    private final C7541d f64133d = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24286g(this));

    /* renamed from: e */
    private final C7541d f64134e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24287h(this));

    /* renamed from: f */
    private final C7541d f64135f = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24288i(this));

    /* renamed from: g */
    private final C7541d f64136g = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24284e(this));

    /* renamed from: h */
    private final C7541d f64137h = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24283d(this));

    /* renamed from: i */
    private final C7541d f64138i = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C24285f(this));

    /* renamed from: j */
    private C7321c f64139j;

    /* renamed from: k */
    private boolean f64140k;

    /* renamed from: l */
    private HashMap f64141l;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$a */
    public static final class C24280a {
        private C24280a() {
        }

        public /* synthetic */ C24280a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$b */
    public static final class C24281b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64142a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C24281b(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64142a = gifEmojiDetailActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f64142a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$c */
    static final class C24282c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64143a;

        C24282c(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64143a = gifEmojiDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            GifEmojiDetailActivity gifEmojiDetailActivity = this.f64143a;
            C7573i.m23582a((Object) view, "it");
            gifEmojiDetailActivity.toggleCollectState(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$d */
    static final class C24283d extends Lambda implements C7561a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64144a;

        C24283d(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64144a = gifEmojiDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtTextView invoke() {
            return (DmtTextView) this.f64144a.mo63138a((int) R.id.a2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$e */
    static final class C24284e extends Lambda implements C7561a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64145a;

        C24284e(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64145a = gifEmojiDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RemoteImageView invoke() {
            return (RemoteImageView) this.f64145a.mo63138a((int) R.id.ay4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$f */
    static final class C24285f extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64146a;

        C24285f(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64146a = gifEmojiDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m79907a());
        }

        /* renamed from: a */
        private int m79907a() {
            return (int) (((float) C9738o.m28691a((Context) this.f64146a)) - (C9738o.m28708b((Context) this.f64146a, 32.0f) * 2.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$g */
    static final class C24286g extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64147a;

        C24286g(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64147a = gifEmojiDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f64147a.mo63138a((int) R.id.dal);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$h */
    static final class C24287h extends Lambda implements C7561a<DmtStatusView> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64148a;

        C24287h(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64148a = gifEmojiDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DmtStatusView invoke() {
            return (DmtStatusView) this.f64148a.mo63138a((int) R.id.dav);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity$i */
    static final class C24288i extends Lambda implements C7561a<TextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GifEmojiDetailActivity f64149a;

        C24288i(GifEmojiDetailActivity gifEmojiDetailActivity) {
            this.f64149a = gifEmojiDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextTitleBar invoke() {
            return (TextTitleBar) this.f64149a.mo63138a((int) R.id.djz);
        }
    }

    /* renamed from: a */
    private final View m79888a() {
        return (View) this.f64133d.getValue();
    }

    /* renamed from: b */
    private final DmtStatusView m79890b() {
        return (DmtStatusView) this.f64134e.getValue();
    }

    /* renamed from: c */
    private final TextTitleBar m79891c() {
        return (TextTitleBar) this.f64135f.getValue();
    }

    /* renamed from: d */
    private final RemoteImageView m79892d() {
        return (RemoteImageView) this.f64136g.getValue();
    }

    /* renamed from: e */
    private final DmtTextView m79893e() {
        return (DmtTextView) this.f64137h.getValue();
    }

    /* renamed from: f */
    private final int m79894f() {
        return ((Number) this.f64138i.getValue()).intValue();
    }

    /* renamed from: a */
    public final View mo63138a(int i) {
        if (this.f64141l == null) {
            this.f64141l = new HashMap();
        }
        View view = (View) this.f64141l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f64141l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo63139a(List<Emoji> list) {
    }

    /* renamed from: a */
    public final void mo63140a(List<Emoji> list, Emoji emoji, boolean z, String str) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: h */
    private final void m79896h() {
        View a = m79888a();
        C7573i.m23582a((Object) a, "mStatusBar");
        a.getLayoutParams().height = C10994a.m32204a((Context) this);
    }

    public final void onDestroy() {
        super.onDestroy();
        C7321c cVar = this.f64139j;
        if (cVar != null) {
            cVar.dispose();
        }
        C27536b.m90251a().mo70767b((C27535a) this);
    }

    /* renamed from: g */
    private final void m79895g() {
        if (VERSION.SDK_INT >= 19) {
            m79896h();
        }
        m79890b().setBuilder(C10803a.m31631a((Context) this));
        m79891c().setTitle((int) R.string.b05);
        m79891c().setOnTitleBarClickListener(new C24281b(this));
        m79893e().setOnClickListener(new C24282c(this));
    }

    /* renamed from: i */
    private final void m79897i() {
        m79889a(C27536b.m90251a().mo70762a(this.f64132c));
        Emoji emoji = this.f64132c;
        if (emoji != null) {
            UrlModel animateUrl = emoji.getAnimateUrl();
            if (animateUrl != null) {
                int f = m79894f();
                int f2 = m79894f();
                if (animateUrl.getWidth() > animateUrl.getHeight()) {
                    f2 = (animateUrl.getHeight() * f) / animateUrl.getWidth();
                } else if (animateUrl.getHeight() > animateUrl.getWidth()) {
                    f = (animateUrl.getWidth() * f2) / animateUrl.getHeight();
                }
                C27636g.m90608a(m79892d(), animateUrl, f, f2);
            }
        }
    }

    /* renamed from: a */
    private final void m79889a(boolean z) {
        int i;
        if (this.f64140k ^ z) {
            DmtTextView e = m79893e();
            if (z) {
                i = R.string.b0f;
            } else {
                i = R.string.b00;
            }
            e.setText(i);
            this.f64140k = z;
        }
    }

    public final void toggleCollectState(View view) {
        if (!C27326a.m89578a(view)) {
            Emoji emoji = this.f64132c;
            if (emoji != null) {
                m79890b().mo25942f();
                if (this.f64140k) {
                    C27536b.m90251a().mo70761a(emoji);
                } else {
                    UrlModel animateUrl = emoji.getAnimateUrl();
                    C27536b a = C27536b.m90251a();
                    long id = emoji.getId();
                    C7573i.m23582a((Object) animateUrl, "urlModel");
                    String uri = animateUrl.getUri();
                    List urlList = animateUrl.getUrlList();
                    C7573i.m23582a((Object) urlList, "urlModel.urlList");
                    a.mo70756a(id, uri, (String) C7525m.m23511f(urlList), emoji.getResourcesId(), emoji.getStickerType());
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Object obj;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bx);
        Serializable serializableExtra = getIntent().getSerializableExtra("gif_emoji");
        if (!(serializableExtra instanceof Emoji)) {
            serializableExtra = null;
        }
        this.f64132c = (Emoji) serializableExtra;
        Emoji emoji = this.f64132c;
        if (emoji != null && emoji.getId() <= 0) {
            C27536b a = C27536b.m90251a();
            C7573i.m23582a((Object) a, "SelfEmojiModel.inst()");
            List d = a.mo70771d();
            C7573i.m23582a((Object) d, "SelfEmojiModel.inst().cacheEmojiList");
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C7573i.m23585a((Object) (Emoji) obj, (Object) this.f64132c)) {
                    break;
                }
            }
            Emoji emoji2 = (Emoji) obj;
            if (emoji2 == null) {
                emoji2 = this.f64132c;
            }
            this.f64132c = emoji2;
        }
        m79895g();
        m79897i();
        C27536b.m90251a().mo70757a((C27535a) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.comment.ui.GifEmojiDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo63142b(List<Emoji> list, boolean z, String str) {
        m79890b().mo25939d();
        if (z) {
            m79889a(false);
        }
    }

    /* renamed from: a */
    public final void mo63141a(List<Emoji> list, boolean z, String str) {
        m79890b().mo25939d();
        if (z || C7573i.m23585a((Object) str, (Object) getString(R.string.b01))) {
            m79889a(true);
            if (list != null) {
                Emoji emoji = (Emoji) C7525m.m23513g(list);
                if (emoji != null) {
                    this.f64132c = emoji;
                }
            }
        }
    }
}
