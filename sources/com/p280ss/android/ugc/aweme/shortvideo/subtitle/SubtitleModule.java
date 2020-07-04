package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1287r;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bolts.C1588d;
import bolts.C1590f;
import bolts.C1591g;
import bolts.C1592h;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.scene.C12629j;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.activity.C23258e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.effect.C27358a;
import com.p280ss.android.ugc.aweme.effect.C27439r;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.InfoStickerModel;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34856c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.shortvideo.C38511bc;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.C39961gh;
import com.p280ss.android.ugc.aweme.shortvideo.C39966gm;
import com.p280ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p280ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.edit.C39500av;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39591h;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.p1565a.C39548d;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p280ss.android.ugc.aweme.shortvideo.net.C40198a;
import com.p280ss.android.ugc.aweme.shortvideo.net.NetStateReceiver;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1605g.C40582c;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.C42078c.C42080a;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.AVApi;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.gamora.editor.EditSubtitleViewModel;
import com.p280ss.android.ugc.gamora.editor.EditViewModel;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.SET_RANGE_MODE;
import com.p280ss.android.vesdk.VEListener.VEInfoStickerBufferListener;
import com.p280ss.android.vesdk.VERecordData;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47516v;
import dmt.p1861av.video.C47518x;
import dmt.p1861av.video.C47518x.C47519a;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7561a;
import kotlin.p1877a.C47886a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule */
public class SubtitleModule extends C12629j {

    /* renamed from: P */
    public static ConcurrentHashMap<Integer, StickerItemModel> f106765P = new ConcurrentHashMap<>();

    /* renamed from: Q */
    public static HashMap<Integer, StickerItemModel> f106766Q = new HashMap<>();

    /* renamed from: R */
    public static String f106767R = "";

    /* renamed from: S */
    public static final C41064b f106768S = new C41064b(null);

