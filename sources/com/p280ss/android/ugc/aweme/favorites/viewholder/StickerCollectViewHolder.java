package com.p280ss.android.ugc.aweme.favorites.viewholder;

import android.support.p029v7.widget.AppCompatImageView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.google.common.collect.C17795bu;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27752a.C27753a;
import com.p280ss.android.ugc.aweme.favorites.p1214e.C27754b;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.share.C38275x;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42939as;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.StickerCollectViewHolder */
public class StickerCollectViewHolder extends C1293v implements C27753a {

    /* renamed from: a */
    public View f73384a;

    /* renamed from: b */
    public C38275x f73385b;

    /* renamed from: c */
    private NewFaceStickerBean f73386c;
    RemoteImageView ivCover;
    AppCompatImageView ivRecord;
    DmtTextView tvDesigner;
    DmtTextView tvStickerName;
    DmtTextView tvUserCount;

    /* renamed from: a */
    public final void mo71237a() {
        if (this.f73386c != null) {
            C27752a.m90985d(1, this.f73386c.f108868id);
        }
    }

    public StickerCollectViewHolder(View view) {
        super(view);
        this.f73384a = view;
        ButterKnife.bind((Object) this, view);
        this.tvStickerName.setFontType(C10834d.f29332b);
    }

    /* renamed from: b */
    private void m91241b(final NewFaceStickerBean newFaceStickerBean) {
        this.f73384a.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                C27754b.m90995a(StickerCollectViewHolder.this.f73384a.getContext(), newFaceStickerBean, "collection_prop", "");
            }
        });
        this.ivRecord.setOnClickListener(new C42939as() {
            /* renamed from: a */
            public final void mo70606a(View view) {
                FaceStickerBean.sCurPropSource = "favorite_prop";
                if (StickerCollectViewHolder.this.f73385b == null) {
                    StickerCollectViewHolder.this.f73385b = new C38275x(StickerCollectViewHolder.this.ivRecord.getContext(), "prop_page");
                    StickerCollectViewHolder.this.f73385b.mo95911a("prop_collection").f99480j = C27835c.f73396a;
                }
                if (newFaceStickerBean.children == null || newFaceStickerBean.children.isEmpty()) {
                    StickerCollectViewHolder.this.f73385b.mo95915a(C17795bu.m59146a((E[]) new String[]{newFaceStickerBean.f108868id}));
                } else {
                    StickerCollectViewHolder.this.f73385b.mo95915a((ArrayList) newFaceStickerBean.children);
                }
                C27752a.m90985d(2, newFaceStickerBean.f108868id);
            }
        });
    }

    /* renamed from: a */
    public final void mo71315a(NewFaceStickerBean newFaceStickerBean) {
        this.f73386c = newFaceStickerBean;
        this.tvStickerName.setText(newFaceStickerBean.name);
        this.tvDesigner.setText(newFaceStickerBean.ownerName);
        this.tvUserCount.setText(this.tvUserCount.getContext().getString(R.string.ci4, new Object[]{C30537o.m99738a(newFaceStickerBean.userCount)}));
        if (newFaceStickerBean.iconUrl == null || newFaceStickerBean.iconUrl.getUrlList() == null || newFaceStickerBean.iconUrl.getUrlList().isEmpty()) {
            C23323e.m76503a(this.ivCover, (int) R.drawable.b8v);
        } else {
            C23323e.m76514a(this.ivCover, (String) newFaceStickerBean.iconUrl.getUrlList().get(0));
        }
        m91241b(newFaceStickerBean);
        mo71237a();
    }
}
