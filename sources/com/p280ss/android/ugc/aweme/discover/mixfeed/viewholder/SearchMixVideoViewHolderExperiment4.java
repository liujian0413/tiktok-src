package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.opensdk.model.BaseInfo;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformRawData;
import com.p280ss.android.ugc.aweme.opensdk.model.OpenPlatformStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43110ev;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.SearchMixVideoViewHolderExperiment4 */
public class SearchMixVideoViewHolderExperiment4 extends SearchMixVideoViewHolder {

    /* renamed from: g */
    protected View f70603g;

    /* renamed from: a */
    public final void mo68527a(long j) {
    }

    /* renamed from: d */
    public final void mo68504d() {
    }

    /* access modifiers changed from: protected */
    public final View aI_() {
        View view = this.f70603g;
        if (view == null) {
            C7573i.m23583a("adTagLayout");
        }
        return view;
    }

    /* renamed from: n */
    public final void mo68534n() {
        mo75229E();
        mo75230F();
        mo68531l();
    }

    /* renamed from: ar */
    private final void m87892ar() {
        if (this.f77577aC != null) {
            TextView textView = this.f77577aC;
            if (textView == null) {
                C7573i.m23580a();
            }
            LayoutParams layoutParams = textView.getLayoutParams();
            C7573i.m23582a((Object) layoutParams, "mTvMusicOriginal!!.layoutParams");
            layoutParams.width = (int) C9738o.m28708b(mo75261ab(), 360.0f);
            TextView textView2 = this.f77577aC;
            if (textView2 == null) {
                C7573i.m23580a();
            }
            textView2.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: k */
    public final void mo68530k() {
        super.mo68530k();
        if (!C25352e.m83221d(this.f77546j)) {
            View view = this.f70603g;
            if (view == null) {
                C7573i.m23583a("adTagLayout");
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.f70603g;
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
        this.f70603g = view;
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
        viewStub3.setLayoutResource(R.layout.a7n);
        mo75255a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 0.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.dcl);
        C7573i.m23582a((Object) viewStub4, "poiStub");
        viewStub4.setLayoutResource(R.layout.a6m);
        viewStub4.inflate();
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.dc6);
        C7573i.m23582a((Object) viewStub5, "bottomStub");
        viewStub5.setLayoutResource(R.layout.a7s);
        mo75253a(viewStub5.inflate(), 12.0f);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.dc0);
        C7573i.m23582a((Object) viewStub6, "commentStub");
        viewStub6.setLayoutResource(R.layout.a6f);
        viewStub6.inflate();
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.dc8);
        C7573i.m23582a((Object) viewStub7, "followTimeStub");
        viewStub7.setLayoutResource(R.layout.a_s);
        View inflate = viewStub7.inflate();
        C7573i.m23582a((Object) inflate, "followTimeStub.inflate()");
        this.f70603g = inflate;
        View view2 = this.f70603g;
        if (view2 == null) {
            C7573i.m23583a("adTagLayout");
        }
        mo75253a(view2, 12.0f);
    }

    /* renamed from: a */
    private static void m87891a(int i, float f, int[] iArr) {
        iArr[0] = i;
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
        } else {
            iArr[1] = (int) (((float) i) * f);
        }
    }

    /* renamed from: a */
    public final void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m87891a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo68518a(Aweme aweme, List<Comment> list, List<User> list2, C21747e eVar) {
        super.mo68518a(aweme, list, list2, eVar);
        m87892ar();
    }
}
