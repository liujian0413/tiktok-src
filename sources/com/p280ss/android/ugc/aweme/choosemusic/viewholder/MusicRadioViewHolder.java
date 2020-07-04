package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c;
import com.p280ss.android.ugc.aweme.music.adapter.C33744d;
import com.p280ss.android.ugc.aweme.music.adapter.C33746f;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1408b.C33769d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.FloatRef;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder */
public final class MusicRadioViewHolder extends ItemWidgetViewHolder {

    /* renamed from: r */
    public static final C23996a f63410r = new C23996a(null);

    /* renamed from: b */
    public RemoteImageView f63411b;

    /* renamed from: c */
    public RemoteImageView f63412c;

    /* renamed from: d */
    public ImageView f63413d;

    /* renamed from: e */
    public FrameLayout f63414e;

    /* renamed from: f */
    public DmtTextView f63415f;

    /* renamed from: g */
    public DmtTextView f63416g;

    /* renamed from: h */
    public RelativeLayout f63417h;

    /* renamed from: i */
    public CheckableImageView f63418i;

    /* renamed from: j */
    public LinearLayout f63419j;

    /* renamed from: k */
    public LinearLayout f63420k;

    /* renamed from: l */
    public LinearLayout f63421l;

    /* renamed from: m */
    public LinearLayout f63422m;

    /* renamed from: n */
    public C23997b f63423n;

    /* renamed from: o */
    public C33746f<C23822c> f63424o;

    /* renamed from: p */
    public int f63425p;

    /* renamed from: q */
    public boolean f63426q;

    /* renamed from: s */
    private DmtTextView f63427s;

    /* renamed from: t */
    private C33744d f63428t;

    /* renamed from: u */
    private List<MusicModel> f63429u;

    /* renamed from: v */
    private ValueAnimator f63430v;

    /* renamed from: w */
    private Context f63431w;

    /* renamed from: x */
    private Animation f63432x;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder$a */
    public static final class C23996a {
        private C23996a() {
        }

        public /* synthetic */ C23996a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static View m78744a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            C7573i.m23587b(layoutInflater, "inflater");
            C7573i.m23587b(viewGroup, "viewGroup");
            View inflate = layoutInflater.inflate(R.layout.zm, viewGroup, false);
            C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…_radio, viewGroup, false)");
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder$b */
    public interface C23997b {
        /* renamed from: a */
        void mo62244a();
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder$c */
    static final class C23998c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ MusicRadioViewHolder f63439a;

        /* renamed from: b */
        final /* synthetic */ FloatRef f63440b;

        /* renamed from: c */
        final /* synthetic */ FloatRef f63441c;

