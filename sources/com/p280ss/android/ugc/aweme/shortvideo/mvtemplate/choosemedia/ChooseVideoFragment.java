package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.mediachoose.C33146a;
import com.p280ss.android.ugc.aweme.mediachoose.C33165d;
import com.p280ss.android.ugc.aweme.mediachoose.C33185q;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity.C40108b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C40116b;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C40117c;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoPreviewActivity;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment */
public final class ChooseVideoFragment extends AVMediaChooseBaseFragment {

    /* renamed from: o */
    static final /* synthetic */ C7595j[] f104146o = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ChooseVideoFragment.class), "videoLegalChecker", "getVideoLegalChecker()Lcom/ss/android/ugc/aweme/mediachoose/VideoLegalChecker;"))};

    /* renamed from: A */
    private final C7541d f104147A = C7546e.m23569a(new C40100f(this));

    /* renamed from: B */
    private final OnClickListener f104148B = new C40096c(this);

    /* renamed from: C */
    private HashMap f104149C;

    /* renamed from: p */
    public C40116b f104150p;

    /* renamed from: q */
    public boolean f104151q = true;

    /* renamed from: r */
    public boolean f104152r;

    /* renamed from: s */
    public long f104153s = C39810eq.m127460a();

    /* renamed from: t */
    public int f104154t = -1;

    /* renamed from: u */
    private ImageView f104155u;

    /* renamed from: v */
    private ImageView f104156v;

    /* renamed from: w */
    private View f104157w;

    /* renamed from: x */
    private TextView f104158x;

    /* renamed from: y */
    private DmtTextView f104159y;

    /* renamed from: z */
    private C40108b f104160z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$a */
    static final class C40094a extends Lambda implements C7563m<String, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104161a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f104162b;

        /* renamed from: c */
        final /* synthetic */ String f104163c;

        /* renamed from: d */
        final /* synthetic */ C7561a f104164d;

        C40094a(ChooseVideoFragment chooseVideoFragment, MediaModel mediaModel, String str, C7561a aVar) {
            this.f104161a = chooseVideoFragment;
            this.f104162b = mediaModel;
            this.f104163c = str;
            this.f104164d = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m128137a((String) obj, ((Number) obj2).longValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m128137a(String str, long j) {
            C7573i.m23587b(str, "checkerType");
            C6893q.m21444a("aweme_movie_import_error_rate", 0, (JSONObject) null);
            ChooseVideoFragment.m128123a(this.f104162b, str, 0, 0, j, this.f104163c);
            if (this.f104161a.getActivity() == null || !this.f104161a.isViewValid()) {
                this.f104161a.f104152r = false;
            } else {
                this.f104164d.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$b */
    static final class C40095b extends Lambda implements C48007r<String, Long, Integer, String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104165a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f104166b;

        /* renamed from: c */
        final /* synthetic */ String f104167c;

        C40095b(ChooseVideoFragment chooseVideoFragment, MediaModel mediaModel, String str) {
            this.f104165a = chooseVideoFragment;
            this.f104166b = mediaModel;
            this.f104167c = str;
            super(4);
        }

        /* renamed from: a */
        private void m128138a(String str, long j, int i, String str2) {
            C7573i.m23587b(str, "checkerType");
            C7573i.m23587b(str2, "errorMsg");
            this.f104165a.f104152r = false;
            this.f104165a.mo99802a(this.f104166b, str, i, j, this.f104167c, str2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m128138a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue(), (String) obj4);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$c */
    static final class C40096c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104168a;

        C40096c(ChooseVideoFragment chooseVideoFragment) {
            this.f104168a = chooseVideoFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            MvImageChooseAdapter mvImageChooseAdapter = this.f104168a.f104136e;
            C7573i.m23582a((Object) mvImageChooseAdapter, "mediaAdapter");
            MvImageChooseAdapter mvImageChooseAdapter2 = this.f104168a.f104136e;
            C7573i.m23582a((Object) mvImageChooseAdapter2, "mediaAdapter");
            mvImageChooseAdapter.mo99854a(!mvImageChooseAdapter2.f104268f);
            MvImageChooseAdapter mvImageChooseAdapter3 = this.f104168a.f104136e;
            C7573i.m23582a((Object) mvImageChooseAdapter3, "mediaAdapter");
            if (mvImageChooseAdapter3.f104268f) {
                this.f104168a.mo99805a(true);
            } else {
                this.f104168a.mo99805a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$d */
    static final class C40097d implements C40117c {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104169a;

        C40097d(ChooseVideoFragment chooseVideoFragment) {
            this.f104169a = chooseVideoFragment;
        }

        /* renamed from: a */
        public final void mo99809a(View view, final MediaModel mediaModel) {
            String str;
            if (mediaModel != null) {
                MvImageChooseAdapter mvImageChooseAdapter = this.f104169a.f104136e;
                C7573i.m23582a((Object) mvImageChooseAdapter, "mediaAdapter");
                if (mvImageChooseAdapter.f104268f) {
                    if (!this.f104169a.mo99807a(mediaModel, view)) {
                    }
                } else if (!C7276d.m22812b(mediaModel.f88156b)) {
                    Context activity = this.f104169a.getActivity();
                    FragmentActivity activity2 = this.f104169a.getActivity();
                    if (activity2 != null) {
                        Resources resources = activity2.getResources();
                        if (resources != null) {
                            str = resources.getString(R.string.bh2);
                            C10761a.m31403c(activity, str).mo25750a();
                        }
                    }
                    str = null;
                    C10761a.m31403c(activity, str).mo25750a();
                } else {
                    this.f104169a.mo99806a(false, mediaModel, new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C40097d f104170a;

                        {
                            this.f104170a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m128140a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m128140a() {
                            C40116b bVar = this.f104170a.f104169a.f104150p;
                            if (bVar != null) {
                                bVar.mo99834a(mediaModel);
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$e */
    static final class C40099e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104172a;

        /* renamed from: b */
        final /* synthetic */ View f104173b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f104174c;

        C40099e(ChooseVideoFragment chooseVideoFragment, View view, MediaModel mediaModel) {
            this.f104172a = chooseVideoFragment;
            this.f104173b = view;
            this.f104174c = mediaModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m128141a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m128141a() {
            ChooseVideoFragment chooseVideoFragment = this.f104172a;
            View view = this.f104173b;
            String str = this.f104174c.f88156b;
            C7573i.m23582a((Object) str, "item.filePath");
            chooseVideoFragment.mo99801a(view, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$f */
    static final class C40100f extends Lambda implements C7561a<C33185q> {

        /* renamed from: a */
        final /* synthetic */ ChooseVideoFragment f104175a;

        C40100f(ChooseVideoFragment chooseVideoFragment) {
            this.f104175a = chooseVideoFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33185q invoke() {
            if (C35563c.f93231M.mo93305a(Property.VideoLegalCheckInLocal) || this.f104175a.f104154t == 4) {
                FragmentActivity activity = this.f104175a.getActivity();
                if (activity == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) activity, "activity!!");
                return new C33165d(activity);
            }
            FragmentActivity activity2 = this.f104175a.getActivity();
            if (activity2 == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity2, "activity!!");
            return new C33146a(activity2);
        }
    }

    /* renamed from: e */
    private final C33185q m128124e() {
        return (C33185q) this.f104147A.getValue();
    }

    /* renamed from: j */
    private void m128128j() {
        if (this.f104149C != null) {
            this.f104149C.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m128128j();
    }

    /* renamed from: f */
    private final void m128125f() {
        MvImageChooseAdapter mvImageChooseAdapter = this.f104136e;
        C7573i.m23582a((Object) mvImageChooseAdapter, "mediaAdapter");
        mvImageChooseAdapter.mo99854a(true);
        ImageView imageView = this.f104155u;
        if (imageView == null) {
            C7573i.m23583a("multiIconSelect");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.f104155u;
        if (imageView2 == null) {
            C7573i.m23583a("multiIconSelect");
        }
        imageView2.setVisibility(8);
        TextView textView = this.f104158x;
        if (textView == null) {
            C7573i.m23583a("multiTvDes");
        }
        textView.setVisibility(8);
        View view = this.f104157w;
        if (view == null) {
            C7573i.m23583a("multiView");
        }
        view.setVisibility(8);
        m128124e().mo84892a("enter_from_multi");
    }

    /* renamed from: g */
    private final void m128126g() {
        int i;
        this.f104137f = (RecyclerView) this.f104139h.findViewById(R.id.ass);
        View findViewById = this.f104139h.findViewById(R.id.te);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById<View>(R.id.card_view_multi)");
        this.f104157w = findViewById;
        View findViewById2 = this.f104139h.findViewById(R.id.bac);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.id.iv_multi_select)");
        this.f104155u = (ImageView) findViewById2;
        View findViewById3 = this.f104139h.findViewById(R.id.bad);
        C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.id.iv_multi_unselect)");
        this.f104156v = (ImageView) findViewById3;
        View findViewById4 = this.f104139h.findViewById(R.id.dy6);
        C7573i.m23582a((Object) findViewById4, "rootView.findViewById(R.id.tv_multi_des)");
        this.f104158x = (TextView) findViewById4;
        View findViewById5 = this.f104139h.findViewById(R.id.dvl);
        C7573i.m23582a((Object) findViewById5, "rootView.findViewById(R.id.tv_hint)");
        this.f104159y = (DmtTextView) findViewById5;
        this.f104141j = (DmtLoadingLayout) this.f104139h.findViewById(R.id.eau);
        View view = this.f104157w;
        if (view == null) {
            C7573i.m23583a("multiView");
        }
        if (!this.f104151q || this.f104143l) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        ImageView imageView = this.f104155u;
        if (imageView == null) {
            C7573i.m23583a("multiIconSelect");
        }
        imageView.setOnClickListener(this.f104148B);
        ImageView imageView2 = this.f104156v;
        if (imageView2 == null) {
            C7573i.m23583a("multiIconUnSelect");
        }
        imageView2.setOnClickListener(this.f104148B);
        TextView textView = this.f104158x;
        if (textView == null) {
            C7573i.m23583a("multiTvDes");
        }
        textView.setOnClickListener(this.f104148B);
        if (this.f104154t != -1 && this.f104154t != 1 && this.f104154t != 4) {
            C39182e eVar = C39182e.f101552a;
            View view2 = this.f104157w;
            if (view2 == null) {
                C7573i.m23583a("multiView");
            }
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            eVar.mo97466a(view2, (Activity) activity);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0096  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m128127i() {
        /*
            r13 = this;
            android.support.v7.widget.RecyclerView r0 = r13.f104137f
            java.lang.String r1 = "imageGridView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.views.WrapGridLayoutManager r1 = new com.ss.android.ugc.aweme.views.WrapGridLayoutManager
            android.support.v4.app.FragmentActivity r2 = r13.getActivity()
            android.content.Context r2 = (android.content.Context) r2
            r3 = 4
            r1.<init>(r2, r3)
            android.support.v7.widget.RecyclerView$i r1 = (android.support.p029v7.widget.RecyclerView.C1273i) r1
            r0.setLayoutManager(r1)
            android.support.v7.widget.RecyclerView r0 = r13.f104137f
            com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration r1 = new com.ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration
            android.content.Context r2 = r13.getContext()
            r4 = 1065353216(0x3f800000, float:1.0)
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r4)
            int r2 = (int) r2
            r4 = 0
            r1.<init>(r3, r2, r4)
            android.support.v7.widget.RecyclerView$h r1 = (android.support.p029v7.widget.RecyclerView.C1272h) r1
            r0.mo5525a(r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter
            android.content.Context r6 = r13.getContext()
            r7 = 4
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r10 = 1069547520(0x3fc00000, float:1.5)
            r11 = 0
            r12 = 1
            r5 = r0
            r5.<init>(r6, r7, r8, r10, r11, r12)
            r13.f104136e = r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            java.lang.String r1 = "mediaAdapter"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r1 = r13.f104143l
            r0.mo99854a(r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            r1 = 1
            r0.f104269g = r1
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$b r2 = r13.f104150p
            r0.f104267e = r2
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$d r2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment$d
            r2.<init>(r13)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$c r2 = (com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.C40117c) r2
            r0.f104266d = r2
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            android.support.v7.widget.RecyclerView r2 = r13.f104137f
            r0.f104270h = r2
            android.support.v7.widget.RecyclerView r0 = r13.f104137f
            java.lang.String r2 = "imageGridView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r2 = r13.f104136e
            android.support.v7.widget.RecyclerView$a r2 = (android.support.p029v7.widget.RecyclerView.C1262a) r2
            r0.setAdapter(r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            int r2 = r13.f104142k
            r0.f104263a = r2
            android.support.v4.app.FragmentActivity r0 = r13.getActivity()
            if (r0 == 0) goto L_0x0093
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0093
            r2 = 2131827083(0x7f11198b, float:1.9287069E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0094
        L_0x0093:
            r0 = 0
        L_0x0094:
            if (r0 != 0) goto L_0x0099
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0099:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r13.f104142k
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r4] = r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r0 = com.C1642a.m8034a(r0, r1)
            java.lang.String r1 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            boolean r1 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.m128359d()
            if (r1 == 0) goto L_0x00c3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d r0 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.f104443a
            android.support.v4.app.FragmentActivity r1 = r13.getActivity()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r0.mo99938a(r1)
            goto L_0x00d5
        L_0x00c3:
            boolean r1 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.m125104g()
            if (r1 == 0) goto L_0x00d5
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.e r0 = com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e.f101552a
            android.support.v4.app.FragmentActivity r1 = r13.getActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = r0.mo97465a(r1)
        L_0x00d5:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r1 = r13.f104136e
            r1.f104264b = r0
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r0 = r13.f104141j
            java.lang.String r1 = "loadingDialog"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setVisibility(r4)
            boolean r0 = r13.f104143l
            if (r0 == 0) goto L_0x00ee
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter r0 = r13.f104136e
            java.util.List r1 = r13.f104145n
            r0.mo99856b(r1)
        L_0x00ee:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.d r0 = com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d.f104443a
            int r1 = r13.f104154t
            boolean r0 = r0.mo99939a(r1)
            if (r0 == 0) goto L_0x00fb
            r13.m128125f()
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseVideoFragment.m128127i():void");
    }

    /* renamed from: a */
    public final void mo99803a(C40108b bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f104160z = bVar;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m128127i();
    }

    /* renamed from: a */
    public final void mo99804a(C40116b bVar) {
        C7573i.m23587b(bVar, "onVideoChooseListener");
        this.f104150p = bVar;
    }

    /* renamed from: a */
    public final void mo99805a(boolean z) {
        int i;
        int i2;
        String str;
        ImageView imageView = this.f104156v;
        if (imageView == null) {
            C7573i.m23583a("multiIconUnSelect");
        }
        int i3 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.f104155u;
        if (imageView2 == null) {
            C7573i.m23583a("multiIconSelect");
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        TextView textView = this.f104158x;
        if (textView == null) {
            C7573i.m23583a("multiTvDes");
        }
        if (z) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        C33185q e = m128124e();
        if (z) {
            str = "enter_from_multi";
        } else {
            str = "enter_from_single";
        }
        e.mo84892a(str);
        C40108b bVar = this.f104160z;
        if (bVar != null) {
            bVar.mo99838a(z);
        }
    }

    /* renamed from: a */
    public final boolean mo99807a(MediaModel mediaModel, View view) {
        if (mediaModel == null || view == null || this.f104152r) {
            return false;
        }
        this.f104152r = true;
        mo99806a(true, mediaModel, new C40099e(this, view, mediaModel));
        return true;
    }

    /* renamed from: a */
    public final void mo99801a(View view, String str) {
        VideoPreviewActivity.m131410a(getActivity(), view, str, (((float) C9738o.m28691a(getContext())) * 1.0f) / ((float) C9738o.m28709b(getContext())));
        this.f104152r = false;
    }

    /* renamed from: a */
    public final void mo99799a(List<? extends MyMediaModel> list, boolean z) {
        super.mo99799a(list, z);
        if (list != null) {
            this.f104141j.setVisibility(8);
            if (list.isEmpty()) {
                DmtTextView dmtTextView = this.f104159y;
                if (dmtTextView == null) {
                    C7573i.m23583a("noVideoHintTextView");
                }
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f104159y;
                if (dmtTextView2 == null) {
                    C7573i.m23583a("noVideoHintTextView");
                }
                dmtTextView2.setText(R.string.cn6);
            } else {
                DmtTextView dmtTextView3 = this.f104159y;
                if (dmtTextView3 == null) {
                    C7573i.m23583a("noVideoHintTextView");
                }
                dmtTextView3.setVisibility(8);
            }
            if (z) {
                this.f104136e.mo99852a((Collection<? extends MyMediaModel>) list);
            } else {
                this.f104136e.mo99853a(list);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        this.f104139h = layoutInflater.inflate(R.layout.b1t, viewGroup, false);
        m128126g();
        return this.f104139h;
    }

    /* renamed from: a */
    public final void mo99806a(boolean z, MediaModel mediaModel, C7561a<C7581n> aVar) {
        String str;
        long j;
        C7573i.m23587b(mediaModel, "mediaModel");
        C7573i.m23587b(aVar, "onSuccess");
        if (z) {
            str = "preview";
        } else {
            str = "select";
        }
        if (z) {
            j = 0;
        } else {
            j = this.f104153s;
        }
        m128124e().mo84891a(mediaModel, j, -1, new C40094a(this, mediaModel, str, aVar), new C40095b(this, mediaModel, str));
    }

    /* renamed from: a */
    public static void m128123a(MediaModel mediaModel, String str, int i, int i2, long j, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6893q.m21448a("aweme_video_import_duration", jSONObject, C6869c.m21381a().mo16887a("status", String.valueOf(i)).mo16887a("scene_name", str2).mo16885a("errorCode", Integer.valueOf(i2)).mo16887a("type", str).mo16885a("width", Integer.valueOf(mediaModel.f88163i)).mo16885a("height", Integer.valueOf(mediaModel.f88164j)).mo16888b());
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public final void mo99802a(MediaModel mediaModel, String str, int i, long j, String str2, String str3) {
        if (getActivity() == null || !isViewValid()) {
            return;
        }
        int i2 = i;
        C40132e.m128287a(getActivity(), i, (int) this.f104153s);
        C6893q.m21444a("aweme_movie_import_error_rate", 1, C6869c.m21381a().mo16887a("errorCode", String.valueOf(i)).mo16887a("errorMsg", str3).mo16888b());
        m128123a(mediaModel, str, 1, i2, j, str2);
    }
}
