package com.p280ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0705a;
import android.support.p022v4.view.C0991u;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p073ad.symphony.util.C2202e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.challenge.p1083b.C23668a;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.Bidi;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.Regex;

/* renamed from: com.ss.android.ugc.aweme.mix.k */
public final class C33549k {

    /* renamed from: n */
    public static final C33551a f87612n = new C33551a(null);

    /* renamed from: A */
    private LinearLayout f87613A;

    /* renamed from: B */
    private LinearLayout f87614B;

    /* renamed from: a */
    public View f87615a;

    /* renamed from: b */
    public DmtTextView f87616b;

    /* renamed from: c */
    public DmtTextView f87617c;

    /* renamed from: d */
    public View f87618d;

    /* renamed from: e */
    public LinearLayout f87619e;

    /* renamed from: f */
    public View f87620f;

    /* renamed from: g */
    public MixStruct f87621g;

    /* renamed from: h */
    public final int f87622h = ((int) C9738o.m28708b((Context) this.f87623i, 300.0f));

    /* renamed from: i */
    public final Activity f87623i;

    /* renamed from: j */
    public final String f87624j;

    /* renamed from: k */
    public final String f87625k;

    /* renamed from: l */
    public final String f87626l;

    /* renamed from: m */
    public final C7563m<View, Long, C7581n> f87627m;

    /* renamed from: o */
    private RemoteImageView f87628o;

    /* renamed from: p */
    private DmtTextView f87629p;

    /* renamed from: q */
    private DmtTextView f87630q;

    /* renamed from: r */
    private View f87631r;

    /* renamed from: s */
    private DmtTextView f87632s;

    /* renamed from: t */
    private LinearLayout f87633t;

    /* renamed from: u */
    private DmtTextView f87634u;

    /* renamed from: v */
    private ImageView f87635v;

    /* renamed from: w */
    private DmtTextView f87636w;

    /* renamed from: x */
    private CheckableImageView f87637x;

    /* renamed from: y */
    private DmtTextView f87638y;

    /* renamed from: z */
    private C33539e f87639z;

    /* renamed from: com.ss.android.ugc.aweme.mix.k$a */
    public static final class C33551a {
        private C33551a() {
        }

        public /* synthetic */ C33551a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.k$b */
    static final class C33552b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33549k f87641a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f87642b;

