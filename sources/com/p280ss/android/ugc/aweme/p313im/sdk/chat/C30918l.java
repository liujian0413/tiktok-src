package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EPlatformCardContent.LinkItem;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31855aa;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31904d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31907i;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.l */
public final class C30918l {

    /* renamed from: a */
    public static final String[] f80975a = {"http://", "https://", "rtsp://"};

    /* renamed from: b */
    public static final String[] f80976b = {"mailto:"};

    /* renamed from: c */
    private static final String[] f80977c = {"top", "com.cn", "com", "net", "org", "edu", "gov", "int", "mil", "cn", "tel", "biz", "cc", "tv", "info", "name", "hk", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", "ad", "ae", "af", "ag", "ai", "al", "am", "an", "ao", "aq", "ar", "as", "at", "au", "aw", "az", "ba", "bb", "bd", "be", "bf", "bg", "bh", "bi", "bj", "bm", "bn", "bo", "br", "bs", "bt", "bv", "bw", "by", "bz", "ca", "cc", "cf", "cg", "ch", "ci", "ck", "cl", "cm", "cn", "co", "cq", "cr", "cu", "cv", "cx", "cy", "cz", "de", "dj", "dk", "dm", "do", "dz", "ec", "ee", "eg", "eh", "es", "et", "ev", "fi", "fj", "fk", "fm", "fo", "fr", "ga", "gb", "gd", "ge", "gf", "gh", "gi", "gl", "gm", "gn", "gp", "gr", "gt", "gu", "gw", "gy", "hk", "hm", "hn", "hr", "ht", "hu", "id", "ie", "il", "in", "io", "iq", "ir", "is", "it", "jm", "jo", "jp", "ke", "kg", "kh", "ki", "km", "kn", "kp", "kr", "kw", "ky", "kz", "la", "lb", "lc", "li", "lk", "lr", "ls", "lt", "lu", "lv", "ly", "ma", "mc", "md", "mg", "mh", "ml", "mm", "mn", "mo", "mp", "mq", "mr", "ms", "mt", "mv", "mw", "mx", "my", "mz", "na", "nc", "ne", "nf", "ng", "ni", "nl", "no", "np", "nr", "nt", "nu", "nz", "om", "qa", "pa", "pe", "pf", "pg", "ph", "pk", "pl", "pm", "pn", "pr", "pt", "pw", "py", "re", "ro", "ru", "rw", "sa", "sb", "sc", "sd", "se", "sg", "sh", "si", "sj", "sk", "sl", "sm", "sn", "so", "sr", "st", "su", "sy", "sz", "tc", "td", MLConfigModel.MODEL_TYPE_TF, "tg", "th", "tj", "tk", "tm", "tn", "to", "tp", "tr", "tt", "tv", "tw", "ty", "tz", "ua", "ug", "uk", "us", "uy", "va", "vc", "ve", "vg", "vn", "vu", "wf", "ws", "xyz", "ye", "yu", "za", "zm", "zr", "zw"};

    /* renamed from: d */
    private static Pattern f80978d;

    /* renamed from: e */
    private static final Pattern f80979e = Pattern.compile("(1\\d{10})|(0\\d{9,10})|(0\\d{2}-\\d{8})|(0\\d{3}-\\d{8})|(0\\d{2}-\\d{7})|(0\\d{3}-\\d{7})|(\\d{5})|(1\\d{2}-\\d{4}-\\d{4})|(1\\d{2}-\\d{3}-\\d{5})");

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.l$a */
    public static final class C30919a extends ClickableSpan {

        /* renamed from: a */
        private LinkItem f80980a;

        /* renamed from: b */
        private int f80981b;

        /* renamed from: c */
        private Context f80982c;

        /* renamed from: d */
        private String f80983d;

        /* renamed from: e */
        private long f80984e;

        /* renamed from: f */
        private boolean f80985f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo80845a() {
            C7058be.m21980a().mo18263a(this.f80983d, (BaseContent) TextContent.obtain(this.f80980a.value));
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f80981b);
        }

        public final void onClick(View view) {
            switch (this.f80980a.actionType) {
                case 1:
                    new C6928b(this.f80982c, new C30922m(this)).sendMsg();
                    C31858ad.m103479g(this.f80983d, String.valueOf(this.f80984e), "question_list");
                    return;
                case 2:
                    Uri parse = Uri.parse(this.f80980a.value);
                    String queryParameter = parse.getQueryParameter("target");
                    if (queryParameter == null || !queryParameter.endsWith(".pdf") || C31915n.m103671a()) {
                        if (!this.f80985f) {
                            parse = parse.buildUpon().appendQueryParameter("hide_more", "1").build();
                        }
                        C6956a.m21632a().mo18009f().openUrl(this.f80982c, parse, false);
                        C31858ad.m103479g(this.f80983d, String.valueOf(this.f80984e), "text");
                        return;
                    }
                    C6956a.m21632a().mo18009f().downloadPdf(this.f80982c, queryParameter, "application/pdf");
                    return;
                case 3:
                    C6956a.m21632a().mo18009f().makePhoneCall((Activity) this.f80982c, this.f80980a.phoneNumber, this.f80980a.phoneInstanceId, this.f80980a.phoneEncryptKey, "");
                    C31858ad.m103479g(this.f80983d, String.valueOf(this.f80984e), "phone");
                    break;
            }
        }

        public C30919a(Context context, String str, long j, LinkItem linkItem, int i, boolean z) {
            this.f80980a = linkItem;
            this.f80981b = i;
            this.f80982c = context;
            this.f80983d = str;
            this.f80984e = j;
            this.f80985f = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.l$b */
    static final class C30920b extends ClickableSpan {

        /* renamed from: a */
        public String f80986a;

        /* renamed from: b */
        public String f80987b;

        /* renamed from: c */
        private int f80988c;

        /* renamed from: d */
        private int f80989d;

        /* renamed from: e */
        private boolean f80990e;

        /* renamed from: f */
        private String f80991f;

        /* renamed from: g */
        private long f80992g;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f80988c);
        }

        public final void onClick(final View view) {
            if (this.f80990e) {
                C31858ad.m103479g(this.f80991f, String.valueOf(this.f80992g), "link");
            } else {
                C31858ad.m103406a();
                C31858ad.m103447b(this.f80987b);
            }
            int i = this.f80989d;
            if (i != 4) {
                switch (i) {
                    case 1:
                        String a = C30918l.m100655a(this.f80986a, C30918l.f80975a);
                        String str = C6956a.m21632a().mo18009f().getIMSetting().f83739b;
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                C7203u a2 = C7203u.m22460a(str).mo18694a("target", a).mo18693a("aid", C6399b.m19935k()).mo18694a("lang", C6956a.m21632a().mo18009f().getAppLanguage());
                                String b = C31904d.m103634b(view.getContext());
                                if (!TextUtils.isEmpty(b)) {
                                    a2.mo18694a(C38347c.f99551f, b);
                                }
                                a = a2.mo18695a();
                            } catch (Exception unused) {
                                C6921a.m21555a("urlSafeTemplate encode failed");
                            }
                        }
                        C6956a.m21632a().mo18009f().openUrl(view.getContext(), Uri.parse(a), true);
                        return;
                    case 2:
                        C31855aa.m103400b(view.getContext(), C30918l.m100655a(this.f80986a, C30918l.f80976b));
                        break;
                }
                return;
            }
            C31907i.m103654a(view.getContext(), R.string.bio, R.string.bhe, R.string.afn, new Runnable() {
                public final void run() {
                    C31855aa.m103399a(view.getContext(), C30920b.this.f80986a);
                }
            });
        }

        C30920b(String str, int i, int i2, boolean z, String str2, long j) {
            this.f80986a = str;
            this.f80988c = i;
            this.f80989d = i2;
            this.f80990e = z;
            this.f80991f = str2;
            this.f80992g = j;
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (String append : f80977c) {
            sb.append(append);
            sb.append("|");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(")");
        StringBuilder sb2 = new StringBuilder("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|((www\\.|[a-zA-Z0-9\\.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.");
        sb2.append(sb.toString());
        sb2.append("(:[0-9]{1,5})?))((/[a-zA-Z0-9\\./,;\\?'\\+&%\\$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z\\./,;\\?'\\+&%\\$#=~_\\-]*))");
        f80978d = Pattern.compile(sb2.toString());
    }

    /* renamed from: a */
    public static String m100655a(String str, String[] strArr) {
        boolean z;
        int i = 0;
        while (true) {
            z = true;
            if (i >= strArr.length) {
                z = false;
                break;
            }
            if (str.regionMatches(true, 0, strArr[i], 0, strArr[i].length())) {
                if (!str.regionMatches(false, 0, strArr[i], 0, strArr[i].length())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strArr[i]);
                    sb.append(str.substring(strArr[i].length()));
                    str = sb.toString();
                }
            } else {
                i++;
            }
        }
        if (z || strArr.length <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strArr[0]);
        sb2.append(str);
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m100657a(TextView textView, String str, String str2, boolean z, long j) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        TextView textView2 = textView;
        String str3 = str;
        SpannableString spannableString2 = spannableString;
        String str4 = str2;
        boolean z2 = z;
        long j2 = j;
        m100659c(textView2, str3, spannableString2, str4, z2, j2);
        m100658b(textView2, str3, spannableString2, str4, z2, j2);
        m100656a(textView2, str3, spannableString2, str4, z2, j2);
        textView.setText(spannableString);
    }

    /* renamed from: a */
    private static void m100656a(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        Matcher matcher = Patterns.EMAIL_ADDRESS.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            C30920b bVar = new C30920b(matcher.group(), textView.getResources().getColor(R.color.u4), 2, z, str2, j);
            bVar.f80987b = str2;
            SpannableString spannableString2 = spannableString;
            spannableString.setSpan(bVar, start, end, 33);
        }
    }

    /* renamed from: b */
    private static void m100658b(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        Matcher matcher = f80978d.matcher(str);
        MatchFilter matchFilter = Linkify.sUrlMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str, start, end)) {
                C30920b bVar = new C30920b(group, textView.getResources().getColor(R.color.u4), 1, z, str2, j);
                bVar.f80987b = str2;
                spannableString.setSpan(bVar, start, end, 33);
            } else {
                SpannableString spannableString2 = spannableString;
                String str4 = str2;
            }
        }
    }

    /* renamed from: c */
    private static void m100659c(TextView textView, String str, SpannableString spannableString, String str2, boolean z, long j) {
        String str3 = str;
        Matcher matcher = f80979e.matcher(str);
        MatchFilter matchFilter = Linkify.sPhoneNumberMatchFilter;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group();
            if (matchFilter.acceptMatch(str, start, end)) {
                C30920b bVar = new C30920b(group, textView.getResources().getColor(R.color.u4), 4, z, str2, j);
                bVar.f80987b = str2;
                spannableString.setSpan(bVar, start, end, 33);
            } else {
                SpannableString spannableString2 = spannableString;
                String str4 = str2;
            }
        }
    }
}
