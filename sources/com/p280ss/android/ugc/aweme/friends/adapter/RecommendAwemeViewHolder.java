package com.p280ss.android.ugc.aweme.friends.adapter;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.profile.model.RecommendAwemeItem;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder */
public class RecommendAwemeViewHolder extends AnimatedViewHolder<RecommendAwemeItem> {

    /* renamed from: a */
    public C30016a f78934a;

    /* renamed from: b */
    private ImageView f78935b;

    /* renamed from: c */
    private int f78936c;

    /* renamed from: com.ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder$a */
    public interface C30016a {
        /* renamed from: a_ */
        void mo76228a_(String str, int i);
    }

    public final void bB_() {
        if (mo66498g() && m84284a(((RecommendAwemeItem) this.f67534h).getDynamicCover())) {
            this.f67536j = true;
            C12133n.m35299a(C23400r.m76741a(((RecommendAwemeItem) this.f67534h).getDynamicCover())).mo29844a((C12128i) this.f67535i).mo29845a("RecommendAwemeViewHolder").mo29852b(true).mo29849a((C12112j) new C12105c() {
                /* renamed from: a */
                public final void mo29812a(Uri uri, View view, Throwable th) {
                }

                /* renamed from: a */
                public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
                    RecommendAwemeViewHolder.this.f67535i.setUserVisibleHint(true);
                    RecommendAwemeViewHolder.this.f67535i.mo29861b();
                }
            });
        } else if (((RecommendAwemeItem) this.f67534h).getCover() == null || ((RecommendAwemeItem) this.f67534h).getCover().getUrlList() == null || ((RecommendAwemeItem) this.f67534h).getCover().getUrlList().size() == 0 || TextUtils.isEmpty((CharSequence) ((RecommendAwemeItem) this.f67534h).getCover().getUrlList().get(0))) {
            this.f67535i.setImageResource(R.color.a5q);
        } else {
            C12133n.m35299a(C23400r.m76741a(((RecommendAwemeItem) this.f67534h).getCover())).mo29844a((C12128i) this.f67535i).mo29845a("RecommendAwemeViewHolder").mo29836a(this.f78936c, this.f78936c).mo29848a();
        }
    }

    RecommendAwemeViewHolder(View view) {
        super(view);
        this.f67535i = (SmartImageView) view.findViewById(R.id.az2);
        this.f78935b = (ImageView) view.findViewById(R.id.azp);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo76225a(int i) {
        this.f78936c = i;
        if (this.f78936c > 0) {
            LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.width = this.f78936c;
            layoutParams.height = this.f78936c;
            this.itemView.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76226a(int i, View view) {
        if (this.f67534h != null && !TextUtils.isEmpty(((RecommendAwemeItem) this.f67534h).getAid()) && this.f78934a != null) {
            this.f78934a.mo76228a_(((RecommendAwemeItem) this.f67534h).getAid(), i);
        }
    }

    /* renamed from: a */
    public final void mo66491a(RecommendAwemeItem recommendAwemeItem, int i) {
        int i2;
        if (recommendAwemeItem != null) {
            this.f67534h = recommendAwemeItem;
            ImageView imageView = this.f78935b;
            if (TextUtils.equals(recommendAwemeItem.getMediaType(), "2")) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            bB_();
            ((C13438a) this.f67535i.getHierarchy()).mo32897a(RoundingParams.m39399b((float) C23486n.m77122a(2.0d)));
            if (VERSION.SDK_INT >= 21) {
                this.f67535i.setOutlineProvider(new C43070ds(C23486n.m77122a(2.0d)));
                this.f67535i.setClipToOutline(true);
            }
            this.f67535i.setOnClickListener(new C30028g(this, i));
        }
    }
}
