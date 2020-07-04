package com.p280ss.android.ugc.aweme.discover.widget;

import android.os.Handler;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.discover.api.SearchFeedbackApi.C26564a;
import com.p280ss.android.ugc.aweme.discover.mob.C26807z;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView */
public final class FeedbackGuideView extends C1293v implements OnClickListener {

    /* renamed from: a */
    public static final C27257a f71795a = new C27257a(null);

    /* renamed from: b */
    private LinearLayout f71796b;

    /* renamed from: c */
    private ImageView f71797c;

    /* renamed from: d */
    private ImageView f71798d;

    /* renamed from: e */
    private ImageView f71799e;

    /* renamed from: f */
    private ImageView f71800f;

    /* renamed from: g */
    private ImageView f71801g;

    /* renamed from: h */
    private RelativeLayout f71802h;

    /* renamed from: i */
    private ImageView f71803i;

    /* renamed from: j */
    private LinearLayout f71804j;

    /* renamed from: k */
    private ImageView f71805k;

    /* renamed from: l */
    private final ArrayList<ImageView> f71806l = new ArrayList<>(5);

    /* renamed from: m */
    private String f71807m = "";

    /* renamed from: n */
    private String f71808n = "";

    /* renamed from: o */
    private String f71809o = "";

    /* renamed from: p */
    private SearchPullFeedbackStruct f71810p;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView$a */
    public static final class C27257a {
        private C27257a() {
        }

        public /* synthetic */ C27257a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FeedbackGuideView m89289a(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.aj6, viewGroup, false);
            C7573i.m23582a((Object) inflate, "view");
            return new FeedbackGuideView(inflate);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView$b */
    static final class C27258b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedbackGuideView f71811a;