        C23998c(MusicRadioViewHolder musicRadioViewHolder, FloatRef floatRef, FloatRef floatRef2) {
            this.f63439a = musicRadioViewHolder;
            this.f63440b = floatRef;
            this.f63441c = floatRef2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                RemoteImageView remoteImageView = this.f63439a.f63411b;
                if (remoteImageView != null) {
                    remoteImageView.setScaleX(floatValue);
                }
                RemoteImageView remoteImageView2 = this.f63439a.f63411b;
                if (remoteImageView2 != null) {
                    remoteImageView2.setScaleY(floatValue);
                }
                RemoteImageView remoteImageView3 = this.f63439a.f63411b;
                if (remoteImageView3 != null) {
                    remoteImageView3.setAlpha((floatValue - this.f63440b.element) / this.f63441c.element);
                }
                RemoteImageView remoteImageView4 = this.f63439a.f63412c;
                if (remoteImageView4 != null) {
                    remoteImageView4.setScaleX((this.f63440b.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView5 = this.f63439a.f63412c;
                if (remoteImageView5 != null) {
                    remoteImageView5.setScaleY((this.f63440b.element + 1.0f) - floatValue);
                }
                RemoteImageView remoteImageView6 = this.f63439a.f63412c;
                if (remoteImageView6 != null) {
                    remoteImageView6.setAlpha((1.0f - floatValue) / this.f63441c.element);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder$d */
    public static final class C23999d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ MusicRadioViewHolder f63442a;

        C23999d(MusicRadioViewHolder musicRadioViewHolder) {
            this.f63442a = musicRadioViewHolder;
        }

        public final void onAnimationEnd(Animator animator) {
            C7573i.m23587b(animator, "animation");
            RemoteImageView remoteImageView = this.f63442a.f63412c;
            this.f63442a.f63412c = this.f63442a.f63411b;
            this.f63442a.f63411b = remoteImageView;
            this.f63442a.mo62226a(this.f63442a.f63412c, this.f63442a.f63425p + 1);
        }
    }

    /* renamed from: j */
    private final void m78723j() {
        this.f63426q = !this.f63426q;
    }

    /* renamed from: m */
    private final void m78726m() {
        C23997b bVar = this.f63423n;
        if (bVar != null) {
            bVar.mo62244a();
        }
    }

    /* renamed from: f */
    public final MusicModel mo62235f() {
        List<MusicModel> list = this.f63429u;
        if (list != null) {
            MusicModel musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
            if (musicModel != null) {
                return musicModel;
            }
        }
        return null;
    }

    /* renamed from: l */
    private final void m78725l() {
        LinearLayout linearLayout = this.f63420k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f63421l;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f63422m;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* renamed from: n */
    private final void m78727n() {
        MusicModel musicModel;
        C33744d dVar = this.f63428t;
        if (dVar != null) {
            C1293v vVar = this;
            View view = this.f63419j;
            List<MusicModel> list = this.f63429u;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
            } else {
                musicModel = null;
            }
            dVar.mo62273a(vVar, view, musicModel);
        }
    }

    /* renamed from: a */
    public final void mo62225a() {
        MusicModel musicModel;
        boolean z = this.f63426q;
        List<MusicModel> list = this.f63429u;
        if (list != null) {
            musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
        } else {
            musicModel = null;
        }
        C42961az.m136380a(new C33769d(z ? 1 : 0, musicModel));
    }

    /* renamed from: c */
    public final void mo62232c() {
        int i;
        CheckableImageView checkableImageView = this.f63418i;
        if (checkableImageView != null) {
            if (this.f63426q) {
                i = R.drawable.a3w;
            } else {
                i = R.drawable.a3x;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* renamed from: g */
    public final void mo62236g() {
        LinearLayout linearLayout = this.f63420k;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            m78725l();
        }
        m78727n();
    }

    /* renamed from: h */
    public final void mo62237h() {
        MusicModel musicModel;
        C33744d dVar = this.f63428t;
        if (dVar != null) {
            C1293v vVar = this;
            View view = this.f63421l;
            List<MusicModel> list = this.f63429u;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
            } else {
                musicModel = null;
            }
            dVar.mo62273a(vVar, view, musicModel);
        }
    }

    /* renamed from: i */
    public final void mo62238i() {
        MusicModel musicModel;
        C33744d dVar = this.f63428t;
        if (dVar != null) {
            C1293v vVar = this;
            View view = this.f63418i;
            List<MusicModel> list = this.f63429u;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
            } else {
                musicModel = null;
            }
            dVar.mo62273a(vVar, view, musicModel);
        }
    }

    /* renamed from: d */
    public final void mo62233d() {
        MusicModel musicModel;
        m78725l();
        C33744d dVar = this.f63428t;
        if (dVar != null) {
            C1293v vVar = this;
            View view = this.f63420k;
            List<MusicModel> list = this.f63429u;
            if (list != null) {
                musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
            } else {
                musicModel = null;
            }
            dVar.mo62273a(vVar, view, musicModel);
        }
    }

    /* renamed from: k */
    private final void m78724k() {
        FloatRef floatRef = new FloatRef();
        floatRef.element = 0.2f;
        FloatRef floatRef2 = new FloatRef();
        floatRef2.element = 1.0f - floatRef.element;
        this.f63430v = ValueAnimator.ofFloat(new float[]{1.0f, floatRef.element}).setDuration(150);
        RemoteImageView remoteImageView = this.f63412c;
        if (remoteImageView != null) {
            remoteImageView.setAlpha(0.0f);
        }
        RemoteImageView remoteImageView2 = this.f63412c;
        if (remoteImageView2 != null) {
            remoteImageView2.setVisibility(0);
        }
        ValueAnimator valueAnimator = this.f63430v;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C23998c(this, floatRef, floatRef2));
        }
        ValueAnimator valueAnimator2 = this.f63430v;
        if (valueAnimator2 != null) {
            valueAnimator2.addListener(new C23999d(this));
        }
        ValueAnimator valueAnimator3 = this.f63430v;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* renamed from: b */
    public final void mo62230b() {
        MusicModel musicModel;
        MusicModel musicModel2;
        String str;
        List<MusicModel> list = this.f63429u;
        MusicModel musicModel3 = null;
        if (list != null) {
            musicModel = (MusicModel) C7525m.m23504c(list, this.f63425p);
        } else {
            musicModel = null;
        }
        if (musicModel != null) {
            List<MusicModel> list2 = this.f63429u;
            if (list2 != null) {
                musicModel2 = (MusicModel) C7525m.m23504c(list2, this.f63425p);
            } else {
                musicModel2 = null;
            }
            if (C33784d.m108931a(musicModel2, this.f63431w, true)) {
                C33746f<C23822c> fVar = this.f63424o;
                if (fVar != null) {
                    List<MusicModel> list3 = this.f63429u;
                    if (list3 != null) {
                        musicModel3 = (MusicModel) C7525m.m23504c(list3, this.f63425p);
                    }
                    if (this.f63426q) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    fVar.mo61995a(new C23822c(musicModel3, str, 0, this.f63425p));
                }
                m78723j();
                CheckableImageView checkableImageView = this.f63418i;
                if (checkableImageView != null) {
                    checkableImageView.mo86446b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo62234e() {
        int i;
        MusicModel musicModel;
        int i2 = this.f63425p + 1;
        List<MusicModel> list = this.f63429u;
        int i3 = 0;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i2 >= i) {
            m78726m();
            return;
        }
        List<MusicModel> list2 = this.f63429u;
        if (list2 != null) {
            i3 = list2.size();
        }
        if (i3 - this.f63425p <= 3) {
            m78726m();
        }
        this.f63425p++;
        m78721a(this.f63425p, true);
        C33744d dVar = this.f63428t;
        if (dVar != null) {
            C1293v vVar = this;
            View view = this.f63422m;
            List<MusicModel> list3 = this.f63429u;
            if (list3 != null) {
                musicModel = (MusicModel) C7525m.m23504c(list3, this.f63425p);
            } else {
                musicModel = null;
            }
            dVar.mo62273a(vVar, view, musicModel);
        }
    }

    /* renamed from: a */
    public final void mo62227a(C33744d dVar) {
        C7573i.m23587b(dVar, "IOnClickListener");
        this.f63428t = dVar;
    }

    /* renamed from: a */
    private static String m78720a(MusicModel musicModel) {
        CharSequence charSequence;
        boolean z;
        CharSequence charSequence2;
        if (musicModel != null) {
            charSequence = musicModel.getPicPremium();
        } else {
            charSequence = null;
        }
        CharSequence charSequence3 = charSequence;
        boolean z2 = false;
        if (charSequence3 == null || charSequence3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (musicModel != null) {
                charSequence2 = musicModel.getPicBig();
            } else {
                charSequence2 = null;
            }
            CharSequence charSequence4 = charSequence2;
            if (charSequence4 == null || charSequence4.length() == 0) {
                z2 = true;
            }
            if (!z2 && musicModel != null) {
                return musicModel.getPicBig();
            }
        } else if (musicModel != null) {
            return musicModel.getPicPremium();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r0 == false) goto L_0x0027;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62231b(java.util.List<? extends com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel> r4) {
        /*
            r3 = this;
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f63429u
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            if (r0 == 0) goto L_0x0026
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f63429u
            if (r0 != 0) goto L_0x0034
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r3.f63429u = r0
        L_0x0034:
            if (r4 == 0) goto L_0x003f
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r0 = r3.f63429u
            if (r0 == 0) goto L_0x003f
            java.util.Collection r4 = (java.util.Collection) r4
            r0.addAll(r4)
        L_0x003f:
            if (r1 == 0) goto L_0x0046
            int r4 = r3.f63425p
            r3.m78721a(r4, r2)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicRadioViewHolder.mo62231b(java.util.List):void");
    }

    public MusicRadioViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        this.f63431w = view.getContext();
        this.f63411b = (RemoteImageView) view.findViewById(R.id.b82);
        this.f63412c = (RemoteImageView) view.findViewById(R.id.b83);
        this.f63413d = (ImageView) view.findViewById(R.id.bch);
        this.f63414e = (FrameLayout) view.findViewById(R.id.cua);
        this.f63416g = (DmtTextView) view.findViewById(R.id.e21);
        this.f63415f = (DmtTextView) view.findViewById(R.id.dyg);
        this.f63417h = (RelativeLayout) view.findViewById(R.id.cuu);
        this.f63427s = (DmtTextView) view.findViewById(R.id.dy_);
        this.f63418i = (CheckableImageView) view.findViewById(R.id.bae);
        this.f63419j = (LinearLayout) view.findViewById(R.id.bs2);
        this.f63420k = (LinearLayout) view.findViewById(R.id.br5);
        this.f63421l = (LinearLayout) view.findViewById(R.id.bsu);
        this.f63422m = (LinearLayout) view.findViewById(R.id.bst);
        View view2 = this.itemView;
        C7573i.m23582a((Object) view2, "itemView");
        this.f63432x = AnimationUtils.loadAnimation(view2.getContext(), R.anim.bu);
        Animation animation = this.f63432x;
        if (animation != null) {
            animation.setInterpolator(new LinearInterpolator());
        }
        LinearLayout linearLayout = this.f63420k;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63433a;

                {
                    this.f63433a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f63433a.mo62233d();
                }
            });
        }
        LinearLayout linearLayout2 = this.f63422m;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63434a;

                {
                    this.f63434a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f63434a.mo62234e();
                }
            });
        }
        LinearLayout linearLayout3 = this.f63419j;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63435a;

                {
                    this.f63435a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f63435a.mo62236g();
                }
            });
        }
        LinearLayout linearLayout4 = this.f63421l;
        if (linearLayout4 != null) {
            linearLayout4.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63436a;

                {
                    this.f63436a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f63436a.mo62237h();
                }
            });
        }
        CheckableImageView checkableImageView = this.f63418i;
        if (checkableImageView != null) {
            checkableImageView.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63437a;

                {
                    this.f63437a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f63437a.mo62238i();
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f63418i;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new C33833a(this) {

                /* renamed from: a */
                final /* synthetic */ MusicRadioViewHolder f63438a;

                /* renamed from: a */
                public final void mo61810a() {
                    this.f63438a.mo62225a();
                }

                {
                    this.f63438a = r1;
                }

                /* renamed from: a */
                public final void mo61811a(int i) {
                    if (i == 1) {
                        this.f63438a.mo62232c();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo62228a(List<MusicModel> list) {
        this.f63429u = list;
        List<MusicModel> list2 = this.f63429u;
        if (list2 != null && !list2.isEmpty()) {
            m78721a(this.f63425p, false);
        }
    }

    /* renamed from: a */
    public final void mo62229a(boolean z, boolean z2) {
        m78722b(z, z2);
    }

    /* renamed from: b */
    private final void m78722b(boolean z, boolean z2) {
        ImageView imageView = this.f63413d;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        if (z && z2) {
            MusicRadioViewHolder musicRadioViewHolder = this;
            ImageView imageView2 = musicRadioViewHolder.f63413d;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.avi);
            }
            ImageView imageView3 = musicRadioViewHolder.f63413d;
            if (imageView3 != null) {
                imageView3.startAnimation(musicRadioViewHolder.f63432x);
            }
        } else if (!z || z2) {
            ImageView imageView4 = this.f63413d;
            if (imageView4 != null) {
                imageView4.setImageResource(R.drawable.acy);
            }
        } else {
            ImageView imageView5 = this.f63413d;
            if (imageView5 != null) {
                imageView5.setImageResource(R.drawable.ady);
            }
        }
    }

    /* renamed from: a */
    public final void mo62226a(RemoteImageView remoteImageView, int i) {
        int i2;
        MusicModel musicModel;
        List<MusicModel> list = this.f63429u;
        boolean z = false;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f63429u;
            if (list2 != null) {
                musicModel = (MusicModel) list2.get(i);
            } else {
                musicModel = null;
            }
            String a = m78720a(musicModel);
            CharSequence charSequence = a;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (z) {
                C23323e.m76503a(remoteImageView, (int) R.color.l1);
            } else {
                C23323e.m76514a(remoteImageView, a);
            }
        }
    }

    /* renamed from: a */
    private final void m78721a(int i, boolean z) {
        int i2;
        MusicModel musicModel;
        int i3;
        int i4;
        CharSequence charSequence;
        boolean z2;
        String singer;
        CharSequence charSequence2;
        List<MusicModel> list = this.f63429u;
        boolean z3 = false;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            List<MusicModel> list2 = this.f63429u;
            CollectionType collectionType = null;
            if (list2 != null) {
                musicModel = (MusicModel) list2.get(i);
            } else {
                musicModel = null;
            }
            DmtTextView dmtTextView = this.f63415f;
            if (dmtTextView != null) {
                if (musicModel != null) {
                    charSequence2 = musicModel.getName();
                } else {
                    charSequence2 = null;
                }
                dmtTextView.setText(charSequence2);
            }
            DmtTextView dmtTextView2 = this.f63416g;
            if (dmtTextView2 != null) {
                if (musicModel != null) {
                    charSequence = musicModel.getSinger();
                } else {
                    charSequence = null;
                }
                CharSequence charSequence3 = charSequence;
                if (charSequence3 == null || charSequence3.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    DmtTextView dmtTextView3 = this.f63416g;
                    if (dmtTextView3 != null) {
                        Context context = dmtTextView3.getContext();
                        if (context != null) {
                            singer = context.getString(R.string.fjo);
                            dmtTextView2.setText(singer);
                        }
                    }
                } else if (musicModel != null) {
                    singer = musicModel.getSinger();
                    dmtTextView2.setText(singer);
                }
                singer = null;
                dmtTextView2.setText(singer);
            }
            if (C33703a.m108723g()) {
                DmtTextView dmtTextView4 = this.f63427s;
                if (dmtTextView4 != null) {
                    if (musicModel != null) {
                        i4 = musicModel.getPresenterDuration();
                    } else {
                        i4 = 0;
                    }
                    dmtTextView4.setText(C43109eu.m136730a(i4));
                }
            } else {
                DmtTextView dmtTextView5 = this.f63427s;
                if (dmtTextView5 != null) {
                    if (musicModel != null) {
                        i3 = musicModel.getDuration();
                    } else {
                        i3 = 0;
                    }
                    dmtTextView5.setText(C43109eu.m136730a(i3));
                }
            }
            CollectionType collectionType2 = CollectionType.COLLECTED;
            if (musicModel != null) {
                collectionType = musicModel.getCollectionType();
            }
            if (collectionType2 == collectionType) {
                z3 = true;
            }
            this.f63426q = z3;
            mo62232c();
            if (!z) {
                mo62226a(this.f63411b, i);
                mo62226a(this.f63412c, i + 1);
                return;
            }
            m78724k();
        }
    }
}
