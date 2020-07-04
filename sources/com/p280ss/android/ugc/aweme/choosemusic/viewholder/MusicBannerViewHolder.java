package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.graphics.Rect;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewParent;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24510b;
import com.p280ss.android.ugc.aweme.discover.model.Banner;
import com.p280ss.android.ugc.aweme.router.C37286v;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder */
public class MusicBannerViewHolder extends C1293v {

    /* renamed from: a */
    public int f63336a;

    /* renamed from: b */
    protected Banner f63337b;

    /* renamed from: c */
    private int f63338c;

    /* renamed from: d */
    private int[] f63339d = new int[2];
    SmartImageView mSdCover;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder$a */
    class C23976a implements OnAttachStateChangeListener, Runnable {

        /* renamed from: b */
        private boolean f63341b;

        /* renamed from: a */
        private void m78675a() {
            this.f63341b = false;
            MusicBannerViewHolder.this.itemView.removeCallbacks(this);
        }

        public final void run() {
            boolean z;
            Banner banner = MusicBannerViewHolder.this.f63337b;
            Rect rect = new Rect();
            if (!MusicBannerViewHolder.m78672a(MusicBannerViewHolder.this.itemView) || !MusicBannerViewHolder.this.itemView.getGlobalVisibleRect(rect) || rect.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (banner != null) {
                if (z && !this.f63341b) {
                    C23888c.m78205c(MusicBannerViewHolder.this.f63337b.getBid(), MusicBannerViewHolder.this.f63336a);
                }
                this.f63341b = z;
            }
            MusicBannerViewHolder.this.itemView.postDelayed(this, 250);
        }

        public final void onViewDetachedFromWindow(View view) {
            m78675a();
        }

        private C23976a() {
        }

        public final void onViewAttachedToWindow(View view) {
            m78675a();
            run();
        }
    }

    public void clickCover() {
        String str;
        if (this.f63337b != null && !TextUtils.isEmpty(this.f63337b.getSchema())) {
            String schema = this.f63337b.getSchema();
            if (schema == null || !schema.startsWith("aweme://assmusic/category/")) {
                SmartRouter.buildRoute(this.itemView.getContext(), this.f63337b.getSchema()).open(10086);
                List a = C37286v.m119757a(this.f63337b.getSchema());
                if (!C6307b.m19566a((Collection<T>) a) && a.size() > 1) {
                    C23888c.m78186a(new C23819a("change_music_page", "", "click_banner", C23888c.m78180a()), (String) a.get(1), true);
                }
            } else {
                if (!schema.contains("?")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(schema);
                    sb.append("?musicType=");
                    sb.append(this.f63338c);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(schema);
                    sb2.append("&musicType=");
                    sb2.append(this.f63338c);
                    str = sb2.toString();
                }
                SmartRouter.buildRoute(this.itemView.getContext(), str).open(10086);
                C23888c.m78193a(C37286v.m119759b(this.f63337b.getSchema(), "name"), "click_banner", this.f63337b.getBid(), "change_music_page", m78671a(str));
            }
            C23888c.m78199b(this.f63337b.getBid(), this.f63336a);
        }
    }

    /* renamed from: b */
    private static boolean m78673b(View view) {
        if (view == null || !C0991u.m4170G(view)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m78671a(String str) {
        List a = C37286v.m119757a(str);
        if (C6307b.m19566a((Collection<T>) a) || a.size() < 2) {
            return "";
        }
        return (String) a.get(1);
    }

    /* renamed from: a */
    public static boolean m78672a(View view) {
        if (!m78673b(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    public MusicBannerViewHolder(View view, int i) {
        super(view);
        this.f63338c = i;
        C23976a aVar = new C23976a();
        view.addOnAttachStateChangeListener(aVar);
        if (C0991u.m4170G(view)) {
            aVar.run();
        }
        ButterKnife.bind((Object) this, view);
        this.f63339d[0] = C9738o.m28691a(view.getContext()) - ((int) (C9738o.m28708b(view.getContext(), 16.0f) * 2.0f));
        this.f63339d[1] = (int) (((float) this.f63339d[0]) * 0.26239067f);
    }

    /* renamed from: a */
    public final void mo62189a(Banner banner, int i) {
        if (banner != null && banner != this.f63337b) {
            this.f63337b = banner;
            if (this.f63337b.getBannerUrl() != null && !C6307b.m19566a((Collection<T>) this.f63337b.getBannerUrl().getUrlList())) {
                C12133n.m35299a(C23400r.m76741a(this.f63337b.getBannerUrl())).mo29853b(C43012cg.m136513a(601)).mo29847a(this.f63339d).mo29846a(true).mo29845a("MusicBannerViewHolder").mo29844a((C12128i) this.mSdCover).mo29848a();
            }
            new C24510b((float) C23486n.m77122a(4.0d), this.itemView.getContext().getResources().getColor(R.color.a77)).setAlpha(76);
            this.f63336a = i + 1;
        }
    }
}
