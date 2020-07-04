package com.p280ss.android.ugc.aweme.tools.beauty.widegt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategory;
import com.p280ss.android.ugc.aweme.beauty.C23530a;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23537g;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.p280ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify.ItemsBean;
import com.p280ss.android.ugc.aweme.effect.p1197c.p1198a.C27413a;
import com.p280ss.android.ugc.aweme.shortvideo.beauty.C38520d;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41005b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41006c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41011f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.C41012g;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.p280ss.android.ugc.aweme.themechange.base.C42109a;
import com.p280ss.android.ugc.aweme.tools.beauty.BeautyProgressBar;
import com.p280ss.android.ugc.aweme.tools.beauty.C42175c;
import com.p280ss.android.ugc.aweme.tools.beauty.C42176d;
import com.p280ss.android.ugc.aweme.tools.beauty.C42186g;
import com.p280ss.android.ugc.aweme.tools.beauty.C42186g.C42187a;
import com.p280ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.BeautyExclusiveFlag;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42191b;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42201d;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g;
import com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl */
public final class ComposerBeautyListViewImpl extends FrameLayout implements C0042h, C38520d {

    /* renamed from: A */
    private final C7563m<ComposerBeauty, Integer, C7581n> f109840A;

    /* renamed from: B */
    private C42176d f109841B;

    /* renamed from: C */
    private AVETParameter f109842C;

    /* renamed from: D */
    private final View f109843D;

    /* renamed from: E */
    private final View f109844E;

    /* renamed from: F */
    private C7561a<C7581n> f109845F;

    /* renamed from: a */
    public final View f109846a;

    /* renamed from: b */
    public final RelativeLayout f109847b;

    /* renamed from: c */
    public final RelativeLayout f109848c;

    /* renamed from: d */
    public final TextView f109849d;

    /* renamed from: e */
    public final BeautyProgressBar f109850e;

    /* renamed from: f */
    public final BeautyListAdapter f109851f;

    /* renamed from: g */
    public final BeautyListAdapter f109852g;

    /* renamed from: h */
    public ComposerBeauty f109853h;

    /* renamed from: i */
    public ComposerBeauty f109854i;

    /* renamed from: j */
    public boolean f109855j;

    /* renamed from: k */
    public Map<BeautyCategory, ? extends List<ComposerBeauty>> f109856k;

    /* renamed from: l */
    public final HashMap<C23537g, C27413a<C23537g, Void>> f109857l;

    /* renamed from: m */
    public final C42232e f109858m;

    /* renamed from: n */
    private final View f109859n;

    /* renamed from: o */
    private final AVDmtTabLayout f109860o;

    /* renamed from: p */
    private final AVDmtPanelRecyleView f109861p;

    /* renamed from: q */
    private final RelativeLayout f109862q;

    /* renamed from: r */
    private final ImageView f109863r;

    /* renamed from: s */
    private final FrameLayout f109864s;

    /* renamed from: t */
    private final AVDmtPanelRecyleView f109865t;

    /* renamed from: u */
    private final DmtTextView f109866u;

    /* renamed from: v */
    private final RelativeLayout f109867v;

    /* renamed from: w */
    private final RelativeLayout f109868w;

    /* renamed from: x */
    private final ImageView f109869x;

    /* renamed from: y */
    private ComposerBeauty f109870y;

    /* renamed from: z */
    private final C7563m<ComposerBeauty, Integer, C7581n> f109871z;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$a */
    public static final class C42227a {

        /* renamed from: a */
        private C42176d f109872a;

        /* renamed from: b */
        private AVETParameter f109873b;

        /* renamed from: c */
        private final Context f109874c;

        /* renamed from: a */
        public final ComposerBeautyListViewImpl mo103670a() {
            ComposerBeautyListViewImpl composerBeautyListViewImpl = new ComposerBeautyListViewImpl(this.f109874c, null, 0, 6, null);
            composerBeautyListViewImpl.setBeautyController(this.f109872a);
            composerBeautyListViewImpl.setEtParameter(this.f109873b);
            return composerBeautyListViewImpl;
        }

        /* renamed from: a */
        public final C42227a mo103668a(AVETParameter aVETParameter) {
            C7573i.m23587b(aVETParameter, "etParameter");
            this.f109873b = aVETParameter;
            return this;
        }

        public C42227a(Context context) {
            C7573i.m23587b(context, "context");
            this.f109874c = context;
        }

