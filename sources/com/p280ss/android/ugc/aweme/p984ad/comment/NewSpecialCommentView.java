package com.p280ss.android.ugc.aweme.p984ad.comment;

import android.app.Dialog;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.downloadlib.C19535g;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22377b;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22381f;
import com.p280ss.android.ugc.aweme.p984ad.p985a.C22384i;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22386b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView */
public final class NewSpecialCommentView extends LinearLayout implements C0053p<C23083a>, OnClickListener {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59770a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(NewSpecialCommentView.class), "downloadStatusChangeListener", "getDownloadStatusChangeListener()Lcom/ss/android/ugc/aweme/ad/comment/NewSpecialCommentView$CommentDownloadStatusChangeListener;"))};

    /* renamed from: b */
    public LinkData f59771b;

    /* renamed from: c */
    public Aweme f59772c;

    /* renamed from: d */
    public DmtTextView f59773d;

    /* renamed from: e */
    public C22386b f59774e;

    /* renamed from: f */
    private CircleImageView f59775f;

    /* renamed from: g */
    private DmtTextView f59776g;

    /* renamed from: h */
    private DmtTextView f59777h;

    /* renamed from: i */
    private DmtTextView f59778i;

    /* renamed from: j */
    private View f59779j;

    /* renamed from: k */
    private ImageView f59780k;

    /* renamed from: l */
    private ImageView f59781l;

    /* renamed from: m */
    private final C7541d f59782m;

    /* renamed from: n */
    private boolean f59783n;

    /* renamed from: o */
    private DataCenter f59784o;

    /* renamed from: p */
    private final float f59785p;

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$a */
    final class C22401a implements C19388d {
        /* renamed from: a */
        public final void mo51374a(C19387c cVar, C19384a aVar) {
            C7573i.m23587b(cVar, "downloadModel");
        }

        /* renamed from: a */
        public final void mo51373a() {
            String str;
            boolean z;
            LinkData linkData = NewSpecialCommentView.this.f59771b;
            if (linkData != null) {
                str = linkData.buttonText;
            } else {
                str = null;
            }
            if (str != null) {
                CharSequence charSequence = str;
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
                    if (dmtTextView != null) {
                        dmtTextView.setText(charSequence);
                    }
                    return;
                }
            }
            DmtTextView dmtTextView2 = NewSpecialCommentView.this.f59773d;
            if (dmtTextView2 != null) {
                dmtTextView2.setText(R.string.bt0);
            }
        }

        public C22401a() {
        }

        /* renamed from: a */
        public final void mo51375a(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.db6);
            }
        }

        /* renamed from: b */
        public final void mo51377b(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.bt2);
            }
        }

        /* renamed from: c */
        public final void mo51379c(C19400e eVar) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.bsz);
            }
        }

        /* renamed from: b */
        public final void mo51378b(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
            if (dmtTextView != null) {
                dmtTextView.setText(R.string.agw);
            }
        }

        /* renamed from: a */
        public final void mo51376a(C19400e eVar, int i) {
            C7573i.m23587b(eVar, "shortInfo");
            String a = C1642a.m8034a("%d%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), "%"}, 2));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            String string = NewSpecialCommentView.this.getResources().getString(R.string.avq);
            DmtTextView dmtTextView = NewSpecialCommentView.this.f59773d;
            if (dmtTextView != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(' ');
                sb.append(a);
                dmtTextView.setText(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$b */
    static final class C22402b extends Lambda implements C7561a<C22401a> {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59787a;

        C22402b(NewSpecialCommentView newSpecialCommentView) {
            this.f59787a = newSpecialCommentView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22401a invoke() {
            return new C22401a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$c */
    static final class C22403c implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59788a;

        C22403c(NewSpecialCommentView newSpecialCommentView) {
            this.f59788a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f59788a.mo58911a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$d */
    static final class C22404d implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59789a;

        C22404d(NewSpecialCommentView newSpecialCommentView) {
            this.f59789a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f59789a.mo58911a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$e */
    static final class C22405e implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59790a;

        C22405e(NewSpecialCommentView newSpecialCommentView) {
            this.f59790a = newSpecialCommentView;
        }

        public final boolean onLongClick(View view) {
            return this.f59790a.mo58911a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$f */
    static final class C22406f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59791a;

        /* renamed from: b */
        final /* synthetic */ Dialog f59792b;

        C22406f(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f59791a = newSpecialCommentView;
            this.f59792b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22384i iVar = a.f59714h;
            Context context = this.f59791a.getContext();
            C22375a a2 = C22375a.m74074a();
            C7573i.m23582a((Object) a2, "AdDependManager.inst()");
            C22377b bVar = a2.f59709c;
            C7573i.m23582a((Object) bVar, "AdDependManager.inst().abOrSettingDepend");
            String a3 = bVar.mo58840a();
            LinkData linkData = this.f59791a.f59771b;
            if (linkData != null) {
                str = linkData.webUrl;
            } else {
                str = null;
            }
            iVar.mo58875a(context, a3, str);
            this.f59791a.mo58910a("comment_ad", "otherclick", "plan");
            C22432j.m74280a(this.f59792b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$g */
    static final class C22407g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59793a;

        /* renamed from: b */
        final /* synthetic */ Dialog f59794b;

        C22407g(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f59793a = newSpecialCommentView;
            this.f59794b = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22386b bVar = this.f59793a.f59774e;
            if (bVar != null) {
                bVar.mo58878a(true);
            }
            C22433k.m74281a(this.f59794b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$h */
    static final class C22408h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ NewSpecialCommentView f59795a;

        /* renamed from: b */
        final /* synthetic */ Dialog f59796b;

        C22408h(NewSpecialCommentView newSpecialCommentView, Dialog dialog) {
            this.f59795a = newSpecialCommentView;
            this.f59796b = dialog;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22384i iVar = a.f59714h;
            Context context = this.f59795a.getContext();
            Aweme aweme = this.f59795a.f59772c;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            iVar.mo58874a(context, str);
            C22434l.m74282a(this.f59796b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$i */
    static final class C22409i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f59797a;

        C22409i(Dialog dialog) {
            this.f59797a = dialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22435m.m74283a(this.f59797a);
        }
    }

    public NewSpecialCommentView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final C22401a getDownloadStatusChangeListener() {
        return (C22401a) this.f59782m.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m74233m();
    }

    /* renamed from: a */
    public final boolean mo58911a() {
        m74230j();
        mo58910a("comment_ad", "otherclick", "press");
        return true;
    }

    /* renamed from: c */
    private final void m74223c() {
        m74225e();
        m74224d();
        m74226f();
        m74227g();
        m74228h();
        m74232l();
    }

    /* renamed from: g */
    private final void m74227g() {
        String str;
        DmtTextView dmtTextView = this.f59778i;
        if (dmtTextView != null) {
            LinkData linkData = this.f59771b;
            if (linkData != null) {
                str = linkData.title;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
    }

    /* renamed from: i */
    private final void m74229i() {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59714h.mo58872a(getContext(), this.f59771b, this.f59772c);
    }

    /* renamed from: d */
    private final void m74224d() {
        CharSequence charSequence;
        LinkData linkData = this.f59771b;
        String str = null;
        if (linkData != null) {
            charSequence = linkData.label;
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            DmtTextView dmtTextView = this.f59777h;
            if (dmtTextView != null) {
                dmtTextView.setText("广告");
            }
            return;
        }
        DmtTextView dmtTextView2 = this.f59777h;
        if (dmtTextView2 != null) {
            LinkData linkData2 = this.f59771b;
            if (linkData2 != null) {
                str = linkData2.label;
            }
            dmtTextView2.setText(str);
        }
    }

    /* renamed from: e */
    private final void m74225e() {
        String str;
        DmtTextView dmtTextView = this.f59776g;
        if (dmtTextView != null) {
            LinkData linkData = this.f59771b;
            if (linkData != null) {
                str = linkData.source;
            } else {
                str = null;
            }
            dmtTextView.setText(str);
        }
        DmtTextView dmtTextView2 = this.f59776g;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10834d.f29332b);
        }
        DmtTextView dmtTextView3 = this.f59776g;
        if (dmtTextView3 != null) {
            TextPaint paint = dmtTextView3.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
    }

    /* renamed from: h */
    private final void m74228h() {
        String str;
        if (!m74231k()) {
            ImageView imageView = this.f59780k;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f59781l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            DmtTextView dmtTextView = this.f59773d;
            if (dmtTextView != null) {
                LinkData linkData = this.f59771b;
                if (linkData != null) {
                    str = linkData.buttonText;
                } else {
                    str = null;
                }
                dmtTextView.setText(str);
            }
        } else {
            ImageView imageView3 = this.f59780k;
            if (imageView3 != null) {
                imageView3.setVisibility(0);
            }
            ImageView imageView4 = this.f59781l;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        C34626j.m111876a(this.f59779j);
    }

    /* renamed from: k */
    private final boolean m74231k() {
        CharSequence charSequence;
        LinkData linkData = this.f59771b;
        String str = null;
        if (linkData != null) {
            charSequence = linkData.downloadUrl;
        } else {
            charSequence = null;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            LinkData linkData2 = this.f59771b;
            if (linkData2 != null) {
                str = linkData2.type;
            }
            if (TextUtils.equals(str, "app")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    private final void m74233m() {
        String str;
        if (m74231k() && this.f59783n) {
            C22375a a = C22375a.m74074a();
            C7573i.m23582a((Object) a, "AdDependManager.inst()");
            C22381f fVar = a.f59707a;
            C7573i.m23582a((Object) fVar, "AdDependManager.inst().downloadDepend");
            C19535g a2 = fVar.mo58870a();
            LinkData linkData = this.f59771b;
            if (linkData != null) {
                str = linkData.downloadUrl;
            } else {
                str = null;
            }
            a2.mo51669a(str, hashCode());
            this.f59783n = false;
        }
    }

    /* renamed from: f */
    private final void m74226f() {
        UrlModel urlModel;
        CircleImageView circleImageView = this.f59775f;
        if (circleImageView != null) {
            C13438a aVar = (C13438a) circleImageView.getHierarchy();
            if (aVar != null) {
                RoundingParams roundingParams = aVar.f35619a;
                if (roundingParams != null) {
                    roundingParams.mo32886c((float) C23486n.m77122a(0.5d));
                }
            }
        }
        CircleImageView circleImageView2 = this.f59775f;
        if (circleImageView2 != null) {
            C13438a aVar2 = (C13438a) circleImageView2.getHierarchy();
            if (aVar2 != null) {
                RoundingParams roundingParams2 = aVar2.f35619a;
                if (roundingParams2 != null) {
                    roundingParams2.mo32885b(C0683b.m2912c(getContext(), R.color.li));
                }
            }
        }
        RemoteImageView remoteImageView = this.f59775f;
        LinkData linkData = this.f59771b;
        if (linkData != null) {
            urlModel = linkData.avatarIcon;
        } else {
            urlModel = null;
        }
        C23323e.m76524b(remoteImageView, urlModel);
    }

    /* renamed from: b */
    private final void m74222b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.so, this);
        this.f59776g = (DmtTextView) inflate.findViewById(R.id.title);
        this.f59777h = (DmtTextView) inflate.findViewById(R.id.c_);
        this.f59775f = (CircleImageView) inflate.findViewById(R.id.ic);
        this.f59778i = (DmtTextView) inflate.findViewById(R.id.a1q);
        this.f59773d = (DmtTextView) inflate.findViewById(R.id.dnf);
        this.f59779j = inflate.findViewById(R.id.dn_);
        this.f59780k = (ImageView) inflate.findViewById(R.id.b8n);
        this.f59781l = (ImageView) inflate.findViewById(R.id.b8e);
        View view = this.f59779j;
        if (view != null) {
            view.setOnClickListener(this);
        }
        CircleImageView circleImageView = this.f59775f;
        if (circleImageView != null) {
            circleImageView.setOnClickListener(this);
        }
        DmtTextView dmtTextView = this.f59776g;
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(this);
        }
        DmtTextView dmtTextView2 = this.f59777h;
        if (dmtTextView2 != null) {
            dmtTextView2.setOnClickListener(this);
        }
        DmtTextView dmtTextView3 = this.f59778i;
        if (dmtTextView3 != null) {
            dmtTextView3.setOnClickListener(this);
        }
        setOnClickListener(this);
        DmtTextView dmtTextView4 = this.f59776g;
        if (dmtTextView4 != null) {
            dmtTextView4.setOnLongClickListener(new C22403c(this));
        }
        DmtTextView dmtTextView5 = this.f59778i;
        if (dmtTextView5 != null) {
            dmtTextView5.setOnLongClickListener(new C22404d(this));
        }
        setOnLongClickListener(new C22405e(this));
    }

    /* renamed from: j */
    private final void m74230j() {
        Dialog dialog = new Dialog(getContext(), R.style.f_);
        LayoutParams layoutParams = null;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.kk, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…ink_plan_feedbacks, null)");
        View findViewById = inflate.findViewById(R.id.cc8);
        View findViewById2 = inflate.findViewById(R.id.cc7);
        View findViewById3 = inflate.findViewById(R.id.cc9);
        findViewById.setOnClickListener(new C22406f(this, dialog));
        findViewById2.setOnClickListener(new C22407g(this, dialog));
        findViewById3.setOnClickListener(new C22408h(this, dialog));
        inflate.findViewById(R.id.ps).setOnClickListener(new C22409i(dialog));
        dialog.setContentView(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -2;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        dialog.setCanceledOnTouchOutside(true);
        dialog.show();
        mo58910a("comment_ad", "othershow", "adfloating");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m74232l() {
        /*
            r5 = this;
            r5.m74233m()
            boolean r0 = r5.m74231k()
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            boolean r0 = r5.f59783n
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            com.ss.android.c.a.a.c$a r0 = new com.ss.android.c.a.a.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59771b
            r2 = 0
            if (r1 == 0) goto L_0x0026
            java.lang.String r1 = r1.creativeId
            if (r1 == 0) goto L_0x0026
            long r3 = java.lang.Long.parseLong(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x0027
        L_0x0026:
            r1 = r2
        L_0x0027:
            if (r1 != 0) goto L_0x002c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x002c:
            long r3 = r1.longValue()
            com.ss.android.c.a.a.c$a r0 = r0.mo51019a(r3)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59771b
            if (r1 == 0) goto L_0x003b
            java.lang.String r1 = r1.logExtra
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            com.ss.android.c.a.a.c$a r0 = r0.mo51021a(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59771b
            if (r1 == 0) goto L_0x0047
            java.lang.String r1 = r1.downloadUrl
            goto L_0x0048
        L_0x0047:
            r1 = r2
        L_0x0048:
            com.ss.android.c.a.a.c$a r0 = r0.mo51030d(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59771b
            if (r1 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r1.clickTrackUrlList
            if (r1 == 0) goto L_0x0059
            java.util.List r1 = r1.getUrlList()
            goto L_0x005a
        L_0x0059:
            r1 = r2
        L_0x005a:
            com.ss.android.c.a.a.c$a r0 = r0.mo51022a(r1)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r5.f59771b
            if (r1 == 0) goto L_0x0064
            java.lang.String r2 = r1.packageName
        L_0x0064:
            com.ss.android.c.a.a.c$a r0 = r0.mo51028b(r2)
            com.ss.android.c.a.a.c r0 = r0.mo51026a()
            r1 = 1
            r5.f59783n = r1
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r2 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.f r1 = r1.f59707a
            java.lang.String r2 = "AdDependManager.inst().downloadDepend"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.downloadlib.g r1 = r1.mo58870a()
            android.content.Context r2 = r5.getContext()
            int r3 = r5.hashCode()
            com.ss.android.ugc.aweme.ad.comment.NewSpecialCommentView$a r4 = r5.getDownloadStatusChangeListener()
            com.ss.android.download.api.b.d r4 = (com.p280ss.android.download.api.p858b.C19388d) r4
            com.ss.android.download.api.b.c r0 = (com.p280ss.android.download.api.p858b.C19387c) r0
            r1.mo51666a(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.NewSpecialCommentView.m74232l():void");
    }

    public final void setOnDislikeCommentAdListener(C22386b bVar) {
        C7573i.m23587b(bVar, "dislikeCommentAdListener");
        this.f59774e = bVar;
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f59784o = dataCenter;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60133a("comment_aweme_and_link", pVar, true).mo60133a("comment_dialog_state", pVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        if (aVar != null) {
            String str = aVar.f60948a;
            int hashCode = str.hashCode();
            if (hashCode != -2103039046) {
                if (hashCode == 1823087802 && str.equals("comment_dialog_state")) {
                    Object obj = (Integer) aVar.mo60161a();
                    if (obj == null) {
                        obj = Boolean.valueOf(false);
                    }
                    if (!C7573i.m23585a(obj, (Object) Integer.valueOf(5)) && !C7573i.m23585a(obj, (Object) Integer.valueOf(3)) && !C7573i.m23585a(obj, (Object) Integer.valueOf(6))) {
                        if (C7573i.m23585a(obj, (Object) Integer.valueOf(7))) {
                            m74232l();
                        } else if (C7573i.m23585a(obj, (Object) Integer.valueOf(8))) {
                            m74233m();
                        }
                    }
                }
            } else if (str.equals("comment_aweme_and_link")) {
                Pair pair = (Pair) aVar.mo60161a();
                if (pair != null) {
                    Aweme aweme = (Aweme) pair.getFirst();
                    if (aweme != null) {
                        this.f59772c = aweme;
                        Pair pair2 = (Pair) aVar.mo60161a();
                        if (pair2 != null) {
                            LinkData linkData = (LinkData) pair2.getSecond();
                            if (linkData != null) {
                                this.f59771b = linkData;
                                LinkData linkData2 = this.f59771b;
                                if (linkData2 == null) {
                                    C7573i.m23580a();
                                }
                                Aweme aweme2 = this.f59772c;
                                if (aweme2 == null) {
                                    C7573i.m23580a();
                                }
                                mo58909a(linkData2, aweme2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r13)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
            int r13 = r13.getId()
            r0 = 2131302250(0x7f09176a, float:1.822258E38)
            if (r13 != r0) goto L_0x0088
            com.ss.android.ugc.aweme.commercialize.model.LinkData r13 = r12.f59771b
            r0 = 0
            if (r13 == 0) goto L_0x0023
            java.lang.String r13 = r13.creativeId
            if (r13 == 0) goto L_0x0023
            long r1 = java.lang.Long.parseLong(r13)
            java.lang.Long r13 = java.lang.Long.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r13 = r0
        L_0x0024:
            if (r13 == 0) goto L_0x0087
            r13.longValue()
            boolean r1 = r12.m74231k()
            if (r1 == 0) goto L_0x007a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = new com.ss.android.ugc.aweme.feed.model.AwemeRawAd
            r1.<init>()
            r1.setCreativeId(r13)
            com.ss.android.ugc.aweme.commercialize.model.LinkData r2 = r12.f59771b
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = r2.logExtra
            goto L_0x003f
        L_0x003e:
            r2 = r0
        L_0x003f:
            r1.setLogExtra(r2)
            com.ss.android.ugc.aweme.ad.a.a r2 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r3 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.ad.a.f r2 = r2.f59707a
            java.lang.String r3 = "comment_ad"
            java.lang.String r4 = "button"
            com.ss.android.download.api.b.b r10 = r2.mo58869a(r3, r1, r4)
            com.ss.android.ugc.aweme.ad.a.a r1 = com.p280ss.android.ugc.aweme.p984ad.p985a.C22375a.m74074a()
            java.lang.String r2 = "AdDependManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.ad.a.f r1 = r1.f59707a
            java.lang.String r2 = "AdDependManager.inst().downloadDepend"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.downloadlib.g r5 = r1.mo58870a()
            com.ss.android.ugc.aweme.commercialize.model.LinkData r1 = r12.f59771b
            if (r1 == 0) goto L_0x006f
            java.lang.String r0 = r1.downloadUrl
        L_0x006f:
            r6 = r0
            long r7 = r13.longValue()
            r9 = 2
            r11 = 0
            r5.mo51670a(r6, r7, r9, r10, r11)
            return
        L_0x007a:
            r12.m74229i()
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "button"
            r12.mo58910a(r13, r0, r1)
            return
        L_0x0087:
            return
        L_0x0088:
            r0 = 2131296591(0x7f09014f, float:1.8211103E38)
            if (r13 != r0) goto L_0x009a
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "photo"
            r12.mo58910a(r13, r0, r1)
            r12.m74229i()
            return
        L_0x009a:
            r0 = 2131297308(0x7f09041c, float:1.8212557E38)
            if (r13 != r0) goto L_0x00ac
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "title"
            r12.mo58910a(r13, r0, r1)
            r12.m74229i()
            return
        L_0x00ac:
            r0 = 2131302118(0x7f0916e6, float:1.8222313E38)
            if (r13 != r0) goto L_0x00be
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = "source"
            r12.mo58910a(r13, r0, r1)
            r12.m74229i()
            return
        L_0x00be:
            r0 = 2131296366(0x7f09006e, float:1.8210647E38)
            if (r13 != r0) goto L_0x00d0
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "otherclick"
            java.lang.String r1 = "adtag"
            r12.mo58910a(r13, r0, r1)
            r12.m74230j()
            return
        L_0x00d0:
            r12.m74229i()
            java.lang.String r13 = "comment_ad"
            java.lang.String r0 = "click"
            java.lang.String r1 = ""
            r12.mo58910a(r13, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p984ad.comment.NewSpecialCommentView.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo58909a(LinkData linkData, Aweme aweme) {
        C7573i.m23587b(linkData, "linkData");
        C7573i.m23587b(aweme, "aweme");
        this.f59771b = linkData;
        this.f59772c = aweme;
        m74223c();
    }

    public NewSpecialCommentView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59782m = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C22402b(this));
        m74222b();
        this.f59785p = C9738o.m28708b(context, 51.5f);
    }

    /* renamed from: a */
    public final void mo58910a(String str, String str2, String str3) {
        C22375a a = C22375a.m74074a();
        C7573i.m23582a((Object) a, "AdDependManager.inst()");
        a.f59713g.mo58847a(str2, getContext(), this.f59771b, this.f59772c, str3);
    }

    private /* synthetic */ NewSpecialCommentView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