        C33552b(C33549k kVar, MixStruct mixStruct) {
            this.f87641a = kVar;
            this.f87642b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87641a.mo85884b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.k$c */
    static final class C33553c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33549k f87643a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f87644b;

        C33553c(C33549k kVar, MixStruct mixStruct) {
            this.f87643a = kVar;
            this.f87644b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87643a.mo85884b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.k$d */
    public static final class C33554d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C33549k f87645a;

        public final void onGlobalLayout() {
            if (this.f87645a.f87616b.getLineCount() >= 2) {
                LayoutParams layoutParams = this.f87645a.f87619e.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (int) C2202e.m9512a(this.f87645a.f87623i, 20.0f);
                    this.f87645a.f87619e.setLayoutParams(layoutParams2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            } else {
                LayoutParams layoutParams3 = this.f87645a.f87619e.getLayoutParams();
                if (layoutParams3 != null) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = (int) C2202e.m9512a(this.f87645a.f87623i, 28.0f);
                    this.f87645a.f87619e.setLayoutParams(layoutParams4);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
            this.f87645a.f87616b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C33554d(C33549k kVar) {
            this.f87645a = kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.k$e */
    static final class C33555e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33549k f87646a;

        /* renamed from: b */
        final /* synthetic */ TextView f87647b;

        /* renamed from: c */
        final /* synthetic */ SpannableString f87648c;

        /* renamed from: d */
        final /* synthetic */ ImageView f87649d;

        /* renamed from: e */
        final /* synthetic */ TextView f87650e;

        /* renamed from: f */
        final /* synthetic */ ViewGroup f87651f;

        /* renamed from: g */
        final /* synthetic */ SpannableString f87652g;

        C33555e(C33549k kVar, TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
            this.f87646a = kVar;
            this.f87647b = textView;
            this.f87648c = spannableString;
            this.f87649d = imageView;
            this.f87650e = textView2;
            this.f87651f = viewGroup;
            this.f87652g = spannableString2;
        }

        public final void run() {
            int height = this.f87647b.getHeight();
            Integer num = C23668a.m77605a(this.f87647b, this.f87648c).f62421b;
            if (num != null && height == num.intValue()) {
                this.f87647b.setText(this.f87648c);
                return;
            }
            this.f87649d.setSelected(true);
            this.f87650e.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C33555e f87653a;

                {
                    this.f87653a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f87653a.f87649d.performClick();
                }
            });
            this.f87649d.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C33555e f87654a;

                {
                    this.f87654a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    String str;
                    ClickInstrumentation.onClick(view);
                    boolean isSelected = this.f87654a.f87649d.isSelected();
                    LayoutParams layoutParams = this.f87654a.f87651f.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (!isSelected) {
                            this.f87654a.f87647b.setText(this.f87654a.f87652g);
                            this.f87654a.f87649d.setImageResource(R.drawable.ar4);
                            marginLayoutParams.topMargin = (int) this.f87654a.f87649d.getResources().getDimension(R.dimen.gv);
                            this.f87654a.f87651f.setLayoutParams(marginLayoutParams);
                        }
                        if (isSelected) {
                            this.f87654a.f87647b.setText(this.f87654a.f87648c);
                            this.f87654a.f87649d.setImageResource(R.drawable.ar1);
                            marginLayoutParams.topMargin = (int) C9738o.m28708b(this.f87654a.f87649d.getContext(), 0.0f);
                            this.f87654a.f87651f.setLayoutParams(marginLayoutParams);
                        }
                        TextView textView = this.f87654a.f87650e;
                        Context context = this.f87654a.f87647b.getContext();
                        if (isSelected) {
                            i = R.string.b7q;
                        } else {
                            i = R.string.b2o;
                        }
                        textView.setText(context.getString(i));
                        this.f87654a.f87649d.setSelected(!isSelected);
                        MixStruct mixStruct = this.f87654a.f87646a.f87621g;
                        String str2 = null;
                        if (mixStruct != null) {
                            str = mixStruct.mixId;
                        } else {
                            str = null;
                        }
                        MixStruct mixStruct2 = this.f87654a.f87646a.f87621g;
                        if (mixStruct2 != null) {
                            User user = mixStruct2.author;
                            if (user != null) {
                                str2 = user.getUid();
                            }
                        }
                        C28506u.m93705a(str, str2, "compilation_detail", !isSelected);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            });
        }
    }

    /* renamed from: c */
    public final void mo85885c() {
        this.f87639z.mo85879d();
    }

    /* renamed from: a */
    public final int mo85882a() {
        int height = this.f87615a.getHeight();
        if (height != 0) {
            return height;
        }
        return this.f87622h;
    }

    /* renamed from: b */
    public final void mo85884b() {
        String str;
        MixStruct mixStruct = this.f87621g;
        String str2 = null;
        if (mixStruct != null) {
            str = mixStruct.mixId;
        } else {
            str = null;
        }
        MixStruct mixStruct2 = this.f87621g;
        if (mixStruct2 != null) {
            User user = mixStruct2.author;
            if (user != null) {
                str2 = user.getUid();
            }
        }
        C28506u.m93708b(str, str2, this.f87625k, "compilation_detail");
        m108423d();
    }

    /* renamed from: d */
    private final void m108423d() {
        User user;
        MixStruct mixStruct = this.f87621g;
        if (mixStruct != null) {
            User user2 = mixStruct.author;
            if (user2 != null) {
                String uid = user2.getUid();
                if (uid != null) {
                    if (uid.equals(this.f87624j)) {
                        this.f87623i.finish();
                    } else {
                        Context context = this.f87623i;
                        MixStruct mixStruct2 = this.f87621g;
                        if (mixStruct2 != null) {
                            user = mixStruct2.author;
                        } else {
                            user = null;
                        }
                        UserProfileActivity.m117388a(context, user, "compilation_detail");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85883a(com.p280ss.android.ugc.aweme.feed.model.MixStruct r15) {
        /*
            r14 = this;
            r14.f87621g = r15
            com.ss.android.ugc.aweme.mix.e r0 = r14.f87639z
            r0.mo85876a(r15)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.f87628o
            r1 = 0
            if (r15 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r15.cover
            goto L_0x0010
        L_0x000f:
            r2 = r1
        L_0x0010:
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87629p
            android.app.Activity r2 = r14.f87623i
            r3 = 2131824664(0x7f111018, float:1.9282162E38)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            if (r15 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.feed.model.MixStatisStruct r6 = r15.statis
            if (r6 == 0) goto L_0x002a
            long r6 = r6.updatedToEpisode
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x002b
        L_0x002a:
            r6 = r1
        L_0x002b:
            r7 = 0
            r5[r7] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87636w
            android.app.Activity r2 = r14.f87623i
            r3 = 2131825447(0x7f111327, float:1.928375E38)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            if (r15 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.feed.model.MixStatisStruct r6 = r15.statis
            if (r6 == 0) goto L_0x0049
            long r8 = r6.playVV
            goto L_0x004b
        L_0x0049:
            r8 = 0
        L_0x004b:
            java.lang.String r6 = com.p280ss.android.ugc.aweme.i18n.C30537o.m99738a(r8)
            r5[r7] = r6
            java.lang.String r2 = r2.getString(r3, r5)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            if (r15 == 0) goto L_0x005f
            java.lang.String r0 = r15.desc
            goto L_0x0060
        L_0x005f:
            r0 = r1
        L_0x0060:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r2 = 8
            if (r0 == 0) goto L_0x0070
            android.view.View r0 = r14.f87631r
            r0.setVisibility(r2)
            goto L_0x0096
        L_0x0070:
            android.view.View r0 = r14.f87631r
            r0.setVisibility(r7)
            if (r15 == 0) goto L_0x007e
            java.lang.String r0 = r15.desc
            if (r0 != 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r9 = r0
            goto L_0x0081
        L_0x007e:
            java.lang.String r0 = ""
            goto L_0x007c
        L_0x0081:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87632s
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.widget.LinearLayout r0 = r14.f87633t
            r11 = r0
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87634u
            r12 = r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.widget.ImageView r13 = r14.f87635v
            r8 = r14
            r8.m108421a(r9, r10, r11, r12, r13)
        L_0x0096:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "  "
            r3.<init>(r5)
            if (r15 == 0) goto L_0x00a6
            java.lang.String r1 = r15.mixName
        L_0x00a6:
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
            com.ss.android.ugc.aweme.mix.a r1 = new com.ss.android.ugc.aweme.mix.a
            android.app.Activity r3 = r14.f87623i
            android.content.Context r3 = (android.content.Context) r3
            r5 = 2131231830(0x7f080456, float:1.8079752E38)
            r1.<init>(r3, r5)
            r3 = 17
            r0.setSpan(r1, r7, r4, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f87616b
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87616b
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            com.ss.android.ugc.aweme.mix.k$d r1 = new com.ss.android.ugc.aweme.mix.k$d
            r1.<init>(r14)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1
            r0.addOnGlobalLayoutListener(r1)
            if (r15 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.author
            if (r0 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.profile.model.User r0 = r15.author
            java.lang.String r1 = "mixInfo.author"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.getNickname()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f87617c
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r14.f87617c
            com.ss.android.ugc.aweme.mix.k$b r1 = new com.ss.android.ugc.aweme.mix.k$b
            r1.<init>(r14, r15)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.view.View r0 = r14.f87618d
            com.ss.android.ugc.aweme.mix.k$c r1 = new com.ss.android.ugc.aweme.mix.k$c
            r1.<init>(r14, r15)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x010a:
            android.widget.LinearLayout r15 = r14.f87614B
            r15.setVisibility(r2)
            android.widget.LinearLayout r15 = r14.f87613A
            r15.setVisibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.C33549k.mo85883a(com.ss.android.ugc.aweme.feed.model.MixStruct):void");
    }

    /* renamed from: a */
    private static boolean m108422a(String str, View view) {
        int i;
        if (C43127fh.m136806a(view.getContext())) {
            i = -1;
        } else {
            i = -2;
        }
        return new Bidi(str, i).baseIsLeftToRight();
    }

    /* renamed from: a */
    private static String m108418a(String str, boolean z) {
        String b = C0705a.m2999a(!z).mo2852b(str);
        C7573i.m23582a((Object) b, "BidiFormatter.getInstanc…!isLTR).unicodeWrap(text)");
        if (z) {
            StringBuilder sb = new StringBuilder("‭");
            sb.append(b);
            sb.append("‭");
            return sb.toString();
        }
        return new Regex("(?<!^)(#)([a-zA-Z0-9])").replace((CharSequence) b, "‎$1‎$2");
    }

    /* renamed from: a */
    private static void m108420a(TextView textView, ViewGroup viewGroup, boolean z) {
        int i;
        boolean a = C43127fh.m136806a(viewGroup.getContext());
        ViewParent parent = textView.getParent();
        if (parent != null) {
            C0991u.m4209d((View) (ViewGroup) parent, z ^ true ? 1 : 0);
            int i2 = 3;
            if (z) {
                i = 3;
            } else {
                i = 5;
            }
            textView.setGravity(i);
            if (VERSION.SDK_INT >= 17) {
                if (!z) {
                    i2 = 2;
                }
                textView.setTextDirection(i2);
                viewGroup.setLayoutDirection(a ? 1 : 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    private static void m108419a(TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        imageView.setSelected(false);
        if (textView2 != null) {
            textView2.setText(C23481i.m77091b(R.string.b2o));
        }
        imageView.setRotation(0.0f);
        textView.getLayoutParams().height = -2;
        int dimension = (int) imageView.getResources().getDimension(R.dimen.gv);
        LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = dimension;
            viewGroup.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C33549k(Activity activity, String str, String str2, String str3, C7563m<? super View, ? super Long, C7581n> mVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(mVar, "outClickListener");
        this.f87623i = activity;
        this.f87624j = str;
        this.f87625k = str2;
        this.f87626l = str3;
        this.f87627m = mVar;
        View inflate = LayoutInflater.from(this.f87623i).inflate(R.layout.adr, null, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(acti…info_layout, null, false)");
        this.f87615a = inflate;
        View findViewById = this.f87615a.findViewById(R.id.aur);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.header_content_ll)");
        this.f87613A = (LinearLayout) findViewById;
        View findViewById2 = this.f87615a.findViewById(R.id.auv);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById(R.id.header_loading_ll)");
        this.f87614B = (LinearLayout) findViewById2;
        View findViewById3 = this.f87615a.findViewById(R.id.a4l);
        C7573i.m23582a((Object) findViewById3, "mRootView.findViewById(R.id.cover_iv)");
        this.f87628o = (RemoteImageView) findViewById3;
        View findViewById4 = this.f87615a.findViewById(R.id.dkn);
        C7573i.m23582a((Object) findViewById4, "mRootView.findViewById(R.id.title_tv)");
        this.f87616b = (DmtTextView) findViewById4;
        View findViewById5 = this.f87615a.findViewById(R.id.a4w);
        C7573i.m23582a((Object) findViewById5, "mRootView.findViewById(R.id.create_mix_tip_tv)");
        this.f87618d = findViewById5;
        View findViewById6 = this.f87615a.findViewById(R.id.dkf);
        C7573i.m23582a((Object) findViewById6, "mRootView.findViewById(R.id.title_ll)");
        this.f87619e = (LinearLayout) findViewById6;
        View findViewById7 = this.f87615a.findViewById(R.id.hy);
        C7573i.m23582a((Object) findViewById7, "mRootView.findViewById(R.id.author_tv)");
        this.f87617c = (DmtTextView) findViewById7;
        View findViewById8 = this.f87615a.findViewById(R.id.e87);
        C7573i.m23582a((Object) findViewById8, "mRootView.findViewById(R.id.update_tv)");
        this.f87629p = (DmtTextView) findViewById8;
        View findViewById9 = this.f87615a.findViewById(R.id.a2k);
        C7573i.m23582a((Object) findViewById9, "mRootView.findViewById(R.id.continue_watch_tv)");
        this.f87630q = (DmtTextView) findViewById9;
        View findViewById10 = this.f87615a.findViewById(R.id.ccg);
        C7573i.m23582a((Object) findViewById10, "mRootView.findViewById(R.id.play_vv_tv)");
        this.f87636w = (DmtTextView) findViewById10;
        View findViewById11 = this.f87615a.findViewById(R.id.a7d);
        C7573i.m23582a((Object) findViewById11, "mRootView.findViewById(R.id.des_container)");
        this.f87631r = findViewById11;
        View findViewById12 = this.f87615a.findViewById(R.id.dt5);
        C7573i.m23582a((Object) findViewById12, "mRootView.findViewById(R.id.tv_desc)");
        this.f87632s = (DmtTextView) findViewById12;
        View findViewById13 = this.f87615a.findViewById(R.id.ah5);
        C7573i.m23582a((Object) findViewById13, "mRootView.findViewById(R.id.expand_container)");
        this.f87633t = (LinearLayout) findViewById13;
        View findViewById14 = this.f87615a.findViewById(R.id.du9);
        C7573i.m23582a((Object) findViewById14, "mRootView.findViewById(R.id.tv_expand)");
        this.f87634u = (DmtTextView) findViewById14;
        View findViewById15 = this.f87615a.findViewById(R.id.b8z);
        C7573i.m23582a((Object) findViewById15, "mRootView.findViewById(R.id.iv_expand)");
        this.f87635v = (ImageView) findViewById15;
        View findViewById16 = this.f87615a.findViewById(R.id.bz7);
        C7573i.m23582a((Object) findViewById16, "mRootView.findViewById(R…d.mix_header_add_collect)");
        this.f87620f = findViewById16;
        View findViewById17 = this.f87615a.findViewById(R.id.bz8);
        C7573i.m23582a((Object) findViewById17, "mRootView.findViewById(R.id.mix_header_iv_collect)");
        this.f87637x = (CheckableImageView) findViewById17;
        View findViewById18 = this.f87615a.findViewById(R.id.bz9);
        C7573i.m23582a((Object) findViewById18, "mRootView.findViewById(R.id.mix_header_tv_collect)");
        this.f87638y = (DmtTextView) findViewById18;
        C33539e eVar = new C33539e(this.f87620f, this.f87637x, this.f87638y, "inner_up", this.f87625k, null, false, 96, null);
        this.f87639z = eVar;
        this.f87618d.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

            /* renamed from: a */
            final /* synthetic */ C33549k f87640a;

            public final void onGlobalLayout() {
                this.f87640a.f87617c.setMaxWidth((int) ((((float) C9738o.m28691a((Context) this.f87640a.f87623i)) - C9738o.m28708b((Context) this.f87640a.f87623i, 184.0f)) - ((float) this.f87640a.f87618d.getWidth())));
                this.f87640a.f87618d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }

            {
                this.f87640a = r1;
            }
        });
    }

    /* renamed from: a */
    private final void m108421a(String str, TextView textView, ViewGroup viewGroup, TextView textView2, ImageView imageView) {
        String str2 = str;
        TextView textView3 = textView;
        TextView textView4 = textView2;
        ImageView imageView2 = imageView;
        if (!TextUtils.isEmpty(str2)) {
            boolean a = m108422a(str2, (View) textView3);
            m108420a(textView3, viewGroup, a);
            CharSequence a2 = m108418a(str2, a);
            if (!TextUtils.equals(textView.getText(), a2)) {
                if (!TextUtils.isEmpty(textView.getText())) {
                    m108419a(textView, viewGroup, textView2, imageView);
                }
                int a3 = (int) (((float) C9738o.m28691a(textView.getContext())) - C9738o.m28708b(textView.getContext(), 32.0f));
                SpannableString spannableString = new SpannableString(a2);
                C33546h hVar = new C33546h(textView.getPaint(), a3, true, textView2.getText().toString(), 2);
                SpannableString a4 = hVar.mo61574a(spannableString);
                boolean z = hVar.f87605b;
                textView3.setText(a4);
                if (z) {
                    textView4.setVisibility(0);
                    imageView2.setVisibility(0);
                    C33555e eVar = new C33555e(this, textView, spannableString, imageView, textView2, viewGroup, a4);
                    textView3.post(eVar);
                    return;
                }
                textView4.setVisibility(8);
                imageView2.setVisibility(8);
            }
        }
    }
}
