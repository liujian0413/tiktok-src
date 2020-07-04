package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.opensdk.model.BaseInfo;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolderExperiment1 */
public class SearchMixVideoViewHolderExperiment1 extends SearchMixVideoViewHolder {

    /* renamed from: g */
    protected View f70602g;

    /* renamed from: a */
    public final void mo68527a(long j) {
    }

    /* access modifiers changed from: protected */
    public final View aH_() {
        View view = this.f70602g;
        if (view == null) {
            C7573i.m23583a("adTagLayout");
        }
        return view;
    }

    /* renamed from: m */
    public final void mo68532m() {
        ViewGroup viewGroup = this.f77507W;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final void mo68530k() {
        super.mo68530k();
        if (!C25352e.m83221d(this.f77546j)) {
            View view = this.f70602g;
            if (view == null) {
                C7573i.m23583a("adTagLayout");
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.f70602g;
        if (view2 == null) {
            C7573i.m23583a("adTagLayout");
        }
        view2.setVisibility(0);
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

    /* renamed from: l */
    public final void mo68531l() {
        switch (C21740a.m72692h(this.f77546j)) {
            case 2:
                TextView textView = this.f77493I;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                TextView textView2 = this.f77493I;
                if (textView2 != null) {
                    textView2.setText(R.string.foy);
                    break;
                } else {
                    return;
                }
            case 3:
                TextView textView3 = this.f77493I;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = this.f77493I;
                if (textView4 != null) {
                    textView4.setText(C21740a.m72690f(this.f77546j));
                }
                return;
            default:
                TextView textView5 = this.f77493I;
                if (textView5 != null) {
                    textView5.setVisibility(8);
                    return;
                }
                break;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68529b(View view) {
        C7573i.m23587b(view, "<set-?>");
        this.f70602g = view;
    }

    /* renamed from: a */
    public void mo68500a(View view) {
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
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        C7573i.m23582a((Object) viewStub4, "poiStub");
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        C7573i.m23582a((Object) viewStub5, "bottomStub");
        viewStub5.setLayoutResource(R.layout.a6d);
        viewStub5.inflate();
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        C7573i.m23582a((Object) viewStub6, "commentStub");
        viewStub6.setLayoutResource(R.layout.a6f);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.dc8);
        C7573i.m23582a((Object) viewStub7, "followTimeStub");
        viewStub7.setLayoutResource(R.layout.a_s);
        View inflate = viewStub7.inflate();
        C7573i.m23582a((Object) inflate, "followTimeStub.inflate()");
        this.f70602g = inflate;
        View view2 = this.f70602g;
        if (view2 == null) {
            C7573i.m23583a("adTagLayout");
        }
        mo75253a(view2, 12.0f);
    }
}