    /* renamed from: i */
    static final /* synthetic */ C7595j[] f106769i = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(SubtitleModule.class), "api", "getApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/SubtitleApi;"))};

    /* renamed from: A */
    public C27358a f106770A;

    /* renamed from: B */
    public C0052o<C47516v> f106771B;

    /* renamed from: C */
    public SafeHandler f106772C;

    /* renamed from: D */
    public SafeHandler f106773D;

    /* renamed from: E */
    public RecyclerView f106774E;

    /* renamed from: F */
    public C41068d f106775F;

    /* renamed from: G */
    public int f106776G = 2;

    /* renamed from: H */
    public ArrayList<UtteranceWithWords> f106777H = new ArrayList<>();

    /* renamed from: I */
    public String f106778I;

    /* renamed from: J */
    public LinearLayout f106779J;

    /* renamed from: K */
    public View f106780K;

    /* renamed from: L */
    public boolean f106781L;

    /* renamed from: M */
    public SpaceItemDecoration f106782M;

    /* renamed from: N */
    public boolean f106783N;

    /* renamed from: O */
    public boolean f106784O;

    /* renamed from: T */
    private C41069e f106785T;

    /* renamed from: U */
    private InfoStickerModel f106786U;

    /* renamed from: V */
    private C42939as f106787V;

    /* renamed from: W */
    private C42078c f106788W;

    /* renamed from: X */
    private View f106789X;

    /* renamed from: Y */
    private View f106790Y;

    /* renamed from: Z */
    private View f106791Z;

    /* renamed from: aa */
    private EditViewModel f106792aa;

    /* renamed from: ab */
    private EditSubtitleViewModel f106793ab;

    /* renamed from: ac */
    private VEVideoPublishEditViewModel f106794ac;

    /* renamed from: ad */
    private InputMethodManager f106795ad;

    /* renamed from: ae */
    private SubtitleStyleViewModel f106796ae;

    /* renamed from: af */
    private C40198a f106797af;

    /* renamed from: ag */
    private int f106798ag = -1;

    /* renamed from: ah */
    private boolean f106799ah;

    /* renamed from: ai */
    private long f106800ai;

    /* renamed from: aj */
    private C23258e f106801aj;

    /* renamed from: ak */
    private final C23254a f106802ak = new C41086s(this);

    /* renamed from: al */
    private final ValueAnimator f106803al;

    /* renamed from: am */
    private final C7541d f106804am;

    /* renamed from: j */
    public String f106805j;

    /* renamed from: k */
    public long f106806k;

    /* renamed from: l */
    public float f106807l = 0.004f;

    /* renamed from: m */
    public C41067c f106808m;
    @BindView(2131493890)
    public TextView mCancelView;
    @BindView(2131493017)
    public FrameLayout mContentLayout;
    @BindView(2131493104)
    public RelativeLayout mEffectTitleLayout;
    @BindView(2131493205)
    public View mHighLightArea;
    @BindView(2131493246)
    public ImageView mIvDelete;
    @BindView(2131493247)
    public ImageView mIvFont;
    @BindView(2131493425)
    public LinearLayout mLoadingArea;
    @BindView(2131493426)
    public TextView mLoadingHint;
    @BindView(2131493428)
    public TextView mLoadingProgress;
    @BindView(2131493429)
    public DmtStatusView mLoadingStatusView;
    @BindView(2131493587)
    public AVDmtPanelRecyleView mRecyclerView;
    @BindView(2131493927)
    public TextView mSaveView;
    @BindView(2131493789)
    public LinearLayout mSubtitleLayout;

    /* renamed from: n */
    public SubtitleEditTypeLayout f106809n;

    /* renamed from: o */
    public boolean f106810o;

    /* renamed from: p */
    public C1590f f106811p = new C1590f();

    /* renamed from: q */
    public SubtitleTextView f106812q;

    /* renamed from: r */
    public C39591h f106813r;

    /* renamed from: s */
    public HighLightLayoutManager f106814s;

    /* renamed from: t */
    public SubtitleAdapter f106815t;

    /* renamed from: u */
    public SubtitleEditAdapter f106816u;

    /* renamed from: v */
    public VideoPublishEditModel f106817v;

    /* renamed from: w */
    public FragmentActivity f106818w;

    /* renamed from: x */
    public C15389d f106819x;

    /* renamed from: y */
    public int f106820y;

    /* renamed from: z */
    public ViewGroup f106821z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$HighLightLayoutManager */
    public final class HighLightLayoutManager extends LinearLayoutManager {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$HighLightLayoutManager$HighLightSmoothScroller */
        public final class HighLightSmoothScroller extends LinearSmoothScroller {
            /* renamed from: c */
            public final int mo5473c() {
                return -1;
            }

            /* renamed from: c */
            public final PointF mo5861c(int i) {
                return HighLightLayoutManager.this.mo5434d(i);
            }

            /* renamed from: a */
            public final float mo5464a(DisplayMetrics displayMetrics) {
                Integer num;
                float f = SubtitleModule.this.f106807l;
                if (displayMetrics != null) {
                    num = Integer.valueOf(displayMetrics.densityDpi);
                } else {
                    num = null;
                }
                if (num == null) {
                    C7573i.m23580a();
                }
                return f / ((float) num.intValue());
            }

            public HighLightSmoothScroller(Context context) {
                super(context);
            }

            /* renamed from: a */
            public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                return (i3 - i) + ((int) C9738o.m28708b((Context) SubtitleModule.m131148d(SubtitleModule.this), 52.0f));
            }
        }

        /* renamed from: a */
        public final void mo5422a(RecyclerView recyclerView, C1290s sVar, int i) {
            Context context;
            if (recyclerView != null) {
                context = recyclerView.getContext();
            } else {
                context = null;
            }
            HighLightSmoothScroller highLightSmoothScroller = new HighLightSmoothScroller(context);
            highLightSmoothScroller.f4993g = i;
            mo5755a((C1287r) highLightSmoothScroller);
        }

        public HighLightLayoutManager(Context context, int i, boolean z) {
            super(context, 1, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$SpaceItemDecoration */
    public final class SpaceItemDecoration extends C1272h {

        /* renamed from: b */
        private final int f106825b;

        /* renamed from: c */
        private final int f106826c;

        public SpaceItemDecoration(int i, int i2) {
            this.f106825b = i;
            this.f106826c = i2;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
            Integer num;
            C7573i.m23587b(rect, "outRect");
            C7573i.m23587b(view, "view");
            C7573i.m23587b(recyclerView, "parent");
            C7573i.m23587b(sVar, "state");
            int f = RecyclerView.m5892f(view);
            if (f == 0) {
                rect.top = this.f106825b;
            }
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.mo5744A() - 1);
            } else {
                num = null;
            }
            if (num != null) {
                C1273i layoutManager2 = recyclerView.getLayoutManager();
                if (layoutManager2 != null && f == layoutManager2.mo5744A() - 1) {
                    rect.bottom = this.f106826c;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$SubtitleAdapter */
    public final class SubtitleAdapter extends C1262a<SubtitleViewHolder> {

        /* renamed from: a */
        public int f106827a = -1;

        /* renamed from: b */
        public View f106828b;

        /* renamed from: c */
        public ArrayList<UtteranceWithWords> f106829c;

        /* renamed from: d */
        final /* synthetic */ SubtitleModule f106830d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$SubtitleAdapter$SubtitleViewHolder */
        public final class SubtitleViewHolder extends C1293v {

            /* renamed from: a */
            public final TextView f106831a;

            /* renamed from: b */
            final /* synthetic */ SubtitleAdapter f106832b;

            public SubtitleViewHolder(SubtitleAdapter subtitleAdapter, View view) {
                C7573i.m23587b(view, "itemView");
                this.f106832b = subtitleAdapter;
                super(view);
                View findViewById = view.findViewById(R.id.ddb);
                C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.subtitle_item_text)");
                this.f106831a = (TextView) findViewById;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$SubtitleAdapter$a */
        static final class C41029a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ SubtitleAdapter f106833a;

            /* renamed from: b */
            final /* synthetic */ SubtitleViewHolder f106834b;

            C41029a(SubtitleAdapter subtitleAdapter, SubtitleViewHolder subtitleViewHolder) {
                this.f106833a = subtitleAdapter;
                this.f106834b = subtitleViewHolder;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f106833a.f106830d.mo101478a(this.f106834b.getAdapterPosition(), false);
            }
        }

        public final int getItemCount() {
            return this.f106829c.size();
        }

        /* renamed from: b */
        private final boolean m131210b(int i) {
            if (this.f106827a == i) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo101497a(int i) {
            if (i != -1 && i != this.f106827a) {
                int i2 = this.f106827a;
                this.f106827a = i;
                if (this.f106830d.mo101494d().mo5575f(i2) != null) {
                    C1293v f = this.f106830d.mo101494d().mo5575f(i2);
                    if (f != null) {
                        ((SubtitleViewHolder) f).f106831a.setTextColor(this.f106830d.mo31017x().getColor(R.color.aza));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.SubtitleAdapter.SubtitleViewHolder");
                    }
                }
                if (this.f106830d.mo101494d().mo5575f(i) != null) {
                    C1293v f2 = this.f106830d.mo101494d().mo5575f(i);
                    if (f2 != null) {
                        ((SubtitleViewHolder) f2).f106831a.setTextColor(this.f106830d.mo31017x().getColor(R.color.az3));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule.SubtitleAdapter.SubtitleViewHolder");
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo101498a(List<? extends UtteranceWithWords> list) {
            C7573i.m23587b(list, "list");
            ArrayList<UtteranceWithWords> arrayList = new ArrayList<>();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
            }
            this.f106829c = arrayList;
            notifyDataSetChanged();
        }

        public SubtitleAdapter(SubtitleModule subtitleModule, ArrayList<UtteranceWithWords> arrayList) {
            C7573i.m23587b(arrayList, "list");
            this.f106830d = subtitleModule;
            this.f106829c = arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SubtitleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            C7573i.m23587b(viewGroup, "p0");
            View inflate = LayoutInflater.from(SubtitleModule.m131148d(this.f106830d)).inflate(R.layout.ajz, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(mAct…subtitle_item, p0, false)");
            this.f106828b = inflate;
            View view = this.f106828b;
            if (view == null) {
                C7573i.m23583a("view");
            }
            return new SubtitleViewHolder(this, view);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(SubtitleViewHolder subtitleViewHolder, int i) {
            C7573i.m23587b(subtitleViewHolder, "p0");
            if (m131210b(i)) {
                subtitleViewHolder.f106831a.setTextColor(this.f106830d.mo31017x().getColor(R.color.az3));
            } else {
                subtitleViewHolder.f106831a.setTextColor(this.f106830d.mo31017x().getColor(R.color.aza));
            }
            subtitleViewHolder.f106831a.setVisibility(0);
            subtitleViewHolder.f106831a.setText(((UtteranceWithWords) this.f106829c.get(i)).getText());
            if (!TextUtils.isEmpty(subtitleViewHolder.f106831a.getText())) {
                subtitleViewHolder.f106831a.setOnClickListener(new C41029a(this, subtitleViewHolder));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$a */
    static final class C41030a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ValueAnimator f106835a;

        /* renamed from: b */
        final /* synthetic */ SubtitleModule f106836b;

        C41030a(ValueAnimator valueAnimator, SubtitleModule subtitleModule) {
            this.f106835a = valueAnimator;
            this.f106836b = subtitleModule;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            final IntRef intRef = new IntRef();
            C7573i.m23582a((Object) valueAnimator, "animation");
            int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * ((float) this.f106835a.getDuration()));
            if (animatedFraction >= 0 && 6000 >= animatedFraction) {
                intRef.element = animatedFraction / 100;
            } else if (6000 <= animatedFraction && 10000 >= animatedFraction) {
                intRef.element = ((animatedFraction - 6000) / C34943c.f91127w) + 60;
            } else {
                intRef.element = ((animatedFraction - VideoCacheTTnetProxyTimeoutExperiment.DEFAULT) / C34943c.f91128x) + 80;
            }
            SubtitleModule.m131119a(this.f106836b).post(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C41030a f106837a;

                {
                    this.f106837a = r1;
                }

                public final void run() {
                    this.f106837a.f106836b.mo101496e().setText(this.f106837a.f106836b.mo31017x().getString(R.string.n7, new Object[]{Integer.valueOf(intRef.element)}));
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aa */
    static final class C41032aa<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106839a;

        C41032aa(SubtitleModule subtitleModule) {
            this.f106839a = subtitleModule;
        }

        /* renamed from: a */
        private void m131213a() {
            this.f106839a.mo101468R();
        }

        public final /* synthetic */ Object call() {
            m131213a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ab */
    static final class C41033ab<TTaskResult, TContinuationResult> implements C1591g<TResult, TContinuationResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106840a;

        /* renamed from: b */
        final /* synthetic */ C39961gh f106841b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f106842c;

        /* renamed from: d */
        final /* synthetic */ C1588d f106843d;

        C41033ab(SubtitleModule subtitleModule, C39961gh ghVar, SubtitleApiV2 subtitleApiV2, C1588d dVar) {
            this.f106840a = subtitleModule;
            this.f106841b = ghVar;
            this.f106842c = subtitleApiV2;
            this.f106843d = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<C7581n> then(C1592h<C7581n> hVar) {
            String str = this.f106840a.f106778I;
            if (str == null) {
                C7573i.m23580a();
            }
            SubtitleOriginalSoundUploadTask subtitleOriginalSoundUploadTask = new SubtitleOriginalSoundUploadTask(str);
            C39961gh ghVar = this.f106841b;
            C7573i.m23582a((Object) ghVar, "config");
            C39966gm gmVar = ghVar.f103779a;
            C7573i.m23582a((Object) gmVar, "config.uploadVideoConfig");
            return subtitleOriginalSoundUploadTask.mo101531a(gmVar).mo6881b(new C1591g<SubtitleOriginalSoundUploadTask, C1592h<C41110d>>(this) {

                /* renamed from: a */
                final /* synthetic */ C41033ab f106844a;

                {
                    this.f106844a = r1;
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C1592h<C41110d> then(C1592h<SubtitleOriginalSoundUploadTask> hVar) {
                    boolean z;
                    C7573i.m23582a((Object) hVar, "it");
                    if (hVar.mo6882b() && ((SubtitleOriginalSoundUploadTask) hVar.mo6890e()).f106942a != null) {
                        String str = ((SubtitleOriginalSoundUploadTask) hVar.mo6890e()).f106942a;
                        if (str == null) {
                            C7573i.m23580a();
                        }
                        if (str.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            this.f106844a.f106840a.f106813r.mo98671e(true);
                            SubtitleApiV2 subtitleApiV2 = this.f106844a.f106842c;
                            String str2 = ((SubtitleOriginalSoundUploadTask) hVar.mo6890e()).f106942a;
                            if (str2 == null) {
                                C7573i.m23580a();
                            }
                            return subtitleApiV2.submit(str2, 1, 20);
                        }
                    }
                    Exception f = hVar.mo6891f();
                    C7573i.m23582a((Object) f, "it.error");
                    throw f;
                }
            }, C1592h.f5957a, this.f106843d).mo6877a((C1591g<TResult, TContinuationResult>) new C1591g<C41110d, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C41033ab f106845a;

                {
                    this.f106845a = r1;
                }

                public final /* synthetic */ Object then(C1592h hVar) {
                    m131216a(hVar);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m131216a(C1592h<C41110d> hVar) {
                    String str;
                    boolean z;
                    C7573i.m23582a((Object) hVar, "it");
                    if (hVar.mo6882b() && ((C41110d) hVar.mo6890e()).f106967a == 0) {
                        if (((C41110d) hVar.mo6890e()).f106968b.f106963a.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            SubtitleModule.f106767R = ((C41110d) hVar.mo6890e()).f106968b.f106963a;
                            SubtitleModule subtitleModule = this.f106845a.f106840a;
                            SubtitleApiV2 subtitleApiV2 = this.f106845a.f106842c;
                            C7573i.m23582a((Object) subtitleApiV2, "uploadApi");
                            subtitleModule.mo101481a(subtitleApiV2, SubtitleModule.f106767R);
                            return;
                        }
                    }
                    this.f106845a.f106840a.mo101473X();
                    this.f106845a.f106840a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C410352 f106846a;

                        {
                            this.f106846a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m131217a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m131217a() {
                            this.f106846a.f106845a.f106840a.mo101470U();
                        }
                    });
                    SubtitleModule subtitleModule2 = this.f106845a.f106840a;
                    String str2 = "error";
                    if (hVar.mo6891f() != null) {
                        str = hVar.mo6891f().getMessage();
                    } else if (hVar.mo6890e() != null) {
                        str = String.valueOf(((C41110d) hVar.mo6890e()).f106967a);
                    } else {
                        str = "";
                    }
                    subtitleModule2.mo101484a(str2, str);
                }
            }, C1592h.f5958b, this.f106843d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ac */
    static final class C41037ac<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ SubtitleApiV2 f106847a;

        /* renamed from: b */
        final /* synthetic */ String f106848b;

        C41037ac(SubtitleApiV2 subtitleApiV2, String str) {
            this.f106847a = subtitleApiV2;
            this.f106848b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C41110d call() {
            C1592h query = this.f106847a.query(this.f106848b);
            query.mo6892g();
            return (C41110d) query.mo6890e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ad */
    static final class C41038ad<TTaskResult, TContinuationResult> implements C1591g<C41110d, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106849a;

        /* renamed from: b */
        final /* synthetic */ SubtitleApiV2 f106850b;

        /* renamed from: c */
        final /* synthetic */ String f106851c;

        C41038ad(SubtitleModule subtitleModule, SubtitleApiV2 subtitleApiV2, String str) {
            this.f106849a = subtitleModule;
            this.f106850b = subtitleApiV2;
            this.f106851c = str;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m131219a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131219a(C1592h<C41110d> hVar) {
            String str;
            String str2;
            C7573i.m23582a((Object) hVar, "task");
            if (hVar.mo6889d() || hVar.mo6887c()) {
                this.f106849a.mo101473X();
                this.f106849a.mo101491b(this.f106850b, this.f106851c);
                SubtitleModule subtitleModule = this.f106849a;
                String str3 = "error";
                if (hVar.mo6891f() != null) {
                    str = hVar.mo6891f().getMessage();
                } else if (hVar.mo6890e() != null) {
                    str = String.valueOf(((C41110d) hVar.mo6890e()).f106967a);
                } else {
                    str = "";
                }
                subtitleModule.mo101484a(str3, str);
                return;
            }
            if (hVar.mo6882b()) {
                if (((C41110d) hVar.mo6890e()).f106967a == 0) {
                    List<? extends UtteranceWithWords> list = ((C41110d) hVar.mo6890e()).f106968b.f106966d;
                    SubtitleModule.m131118S();
                    if (list.isEmpty()) {
                        this.f106849a.mo101473X();
                        this.f106849a.mo101471V();
                        str2 = "empty";
                    } else {
                        SubtitleModule.m131144b(this.f106849a).removeCallbacksAndMessages(null);
                        this.f106849a.mo101486a(list);
                        str2 = "succeed";
                    }
                    this.f106849a.mo101484a(str2, "");
                    return;
                }
                this.f106849a.mo101473X();
                if (((C41110d) hVar.mo6890e()).f106967a == 2172) {
                    this.f106849a.mo101471V();
                } else if (((C41110d) hVar.mo6890e()).f106967a == 2171) {
                    this.f106849a.mo101491b(this.f106850b, this.f106851c);
                } else {
                    this.f106849a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C41038ad f106852a;

                        {
                            this.f106852a = r1;
                        }

                        /* renamed from: a */
                        private void m131220a() {
                            this.f106852a.f106849a.mo101470U();
                        }

                        public final /* synthetic */ Object invoke() {
                            m131220a();
                            return C7581n.f20898a;
                        }
                    });
                }
                this.f106849a.mo101484a("error", String.valueOf(((C41110d) hVar.mo6890e()).f106967a));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ae */
    public static final class C41040ae implements C18245g<Object> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106853a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ae$a */
        static final class C41041a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C41040ae f106854a;

            C41041a(C41040ae aeVar) {
                this.f106854a = aeVar;
                super(0);
            }

            /* renamed from: a */
            private void m131221a() {
                this.f106854a.f106853a.mo101469T();
            }

            public final /* synthetic */ Object invoke() {
                m131221a();
                return C7581n.f20898a;
            }
        }

        C41040ae(SubtitleModule subtitleModule) {
            this.f106853a = subtitleModule;
        }

        public final void onSuccess(Object obj) {
            this.f106853a.mo101470U();
        }

        public final void onFailure(Throwable th) {
            C7573i.m23587b(th, "t");
            if (this.f106853a.f106776G > 0) {
                this.f106853a.mo101469T();
                this.f106853a.f106776G--;
                return;
            }
            this.f106853a.mo101487a((C7561a<C7581n>) new C41041a<C7581n>(this));
            this.f106853a.f106776G = 2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$af */
    static final class C41042af implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106855a;

        C41042af(SubtitleModule subtitleModule) {
            this.f106855a = subtitleModule;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f106855a.mo30922I();
            this.f106855a.mo96987K();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ag */
    static final class C41043ag implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106856a;

        /* renamed from: b */
        final /* synthetic */ C41113g f106857b;

        C41043ag(SubtitleModule subtitleModule, C41113g gVar) {
            this.f106856a = subtitleModule;
            this.f106857b = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106857b.mo74849b(new C40582c());
            this.f106856a.mo96987K();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ah */
    static final class C41044ah implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106858a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ah$a */
        static final class C41045a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41044ah f106859a;

            C41045a(C41044ah ahVar) {
                this.f106859a = ahVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f106859a.f106858a.mo30922I();
                this.f106859a.f106858a.mo96987K();
                this.f106859a.f106858a.mo101484a("cancel", "");
            }
        }

        C41044ah(SubtitleModule subtitleModule) {
            this.f106858a = subtitleModule;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            new C10741a(SubtitleModule.m131148d(this.f106858a)).mo25657b((int) R.string.n_).mo25658b((int) R.string.o3, (DialogInterface.OnClickListener) new C41045a(this)).mo25650a((int) R.string.na, (DialogInterface.OnClickListener) null).mo25656a().mo25637a().show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ai */
    static final class C41046ai extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106860a;

        /* renamed from: b */
        final /* synthetic */ String f106861b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f106862c;

        C41046ai(SubtitleModule subtitleModule, String str, SubtitleApiV2 subtitleApiV2) {
            this.f106860a = subtitleModule;
            this.f106861b = str;
            this.f106862c = subtitleApiV2;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m131222a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131222a() {
            if (this.f106861b == null) {
                this.f106860a.mo101470U();
                return;
            }
            this.f106860a.mo101481a(this.f106862c, this.f106861b);
            SubtitleModule.m131144b(this.f106860a).postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C41046ai f106863a;

                {
                    this.f106863a = r1;
                }

                public final void run() {
                    if (this.f106863a.f106860a.f106777H.isEmpty()) {
                        this.f106863a.f106860a.mo101491b(this.f106863a.f106862c, this.f106863a.f106861b);
                        this.f106863a.f106860a.mo101484a("exceed", "");
                    }
                }
            }, 60000);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aj */
    static final class C41048aj implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106864a;

        /* renamed from: b */
        final /* synthetic */ C41113g f106865b;

        C41048aj(SubtitleModule subtitleModule, C41113g gVar) {
            this.f106864a = subtitleModule;
            this.f106865b = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106865b.mo74849b(new C40582c());
            this.f106864a.mo96987K();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ak */
    static final class C41049ak implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106866a;

        /* renamed from: b */
        final /* synthetic */ C41113g f106867b;

        /* renamed from: c */
        final /* synthetic */ C7561a f106868c;

        C41049ak(SubtitleModule subtitleModule, C41113g gVar, C7561a aVar) {
            this.f106866a = subtitleModule;
            this.f106867b = gVar;
            this.f106868c = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106867b.mo74849b(new C40582c());
            this.f106866a.f106811p.mo6871c();
            this.f106866a.mo101488a(true);
            this.f106866a.f106805j = "retry";
            this.f106866a.f106806k = System.currentTimeMillis();
            this.f106868c.invoke();
            C6907h.m21524a("retry_auto_subtitle", (Map) this.f106866a.mo101474Y().f100112a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$al */
    public static final class C41050al<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((UtteranceWithWords) t).getStartTime()), Integer.valueOf(((UtteranceWithWords) t2).getStartTime()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$am */
    static final class C41051am<T> implements C6892b<Void> {

        /* renamed from: a */
        public static final C41051am f106869a = new C41051am();

        C41051am() {
        }

        public final /* bridge */ /* synthetic */ void run(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$an */
    public static final class C41052an implements C41108b {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106870a;

        C41052an(SubtitleModule subtitleModule) {
            this.f106870a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo101512a(int i) {
            if (!this.f106870a.f106781L) {
                this.f106870a.f106781L = true;
                if (this.f106870a.mo101494d().getAdapter() != null) {
                    int i2 = SubtitleModule.m131149e(this.f106870a).f106827a;
                    if (i2 != -1) {
                        this.f106870a.mo101478a(i2, true);
                    } else {
                        this.f106870a.f106781L = false;
                    }
                    SubtitleModule.m131153h(this.f106870a).mo101452a("", SubtitleModule.m131154i(this.f106870a).infoStickerModel.mBgMode, SubtitleModule.m131154i(this.f106870a).infoStickerModel.mColor, SubtitleModule.m131154i(this.f106870a).infoStickerModel.mAlign, SubtitleModule.m131154i(this.f106870a).infoStickerModel.mFontType, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ao */
    static final class C41053ao<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106871a;

        C41053ao(SubtitleModule subtitleModule) {
            this.f106871a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            if (str != null) {
                SubtitleModule.m131154i(this.f106871a).infoStickerModel.mFontType = str;
                this.f106871a.mo101461J();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ap */
    static final class C41054ap<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106872a;

        C41054ap(SubtitleModule subtitleModule) {
            this.f106872a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                SubtitleModule.m131154i(this.f106872a).infoStickerModel.mBgMode = num.intValue();
                this.f106872a.mo101461J();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$aq */
    static final class C41055aq<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106873a;

        C41055aq(SubtitleModule subtitleModule) {
            this.f106873a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                SubtitleModule.m131154i(this.f106873a).infoStickerModel.mColor = num.intValue();
                this.f106873a.mo101461J();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$ar */
    static final class C41056ar<T> implements C0053p<Integer> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106874a;

        C41056ar(SubtitleModule subtitleModule) {
            this.f106874a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Integer num) {
            if (num != null) {
                SubtitleModule.m131154i(this.f106874a).infoStickerModel.mAlign = num.intValue();
                this.f106874a.mo101461J();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$as */
    static final class C41057as implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106875a;

        /* renamed from: b */
        final /* synthetic */ int f106876b;

        /* renamed from: c */
        final /* synthetic */ int f106877c;

        /* renamed from: d */
        final /* synthetic */ int f106878d;

        /* renamed from: e */
        final /* synthetic */ String f106879e;

        /* renamed from: f */
        final /* synthetic */ C41113g f106880f;

        C41057as(SubtitleModule subtitleModule, int i, int i2, int i3, String str, C41113g gVar) {
            this.f106875a = subtitleModule;
            this.f106876b = i;
            this.f106877c = i2;
            this.f106878d = i3;
            this.f106879e = str;
            this.f106880f = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SubtitleModule.m131153h(this.f106875a).mo101452a("", this.f106876b, this.f106877c, this.f106878d, this.f106879e, false);
            this.f106875a.mo101482a(this.f106880f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$at */
    static final class C41058at implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106881a;

        /* renamed from: b */
        final /* synthetic */ C41113g f106882b;

        C41058at(SubtitleModule subtitleModule, C41113g gVar) {
            this.f106881a = subtitleModule;
            this.f106882b = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106881a.mo101482a(this.f106882b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$au */
    public static final class C41059au extends C40582c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106883a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$au$a */
        static final class C41060a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C41059au f106884a;

            C41060a(C41059au auVar) {
                this.f106884a = auVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout c = this.f106884a.f106883a.mo101493c();
                float b = C9738o.m28708b((Context) SubtitleModule.m131148d(this.f106884a.f106883a), 40.0f);
                C7573i.m23582a((Object) valueAnimator, "animation");
                c.setTranslationY(b * valueAnimator.getAnimatedFraction());
                this.f106884a.f106883a.mo101493c().setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$au$b */
        public static final class C41061b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C41059au f106885a;

            C41061b(C41059au auVar) {
                this.f106885a = auVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C7573i.m23587b(animator, "animation");
                this.f106885a.f106883a.mo101493c().setVisibility(4);
            }
        }

        /* renamed from: a */
        public final void mo74767a() {
            this.f106883a.mo101476a().setVisibility(4);
            this.f106883a.mo101490b().setVisibility(4);
            this.f106883a.mo101493c().setVisibility(0);
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
            C7573i.m23582a((Object) duration, "animator");
            duration.setInterpolator(new C10744c());
            duration.addUpdateListener(new C41060a(this));
            duration.addListener(new C41061b(this));
            duration.start();
        }

        C41059au(SubtitleModule subtitleModule) {
            this.f106883a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$av */
    public static final class C41062av implements C40198a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106886a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$av$a */
        static final class C41063a extends Lambda implements C7561a<C7581n> {

            /* renamed from: a */
            final /* synthetic */ C41062av f106887a;

            C41063a(C41062av avVar) {
                this.f106887a = avVar;
                super(0);
            }

            /* renamed from: a */
            private void m131231a() {
                this.f106887a.f106886a.mo101469T();
            }

            public final /* synthetic */ Object invoke() {
                m131231a();
                return C7581n.f20898a;
            }
        }

        /* renamed from: a */
        public final void mo99999a(int i) {
        }

        /* renamed from: a */
        public final void mo99998a() {
            this.f106886a.mo101487a((C7561a<C7581n>) new C41063a<C7581n>(this));
        }

        C41062av(SubtitleModule subtitleModule) {
            this.f106886a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b */
    public static final class C41064b {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b$a */
        public static final class C41065a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C47886a.m148819a(Integer.valueOf(((C41119h) t).f106990a), Integer.valueOf(((C41119h) t2).f106990a));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$b$b */
        public static final class C41066b implements VEInfoStickerBufferListener {

            /* renamed from: a */
            final /* synthetic */ AbstractMap f106888a;

            /* renamed from: b */
            final /* synthetic */ VideoPublishEditModel f106889b;

            /* renamed from: c */
            final /* synthetic */ Context f106890c;

            public final Bitmap onGetBuffer(int i) {
                if (this.f106888a.get(Integer.valueOf(i)) == null) {
                    C41064b.m131236a(this.f106889b.infoStickerModel, this.f106888a);
                    if (this.f106888a.get(Integer.valueOf(i)) == null) {
                        return null;
                    }
                }
                Object obj = this.f106888a.get(Integer.valueOf(i));
                if (obj == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a(obj, "map[index]!!");
                String text = ((StickerItemModel) obj).getText();
                SubtitleTextView subtitleTextView = new SubtitleTextView(this.f106890c, null, 2, null);
                subtitleTextView.setText(text);
                subtitleTextView.setTextColor(Color.parseColor("#FFFFFF"));
                if (C42039d.m133620a().mo103227b(this.f106889b.infoStickerModel.mFontType) == null) {
                    C42039d a = C42039d.m133620a();
                    C7573i.m23582a((Object) a, "TextFontStyleManager.getInstance()");
                    a.mo103228b();
                }
                C42039d.m133620a().mo103223a(this.f106889b.infoStickerModel.mFontType, 1);
                Typeface b = C42039d.m133620a().mo103227b(this.f106889b.infoStickerModel.mFontType);
                C7573i.m23582a((Object) b, "TextFontStyleManager.get…foStickerModel.mFontType)");
                subtitleTextView.setFontType(b);
                subtitleTextView.mo101544a(this.f106889b.infoStickerModel.mBgMode, this.f106889b.infoStickerModel.mColor);
                subtitleTextView.setAligin(this.f106889b.infoStickerModel.mAlign);
                subtitleTextView.measure(MeasureSpec.makeMeasureSpec(672, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(0, 0));
                Bitmap createBitmap = Bitmap.createBitmap(subtitleTextView.getMeasuredWidth(), subtitleTextView.getMeasuredHeight(), Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                subtitleTextView.layout(0, 0, subtitleTextView.getMeasuredWidth(), subtitleTextView.getMeasuredHeight());
                subtitleTextView.draw(canvas);
                return createBitmap;
            }

            C41066b(AbstractMap abstractMap, VideoPublishEditModel videoPublishEditModel, Context context) {
                this.f106888a = abstractMap;
                this.f106889b = videoPublishEditModel;
                this.f106890c = context;
            }
        }

        private C41064b() {
        }

        /* renamed from: a */
        public static HashMap<Integer, StickerItemModel> m131233a() {
            return SubtitleModule.f106766Q;
        }

        public /* synthetic */ C41064b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m131234a(C15389d dVar) {
            C7573i.m23587b(dVar, "veEditor");
            dVar.mo38774a((VEInfoStickerBufferListener) null);
        }

        /* renamed from: a */
        public final void mo101517a(String str) {
            C7573i.m23587b(str, "vid");
            if (!m131233a().isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Set<Entry> entrySet = m131233a().entrySet();
                C7573i.m23582a((Object) entrySet, "subtitlesMapCompile.entries");
                for (Entry entry : entrySet) {
                    Object value = entry.getValue();
                    C7573i.m23582a(value, "it.value");
                    if (((StickerItemModel) value).isSubtitle()) {
                        Object value2 = entry.getValue();
                        C7573i.m23582a(value2, "it.value");
                        arrayList.add(new C41119h((StickerItemModel) value2));
                    }
                }
                List list = arrayList;
                if (list.size() > 1) {
                    C7525m.m23474a(list, new C41065a());
                }
                m131232a(SubtitleModule.f106767R, new C41107a(str, list));
                m131233a().clear();
            }
        }

        /* renamed from: a */
        private static C1592h<C41111e> m131232a(String str, C41107a aVar) {
            C7573i.m23587b(str, "id");
            C7573i.m23587b(aVar, "body");
            return ((SubtitleApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://speech.bytedance.com").create(SubtitleApi.class)).feedback("douyin_caption", "aweme_token", str, aVar);
        }

        /* renamed from: a */
        public static boolean m131236a(InfoStickerModel infoStickerModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
            C7573i.m23587b(abstractMap, "map");
            if (infoStickerModel == null || C6311g.m19573a(infoStickerModel.stickers)) {
                return false;
            }
            abstractMap.clear();
            for (StickerItemModel stickerItemModel : infoStickerModel.stickers) {
                if (stickerItemModel == null) {
                    if (C7163a.m22363a()) {
                        StringBuilder sb = new StringBuilder("VeSdk add infoSticker failed ");
                        sb.append(infoStickerModel);
                        throw new IllegalStateException(sb.toString());
                    }
                } else if (stickerItemModel.isSubtitle() || stickerItemModel.isSubtitleRule()) {
                    abstractMap.put(Integer.valueOf(stickerItemModel.f83875id), stickerItemModel);
                }
            }
            return true;
        }

        /* renamed from: a */
        public static void m131235a(C15389d dVar, Context context, VideoPublishEditModel videoPublishEditModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
            C7573i.m23587b(dVar, "veEditor");
            C7573i.m23587b(context, "context");
            C7573i.m23587b(videoPublishEditModel, "model");
            C7573i.m23587b(abstractMap, "map");
            if (C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognition) && videoPublishEditModel.hasSubtitle()) {
                int a = dVar.mo38774a((VEInfoStickerBufferListener) new C41066b(abstractMap, videoPublishEditModel, context));
                StringBuilder sb = new StringBuilder("setInfoStickerBufferCallback ret=");
                sb.append(a);
                C41530am.m132280a(sb.toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$c */
    public final class C41067c implements Runnable {
        public final void run() {
            int i;
            if (SubtitleModule.this.mo101494d().isShown() && SubtitleModule.this.mo101494d().getAdapter() != null) {
                int k = SubtitleModule.m131146c(SubtitleModule.this).mo5446k();
                if (k != -1) {
                    if (k == 0 || k == 1) {
                        View c = SubtitleModule.m131146c(SubtitleModule.this).mo5432c(k);
                        if (c != null) {
                            i = c.getBottom();
                        } else {
                            i = 0;
                        }
                        if (i < ((int) C9738o.m28708b((Context) SubtitleModule.m131148d(SubtitleModule.this), 52.0f))) {
                            k = Math.min(k + 2, SubtitleModule.m131146c(SubtitleModule.this).mo5744A() - 1);
                        }
                    } else {
                        k = Math.min(k + 2, SubtitleModule.m131146c(SubtitleModule.this).mo5744A() - 1);
                    }
                    if (!TextUtils.isEmpty(((UtteranceWithWords) SubtitleModule.m131149e(SubtitleModule.this).f106829c.get(k)).getText())) {
                        SubtitleModule.m131149e(SubtitleModule.this).mo101497a(k);
                    }
                }
            }
            SubtitleModule.m131144b(SubtitleModule.this).post(this);
        }

        public C41067c() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$d */
    public final class C41068d implements Runnable {
        public final void run() {
            if (SubtitleModule.this.mo101494d().getAdapter() != null) {
                SubtitleModule.this.mo101466P();
            }
            SubtitleModule.m131144b(SubtitleModule.this).post(this);
        }

        public C41068d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$e */
    public final class C41069e implements Runnable {

        /* renamed from: b */
        private int f106894b;

        /* renamed from: c */
        private final int[] f106895c = {R.string.ne, R.string.nf, R.string.ng};

        public final void run() {
            TextView G = SubtitleModule.this.mo30920G();
            int[] iArr = this.f106895c;
            int i = this.f106894b;
            this.f106894b = i + 1;
            G.setText(iArr[i]);
            this.f106894b %= 3;
            SubtitleModule.m131119a(SubtitleModule.this).postDelayed(this, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }

        public C41069e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$f */
    static final class C41070f extends Lambda implements C7561a<SubtitleApi> {

        /* renamed from: a */
        public static final C41070f f106896a = new C41070f();

        C41070f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m131238a();
        }

        /* renamed from: a */
        private static SubtitleApi m131238a() {
            return (SubtitleApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://speech.bytedance.com").create(SubtitleApi.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$g */
    public static final class C41071g implements C45329l {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106897a;

        /* renamed from: b */
        final /* synthetic */ int f106898b;

        C41071g(SubtitleModule subtitleModule, int i) {
            this.f106897a = subtitleModule;
            this.f106898b = i;
        }

        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4116) {
                C6921a.m21555a("receive prepare done event in backToPlayLayout");
                C15389d dVar = this.f106897a.f106819x;
                if (dVar != null) {
                    dVar.mo38763a(this.f106898b, SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                }
                C15389d dVar2 = this.f106897a.f106819x;
                if (dVar2 != null) {
                    dVar2.mo38881x();
                }
                C15389d dVar3 = this.f106897a.f106819x;
                if (dVar3 != null) {
                    dVar3.mo38831c((C45329l) this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$h */
    static final class C41072h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106899a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f106900b;

        /* renamed from: c */
        final /* synthetic */ C41113g f106901c;

        /* renamed from: d */
        final /* synthetic */ long f106902d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$h$a */
        static final class C41073a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41072h f106903a;

            C41073a(C41072h hVar) {
                this.f106903a = hVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f106903a.f106899a.mo101483a(this.f106903a.f106901c, (int) this.f106903a.f106902d);
            }
        }

        C41072h(SubtitleModule subtitleModule, ArrayList arrayList, C41113g gVar, long j) {
            this.f106899a = subtitleModule;
            this.f106900b = arrayList;
            this.f106901c = gVar;
            this.f106902d = j;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106899a.mo101485a(this.f106900b);
            if (this.f106899a.f106783N) {
                new C10741a(SubtitleModule.m131148d(this.f106899a)).mo25657b((int) R.string.mt).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new C41073a(this)).mo25656a().mo25637a().show();
            } else {
                this.f106899a.mo101483a(this.f106901c, (int) this.f106902d);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$i */
    static final class C41074i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106904a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f106905b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f106906c;

        /* renamed from: d */
        final /* synthetic */ C41113g f106907d;

        C41074i(SubtitleModule subtitleModule, ArrayList arrayList, ArrayList arrayList2, C41113g gVar) {
            this.f106904a = subtitleModule;
            this.f106905b = arrayList;
            this.f106906c = arrayList2;
            this.f106907d = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106904a.mo101485a(this.f106905b);
            int b = SubtitleModule.m131156k(this.f106904a).mo101441b();
            if (this.f106904a.f106783N) {
                List a = SubtitleModule.m131156k(this.f106904a).mo101438a();
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    int indexOf = this.f106906c.indexOf(a.get(i));
                    if (indexOf > 0) {
                        ((UtteranceWithWords) this.f106906c.get(indexOf - 1)).setEndTime(((UtteranceWithWords) a.get(i)).getEndTime());
                    }
                    this.f106906c.remove(a.get(i));
                }
                int size2 = this.f106906c.size() - 1;
                Iterator it = this.f106906c.iterator();
                while (it.hasNext()) {
                    UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
                    if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f106904a.f106820y) && utteranceWithWords.getStartTime() <= b && b <= utteranceWithWords.getEndTime()) {
                        size2 = this.f106906c.indexOf(utteranceWithWords);
                    }
                }
                SubtitleModule.m131149e(this.f106904a).mo101497a(size2);
                SubtitleModule.m131149e(this.f106904a).mo101498a((List<? extends UtteranceWithWords>) this.f106906c);
                this.f106904a.mo101475Z();
            }
            this.f106904a.mo101483a(this.f106907d, b);
            C6907h.m21524a("save_edit_subtitle", (Map) this.f106904a.mo101474Y().f100112a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$j */
    public static final class C41075j implements C42080a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106908a;

        /* renamed from: c */
        public final void mo96461c(int i) {
        }

        C41075j(SubtitleModule subtitleModule) {
            this.f106908a = subtitleModule;
        }

        /* renamed from: b */
        public final void mo96460b(int i) {
            if (this.f106908a.f106782M != null) {
                RecyclerView l = SubtitleModule.m131157l(this.f106908a);
                SpaceItemDecoration spaceItemDecoration = this.f106908a.f106782M;
                if (spaceItemDecoration == null) {
                    C7573i.m23580a();
                }
                l.mo5542b((C1272h) spaceItemDecoration);
                this.f106908a.f106782M = null;
            }
            this.f106908a.f106784O = false;
        }

        /* renamed from: a */
        public final void mo96459a(int i) {
            if (this.f106908a.f106782M == null) {
                this.f106908a.f106782M = new SpaceItemDecoration(0, i);
                RecyclerView l = SubtitleModule.m131157l(this.f106908a);
                SpaceItemDecoration spaceItemDecoration = this.f106908a.f106782M;
                if (spaceItemDecoration == null) {
                    C7573i.m23580a();
                }
                l.mo5525a((C1272h) spaceItemDecoration);
                C1273i layoutManager = SubtitleModule.m131157l(this.f106908a).getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo5417a(SubtitleModule.m131156k(this.f106908a).f106748j, (int) C9738o.m28708b((Context) SubtitleModule.m131148d(this.f106908a), 100.0f));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                }
            }
            this.f106908a.f106784O = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$k */
    public static final class C41076k extends C40582c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106909a;

        /* renamed from: b */
        public final void mo74847b() {
            this.f106909a.mo101489aa();
        }

        C41076k(SubtitleModule subtitleModule) {
            this.f106909a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$l */
    public static final class C41077l implements C42080a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106910a;

        /* renamed from: b */
        final /* synthetic */ C41113g f106911b;

        /* renamed from: c */
        final /* synthetic */ int f106912c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$l$a */
        public static final class C41078a extends C40582c {

            /* renamed from: a */
            final /* synthetic */ C41077l f106913a;

            /* renamed from: c */
            public final void mo74769c() {
            }

            /* renamed from: d */
            public final void mo74768d() {
                this.f106913a.f106910a.mo101495d(this.f106913a.f106912c);
                if (this.f106913a.f106910a.f106782M != null) {
                    RecyclerView l = SubtitleModule.m131157l(this.f106913a.f106910a);
                    SpaceItemDecoration spaceItemDecoration = this.f106913a.f106910a.f106782M;
                    if (spaceItemDecoration == null) {
                        C7573i.m23580a();
                    }
                    l.mo5542b((C1272h) spaceItemDecoration);
                    this.f106913a.f106910a.f106782M = null;
                }
            }

            C41078a(C41077l lVar) {
                this.f106913a = lVar;
            }
        }

        /* renamed from: a */
        public final void mo96459a(int i) {
        }

        /* renamed from: c */
        public final void mo96461c(int i) {
        }

        /* renamed from: b */
        public final void mo96460b(int i) {
            this.f106911b.mo74849b(new C41078a(this));
            this.f106910a.f106784O = false;
        }

        C41077l(SubtitleModule subtitleModule, C41113g gVar, int i) {
            this.f106910a = subtitleModule;
            this.f106911b = gVar;
            this.f106912c = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$m */
    public static final class C41079m extends C40582c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106914a;

        /* renamed from: b */
        final /* synthetic */ int f106915b;

        /* renamed from: c */
        public final void mo74769c() {
        }

        /* renamed from: d */
        public final void mo74768d() {
            this.f106914a.mo101495d(this.f106915b);
            if (this.f106914a.f106782M != null) {
                RecyclerView l = SubtitleModule.m131157l(this.f106914a);
                SpaceItemDecoration spaceItemDecoration = this.f106914a.f106782M;
                if (spaceItemDecoration == null) {
                    C7573i.m23580a();
                }
                l.mo5542b((C1272h) spaceItemDecoration);
                this.f106914a.f106782M = null;
            }
        }

        C41079m(SubtitleModule subtitleModule, int i) {
            this.f106914a = subtitleModule;
            this.f106915b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$n */
    public static final class C41080n extends C40582c {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106916a;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$n$a */
        static final class C41081a implements AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C41080n f106917a;

            C41081a(C41080n nVar) {
                this.f106917a = nVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout c = this.f106917a.f106916a.mo101493c();
                float b = C9738o.m28708b((Context) SubtitleModule.m131148d(this.f106917a.f106916a), 40.0f);
                float b2 = 0.0f - C9738o.m28708b((Context) SubtitleModule.m131148d(this.f106917a.f106916a), 40.0f);
                C7573i.m23582a((Object) valueAnimator, "animation");
                c.setTranslationY(b + (b2 * valueAnimator.getAnimatedFraction()));
                this.f106917a.f106916a.mo101493c().setAlpha(valueAnimator.getAnimatedFraction());
            }
        }

        /* renamed from: d */
        public final void mo74768d() {
            this.f106916a.mo101476a().setVisibility(0);
            this.f106916a.mo101490b().setVisibility(0);
        }

        /* renamed from: c */
        public final void mo74769c() {
            this.f106916a.mo101493c().setVisibility(0);
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
            C7573i.m23582a((Object) duration, "animator");
            duration.setInterpolator(new C10744c());
            duration.addUpdateListener(new C41081a(this));
            duration.start();
        }

        C41080n(SubtitleModule subtitleModule) {
            this.f106916a = subtitleModule;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$o */
    public static final class C41082o implements C27358a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106918a;

        /* renamed from: b */
        private boolean f106919b;

        /* renamed from: c */
        public final boolean mo70457c() {
            return this.f106919b;
        }

        /* renamed from: a */
        public final long mo70453a() {
            long j;
            C15389d dVar = this.f106918a.f106819x;
            if (dVar != null) {
                j = (long) dVar.mo38862m();
            } else {
                j = 0;
            }
            return mo70454a(j);
        }

        /* renamed from: b */
        public final boolean mo70456b() {
            Integer num;
            long a = mo70453a();
            if (!this.f106919b) {
                C15389d dVar = this.f106918a.f106819x;
                if (dVar != null) {
                    num = Integer.valueOf(dVar.mo38860l());
                } else {
                    num = null;
                }
            } else {
                num = Integer.valueOf(0);
            }
            if (num == null || a != ((long) num.intValue())) {
                return false;
            }
            return true;
        }

        C41082o(SubtitleModule subtitleModule) {
            this.f106918a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo70455a(boolean z) {
            this.f106919b = z;
            C15389d dVar = this.f106918a.f106819x;
            if (dVar != null) {
                dVar.mo38839e(z);
            }
        }

        /* renamed from: a */
        public final long mo70454a(long j) {
            if (this.f106919b) {
                C15389d dVar = this.f106918a.f106819x;
                if (dVar != null) {
                    return ((long) dVar.mo38860l()) - j;
                }
                j = 0;
            }
            return j;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$p */
    static final class C41083p<T> implements C0053p<C47516v> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106920a;

        C41083p(SubtitleModule subtitleModule) {
            this.f106920a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47516v vVar) {
            if (vVar != null) {
                if (vVar.f121979a == 0) {
                    this.f106920a.f106810o = true;
                    if (this.f106920a.mo101494d().getAdapter() != null) {
                        this.f106920a.f106775F = new C41068d();
                        SubtitleModule.m131144b(this.f106920a).post(this.f106920a.f106775F);
                    }
                } else {
                    this.f106920a.f106810o = false;
                    this.f106920a.mo101464N();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$q */
    static final class C41084q<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106921a;

        C41084q(SubtitleModule subtitleModule) {
            this.f106921a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                this.f106921a.mo101492b(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$r */
    public static final class C41085r extends C42939as {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106922a;

        C41085r(SubtitleModule subtitleModule) {
            this.f106922a = subtitleModule;
        }

        /* renamed from: a */
        public final void mo70606a(View view) {
            C7573i.m23587b(view, "v");
            this.f106922a.mo101479a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$s */
    static final class C41086s implements C23254a {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106923a;

        C41086s(SubtitleModule subtitleModule) {
            this.f106923a = subtitleModule;
        }

        /* renamed from: a */
        public final boolean mo60522a(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            if (SubtitleModule.m131158m(this.f106923a).isShown()) {
                View view = this.f106923a.f106780K;
                if (view != null) {
                    view.performClick();
                }
            } else if (SubtitleModule.m131159n(this.f106923a).isShown()) {
                this.f106923a.mo30921H();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$t */
    public static final class C41087t<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Integer.valueOf(((UtteranceWithWords) t).getStartTime()), Integer.valueOf(((UtteranceWithWords) t2).getStartTime()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$u */
    static final class C41088u implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106924a;

        C41088u(SubtitleModule subtitleModule) {
            this.f106924a = subtitleModule;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f106924a.mo96987K();
            this.f106924a.f106777H.clear();
            this.f106924a.f106813r.mo98671e(true);
            C42039d a = C42039d.m133620a();
            C7573i.m23582a((Object) a, "TextFontStyleManager.getInstance()");
            SubtitleModule.m131153h(this.f106924a).mo101452a("", 1, -1, 2, a.mo103232c(), true);
            SubtitleModule.m131154i(this.f106924a).infoStickerModel.mAlign = SubtitleModule.m131155j(this.f106924a).getAlign();
            SubtitleModule.m131154i(this.f106924a).infoStickerModel.mBgMode = SubtitleModule.m131155j(this.f106924a).getBgColorMode();
            SubtitleModule.m131154i(this.f106924a).infoStickerModel.mColor = SubtitleModule.m131155j(this.f106924a).getBgColor();
            SubtitleModule.m131154i(this.f106924a).infoStickerModel.mFontType = C42039d.m133620a().mo103221a(SubtitleModule.m131155j(this.f106924a).getTypeface());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$v */
    static final class C41089v extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106925a;

        C41089v(SubtitleModule subtitleModule) {
            this.f106925a = subtitleModule;
            super(0);
        }

        /* renamed from: a */
        private void m131261a() {
            this.f106925a.mo101472W();
        }

        public final /* synthetic */ Object invoke() {
            m131261a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$w */
    static final class C41090w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106926a;

        /* renamed from: b */
        final /* synthetic */ C1592h f106927b;

        C41090w(SubtitleModule subtitleModule, C1592h hVar) {
            this.f106926a = subtitleModule;
            this.f106927b = hVar;
        }

        public final void run() {
            if (this.f106927b == null || !this.f106927b.mo6882b() || this.f106926a.f106777H.isEmpty()) {
                this.f106926a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41090w f106928a;

                    {
                        this.f106928a = r1;
                    }

                    /* renamed from: a */
                    private void m131262a() {
                        this.f106928a.f106926a.mo101472W();
                    }

                    public final /* synthetic */ Object invoke() {
                        m131262a();
                        return C7581n.f20898a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$x */
    static final class C41092x<TTaskResult, TContinuationResult> implements C1591g<C41111e, C1592h<C41109c>> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106929a;

        C41092x(SubtitleModule subtitleModule) {
            this.f106929a = subtitleModule;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C1592h<C41109c> then(C1592h<C41111e> hVar) {
            this.f106929a.f106813r.mo98671e(true);
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6882b() || ((C41111e) hVar.mo6890e()).f106970a != 0) {
                Exception f = hVar.mo6891f();
                C7573i.m23582a((Object) f, "task.error");
                throw f;
            }
            SubtitleModule.f106767R = ((C41111e) hVar.mo6890e()).f106972c;
            return this.f106929a.mo101477a(((C41111e) hVar.mo6890e()).f106972c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$y */
    static final class C41093y<TTaskResult, TContinuationResult> implements C1591g<C41109c, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106930a;

        C41093y(SubtitleModule subtitleModule) {
            this.f106930a = subtitleModule;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m131264a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m131264a(C1592h<C41109c> hVar) {
            C7573i.m23582a((Object) hVar, "queryTask");
            if (hVar.mo6891f() != null) {
                this.f106930a.mo101473X();
                this.f106930a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41093y f106931a;

                    {
                        this.f106931a = r1;
                    }

                    /* renamed from: a */
                    private void m131265a() {
                        this.f106931a.f106930a.mo101472W();
                    }

                    public final /* synthetic */ Object invoke() {
                        m131265a();
                        return C7581n.f20898a;
                    }
                });
            } else if (!hVar.mo6882b()) {
                this.f106930a.mo101473X();
                this.f106930a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41093y f106933a;

                    {
                        this.f106933a = r1;
                    }

                    /* renamed from: a */
                    private void m131267a() {
                        this.f106933a.f106930a.mo101472W();
                    }

                    public final /* synthetic */ Object invoke() {
                        m131267a();
                        return C7581n.f20898a;
                    }
                });
            } else if (((C41109c) hVar.mo6890e()).f106964b == 0) {
                List<? extends UtteranceWithWords> list = ((C41109c) hVar.mo6890e()).f106966d;
                if (list.isEmpty()) {
                    this.f106930a.mo101473X();
                    this.f106930a.mo101471V();
                    return;
                }
                this.f106930a.mo101486a(list);
            } else {
                this.f106930a.mo101473X();
                this.f106930a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C41093y f106932a;

                    {
                        this.f106932a = r1;
                    }

                    /* renamed from: a */
                    private void m131266a() {
                        this.f106932a.f106930a.mo101472W();
                    }

                    public final /* synthetic */ Object invoke() {
                        m131266a();
                        return C7581n.f20898a;
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleModule$z */
    static final class C41097z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SubtitleModule f106934a;

        /* renamed from: b */
        final /* synthetic */ C1592h f106935b;

        /* renamed from: c */
        final /* synthetic */ SubtitleApiV2 f106936c;

        C41097z(SubtitleModule subtitleModule, C1592h hVar, SubtitleApiV2 subtitleApiV2) {
            this.f106934a = subtitleModule;
            this.f106935b = hVar;
            this.f106936c = subtitleApiV2;
        }

        public final void run() {
            if (this.f106935b == null || !this.f106935b.mo6882b() || this.f106934a.f106777H.isEmpty()) {
                if (TextUtils.isEmpty(SubtitleModule.f106767R)) {
                    this.f106934a.mo101487a((C7561a<C7581n>) new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C41097z f106937a;

                        {
                            this.f106937a = r1;
                        }

                        /* renamed from: a */
                        private void m131268a() {
                            this.f106937a.f106934a.mo101470U();
                        }

                        public final /* synthetic */ Object invoke() {
                            m131268a();
                            return C7581n.f20898a;
                        }
                    });
                } else {
                    SubtitleModule subtitleModule = this.f106934a;
                    SubtitleApiV2 subtitleApiV2 = this.f106936c;
                    C7573i.m23582a((Object) subtitleApiV2, "uploadApi");
                    subtitleModule.mo101491b(subtitleApiV2, SubtitleModule.f106767R);
                }
                this.f106934a.mo101484a("exceed", "");
            }
        }
    }

    /* renamed from: a */
    public static final void m131120a(C15389d dVar) {
        C41064b.m131234a(dVar);
    }

    /* renamed from: a */
    public static final void m131121a(C15389d dVar, Context context, VideoPublishEditModel videoPublishEditModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
        C41064b.m131235a(dVar, context, videoPublishEditModel, abstractMap);
    }

    /* renamed from: a */
    public static final boolean m131123a(InfoStickerModel infoStickerModel, AbstractMap<Integer, StickerItemModel> abstractMap) {
        return C41064b.m131236a(infoStickerModel, abstractMap);
    }

    /* renamed from: ab */
    public static final ConcurrentHashMap<Integer, StickerItemModel> m131124ab() {
        return f106765P;
    }

    /* renamed from: ac */
    public static final HashMap<Integer, StickerItemModel> m131125ac() {
        return f106766Q;
    }

    /* renamed from: at */
    private final SubtitleApi m131142at() {
        return (SubtitleApi) this.f106804am.getValue();
    }

    /* renamed from: a */
    public final void mo101488a(boolean z) {
        if (z) {
            this.f106785T = new C41069e();
            SafeHandler safeHandler = this.f106773D;
            if (safeHandler == null) {
                C7573i.m23583a("mTipsHandler");
            }
            safeHandler.post(this.f106785T);
            this.f106803al.start();
            LinearLayout linearLayout = this.mLoadingArea;
            if (linearLayout == null) {
                C7573i.m23583a("mLoadingArea");
            }
            linearLayout.setVisibility(0);
            LinearLayout linearLayout2 = this.mSubtitleLayout;
            if (linearLayout2 == null) {
                C7573i.m23583a("mSubtitleLayout");
            }
            linearLayout2.setVisibility(8);
            DmtStatusView dmtStatusView = this.mLoadingStatusView;
            if (dmtStatusView == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView.mo25942f();
            LinearLayout linearLayout3 = this.mLoadingArea;
            if (linearLayout3 == null) {
                C7573i.m23583a("mLoadingArea");
            }
            ((Button) linearLayout3.findViewById(R.id.ss)).setOnClickListener(new C41044ah(this));
        } else {
            this.f106803al.cancel();
            this.f106785T = null;
            SafeHandler safeHandler2 = this.f106773D;
            if (safeHandler2 == null) {
                C7573i.m23583a("mTipsHandler");
            }
            safeHandler2.removeCallbacksAndMessages(null);
            DmtStatusView dmtStatusView2 = this.mLoadingStatusView;
            if (dmtStatusView2 == null) {
                C7573i.m23583a("mLoadingStatusView");
            }
            dmtStatusView2.mo25939d();
            LinearLayout linearLayout4 = this.mLoadingArea;
            if (linearLayout4 == null) {
                C7573i.m23583a("mLoadingArea");
            }
            linearLayout4.setVisibility(8);
            LinearLayout linearLayout5 = this.mSubtitleLayout;
            if (linearLayout5 == null) {
                C7573i.m23583a("mSubtitleLayout");
            }
            linearLayout5.setVisibility(0);
            LinearLayout linearLayout6 = this.mSubtitleLayout;
            if (linearLayout6 == null) {
                C7573i.m23583a("mSubtitleLayout");
            }
            linearLayout6.setAlpha(1.0f);
        }
        View view = this.f106789X;
        if (view == null) {
            C7573i.m23583a("mEditTypeView");
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo101482a(C41113g gVar) {
        SubtitleStyleViewModel subtitleStyleViewModel = this.f106796ae;
        if (subtitleStyleViewModel == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o b = subtitleStyleViewModel.mo101541b();
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        b.removeObservers(fragmentActivity);
        SubtitleStyleViewModel subtitleStyleViewModel2 = this.f106796ae;
        if (subtitleStyleViewModel2 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o d = subtitleStyleViewModel2.mo101543d();
        FragmentActivity fragmentActivity2 = this.f106818w;
        if (fragmentActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        d.removeObservers(fragmentActivity2);
        SubtitleStyleViewModel subtitleStyleViewModel3 = this.f106796ae;
        if (subtitleStyleViewModel3 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o c = subtitleStyleViewModel3.mo101542c();
        FragmentActivity fragmentActivity3 = this.f106818w;
        if (fragmentActivity3 == null) {
            C7573i.m23583a("mActivity");
        }
        c.removeObservers(fragmentActivity3);
        SubtitleStyleViewModel subtitleStyleViewModel4 = this.f106796ae;
        if (subtitleStyleViewModel4 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o a = subtitleStyleViewModel4.mo101539a();
        FragmentActivity fragmentActivity4 = this.f106818w;
        if (fragmentActivity4 == null) {
            C7573i.m23583a("mActivity");
        }
        a.removeObservers(fragmentActivity4);
        SubtitleTextView subtitleTextView = this.f106812q;
        if (subtitleTextView == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        subtitleTextView.setViewModel(null);
        gVar.mo74849b(new C41080n(this));
    }

    /* renamed from: a */
    public final void mo101481a(SubtitleApiV2 subtitleApiV2, String str) {
        C1592h.m7853a((Callable<TResult>) new C41037ac<TResult>(subtitleApiV2, str)).mo6877a((C1591g<TResult, TContinuationResult>) new C41038ad<TResult,TContinuationResult>(this, subtitleApiV2, str), C1592h.f5958b, this.f106811p.mo6870b());
    }

    /* renamed from: a */
    public final void mo101484a(String str, String str2) {
        C6907h.m21524a("auto_subtitle_end", (Map) mo101474Y().mo96483a("video_duration", this.f106820y).mo96484a("load_time", System.currentTimeMillis() - this.f106806k).mo96485a("load_status", str).mo96485a("action_type", this.f106805j).mo96485a("error_type", str2).f100112a);
    }

    /* renamed from: a */
    public final void mo101487a(C7561a<C7581n> aVar) {
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C7573i.m23583a("mContentLayout");
        }
        ViewGroup viewGroup = frameLayout;
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C7573i.m23583a("mLoadingArea");
        }
        View view = linearLayout;
        View view2 = this.f106790Y;
        if (view2 == null) {
            C7573i.m23583a("mRetryView");
        }
        C41113g gVar = new C41113g(viewGroup, view, view2);
        View view3 = this.f106790Y;
        if (view3 == null) {
            C7573i.m23583a("mRetryView");
        }
        ((TextView) view3.findViewById(R.id.dd9)).setOnClickListener(new C41048aj(this, gVar));
        View view4 = this.f106790Y;
        if (view4 == null) {
            C7573i.m23583a("mRetryView");
        }
        ((Button) view4.findViewById(R.id.ra)).setOnClickListener(new C41049ak(this, gVar, aVar));
        gVar.mo74845a((C34856c) new C40582c());
    }

    /* renamed from: a */
    public final void mo101486a(List<? extends UtteranceWithWords> list) {
        long j;
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
        }
        List list2 = arrayList;
        if (list2.size() > 1) {
            C7525m.m23474a(list2, new C41087t());
        }
        m131147c(list2);
        mo101463M();
        C0052o<C47516v> oVar = this.f106771B;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        C27358a aVar = this.f106770A;
        if (aVar == null) {
            C7573i.m23583a("mCurrentPositionSource");
        }
        if (aVar.mo70457c()) {
            C15389d dVar = this.f106819x;
            j = (long) (dVar != null ? dVar.mo38860l() : 0);
        } else {
            j = 0;
        }
        oVar.setValue(C47516v.m148298b(j));
        mo101488a(false);
        m131145b(list2);
        mo101462L();
    }

    /* renamed from: a */
    public final void mo101485a(ArrayList<String> arrayList) {
        this.f106783N = false;
        SubtitleEditAdapter subtitleEditAdapter = this.f106816u;
        if (subtitleEditAdapter == null) {
            C7573i.m23583a("mSubtitleEditAdapter");
        }
        List c = subtitleEditAdapter.mo101442c();
        if (c.size() == arrayList.size()) {
            SubtitleEditAdapter subtitleEditAdapter2 = this.f106816u;
            if (subtitleEditAdapter2 == null) {
                C7573i.m23583a("mSubtitleEditAdapter");
            }
            if (!(!subtitleEditAdapter2.mo101438a().isEmpty())) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!((String) arrayList.get(i)).equals(((UtteranceWithWords) c.get(i)).getText())) {
                        this.f106783N = true;
                        return;
                    }
                }
                return;
            }
        }
        this.f106783N = true;
    }

    /* renamed from: a */
    public final void mo101483a(C41113g gVar, int i) {
        if (this.f106784O) {
            C42078c cVar = this.f106788W;
            if (cVar == null) {
                C7573i.m23583a("keyBoardListener");
            }
            cVar.mo103394a(new C41077l(this, gVar, i));
            m131141as();
            return;
        }
        gVar.mo74849b(new C41079m(this, i));
    }

    /* renamed from: a */
    public final void mo101480a(EditText editText) {
        C7573i.m23587b(editText, "editText");
        InputMethodManager inputMethodManager = this.f106795ad;
        if (inputMethodManager == null) {
            C7573i.m23583a("mIMManager");
        }
        inputMethodManager.showSoftInput(editText, 1);
    }

    /* renamed from: af */
    private final void m131128af() {
        m131129ag();
        m131130ah();
        m131131ai();
    }

    /* renamed from: ag */
    private final void m131129ag() {
        this.f106770A = new C41082o(this);
    }

    /* renamed from: G */
    public final TextView mo30920G() {
        TextView textView = this.mLoadingHint;
        if (textView == null) {
            C7573i.m23583a("mLoadingHint");
        }
        return textView;
    }

    /* renamed from: H */
    public final void mo30921H() {
        TextView textView = this.mCancelView;
        if (textView == null) {
            C7573i.m23583a("mCancelView");
        }
        textView.performClick();
    }

    /* renamed from: N */
    public final void mo101464N() {
        this.f106775F = null;
        SafeHandler safeHandler = this.f106772C;
        if (safeHandler == null) {
            C7573i.m23583a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
    }

    /* renamed from: O */
    public final void mo101465O() {
        this.f106808m = null;
        SafeHandler safeHandler = this.f106772C;
        if (safeHandler == null) {
            C7573i.m23583a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
    }

    /* renamed from: aa */
    public final void mo101489aa() {
        InputMethodManager inputMethodManager = this.f106795ad;
        if (inputMethodManager == null) {
            C7573i.m23583a("mIMManager");
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    /* renamed from: ai */
    private final void m131131ai() {
        EditSubtitleViewModel editSubtitleViewModel = this.f106793ab;
        if (editSubtitleViewModel == null) {
            C7573i.m23583a("mSubtitleViewModel");
        }
        editSubtitleViewModel.mo106365a().observe(this, new C41084q(this));
    }

    /* renamed from: aj */
    private final int m131132aj() {
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        return (int) C9738o.m28708b((Context) fragmentActivity, 52.0f);
    }

    /* renamed from: ak */
    private final int m131133ak() {
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        return (int) C9738o.m28708b((Context) fragmentActivity, 250.0f);
    }

    /* renamed from: L */
    public final void mo101462L() {
        C0052o<C47516v> oVar = this.f106771B;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        oVar.setValue(C47516v.m148295a());
        View view = this.f106813r.f102858e;
        C7573i.m23582a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(8);
    }

    /* renamed from: M */
    public final void mo101463M() {
        C0052o<C47516v> oVar = this.f106771B;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        oVar.setValue(C47516v.m148297b());
        View view = this.f106813r.f102858e;
        C7573i.m23582a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(0);
    }

    /* renamed from: T */
    public final void mo101469T() {
        C18246h.m60214a(new TTUploaderService(0).mo96258a(null), (C18245g<? super V>) new C41040ae<Object>(this), C1592h.f5958b);
    }

    /* renamed from: c */
    public final LinearLayout mo101493c() {
        LinearLayout linearLayout = this.mSubtitleLayout;
        if (linearLayout == null) {
            C7573i.m23583a("mSubtitleLayout");
        }
        return linearLayout;
    }

    /* renamed from: d */
    public final AVDmtPanelRecyleView mo101494d() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        return aVDmtPanelRecyleView;
    }

    /* renamed from: e */
    public final TextView mo101496e() {
        TextView textView = this.mLoadingProgress;
        if (textView == null) {
            C7573i.m23583a("mLoadingProgress");
        }
        return textView;
    }

    /* renamed from: S */
    public static void m131118S() {
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("output.aac");
        C7276d.m22816c(new File(sb.toString()).getPath());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C39811er.f103468d);
        sb2.append("origin.aac");
        C7276d.m22816c(new File(sb2.toString()).getPath());
    }

    /* renamed from: ah */
    private final void m131130ah() {
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f106794ac;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        C0052o<C47516v> k = vEVideoPublishEditViewModel.mo119519k();
        C7573i.m23582a((Object) k, "mVEVideoPublishEditViewM…el.previewControlLiveData");
        this.f106771B = k;
        C0052o<C47516v> oVar = this.f106771B;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        oVar.observe(this, new C41083p(this));
    }

    /* renamed from: am */
    private final void m131135am() {
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        new C10741a(fragmentActivity).mo25657b((int) R.string.mr).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new C41088u(this)).mo25656a().mo25637a().show();
    }

    /* renamed from: ar */
    private final void m131140ar() {
        if (this.f106797af == null) {
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            NetStateReceiver.m128491a((Context) fragmentActivity);
            this.f106797af = new C41062av(this);
            NetStateReceiver.m128492a(this.f106797af);
        }
    }

    /* renamed from: as */
    private final void m131141as() {
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        View currentFocus = fragmentActivity.getCurrentFocus();
        if (currentFocus != null) {
            InputMethodManager inputMethodManager = this.f106795ad;
            if (inputMethodManager == null) {
                C7573i.m23583a("mIMManager");
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* renamed from: K */
    public final void mo96987K() {
        this.f106813r.f102857d.mo98412b();
        mo101464N();
        this.f106803al.cancel();
        this.f106785T = null;
        SafeHandler safeHandler = this.f106773D;
        if (safeHandler == null) {
            C7573i.m23583a("mTipsHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        EditViewModel editViewModel = this.f106792aa;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        editViewModel.mo106455p().setValue(Boolean.valueOf(false));
        this.f106811p.mo6871c();
    }

    /* renamed from: Q */
    public final boolean mo101467Q() {
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel2.infoStickerModel.hasSubtitle()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: X */
    public final void mo101473X() {
        SafeHandler safeHandler = this.f106772C;
        if (safeHandler == null) {
            C7573i.m23583a("mSafeHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        this.f106803al.cancel();
        this.f106785T = null;
        SafeHandler safeHandler2 = this.f106773D;
        if (safeHandler2 == null) {
            C7573i.m23583a("mTipsHandler");
        }
        safeHandler2.removeCallbacksAndMessages(null);
        DmtStatusView dmtStatusView = this.mLoadingStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mLoadingStatusView");
        }
        dmtStatusView.mo25939d();
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C7573i.m23583a("mLoadingArea");
        }
        linearLayout.setVisibility(8);
    }

    /* renamed from: b */
    public final TextView mo101490b() {
        TextView textView = this.mSaveView;
        if (textView == null) {
            C7573i.m23583a("mSaveView");
        }
        return textView;
    }

    /* renamed from: ao */
    private final void m131137ao() {
        this.f106813r.f102857d.mo98421e();
        this.f106813r.f102877x.clear();
        mo101464N();
        this.f106803al.cancel();
        this.f106785T = null;
        SafeHandler safeHandler = this.f106773D;
        if (safeHandler == null) {
            C7573i.m23583a("mTipsHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        EditViewModel editViewModel = this.f106792aa;
        if (editViewModel == null) {
            C7573i.m23583a("mEditViewModel");
        }
        editViewModel.mo106455p().setValue(Boolean.valueOf(true));
        C6907h.m21524a("save_subtitle", (Map) mo101474Y().f100112a);
    }

    /* renamed from: ap */
    private final int m131138ap() {
        long j = this.f106800ai;
        C27358a aVar = this.f106770A;
        if (aVar == null) {
            C7573i.m23583a("mCurrentPositionSource");
        }
        if (j == aVar.mo70453a()) {
            return -1;
        }
        C27358a aVar2 = this.f106770A;
        if (aVar2 == null) {
            C7573i.m23583a("mCurrentPositionSource");
        }
        this.f106800ai = aVar2.mo70453a();
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        if (aVDmtPanelRecyleView.getAdapter() == null) {
            return -1;
        }
        SubtitleAdapter subtitleAdapter = this.f106815t;
        if (subtitleAdapter == null) {
            C7573i.m23583a("mSubtitleAdapter");
        }
        ArrayList<UtteranceWithWords> arrayList = subtitleAdapter.f106829c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
            if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f106820y) && ((long) utteranceWithWords.getStartTime()) <= this.f106800ai && this.f106800ai <= ((long) utteranceWithWords.getEndTime())) {
                return arrayList.indexOf(utteranceWithWords);
            }
        }
        return arrayList.size() - 1;
    }

    /* renamed from: aq */
    private final int m131139aq() {
        if (C39805en.m127445a()) {
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            int e = (C39805en.m127452e(fragmentActivity) - m131132aj()) - m131133ak();
            FragmentActivity fragmentActivity2 = this.f106818w;
            if (fragmentActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            int c = e - C39805en.m127450c(fragmentActivity2);
            FragmentActivity fragmentActivity3 = this.f106818w;
            if (fragmentActivity3 == null) {
                C7573i.m23583a("mActivity");
            }
            return c - C39805en.m127451d(fragmentActivity3);
        }
        FragmentActivity fragmentActivity4 = this.f106818w;
        if (fragmentActivity4 == null) {
            C7573i.m23583a("mActivity");
        }
        Window window = fragmentActivity4.getWindow();
        C7573i.m23582a((Object) window, "mActivity.window");
        View findViewById = window.getDecorView().findViewById(R.id.cuv);
        C7573i.m23582a((Object) findViewById, "mActivity.window.decorVi…wById<View>(R.id.rl_root)");
        return (findViewById.getHeight() - m131132aj()) - m131133ak();
    }

    /* renamed from: J */
    public final void mo101461J() {
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.infoStickerModel != null) {
            int i = 0;
            C27358a aVar = this.f106770A;
            if (aVar == null) {
                C7573i.m23583a("mCurrentPositionSource");
            }
            long a = aVar.mo70453a();
            StickerItemModel stickerItemModel = null;
            VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            Iterator it = videoPublishEditModel2.infoStickerModel.stickers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StickerItemModel stickerItemModel2 = (StickerItemModel) it.next();
                C7573i.m23582a((Object) stickerItemModel2, "item");
                if (stickerItemModel2.isSubtitle() && ((long) stickerItemModel2.startTime) <= a && a <= ((long) stickerItemModel2.endTime)) {
                    i = stickerItemModel2.f83875id;
                    stickerItemModel = stickerItemModel2.dumpClonedData();
                    break;
                }
            }
            if (stickerItemModel != null) {
                this.f106813r.mo98672f(i);
                this.f106813r.mo98617a(stickerItemModel);
                C15389d dVar = this.f106819x;
                if (dVar != null) {
                    dVar.mo38881x();
                }
            }
        }
    }

    /* renamed from: P */
    public final void mo101466P() {
        int ap = m131138ap();
        if (ap >= 0) {
            SubtitleAdapter subtitleAdapter = this.f106815t;
            if (subtitleAdapter == null) {
                C7573i.m23583a("mSubtitleAdapter");
            }
            if (subtitleAdapter.f106827a != ap) {
                if (ap == 0) {
                    this.f106807l = 0.004f;
                } else {
                    this.f106807l = 400.0f;
                }
                SubtitleAdapter subtitleAdapter2 = this.f106815t;
                if (subtitleAdapter2 == null) {
                    C7573i.m23583a("mSubtitleAdapter");
                }
                if (!TextUtils.isEmpty(((UtteranceWithWords) subtitleAdapter2.f106829c.get(ap)).getText()) || ap == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.f106814s;
                    if (highLightLayoutManager == null) {
                        C7573i.m23583a("mHighLightLayoutManager");
                    }
                    AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
                    if (aVDmtPanelRecyleView == null) {
                        C7573i.m23583a("mRecyclerView");
                    }
                    highLightLayoutManager.mo5422a(aVDmtPanelRecyleView, new C1290s(), ap);
                    SubtitleAdapter subtitleAdapter3 = this.f106815t;
                    if (subtitleAdapter3 == null) {
                        C7573i.m23583a("mSubtitleAdapter");
                    }
                    subtitleAdapter3.mo101497a(ap);
                }
            }
        }
    }

    /* renamed from: V */
    public final void mo101471V() {
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C7573i.m23583a("mContentLayout");
        }
        ViewGroup viewGroup = frameLayout;
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C7573i.m23583a("mLoadingArea");
        }
        View view = linearLayout;
        View view2 = this.f106791Z;
        if (view2 == null) {
            C7573i.m23583a("mExitView");
        }
        C41113g gVar = new C41113g(viewGroup, view, view2);
        View view3 = this.f106791Z;
        if (view3 == null) {
            C7573i.m23583a("mExitView");
        }
        ((Button) view3.findViewById(R.id.sp)).setOnClickListener(new C41043ag(this, gVar));
        gVar.mo74845a((C34856c) new C40582c());
    }

    /* renamed from: W */
    public final void mo101472W() {
        f106767R = "";
        mo101463M();
        this.f106798ag = -1;
        this.f106777H.clear();
        f106765P.clear();
        if (this.f106778I == null) {
            mo101468R();
            mo101487a((C7561a<C7581n>) new C41089v<C7581n>(this));
            return;
        }
        this.f106811p = new C1590f();
        C1588d b = this.f106811p.mo6870b();
        String str = this.f106778I;
        if (str == null) {
            C7573i.m23580a();
        }
        C1592h a = m131143b(str).mo6881b(new C41092x(this), C1592h.f5957a, b).mo6877a((C1591g<TResult, TContinuationResult>) new C41093y<TResult,TContinuationResult>(this), C1592h.f5958b, b);
        SafeHandler safeHandler = this.f106772C;
        if (safeHandler == null) {
            C7573i.m23583a("mSafeHandler");
        }
        safeHandler.postDelayed(new C41090w(this, a), 60000);
    }

    /* renamed from: Y */
    public final C38511bc mo101474Y() {
        C38511bc a = C38511bc.m123103a().mo96485a("enter_from", "video_edit_page");
        String str = "shoot_way";
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        C38511bc a2 = a.mo96485a(str, videoPublishEditModel.mShootWay);
        String str2 = "creation_id";
        VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        C38511bc a3 = a2.mo96485a(str2, videoPublishEditModel2.creationId);
        String str3 = "content_source";
        VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        C38511bc a4 = a3.mo96485a(str3, C39500av.m126142b(videoPublishEditModel3));
        String str4 = "content_type";
        VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        C38511bc a5 = a4.mo96485a(str4, C39500av.m126133a(videoPublishEditModel4));
        C7573i.m23582a((Object) a5, "EventMapBuilder.newBuild…, getContentType(mModel))");
        return a5;
    }

    /* renamed from: Z */
    public final void mo101475Z() {
        boolean z;
        this.f106813r.mo98671e(false);
        ArrayList arrayList = new ArrayList();
        SubtitleAdapter subtitleAdapter = this.f106815t;
        if (subtitleAdapter == null) {
            C7573i.m23583a("mSubtitleAdapter");
        }
        ArrayList<UtteranceWithWords> arrayList2 = subtitleAdapter.f106829c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            if (((UtteranceWithWords) arrayList2.get(i)).getText().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Object obj = arrayList2.get(i);
                C7573i.m23582a(obj, "listData[i]");
                arrayList.add(new UtteranceWithWords((UtteranceWithWords) obj));
            }
        }
        this.f106813r.mo98640a((List<UtteranceWithWords>) arrayList);
        C15389d dVar = this.f106819x;
        if (dVar != null) {
            dVar.mo38881x();
        }
    }

    /* renamed from: p */
    public final void mo31007p() {
        super.mo31007p();
        mo101464N();
        this.f106803al.cancel();
        this.f106785T = null;
        SafeHandler safeHandler = this.f106773D;
        if (safeHandler == null) {
            C7573i.m23583a("mTipsHandler");
        }
        safeHandler.removeCallbacksAndMessages(null);
        if (this.f106797af != null) {
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            NetStateReceiver.m128493b((Context) fragmentActivity);
            this.f106797af = null;
        }
        this.f106813r.mo98634a((C41108b) null);
        View view = this.f106813r.f102858e;
        C7573i.m23582a((Object) view, "mInfoStickerHelper.mIvPlay");
        view.setVisibility(8);
        m131118S();
    }

    /* renamed from: ad */
    private final void m131126ad() {
        int i;
        Activity activity = this.f33526d_;
        if (activity != null) {
            this.f106818w = (FragmentActivity) activity;
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            if (fragmentActivity != null) {
                this.f106801aj = (C23258e) fragmentActivity;
                FragmentActivity fragmentActivity2 = this.f106818w;
                if (fragmentActivity2 == null) {
                    C7573i.m23583a("mActivity");
                }
                C0063u a = C0069x.m159a(fragmentActivity2).mo147a(VEVideoPublishEditViewModel.class);
                C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…ditViewModel::class.java)");
                this.f106794ac = (VEVideoPublishEditViewModel) a;
                FragmentActivity fragmentActivity3 = this.f106818w;
                if (fragmentActivity3 == null) {
                    C7573i.m23583a("mActivity");
                }
                C0063u a2 = C0069x.m159a(fragmentActivity3).mo147a(EditSubtitleViewModel.class);
                C7573i.m23582a((Object) a2, "ViewModelProviders.of(mA…tleViewModel::class.java)");
                this.f106793ab = (EditSubtitleViewModel) a2;
                FragmentActivity fragmentActivity4 = this.f106818w;
                if (fragmentActivity4 == null) {
                    C7573i.m23583a("mActivity");
                }
                JediViewModel a3 = C36113b.m116288a(fragmentActivity4).mo91871a(EditViewModel.class);
                C7573i.m23582a((Object) a3, "JediViewModelProviders.o…ditViewModel::class.java)");
                this.f106792aa = (EditViewModel) a3;
                FragmentActivity fragmentActivity5 = this.f106818w;
                if (fragmentActivity5 == null) {
                    C7573i.m23583a("mActivity");
                }
                C0063u a4 = C0069x.m159a(fragmentActivity5).mo147a(SubtitleStyleViewModel.class);
                C7573i.m23582a((Object) a4, "ViewModelProviders.of(mA…yleViewModel::class.java)");
                this.f106796ae = (SubtitleStyleViewModel) a4;
                EditViewModel editViewModel = this.f106792aa;
                if (editViewModel == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                this.f106817v = editViewModel.mo29069f();
                EditViewModel editViewModel2 = this.f106792aa;
                if (editViewModel2 == null) {
                    C7573i.m23583a("mEditViewModel");
                }
                this.f106819x = (C15389d) editViewModel2.mo106448i().getValue();
                C15389d dVar = this.f106819x;
                if (dVar != null) {
                    i = dVar.mo38860l();
                } else {
                    i = 0;
                }
                this.f106820y = i;
                C0043i iVar = this;
                this.f106772C = new SafeHandler(iVar);
                this.f106773D = new SafeHandler(iVar);
                FragmentActivity fragmentActivity6 = this.f106818w;
                if (fragmentActivity6 == null) {
                    C7573i.m23583a("mActivity");
                }
                Object systemService = fragmentActivity6.getSystemService("input_method");
                if (systemService != null) {
                    this.f106795ad = (InputMethodManager) systemService;
                    this.f106799ah = C35563c.f93231M.mo93305a(Property.EnableSubtitleRecognitionAI);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.activity.ListenableActivityRegistry");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: al */
    private final void m131134al() {
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        int i = videoPublishEditModel.infoStickerModel.mAlign;
        InfoStickerModel infoStickerModel = this.f106786U;
        if (infoStickerModel == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        if (i == infoStickerModel.mAlign) {
            VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            int i2 = videoPublishEditModel2.infoStickerModel.mBgMode;
            InfoStickerModel infoStickerModel2 = this.f106786U;
            if (infoStickerModel2 == null) {
                C7573i.m23583a("mInfoStickerModelTmp");
            }
            if (i2 == infoStickerModel2.mBgMode) {
                VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mModel");
                }
                int i3 = videoPublishEditModel3.infoStickerModel.mColor;
                InfoStickerModel infoStickerModel3 = this.f106786U;
                if (infoStickerModel3 == null) {
                    C7573i.m23583a("mInfoStickerModelTmp");
                }
                if (i3 == infoStickerModel3.mColor) {
                    VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
                    if (videoPublishEditModel4 == null) {
                        C7573i.m23583a("mModel");
                    }
                    String str = videoPublishEditModel4.infoStickerModel.mFontType;
                    InfoStickerModel infoStickerModel4 = this.f106786U;
                    if (infoStickerModel4 == null) {
                        C7573i.m23583a("mInfoStickerModelTmp");
                    }
                    if (!(!C7573i.m23585a((Object) str, (Object) infoStickerModel4.mFontType))) {
                        VideoPublishEditModel videoPublishEditModel5 = this.f106817v;
                        if (videoPublishEditModel5 == null) {
                            C7573i.m23583a("mModel");
                        }
                        int size = videoPublishEditModel5.infoStickerModel.stickers.size();
                        InfoStickerModel infoStickerModel5 = this.f106786U;
                        if (infoStickerModel5 == null) {
                            C7573i.m23583a("mInfoStickerModelTmp");
                        }
                        if (size == infoStickerModel5.stickers.size() && this.f106813r.f102877x.size() <= 1 && !this.f106783N) {
                            mo96987K();
                            return;
                        }
                    }
                }
            }
        }
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        new C10741a(fragmentActivity).mo25657b((int) R.string.ni).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.afn, (DialogInterface.OnClickListener) new C41042af(this)).mo25656a().mo25637a().show();
    }

    /* renamed from: I */
    public final void mo30922I() {
        ArrayList arrayList = new ArrayList();
        InfoStickerModel infoStickerModel = this.f106786U;
        if (infoStickerModel == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        if (infoStickerModel.stickers != null) {
            InfoStickerModel infoStickerModel2 = this.f106786U;
            if (infoStickerModel2 == null) {
                C7573i.m23583a("mInfoStickerModelTmp");
            }
            for (StickerItemModel stickerItemModel : infoStickerModel2.stickers) {
                C7573i.m23582a((Object) stickerItemModel, "item");
                if (stickerItemModel.isSubtitle()) {
                    arrayList.add(new UtteranceWithWords(stickerItemModel));
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.f106813r.mo98671e(true);
        } else {
            this.f106813r.mo98671e(false);
            this.f106813r.mo98640a((List<UtteranceWithWords>) arrayList);
        }
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel3 = videoPublishEditModel.infoStickerModel;
        InfoStickerModel infoStickerModel4 = this.f106786U;
        if (infoStickerModel4 == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        infoStickerModel3.mAlign = infoStickerModel4.mAlign;
        VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel5 = videoPublishEditModel2.infoStickerModel;
        InfoStickerModel infoStickerModel6 = this.f106786U;
        if (infoStickerModel6 == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        infoStickerModel5.mBgMode = infoStickerModel6.mBgMode;
        VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel7 = videoPublishEditModel3.infoStickerModel;
        InfoStickerModel infoStickerModel8 = this.f106786U;
        if (infoStickerModel8 == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        infoStickerModel7.mColor = infoStickerModel8.mColor;
        VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel9 = videoPublishEditModel4.infoStickerModel;
        InfoStickerModel infoStickerModel10 = this.f106786U;
        if (infoStickerModel10 == null) {
            C7573i.m23583a("mInfoStickerModelTmp");
        }
        infoStickerModel9.mFontType = infoStickerModel10.mFontType;
    }

    /* renamed from: U */
    public final void mo101470U() {
        f106767R = "";
        mo101463M();
        this.f106798ag = -1;
        this.f106777H.clear();
        f106765P.clear();
        this.f106811p = new C1590f();
        C1588d b = this.f106811p.mo6870b();
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        Object service = ServiceManager.get().getService(AVApi.class);
        C7573i.m23582a(service, "ServiceManager.get().getService(AVApi::class.java)");
        SubtitleApiV2 subtitleApiV2 = (SubtitleApiV2) iRetrofitService.createNewRetrofit(((AVApi) service).getAPI_URL_PREFIX_SI()).create(SubtitleApiV2.class);
        String e = C35574k.m114859a().mo70091f().mo93346e(AVSettings.Property.SdkV4AuthKey);
        if (!TextUtils.isEmpty(e)) {
            C1592h a = C1592h.m7853a((Callable<TResult>) new C41032aa<TResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C41033ab<TResult,TContinuationResult>(this, (C39961gh) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(e, C39961gh.class), subtitleApiV2, b));
            SafeHandler safeHandler = this.f106772C;
            if (safeHandler == null) {
                C7573i.m23583a("mSafeHandler");
            }
            safeHandler.postDelayed(new C41097z(this, a, subtitleApiV2), 60000);
        }
    }

    /* renamed from: a */
    public final TextView mo101476a() {
        TextView textView = this.mCancelView;
        if (textView == null) {
            C7573i.m23583a("mCancelView");
        }
        return textView;
    }

    /* renamed from: an */
    private final void m131136an() {
        SubtitleEditTypeLayout subtitleEditTypeLayout = this.f106809n;
        if (subtitleEditTypeLayout == null) {
            C7573i.m23583a("mTextStickerInputLayout");
        }
        String str = "";
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        int i = videoPublishEditModel.infoStickerModel.mBgMode;
        VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        int i2 = videoPublishEditModel2.infoStickerModel.mColor;
        VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        int i3 = videoPublishEditModel3.infoStickerModel.mAlign;
        VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        subtitleEditTypeLayout.mo101452a(str, i, i2, i3, videoPublishEditModel4.infoStickerModel.mFontType, false);
        C42039d a = C42039d.m133620a();
        SubtitleTextView subtitleTextView = this.f106812q;
        if (subtitleTextView == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        String a2 = a.mo103221a(subtitleTextView.getTypeface());
        SubtitleTextView subtitleTextView2 = this.f106812q;
        if (subtitleTextView2 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        int bgColorMode = subtitleTextView2.getBgColorMode();
        SubtitleTextView subtitleTextView3 = this.f106812q;
        if (subtitleTextView3 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        int bgColor = subtitleTextView3.getBgColor();
        SubtitleTextView subtitleTextView4 = this.f106812q;
        if (subtitleTextView4 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        int align = subtitleTextView4.getAlign();
        SubtitleStyleViewModel subtitleStyleViewModel = this.f106796ae;
        if (subtitleStyleViewModel == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C7573i.m23582a((Object) a2, "fontType");
        subtitleStyleViewModel.mo101540a(a2, bgColorMode, bgColor, align);
        SubtitleTextView subtitleTextView5 = this.f106812q;
        if (subtitleTextView5 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        SubtitleStyleViewModel subtitleStyleViewModel2 = this.f106796ae;
        if (subtitleStyleViewModel2 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        subtitleTextView5.setViewModel(subtitleStyleViewModel2);
        SubtitleStyleViewModel subtitleStyleViewModel3 = this.f106796ae;
        if (subtitleStyleViewModel3 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o a3 = subtitleStyleViewModel3.mo101539a();
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        a3.observe(fragmentActivity, new C41053ao(this));
        SubtitleStyleViewModel subtitleStyleViewModel4 = this.f106796ae;
        if (subtitleStyleViewModel4 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o b = subtitleStyleViewModel4.mo101541b();
        FragmentActivity fragmentActivity2 = this.f106818w;
        if (fragmentActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        b.observe(fragmentActivity2, new C41054ap(this));
        SubtitleStyleViewModel subtitleStyleViewModel5 = this.f106796ae;
        if (subtitleStyleViewModel5 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o c = subtitleStyleViewModel5.mo101542c();
        FragmentActivity fragmentActivity3 = this.f106818w;
        if (fragmentActivity3 == null) {
            C7573i.m23583a("mActivity");
        }
        c.observe(fragmentActivity3, new C41055aq(this));
        SubtitleStyleViewModel subtitleStyleViewModel6 = this.f106796ae;
        if (subtitleStyleViewModel6 == null) {
            C7573i.m23583a("mStyleViewModel");
        }
        C0052o d = subtitleStyleViewModel6.mo101543d();
        FragmentActivity fragmentActivity4 = this.f106818w;
        if (fragmentActivity4 == null) {
            C7573i.m23583a("mActivity");
        }
        d.observe(fragmentActivity4, new C41056ar(this));
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C7573i.m23583a("mContentLayout");
        }
        ViewGroup viewGroup = frameLayout;
        LinearLayout linearLayout = this.mSubtitleLayout;
        if (linearLayout == null) {
            C7573i.m23583a("mSubtitleLayout");
        }
        View view = linearLayout;
        View view2 = this.f106789X;
        if (view2 == null) {
            C7573i.m23583a("mEditTypeView");
        }
        C41113g gVar = new C41113g(viewGroup, view, view2);
        View view3 = this.f106789X;
        if (view3 == null) {
            C7573i.m23583a("mEditTypeView");
        }
        View findViewById = view3.findViewById(R.id.sp);
        C41057as asVar = new C41057as(this, bgColorMode, bgColor, align, a2, gVar);
        findViewById.setOnClickListener(asVar);
        View view4 = this.f106789X;
        if (view4 == null) {
            C7573i.m23583a("mEditTypeView");
        }
        view4.findViewById(R.id.ddl).setOnClickListener(new C41058at(this, gVar));
        C34856c auVar = new C41059au(this);
        FragmentActivity fragmentActivity5 = this.f106818w;
        if (fragmentActivity5 == null) {
            C7573i.m23583a("mActivity");
        }
        gVar.mo101569a(auVar, (int) C9738o.m28708b((Context) fragmentActivity5, 232.0f));
        C6907h.m21524a("edit_text", (Map) mo101474Y().mo96483a("is_subtitle", 1).f100112a);
    }

    /* renamed from: R */
    public final void mo101468R() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(C39811er.f103468d);
        sb.append("output.aac");
        String path = new File(sb.toString()).getPath();
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        if (videoPublishEditModel.getWavFile() != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
            if (videoPublishEditModel2 == null) {
                C7573i.m23583a("mModel");
            }
            str = videoPublishEditModel2.getWavFile();
        } else {
            VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
            if (videoPublishEditModel3 == null) {
                C7573i.m23583a("mModel");
            }
            String videoPath = videoPublishEditModel3.videoPath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C39811er.f103468d);
            sb2.append("origin");
            str = VEUtils.getFileBestStreamAudio(videoPath, new File(sb2.toString()).getPath());
        }
        int i = -1;
        if (str != null) {
            VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
            if (videoPublishEditModel4 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel4.isFastImport) {
                VideoPublishEditModel videoPublishEditModel5 = this.f106817v;
                if (videoPublishEditModel5 == null) {
                    C7573i.m23583a("mModel");
                }
                if (videoPublishEditModel5.getPreviewInfo() != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.f106817v;
                    if (videoPublishEditModel6 == null) {
                        C7573i.m23583a("mModel");
                    }
                    if (!videoPublishEditModel6.getPreviewInfo().getVideoList().isEmpty()) {
                        VideoPublishEditModel videoPublishEditModel7 = this.f106817v;
                        if (videoPublishEditModel7 == null) {
                            C7573i.m23583a("mModel");
                        }
                        if (((EditVideoSegment) videoPublishEditModel7.getPreviewInfo().getVideoList().get(0)).getVideoCutInfo() != null) {
                            VideoPublishEditModel videoPublishEditModel8 = this.f106817v;
                            if (videoPublishEditModel8 == null) {
                                C7573i.m23583a("mModel");
                            }
                            int size = videoPublishEditModel8.getPreviewInfo().getVideoList().size();
                            String[] strArr = new String[size];
                            long[] jArr = new long[size];
                            long[] jArr2 = new long[size];
                            long[] jArr3 = new long[2];
                            float[] fArr = new float[size];
                            VideoPublishEditModel videoPublishEditModel9 = this.f106817v;
                            if (videoPublishEditModel9 == null) {
                                C7573i.m23583a("mModel");
                            }
                            EditPreviewInfo previewInfo = videoPublishEditModel9.getPreviewInfo();
                            C7573i.m23582a((Object) previewInfo, "mModel.previewInfo");
                            m131122a(previewInfo, strArr, jArr, jArr2, fArr, jArr3);
                            float[] fArr2 = fArr;
                            i = VEUtils.detachAudioFromVideos(path, strArr, jArr, jArr2, jArr3[0], jArr3[1], fArr2, 1, 88200, 16000);
                        } else {
                            i = VEUtils.transCodeAudio(str, path, 1, -1, 16000);
                        }
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel10 = this.f106817v;
            if (videoPublishEditModel10 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel10.isMultiVideoEdit()) {
                VideoPublishEditModel videoPublishEditModel11 = this.f106817v;
                if (videoPublishEditModel11 == null) {
                    C7573i.m23583a("mModel");
                }
                VERecordData convertData = videoPublishEditModel11.getCurMultiEditVideoRecordData().convertData();
                VideoPublishEditModel videoPublishEditModel12 = this.f106817v;
                if (videoPublishEditModel12 == null) {
                    C7573i.m23583a("mModel");
                }
                MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel12.getCurMultiEditVideoRecordData();
                C7573i.m23582a((Object) curMultiEditVideoRecordData, "mModel.curMultiEditVideoRecordData");
                Pair playInOutTime = curMultiEditVideoRecordData.getPlayInOutTime();
                convertData.mo108048a((long) (((Number) playInOutTime.first).intValue() * 1000), (long) (((Number) playInOutTime.second).intValue() * 1000));
                i = VEUtils.getAudioFromRecordData(path, convertData, 1, 88200, 16000);
            } else {
                i = VEUtils.transCodeAudio(str, path, 1, -1, 16000);
            }
        }
        if (i != 0) {
            StringBuilder sb3 = new StringBuilder("subtitle transCodeAudio fail, code =");
            sb3.append(i);
            C41530am.m132280a(sb3.toString());
            path = str;
        }
        this.f106778I = path;
    }

    /* renamed from: ae */
    private final void m131127ae() {
        View h_ = mo31004h_(R.id.cyv);
        C7573i.m23582a((Object) h_, "requireViewById(R.id.scene_layout_subtitle)");
        this.f106821z = (ViewGroup) h_;
        ViewGroup viewGroup = this.f106821z;
        if (viewGroup == null) {
            C7573i.m23583a("mSubtitleView");
        }
        viewGroup.setVisibility(8);
        ViewGroup viewGroup2 = this.f106821z;
        if (viewGroup2 == null) {
            C7573i.m23583a("mSubtitleView");
        }
        ButterKnife.bind((Object) this, (View) viewGroup2);
        this.f106787V = new C41085r(this);
        FragmentActivity fragmentActivity = this.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        LayoutInflater from = LayoutInflater.from(fragmentActivity);
        FrameLayout frameLayout = this.mContentLayout;
        if (frameLayout == null) {
            C7573i.m23583a("mContentLayout");
        }
        View inflate = from.inflate(R.layout.ak3, frameLayout, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(mAct…t, mContentLayout, false)");
        this.f106789X = inflate;
        View view = this.f106789X;
        if (view == null) {
            C7573i.m23583a("mEditTypeView");
        }
        View findViewById = view.findViewById(R.id.di_);
        C7573i.m23582a((Object) findViewById, "mEditTypeView.findViewBy…R.id.text_sticker_layout)");
        this.f106809n = (SubtitleEditTypeLayout) findViewById;
        View view2 = this.f106789X;
        if (view2 == null) {
            C7573i.m23583a("mEditTypeView");
        }
        View findViewById2 = view2.findViewById(R.id.ag6);
        C7573i.m23582a((Object) findViewById2, "mEditTypeView.findViewById(R.id.et_input)");
        this.f106812q = (SubtitleTextView) findViewById2;
        SubtitleTextView subtitleTextView = this.f106812q;
        if (subtitleTextView == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        subtitleTextView.setVisibility(4);
        View view3 = this.f106789X;
        if (view3 == null) {
            C7573i.m23583a("mEditTypeView");
        }
        View findViewById3 = view3.findViewById(R.id.sp);
        C7573i.m23582a((Object) findViewById3, "mEditTypeView.findViewById<ImageView>(R.id.cancel)");
        ((ImageView) findViewById3).setVisibility(0);
        FragmentActivity fragmentActivity2 = this.f106818w;
        if (fragmentActivity2 == null) {
            C7573i.m23583a("mActivity");
        }
        LayoutInflater from2 = LayoutInflater.from(fragmentActivity2);
        LinearLayout linearLayout = this.mLoadingArea;
        if (linearLayout == null) {
            C7573i.m23583a("mLoadingArea");
        }
        View inflate2 = from2.inflate(R.layout.ak2, linearLayout, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(mAct…ail, mLoadingArea, false)");
        this.f106790Y = inflate2;
        FragmentActivity fragmentActivity3 = this.f106818w;
        if (fragmentActivity3 == null) {
            C7573i.m23583a("mActivity");
        }
        LayoutInflater from3 = LayoutInflater.from(fragmentActivity3);
        LinearLayout linearLayout2 = this.mLoadingArea;
        if (linearLayout2 == null) {
            C7573i.m23583a("mLoadingArea");
        }
        View inflate3 = from3.inflate(R.layout.ak1, linearLayout2, false);
        C7573i.m23582a((Object) inflate3, "LayoutInflater.from(mAct…pty, mLoadingArea, false)");
        this.f106791Z = inflate3;
        TextView textView = this.mCancelView;
        if (textView == null) {
            C7573i.m23583a("mCancelView");
        }
        C42939as asVar = this.f106787V;
        if (asVar == null) {
            C7573i.m23583a("debounceOnClickListener");
        }
        textView.setOnClickListener(asVar);
        TextView textView2 = this.mSaveView;
        if (textView2 == null) {
            C7573i.m23583a("mSaveView");
        }
        C42939as asVar2 = this.f106787V;
        if (asVar2 == null) {
            C7573i.m23583a("debounceOnClickListener");
        }
        textView2.setOnClickListener(asVar2);
        ImageView imageView = this.mIvFont;
        if (imageView == null) {
            C7573i.m23583a("mIvFont");
        }
        C42939as asVar3 = this.f106787V;
        if (asVar3 == null) {
            C7573i.m23583a("debounceOnClickListener");
        }
        imageView.setOnClickListener(asVar3);
        ImageView imageView2 = this.mIvDelete;
        if (imageView2 == null) {
            C7573i.m23583a("mIvDelete");
        }
        C42939as asVar4 = this.f106787V;
        if (asVar4 == null) {
            C7573i.m23583a("debounceOnClickListener");
        }
        imageView2.setOnClickListener(asVar4);
        DmtStatusView dmtStatusView = this.mLoadingStatusView;
        if (dmtStatusView == null) {
            C7573i.m23583a("mLoadingStatusView");
        }
        FragmentActivity fragmentActivity4 = this.f106818w;
        if (fragmentActivity4 == null) {
            C7573i.m23583a("mActivity");
        }
        dmtStatusView.setBuilder(C10803a.m31631a((Context) fragmentActivity4).mo25965c(1));
        FragmentActivity fragmentActivity5 = this.f106818w;
        if (fragmentActivity5 == null) {
            C7573i.m23583a("mActivity");
        }
        this.f106814s = new HighLightLayoutManager(fragmentActivity5, 1, false);
        this.f106815t = new SubtitleAdapter(this, new ArrayList());
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        HighLightLayoutManager highLightLayoutManager = this.f106814s;
        if (highLightLayoutManager == null) {
            C7573i.m23583a("mHighLightLayoutManager");
        }
        aVDmtPanelRecyleView.setLayoutManager(highLightLayoutManager);
        SubtitleAdapter subtitleAdapter = this.f106815t;
        if (subtitleAdapter == null) {
            C7573i.m23583a("mSubtitleAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(subtitleAdapter);
        aVDmtPanelRecyleView.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(aVDmtPanelRecyleView.getContext(), 52.0f), (int) C9738o.m28708b(aVDmtPanelRecyleView.getContext(), 106.0f)));
        C1267f itemAnimator = aVDmtPanelRecyleView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.mRecyclerView;
            if (aVDmtPanelRecyleView2 == null) {
                C7573i.m23583a("mRecyclerView");
            }
            aVDmtPanelRecyleView2.mo5528a((C1281m) new SubtitleModule$initView$3(this));
            FragmentActivity fragmentActivity6 = this.f106818w;
            if (fragmentActivity6 == null) {
                C7573i.m23583a("mActivity");
            }
            LayoutInflater from4 = LayoutInflater.from(fragmentActivity6);
            ViewGroup viewGroup3 = this.f106821z;
            if (viewGroup3 == null) {
                C7573i.m23583a("mSubtitleView");
            }
            View inflate4 = from4.inflate(R.layout.ajy, viewGroup3, false);
            if (inflate4 != null) {
                this.f106779J = (LinearLayout) inflate4;
                this.f106816u = new SubtitleEditAdapter(this, new ArrayList(), new ArrayList(), 0);
                LinearLayout linearLayout3 = this.f106779J;
                if (linearLayout3 == null) {
                    C7573i.m23583a("mEditView");
                }
                View findViewById4 = linearLayout3.findViewById(R.id.acg);
                RecyclerView recyclerView = (RecyclerView) findViewById4;
                FragmentActivity fragmentActivity7 = this.f106818w;
                if (fragmentActivity7 == null) {
                    C7573i.m23583a("mActivity");
                }
                recyclerView.setLayoutManager(new LinearLayoutManager(fragmentActivity7, 1, false));
                SubtitleEditAdapter subtitleEditAdapter = this.f106816u;
                if (subtitleEditAdapter == null) {
                    C7573i.m23583a("mSubtitleEditAdapter");
                }
                recyclerView.setAdapter(subtitleEditAdapter);
                recyclerView.mo5525a((C1272h) new SpaceItemDecoration((int) C9738o.m28708b(recyclerView.getContext(), 40.0f), (int) C9738o.m28708b(recyclerView.getContext(), 40.0f)));
                C7573i.m23582a((Object) findViewById4, "mEditView.findViewById<R… 40f).toInt()))\n        }");
                this.f106774E = recyclerView;
                m131128af();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    public static final /* synthetic */ SafeHandler m131119a(SubtitleModule subtitleModule) {
        SafeHandler safeHandler = subtitleModule.f106773D;
        if (safeHandler == null) {
            C7573i.m23583a("mTipsHandler");
        }
        return safeHandler;
    }

    /* renamed from: b */
    public static final /* synthetic */ SafeHandler m131144b(SubtitleModule subtitleModule) {
        SafeHandler safeHandler = subtitleModule.f106772C;
        if (safeHandler == null) {
            C7573i.m23583a("mSafeHandler");
        }
        return safeHandler;
    }

    /* renamed from: c */
    public static final /* synthetic */ HighLightLayoutManager m131146c(SubtitleModule subtitleModule) {
        HighLightLayoutManager highLightLayoutManager = subtitleModule.f106814s;
        if (highLightLayoutManager == null) {
            C7573i.m23583a("mHighLightLayoutManager");
        }
        return highLightLayoutManager;
    }

    /* renamed from: d */
    public static final /* synthetic */ FragmentActivity m131148d(SubtitleModule subtitleModule) {
        FragmentActivity fragmentActivity = subtitleModule.f106818w;
        if (fragmentActivity == null) {
            C7573i.m23583a("mActivity");
        }
        return fragmentActivity;
    }

    /* renamed from: e */
    public static final /* synthetic */ SubtitleAdapter m131149e(SubtitleModule subtitleModule) {
        SubtitleAdapter subtitleAdapter = subtitleModule.f106815t;
        if (subtitleAdapter == null) {
            C7573i.m23583a("mSubtitleAdapter");
        }
        return subtitleAdapter;
    }

    /* renamed from: f */
    public static final /* synthetic */ C0052o m131151f(SubtitleModule subtitleModule) {
        C0052o<C47516v> oVar = subtitleModule.f106771B;
        if (oVar == null) {
            C7573i.m23583a("mPreviewControlOpLiveData");
        }
        return oVar;
    }

    /* renamed from: g */
    public static final /* synthetic */ C27358a m131152g(SubtitleModule subtitleModule) {
        C27358a aVar = subtitleModule.f106770A;
        if (aVar == null) {
            C7573i.m23583a("mCurrentPositionSource");
        }
        return aVar;
    }

    /* renamed from: h */
    public static final /* synthetic */ SubtitleEditTypeLayout m131153h(SubtitleModule subtitleModule) {
        SubtitleEditTypeLayout subtitleEditTypeLayout = subtitleModule.f106809n;
        if (subtitleEditTypeLayout == null) {
            C7573i.m23583a("mTextStickerInputLayout");
        }
        return subtitleEditTypeLayout;
    }

    /* renamed from: i */
    public static final /* synthetic */ VideoPublishEditModel m131154i(SubtitleModule subtitleModule) {
        VideoPublishEditModel videoPublishEditModel = subtitleModule.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        return videoPublishEditModel;
    }

    /* renamed from: j */
    public static final /* synthetic */ SubtitleTextView m131155j(SubtitleModule subtitleModule) {
        SubtitleTextView subtitleTextView = subtitleModule.f106812q;
        if (subtitleTextView == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        return subtitleTextView;
    }

    /* renamed from: k */
    public static final /* synthetic */ SubtitleEditAdapter m131156k(SubtitleModule subtitleModule) {
        SubtitleEditAdapter subtitleEditAdapter = subtitleModule.f106816u;
        if (subtitleEditAdapter == null) {
            C7573i.m23583a("mSubtitleEditAdapter");
        }
        return subtitleEditAdapter;
    }

    /* renamed from: l */
    public static final /* synthetic */ RecyclerView m131157l(SubtitleModule subtitleModule) {
        RecyclerView recyclerView = subtitleModule.f106774E;
        if (recyclerView == null) {
            C7573i.m23583a("mEditRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: m */
    public static final /* synthetic */ LinearLayout m131158m(SubtitleModule subtitleModule) {
        LinearLayout linearLayout = subtitleModule.f106779J;
        if (linearLayout == null) {
            C7573i.m23583a("mEditView");
        }
        return linearLayout;
    }

    /* renamed from: n */
    public static final /* synthetic */ ViewGroup m131159n(SubtitleModule subtitleModule) {
        ViewGroup viewGroup = subtitleModule.f106821z;
        if (viewGroup == null) {
            C7573i.m23583a("mSubtitleView");
        }
        return viewGroup;
    }

    /* renamed from: b */
    private final C1592h<C41111e> m131143b(String str) {
        return m131142at().submitAudio("douyin_caption", "aweme_token", 20, 1, new TypedFile("application/octet-stream", new File(str)));
    }

    /* renamed from: d */
    public final void mo101495d(int i) {
        C42078c cVar = this.f106788W;
        if (cVar == null) {
            C7573i.m23583a("keyBoardListener");
        }
        cVar.mo103393a();
        this.f106781L = false;
        C41071g gVar = new C41071g(this, i);
        C15389d dVar = this.f106819x;
        if (dVar != null) {
            dVar.mo38824b((C45329l) gVar);
        }
        C15389d dVar2 = this.f106819x;
        if (dVar2 != null) {
            dVar2.mo38756a(0, this.f106820y, SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
        }
        C15389d dVar3 = this.f106819x;
        if (dVar3 != null) {
            dVar3.mo38832c(true);
        }
        m131150e(i);
    }

    /* renamed from: e */
    public final void mo30985e(Bundle bundle) {
        super.mo30985e(bundle);
        m131126ad();
        m131127ae();
    }

    public SubtitleModule(C39591h hVar) {
        C7573i.m23587b(hVar, "infoStickerHelper");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(15400);
        ofFloat.addUpdateListener(new C41030a(ofFloat, this));
        this.f106803al = ofFloat;
        this.f106804am = C7546e.m23569a(C41070f.f106896a);
        this.f106813r = hVar;
    }

    /* renamed from: e */
    private final void m131150e(int i) {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
        if (aVDmtPanelRecyleView == null) {
            C7573i.m23583a("mRecyclerView");
        }
        if (aVDmtPanelRecyleView.getAdapter() != null) {
            SubtitleAdapter subtitleAdapter = this.f106815t;
            if (subtitleAdapter == null) {
                C7573i.m23583a("mSubtitleAdapter");
            }
            ArrayList<UtteranceWithWords> arrayList = subtitleAdapter.f106829c;
            int size = arrayList.size() - 1;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UtteranceWithWords utteranceWithWords = (UtteranceWithWords) it.next();
                if (!(utteranceWithWords.getStartTime() == 0 && utteranceWithWords.getEndTime() == this.f106820y) && utteranceWithWords.getStartTime() <= i && i <= utteranceWithWords.getEndTime()) {
                    size = arrayList.indexOf(utteranceWithWords);
                }
            }
            if (size >= 0) {
                SubtitleAdapter subtitleAdapter2 = this.f106815t;
                if (subtitleAdapter2 == null) {
                    C7573i.m23583a("mSubtitleAdapter");
                }
                if (!TextUtils.isEmpty(((UtteranceWithWords) subtitleAdapter2.f106829c.get(size)).getText()) || size == 0) {
                    HighLightLayoutManager highLightLayoutManager = this.f106814s;
                    if (highLightLayoutManager == null) {
                        C7573i.m23583a("mHighLightLayoutManager");
                    }
                    FragmentActivity fragmentActivity = this.f106818w;
                    if (fragmentActivity == null) {
                        C7573i.m23583a("mActivity");
                    }
                    highLightLayoutManager.mo5417a(size, (int) C9738o.m28708b((Context) fragmentActivity, 52.0f));
                    SubtitleAdapter subtitleAdapter3 = this.f106815t;
                    if (subtitleAdapter3 == null) {
                        C7573i.m23583a("mSubtitleAdapter");
                    }
                    subtitleAdapter3.mo101497a(size);
                }
            }
        }
    }

    /* renamed from: b */
    private final void m131145b(List<? extends UtteranceWithWords> list) {
        this.f106777H.clear();
        if (this.f106797af != null) {
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            NetStateReceiver.m128493b((Context) fragmentActivity);
            this.f106797af = null;
        }
        LinearLayout linearLayout = this.mSubtitleLayout;
        if (linearLayout == null) {
            C7573i.m23583a("mSubtitleLayout");
        }
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = this.mSubtitleLayout;
        if (linearLayout2 == null) {
            C7573i.m23583a("mSubtitleLayout");
        }
        linearLayout2.setAlpha(1.0f);
        TextView textView = this.mSaveView;
        if (textView == null) {
            C7573i.m23583a("mSaveView");
        }
        textView.setVisibility(0);
        TextView textView2 = this.mCancelView;
        if (textView2 == null) {
            C7573i.m23583a("mCancelView");
        }
        textView2.setVisibility(0);
        if (!list.isEmpty()) {
            if (((UtteranceWithWords) list.get(0)).getStartTime() != 0) {
                this.f106777H.add(new UtteranceWithWords(0, ((UtteranceWithWords) list.get(0)).getStartTime() - 1));
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i == list.size() - 1) {
                    this.f106777H.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
                } else {
                    this.f106777H.add(new UtteranceWithWords((UtteranceWithWords) list.get(i)));
                    this.f106777H.add(new UtteranceWithWords(((UtteranceWithWords) list.get(i)).getEndTime() + 1, ((UtteranceWithWords) list.get(i + 1)).getStartTime() - 1));
                }
            }
            if (((UtteranceWithWords) list.get(list.size() - 1)).getEndTime() != this.f106820y) {
                this.f106777H.add(new UtteranceWithWords(((UtteranceWithWords) list.get(list.size() - 1)).getEndTime() + 1, this.f106820y));
            }
            ArrayList arrayList = new ArrayList();
            int size2 = this.f106777H.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj = this.f106777H.get(i2);
                C7573i.m23582a(obj, "mSubtitleList.get(i)");
                arrayList.add(new UtteranceWithWords((UtteranceWithWords) obj));
            }
            SubtitleAdapter subtitleAdapter = this.f106815t;
            if (subtitleAdapter == null) {
                C7573i.m23583a("mSubtitleAdapter");
            }
            subtitleAdapter.mo101498a((List<? extends UtteranceWithWords>) arrayList);
            int ap = m131138ap();
            if (ap == -1) {
                ap = 0;
            }
            HighLightLayoutManager highLightLayoutManager = this.f106814s;
            if (highLightLayoutManager == null) {
                C7573i.m23583a("mHighLightLayoutManager");
            }
            AVDmtPanelRecyleView aVDmtPanelRecyleView = this.mRecyclerView;
            if (aVDmtPanelRecyleView == null) {
                C7573i.m23583a("mRecyclerView");
            }
            highLightLayoutManager.mo5422a(aVDmtPanelRecyleView, new C1290s(), ap);
            C15389d dVar = this.f106819x;
            if (dVar != null) {
                dVar.mo38832c(true);
            }
        }
    }

    /* renamed from: c */
    private final void m131147c(List<? extends UtteranceWithWords> list) {
        int i;
        f106765P.clear();
        C39591h hVar = this.f106813r;
        C15389d dVar = this.f106819x;
        if (dVar != null) {
            i = dVar.mo38860l();
        } else {
            i = 0;
        }
        this.f106798ag = hVar.mo98618a(new UtteranceWithWords(0, i, " "));
        this.f106813r.mo98640a(list);
        C15389d dVar2 = this.f106819x;
        if (dVar2 != null) {
            dVar2.mo38881x();
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f106794ac;
        if (vEVideoPublishEditViewModel == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        C0052o r = vEVideoPublishEditViewModel.mo119526r();
        C7573i.m23582a((Object) r, "mVEVideoPublishEditViewModel.inTimeEditView");
        r.setValue(Boolean.valueOf(true));
        this.f106813r.mo98658c((C39548d) this.f106813r.f102857d.f102641f.f102807a.get(this.f106798ag));
        SubtitleEditTypeLayout subtitleEditTypeLayout = this.f106809n;
        if (subtitleEditTypeLayout == null) {
            C7573i.m23583a("mTextStickerInputLayout");
        }
        C42039d a = C42039d.m133620a();
        C7573i.m23582a((Object) a, "TextFontStyleManager.getInstance()");
        subtitleEditTypeLayout.mo101452a("", 1, -1, 2, a.mo103232c(), true);
        VideoPublishEditModel videoPublishEditModel = this.f106817v;
        if (videoPublishEditModel == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
        SubtitleTextView subtitleTextView = this.f106812q;
        if (subtitleTextView == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        infoStickerModel.mAlign = subtitleTextView.getAlign();
        VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
        if (videoPublishEditModel2 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel2 = videoPublishEditModel2.infoStickerModel;
        SubtitleTextView subtitleTextView2 = this.f106812q;
        if (subtitleTextView2 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        infoStickerModel2.mBgMode = subtitleTextView2.getBgColorMode();
        VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
        if (videoPublishEditModel3 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel3 = videoPublishEditModel3.infoStickerModel;
        SubtitleTextView subtitleTextView3 = this.f106812q;
        if (subtitleTextView3 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        infoStickerModel3.mColor = subtitleTextView3.getBgColor();
        VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
        if (videoPublishEditModel4 == null) {
            C7573i.m23583a("mModel");
        }
        InfoStickerModel infoStickerModel4 = videoPublishEditModel4.infoStickerModel;
        C42039d a2 = C42039d.m133620a();
        SubtitleTextView subtitleTextView4 = this.f106812q;
        if (subtitleTextView4 == null) {
            C7573i.m23583a("mInvisibleEditText");
        }
        infoStickerModel4.mFontType = a2.mo103221a(subtitleTextView4.getTypeface());
        if (this.f106819x != null) {
            C15389d dVar3 = this.f106819x;
            if (dVar3 == null) {
                C7573i.m23580a();
            }
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            Context context = fragmentActivity;
            VideoPublishEditModel videoPublishEditModel5 = this.f106817v;
            if (videoPublishEditModel5 == null) {
                C7573i.m23583a("mModel");
            }
            C41064b.m131235a(dVar3, context, videoPublishEditModel5, f106765P);
        }
    }

    /* renamed from: a */
    public final C1592h<C41109c> mo101477a(String str) {
        return m131142at().queryAudio("douyin_caption", "aweme_token", str);
    }

    /* renamed from: b */
    public final void mo101492b(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        int i4;
        int i5;
        boolean z2 = z;
        if (!z2) {
            TextView textView = this.mSaveView;
            if (textView == null) {
                C7573i.m23583a("mSaveView");
            }
            textView.setVisibility(4);
            TextView textView2 = this.mCancelView;
            if (textView2 == null) {
                C7573i.m23583a("mCancelView");
            }
            textView2.setVisibility(4);
            FrameLayout frameLayout = this.mContentLayout;
            if (frameLayout == null) {
                C7573i.m23583a("mContentLayout");
            }
            View view = this.f106789X;
            if (view == null) {
                C7573i.m23583a("mEditTypeView");
            }
            frameLayout.removeView(view);
            View view2 = this.f106813r.f102858e;
            C7573i.m23582a((Object) view2, "mInfoStickerHelper.mIvPlay");
            view2.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.mContentLayout;
        if (frameLayout2 == null) {
            C7573i.m23583a("mContentLayout");
        }
        View view3 = frameLayout2;
        int ak = m131133ak();
        ViewGroup viewGroup = this.f106821z;
        if (viewGroup == null) {
            C7573i.m23583a("mSubtitleView");
        }
        C27439r.m89908a(view3, z2, ak, (View) viewGroup, (C6892b<Void>) C41051am.f106869a);
        if (z2) {
            this.f106805j = "origin";
            this.f106806k = System.currentTimeMillis();
            FrameLayout frameLayout3 = this.mContentLayout;
            if (frameLayout3 == null) {
                C7573i.m23583a("mContentLayout");
            }
            View view4 = this.f106790Y;
            if (view4 == null) {
                C7573i.m23583a("mRetryView");
            }
            frameLayout3.removeView(view4);
            FrameLayout frameLayout4 = this.mContentLayout;
            if (frameLayout4 == null) {
                C7573i.m23583a("mContentLayout");
            }
            View view5 = this.f106791Z;
            if (view5 == null) {
                C7573i.m23583a("mExitView");
            }
            frameLayout4.removeView(view5);
            this.f106807l = 0.004f;
            this.f106783N = false;
            mo101463M();
            C0052o<C47516v> oVar = this.f106771B;
            if (oVar == null) {
                C7573i.m23583a("mPreviewControlOpLiveData");
            }
            C27358a aVar = this.f106770A;
            if (aVar == null) {
                C7573i.m23583a("mCurrentPositionSource");
            }
            if (aVar.mo70457c()) {
                C15389d dVar = this.f106819x;
                if (dVar != null) {
                    i5 = dVar.mo38860l();
                } else {
                    i5 = 0;
                }
                j = (long) i5;
            } else {
                j = 0;
            }
            oVar.setValue(C47516v.m148298b(j));
            VideoPublishEditModel videoPublishEditModel = this.f106817v;
            if (videoPublishEditModel == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel.infoStickerModel == null) {
                VideoPublishEditModel videoPublishEditModel2 = this.f106817v;
                if (videoPublishEditModel2 == null) {
                    C7573i.m23583a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f106817v;
                if (videoPublishEditModel3 == null) {
                    C7573i.m23583a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(Workspace.m122803a(videoPublishEditModel3.videoPath()));
            } else {
                VideoPublishEditModel videoPublishEditModel4 = this.f106817v;
                if (videoPublishEditModel4 == null) {
                    C7573i.m23583a("mModel");
                }
                InfoStickerModel infoStickerModel = videoPublishEditModel4.infoStickerModel;
                C7573i.m23582a((Object) infoStickerModel, "mModel.infoStickerModel");
                this.f106798ag = infoStickerModel.getSubtitleRule();
            }
            this.f106813r.mo98658c((C39548d) null);
            if (this.f106798ag >= 0 && this.f106798ag < this.f106813r.f102857d.f102641f.f102807a.size()) {
                VEVideoPublishEditViewModel vEVideoPublishEditViewModel = this.f106794ac;
                if (vEVideoPublishEditViewModel == null) {
                    C7573i.m23583a("mVEVideoPublishEditViewModel");
                }
                C0052o r = vEVideoPublishEditViewModel.mo119526r();
                C7573i.m23582a((Object) r, "mVEVideoPublishEditViewModel.inTimeEditView");
                r.setValue(Boolean.valueOf(true));
            }
            VideoPublishEditModel videoPublishEditModel5 = this.f106817v;
            if (videoPublishEditModel5 == null) {
                C7573i.m23583a("mModel");
            }
            if (videoPublishEditModel5.infoStickerModel.mFontType == null) {
                VideoPublishEditModel videoPublishEditModel6 = this.f106817v;
                if (videoPublishEditModel6 == null) {
                    C7573i.m23583a("mModel");
                }
                InfoStickerModel infoStickerModel2 = videoPublishEditModel6.infoStickerModel;
                C42039d a = C42039d.m133620a();
                C7573i.m23582a((Object) a, "TextFontStyleManager.getInstance()");
                infoStickerModel2.mFontType = a.mo103232c();
                VideoPublishEditModel videoPublishEditModel7 = this.f106817v;
                if (videoPublishEditModel7 == null) {
                    C7573i.m23583a("mModel");
                }
                if (videoPublishEditModel7.infoStickerModel.mFontType == null) {
                    VideoPublishEditModel videoPublishEditModel8 = this.f106817v;
                    if (videoPublishEditModel8 == null) {
                        C7573i.m23583a("mModel");
                    }
                    videoPublishEditModel8.infoStickerModel.mFontType = "default";
                }
            }
            VideoPublishEditModel videoPublishEditModel9 = this.f106817v;
            if (videoPublishEditModel9 == null) {
                C7573i.m23583a("mModel");
            }
            this.f106786U = new InfoStickerModel(videoPublishEditModel9.infoStickerModel);
            C23258e eVar = this.f106801aj;
            if (eVar == null) {
                C7573i.m23583a("mListenableActivityRegistry");
            }
            eVar.mo60525a(this.f106802ak);
            VEVideoPublishEditViewModel vEVideoPublishEditViewModel2 = this.f106794ac;
            if (vEVideoPublishEditViewModel2 == null) {
                C7573i.m23583a("mVEVideoPublishEditViewModel");
            }
            C0052o g = vEVideoPublishEditViewModel2.mo119515g();
            C7573i.m23582a((Object) g, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
            C47519a aVar2 = C47518x.f121983l;
            int a2 = C42111b.f109618a.mo103542a(true, false, false, false, false);
            int aj = m131132aj();
            if (C39805en.m127445a()) {
                FragmentActivity fragmentActivity = this.f106818w;
                if (fragmentActivity == null) {
                    C7573i.m23583a("mActivity");
                }
                i3 = C39805en.m127450c(fragmentActivity);
            } else {
                i3 = 0;
            }
            int i6 = i3 + aj;
            int ak2 = m131133ak();
            int aq = m131139aq();
            if (C39805en.m127445a()) {
                FragmentActivity fragmentActivity2 = this.f106818w;
                if (fragmentActivity2 == null) {
                    C7573i.m23583a("mActivity");
                }
                i4 = C39804em.m127438b(fragmentActivity2, C39804em.f103457a);
            } else {
                i4 = 0;
            }
            g.setValue(C47519a.m148313a(aVar2, a2, i6, ak2, aq, i4, 0, false, false, false, false, 960, null));
            if (mo101467Q()) {
                mo101488a(true);
                this.f106777H.clear();
                this.f106778I = null;
                m131140ar();
                if (this.f106799ah) {
                    mo101472W();
                } else {
                    mo101469T();
                }
            } else {
                VideoPublishEditModel videoPublishEditModel10 = this.f106817v;
                if (videoPublishEditModel10 == null) {
                    C7573i.m23583a("mModel");
                }
                C41064b.m131236a(videoPublishEditModel10.infoStickerModel, (AbstractMap<Integer, StickerItemModel>) f106765P);
                ArrayList arrayList = new ArrayList();
                Set<Entry> entrySet = f106765P.entrySet();
                C7573i.m23582a((Object) entrySet, "subtitlesMap.entries");
                for (Entry entry : entrySet) {
                    Object value = entry.getValue();
                    C7573i.m23582a(value, "it.value");
                    if (((StickerItemModel) value).isSubtitle()) {
                        Object value2 = entry.getValue();
                        C7573i.m23582a(value2, "it.value");
                        arrayList.add(new UtteranceWithWords((StickerItemModel) value2));
                    }
                }
                List list = arrayList;
                if (list.size() > 1) {
                    C7525m.m23474a(list, new C41050al());
                }
                m131145b(list);
                mo101488a(false);
                mo101462L();
            }
            this.f106813r.mo98634a((C41108b) new C41052an(this));
            return;
        }
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel3 = this.f106794ac;
        if (vEVideoPublishEditViewModel3 == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        C0052o r2 = vEVideoPublishEditViewModel3.mo119526r();
        C7573i.m23582a((Object) r2, "mVEVideoPublishEditViewModel.inTimeEditView");
        r2.setValue(Boolean.valueOf(false));
        this.f106813r.mo98667e();
        C23258e eVar2 = this.f106801aj;
        if (eVar2 == null) {
            C7573i.m23583a("mListenableActivityRegistry");
        }
        eVar2.mo60526b(this.f106802ak);
        VEVideoPublishEditViewModel vEVideoPublishEditViewModel4 = this.f106794ac;
        if (vEVideoPublishEditViewModel4 == null) {
            C7573i.m23583a("mVEVideoPublishEditViewModel");
        }
        C0052o g2 = vEVideoPublishEditViewModel4.mo119515g();
        C7573i.m23582a((Object) g2, "mVEVideoPublishEditViewM…deoPreviewScaleOpChangeV2");
        int color = mo31017x().getColor(R.color.l3);
        int aj2 = m131132aj();
        if (C39805en.m127445a()) {
            FragmentActivity fragmentActivity3 = this.f106818w;
            if (fragmentActivity3 == null) {
                C7573i.m23583a("mActivity");
            }
            i = C39805en.m127450c(fragmentActivity3);
        } else {
            i = 0;
        }
        int i7 = aj2 + i;
        int ak3 = m131133ak();
        int aq2 = m131139aq();
        if (C39805en.m127445a()) {
            FragmentActivity fragmentActivity4 = this.f106818w;
            if (fragmentActivity4 == null) {
                C7573i.m23583a("mActivity");
            }
            i2 = C39804em.m127438b(fragmentActivity4, C39804em.f103457a);
        } else {
            i2 = 0;
        }
        g2.setValue(C47519a.m148310a(color, i7, ak3, aq2, i2, 0));
        this.f106813r.mo98634a((C41108b) null);
        View view6 = this.f106813r.f102858e;
        C7573i.m23582a((Object) view6, "mInfoStickerHelper.mIvPlay");
        view6.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo101479a(View view) {
        TextView textView = this.mCancelView;
        if (textView == null) {
            C7573i.m23583a("mCancelView");
        }
        if (C7573i.m23585a((Object) view, (Object) textView)) {
            m131134al();
            return;
        }
        TextView textView2 = this.mSaveView;
        if (textView2 == null) {
            C7573i.m23583a("mSaveView");
        }
        if (C7573i.m23585a((Object) view, (Object) textView2)) {
            m131137ao();
            return;
        }
        ImageView imageView = this.mIvFont;
        if (imageView == null) {
            C7573i.m23583a("mIvFont");
        }
        if (C7573i.m23585a((Object) view, (Object) imageView)) {
            m131136an();
            return;
        }
        ImageView imageView2 = this.mIvDelete;
        if (imageView2 == null) {
            C7573i.m23583a("mIvDelete");
        }
        if (C7573i.m23585a((Object) view, (Object) imageView2)) {
            m131135am();
        }
    }

    /* renamed from: b */
    public final void mo101491b(SubtitleApiV2 subtitleApiV2, String str) {
        mo101487a((C7561a<C7581n>) new C41046ai<C7581n>(this, str, subtitleApiV2));
    }

    /* renamed from: a */
    public final void mo101478a(int i, boolean z) {
        String str;
        boolean z2;
        this.f106783N = false;
        mo101463M();
        C27358a aVar = this.f106770A;
        if (aVar == null) {
            C7573i.m23583a("mCurrentPositionSource");
        }
        long a = aVar.mo70453a();
        C15389d dVar = this.f106819x;
        if (dVar != null) {
            dVar.mo38832c(false);
        }
        SubtitleAdapter subtitleAdapter = this.f106815t;
        if (subtitleAdapter == null) {
            C7573i.m23583a("mSubtitleAdapter");
        }
        ArrayList<UtteranceWithWords> arrayList = subtitleAdapter.f106829c;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            C7573i.m23582a(obj, "oldList[i]");
            UtteranceWithWords utteranceWithWords = new UtteranceWithWords((UtteranceWithWords) obj);
            if (utteranceWithWords.getText().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                arrayList3.add(utteranceWithWords);
                String text = utteranceWithWords.getText();
                if (text != null) {
                    char[] charArray = text.toCharArray();
                    C7573i.m23582a((Object) charArray, "(this as java.lang.String).toCharArray()");
                    arrayList4.add(new String(charArray));
                    if (i3 == i) {
                        i2 = arrayList3.size() - 1;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                int i4 = i;
            }
            arrayList2.add(utteranceWithWords);
        }
        SubtitleEditAdapter subtitleEditAdapter = this.f106816u;
        if (subtitleEditAdapter == null) {
            C7573i.m23583a("mSubtitleEditAdapter");
        }
        subtitleEditAdapter.mo101440a(arrayList3, arrayList2, i2);
        RecyclerView recyclerView = this.f106774E;
        if (recyclerView == null) {
            C7573i.m23583a("mEditRecyclerView");
        }
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            FragmentActivity fragmentActivity = this.f106818w;
            if (fragmentActivity == null) {
                C7573i.m23583a("mActivity");
            }
            linearLayoutManager.mo5417a(i2, (int) C9738o.m28708b((Context) fragmentActivity, 100.0f));
            ViewGroup viewGroup = this.f106821z;
            if (viewGroup == null) {
                C7573i.m23583a("mSubtitleView");
            }
            ViewGroup viewGroup2 = this.f106821z;
            if (viewGroup2 == null) {
                C7573i.m23583a("mSubtitleView");
            }
            View findViewById = viewGroup2.findViewById(R.id.ddg);
            LinearLayout linearLayout = this.f106779J;
            if (linearLayout == null) {
                C7573i.m23583a("mEditView");
            }
            C41113g gVar = new C41113g(viewGroup, findViewById, linearLayout);
            LinearLayout linearLayout2 = this.f106779J;
            if (linearLayout2 == null) {
                C7573i.m23583a("mEditView");
            }
            this.f106780K = linearLayout2.findViewById(R.id.sp);
            View view = this.f106780K;
            if (view == null) {
                C7573i.m23580a();
            }
            C41072h hVar = new C41072h(this, arrayList4, gVar, a);
            view.setOnClickListener(hVar);
            LinearLayout linearLayout3 = this.f106779J;
            if (linearLayout3 == null) {
                C7573i.m23583a("mEditView");
            }
            ((ImageView) linearLayout3.findViewById(R.id.ddl)).setOnClickListener(new C41074i(this, arrayList4, arrayList2, gVar));
            FragmentActivity fragmentActivity2 = this.f106818w;
            if (fragmentActivity2 == null) {
                C7573i.m23583a("mActivity");
            }
            this.f106788W = new C42078c(fragmentActivity2);
            C42078c cVar = this.f106788W;
            if (cVar == null) {
                C7573i.m23583a("keyBoardListener");
            }
            cVar.mo103394a(new C41075j(this));
            gVar.mo74845a((C34856c) new C41076k(this));
            if (z) {
                str = "click_preview";
            } else {
                str = "click_subtitle";
            }
            SubtitleEditAdapter subtitleEditAdapter2 = this.f106816u;
            if (subtitleEditAdapter2 == null) {
                C7573i.m23583a("mSubtitleEditAdapter");
            }
            subtitleEditAdapter2.mo101439a(str);
            C6907h.m21524a("enter_edit_subtitle", (Map) mo101474Y().mo96485a("enter_method", str).f100112a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: a */
    public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aiw, viewGroup, false);
        C7573i.m23582a((Object) inflate, "inflater.inflate(R.layou…btitle, container, false)");
        return inflate;
    }

    /* renamed from: a */
    private static void m131122a(EditPreviewInfo editPreviewInfo, String[] strArr, long[] jArr, long[] jArr2, float[] fArr, long[] jArr3) {
        int size = editPreviewInfo.getVideoList().size();
        for (int i = 0; i < size; i++) {
            EditVideoSegment editVideoSegment = (EditVideoSegment) editPreviewInfo.getVideoList().get(i);
            strArr[i] = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                VideoCutInfo videoCutInfo = editVideoSegment.getVideoCutInfo();
                if (videoCutInfo == null) {
                    C7573i.m23580a();
                }
                jArr[i] = videoCutInfo.getStart();
                jArr2[i] = videoCutInfo.getEnd();
                fArr[i] = videoCutInfo.getSpeed();
            } else {
                jArr[i] = -1;
                jArr2[i] = -1;
                fArr[i] = 1.0f;
            }
        }
        if (editPreviewInfo.getSceneIn() > 0 || editPreviewInfo.getSceneOut() > 0) {
            jArr3[0] = editPreviewInfo.getSceneIn();
            jArr3[1] = editPreviewInfo.getSceneOut();
            return;
        }
        jArr3[0] = -1;
        jArr3[1] = -1;
    }
}
