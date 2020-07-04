package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.support.p022v4.view.animation.C0957c;
import android.text.Editable;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27525a;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27526b;
import com.p280ss.android.ugc.aweme.emoji.p1205c.C27527c;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6943d;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.ImShareSoftAndMiniEmojiExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C31055x;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C31806a;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.C31814b;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a.C7052b;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImShareDialog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c */
public final class C31743c implements C31806a {

    /* renamed from: h */
    public static final C31744a f83052h = new C31744a(null);

    /* renamed from: q */
    private static final float f83053q = ((float) C23486n.m77122a(80.0d));

    /* renamed from: r */
    private static final int f83054r = C23486n.m77122a(162.0d);

    /* renamed from: a */
    public final DmtEditText f83055a;

    /* renamed from: b */
    public C31814b f83056b;

    /* renamed from: c */
    public LinkedHashSet<IMContact> f83057c;

    /* renamed from: d */
    public final Activity f83058d;

    /* renamed from: e */
    public final C6892b<Boolean> f83059e;

    /* renamed from: f */
    public final SharePackage f83060f;

    /* renamed from: g */
    public final BaseContent f83061g;

    /* renamed from: i */
    private final DmtTextView f83062i;

    /* renamed from: j */
    private final RemoteImageView f83063j;

    /* renamed from: k */
    private final ViewGroup f83064k;

    /* renamed from: l */
    private boolean f83065l;

    /* renamed from: m */
    private final ViewGroup f83066m;

    /* renamed from: n */
    private final ViewGroup f83067n;

    /* renamed from: o */
    private final LinkedHashSet<IMContact> f83068o;

    /* renamed from: p */
    private final boolean f83069p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$a */
    public static final class C31744a {
        private C31744a() {
        }

        public /* synthetic */ C31744a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$b */
    public static final class C31745b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C31743c f83070a;

