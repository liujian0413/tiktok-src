package com.p280ss.android.ugc.aweme.longvideo.p1375b;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28511z;
import com.p280ss.android.ugc.aweme.feed.widget.C29052e;
import com.p280ss.android.ugc.aweme.longvideo.C32734e;
import com.p280ss.android.ugc.aweme.longvideo.C32752l;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32727e.C32728a;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.b.b */
public final class C32720b {

    /* renamed from: a */
    public static final C32721a f85295a = new C32721a(null);

    /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a */
    public static final class C32721a {

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$a */
        public static final class C32722a extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Context f85296a;

            /* renamed from: b */
            final /* synthetic */ Aweme f85297b;

            /* renamed from: c */
            final /* synthetic */ String f85298c;

            /* renamed from: d */
            final /* synthetic */ int f85299d;

            public final void onClick(View view) {
                C7573i.m23587b(view, "widget");
                if (!C27326a.m89578a(view)) {
                    C32734e.m105952a(this.f85296a, this.f85297b, this.f85298c, this.f85299d);
                    if (this.f85297b.isAd()) {
                        C24976t.m82106aS(C6399b.m19921a(), this.f85297b);
                    }
                }
            }

            C32722a(Context context, Aweme aweme, String str, int i) {
                this.f85296a = context;
                this.f85297b = aweme;
                this.f85298c = str;
                this.f85299d = i;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.longvideo.b.b$a$b */
        public static final class C32723b extends ClickableSpan {

            /* renamed from: a */
            final /* synthetic */ Context f85300a;

            /* renamed from: b */
            final /* synthetic */ Aweme f85301b;

            /* renamed from: c */
            final /* synthetic */ String f85302c;

            /* renamed from: d */
            final /* synthetic */ int f85303d;

            public final void onClick(View view) {
                C7573i.m23587b(view, "widget");
                if (!C27326a.m89578a(view)) {
                    C32734e.m105952a(this.f85300a, this.f85301b, this.f85302c, this.f85303d);
                }
            }

            C32723b(Context context, Aweme aweme, String str, int i) {
                this.f85300a = context;
                this.f85301b = aweme;
                this.f85302c = str;
                this.f85303d = i;
            }
        }

        private C32721a() {
        }

        public /* synthetic */ C32721a(C7571f fVar) {
            this();
        }

        /* renamed from: f */
        private static Video m105926f(Aweme aweme) {
            return C32752l.f85394b.mo84248a(aweme);
        }

        /* renamed from: b */
        public final String mo84197b(Aweme aweme) {
            return m105924a(aweme);
        }

        /* renamed from: a */
        public static String m105924a(Aweme aweme) {
            if (aweme != null) {
                String aid = aweme.getAid();
                if (aid != null) {
                    return aid;
                }
            }
            return "";
        }

        /* renamed from: d */
        public static boolean m105925d(Aweme aweme) {
            if (aweme != null && aweme.getDistributeType() == 2) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo84198c(Aweme aweme) {
            if (m105926f(aweme) != null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final String mo84199e(Aweme aweme) {
            int i;
            C32728a aVar = C32727e.f85308a;
            Video f = m105926f(aweme);
            if (f != null) {
                i = f.getDuration() / 1000;
            } else {
                i = 0;
            }
            return aVar.mo84203a(i);
        }

        /* renamed from: a */
        public final SpannableString mo84195a(Context context, String str, Aweme aweme, String str2, int i) {
            C7573i.m23587b(context, "mContext");
            C7573i.m23587b(str, "awemeDesc");
            C7573i.m23587b(aweme, "mAweme");
            C7573i.m23587b(str2, "mEventType");
            return m105923a(context, str, aweme, str2, i, false);
        }

        /* renamed from: a */
        private SpannableString m105922a(Context context, Aweme aweme, String str, int i, SpannableString spannableString) {
            C7573i.m23587b(context, "mContext");
            C7573i.m23587b(aweme, "mAweme");
            C7573i.m23587b(str, "mEventType");
            C7573i.m23587b(spannableString, "spannableString");
            C6907h.m21524a("show_complete_video_entrance", (Map) C22984d.m75611a().mo59973a("log_pb", C28199ae.m92689a().mo71791a(aweme.getAid())).mo59971a("local_time_ms", System.currentTimeMillis()).mo59973a("enter_from", str).mo59973a("group_id", aweme.getAid()).f60753a);
            String spannableString2 = spannableString.toString();
            C7573i.m23582a((Object) spannableString2, "spannableString.toString()");
            String string = context.getString(R.string.bag);
            C7573i.m23582a((Object) string, "mContext.getString(R.string.full_version)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{mo84199e(aweme)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            C29052e eVar = new C29052e(context, R.color.en, a, R.drawable.av1);
            spannableString.setSpan(new C32722a(context, aweme, str, i), (spannableString2.length() - 4) + 1, spannableString2.length(), 17);
            spannableString.setSpan(eVar, (spannableString2.length() - 4) + 1, spannableString2.length(), 17);
            return spannableString;
        }

        /* renamed from: a */
        public final SpannableStringBuilder mo84196a(Context context, Aweme aweme, String str, int i, SpannableStringBuilder spannableStringBuilder) {
            C7573i.m23587b(context, "mContext");
            C7573i.m23587b(aweme, "mAweme");
            C7573i.m23587b(str, "mEventType");
            C7573i.m23587b(spannableStringBuilder, "spannableStringBuilder");
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            C7573i.m23582a((Object) spannableStringBuilder2, "spannableStringBuilder.toString()");
            String string = context.getString(R.string.bag);
            C7573i.m23582a((Object) string, "mContext.getString(R.string.full_version)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{mo84199e(aweme)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            C29052e eVar = new C29052e(context, R.color.en, a, R.drawable.av1);
            spannableStringBuilder.setSpan(new C32723b(context, aweme, str, i), (spannableStringBuilder2.length() - 4) + 1, spannableStringBuilder2.length(), 17);
            spannableStringBuilder.setSpan(eVar, (spannableStringBuilder2.length() - 4) + 1, spannableStringBuilder2.length(), 17);
            return spannableStringBuilder;
        }

        /* renamed from: a */
        private SpannableString m105923a(Context context, String str, Aweme aweme, String str2, int i, boolean z) {
            C7573i.m23587b(context, "mContext");
            C7573i.m23587b(str, "awemeDesc");
            C7573i.m23587b(aweme, "mAweme");
            C7573i.m23587b(str2, "mEventType");
            if (str.length() > C28511z.m93720a() - 4) {
                String substring = str.substring(0, (C28511z.m93720a() - 4) - 3);
                C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                StringBuilder sb = new StringBuilder();
                sb.append(substring);
                sb.append("...");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" [r]");
            return m105922a(context, aweme, str2, i, new SpannableString(sb2.toString()));
        }
    }

    /* renamed from: a */
    public static final SpannableString m105917a(Context context, String str, Aweme aweme, String str2, int i) {
        return f85295a.mo84195a(context, str, aweme, str2, i);
    }

    /* renamed from: a */
    public static final SpannableStringBuilder m105918a(Context context, Aweme aweme, String str, int i, SpannableStringBuilder spannableStringBuilder) {
        return f85295a.mo84196a(context, aweme, str, i, spannableStringBuilder);
    }

    /* renamed from: a */
    public static final boolean m105919a(Aweme aweme) {
        return f85295a.mo84198c(aweme);
    }

    /* renamed from: b */
    public static final boolean m105920b(Aweme aweme) {
        return C32721a.m105925d(aweme);
    }

    /* renamed from: c */
    public static final String m105921c(Aweme aweme) {
        return f85295a.mo84199e(aweme);
    }
}
