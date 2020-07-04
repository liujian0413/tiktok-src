package com.p280ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34351a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MusAdHelperNotificationHolder */
public class MusAdHelperNotificationHolder extends MTBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private View f89779d;

    /* renamed from: e */
    private AvatarImageView f89780e;

    /* renamed from: f */
    private TextView f89781f;

    /* renamed from: g */
    private C34351a f89782g;

    /* renamed from: h */
    private Context f89783h;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo87655c() {
        return R.id.c7r;
    }

    public MusAdHelperNotificationHolder(View view) {
        super(view);
        this.f89783h = view.getContext();
        this.f89779d = view.findViewById(R.id.c7r);
        this.f89780e = (AvatarImageView) view.findViewById(R.id.c6v);
        this.f89781f = (TextView) view.findViewById(R.id.c60);
        C34615d.m111861a(this.f89779d);
        C34626j.m111876a(this.f89780e);
        this.f89779d.setOnClickListener(this);
        this.f89780e.setOnClickListener(this);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34398f.m111249a(this.f89783h)) {
            C10761a.m31399c(this.f89783h, (int) R.string.cjs).mo25750a();
            return;
        }
        MusNotificationDetailActivity.f89965a.mo87802a(this.f89783h, 21, C34315c.m110974a(21));
    }

    /* renamed from: a */
    public final void mo87673a(MusNotice musNotice, boolean z) {
        if (musNotice != null && musNotice.getAdHelperNotice() != null) {
            this.f89782g = musNotice.getAdHelperNotice();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f89783h.getString(R.string.bpf));
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            if (!TextUtils.isEmpty(this.f89782g.f89518b)) {
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append(this.f89782g.f89518b);
            }
            this.f89780e.setImageURI(C13337d.m39030a((int) R.drawable.bi3));
            mo87667a(spannableStringBuilder, (BaseNotice) musNotice);
            this.f89781f.setText(spannableStringBuilder);
        }
    }
}