        C31745b(C31743c cVar) {
            this.f83070a = cVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            Window window = this.f83070a.f83058d.getWindow();
            if (window != null) {
                if (motionEvent == null || motionEvent.getAction() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    window = null;
                }
                if (window != null) {
                    window.setSoftInputMode(16);
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$c */
    static final class C31746c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C31743c f83071a;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$c$a */
        static final class C31748a extends Lambda implements C7562b<Boolean, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C31746c f83073a;

            C31748a(C31746c cVar) {
                this.f83073a = cVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m103092a(((Boolean) obj).booleanValue());
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m103092a(boolean z) {
                C6892b<Boolean> bVar = this.f83073a.f83071a.f83059e;
                if (bVar != null) {
                    bVar.run(Boolean.valueOf(z));
                }
                if (z) {
                    KeyboardUtils.m77057c(this.f83073a.f83071a.f83055a);
                    this.f83073a.f83071a.f83058d.finish();
                }
            }
        }

        C31746c(C31743c cVar) {
            this.f83071a = cVar;
        }

        public final void onClick(View view) {
            boolean z;
            int i;
            boolean z2;
            ClickInstrumentation.onClick(view);
            C31743c cVar = this.f83071a;
            Collection collection = this.f83071a.f83057c;
            boolean z3 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            String str = null;
            if (!z) {
                cVar = null;
            }
            if (cVar != null) {
                C10761a.m31399c((Context) this.f83071a.f83058d, (int) R.string.a2i).mo25750a();
                return;
            }
            C31743c cVar2 = this.f83071a;
            Editable text = this.f83071a.f83055a.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            if (i > C31863ai.m103525a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                cVar2 = null;
            }
            if (cVar2 != null) {
                C10761a.m31399c((Context) this.f83071a.f83058d, (int) R.string.bmn).mo25750a();
                return;
            }
            C31743c cVar3 = this.f83071a;
            C31814b bVar = this.f83071a.f83056b;
            if (bVar != null && bVar.f83233a) {
                z3 = true;
            }
            if (!z3) {
                cVar3 = null;
            }
            if (cVar3 != null) {
                C31814b bVar2 = this.f83071a.f83056b;
                if (bVar2 == null) {
                    C7573i.m23580a();
                }
                LinkedHashSet<IMContact> linkedHashSet = this.f83071a.f83057c;
                if (linkedHashSet == null) {
                    C7573i.m23580a();
                }
                Set set = linkedHashSet;
                SharePackage sharePackage = this.f83071a.f83060f;
                BaseContent baseContent = this.f83071a.f83061g;
                Editable text2 = this.f83071a.f83055a.getText();
                if (text2 != null) {
                    str = text2.toString();
                }
                bVar2.mo82628a(set, sharePackage, baseContent, str, (C7562b<? super Boolean, C7581n>) new C31748a<Object,C7581n>(this));
                return;
            }
            new C6928b(this.f83071a.f83058d, new C6943d(this) {

                /* renamed from: a */
                final /* synthetic */ C31746c f83072a;

                {
                    this.f83072a = r1;
                }

                public final void sendMsg() {
                    String str;
                    LinkedHashSet<IMContact> linkedHashSet = this.f83072a.f83071a.f83057c;
                    if (linkedHashSet == null) {
                        C7573i.m23580a();
                    }
                    List d = C7525m.m23509d((Collection<? extends T>) linkedHashSet);
                    Editable text = this.f83072a.f83071a.f83055a.getText();
                    if (text != null) {
                        str = text.toString();
                    } else {
                        str = null;
                    }
                    C7052b.m21958a(d, str, this.f83072a.f83071a.f83060f, this.f83072a.f83071a.f83061g);
                    C6892b<Boolean> bVar = this.f83072a.f83071a.f83059e;
                    if (bVar != null) {
                        bVar.run(Boolean.valueOf(true));
                    }
                    KeyboardUtils.m77057c(this.f83072a.f83071a.f83055a);
                    this.f83072a.f83071a.f83058d.finish();
                }
            }).sendMsg();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$d */
    static final class C31749d implements OnClickListener {

        /* renamed from: a */
        public static final C31749d f83074a = new C31749d();

        C31749d() {
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$e */
    public static final class C31750e implements C27525a {

        /* renamed from: a */
        final /* synthetic */ C31743c f83075a;

        C31750e(C31743c cVar) {
            this.f83075a = cVar;
        }

        /* renamed from: a */
        public final void mo70744a(String str) {
            this.f83075a.f83055a.requestFocus();
            Window window = this.f83075a.f83058d.getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
            KeyboardUtils.m77055a(this.f83075a.f83055a);
            C31858ad.m103417a(this.f83075a.f83060f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c$f */
    public static final class C31751f implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C31743c f83076a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C31751f(C31743c cVar) {
            this.f83076a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f83076a.mo82538b(true);
        }
    }

    /* renamed from: a */
    public final void mo82534a() {
        this.f83066m.setVisibility(8);
    }

    /* renamed from: e */
    private final void m103085e() {
        this.f83066m.setVisibility(0);
        this.f83065l = true;
    }

    /* renamed from: b */
    public final void mo82537b() {
        C31743c cVar;
        if (this.f83065l) {
            cVar = this;
        } else {
            cVar = null;
        }
        C31743c cVar2 = cVar;
        if (cVar2 != null) {
            cVar2.m103085e();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m103084d() {
        /*
            r4 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f83062i
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f83057c
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0013
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 != 0) goto L_0x0034
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f83057c
            if (r1 != 0) goto L_0x001d
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x001d:
            int r1 = r1.size()
            if (r1 > r3) goto L_0x0024
            goto L_0x0034
        L_0x0024:
            com.ss.android.ugc.aweme.im.sdk.share.b r1 = r4.f83056b
            if (r1 == 0) goto L_0x0030
            boolean r1 = r1.f83233a
            if (r1 != r3) goto L_0x0030
            r1 = 2131821623(0x7f110437, float:1.9275994E38)
            goto L_0x0037
        L_0x0030:
            r1 = 2131821626(0x7f11043a, float:1.9276E38)
            goto L_0x0037
        L_0x0034:
            r1 = 2131823876(0x7f110d04, float:1.9280564E38)
        L_0x0037:
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r4.f83062i
            java.util.LinkedHashSet<com.ss.android.ugc.aweme.im.service.model.IMContact> r1 = r4.f83057c
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x0048
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0049
        L_0x0048:
            r2 = 1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0050
        L_0x004e:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0050:
            r0.setAlpha(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.C31743c.m103084d():void");
    }

    /* renamed from: c */
    private final void m103083c() {
        boolean z;
        C31743c cVar;
        this.f83055a.setOnTouchListener(new C31745b(this));
        this.f83055a.setFilters(new InputFilter[]{new C31055x(C31863ai.m103525a())});
        this.f83062i.setOnClickListener(new C31746c(this));
        this.f83066m.setOnClickListener(C31749d.f83074a);
        this.f83066m.setEnabled(false);
        Collection collection = this.f83068o;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        C31743c cVar2 = null;
        if (z) {
            cVar = this;
        } else {
            cVar = null;
        }
        C31743c cVar3 = cVar;
        if (cVar3 != null) {
            cVar3.mo82534a();
            cVar3.mo82538b(false);
        } else {
            C31743c cVar4 = this;
            cVar4.m103085e();
            cVar4.mo82538b(true);
        }
        if (!ImShareDialog.m103855a(this.f83063j, this.f83060f)) {
            cVar2 = this;
        }
        if (cVar2 != null) {
            this.f83063j.setVisibility(8);
        }
        if (ImShareSoftAndMiniEmojiExperiment.INSTANCE.showMiniEmojiPanel()) {
            C27526b bVar = new C27526b(this.f83064k, this.f83055a, VETransitionFilterParam.TransitionDuration_DEFAULT, C6399b.m19921a().getResources().getString(R.string.bjt), new C31750e(this));
            new C27527c(bVar).mo70749b();
        }
    }

    /* renamed from: f */
    private final void m103086f() {
        this.f83066m.setTranslationY(f83053q);
        m103085e();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f83066m, "translationY", new float[]{f83053q, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f83066m, "alpha", new float[]{0.4f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "translationAnimator");
        ofFloat.setDuration(220);
        ofFloat.setInterpolator(C0957c.m4073a(0.14f, 1.0f, 0.34f, 1.0f));
        C7573i.m23582a((Object) ofFloat2, "alphaAnimator");
        ofFloat2.setDuration(80);
        ofFloat2.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new C31751f(this));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo82536a(boolean z) {
        m103084d();
    }

    /* renamed from: a */
    public final void mo82535a(LinkedHashSet<IMContact> linkedHashSet) {
        boolean z;
        C31743c cVar;
        this.f83057c = linkedHashSet;
        C31814b bVar = this.f83056b;
        if (bVar != null) {
            bVar.mo82629a((Set<IMContact>) linkedHashSet);
        }
        m103084d();
        if (linkedHashSet.isEmpty() || this.f83066m.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            cVar = this;
        } else {
            cVar = null;
        }
        C31743c cVar2 = cVar;
        if (cVar2 != null) {
            cVar2.m103086f();
        }
    }

    /* renamed from: b */
    public final void mo82538b(boolean z) {
        int i;
        LayoutParams layoutParams = this.f83067n.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (z) {
                i = f83054r;
            } else {
                i = 0;
            }
            marginLayoutParams.bottomMargin = i;
            this.f83067n.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007c, code lost:
        if (r2.mo18356d() == true) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31743c(android.app.Activity r2, com.p280ss.android.ugc.aweme.base.C6892b<java.lang.Boolean> r3, android.view.ViewGroup r4, android.view.ViewGroup r5, com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage r6, com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent r7, java.util.LinkedHashSet<com.p280ss.android.ugc.aweme.p313im.service.model.IMContact> r8, boolean r9) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = "listView"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            r1.<init>()
            r1.f83058d = r2
            r1.f83059e = r3
            r1.f83066m = r4
            r1.f83067n = r5
            r1.f83060f = r6
            r1.f83061g = r7
            r1.f83068o = r8
            r1.f83069p = r9
            android.view.ViewGroup r2 = r1.f83066m
            r3 = 2131297735(0x7f0905c7, float:1.8213423E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "layout.findViewById(R.id.edit_msg)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r2 = (com.bytedance.ies.dmt.p262ui.widget.DmtEditText) r2
            r1.f83055a = r2
            android.view.ViewGroup r2 = r1.f83066m
            r3 = 2131302782(0x7f09197e, float:1.822366E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "layout.findViewById(R.id.tv_send)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p262ui.widget.DmtTextView) r2
            r1.f83062i = r2
            android.view.ViewGroup r2 = r1.f83066m
            r3 = 2131298905(0x7f090a59, float:1.8215796E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "layout.findViewById(R.id.iv_cover)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r2
            r1.f83063j = r2
            android.view.ViewGroup r2 = r1.f83066m
            r3 = 2131299330(0x7f090c02, float:1.8216658E38)
            android.view.View r2 = r2.findViewById(r3)
            java.lang.String r3 = "layout.findViewById(R.id.layout_mini_choose_emoji)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.f83064k = r2
            com.ss.android.ugc.aweme.im.service.IIMService r2 = com.p280ss.android.ugc.aweme.p313im.sdk.providedservices.IMService.get()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x007f
            com.ss.android.ugc.aweme.im.service.b r2 = r2.getAbInterface()
            if (r2 == 0) goto L_0x007f
            boolean r2 = r2.mo18356d()
            if (r2 != r4) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r4 = 0
        L_0x0080:
            if (r4 == 0) goto L_0x0084
            r2 = r1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            com.ss.android.ugc.aweme.im.sdk.relations.c r2 = (com.p280ss.android.ugc.aweme.p313im.sdk.relations.C31743c) r2
            if (r2 == 0) goto L_0x00ba
            com.ss.android.ugc.aweme.im.sdk.share.b r2 = new com.ss.android.ugc.aweme.im.sdk.share.b
            com.ss.android.ugc.aweme.im.sdk.share.model.a r4 = new com.ss.android.ugc.aweme.im.sdk.share.model.a
            android.view.ViewGroup r5 = r1.f83066m
            r6 = 2131299281(0x7f090bd1, float:1.8216559E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "layout.findViewById(R.id.layout_create_group)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.ViewGroup r6 = r1.f83066m
            r7 = 2131298913(0x7f090a61, float:1.8215813E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "layout.findViewById(R.id.iv_create_group)"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4.<init>(r5, r6, r3)
            r3 = r1
            com.ss.android.ugc.aweme.im.sdk.share.a r3 = (com.p280ss.android.ugc.aweme.p313im.sdk.share.C31806a) r3
            boolean r5 = r1.f83069p
            r2.<init>(r4, r3, r5)
            r1.f83056b = r2
        L_0x00ba:
            r1.m103083c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.C31743c.<init>(android.app.Activity, com.ss.android.ugc.aweme.base.b, android.view.ViewGroup, android.view.ViewGroup, com.ss.android.ugc.aweme.sharer.ui.SharePackage, com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent, java.util.LinkedHashSet, boolean):void");
    }
}
