package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewholder;

import android.arch.lifecycle.C0053p;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1331b.C31393a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1328a.C31342b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.C31448a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.model.MediaPreviewSettings;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.preview.p1334b.C31454b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.MediaChooseViewHolder */
public class MediaChooseViewHolder extends BaseViewHolder<MediaModel> {

    /* renamed from: b */
    private final C0053p<List<MediaModel>> f82267b = new C31413c(this);

    /* renamed from: c */
    protected RemoteImageView f82268c;

    /* renamed from: d */
    public View f82269d;

    /* renamed from: e */
    public View f82270e;

    /* renamed from: f */
    public ImageView f82271f;

    /* renamed from: g */
    public DmtTextView f82272g;

    /* renamed from: h */
    public MediaModel f82273h;

    /* renamed from: i */
    public boolean f82274i;

    /* renamed from: j */
    public final MediaChooseViewModel f82275j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.MediaChooseViewHolder$a */
    static final class C31411a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewHolder f82276a;

        C31411a(MediaChooseViewHolder mediaChooseViewHolder) {
            this.f82276a = mediaChooseViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f82276a.mo81992j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.MediaChooseViewHolder$b */
    static final class C31412b extends Lambda implements C7562b<View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewHolder f82277a;

        C31412b(MediaChooseViewHolder mediaChooseViewHolder) {
            this.f82277a = mediaChooseViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102205a((View) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102205a(View view) {
            C7573i.m23587b(view, "it");
            this.f82277a.mo81993k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.MediaChooseViewHolder$c */
    static final class C31413c<T> implements C0053p<List<MediaModel>> {

        /* renamed from: a */
        final /* synthetic */ MediaChooseViewHolder f82278a;

        C31413c(MediaChooseViewHolder mediaChooseViewHolder) {
            this.f82278a = mediaChooseViewHolder;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<MediaModel> list) {
            MediaChooseViewHolder mediaChooseViewHolder = this.f82278a;
            if (this.f82278a.f82274i) {
                mediaChooseViewHolder = null;
            }
            if (mediaChooseViewHolder != null) {
                mediaChooseViewHolder.mo81991i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.viewholder.MediaChooseViewHolder$d */
    static final class C31414d extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f82279a;

        /* renamed from: b */
        final /* synthetic */ MediaChooseViewHolder f82280b;

        C31414d(boolean z, MediaChooseViewHolder mediaChooseViewHolder) {
            this.f82279a = z;
            this.f82280b = mediaChooseViewHolder;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102207a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102207a(int i) {
            if (!this.f82279a || i > 0) {
                C31393a.m102160a(this.f82280b.mo81988f(), MediaChooseViewHolder.m102191a(this.f82280b), MediaChooseViewHolder.m102193b(this.f82280b), MediaChooseViewHolder.m102194c(this.f82280b), MediaChooseViewHolder.m102195d(this.f82280b), i);
            }
            this.f82280b.f82274i = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final RemoteImageView mo81988f() {
        RemoteImageView remoteImageView = this.f82268c;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        return remoteImageView;
    }

    /* renamed from: h */
    public final void mo81990h() {
        this.f82275j.mo82000b().removeObserver(this.f82267b);
    }

    /* renamed from: g */
    public final void mo81989g() {
        FragmentActivity d = mo80312d();
        if (d != null) {
            this.f82275j.mo82000b().observe(d, this.f82267b);
        }
        mo81991i();
    }

    /* renamed from: j */
    public final void mo81992j() {
        MediaModel mediaModel = this.f82273h;
        if (mediaModel != null) {
            this.f82274i = true;
            boolean a = true ^ this.f82275j.mo81998a(mediaModel);
            this.f82275j.mo81997a(mediaModel, a, new C31414d(a, this));
        }
    }

    /* renamed from: c */
    public final void mo80311c() {
        View view = this.f82270e;
        if (view == null) {
            C7573i.m23583a("layoutSelect");
        }
        view.setOnClickListener(new C31411a(this));
        RemoteImageView remoteImageView = this.f82268c;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        C31342b.m102053a(remoteImageView, new C31412b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo81993k() {
        List list;
        FragmentActivity d = mo80312d();
        if (d != null) {
            MediaPreviewSettings mediaPreviewSettings = new MediaPreviewSettings(1, this.f82275j.f82289d);
            MediaChooseViewModel mediaChooseViewModel = this.f82275j;
            C31403a aVar = (C31403a) mediaChooseViewModel.mo82001c().getValue();
            if (aVar != null) {
                list = aVar.mo81983e();
            } else {
                list = null;
            }
            C31454b.m102297a(d, mediaPreviewSettings, new C31448a(list, this.f82273h, (List) mediaChooseViewModel.mo82000b().getValue()), AdError.CACHE_ERROR_CODE);
        }
    }

    /* renamed from: b */
    public void mo80310b() {
        Object a = mo80306a((int) R.id.b7x);
        C7573i.m23582a(a, "findViewById(R.id.iv_cover)");
        this.f82268c = (RemoteImageView) a;
        Object a2 = mo80306a((int) R.id.ba3);
        C7573i.m23582a(a2, "findViewById(R.id.iv_mask)");
        this.f82269d = (View) a2;
        Object a3 = mo80306a((int) R.id.bjo);
        C7573i.m23582a(a3, "findViewById(R.id.layout_select)");
        this.f82270e = (View) a3;
        Object a4 = mo80306a((int) R.id.bc0);
        C7573i.m23582a(a4, "findViewById(R.id.iv_select)");
        this.f82271f = (ImageView) a4;
        Object a5 = mo80306a((int) R.id.e1l);
        C7573i.m23582a(a5, "findViewById(R.id.tv_select)");
        this.f82272g = (DmtTextView) a5;
    }

    /* renamed from: i */
    public final void mo81991i() {
        MediaModel mediaModel = this.f82273h;
        if (mediaModel != null) {
            int i = -1;
            if (this.f82275j.mo81999b(mediaModel) < 0) {
                RemoteImageView remoteImageView = this.f82268c;
                if (remoteImageView == null) {
                    C7573i.m23583a("ivCover");
                }
                View view = remoteImageView;
                View view2 = this.f82269d;
                if (view2 == null) {
                    C7573i.m23583a("ivMask");
                }
                ImageView imageView = this.f82271f;
                if (imageView == null) {
                    C7573i.m23583a("ivSelect");
                }
                DmtTextView dmtTextView = this.f82272g;
                if (dmtTextView == null) {
                    C7573i.m23583a("tvSelect");
                }
                C31393a.m102162a(view, view2, imageView, dmtTextView, -1);
                View view3 = this.f82269d;
                if (view3 == null) {
                    C7573i.m23583a("ivMask");
                }
                view3.setBackgroundResource(R.color.a6h);
                View view4 = this.f82269d;
                if (view4 == null) {
                    C7573i.m23583a("ivMask");
                }
                view4.setAlpha(1.0f);
                View view5 = this.f82269d;
                if (view5 == null) {
                    C7573i.m23583a("ivMask");
                }
                view5.setVisibility(0);
                return;
            }
            List list = (List) this.f82275j.mo82000b().getValue();
            if (list == null) {
                list = new ArrayList();
            }
            C7573i.m23582a((Object) list, "viewModel.selectedMediaL….value ?: mutableListOf()");
            if (!list.contains(mediaModel)) {
                list = null;
            }
            if (list != null) {
                i = list.indexOf(mediaModel) + 1;
            }
            RemoteImageView remoteImageView2 = this.f82268c;
            if (remoteImageView2 == null) {
                C7573i.m23583a("ivCover");
            }
            View view6 = remoteImageView2;
            View view7 = this.f82269d;
            if (view7 == null) {
                C7573i.m23583a("ivMask");
            }
            ImageView imageView2 = this.f82271f;
            if (imageView2 == null) {
                C7573i.m23583a("ivSelect");
            }
            DmtTextView dmtTextView2 = this.f82272g;
            if (dmtTextView2 == null) {
                C7573i.m23583a("tvSelect");
            }
            C31393a.m102162a(view6, view7, imageView2, dmtTextView2, i);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m102191a(MediaChooseViewHolder mediaChooseViewHolder) {
        View view = mediaChooseViewHolder.f82269d;
        if (view == null) {
            C7573i.m23583a("ivMask");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m102193b(MediaChooseViewHolder mediaChooseViewHolder) {
        View view = mediaChooseViewHolder.f82270e;
        if (view == null) {
            C7573i.m23583a("layoutSelect");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m102194c(MediaChooseViewHolder mediaChooseViewHolder) {
        ImageView imageView = mediaChooseViewHolder.f82271f;
        if (imageView == null) {
            C7573i.m23583a("ivSelect");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ DmtTextView m102195d(MediaChooseViewHolder mediaChooseViewHolder) {
        DmtTextView dmtTextView = mediaChooseViewHolder.f82272g;
        if (dmtTextView == null) {
            C7573i.m23583a("tvSelect");
        }
        return dmtTextView;
    }

    public MediaChooseViewHolder(View view, MediaChooseViewModel mediaChooseViewModel) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(mediaChooseViewModel, "viewModel");
        super(view);
        this.f82275j = mediaChooseViewModel;
    }

    /* renamed from: a */
    private final void m102192a(int i, int i2) {
        RemoteImageView remoteImageView = this.f82268c;
        if (remoteImageView == null) {
            C7573i.m23583a("ivCover");
        }
        if (remoteImageView.getWidth() == i) {
            RemoteImageView remoteImageView2 = this.f82268c;
            if (remoteImageView2 == null) {
                C7573i.m23583a("ivCover");
            }
            if (remoteImageView2.getHeight() == i2) {
                return;
            }
        }
        RemoteImageView remoteImageView3 = this.f82268c;
        if (remoteImageView3 == null) {
            C7573i.m23583a("ivCover");
        }
        LayoutParams layoutParams = remoteImageView3.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        RemoteImageView remoteImageView4 = this.f82268c;
        if (remoteImageView4 == null) {
            C7573i.m23583a("ivCover");
        }
        remoteImageView4.setLayoutParams(layoutParams);
        View view = this.f82269d;
        if (view == null) {
            C7573i.m23583a("ivMask");
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public void mo81985a(MediaModel mediaModel, int i, int i2) {
        C7573i.m23587b(mediaModel, "data");
        this.f82273h = mediaModel;
        m102192a(i, i2);
        mo81991i();
    }
}
