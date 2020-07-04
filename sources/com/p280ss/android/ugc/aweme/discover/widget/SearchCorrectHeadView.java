package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p280ss.android.ugc.aweme.discover.p1176b.C26579f;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView */
public final class SearchCorrectHeadView extends FrameLayout {

    /* renamed from: a */
    private SearchCorrectTextView f71855a;

    /* renamed from: b */
    private SearchCorrectTextView f71856b;

    /* renamed from: c */
    private SearchCorrectTextView f71857c;

    /* renamed from: d */
    private ViewGroup f71858d;

    /* renamed from: e */
    private ViewGroup f71859e;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.SearchCorrectHeadView$a */
    static final class C27272a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchCorrectHeadView f71860a;

        /* renamed from: b */
        final /* synthetic */ String f71861b;

        /* renamed from: c */
        final /* synthetic */ QueryCorrectInfo f71862c;

        /* renamed from: d */
        final /* synthetic */ String f71863d;

        C27272a(SearchCorrectHeadView searchCorrectHeadView, String str, QueryCorrectInfo queryCorrectInfo, String str2) {
            this.f71860a = searchCorrectHeadView;
            this.f71861b = str;
            this.f71862c = queryCorrectInfo;
            this.f71863d = str2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42961az.m136380a(new C26579f(this.f71861b, this.f71862c.getCorrectedLevel()));
            SearchCorrectHeadView.m89315a("click", this.f71862c.getCorrectedLevel(), this.f71862c.getCorrectedKeyword(), this.f71863d, this.f71862c.getRequestId());
        }
    }

    /* renamed from: a */
    private final void m89314a() {
        setLayoutParams(new LayoutParams(-1, -2));
        LayoutInflater.from(getContext()).inflate(R.layout.b2t, this, true);
        View findViewById = findViewById(R.id.e1g);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.tv_search_result)");
        this.f71855a = (SearchCorrectTextView) findViewById;
        View findViewById2 = findViewById(R.id.dso);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.tv_correct_strong)");
        this.f71856b = (SearchCorrectTextView) findViewById2;
        View findViewById3 = findViewById(R.id.dsp);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.tv_correct_weak)");
        this.f71857c = (SearchCorrectTextView) findViewById3;
        View findViewById4 = findViewById(R.id.dbs);
        C7573i.m23582a((Object) findViewById4, "findViewById(R.id.strong_container)");
        this.f71858d = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(R.id.eg1);
        C7573i.m23582a((Object) findViewById5, "findViewById(R.id.weak_container)");
        this.f71859e = (ViewGroup) findViewById5;
    }

    public SearchCorrectHeadView(Context context) {
        C7573i.m23587b(context, "context");
        this(context, null);
    }

    public SearchCorrectHeadView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo70056a(QueryCorrectInfo queryCorrectInfo, String str) {
        String str2;
        C7573i.m23587b(queryCorrectInfo, "info");
        C7573i.m23587b(str, "originalKeyWord");
        setVisibility(0);
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        Resources resources = context.getResources();
        if (queryCorrectInfo.getCorrectedLevel() == 2) {
            ViewGroup viewGroup = this.f71858d;
            if (viewGroup == null) {
                C7573i.m23583a("strongContainer");
            }
            viewGroup.setVisibility(0);
            ViewGroup viewGroup2 = this.f71859e;
            if (viewGroup2 == null) {
                C7573i.m23583a("weakContainer");
            }
            viewGroup2.setVisibility(8);
            if (!C6399b.m19944t()) {
                SearchCorrectTextView searchCorrectTextView = this.f71855a;
                if (searchCorrectTextView == null) {
                    C7573i.m23583a("tvSearchResult");
                }
                searchCorrectTextView.mo70059a(R.string.dko, queryCorrectInfo.getCorrectedKeyword(), str, resources.getColor(R.color.aze));
            } else {
                SearchCorrectTextView searchCorrectTextView2 = this.f71855a;
                if (searchCorrectTextView2 == null) {
                    C7573i.m23583a("tvSearchResult");
                }
                StringBuilder sb = new StringBuilder(" ");
                sb.append(queryCorrectInfo.getCorrectedKeyword());
                searchCorrectTextView2.mo70058a(R.string.arl, sb.toString(), resources.getColor(R.color.so));
                SearchCorrectTextView searchCorrectTextView3 = this.f71856b;
                if (searchCorrectTextView3 == null) {
                    C7573i.m23583a("tvCorrectStrong");
                }
                StringBuilder sb2 = new StringBuilder(" ");
                sb2.append(str);
                searchCorrectTextView3.mo70058a(R.string.ark, sb2.toString(), resources.getColor(R.color.w4));
            }
            str2 = str;
        } else {
            ViewGroup viewGroup3 = this.f71858d;
            if (viewGroup3 == null) {
                C7573i.m23583a("strongContainer");
            }
            viewGroup3.setVisibility(8);
            ViewGroup viewGroup4 = this.f71859e;
            if (viewGroup4 == null) {
                C7573i.m23583a("weakContainer");
            }
            viewGroup4.setVisibility(0);
            if (!C6399b.m19944t()) {
                SearchCorrectTextView searchCorrectTextView4 = this.f71857c;
                if (searchCorrectTextView4 == null) {
                    C7573i.m23583a("tvCorrectWeak");
                }
                searchCorrectTextView4.mo70060b(R.string.djr, queryCorrectInfo.getCorrectedKeyword(), resources.getColor(R.color.aze));
            } else {
                SearchCorrectTextView searchCorrectTextView5 = this.f71857c;
                if (searchCorrectTextView5 == null) {
                    C7573i.m23583a("tvCorrectWeak");
                }
                StringBuilder sb3 = new StringBuilder(": ");
                sb3.append(queryCorrectInfo.getCorrectedKeyword());
                searchCorrectTextView5.mo70058a(R.string.arm, sb3.toString(), resources.getColor(R.color.w4));
            }
            str2 = queryCorrectInfo.getCorrectedKeyword();
            C7573i.m23582a((Object) str2, "info.correctedKeyword");
        }
        m89315a("show", queryCorrectInfo.getCorrectedLevel(), queryCorrectInfo.getCorrectedKeyword(), str, queryCorrectInfo.getRequestId());
        setOnClickListener(new C27272a(this, str2, queryCorrectInfo, str));
    }

    public SearchCorrectHeadView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m89314a();
    }

    /* renamed from: a */
    public static void m89315a(String str, int i, String str2, String str3, String str4) {
        String str5;
        if (i == 2) {
            str5 = "strong";
        } else {
            str5 = "weak";
        }
        C6907h.m21524a("search_correction", (Map) C22984d.m75611a().mo59973a("action_type", str).mo59973a("correction_type", str5).mo59973a("corrected_keyword", str2).mo59973a("original_keyword", str3).mo59973a("log_pb", C28199ae.m92689a().mo71791a(str4)).f60753a);
    }
}
