package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.C27688b;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32269d;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MTBaseNotificationHolder */
public abstract class MTBaseNotificationHolder extends BaseNotificationHolder implements OnLongClickListener {

    /* renamed from: c */
    public Context f89761c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo87643a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo87655c();

    protected MTBaseNotificationHolder(View view) {
        super(view);
        this.f89761c = view.getContext();
        View findViewById = view.findViewById(mo87655c());
        if (findViewById != null && mo87643a()) {
            findViewById.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    public final void mo87667a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        m111205a(spannableStringBuilder, baseNotice, this.f89761c);
    }

    /* renamed from: a */
    public static void m111206a(String str, int i) {
        C6907h.m21524a("notification_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "click").mo59973a("account_type", str).mo59973a("client_order", String.valueOf(i)).mo59975b().f60753a);
    }

    /* renamed from: a */
    public static String m111204a(BaseNotice baseNotice, Context context) {
        if (baseNotice.getCreateTime() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(" ");
        sb.append(C32269d.m104788a(context, baseNotice.getCreateTime() * 1000));
        String replaceAll = sb.toString().replaceAll("(.)", "$1⁠");
        if (!C43127fh.m136806a(context)) {
            StringBuilder sb2 = new StringBuilder("‭");
            sb2.append(replaceAll);
            sb2.append(8237);
            replaceAll = sb2.toString();
        }
        return replaceAll;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo87669b(String str, String str2, String str3) {
        m111131a((Activity) null, str, str2, str3);
    }

    /* renamed from: a */
    public static void m111205a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context) {
        int i;
        int i2;
        String a = m111204a(baseNotice, context);
        if (a.indexOf(8237) >= 0) {
            i = 2;
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(a);
            if (C27688b.m90837a()) {
                i2 = R.color.bo;
            } else {
                i2 = R.color.ab5;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(i2)), (spannableStringBuilder.length() - a.length()) + i, spannableStringBuilder.length(), 17);
        }
    }

    /* renamed from: a */
    public final void mo87668a(String str, String str2, BaseNotice baseNotice, String str3, String str4) {
        mo87648a(str, str2, baseNotice.clientOrder, baseNotice, true, "", str4, str3);
    }
}