        C27258b(FeedbackGuideView feedbackGuideView) {
            this.f71811a = feedbackGuideView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f71811a.mo70015c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView$c */
    static final class C27259c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedbackGuideView f71812a;

        C27259c(FeedbackGuideView feedbackGuideView) {
            this.f71812a = feedbackGuideView;
        }

        public final void run() {
            this.f71812a.mo70017e();
            this.f71812a.mo70012a();
            this.f71812a.mo70014b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView$d */
    static final class C27260d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedbackGuideView f71813a;

        C27260d(FeedbackGuideView feedbackGuideView) {
            this.f71813a = feedbackGuideView;
        }

        public final void run() {
            this.f71813a.mo70017e();
            this.f71813a.mo70012a();
            C10761a.m31409e(C6399b.m19921a(), (int) R.string.arg).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.FeedbackGuideView$e */
    static final class C27261e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HashMap f71814a;

        C27261e(HashMap hashMap) {
            this.f71814a = hashMap;
        }

        public final void run() {
            C26564a.m87318a(this.f71814a);
        }
    }

    /* renamed from: a */
    public final void mo70012a() {
        LinearLayout linearLayout = this.f71796b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo70014b() {
        RelativeLayout relativeLayout = this.f71802h;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    /* renamed from: c */
    public final void mo70015c() {
        RelativeLayout relativeLayout = this.f71802h;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final boolean mo70016d() {
        RelativeLayout relativeLayout = this.f71802h;
        if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
            LinearLayout linearLayout = this.f71796b;
            if (linearLayout == null || linearLayout.getVisibility() != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo70017e() {
        int size = this.f71806l.size();
        for (int i = 0; i < size; i++) {
            if (C6399b.m19946v()) {
                ((ImageView) this.f71806l.get(i)).setImageResource(R.drawable.b12);
            } else if (C6399b.m19947w()) {
                ((ImageView) this.f71806l.get(i)).setImageResource(R.drawable.b13);
            }
        }
    }

    /* renamed from: g */
    private final String m89281g() {
        String str = this.f71807m;
        switch (str.hashCode()) {
            case 114586:
                if (str.equals("tag")) {
                    return "hashtag";
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    return "user";
                }
                break;
            case 104263205:
                if (str.equals("music")) {
                    return "sound";
                }
                break;
            case 112202875:
                if (str.equals("video")) {
                    return "video";
                }
                break;
            case 998835423:
                if (str.equals("general_search")) {
                    return "top";
                }
                break;
        }
        return "";
    }

    /* renamed from: f */
    private final String m89280f() {
        if (C6399b.m19947w()) {
            StringBuilder sb = new StringBuilder("https://www.tiktok.com/falcon/douyin/search_faq?options=");
            sb.append(m89282h());
            sb.append("&query=");
            sb.append(this.f71808n);
            sb.append("&search_id=");
            sb.append(C26807z.f70733a.mo68588a(this.f71807m));
            sb.append("&rating=");
            sb.append(this.f71809o);
            sb.append("&tab=");
            sb.append(m89281g());
            sb.append("&hide_nav_bar=1");
            return sb.toString();
        } else if (!C6399b.m19946v()) {
            return "";
        } else {
            StringBuilder sb2 = new StringBuilder("https://m.tiktok.com/falcon/douyin/search_faq?options=");
            sb2.append(m89282h());
            sb2.append("&query=");
            sb2.append(this.f71808n);
            sb2.append("&search_id=");
            sb2.append(C26807z.f70733a.mo68588a(this.f71807m));
            sb2.append("&rating=");
            sb2.append(this.f71809o);
            sb2.append("&tab=");
            sb2.append(m89281g());
            sb2.append("&hide_nav_bar=1");
            return sb2.toString();
        }
    }

    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m89282h() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct r0 = r5.f71810p     // Catch:{ Exception -> 0x00dc }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions r0 = r0.getFeedbackOptions()     // Catch:{ Exception -> 0x00dc }
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            java.lang.String r2 = r5.f71807m     // Catch:{ Exception -> 0x00dc }
            int r3 = r2.hashCode()     // Catch:{ Exception -> 0x00dc }
            switch(r3) {
                case 114586: goto L_0x0051;
                case 3599307: goto L_0x0042;
                case 104263205: goto L_0x0033;
                case 112202875: goto L_0x0024;
                case 998835423: goto L_0x0015;
                default: goto L_0x0014;
            }     // Catch:{ Exception -> 0x00dc }
        L_0x0014:
            goto L_0x0060
        L_0x0015:
            java.lang.String r3 = "general_search"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r0.getTopTab()     // Catch:{ Exception -> 0x00dc }
            goto L_0x0068
        L_0x0024:
            java.lang.String r3 = "video"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r0.getVideoTab()     // Catch:{ Exception -> 0x00dc }
            goto L_0x0068
        L_0x0033:
            java.lang.String r3 = "music"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r0.getSoundTab()     // Catch:{ Exception -> 0x00dc }
            goto L_0x0068
        L_0x0042:
            java.lang.String r3 = "user"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r0.getUserTab()     // Catch:{ Exception -> 0x00dc }
            goto L_0x0068
        L_0x0051:
            java.lang.String r3 = "tag"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00dc }
            if (r2 == 0) goto L_0x0060
            if (r0 == 0) goto L_0x0068
            java.util.List r1 = r0.getHashtagTab()     // Catch:{ Exception -> 0x00dc }
            goto L_0x0068
        L_0x0060:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x00dc }
            r0.<init>()     // Catch:{ Exception -> 0x00dc }
            r1 = r0
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x00dc }
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            r0.<init>()     // Catch:{ Exception -> 0x00dc }
            if (r1 != 0) goto L_0x0072
            kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Exception -> 0x00dc }
        L_0x0072:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x00dc }
        L_0x0076:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x00dc }
            r3 = 44
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00dc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            r4.<init>()     // Catch:{ Exception -> 0x00dc }
            r4.append(r2)     // Catch:{ Exception -> 0x00dc }
            r4.append(r3)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00dc }
            r0.append(r2)     // Catch:{ Exception -> 0x00dc }
            goto L_0x0076
        L_0x0097:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x00dc }
            int r1 = r0.length()     // Catch:{ Exception -> 0x00dc }
            int r1 = r1 + -1
            char r1 = r0.charAt(r1)     // Catch:{ Exception -> 0x00dc }
            if (r1 != r3) goto L_0x00c7
            int r1 = r0.length()     // Catch:{ Exception -> 0x00dc }
            int r1 = r1 + -1
            if (r0 == 0) goto L_0x00bf
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)     // Catch:{ Exception -> 0x00dc }
            goto L_0x00c7
        L_0x00bf:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            throw r0     // Catch:{ Exception -> 0x00dc }
        L_0x00c7:
            if (r0 == 0) goto L_0x00d4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x00dc }
            java.lang.CharSequence r0 = kotlin.text.C7634n.m23762b(r0)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00dc }
            return r0
        L_0x00d4:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x00dc }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00dc }
            throw r0     // Catch:{ Exception -> 0x00dc }
        L_0x00dc:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.widget.FeedbackGuideView.m89282h():java.lang.String");
    }

    public FeedbackGuideView(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        m89276a(view);
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            this.f71810p = a.getSearchPullFeedback();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private final boolean m89278a(String str) {
        boolean z;
        if (!C6399b.m19944t()) {
            return false;
        }
        try {
            SearchPullFeedbackStruct searchPullFeedbackStruct = this.f71810p;
            if (searchPullFeedbackStruct != null) {
                Boolean isOpenFeedback = searchPullFeedbackStruct.getIsOpenFeedback();
                if (isOpenFeedback != null) {
                    z = isOpenFeedback.booleanValue();
                    if (!z && m89279b(str)) {
                        return true;
                    }
                    return false;
                }
            }
        } catch (NullValueException unused) {
        }
        z = false;
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m89279b(String str) {
        Keva repo = Keva.getRepo("search");
        if (m89277a(repo.getLong("search_feedback_last_shown_time", 0), System.currentTimeMillis())) {
            repo.storeString("search_keyword_strings", "");
            repo.storeInt("search_feedback_shown_time", 0);
        }
        int i = repo.getInt("search_feedback_shown_time", 0);
        int i2 = 2;
        int i3 = Integer.MAX_VALUE;
        try {
            SearchPullFeedbackStruct searchPullFeedbackStruct = this.f71810p;
            if (searchPullFeedbackStruct != null) {
                Integer freqPerDay = searchPullFeedbackStruct.getFreqPerDay();
                if (freqPerDay != null) {
                    i3 = freqPerDay.intValue();
                }
            }
            SearchPullFeedbackStruct searchPullFeedbackStruct2 = this.f71810p;
            if (searchPullFeedbackStruct2 != null) {
                Integer freqPerQuery = searchPullFeedbackStruct2.getFreqPerQuery();
                if (freqPerQuery != null) {
                    i2 = freqPerQuery.intValue();
                }
            }
        } catch (NullValueException unused) {
        }
        if (i >= i3) {
            return false;
        }
        String string = repo.getString("search_keyword_strings", "");
        C7573i.m23582a((Object) string, "searchKeywordStrings");
        int i4 = 0;
        for (String equals : C7634n.m23768b((CharSequence) string, new String[]{","}, false, 0)) {
            if (TextUtils.equals(str, equals)) {
                i4++;
            }
        }
        if (i4 >= i2) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(',');
        sb.append(str);
        repo.storeString("search_keyword_strings", sb.toString());
        repo.storeInt("search_feedback_shown_time", i + 1);
        repo.storeLong("search_feedback_last_shown_time", System.currentTimeMillis());
        return true;
    }

    /* renamed from: a */
    private final void m89276a(View view) {
        this.f71796b = (LinearLayout) view.findViewById(R.id.brc);
        this.f71797c = (ImageView) view.findViewById(R.id.d_7);
        this.f71798d = (ImageView) view.findViewById(R.id.d_8);
        this.f71799e = (ImageView) view.findViewById(R.id.d_9);
        this.f71800f = (ImageView) view.findViewById(R.id.d__);
        this.f71801g = (ImageView) view.findViewById(R.id.d_a);
        this.f71802h = (RelativeLayout) view.findViewById(R.id.cui);
        this.f71803i = (ImageView) view.findViewById(R.id.ajv);
        this.f71804j = (LinearLayout) view.findViewById(R.id.ro);
        this.f71805k = (ImageView) view.findViewById(R.id.az6);
        ArrayList<ImageView> arrayList = this.f71806l;
        ImageView imageView = this.f71797c;
        if (imageView == null) {
            C7573i.m23580a();
        }
        arrayList.add(imageView);
        ArrayList<ImageView> arrayList2 = this.f71806l;
        ImageView imageView2 = this.f71798d;
        if (imageView2 == null) {
            C7573i.m23580a();
        }
        arrayList2.add(imageView2);
        ArrayList<ImageView> arrayList3 = this.f71806l;
        ImageView imageView3 = this.f71799e;
        if (imageView3 == null) {
            C7573i.m23580a();
        }
        arrayList3.add(imageView3);
        ArrayList<ImageView> arrayList4 = this.f71806l;
        ImageView imageView4 = this.f71800f;
        if (imageView4 == null) {
            C7573i.m23580a();
        }
        arrayList4.add(imageView4);
        ArrayList<ImageView> arrayList5 = this.f71806l;
        ImageView imageView5 = this.f71801g;
        if (imageView5 == null) {
            C7573i.m23580a();
        }
        arrayList5.add(imageView5);
        if (C6399b.m19947w()) {
            ImageView imageView6 = this.f71805k;
            if (imageView6 != null) {
                imageView6.setImageResource(R.drawable.as6);
            }
            Iterator it = this.f71806l.iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setImageResource(R.drawable.b13);
            }
            LinearLayout linearLayout = this.f71804j;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(R.drawable.rz);
            }
        }
        ImageView imageView7 = this.f71797c;
        if (imageView7 != null) {
            imageView7.setOnClickListener(this);
        }
        ImageView imageView8 = this.f71798d;
        if (imageView8 != null) {
            imageView8.setOnClickListener(this);
        }
        ImageView imageView9 = this.f71799e;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this);
        }
        ImageView imageView10 = this.f71800f;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this);
        }
        ImageView imageView11 = this.f71801g;
        if (imageView11 != null) {
            imageView11.setOnClickListener(this);
        }
        LinearLayout linearLayout2 = this.f71804j;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(this);
        }
        ImageView imageView12 = this.f71803i;
        if (imageView12 != null) {
            imageView12.setOnClickListener(new C27258b(this));
        }
    }

    public final void onClick(View view) {
        Integer num;
        int i;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.d_7) {
            i = 0;
        } else if (num != null && num.intValue() == R.id.d_8) {
            i = 1;
        } else if (num != null && num.intValue() == R.id.d_9) {
            i = 2;
        } else if (num != null && num.intValue() == R.id.d__) {
            i = 3;
        } else if (num != null && num.intValue() == R.id.d_a) {
            i = 4;
        } else {
            if (num != null && num.intValue() == R.id.ro) {
                mo70015c();
                C26807z.f70733a.mo68593b(this.f71807m, this.f71808n, 0);
                C7195s.m22438a().mo18682a(m89280f());
            }
            i = -1;
        }
        if (i != -1) {
            if (i >= 0) {
                int i2 = 0;
                while (true) {
                    ((ImageView) this.f71806l.get(i2)).setImageResource(R.drawable.b14);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            if (i >= 0 && 4 >= i) {
                Iterator it = this.f71806l.iterator();
                while (it.hasNext()) {
                    ImageView imageView = (ImageView) it.next();
                    C7573i.m23582a((Object) imageView, "star");
                    imageView.setClickable(false);
                }
                if (i >= 0 && 2 >= i) {
                    new Handler().postDelayed(new C27259c(this), 300);
                } else if (3 <= i && 4 >= i) {
                    new Handler().postDelayed(new C27260d(this), 300);
                }
                int i3 = i + 1;
                this.f71809o = String.valueOf(i3);
                C26807z.f70733a.mo68590a(this.f71807m, this.f71808n, i3);
                HashMap hashMap = new HashMap();
                Map map = hashMap;
                String str = C38347c.f99553h;
                StringBuilder sb = new StringBuilder("[");
                sb.append(i3);
                sb.append("][");
                sb.append(m89281g());
                sb.append("][");
                sb.append(this.f71808n);
                sb.append(']');
                map.put(str, sb.toString());
                String a = C26807z.f70733a.mo68588a(this.f71807m);
                StringBuilder sb2 = new StringBuilder("{\"search_id\":\"");
                sb2.append(a);
                sb2.append("\"}");
                String sb3 = sb2.toString();
                map.put("extra_params", sb3);
                map.put("extra_persistent_params", sb3);
                if (C27274b.m89322a(C6399b.m19921a())) {
                    C7258h.m22732e().submit(new C27261e(hashMap));
                    return;
                }
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.cjm).mo25750a();
            }
        }
    }

    /* renamed from: a */
    private static boolean m89277a(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        C7573i.m23582a((Object) instance, "lastCalendar");
        Date parse = simpleDateFormat.parse(simpleDateFormat.format(instance.getTime()));
        C7573i.m23582a((Object) instance2, "currentCalendar");
        Date parse2 = simpleDateFormat.parse(simpleDateFormat.format(instance2.getTime()));
        C7573i.m23582a((Object) parse2, "dayNow");
        long time = parse2.getTime();
        C7573i.m23582a((Object) parse, "dayLast");
        if (time - parse.getTime() < 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo70013a(String str, String str2) {
        C7573i.m23587b(str, "pageType");
        C7573i.m23587b(str2, "searchWord");
        if (m89278a(str2)) {
            this.f71807m = str;
            this.f71808n = str2;
            C26807z.f70733a.mo68592b(this.f71807m, this.f71808n);
            Iterator it = this.f71806l.iterator();
            while (it.hasNext()) {
                ImageView imageView = (ImageView) it.next();
                C7573i.m23582a((Object) imageView, "star");
                imageView.setClickable(true);
            }
            LinearLayout linearLayout = this.f71796b;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
    }
}
