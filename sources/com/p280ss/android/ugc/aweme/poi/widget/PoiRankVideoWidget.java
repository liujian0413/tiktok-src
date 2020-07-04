package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.poi.model.PoiAddress;
import com.p280ss.android.ugc.aweme.poi.service.IPoiService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiRankVideoWidget */
public final class PoiRankVideoWidget extends LinearLayout {

    /* renamed from: a */
    public static final C35475a f93043a = new C35475a(null);

    /* renamed from: b */
    private DmtTextView f93044b;

    /* renamed from: c */
    private DmtTextView f93045c;

    /* renamed from: d */
    private View f93046d;

    /* renamed from: e */
    private SmartImageView f93047e;

    /* renamed from: f */
    private DmtTextView f93048f;

    /* renamed from: g */
    private DmtTextView f93049g;

    /* renamed from: h */
    private DmtTextView f93050h;

    /* renamed from: i */
    private DmtTextView f93051i;

    /* renamed from: j */
    private DmtTextView f93052j;

    /* renamed from: k */
    private DmtTextView f93053k;

    /* renamed from: l */
    private View f93054l;

    /* renamed from: m */
    private Aweme f93055m;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.PoiRankVideoWidget$a */
    public static final class C35475a {
        private C35475a() {
        }

        public /* synthetic */ C35475a(C7571f fVar) {
            this();
        }
    }

    public PoiRankVideoWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiRankVideoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private static boolean m114600a(SimplePoiInfoStruct simplePoiInfoStruct) {
        if (!C32640a.m105723a(C6399b.m19921a())) {
            return false;
        }
        return TextUtils.equals(simplePoiInfoStruct.getPoiAddress().cityCode, C28290d.m93043d());
    }

