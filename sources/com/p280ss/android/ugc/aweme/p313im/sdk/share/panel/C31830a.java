package com.p280ss.android.ugc.aweme.p313im.sdk.share.panel;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.a */
public final class C31830a {

    /* renamed from: a */
    public static final C31830a f83270a = new C31830a();

    /* renamed from: b */
    private static final int f83271b = C23486n.m77122a(56.0d);

    private C31830a() {
    }

    /* renamed from: a */
    public static void m103299a(SharePackage sharePackage, View view) {
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(view, "editLayout");
        RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.c0l);
        ImageView imageView = (ImageView) view.findViewById(R.id.bc8);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.c0k);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.mo32879a(C9738o.m28708b(C6399b.m19921a(), 2.0f));
        String str = sharePackage.f20181g;
        int hashCode = str.hashCode();
        if (hashCode != -1354573786) {
            if (hashCode != 3178685) {
                if (hashCode == 603552178 && str.equals("good_window")) {
                    C7573i.m23582a((Object) remoteImageView, "shareCover");
                    LayoutParams layoutParams = remoteImageView.getLayoutParams();
                    layoutParams.width = f83271b;
                    layoutParams.height = f83271b;
                    remoteImageView.setLayoutParams(layoutParams);
                    roundingParams.mo32884a(true);
                    C7573i.m23582a((Object) imageView, "shareGoodWindowTag");
                    imageView.setVisibility(0);
                }
            } else if (str.equals("good")) {
                imageView.setImageResource(R.drawable.aht);
                C7573i.m23582a((Object) imageView, "shareGoodWindowTag");
                imageView.setVisibility(0);
            }
        } else if (str.equals("coupon")) {
            C7573i.m23582a((Object) imageView2, "shareCouponTag");
            imageView2.setVisibility(0);
        }
        C7573i.m23582a((Object) remoteImageView, "shareCover");
        C13438a aVar = (C13438a) remoteImageView.getHierarchy();
        C7573i.m23582a((Object) aVar, "shareCover.hierarchy");
        aVar.mo32897a(roundingParams);
    }
}
