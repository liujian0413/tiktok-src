package com.p280ss.android.ugc.aweme.p313im.sdk.chat;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p022v4.content.C0683b;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.GroupNoticeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent.Key;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SystemContent.LinkTypeExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.view.GroupNameEditDialog;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.BlockResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C31085i;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31855aa;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31891bc;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r */
public final class C30987r {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$a */
    public static class C30990a extends ClickableSpan implements C6310a {

        /* renamed from: a */
        public CharSequence f81142a;

        /* renamed from: b */
        public Key f81143b;

        /* renamed from: c */
        private int f81144c;

        /* renamed from: d */
        private C6309f f81145d;

        /* renamed from: a */
        private void m100852a() {
            if (this.f81145d == null) {
                this.f81145d = new C6309f(Looper.getMainLooper(), this);
            }
        }

        /* renamed from: a */
        private static String m100851a(String str) {
            return C31085i.f81578a.mo81568a(C6961d.m21657a().mo18029b(str), str);
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f81144c);
            textPaint.setUnderlineText(false);
        }

        public final void handleMsg(Message message) {
            if (message.what == 1) {
                m100853a(message.obj);
                return;
            }
            if (message.what == 0) {
                m100853a(message.obj);
            }
        }

        /* renamed from: a */
        private static void m100853a(Object obj) {
            Context a = C6399b.m19921a();
            if (obj instanceof ApiServerException) {
                C9738o.m28697a(a, ((ApiServerException) obj).getErrorMsg());
            } else if (obj instanceof Exception) {
                C9738o.m28693a(a, (int) R.string.bj9);
            } else {
                if (obj instanceof BlockResponse) {
                    BlockResponse blockResponse = (BlockResponse) obj;
                    if (blockResponse.getBlockStaus() == 1) {
                        C9738o.m28693a(a, (int) R.string.bhd);
                    } else if (blockResponse.getBlockStaus() == 0) {
                        C9738o.m28693a(a, (int) R.string.br8);
                    }
                }
            }
        }

        public final void onClick(View view) {
            m100852a();
            if (this.f81143b.getAction() == 1) {
                C7077s.m22151a((Handler) this.f81145d, this.f81142a, m100851a(this.f81142a.toString()), 1, 1);
            } else if (this.f81143b.getAction() == 2) {
                C7077s.m22151a((Handler) this.f81145d, this.f81142a, m100851a(this.f81142a.toString()), 0, 0);
            } else if (this.f81143b.getAction() == 3) {
                IReportService iReportService = (IReportService) ServiceManager.get().getService(IReportService.class);
                if (iReportService != null) {
                    iReportService.showReportDialog((Activity) view.getContext(), "im", this.f81142a.toString(), this.f81142a.toString(), null);
                }
            } else if (this.f81143b.getAction() == 4) {
                if (LinkTypeExtra.isSafeWarningLink(this.f81143b)) {
                    C31858ad.m103509w("click");
                }
                C7195s.m22438a().mo18682a(this.f81143b.getLink());
            } else {
                if (this.f81143b.getAction() == 5) {
                    C31855aa.m103399a(view.getContext(), this.f81143b.getName());
                }
            }
        }

