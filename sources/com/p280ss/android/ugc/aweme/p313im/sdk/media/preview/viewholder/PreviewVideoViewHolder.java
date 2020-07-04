package com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewholder;

import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31452a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p1311a.C30568b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31944c.C31946b;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder */
public final class PreviewVideoViewHolder extends MediaPreviewViewHolder implements C31946b {

    /* renamed from: d */
    static final /* synthetic */ C7595j[] f82375d = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PreviewVideoViewHolder.class), "mediaPlayHelper", "getMediaPlayHelper()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/helper/MediaPlayHelper;"))};

    /* renamed from: j */
    public static final C31460a f82376j = new C31460a(null);

    /* renamed from: e */
    public RemoteImageView f82377e;

    /* renamed from: f */
    public KeepSurfaceTextureView f82378f;

    /* renamed from: g */
    public ImageView f82379g;

    /* renamed from: h */
    public boolean f82380h;

    /* renamed from: i */
    public boolean f82381i;

    /* renamed from: k */
    private View f82382k;

    /* renamed from: l */
    private DmtStatusView f82383l;

    /* renamed from: m */
    private final C7541d f82384m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$a */
    public static final class C31460a {
        private C31460a() {
        }

        public /* synthetic */ C31460a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PreviewVideoViewHolder m102337a(ViewGroup viewGroup, MediaPreviewViewModel mediaPreviewViewModel) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(mediaPreviewViewModel, "viewModel");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xv, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new PreviewVideoViewHolder(inflate, mediaPreviewViewModel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$b */
    public final class C31461b extends C30568b {
        public C31461b() {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PreviewVideoViewHolder.this.mo82083k();
            MediaModel mediaModel = PreviewVideoViewHolder.this.f82367b;
            if (mediaModel != null) {
                PreviewVideoViewHolder.this.mo82081i().mo82061c(mediaModel);
            }
            return true;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (PreviewVideoViewHolder.this.f82380h) {
                if (!PreviewVideoViewHolder.m102317a(PreviewVideoViewHolder.this).f83483c) {
                    PreviewVideoViewHolder previewVideoViewHolder = PreviewVideoViewHolder.this;
                    String string = C6399b.m19921a().getString(R.string.brk);
                    C7573i.m23582a((Object) string, "AppContextManager.getApp…im_video_file_play_error)");
                    previewVideoViewHolder.mo82078a(string);
                } else if (PreviewVideoViewHolder.this.f82381i) {
                    PreviewVideoViewHolder.this.mo82082j();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$c */
    static final class C31462c extends Lambda implements C7562b<MediaModel, C7581n> {

        /* renamed from: a */
        final /* synthetic */ PreviewVideoViewHolder f82386a;

        /* renamed from: b */
        final /* synthetic */ MediaModel f82387b;

        C31462c(PreviewVideoViewHolder previewVideoViewHolder, MediaModel mediaModel) {
            this.f82386a = previewVideoViewHolder;
            this.f82387b = mediaModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102338a((MediaModel) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102338a(MediaModel mediaModel) {
            C7573i.m23587b(mediaModel, "it");
            PreviewVideoViewHolder.super.mo80308a(this.f82387b);
            String thumbnail = this.f82387b.getThumbnail();
            if (thumbnail != null) {
                RemoteImageView b = PreviewVideoViewHolder.m102319b(this.f82386a);
                StringBuilder sb = new StringBuilder("file://");
                sb.append(thumbnail);
                String sb2 = sb.toString();
                View view = this.f82386a.itemView;
                C7573i.m23582a((Object) view, "itemView");
                int width = view.getWidth();
                View view2 = this.f82386a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                C23323e.m76525b(b, sb2, width, view2.getHeight());
            }
            this.f82386a.mo82083k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$d */
    static final class C31463d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PreviewVideoViewHolder f82388a;

        C31463d(PreviewVideoViewHolder previewVideoViewHolder) {
            this.f82388a = previewVideoViewHolder;
        }

        public final void run() {
            PreviewVideoViewHolder.m102321c(this.f82388a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$e */
    static final class C31464e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PreviewVideoViewHolder f82389a;

        C31464e(PreviewVideoViewHolder previewVideoViewHolder) {
            this.f82389a = previewVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82389a.mo82082j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.viewholder.PreviewVideoViewHolder$f */
    static final class C31465f extends Lambda implements C7561a<C31452a> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewViewModel f82390a;

        C31465f(MediaPreviewViewModel mediaPreviewViewModel) {
            this.f82390a = mediaPreviewViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31452a invoke() {
            return this.f82390a.mo82091q();
        }
    }

    /* renamed from: b */
    public final void mo82080b(String str) {
    }

    /* renamed from: i */
    public final C31452a mo82081i() {
        return (C31452a) this.f82384m.getValue();
    }

    /* renamed from: e */
    public final void mo82074e() {
        super.mo82074e();
        this.f82380h = true;
        mo82083k();
    }

    /* renamed from: g */
    public final View mo82076g() {
        View view = this.f82382k;
        if (view == null) {
            C7573i.m23583a("layout");
        }
        return view;
    }

    /* renamed from: h */
    public final void mo82077h() {
        this.f82380h = false;
        MediaModel mediaModel = this.f82367b;
        if (mediaModel != null) {
            mo82081i().mo82060b(mediaModel);
        }
    }

    /* renamed from: l */
    public final void mo82084l() {
        DmtStatusView dmtStatusView = this.f82383l;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingView");
        }
        dmtStatusView.mo25939d();
    }

    /* renamed from: c */
    public final void mo80311c() {
        super.mo80311c();
        this.itemView.setOnClickListener(new C31464e(this));
    }

    /* renamed from: f */
    public final void mo82075f() {
        super.mo82075f();
        this.f82380h = false;
        MediaModel mediaModel = this.f82367b;
        if (mediaModel != null) {
            mo82081i().mo82060b(mediaModel);
        }
    }

    /* renamed from: k */
    public final void mo82083k() {
        ImageView imageView = this.f82379g;
        if (imageView == null) {
            C7573i.m23583a("ivPlay");
        }
        imageView.setAlpha(1.0f);
        ImageView imageView2 = this.f82379g;
        if (imageView2 == null) {
            C7573i.m23583a("ivPlay");
        }
        imageView2.setVisibility(0);
        RemoteImageView remoteImageView = this.f82377e;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        remoteImageView.setVisibility(0);
        DmtStatusView dmtStatusView = this.f82383l;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingView");
        }
        dmtStatusView.mo25939d();
    }

    /* renamed from: b */
    public final void mo80310b() {
        Object a = mo80306a((int) R.id.bgc);
        C7573i.m23582a(a, "findViewById(R.id.layout)");
        this.f82382k = (View) a;
        Object a2 = mo80306a((int) R.id.b7x);
        C7573i.m23582a(a2, "findViewById(R.id.iv_cover)");
        this.f82377e = (RemoteImageView) a2;
        Object a3 = mo80306a((int) R.id.dds);
        C7573i.m23582a(a3, "findViewById(R.id.surface_view)");
        this.f82378f = (KeepSurfaceTextureView) a3;
        Object a4 = mo80306a((int) R.id.ecw);
        C7573i.m23582a(a4, "findViewById(R.id.view_loading)");
        this.f82383l = (DmtStatusView) a4;
        Object a5 = mo80306a((int) R.id.bb4);
        C7573i.m23582a(a5, "findViewById(R.id.iv_play)");
        this.f82379g = (ImageView) a5;
        DmtStatusView dmtStatusView = this.f82383l;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingView");
        }
        View view = this.itemView;
        C7573i.m23582a((Object) view, "itemView");
        dmtStatusView.setBuilder(C10803a.m31631a(view.getContext()));
        KeepSurfaceTextureView keepSurfaceTextureView = this.f82378f;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("surfaceView");
        }
        keepSurfaceTextureView.setSurfaceTextureListener(new C31461b());
    }

    /* renamed from: j */
    public final void mo82082j() {
        MediaModel mediaModel = this.f82367b;
        if (mediaModel != null) {
            mo82081i().mo82059a((C31946b) this);
            if (mo82081i().mo82062d(mediaModel)) {
                mo82081i().mo82060b(mediaModel);
            } else if (mo82081i().mo82063e(mediaModel)) {
                mo82081i().mo82058a(mediaModel);
            } else {
                KeepSurfaceTextureView keepSurfaceTextureView = this.f82378f;
                if (keepSurfaceTextureView == null) {
                    C7573i.m23583a("surfaceView");
                }
                if (keepSurfaceTextureView.f83483c) {
                    C31452a i = mo82081i();
                    KeepSurfaceTextureView keepSurfaceTextureView2 = this.f82378f;
                    if (keepSurfaceTextureView2 == null) {
                        C7573i.m23583a("surfaceView");
                    }
                    Surface surface = keepSurfaceTextureView2.getSurface();
                    C7573i.m23582a((Object) surface, "surfaceView.surface");
                    i.mo82057a(surface);
                    mo82081i().mo82058a(mediaModel);
                    return;
                }
                this.f82381i = true;
                DmtStatusView dmtStatusView = this.f82383l;
                if (dmtStatusView == null) {
                    C7573i.m23583a("loadingView");
                }
                dmtStatusView.mo25942f();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ KeepSurfaceTextureView m102317a(PreviewVideoViewHolder previewVideoViewHolder) {
        KeepSurfaceTextureView keepSurfaceTextureView = previewVideoViewHolder.f82378f;
        if (keepSurfaceTextureView == null) {
            C7573i.m23583a("surfaceView");
        }
        return keepSurfaceTextureView;
    }

    /* renamed from: b */
    public static final /* synthetic */ RemoteImageView m102319b(PreviewVideoViewHolder previewVideoViewHolder) {
        RemoteImageView remoteImageView = previewVideoViewHolder.f82377e;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        return remoteImageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m102321c(PreviewVideoViewHolder previewVideoViewHolder) {
        ImageView imageView = previewVideoViewHolder.f82379g;
        if (imageView == null) {
            C7573i.m23583a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: a */
    public final void mo80308a(MediaModel mediaModel) {
        C7573i.m23587b(mediaModel, "data");
        if (mediaModel != this.f82367b && mediaModel.isVideo()) {
            mediaModel.accurateSize(false, new C31462c(this, mediaModel));
        }
    }

    /* renamed from: a */
    public final void mo82078a(String str) {
        C10761a.m31396b(C6399b.m19921a(), str, 0).mo25750a();
        mo82083k();
    }

    /* renamed from: a */
    public final void mo82079a(boolean z) {
        DmtStatusView dmtStatusView = this.f82383l;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingView");
        }
        dmtStatusView.mo25939d();
        RemoteImageView remoteImageView = this.f82377e;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        remoteImageView.setVisibility(8);
        m102320b(z);
    }

    /* renamed from: b */
    private final void m102320b(boolean z) {
        if (z) {
            ImageView imageView = this.f82379g;
            if (imageView == null) {
                C7573i.m23583a("ivPlay");
            }
            if (imageView.getVisibility() == 0) {
                ImageView imageView2 = this.f82379g;
                if (imageView2 == null) {
                    C7573i.m23583a("ivPlay");
                }
                imageView2.animate().alpha(0.0f).setDuration(100).withEndAction(new C31463d(this)).start();
                return;
            }
        }
        if (!z) {
            ImageView imageView3 = this.f82379g;
            if (imageView3 == null) {
                C7573i.m23583a("ivPlay");
            }
            if (imageView3.getVisibility() == 8) {
                ImageView imageView4 = this.f82379g;
                if (imageView4 == null) {
                    C7573i.m23583a("ivPlay");
                }
                imageView4.setVisibility(0);
                ImageView imageView5 = this.f82379g;
                if (imageView5 == null) {
                    C7573i.m23583a("ivPlay");
                }
                imageView5.setScaleX(2.5f);
                ImageView imageView6 = this.f82379g;
                if (imageView6 == null) {
                    C7573i.m23583a("ivPlay");
                }
                imageView6.setScaleY(2.5f);
                ImageView imageView7 = this.f82379g;
                if (imageView7 == null) {
                    C7573i.m23583a("ivPlay");
                }
                imageView7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            }
        }
    }

    public PreviewVideoViewHolder(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaPreviewViewModel, "viewModel");
        super(view, mediaPreviewViewModel);
        this.f82384m = C7546e.m23569a(new C31465f(mediaPreviewViewModel));
    }
}
