package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareCompilationViewHolder */
public class ShareCompilationViewHolder extends BaseViewHolder<ShareCompilationContent> {

    /* renamed from: m */
    private RemoteImageView f81331m;

    /* renamed from: n */
    private DmtTextView f81332n;

    /* renamed from: o */
    private DmtTextView f81333o;

    /* renamed from: p */
    private RemoteImageView f81334p;

    /* renamed from: q */
    private RemoteImageView f81335q;

    /* renamed from: r */
    private RemoteImageView f81336r;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = (View) mo81425a((int) R.id.a1q);
        Object a = mo81425a((int) R.id.axp);
        C7573i.m23582a(a, "bindView(R.id.icon_iv)");
        this.f81331m = (RemoteImageView) a;
        Object a2 = mo81425a((int) R.id.dkn);
        C7573i.m23582a(a2, "bindView(R.id.title_tv)");
        this.f81332n = (DmtTextView) a2;
        Object a3 = mo81425a((int) R.id.a7k);
        C7573i.m23582a(a3, "bindView(R.id.desc_tv)");
        this.f81333o = (DmtTextView) a3;
        Object a4 = mo81425a((int) R.id.ayo);
        C7573i.m23582a(a4, "bindView(R.id.img1)");
        this.f81334p = (RemoteImageView) a4;
        Object a5 = mo81425a((int) R.id.ayp);
        C7573i.m23582a(a5, "bindView(R.id.img2)");
        this.f81335q = (RemoteImageView) a5;
        Object a6 = mo81425a((int) R.id.ayq);
        C7573i.m23582a(a6, "bindView(R.id.img3)");
        this.f81336r = (RemoteImageView) a6;
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo81426a(OnLongClickListener onLongClickListener) {
        super.mo81426a(onLongClickListener);
        this.f81197e.setOnLongClickListener(onLongClickListener);
    }

    public ShareCompilationViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareCompilationContent shareCompilationContent, int i) {
        long j;
        boolean z;
        boolean z2;
        super.mo81421a(message, message2, shareCompilationContent, i);
        if (shareCompilationContent != null) {
            DmtTextView dmtTextView = this.f81332n;
            if (dmtTextView == null) {
                C7573i.m23583a("titleView");
            }
            dmtTextView.setText(shareCompilationContent.getTitle());
            DmtTextView dmtTextView2 = this.f81333o;
            if (dmtTextView2 == null) {
                C7573i.m23583a("descView");
            }
            View view = this.itemView;
            C7573i.m23582a((Object) view, "itemView");
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "itemView.context");
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            Long viewCount = shareCompilationContent.getViewCount();
            if (viewCount != null) {
                j = viewCount.longValue();
            } else {
                j = 0;
            }
            objArr[0] = C31916o.m103674a(j);
            dmtTextView2.setText(resources.getString(R.string.aeu, objArr));
            DmtTextView dmtTextView3 = this.f81333o;
            if (dmtTextView3 == null) {
                C7573i.m23583a("descView");
            }
            dmtTextView3.setVisibility(0);
            List awemeCoverList = shareCompilationContent.getAwemeCoverList();
            if (awemeCoverList != null) {
                Collection collection = awemeCoverList;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || awemeCoverList.size() < 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    awemeCoverList = null;
                }
                if (awemeCoverList != null) {
                    RemoteImageView remoteImageView = this.f81334p;
                    if (remoteImageView == null) {
                        C7573i.m23583a("coverFirstView");
                    }
                    C23323e.m76524b(remoteImageView, (UrlModel) awemeCoverList.get(0));
                    RemoteImageView remoteImageView2 = this.f81335q;
                    if (remoteImageView2 == null) {
                        C7573i.m23583a("coverSecondView");
                    }
                    C23323e.m76524b(remoteImageView2, (UrlModel) awemeCoverList.get(1));
                    RemoteImageView remoteImageView3 = this.f81336r;
                    if (remoteImageView3 == null) {
                        C7573i.m23583a("coverThirdView");
                    }
                    C23323e.m76524b(remoteImageView3, (UrlModel) awemeCoverList.get(2));
                }
            }
            RemoteImageView remoteImageView4 = this.f81331m;
            if (remoteImageView4 == null) {
                C7573i.m23583a("iconView");
            }
            C23323e.m76503a(remoteImageView4, (int) R.drawable.b6i);
        }
        this.f81197e.setTag(50331648, Integer.valueOf(38));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
