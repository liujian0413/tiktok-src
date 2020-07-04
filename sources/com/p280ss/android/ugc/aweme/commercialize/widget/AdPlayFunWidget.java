package com.p280ss.android.ugc.aweme.commercialize.widget;

import android.arch.lifecycle.C0053p;
import android.graphics.Bitmap;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.p612c.C12106d;
import com.bytedance.lighten.core.p612c.C12115m;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView;
import com.p280ss.android.ugc.aweme.commercialize.playfun.C25026c;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget */
public final class AdPlayFunWidget extends AbsAdFeedWidget {

    /* renamed from: j */
    private AdPlayFunView f67516j;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget$a */
    public static final class C25633a extends C12106d {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunWidget f67517a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f67518b;

        /* renamed from: a */
        public final void mo29816a(Bitmap bitmap) {
            C25026c.f66008a.mo65481a(this.f67517a.f67508a, true, (String) null);
        }

        /* renamed from: a */
        public final void mo29817a(Throwable th) {
            String str;
            C25026c cVar = C25026c.f66008a;
            Aweme aweme = this.f67517a.f67508a;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            cVar.mo65481a(aweme, false, str);
        }

        C25633a(AdPlayFunWidget adPlayFunWidget, FragmentActivity fragmentActivity) {
            this.f67517a = adPlayFunWidget;
            this.f67518b = fragmentActivity;
        }
    }

    /* renamed from: d */
    public final void mo66460d() {
        AdPlayFunView adPlayFunView = this.f67516j;
        if (adPlayFunView != null) {
            adPlayFunView.mo65446c();
        }
    }

    /* renamed from: e */
    public final void mo66461e() {
        AdPlayFunView adPlayFunView = this.f67516j;
        if (adPlayFunView != null) {
            adPlayFunView.mo65445b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66455a() {
        super.mo66455a();
        DataCenter dataCenter = this.f60922e;
        if (dataCenter != null) {
            C0053p pVar = this;
            dataCenter.mo60132a("ad_feed_on_page_selected", pVar);
            dataCenter.mo60132a("ad_feed_on_page_unselected", pVar);
            dataCenter.mo60132a("ad_video_on_resume_play", pVar);
            dataCenter.mo60132a("ad_video_on_pause_play", pVar);
        }
    }

    /* renamed from: f */
    private final void m84230f() {
        Aweme aweme = this.f67508a;
        if (!C25352e.m83307R(this.f67508a)) {
            AdPlayFunView adPlayFunView = this.f67516j;
            if (adPlayFunView != null) {
                adPlayFunView.setVisibility(8);
                adPlayFunView.mo65442a((Aweme) null);
                return;
            }
            return;
        }
        if (this.f67516j == null) {
            View view = this.f60921d;
            if (view != null) {
                View inflate = ((ViewStub) view).inflate();
                if (inflate != null) {
                    this.f67516j = (AdPlayFunView) inflate;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        AdPlayFunView adPlayFunView2 = this.f67516j;
        if (adPlayFunView2 != null) {
            if (aweme == null) {
                C7573i.m23580a();
            }
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
            m84229a(awemeRawAd.getPlayFunModel().getImageInfo());
            adPlayFunView2.mo65442a(aweme);
            adPlayFunView2.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66457a(C25638a aVar) {
        C7573i.m23587b(aVar, "params");
        super.mo66457a(aVar);
        m84230f();
    }

    /* renamed from: a */
    private final void m84229a(UrlModel urlModel) {
        Fragment fragment = this.f67509i;
        if (fragment != null) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C7573i.m23582a((Object) activity, "mFragment?.activity ?: return");
                if (urlModel != null) {
                    C25026c.f66008a.mo65480a(this.f67508a);
                    C12133n.m35299a(C23400r.m76741a(urlModel)).mo29841a(activity).mo29850a((C12115m) new C25633a(this, activity));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo66459a(boolean z) {
        float f;
        AdPlayFunView adPlayFunView = this.f67516j;
        if (adPlayFunView != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            adPlayFunView.setAlpha(f);
        }
    }

    /* renamed from: a */
    public final void onChanged(C23083a aVar) {
        String str;
        super.onChanged(aVar);
        if (aVar != null) {
            str = aVar.f60948a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2057127075) {
                if (hashCode != -1540531799) {
                    if (hashCode != -1132409520) {
                        if (hashCode == 2040441990 && str.equals("ad_video_on_resume_play") && C25352e.m83307R(this.f67508a)) {
                            AdPlayFunView adPlayFunView = this.f67516j;
                            if (adPlayFunView != null) {
                                adPlayFunView.mo65447d();
                            }
                        }
                    } else if (str.equals("ad_feed_on_page_selected")) {
                        AdPlayFunView adPlayFunView2 = this.f67516j;
                        if (adPlayFunView2 != null) {
                            adPlayFunView2.mo65449f();
                        }
                    }
                } else if (str.equals("ad_feed_on_page_unselected")) {
                    AdPlayFunView adPlayFunView3 = this.f67516j;
                    if (adPlayFunView3 != null) {
                        adPlayFunView3.mo65450g();
                    }
                    AdPlayFunView adPlayFunView4 = this.f67516j;
                    if (adPlayFunView4 != null) {
                        adPlayFunView4.setVisibility(8);
                    }
                }
            } else if (str.equals("ad_video_on_pause_play") && C25352e.m83307R(this.f67508a)) {
                AdPlayFunView adPlayFunView5 = this.f67516j;
                if (adPlayFunView5 != null) {
                    adPlayFunView5.mo65448e();
                }
            }
        }
    }
}
