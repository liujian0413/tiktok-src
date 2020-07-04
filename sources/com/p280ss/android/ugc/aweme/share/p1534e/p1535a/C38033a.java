package com.p280ss.android.ugc.aweme.share.p1534e.p1535a;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.C38065a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38357h;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.e.a.a */
public interface C38033a {

    /* renamed from: com.ss.android.ugc.aweme.share.e.a.a$a */
    public static class C38034a implements C38033a {

        /* renamed from: a */
        public Activity f99012a;

        /* renamed from: b */
        private List<C38343b> f99013b;

        /* renamed from: c */
        private LinearLayout f99014c;

        /* renamed from: d */
        private int f99015d = ((int) C9738o.m28708b((Context) this.f99012a, 33.0f));

        /* renamed from: e */
        private int f99016e = ((int) C9738o.m28708b((Context) this.f99012a, 3.0f));

        /* renamed from: f */
        private int f99017f = ((int) C9738o.m28708b((Context) this.f99012a, 4.5f));

        /* renamed from: g */
        private SharePackage f99018g;

        /* renamed from: a */
        private List<C38343b> m121398a(Aweme aweme) {
            this.f99018g = C37984ap.m121301a().parseAweme(this.f99012a, aweme, 0, "", "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(C37950a.m121238a().getImChannel(this.f99018g, "", 8));
            arrayList.add(C38065a.m121467a("weixin_moments", this.f99012a));
            arrayList.add(C38065a.m121467a("weixin", this.f99012a));
            arrayList.add(C38065a.m121467a("qq", this.f99012a));
            arrayList.add(C38065a.m121467a("weibo", this.f99012a));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((C38343b) it.next()).mo95743a(this.f99012a)) {
                    it.remove();
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        public final LinearLayout mo95673a(Aweme aweme, PhotoContext photoContext) {
            for (int i = 0; i < this.f99013b.size(); i++) {
                if (i == 0) {
                    this.f99014c.addView(m121397a((C38343b) this.f99013b.get(i), aweme, photoContext.mPhotoLocalPath));
                } else if (i == this.f99013b.size() - 1) {
                    this.f99014c.addView(m121400c((C38343b) this.f99013b.get(i), aweme, photoContext.mPhotoLocalPath));
                } else {
                    this.f99014c.addView(m121399b((C38343b) this.f99013b.get(i), aweme, photoContext.mPhotoLocalPath));
                }
            }
            return this.f99014c;
        }

        /* renamed from: a */
        private ImageView m121397a(C38343b bVar, Aweme aweme, String str) {
            ImageView d = m121401d(bVar, aweme, str);
            LayoutParams layoutParams = new LayoutParams(this.f99015d, this.f99015d);
            layoutParams.setMargins(0, 0, this.f99017f, 0);
            d.setLayoutParams(layoutParams);
            return d;
        }

        /* renamed from: b */
        private ImageView m121399b(C38343b bVar, Aweme aweme, String str) {
            ImageView d = m121401d(bVar, aweme, str);
            LayoutParams layoutParams = new LayoutParams(this.f99015d, this.f99015d);
            layoutParams.setMargins(this.f99017f, 0, this.f99017f, 0);
            d.setLayoutParams(layoutParams);
            return d;
        }

        /* renamed from: c */
        private ImageView m121400c(C38343b bVar, Aweme aweme, String str) {
            ImageView d = m121401d(bVar, aweme, str);
            LayoutParams layoutParams = new LayoutParams(this.f99015d, this.f99015d);
            layoutParams.setMargins(this.f99017f, 0, 0, 0);
            d.setLayoutParams(layoutParams);
            return d;
        }

        public C38034a(Activity activity, Aweme aweme, LinearLayout linearLayout) {
            this.f99012a = activity;
            this.f99013b = m121398a(aweme);
            this.f99014c = linearLayout;
        }

        /* renamed from: d */
        private ImageView m121401d(final C38343b bVar, Aweme aweme, final String str) {
            RemoteImageView remoteImageView = new RemoteImageView(this.f99012a);
            if (!TextUtils.equals(bVar.mo95739b(), "chat_merge") || !C6903bc.m21488g().mo80286a()) {
                remoteImageView.setImageDrawable(C0683b.m2903a((Context) this.f99012a, bVar.mo95742e()));
            } else {
                C6903bc.m21488g().mo80284a(this.f99012a, remoteImageView, 3);
            }
            remoteImageView.setPadding(this.f99016e, this.f99016e, this.f99016e, this.f99016e);
            remoteImageView.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C6907h.onEvent(MobClick.obtain().setEventName("share_bodydance_card").setLabelName(bVar.mo95739b()));
                    bVar.mo71406a((C38354f) new C38357h(C42972bf.m136420a((Context) C38034a.this.f99012a, str), str), (Context) C38034a.this.f99012a);
                }
            });
            return remoteImageView;
        }
    }

    /* renamed from: a */
    LinearLayout mo95673a(Aweme aweme, PhotoContext photoContext);
}