        private C30990a(int i, String str) {
            this.f81144c = i;
            this.f81142a = str;
            if (this.f81142a == null) {
                this.f81142a = "0";
            }
            m100852a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$b */
    public static class C30991b extends ClickableSpan {

        /* renamed from: a */
        public String f81146a;

        /* renamed from: b */
        private int f81147b;

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$b$a */
        public interface C30992a {
            /* renamed from: a */
            void mo81381a();

            /* renamed from: a */
            void mo81382a(View view);

            /* renamed from: b */
            void mo81383b(View view);
        }

        public final void onClick(View view) {
        }

        public C30991b(int i) {
            this.f81147b = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f81147b);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$c */
    static class C30993c extends ClickableSpan {

        /* renamed from: a */
        public String f81148a;

        /* renamed from: b */
        private Context f81149b;

        /* renamed from: c */
        private int f81150c;

        /* renamed from: d */
        private int f81151d;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f81150c);
        }

        public final void onClick(View view) {
            if (this.f81151d != 100121 || TextUtils.isEmpty(this.f81148a)) {
                if (!TextUtils.isEmpty(this.f81148a)) {
                    C31858ad.m103406a();
                    C31858ad.m103469e(this.f81148a, "chat", "click_name");
                    C31891bc.m103605a(this.f81148a);
                }
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", this.f81148a);
            C31858ad.m103437a("group_name_quick_click", (Map<String, String>) hashMap);
            new GroupNameEditDialog(this.f81149b, this.f81148a).show();
        }

        public C30993c(Context context, int i, int i2) {
            this.f81149b = context;
            this.f81150c = i;
            this.f81151d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$d */
    static class C30994d extends ClickableSpan {

        /* renamed from: a */
        private Context f81152a;

        /* renamed from: b */
        private int f81153b;

        /* renamed from: c */
        private com.bytedance.p263im.core.model.Message f81154c;

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f81153b);
        }

        public final void onClick(View view) {
            C7063bg.m22028a(C6405d.m19984g(), 7, (Object) this.f81154c);
        }

        private C30994d(Context context, int i, com.bytedance.p263im.core.model.Message message) {
            this.f81152a = context;
            this.f81153b = i;
            this.f81154c = message;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.r$e */
    static class C30995e extends ClickableSpan {

        /* renamed from: a */
        private int f81155a;

        public C30995e(int i) {
            this.f81155a = i;
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(this.f81155a);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C6956a.m21632a().mo18009f().updateApk(view.getContext());
            C6907h.m21525a("click_update_message", (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static boolean m100848a(final TextView textView, String str, String str2, C30991b bVar, final C30992a aVar) {
        SpannableString spannableString = new SpannableString(str);
        int indexOf = str.indexOf(str2);
        if (indexOf < 0) {
            textView.setText(str);
            return false;
        }
        spannableString.setSpan(bVar, indexOf, str2.length() + indexOf, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setOnTouchListener(new OnTouchListener() {

            /* renamed from: c */
            private long f81138c;

            /* renamed from: d */
            private Handler f81139d;

            /* renamed from: e */
            private Runnable f81140e;

            /* renamed from: b */
            private void m100850b() {
                if (this.f81139d != null && this.f81140e != null) {
                    this.f81139d.removeCallbacks(this.f81140e);
                }
            }

            /* renamed from: a */
            private void m100849a() {
                if (this.f81139d == null) {
                    this.f81139d = new Handler(Looper.getMainLooper());
                }
                if (this.f81140e == null) {
                    this.f81140e = new Runnable() {
                        public final void run() {
                            if (aVar != null) {
                                aVar.mo81383b(textView);
                            }
                        }
                    };
                }
                this.f81139d.postDelayed(this.f81140e, (long) ViewConfiguration.getLongPressTimeout());
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                TextView textView = (TextView) view;
                CharSequence text = textView.getText();
                if (text instanceof SpannableString) {
                    if (action == 0) {
                        m100850b();
                        m100849a();
                        this.f81138c = System.currentTimeMillis();
                    } else if (action == 1) {
                        m100850b();
                        int x = (int) motionEvent.getX();
                        int totalPaddingLeft = (x - textView.getTotalPaddingLeft()) + textView.getScrollX();
                        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
                        Layout layout = textView.getLayout();
                        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) totalPaddingLeft);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((SpannableString) text).getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (System.currentTimeMillis() - this.f81138c < ((long) ViewConfiguration.getLongPressTimeout())) {
                            if (clickableSpanArr.length != 0) {
                                if (aVar != null) {
                                    aVar.mo81382a(textView);
                                }
                            } else if (aVar != null) {
                                aVar.mo81381a();
                            }
                        }
                    } else if (action == 3) {
                        m100850b();
                    }
                }
                return true;
            }
        });
        textView.setVisibility(0);
        return true;
    }

    /* renamed from: a */
    public static void m100846a(SystemContent systemContent) {
        if (systemContent != null && systemContent.getTemplate() != null && systemContent.getTemplate().length > 0 && LinkTypeExtra.isSafeWarningLink(systemContent.getTemplate()[0])) {
            C31858ad.m103509w("show");
        }
    }

    /* renamed from: a */
    public static C30990a m100842a(int i, String str) {
        return new C30990a(i, str);
    }

    /* renamed from: a */
    public static void m100845a(TextView textView, String str, int i) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        String string = C6399b.m19921a().getString(R.string.biw);
        if (str.contains(string)) {
            C30995e eVar = new C30995e(i);
            int indexOf = str.indexOf(string);
            spannableString.setSpan(eVar, indexOf, string.length() + indexOf, 33);
        }
        textView.setText(spannableString);
    }

    /* renamed from: a */
    public static void m100847a(SystemContent systemContent, TextView textView, String str) {
        if (!TextUtils.isEmpty(systemContent.getGroupNoticeTips())) {
            try {
                GroupNoticeContent groupNoticeContent = (GroupNoticeContent) C31913m.m103667a(systemContent.getGroupNoticeTips(), GroupNoticeContent.class);
                if (groupNoticeContent != null && !TextUtils.isEmpty(groupNoticeContent.getNoticeText())) {
                    textView.setText(groupNoticeContent.getNoticeText());
                    textView.setVisibility(0);
                }
            } catch (Exception unused) {
            }
        } else {
            Key[] template = systemContent.getTemplate();
            if (template != null && template.length > 0) {
                Context a = C6399b.m19921a();
                String tips = systemContent.getTips();
                for (Key key : template) {
                    if (key != null && !TextUtils.isEmpty(key.getKey()) && !TextUtils.isEmpty(key.getName())) {
                        tips = tips.replace(C1642a.m8034a("{{%s}}", new Object[]{key.getKey()}), key.getName());
                    }
                }
                SpannableString spannableString = new SpannableString(tips);
                for (int i = 0; i < template.length; i++) {
                    Key key2 = template[i];
                    if (key2 != null && !TextUtils.isEmpty(key2.getKey()) && !TextUtils.isEmpty(key2.getName())) {
                        int indexOf = tips.indexOf(template[i].getName());
                        if (indexOf >= 0) {
                            C30990a a2 = m100842a(C0683b.m2912c(a, R.color.b0), str);
                            a2.f81143b = key2;
                            spannableString.setSpan(a2, indexOf, key2.getName().length() + indexOf, 33);
                        }
                    }
                }
                textView.setText(spannableString);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setOnLongClickListener(C30996s.f81156a);
                textView.setHighlightColor(-16776961);
                textView.setVisibility(0);
            } else if (TextUtils.isEmpty(systemContent.getTips())) {
                textView.setVisibility(8);
            } else {
                textView.setText(systemContent.getTips());
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public static void m100843a(Context context, TextView textView, String str, String str2, int i, com.bytedance.p263im.core.model.Message message) {
        String str3;
        SpannableString spannableString = new SpannableString(str);
        if (str.contains(str2)) {
            C30994d dVar = new C30994d(context, i, message);
            int indexOf = str.indexOf(str2);
            spannableString.setSpan(dVar, indexOf, str2.length() + indexOf, 33);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        if (C7063bg.m22049a(context)) {
            str3 = "open";
        } else {
            str3 = "install";
        }
        C31858ad.m103409a(7, str3, "duoshan_banner_show");
    }

    /* renamed from: a */
    public static void m100844a(Context context, TextView textView, String str, String str2, GroupNoticeContent groupNoticeContent, int i, String str3) {
        TextView textView2 = textView;
        GroupNoticeContent groupNoticeContent2 = groupNoticeContent;
        int i2 = i;
        int color = C6399b.m19921a().getResources().getColor(R.color.ax8);
        SpannableString spannableString = new SpannableString(str);
        if (TextUtils.isEmpty(str2) || !str.contains(str2)) {
            Context context2 = context;
        } else {
            Context context3 = context;
            C30993c cVar = new C30993c(context, color, i2);
            int indexOf = str.indexOf(str2);
            if (i2 == 100121) {
                cVar.f81148a = str3;
            }
            spannableString.setSpan(cVar, indexOf, str2.length() + indexOf, 33);
        }
        if (groupNoticeContent.isNormalOrder()) {
            SpannableString spannableString2 = spannableString;
            String str4 = str;
            GroupNoticeContent groupNoticeContent3 = groupNoticeContent;
            int i3 = i;
            int a = m100841a(context, spannableString2, str4, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent3, i3, 0);
            m100841a(context, spannableString2, str4, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent3, i3, a);
        } else {
            SpannableString spannableString3 = spannableString;
            String str5 = str;
            GroupNoticeContent groupNoticeContent4 = groupNoticeContent;
            int i4 = i;
            int a2 = m100841a(context, spannableString3, str5, groupNoticeContent2.getPassiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getPassiveUsers(), groupNoticeContent4, i4, 0);
            m100841a(context, spannableString3, str5, groupNoticeContent2.getActiveText(groupNoticeContent.isDefinedType()), groupNoticeContent.getActiveUsers(), groupNoticeContent4, i4, a2);
        }
        if (!TextUtils.isEmpty(spannableString)) {
            textView.setVisibility(0);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* renamed from: a */
    private static int m100841a(Context context, SpannableString spannableString, String str, String str2, List<IMUser> list, GroupNoticeContent groupNoticeContent, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return i2;
        }
        int color = C6399b.m19921a().getResources().getColor(R.color.ax8);
        if (!TextUtils.isEmpty(str2)) {
            i2 = str.indexOf(str2, i2);
            if (i2 != -1) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    IMUser iMUser = (IMUser) list.get(i3);
                    if (!groupNoticeContent.isDefinedType() || !TextUtils.equals(iMUser.getUid(), C7074e.m22069b().toString())) {
                        String displayName = iMUser.getDisplayName();
                        C30993c cVar = new C30993c(context, color, i);
                        cVar.f81148a = iMUser.getUid();
                        spannableString.setSpan(cVar, i2, displayName.length() + i2, 17);
                        i2 += displayName.length() + 1;
                    }
                }
            }
        }
        return i2;
    }
}