        /* renamed from: a */
        public final C42227a mo103669a(C42176d dVar) {
            C7573i.m23587b(dVar, "listener");
            this.f109872a = dVar;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$b */
    static final class C42228b<T> implements C0053p<Map<BeautyCategory, List<? extends ComposerBeauty>>> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109875a;

        C42228b(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109875a = composerBeautyListViewImpl;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Map<BeautyCategory, List<ComposerBeauty>> map) {
            this.f109875a.f109856k = map;
            if (map != null) {
                this.f109875a.mo103662g();
                this.f109875a.mo103657a(map);
                this.f109875a.mo103660e();
                this.f109875a.mo103661f();
                this.f109875a.f109846a.setOnClickListener(new OnClickListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42228b f109876a;

                    {
                        this.f109876a = r1;
                    }

                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C7561a outsideClickListener = this.f109876a.f109875a.getOutsideClickListener();
                        if (outsideClickListener != null) {
                            outsideClickListener.invoke();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$c */
    static final class C42230c extends Lambda implements C7563m<ComposerBeauty, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109877a;

        C42230c(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109877a = composerBeautyListViewImpl;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m134367a((ComposerBeauty) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m134367a(ComposerBeauty composerBeauty, int i) {
            C7573i.m23587b(composerBeauty, "beautyBean");
            ComposerBeautyListViewImpl.m134348a(this.f109877a, composerBeauty, true, true, false, null, 24, null);
            C42194c.f109764a.mo103644d(composerBeauty);
            C42212g.f109798a.mo103653d(composerBeauty);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$d */
    static final class C42231d extends Lambda implements C7563m<ComposerBeauty, Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109878a;

        C42231d(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109878a = composerBeautyListViewImpl;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m134368a((ComposerBeauty) obj, ((Number) obj2).intValue());
            return C7581n.f20898a;
        }

        /* JADX WARNING: type inference failed for: r0v3 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m134368a(com.p280ss.android.ugc.aweme.beauty.ComposerBeauty r10, int r11) {
            /*
                r9 = this;
                java.lang.String r11 = "composerBeauty"
                kotlin.jvm.internal.C7573i.m23587b(r10, r11)
                boolean r11 = r10.isCollectionType()
                r0 = 0
                if (r11 == 0) goto L_0x000e
                r11 = r10
                goto L_0x000f
            L_0x000e:
                r11 = r0
            L_0x000f:
                if (r11 == 0) goto L_0x0071
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r1 = r9.f109878a
                r1.f109853h = r11
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r1 = r9.f109878a
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r1 = r1.getEtParameter()
                com.p280ss.android.ugc.aweme.tools.beauty.C42175c.m134162a(r11, r1)
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r1 = r9.f109878a
                android.widget.TextView r1 = r1.f109849d
                java.lang.String r2 = "tvAlbumTitleName"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r11.getEffect()
                java.lang.String r2 = r2.getName()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.setText(r2)
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r1 = r9.f109878a
                r1.mo103659d()
                java.util.List r1 = r11.getChildList()
                if (r1 == 0) goto L_0x006f
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r2 = r9.f109878a
                com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter r2 = r2.f109852g
                r2.mo103618a(r1)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x004c:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0060
                java.lang.Object r2 = r1.next()
                r3 = r2
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r3
                boolean r3 = r3.getSelected()
                if (r3 == 0) goto L_0x004c
                r0 = r2
            L_0x0060:
                r2 = r0
                com.ss.android.ugc.aweme.beauty.ComposerBeauty r2 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r2
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r1 = r9.f109878a
                r3 = 1
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 28
                r8 = 0
                com.p280ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl.m134348a(r1, r2, r3, r4, r5, r6, r7, r8)
            L_0x006f:
                if (r11 != 0) goto L_0x0091
            L_0x0071:
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r11 = r9.f109878a
                com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r11 = r11.getEtParameter()
                com.p280ss.android.ugc.aweme.tools.beauty.C42175c.m134162a(r10, r11)
                com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl r0 = r9.f109878a
                r2 = 0
                r3 = 1
                r4 = 0
                r5 = 0
                r6 = 26
                r7 = 0
                r1 = r10
                com.p280ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl.m134348a(r0, r1, r2, r3, r4, r5, r6, r7)
                com.ss.android.ugc.aweme.tools.beauty.manager.c r11 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42194c.f109764a
                r11.mo103642c(r10)
                com.ss.android.ugc.aweme.tools.beauty.manager.g r11 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.f109798a
                r11.mo103653d(r10)
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl.C42231d.m134368a(com.ss.android.ugc.aweme.beauty.ComposerBeauty, int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$e */
    public static final class C42232e implements C27413a<C23537g, Void> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109879a;

        C42232e(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109879a = composerBeautyListViewImpl;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70519a(C23537g gVar) {
            C7573i.m23587b(gVar, "param");
            this.f109879a.mo103656a(this.f109879a.f109851f, gVar, false);
            this.f109879a.mo103656a(this.f109879a.f109852g, gVar, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70521a(C23537g gVar, Void voidR) {
            C7573i.m23587b(gVar, "param");
            this.f109879a.mo103656a(this.f109879a.f109851f, gVar, true);
            this.f109879a.mo103656a(this.f109879a.f109852g, gVar, true);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo70520a(C23537g gVar, Integer num, String str, Exception exc) {
            C7573i.m23587b(gVar, "param");
            this.f109879a.mo103656a(this.f109879a.f109851f, gVar, false);
            this.f109879a.mo103656a(this.f109879a.f109852g, gVar, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$f */
    public static final class C42233f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109880a;

        /* renamed from: b */
        final /* synthetic */ boolean f109881b;

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f109881b) {
                RelativeLayout relativeLayout = this.f109880a.f109848c;
                C7573i.m23582a((Object) relativeLayout, "rlAlbumContainer");
                relativeLayout.setVisibility(8);
                return;
            }
            RelativeLayout relativeLayout2 = this.f109880a.f109847b;
            C7573i.m23582a((Object) relativeLayout2, "rlCategoryContainer");
            relativeLayout2.setVisibility(8);
        }

        C42233f(ComposerBeautyListViewImpl composerBeautyListViewImpl, boolean z) {
            this.f109880a = composerBeautyListViewImpl;
            this.f109881b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$g */
    static final class C42234g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109882a;

        C42234g(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109882a = composerBeautyListViewImpl;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ComposerBeauty composerBeauty = this.f109882a.f109854i;
            if (composerBeauty != null) {
                C42212g.f109798a.mo103653d(composerBeauty);
            }
            this.f109882a.mo103658c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$h */
    public static final class C42235h implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109883a;

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$h$a */
        static final class C42236a extends Lambda implements C7562b<ComposerBeauty, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C42235h f109884a;

            /* renamed from: b */
            final /* synthetic */ SeekBar f109885b;

            /* renamed from: c */
            final /* synthetic */ int f109886c;

            C42236a(C42235h hVar, SeekBar seekBar, int i) {
                this.f109884a = hVar;
                this.f109885b = seekBar;
                this.f109886c = i;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mo103677a((ComposerBeauty) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            public final void mo103677a(ComposerBeauty composerBeauty) {
                boolean z;
                C7573i.m23587b(composerBeauty, "composerBeauty");
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        C42187a aVar = new C42187a(itemsBean.getDoubleDirectionin(), this.f109885b.getMax(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0, this.f109886c, 76, null);
                        float a = C42186g.m134210a(aVar);
                        if (C42212g.m134314b(composerBeauty)) {
                            C42176d beautyController = this.f109884a.f109883a.getBeautyController();
                            if (beautyController != null) {
                                String unzipPath = composerBeauty.getEffect().getUnzipPath();
                                C7573i.m23582a((Object) unzipPath, "effect.unzipPath");
                                beautyController.mo103610a(unzipPath, itemsBean.getTag(), a / 100.0f);
                            }
                        }
                    }
                    composerBeauty.setProgressValue(this.f109886c);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$h$b */
        static final class C42237b extends Lambda implements C7562b<ComposerBeauty, C7581n> {

            /* renamed from: a */
            final /* synthetic */ SeekBar f109887a;

            C42237b(SeekBar seekBar) {
                this.f109887a = seekBar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                mo103678a((ComposerBeauty) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            public final void mo103678a(ComposerBeauty composerBeauty) {
                boolean z;
                C7573i.m23587b(composerBeauty, "composerBeauty");
                List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                Collection collection = items;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    items = null;
                }
                if (items != null) {
                    for (ItemsBean itemsBean : items) {
                        C42187a aVar = new C42187a(itemsBean.getDoubleDirectionin(), this.f109887a.getMax(), 0, 0, itemsBean.getMax(), itemsBean.getMin(), 0, this.f109887a.getProgress(), 76, null);
                        C42194c.f109764a.mo103635a(composerBeauty, itemsBean.getTag(), (int) C42186g.m134210a(aVar));
                        if (C42226h.m134342b(composerBeauty)) {
                            C42194c.f109764a.mo103644d(composerBeauty);
                        } else {
                            C42194c.f109764a.mo103642c(composerBeauty);
                        }
                    }
                }
            }
        }

        C42235h(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109883a = composerBeautyListViewImpl;
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            boolean z = this.f109883a.f109855j;
            Object obj = null;
            if (z) {
                Iterator it = this.f109883a.f109852g.f109705a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (C7573i.m23585a((Object) (ComposerBeauty) next, (Object) this.f109883a.f109854i)) {
                        obj = next;
                        break;
                    }
                }
                ComposerBeauty composerBeauty = (ComposerBeauty) obj;
                if (composerBeauty != null) {
                    this.f109883a.mo103655a(composerBeauty, true, false);
                }
            } else if (!z) {
                Iterator it2 = this.f109883a.f109851f.f109705a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (C7573i.m23585a((Object) (ComposerBeauty) next2, (Object) this.f109883a.f109853h)) {
                        obj = next2;
                        break;
                    }
                }
                ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                if (composerBeauty2 != null) {
                    this.f109883a.mo103655a(composerBeauty2, true, false);
                }
            }
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            Object obj;
            Object obj2;
            if (seekBar != null) {
                C42237b bVar = new C42237b(seekBar);
                boolean z = this.f109883a.f109855j;
                if (z) {
                    Iterator it = this.f109883a.f109852g.f109705a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj2, (Object) this.f109883a.f109854i)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        bVar.mo103678a(composerBeauty);
                        C42212g.f109798a.mo103653d(composerBeauty);
                    }
                } else if (!z) {
                    Iterator it2 = this.f109883a.f109851f.f109705a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj, (Object) this.f109883a.f109853h)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        bVar.mo103678a(composerBeauty2);
                        C42212g.f109798a.mo103653d(composerBeauty2);
                        int indexOf = this.f109883a.f109851f.f109705a.indexOf(composerBeauty2);
                        if (indexOf >= 0 && indexOf < this.f109883a.f109851f.f109705a.size()) {
                            this.f109883a.f109851f.notifyItemChanged(indexOf);
                        }
                    }
                }
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Object obj;
            Object obj2;
            if (seekBar != null) {
                C42236a aVar = new C42236a(this, seekBar, i);
                boolean z2 = this.f109883a.f109855j;
                if (z2) {
                    Iterator it = this.f109883a.f109852g.f109705a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj2, (Object) this.f109883a.f109854i)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        aVar.mo103677a(composerBeauty);
                    }
                } else if (!z2) {
                    Iterator it2 = this.f109883a.f109851f.f109705a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj, (Object) this.f109883a.f109853h)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        aVar.mo103677a(composerBeauty2);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$i */
    static final class C42238i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109888a;

        C42238i(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109888a = composerBeautyListViewImpl;
        }

        public final void onClick(View view) {
            Object obj;
            Object obj2;
            ClickInstrumentation.onClick(view);
            if (this.f109888a.f109853h != null || this.f109888a.f109854i != null) {
                C422391 r6 = new C7562b<ComposerBeauty, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42238i f109889a;

                    {
                        this.f109889a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        mo103680a((ComposerBeauty) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    public final void mo103680a(ComposerBeauty composerBeauty) {
                        C7573i.m23587b(composerBeauty, "composerBeauty");
                        boolean z = false;
                        this.f109889a.f109888a.mo103655a(composerBeauty, true, false);
                        List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
                        Collection collection = items;
                        if (collection == null || collection.isEmpty()) {
                            z = true;
                        }
                        if (!(!z)) {
                            items = null;
                        }
                        if (items != null) {
                            for (ItemsBean itemsBean : items) {
                                C42187a aVar = new C42187a(itemsBean.getDoubleDirectionin(), 100, 0, 0, itemsBean.getMax(), itemsBean.getMin(), itemsBean.getValue(), 0, 140, null);
                                C42187a b = C42186g.m134211b(aVar);
                                BeautyProgressBar beautyProgressBar = this.f109889a.f109888a.f109850e;
                                C7573i.m23582a((Object) beautyProgressBar, "pbProgressBar");
                                beautyProgressBar.setProgress(b.f109758h);
                                C42194c.f109764a.mo103635a(composerBeauty, itemsBean.getTag(), itemsBean.getValue());
                                if (C42212g.m134314b(composerBeauty)) {
                                    C42176d beautyController = this.f109889a.f109888a.getBeautyController();
                                    if (beautyController != null) {
                                        String unzipPath = composerBeauty.getEffect().getUnzipPath();
                                        C7573i.m23582a((Object) unzipPath, "effect.unzipPath");
                                        beautyController.mo103610a(unzipPath, itemsBean.getTag(), ((float) itemsBean.getValue()) / 100.0f);
                                    }
                                }
                                composerBeauty.setProgressValue(b.f109758h);
                            }
                        }
                    }
                };
                boolean z = this.f109888a.f109855j;
                if (z) {
                    Iterator it = this.f109888a.f109852g.f109705a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj2, (Object) this.f109888a.f109854i)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty = (ComposerBeauty) obj2;
                    if (composerBeauty != null) {
                        r6.mo103680a(composerBeauty);
                        C42175c.m134165c(composerBeauty, this.f109888a.getEtParameter());
                        C42212g.f109798a.mo103653d(composerBeauty);
                    }
                } else if (!z) {
                    Iterator it2 = this.f109888a.f109851f.f109705a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (C7573i.m23585a((Object) (ComposerBeauty) obj, (Object) this.f109888a.f109853h)) {
                            break;
                        }
                    }
                    ComposerBeauty composerBeauty2 = (ComposerBeauty) obj;
                    if (composerBeauty2 != null) {
                        r6.mo103680a(composerBeauty2);
                        C42175c.m134165c(composerBeauty2, this.f109888a.getEtParameter());
                        C42212g.f109798a.mo103653d(composerBeauty2);
                        int indexOf = this.f109888a.f109851f.f109705a.indexOf(composerBeauty2);
                        if (indexOf >= 0 && indexOf < this.f109888a.f109851f.f109705a.size()) {
                            this.f109888a.f109851f.notifyItemChanged(indexOf);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$j */
    static final class C42240j implements C41005b {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109890a;

        /* renamed from: b */
        final /* synthetic */ Map f109891b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f109892c;

        C42240j(ComposerBeautyListViewImpl composerBeautyListViewImpl, Map map, ArrayList arrayList) {
            this.f109890a = composerBeautyListViewImpl;
            this.f109891b = map;
            this.f109892c = arrayList;
        }

        /* renamed from: a */
        public final void mo74815a(C41011f fVar) {
            Object obj;
            fVar.mo101403a();
            Iterator it = this.f109891b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                ArrayList arrayList = this.f109892c;
                C7573i.m23582a((Object) fVar, "it");
                if (C7573i.m23585a((Object) (String) arrayList.get(fVar.f106702e), (Object) beautyCategory.getCategoryResponse().f113500id)) {
                    break;
                }
            }
            BeautyCategory beautyCategory2 = (BeautyCategory) obj;
            if (beautyCategory2 != null) {
                C42175c.m134161a(beautyCategory2, this.f109890a.getEtParameter());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$k */
    public static final class C42241k implements C41006c {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109893a;

        /* renamed from: b */
        final /* synthetic */ Map f109894b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f109895c;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            Object obj;
            Object obj2;
            if (fVar != null) {
                Iterator it = this.f109894b.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C7573i.m23585a((Object) (String) this.f109895c.get(fVar.f106702e), (Object) ((BeautyCategory) obj).getCategoryResponse().f113500id)) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    C42194c.f109764a.mo103636a(beautyCategory.getCategoryResponse().f113500id);
                    List list = (List) this.f109894b.get(beautyCategory);
                    if (list != null) {
                        this.f109893a.f109851f.mo103618a(list);
                        Iterator it2 = this.f109893a.f109851f.f109705a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (((ComposerBeauty) obj2).getSelected()) {
                                break;
                            }
                        }
                        ComposerBeautyListViewImpl.m134348a(this.f109893a, (ComposerBeauty) obj2, false, false, false, null, 30, null);
                    }
                }
            }
        }

        C42241k(ComposerBeautyListViewImpl composerBeautyListViewImpl, Map map, ArrayList arrayList) {
            this.f109893a = composerBeautyListViewImpl;
            this.f109894b = map;
            this.f109895c = arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$l */
    static final class C42242l extends Lambda implements C7562b<ComposerBeauty, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109896a;

        /* renamed from: b */
        final /* synthetic */ C23537g f109897b;

        C42242l(ComposerBeautyListViewImpl composerBeautyListViewImpl, C23537g gVar) {
            this.f109896a = composerBeautyListViewImpl;
            this.f109897b = gVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo103681a((ComposerBeauty) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo103681a(ComposerBeauty composerBeauty) {
            C7573i.m23587b(composerBeauty, "$this$updateWhenDownloaded");
            if (C7573i.m23585a((Object) this.f109897b.f62122b, (Object) composerBeauty.getEffect().getUnzipPath()) && !C42226h.m134341a(composerBeauty)) {
                this.f109896a.mo103655a(composerBeauty, true, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$m */
    static final class C42243m extends Lambda implements C7562b<C23537g, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109898a;

        C42243m(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109898a = composerBeautyListViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo103682a((C23537g) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo103682a(C23537g gVar) {
            C7573i.m23587b(gVar, "beautyDownload");
            if (!this.f109898a.f109857l.containsKey(gVar)) {
                C42191b.f109761b.mo103630a(gVar, this.f109898a.f109858m);
                this.f109898a.f109857l.put(gVar, this.f109898a.f109858m);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$n */
    static final class C42244n extends Lambda implements C7562b<ComposerBeauty, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ComposerBeautyListViewImpl f109899a;

        C42244n(ComposerBeautyListViewImpl composerBeautyListViewImpl) {
            this.f109899a = composerBeautyListViewImpl;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo103683a((ComposerBeauty) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        public final void mo103683a(ComposerBeauty composerBeauty) {
            boolean z;
            C7573i.m23587b(composerBeauty, "$this$checkExclusiveData");
            boolean z2 = true;
            if (composerBeauty.getExtra().isNone()) {
                C42176d beautyController = this.f109899a.getBeautyController();
                if (beautyController != null) {
                    String unzipPath = composerBeauty.getEffect().getUnzipPath();
                    C7573i.m23582a((Object) unzipPath, "effect.unzipPath");
                    int[] a = beautyController.mo103613a(unzipPath, "");
                    if (a != null) {
                        if (!(a.length == 2 && a[0] == 0 && a[1] == BeautyExclusiveFlag.EXCLUDE.getFlag())) {
                            z2 = false;
                        }
                        if (!z2) {
                            a = null;
                        }
                        if (a != null) {
                            composerBeauty.setEnable(false);
                        }
                    }
                }
                return;
            }
            List<ItemsBean> items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                for (ItemsBean itemsBean : items) {
                    C42176d beautyController2 = this.f109899a.getBeautyController();
                    if (beautyController2 != null) {
                        String unzipPath2 = composerBeauty.getEffect().getUnzipPath();
                        C7573i.m23582a((Object) unzipPath2, "effect.unzipPath");
                        int[] a2 = beautyController2.mo103613a(unzipPath2, itemsBean.getTag());
                        if (a2 != null) {
                            if (a2.length == 2 && a2[0] == 0 && a2[1] == BeautyExclusiveFlag.EXCLUDE.getFlag()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                a2 = null;
                            }
                            if (a2 != null) {
                                composerBeauty.setEnable(false);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo96514a() {
        m134352h();
    }

    public final C42176d getBeautyController() {
        return this.f109841B;
    }

    public final View getBeautyLayout() {
        return this.f109844E;
    }

    public final View getContainerView() {
        return this.f109843D;
    }

    public final AVETParameter getEtParameter() {
        return this.f109842C;
    }

    public final C7561a<C7581n> getOutsideClickListener() {
        return this.f109845F;
    }

    /* renamed from: a */
    public final void mo103657a(Map<BeautyCategory, List<ComposerBeauty>> map) {
        Object obj;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.mo5427b(0);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f109861p;
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "rvCategoryContent");
        aVDmtPanelRecyleView.setLayoutManager(linearLayoutManager);
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f109861p;
        C7573i.m23582a((Object) aVDmtPanelRecyleView2, "rvCategoryContent");
        aVDmtPanelRecyleView2.setAdapter(this.f109851f);
        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = this.f109861p;
        C7573i.m23582a((Object) aVDmtPanelRecyleView3, "rvCategoryContent");
        C1267f itemAnimator = aVDmtPanelRecyleView3.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f4943l = 0;
        }
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        linearLayoutManager2.mo5427b(0);
        AVDmtPanelRecyleView aVDmtPanelRecyleView4 = this.f109865t;
        C7573i.m23582a((Object) aVDmtPanelRecyleView4, "rvAlbumContent");
        aVDmtPanelRecyleView4.setLayoutManager(linearLayoutManager2);
        AVDmtPanelRecyleView aVDmtPanelRecyleView5 = this.f109865t;
        C7573i.m23582a((Object) aVDmtPanelRecyleView5, "rvAlbumContent");
        aVDmtPanelRecyleView5.setAdapter(this.f109852g);
        AVDmtPanelRecyleView aVDmtPanelRecyleView6 = this.f109861p;
        C7573i.m23582a((Object) aVDmtPanelRecyleView6, "rvCategoryContent");
        C1267f itemAnimator2 = aVDmtPanelRecyleView6.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f4943l = 0;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (BeautyCategory beautyCategory : map.keySet()) {
            arrayList2.add(beautyCategory.getCategoryResponse().f113500id);
            arrayList.add(beautyCategory.getCategoryResponse().name);
        }
        this.f109860o.mo103529a(map.size(), (List<String>) arrayList);
        this.f109860o.mo101344b();
        AVDmtTabLayout aVDmtTabLayout = this.f109860o;
        C7573i.m23582a((Object) aVDmtTabLayout, "tbCategoryTab");
        aVDmtTabLayout.setTabMode(1);
        for (Entry entry : map.entrySet()) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            C41011f a = this.f109860o.mo101329a().mo101401a(C42201d.m134265a(context, (BeautyCategory) entry.getKey()));
            C7573i.m23582a((Object) a, "tbCategoryTab.newTab().setCustomView(itemView)");
            C41012g gVar = a.f106705h;
            if (gVar != null) {
                gVar.setBackgroundColor(C0683b.m2912c(gVar.getContext(), R.color.ac4));
            }
            this.f109860o.mo101337a(a, false);
        }
        this.f109860o.setOnTabClickListener(new C42240j(this, map, arrayList2));
        this.f109860o.mo101335a(new C42241k(this, map, arrayList2));
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BeautyCategory) obj).getSelected()) {
                break;
            }
        }
        BeautyCategory beautyCategory2 = (BeautyCategory) obj;
        if (beautyCategory2 != null) {
            C41011f a2 = this.f109860o.mo101330a(C7525m.m23497b((Iterable<? extends T>) map.keySet(), beautyCategory2));
            if (a2 != null) {
                a2.mo101403a();
            }
        }
        if (C23536f.m77302e()) {
            AVDmtTabLayout aVDmtTabLayout2 = this.f109860o;
            C7573i.m23582a((Object) aVDmtTabLayout2, "tbCategoryTab");
            aVDmtTabLayout2.setVisibility(0);
        } else {
            AVDmtTabLayout aVDmtTabLayout3 = this.f109860o;
            C7573i.m23582a((Object) aVDmtTabLayout3, "tbCategoryTab");
            aVDmtTabLayout3.setVisibility(8);
        }
        this.f109851f.f109706b = this.f109871z;
        this.f109852g.f109706b = this.f109840A;
        if (this.f109855j) {
            m134348a(this, this.f109854i, true, false, false, null, 20, null);
            return;
        }
        m134348a(this, this.f109853h, false, false, false, null, 22, null);
    }

    /* renamed from: b */
    public final void mo96515b() {
        C42175c.m134164b(this.f109870y, this.f109842C);
    }

    /* renamed from: f */
    public final void mo103661f() {
        this.f109864s.setOnClickListener(new C42234g(this));
    }

    /* renamed from: d */
    public final void mo103659d() {
        RelativeLayout relativeLayout = this.f109848c;
        C7573i.m23582a((Object) relativeLayout, "rlAlbumContainer");
        relativeLayout.setVisibility(0);
        m134349a(false);
        this.f109855j = true;
        C42175c.m134164b(this.f109870y, this.f109842C);
        this.f109870y = null;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    private final void unregisterDownloadCallbacks() {
        for (Entry entry : this.f109857l.entrySet()) {
            C42191b.f109761b.mo103632b((C23537g) entry.getKey(), (C27413a) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void mo103658c() {
        RelativeLayout relativeLayout = this.f109847b;
        C7573i.m23582a((Object) relativeLayout, "rlCategoryContainer");
        relativeLayout.setVisibility(0);
        this.f109851f.notifyDataSetChanged();
        m134349a(true);
        this.f109855j = false;
        m134348a(this, this.f109853h, false, false, false, null, 22, null);
        C42175c.m134164b(this.f109870y, this.f109842C);
        this.f109870y = null;
    }

    /* renamed from: e */
    public final void mo103660e() {
        this.f109850e.setOnSeekBarChangeListener(new C42235h(this));
        if (C6399b.m19944t()) {
            DmtTextView dmtTextView = this.f109866u;
            C7573i.m23582a((Object) dmtTextView, "tvSeekClear");
            dmtTextView.setVisibility(8);
            this.f109869x.setImageResource(R.drawable.ar8);
        } else {
            DmtTextView dmtTextView2 = this.f109866u;
            C7573i.m23582a((Object) dmtTextView2, "tvSeekClear");
            dmtTextView2.setVisibility(0);
            this.f109869x.setImageResource(R.drawable.ar7);
        }
        this.f109868w.setOnClickListener(new C42238i(this));
    }

    /* renamed from: g */
    public final void mo103662g() {
        C42243m mVar = new C42243m(this);
        Map<BeautyCategory, ? extends List<ComposerBeauty>> map = this.f109856k;
        if (map != null) {
            for (Entry value : map.entrySet()) {
                for (ComposerBeauty composerBeauty : (Iterable) value.getValue()) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null) {
                            for (ComposerBeauty gVar : childList) {
                                mVar.mo103682a(new C23537g(gVar, null, 2, null));
                            }
                        }
                    } else {
                        mVar.mo103682a(new C23537g(composerBeauty, null, 2, null));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (((com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r8) == null) goto L_0x00b5;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m134352h() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$n r0 = new com.ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl$n
            r0.<init>(r10)
            java.util.Map<com.ss.android.ugc.aweme.beauty.BeautyCategory, ? extends java.util.List<com.ss.android.ugc.aweme.beauty.ComposerBeauty>> r1 = r10.f109856k
            if (r1 == 0) goto L_0x00fa
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fa
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0027:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0011
            java.lang.Object r3 = r2.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r3
            r4 = 1
            r3.setEnable(r4)
            boolean r5 = r3.isCollectionType()
            r6 = 0
            if (r5 != 0) goto L_0x0050
            boolean r4 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134314b(r3)
            if (r4 == 0) goto L_0x0045
            r6 = r3
        L_0x0045:
            if (r6 == 0) goto L_0x004a
            r0.mo103683a(r6)
        L_0x004a:
            com.ss.android.ugc.aweme.tools.beauty.manager.g r4 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.f109798a
            r4.mo103653d(r3)
            goto L_0x0027
        L_0x0050:
            java.util.List r5 = r3.getChildList()
            r7 = 0
            if (r5 == 0) goto L_0x0090
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x0065
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r8 = 0
            goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            r8 = r8 ^ r4
            if (r8 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r5 = r6
        L_0x006b:
            if (r5 == 0) goto L_0x0090
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0073:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0090
            java.lang.Object r8 = r5.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            r8.setEnable(r4)
            boolean r9 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.m134314b(r8)
            if (r9 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r8 = r6
        L_0x008a:
            if (r8 == 0) goto L_0x0073
            r0.mo103683a(r8)
            goto L_0x0073
        L_0x0090:
            java.util.List r5 = r3.getChildList()
            if (r5 == 0) goto L_0x00b5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x009c:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00b0
            java.lang.Object r8 = r5.next()
            r9 = r8
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r9 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r9
            boolean r9 = r9.getEnable()
            if (r9 == 0) goto L_0x009c
            goto L_0x00b1
        L_0x00b0:
            r8 = r6
        L_0x00b1:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            if (r8 != 0) goto L_0x00bd
        L_0x00b5:
            r3.setEnable(r7)
            com.ss.android.ugc.aweme.tools.beauty.manager.g r5 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.f109798a
            r5.mo103653d(r3)
        L_0x00bd:
            java.util.List r3 = r3.getChildList()
            if (r3 == 0) goto L_0x0027
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x00c9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ee
            java.lang.Object r5 = r3.next()
            r8 = r5
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r8 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r8
            boolean r9 = r8.getEnable()
            if (r9 == 0) goto L_0x00ea
            boolean r9 = r8.getSelected()
            if (r9 == 0) goto L_0x00ea
            boolean r8 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42226h.m134341a(r8)
            if (r8 != 0) goto L_0x00ea
            r8 = 1
            goto L_0x00eb
        L_0x00ea:
            r8 = 0
        L_0x00eb:
            if (r8 == 0) goto L_0x00c9
            goto L_0x00ef
        L_0x00ee:
            r5 = r6
        L_0x00ef:
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r5 = (com.p280ss.android.ugc.aweme.beauty.ComposerBeauty) r5
            if (r5 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.tools.beauty.manager.g r3 = com.p280ss.android.ugc.aweme.tools.beauty.manager.C42212g.f109798a
            r3.mo103653d(r5)
            goto L_0x0027
        L_0x00fa:
            boolean r0 = r10.f109855j
            if (r0 == 0) goto L_0x0104
            com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter r0 = r10.f109852g
            r0.notifyDataSetChanged()
            return
        L_0x0104:
            com.ss.android.ugc.aweme.tools.beauty.adapter.BeautyListAdapter r0 = r10.f109851f
            r0.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tools.beauty.widegt.ComposerBeautyListViewImpl.m134352h():void");
    }

    public final void setBeautyController(C42176d dVar) {
        this.f109841B = dVar;
    }

    public final void setEtParameter(AVETParameter aVETParameter) {
        this.f109842C = aVETParameter;
    }

    public final void setOutsideClickListener(C7561a<C7581n> aVar) {
        this.f109845F = aVar;
    }

    /* renamed from: a */
    private final void m134345a(AppCompatActivity appCompatActivity) {
        C42212g.m134292a().mo104730a(appCompatActivity, new C42228b(this));
    }

    /* renamed from: b */
    private final void m134351b(boolean z) {
        if (z) {
            RelativeLayout relativeLayout = this.f109867v;
            C7573i.m23582a((Object) relativeLayout, "rlSeekBarContainer");
            relativeLayout.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout2 = this.f109867v;
        C7573i.m23582a((Object) relativeLayout2, "rlSeekBarContainer");
        relativeLayout2.setVisibility(8);
    }

    /* renamed from: a */
    private final void m134349a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        RelativeLayout relativeLayout = this.f109847b;
        String str = "translationX";
        float[] fArr = new float[2];
        float f8 = 0.0f;
        if (z) {
            f = -C42109a.m134045d();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = -C42109a.m134045d();
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, str, fArr);
        RelativeLayout relativeLayout2 = this.f109847b;
        String str2 = "alpha";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(relativeLayout2, str2, fArr2);
        RelativeLayout relativeLayout3 = this.f109848c;
        String str3 = "translationX";
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = C42109a.m134045d();
        }
        fArr3[0] = f5;
        if (z) {
            f6 = C42109a.m134045d();
        } else {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(relativeLayout3, str3, fArr3);
        RelativeLayout relativeLayout4 = this.f109848c;
        String str4 = "alpha";
        float[] fArr4 = new float[2];
        if (z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr4[0] = f7;
        if (!z) {
            f8 = 1.0f;
        }
        fArr4[1] = f8;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(relativeLayout4, str4, fArr4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        animatorSet.addListener(new C42233f(this, z));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    /* renamed from: a */
    private final void m134350a(boolean z, ComposerBeauty composerBeauty) {
        boolean z2;
        boolean z3;
        if (z) {
            for (ComposerBeauty composerBeauty2 : this.f109852g.f109705a) {
                if (!C7573i.m23585a((Object) composerBeauty2, (Object) composerBeauty) || !composerBeauty2.getEnable()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                composerBeauty2.setSelected(z3);
            }
            return;
        }
        for (ComposerBeauty composerBeauty3 : this.f109851f.f109705a) {
            if (!C7573i.m23585a((Object) composerBeauty3, (Object) composerBeauty) || !composerBeauty3.getEnable()) {
                z2 = false;
            } else {
                z2 = true;
            }
            composerBeauty3.setSelected(z2);
        }
    }

    public ComposerBeautyListViewImpl(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f109859n = LayoutInflater.from(context).inflate(R.layout.gw, this, true);
        this.f109846a = this.f109859n.findViewById(R.id.e_c);
        this.f109847b = (RelativeLayout) this.f109859n.findViewById(R.id.cu2);
        this.f109860o = (AVDmtTabLayout) this.f109859n.findViewById(R.id.dku);
        this.f109861p = (AVDmtPanelRecyleView) this.f109859n.findViewById(R.id.cx8);
        this.f109848c = (RelativeLayout) this.f109859n.findViewById(R.id.cu0);
        this.f109862q = (RelativeLayout) this.f109859n.findViewById(R.id.cu1);
        this.f109863r = (ImageView) this.f109859n.findViewById(R.id.b7n);
        this.f109864s = (FrameLayout) this.f109859n.findViewById(R.id.alz);
        this.f109849d = (TextView) this.f109859n.findViewById(R.id.ds3);
        this.f109865t = (AVDmtPanelRecyleView) this.f109859n.findViewById(R.id.cx7);
        this.f109866u = (DmtTextView) this.f109859n.findViewById(R.id.ds4);
        this.f109850e = (BeautyProgressBar) this.f109859n.findViewById(R.id.ca2);
        this.f109867v = (RelativeLayout) this.f109859n.findViewById(R.id.cu5);
        this.f109868w = (RelativeLayout) this.f109859n.findViewById(R.id.cu3);
        this.f109869x = (ImageView) this.f109859n.findViewById(R.id.b7o);
        this.f109851f = new BeautyListAdapter();
        this.f109852g = new BeautyListAdapter();
        this.f109871z = new C42231d(this);
        this.f109840A = new C42230c(this);
        this.f109857l = new HashMap<>();
        this.f109858m = new C42232e(this);
        if (context instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) context;
            appCompatActivity.getLifecycle().mo55a(this);
            m134345a(appCompatActivity);
        }
        RelativeLayout relativeLayout = this.f109848c;
        C7573i.m23582a((Object) relativeLayout, "rlAlbumContainer");
        relativeLayout.setAlpha(0.0f);
        RelativeLayout relativeLayout2 = this.f109848c;
        C7573i.m23582a((Object) relativeLayout2, "rlAlbumContainer");
        relativeLayout2.setTranslationX(C42109a.m134045d());
        this.f109843D = this;
        View view = this.f109859n;
        C7573i.m23582a((Object) view, "root");
        this.f109844E = view;
    }

    /* renamed from: a */
    public final void mo103655a(ComposerBeauty composerBeauty, boolean z, boolean z2) {
        boolean z3;
        Object obj;
        boolean z4;
        ComposerBeauty composerBeauty2 = composerBeauty;
        if (z && C42212g.m134314b(composerBeauty)) {
            if (C42226h.m134344d(composerBeauty)) {
                z3 = composerBeauty.getSelected();
            } else {
                z3 = true;
            }
            if (z3) {
                List a = C42212g.m134296a(composerBeauty, false, false);
                if (C42226h.m134344d(composerBeauty)) {
                    List c = C42212g.f109798a.mo103652c(composerBeauty2);
                    if (!(!c.isEmpty())) {
                        c = null;
                    }
                    if (c != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            ComposerBeauty composerBeauty3 = (ComposerBeauty) obj;
                            if (!composerBeauty3.getAdd2Nodes().f62103a || !(!C7573i.m23585a((Object) composerBeauty3, (Object) composerBeauty2))) {
                                z4 = false;
                                continue;
                            } else {
                                z4 = true;
                                continue;
                            }
                            if (z4) {
                                break;
                            }
                        }
                        ComposerBeauty composerBeauty4 = (ComposerBeauty) obj;
                        if (composerBeauty4 != null) {
                            composerBeauty4.setAdd2Nodes(new C23530a(false, false, 2, null));
                            arrayList.addAll(C42212g.m134296a(composerBeauty4, false, false));
                        }
                        composerBeauty2.setAdd2Nodes(new C23530a(true, false, 2, null));
                        C42176d dVar = this.f109841B;
                        if (dVar != null) {
                            dVar.mo103612a((List<ComposerInfo>) arrayList, a, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                        }
                    }
                } else {
                    composerBeauty2.setAdd2Nodes(new C23530a(true, false, 2, null));
                    C42176d dVar2 = this.f109841B;
                    if (dVar2 != null) {
                        dVar2.mo103611a(a, (int) VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
                    }
                }
            }
        }
        if (z2) {
            List items = composerBeauty.getBeautifyExtra().getItems();
            if (items != null) {
                if (!(!items.isEmpty())) {
                    items = null;
                }
                if (items != null) {
                    this.f109850e.setDoubleDirection(((ItemsBean) items.get(0)).getDoubleDirectionin());
                    C42187a aVar = new C42187a(((ItemsBean) items.get(0)).getDoubleDirectionin(), 100, 0, 0, ((ItemsBean) items.get(0)).getMax(), ((ItemsBean) items.get(0)).getMin(), C42194c.f109764a.mo103637b(composerBeauty2, ((ItemsBean) items.get(0)).getTag(), ((ItemsBean) items.get(0)).getValue()), 0, 140, null);
                    C42187a b = C42186g.m134211b(aVar);
                    this.f109850e.setMaxValue(b.f109753c);
                    this.f109850e.setMinValue(b.f109754d);
                    BeautyProgressBar beautyProgressBar = this.f109850e;
                    C7573i.m23582a((Object) beautyProgressBar, "pbProgressBar");
                    beautyProgressBar.setProgress(b.f109758h);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo103656a(BeautyListAdapter beautyListAdapter, C23537g gVar, boolean z) {
        Iterable<ComposerBeauty> iterable = beautyListAdapter.f109705a;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (ComposerBeauty gVar2 : iterable) {
            arrayList.add(new C23537g(gVar2, null, 2, null));
        }
        Iterable iterable2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable2) {
            if (C7573i.m23585a((Object) (C23537g) next, (Object) gVar)) {
                arrayList2.add(next);
            }
        }
        List list = (List) arrayList2;
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            beautyListAdapter.notifyDataSetChanged();
        }
        if (z) {
            C42242l lVar = new C42242l(this, gVar);
            Map<BeautyCategory, ? extends List<ComposerBeauty>> map = this.f109856k;
            if (map != null) {
                Collection<List> values = map.values();
                if (values != null) {
                    for (List<ComposerBeauty> it : values) {
                        for (ComposerBeauty composerBeauty : it) {
                            if (composerBeauty.isCollectionType()) {
                                List<ComposerBeauty> childList = composerBeauty.getChildList();
                                if (childList != null) {
                                    for (ComposerBeauty a : childList) {
                                        lVar.mo103681a(a);
                                    }
                                }
                            } else {
                                lVar.mo103681a(composerBeauty);
                            }
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ ComposerBeautyListViewImpl(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private final void m134346a(ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2) {
        if (z3) {
            C42175c.m134164b(this.f109870y, this.f109842C);
            this.f109870y = composerBeauty2;
        }
        if (composerBeauty == null) {
            m134351b(false);
            return;
        }
        m134350a(z, composerBeauty);
        if (composerBeauty.isCollectionType()) {
            m134351b(false);
            return;
        }
        if (composerBeauty.getExtra().isNone() || !composerBeauty.getEnable()) {
            m134351b(false);
        } else {
            m134351b(true);
        }
        if (C42226h.m134342b(composerBeauty)) {
            this.f109854i = composerBeauty;
        } else {
            this.f109853h = composerBeauty;
        }
        mo103655a(composerBeauty, z2, true);
    }

    /* renamed from: a */
    static /* synthetic */ void m134348a(ComposerBeautyListViewImpl composerBeautyListViewImpl, ComposerBeauty composerBeauty, boolean z, boolean z2, boolean z3, ComposerBeauty composerBeauty2, int i, Object obj) {
        boolean z4;
        boolean z5;
        boolean z6;
        ComposerBeauty composerBeauty3;
        if ((i & 2) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 4) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 8) != 0) {
            z6 = true;
        } else {
            z6 = z3;
        }
        if ((i & 16) != 0) {
            composerBeauty3 = composerBeauty;
        } else {
            composerBeauty3 = composerBeauty2;
        }
        composerBeautyListViewImpl.m134346a(composerBeauty, z4, z5, z6, composerBeauty3);
    }
}
