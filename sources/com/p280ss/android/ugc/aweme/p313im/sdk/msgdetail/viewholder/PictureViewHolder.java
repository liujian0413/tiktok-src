package com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder;

import android.content.DialogInterface;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.image.p878a.C19581a;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo.C30898i;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.p1342a.C31547a;
import com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewmodel.C31583a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.RelationSelectActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31923x;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31923x.C31928a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.photodraweeview.PhotoDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder */
public final class PictureViewHolder extends AbsMediaViewHolder {

    /* renamed from: i */
    public static final C31556a f82603i = new C31556a(null);

    /* renamed from: g */
    public PhotoDraweeView f82604g;

    /* renamed from: h */
    public DmtStatusView f82605h;

    /* renamed from: j */
    private View f82606j;

    /* renamed from: k */
    private View f82607k;

    /* renamed from: l */
    private UrlModel f82608l;

    /* renamed from: m */
    private final C31557b f82609m = new C31557b(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$a */
    public static final class C31556a {
        private C31556a() {
        }

        public /* synthetic */ C31556a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static PictureViewHolder m102604a(ViewGroup viewGroup, RecyclerView recyclerView) {
            C7573i.m23587b(viewGroup, "parent");
            C7573i.m23587b(recyclerView, "recyclerView");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xl, viewGroup, false);
            C7573i.m23582a((Object) inflate, "itemView");
            return new PictureViewHolder(inflate, recyclerView);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$b */
    public static final class C31557b extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82610a;

        C31557b(PictureViewHolder pictureViewHolder) {
            this.f82610a = pictureViewHolder;
        }

        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            PictureViewHolder.m102594b(this.f82610a).mo25939d();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            if (fVar != null) {
                PictureViewHolder.m102591a(this.f82610a).mo82925a(fVar.getWidth(), fVar.getHeight());
                PictureViewHolder.m102594b(this.f82610a).mo25939d();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$c */
    static final class C31558c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82611a;

        C31558c(PictureViewHolder pictureViewHolder) {
            this.f82611a = pictureViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82611a.mo82290l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$d */
    static final class C31559d implements C19581a {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82612a;

        C31559d(PictureViewHolder pictureViewHolder) {
            this.f82612a = pictureViewHolder;
        }

        /* renamed from: a */
        public final void mo51756a(View view, float f, float f2) {
            this.f82612a.mo82281c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$e */
    static final class C31560e implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82613a;

        C31560e(PictureViewHolder pictureViewHolder) {
            this.f82613a = pictureViewHolder;
        }

        public final boolean onLongClick(View view) {
            return this.f82613a.mo82288j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$f */
    static final class C31561f implements OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82614a;

        C31561f(PictureViewHolder pictureViewHolder) {
            this.f82614a = pictureViewHolder;
        }

        public final boolean onLongClick(View view) {
            return this.f82614a.mo82288j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$g */
    static final class C31562g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82615a;

        C31562g(PictureViewHolder pictureViewHolder) {
            this.f82615a = pictureViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82615a.mo82281c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$h */
    static final class C31563h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ UrlModel f82616a;

        C31563h(UrlModel urlModel) {
            this.f82616a = urlModel;
        }

        public final /* synthetic */ Object call() {
            m102607a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102607a() {
            C31923x.m103683a(this.f82616a, new C31928a() {
                /* renamed from: b */
                public final void mo80757b() {
                    C9738o.m28693a(C6399b.m19921a(), (int) R.string.bor);
                }

                /* renamed from: a */
                public final void mo80756a() {
                    C9738o.m28693a(C6399b.m19921a(), (int) R.string.bot);
                    C31858ad.m103406a();
                    C31858ad.m103470f();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$i */
    static final class C31565i<T> implements C6892b<Boolean> {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82617a;

        /* renamed from: b */
        final /* synthetic */ UrlModel f82618b;

        C31565i(PictureViewHolder pictureViewHolder, UrlModel urlModel) {
            this.f82617a = pictureViewHolder;
            this.f82618b = urlModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void run(Boolean bool) {
            if (bool == null) {
                C7573i.m23580a();
            }
            if (bool.booleanValue()) {
                PictureViewHolder.m102592a(this.f82618b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$j */
    static final class C31566j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82619a;

        C31566j(PictureViewHolder pictureViewHolder) {
            this.f82619a = pictureViewHolder;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f82619a.mo82289k();
                return;
            }
            if (i == 1) {
                this.f82619a.mo82290l();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.viewholder.PictureViewHolder$k */
    static final class C31567k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PictureViewHolder f82620a;

        C31567k(PictureViewHolder pictureViewHolder) {
            this.f82620a = pictureViewHolder;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f82620a.mo82290l();
            }
        }
    }

    /* renamed from: d */
    public final boolean mo82282d() {
        PhotoDraweeView photoDraweeView = this.f82604g;
        if (photoDraweeView == null) {
            C7573i.m23583a("pictureIv");
        }
        return photoDraweeView.mo82926a();
    }

    /* renamed from: e */
    public final boolean mo82283e() {
        PhotoDraweeView photoDraweeView = this.f82604g;
        if (photoDraweeView == null) {
            C7573i.m23583a("pictureIv");
        }
        return photoDraweeView.mo82927b();
    }

    /* renamed from: l */
    public final void mo82290l() {
        UrlModel urlModel = this.f82608l;
        if (urlModel != null) {
            C30898i.m100632a().mo80818a(mo82280b(), new C31565i(this, urlModel));
        }
    }

    /* renamed from: m */
    private final void m102595m() {
        boolean z;
        String str;
        UrlModel urlModel = this.f82608l;
        if (urlModel != null) {
            Collection urlList = urlModel.getUrlList();
            boolean z2 = true;
            if (urlList == null || urlList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List urlList2 = urlModel.getUrlList();
                if (urlList2 == null) {
                    C7573i.m23580a();
                }
                str = (String) urlList2.get(0);
            } else {
                str = urlModel.getUri();
            }
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                z2 = false;
            }
            if (!z2) {
                C13382e a = C13380c.m39166a();
                a.mo32711a(str);
                C7573i.m23582a((Object) a, "controllerBuilder");
                PhotoDraweeView photoDraweeView = this.f82604g;
                if (photoDraweeView == null) {
                    C7573i.m23583a("pictureIv");
                }
                a.mo32729b(photoDraweeView.getController());
                a.mo32743a((C13401d<? super INFO>) this.f82609m);
                PhotoDraweeView photoDraweeView2 = this.f82604g;
                if (photoDraweeView2 == null) {
                    C7573i.m23583a("pictureIv");
                }
                photoDraweeView2.setController(a.mo32730f());
            }
        }
    }

    /* renamed from: j */
    public final boolean mo82288j() {
        if (!this.f82599d.mo82317a()) {
            return false;
        }
        C31547a<BaseContent> aVar = this.f82600e;
        if (aVar != null) {
            BaseContent baseContent = (BaseContent) aVar.f82581a;
            if (baseContent != null) {
                C31547a<BaseContent> aVar2 = this.f82600e;
                if (aVar2 != null) {
                    Message message = aVar2.f82582b;
                    if (message != null) {
                        C25712a aVar3 = new C25712a(mo82275a());
                        if ((baseContent instanceof OnlyPictureContent) || message.isSelf()) {
                            aVar3.mo66614a((CharSequence[]) new String[]{mo82275a().getString(R.string.bq6), mo82275a().getString(R.string.bos)}, (DialogInterface.OnClickListener) new C31566j(this));
                        } else {
                            aVar3.mo66614a((CharSequence[]) new String[]{mo82275a().getString(R.string.bos)}, (DialogInterface.OnClickListener) new C31567k(this));
                        }
                        aVar3.mo66615b();
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final void mo82289k() {
        Bundle bundle = new Bundle();
        C31547a<BaseContent> aVar = this.f82600e;
        if (aVar != null) {
            BaseContent baseContent = (BaseContent) aVar.f82581a;
            if (baseContent != null) {
                if (baseContent instanceof StoryPictureContent) {
                    bundle.putParcelable("share_package", baseContent.generateSharePackage());
                    bundle.putSerializable("share_content", baseContent);
                } else if (baseContent instanceof OnlyPictureContent) {
                    bundle.putParcelable("share_package", baseContent.generateSharePackage());
                    bundle.putSerializable("share_content", baseContent);
                }
                RelationSelectActivity.m21881a(mo82275a(), bundle, null);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PhotoDraweeView m102591a(PictureViewHolder pictureViewHolder) {
        PhotoDraweeView photoDraweeView = pictureViewHolder.f82604g;
        if (photoDraweeView == null) {
            C7573i.m23583a("pictureIv");
        }
        return photoDraweeView;
    }

    /* renamed from: b */
    public static final /* synthetic */ DmtStatusView m102594b(PictureViewHolder pictureViewHolder) {
        DmtStatusView dmtStatusView = pictureViewHolder.f82605h;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingStatusView");
        }
        return dmtStatusView;
    }

    /* renamed from: a */
    public static void m102592a(UrlModel urlModel) {
        C1592h.m7853a((Callable<TResult>) new C31563h<TResult>(urlModel));
    }

    /* renamed from: a */
    public final void mo82279a(C31583a aVar) {
        C7573i.m23587b(aVar, "dragState");
        super.mo82279a(aVar);
        if (aVar.mo82317a()) {
            PhotoDraweeView photoDraweeView = this.f82604g;
            if (photoDraweeView == null) {
                C7573i.m23583a("pictureIv");
            }
            photoDraweeView.setScaleType(ScaleType.CENTER_CROP);
            View view = this.f82607k;
            if (view == null) {
                C7573i.m23583a("saveLayout");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f82607k;
        if (view2 == null) {
            C7573i.m23583a("saveLayout");
        }
        view2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo82277a(View view) {
        C7573i.m23587b(view, "itemView");
        super.mo82277a(view);
        this.f82606j = mo82276a((int) R.id.bjh);
        this.f82607k = mo82276a((int) R.id.bjk);
        this.f82604g = (PhotoDraweeView) mo82276a((int) R.id.cbm);
        this.f82605h = (DmtStatusView) mo82276a((int) R.id.dav);
        View view2 = this.f82607k;
        if (view2 == null) {
            C7573i.m23583a("saveLayout");
        }
        view2.setOnClickListener(new C31558c(this));
        PhotoDraweeView photoDraweeView = this.f82604g;
        if (photoDraweeView == null) {
            C7573i.m23583a("pictureIv");
        }
        photoDraweeView.setOnPhotoTapListener(new C31559d(this));
        PhotoDraweeView photoDraweeView2 = this.f82604g;
        if (photoDraweeView2 == null) {
            C7573i.m23583a("pictureIv");
        }
        photoDraweeView2.setOnLongClickListener(new C31560e(this));
        View view3 = this.f82606j;
        if (view3 == null) {
            C7573i.m23583a("rootLayout");
        }
        view3.setOnLongClickListener(new C31561f(this));
        View view4 = this.f82606j;
        if (view4 == null) {
            C7573i.m23583a("rootLayout");
        }
        view4.setOnClickListener(new C31562g(this));
        DmtStatusView dmtStatusView = this.f82605h;
        if (dmtStatusView == null) {
            C7573i.m23583a("loadingStatusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(mo82275a()));
    }

    /* renamed from: a */
    public final void mo82278a(C31547a<BaseContent> aVar) {
        C7573i.m23587b(aVar, "data");
        if (this.f82600e != aVar) {
            super.mo82278a(aVar);
            BaseContent baseContent = (BaseContent) aVar.f82581a;
            if (baseContent instanceof StoryPictureContent) {
                StoryPictureContent storyPictureContent = (StoryPictureContent) baseContent;
                m102593a(storyPictureContent.getUrl(), storyPictureContent.getPicturePath(), storyPictureContent.getWidth(), storyPictureContent.getHeight());
            } else if (baseContent instanceof OnlyPictureContent) {
                OnlyPictureContent onlyPictureContent = (OnlyPictureContent) baseContent;
                m102593a(onlyPictureContent.getUrl(), onlyPictureContent.getPicturePath(), onlyPictureContent.getWidth(), onlyPictureContent.getHeight());
            }
            m102595m();
            DmtStatusView dmtStatusView = this.f82605h;
            if (dmtStatusView == null) {
                C7573i.m23583a("loadingStatusView");
            }
            dmtStatusView.mo25942f();
            View view = this.f82607k;
            if (view == null) {
                C7573i.m23583a("saveLayout");
            }
            view.setVisibility(0);
        }
    }

    public PictureViewHolder(View view, RecyclerView recyclerView) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(recyclerView, "_recyclerView");
        super(view, recyclerView);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r0 == false) goto L_0x0022;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m102593a(com.p280ss.android.ugc.aweme.base.model.UrlModel r3, java.lang.String r4, int r5, int r6) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0025
            java.lang.String r0 = r3.getUri()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = r3.getUrlList()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            r2.f82608l = r3
            return
        L_0x0025:
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r3.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "file://"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.setUri(r4)
            r3.setWidth(r5)
            r3.setHeight(r6)
            r2.f82608l = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.msgdetail.viewholder.PictureViewHolder.m102593a(com.ss.android.ugc.aweme.base.model.UrlModel, java.lang.String, int, int):void");
    }
}