    public final void setupContent(Aweme aweme) {
        boolean z;
        boolean z2;
        String str;
        int i;
        Aweme aweme2 = aweme;
        LocationResult a = C32640a.m105721a().mo84021a();
        this.f93055m = aweme2;
        if (aweme2 != null) {
            SimplePoiInfoStruct simplePoiInfoStruct = aweme.getSimplePoiInfoStruct();
            if (simplePoiInfoStruct != null) {
                CharSequence poiRankDesc = simplePoiInfoStruct.getPoiRankDesc();
                if (poiRankDesc == null || poiRankDesc.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    View view = this.f93046d;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                } else {
                    View view2 = this.f93046d;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    DmtTextView dmtTextView = this.f93044b;
                    if (dmtTextView != null) {
                        dmtTextView.setText(String.valueOf(simplePoiInfoStruct.getIndex()));
                    }
                    String poiRankDesc2 = simplePoiInfoStruct.getPoiRankDesc();
                    DmtTextView dmtTextView2 = this.f93045c;
                    if (dmtTextView2 != null) {
                        TextPaint paint = dmtTextView2.getPaint();
                        if (paint != null) {
                            DmtTextView dmtTextView3 = this.f93045c;
                            if (dmtTextView3 != null) {
                                LayoutParams layoutParams = dmtTextView3.getLayoutParams();
                                if (layoutParams != null) {
                                    if (paint.measureText(poiRankDesc2) > ((float) C23482j.m77098b(getContext())) - C9738o.m28708b(getContext(), 64.0f)) {
                                        i = -2;
                                    } else {
                                        i = (int) C9738o.m28708b(getContext(), 18.0f);
                                    }
                                    layoutParams.height = i;
                                }
                            }
                        }
                    }
                    DmtTextView dmtTextView4 = this.f93045c;
                    if (dmtTextView4 != null) {
                        dmtTextView4.setText(poiRankDesc2);
                    }
                }
                C12133n.m35299a(C23400r.m76741a(simplePoiInfoStruct.getCover())).mo29836a(198, 198).mo29844a((C12128i) this.f93047e).mo29845a("PoiRankVideoWidget").mo29848a();
                DmtTextView dmtTextView5 = this.f93048f;
                if (dmtTextView5 != null) {
                    dmtTextView5.setText(simplePoiInfoStruct.getPoiName());
                }
                if (simplePoiInfoStruct.getRankScore() != 0) {
                    DmtTextView dmtTextView6 = this.f93053k;
                    if (dmtTextView6 != null) {
                        dmtTextView6.setText(C30537o.m99738a(simplePoiInfoStruct.getRankScore()));
                    }
                    DmtTextView dmtTextView7 = this.f93053k;
                    if (dmtTextView7 != null) {
                        dmtTextView7.setVisibility(0);
                    }
                } else {
                    DmtTextView dmtTextView8 = this.f93053k;
                    if (dmtTextView8 != null) {
                        dmtTextView8.setVisibility(8);
                    }
                }
                CharSequence optionName = simplePoiInfoStruct.getOptionName();
                if (optionName == null || optionName.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    DmtTextView dmtTextView9 = this.f93049g;
                    if (dmtTextView9 != null) {
                        dmtTextView9.setVisibility(8);
                    }
                } else {
                    DmtTextView dmtTextView10 = this.f93049g;
                    if (dmtTextView10 != null) {
                        dmtTextView10.setText(simplePoiInfoStruct.getOptionName());
                    }
                    DmtTextView dmtTextView11 = this.f93049g;
                    if (dmtTextView11 != null) {
                        dmtTextView11.setVisibility(0);
                    }
                }
                int cost = (int) simplePoiInfoStruct.getCost();
                if (cost <= 0) {
                    DmtTextView dmtTextView12 = this.f93050h;
                    if (dmtTextView12 != null) {
                        dmtTextView12.setVisibility(8);
                    }
                } else {
                    Context context = getContext();
                    C7573i.m23582a((Object) context, "context");
                    String string = context.getResources().getString(R.string.cxx);
                    C7573i.m23582a((Object) string, "context.resources.getString(R.string.poi_cost)");
                    String a2 = C1642a.m8034a(string, Arrays.copyOf(new Object[]{String.valueOf(cost)}, 1));
                    C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
                    DmtTextView dmtTextView13 = this.f93050h;
                    if (dmtTextView13 != null) {
                        dmtTextView13.setText(a2);
                    }
                    DmtTextView dmtTextView14 = this.f93050h;
                    if (dmtTextView14 != null) {
                        dmtTextView14.setVisibility(0);
                    }
                }
                DmtTextView dmtTextView15 = this.f93051i;
                if (dmtTextView15 != null) {
                    PoiAddress poiAddress = simplePoiInfoStruct.getPoiAddress();
                    if (poiAddress != null) {
                        str = poiAddress.simple_addr;
                    } else {
                        str = null;
                    }
                    dmtTextView15.setText(str);
                }
                if (a == null || !a.isValid() || !m114600a(simplePoiInfoStruct) || TextUtils.isEmpty(simplePoiInfoStruct.getLatitude()) || TextUtils.isEmpty(simplePoiInfoStruct.getLongitude())) {
                    DmtTextView dmtTextView16 = this.f93052j;
                    if (dmtTextView16 != null) {
                        dmtTextView16.setVisibility(8);
                    }
                    return;
                }
                double latitude = a.getLatitude();
                double longitude = a.getLongitude();
                String latitude2 = simplePoiInfoStruct.getLatitude();
                C7573i.m23582a((Object) latitude2, "it.latitude");
                double parseDouble = Double.parseDouble(latitude2);
                String longitude2 = simplePoiInfoStruct.getLongitude();
                C7573i.m23582a((Object) longitude2, "it.longitude");
                double parseDouble2 = Double.parseDouble(longitude2);
                IPoiService iPoiService = (IPoiService) ServiceManager.get().getService(IPoiService.class);
                Context context2 = getContext();
                C7573i.m23582a((Object) context2, "context");
                String distanceStrMore = iPoiService.distanceStrMore(context2, latitude, longitude, parseDouble, parseDouble2);
                DmtTextView dmtTextView17 = this.f93052j;
                if (dmtTextView17 != null) {
                    dmtTextView17.setText(distanceStrMore);
                }
                DmtTextView dmtTextView18 = this.f93052j;
                if (dmtTextView18 != null) {
                    dmtTextView18.setVisibility(0);
                    return;
                }
                return;
            }
        }
        setVisibility(8);
    }

    public PoiRankVideoWidget(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.a69, this);
        this.f93044b = (DmtTextView) findViewById(R.id.cg4);
        this.f93045c = (DmtTextView) findViewById(R.id.cg5);
        this.f93046d = findViewById(R.id.cg3);
        this.f93047e = (SmartImageView) findViewById(R.id.cfy);
        this.f93048f = (DmtTextView) findViewById(R.id.cg1);
        this.f93049g = (DmtTextView) findViewById(R.id.cg6);
        this.f93050h = (DmtTextView) findViewById(R.id.cg2);
        this.f93051i = (DmtTextView) findViewById(R.id.cfw);
        this.f93052j = (DmtTextView) findViewById(R.id.cg0);
        this.f93053k = (DmtTextView) findViewById(R.id.cfu);
        this.f93054l = findViewById(R.id.cfz);
        setOnClickListener(C354721.f93056a);
        View view = this.f93046d;
        if (view != null) {
            view.setOnClickListener(C354732.f93057a);
        }
        View view2 = this.f93054l;
        if (view2 != null) {
            view2.setOnClickListener(C354743.f93058a);
        }
        if (C21085a.m71133e() > 0) {
            View view3 = this.f93054l;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            return;
        }
        View view4 = this.f93054l;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    public /* synthetic */ PoiRankVideoWidget(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
