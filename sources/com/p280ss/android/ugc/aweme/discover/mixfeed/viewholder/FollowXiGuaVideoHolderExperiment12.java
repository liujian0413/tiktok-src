package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.newfollow.p1424vh.FollowXiGuaVideoHolder;
import com.p280ss.android.ugc.aweme.opensdk.model.BaseInfo;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.FollowXiGuaVideoHolderExperiment12 */
public class FollowXiGuaVideoHolderExperiment12 extends FollowXiGuaVideoHolder {
    /* renamed from: a */
    public final void mo68499a() {
        super.mo68499a();
        mo68502b();
    }

    public final void aG_() {
        mo86986ar().setText(R.string.fp6);
    }

    /* renamed from: b */
    public final void mo68502b() {
        Context ab = mo75261ab();
        Aweme aweme = this.f77546j;
        C7573i.m23582a((Object) aweme, "mAweme");
        String c = C43110ev.m136734c(ab, aweme.getCreateTime() * 1000);
        Aweme aweme2 = this.f77546j;
        if (aweme2 != null) {
            OpenPlatformStruct openPlatformStruct = aweme2.getOpenPlatformStruct();
            if (openPlatformStruct != null) {
                OpenPlatformRawData rawData = openPlatformStruct.getRawData();
                if (rawData != null) {
                    BaseInfo base = rawData.getBase();
                    if (base != null) {
                        String appName = base.getAppName();
                        if (appName != null && !TextUtils.isEmpty(appName)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(c);
                            sb.append("  ");
                            sb.append(appName);
                            c = sb.toString();
                        }
                    }
                }
            }
        }
        TextView textView = this.f77558v;
        if (textView != null) {
            StringBuilder sb2 = new StringBuilder("· ");
            sb2.append(c);
            textView.setText(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo68500a(View view) {
        C7573i.m23587b(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.dc_);
        C7573i.m23582a((Object) viewStub, "headStub");
        viewStub.setLayoutResource(R.layout.a7t);
        mo75253a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.dc2);
        C7573i.m23582a((Object) viewStub2, "descStub");
        viewStub2.setLayoutResource(R.layout.a6s);
        mo75253a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.dc7);
        C7573i.m23582a((Object) viewStub3, "contentStub");
        viewStub3.setLayoutResource(R.layout.a6c);
        mo75253a(viewStub3.inflate(), 12.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcv);
        C7573i.m23582a((Object) viewStub4, "xiguaStub");
        viewStub4.setLayoutResource(R.layout.aca);
        mo75253a(viewStub4.inflate(), 12.0f);
    }
}
