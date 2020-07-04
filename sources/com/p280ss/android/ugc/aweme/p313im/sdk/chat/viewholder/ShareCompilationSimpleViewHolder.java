package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31916o;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareCompilationSimpleViewHolder */
public class ShareCompilationSimpleViewHolder extends BaseViewHolder<ShareCompilationContent> {

    /* renamed from: m */
    private RemoteImageView f81327m;

    /* renamed from: n */
    private DmtTextView f81328n;

    /* renamed from: o */
    private DmtTextView f81329o;

    /* renamed from: p */
    private DmtTextView f81330p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = (View) mo81425a((int) R.id.a1q);
        Object a = mo81425a((int) R.id.axp);
        C7573i.m23582a(a, "bindView(R.id.icon_iv)");
        this.f81327m = (RemoteImageView) a;
        Object a2 = mo81425a((int) R.id.dkn);
        C7573i.m23582a(a2, "bindView(R.id.title_tv)");
        this.f81328n = (DmtTextView) a2;
        Object a3 = mo81425a((int) R.id.a7k);
        C7573i.m23582a(a3, "bindView(R.id.desc_tv)");
        this.f81329o = (DmtTextView) a3;
        Object a4 = mo81425a((int) R.id.dga);
        C7573i.m23582a(a4, "bindView(R.id.tag_tv)");
        this.f81330p = (DmtTextView) a4;
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "onClickListener");
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo81426a(OnLongClickListener onLongClickListener) {
        C7573i.m23587b(onLongClickListener, "onLongClickListener");
        this.f81197e.setOnLongClickListener(onLongClickListener);
    }

    public ShareCompilationSimpleViewHolder(View view, int i) {
        C7573i.m23587b(view, "itemView");
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, ShareCompilationContent shareCompilationContent, int i) {
        long j;
        super.mo81421a(message, message2, shareCompilationContent, i);
        if (shareCompilationContent != null) {
            DmtTextView dmtTextView = this.f81328n;
            if (dmtTextView == null) {
                C7573i.m23583a("titleView");
            }
            dmtTextView.setText(shareCompilationContent.getTitle());
            DmtTextView dmtTextView2 = this.f81329o;
            if (dmtTextView2 == null) {
                C7573i.m23583a("descView");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f81329o;
            if (dmtTextView3 == null) {
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
            dmtTextView3.setText(resources.getString(R.string.aeu, objArr));
            RemoteImageView remoteImageView = this.f81327m;
            if (remoteImageView == null) {
                C7573i.m23583a("iconView");
            }
            C31932z.m103703a(remoteImageView, shareCompilationContent.getCover(), (int) R.drawable.bj2, (int) R.drawable.bj2);
        }
        DmtTextView dmtTextView4 = this.f81330p;
        if (dmtTextView4 == null) {
            C7573i.m23583a("tagView");
        }
        dmtTextView4.setText(R.string.af8);
        this.f81197e.setTag(50331648, Integer.valueOf(38));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
