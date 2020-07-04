package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View.OnClickListener;
import com.google.gson.C6600e;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21699c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.c */
public final class C36665c {

    /* renamed from: a */
    public NoticeView f96284a;

    /* renamed from: b */
    public OnClickListener f96285b;

    /* renamed from: c */
    public OnClickListener f96286c;

    /* renamed from: d */
    private Context f96287d;

    /* renamed from: a */
    public final void mo93013a() {
        this.f96284a.setVisibility(8);
    }

    /* renamed from: b */
    private void m118314b() {
        HashMap hashMap;
        int i;
        HashMap hashMap2;
        C6600e eVar = new C6600e();
        try {
            hashMap = (HashMap) new C6600e().mo15975a((String) C23060u.m75742a().mo60032B().mo59877d(), new C6597a<HashMap<String, Integer>>() {
            }.type);
        } catch (JsonSyntaxException unused) {
            hashMap = null;
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        if (hashMap.containsKey(C21115b.m71197a().getCurUserId())) {
            i = ((Integer) hashMap.get(C21115b.m71197a().getCurUserId())).intValue();
        } else {
            i = 0;
        }
        hashMap.put(C21115b.m71197a().getCurUserId(), Integer.valueOf(i + 1));
        C23060u.m75742a().mo60032B().mo59871a(eVar.mo15979b((Object) hashMap));
        try {
            hashMap2 = (HashMap) new C6600e().mo15975a((String) C23060u.m75742a().mo60031A().mo59877d(), new C6597a<HashMap<String, Long>>() {
            }.type);
        } catch (JsonSyntaxException unused2) {
            hashMap2 = null;
        }
        if (hashMap2 == null) {
            hashMap2 = new HashMap();
        }
        hashMap2.put(C21115b.m71197a().getCurUserId(), Long.valueOf(System.currentTimeMillis()));
        C23060u.m75742a().mo60031A().mo59871a(eVar.mo15979b((Object) hashMap2));
    }

    /* renamed from: b */
    private void m118315b(C21699c cVar) {
        this.f96284a.setVisibility(0);
        m118313a(cVar);
        this.f96284a.setOnInternalClickListener(new C26926a() {
            /* renamed from: a */
            public final void mo69646a() {
                if (C36665c.this.f96285b != null) {
                    C36665c.this.f96285b.onClick(C36665c.this.f96284a);
                }
                C36665c.this.mo93013a();
            }

            /* renamed from: b */
            public final void mo69647b() {
                C6907h.m21524a("close_profile_alert_show", (Map) C22984d.m75611a().f60753a);
                C36665c.this.mo93013a();
                if (C36665c.this.f96286c != null) {
                    C36665c.this.f96286c.onClick(C36665c.this.f96284a);
                }
            }
        });
        m118314b();
    }

    /* renamed from: a */
    private void m118313a(C21699c cVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (cVar.f58118c == 2) {
            spannableStringBuilder.append(this.f96287d.getString(R.string.flq, new Object[]{Integer.valueOf((int) cVar.f58117b)}));
        } else if (cVar.f58118c == 1) {
            spannableStringBuilder.append(this.f96287d.getString(R.string.flp, new Object[]{Integer.valueOf((int) cVar.f58117b)}));
        } else {
            this.f96284a.setVisibility(8);
        }
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f96287d.getString(R.string.bbl));
        spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.f96287d, R.color.a4r)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f96284a.setTitleText((CharSequence) spannableStringBuilder);
    }

    public C36665c(NoticeView noticeView, Context context, C21699c cVar, OnClickListener onClickListener) {
        this(noticeView, context, cVar, onClickListener, null);
    }

    public C36665c(NoticeView noticeView, Context context, C21699c cVar, OnClickListener onClickListener, OnClickListener onClickListener2) {
        this.f96284a = noticeView;
        this.f96287d = context;
        this.f96285b = onClickListener;
        this.f96286c = onClickListener2;
        m118315b(cVar);
    }
}
