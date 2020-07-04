package com.p280ss.android.ugc.aweme.notification.newstyle.delegate;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34351a;
import com.p280ss.android.ugc.aweme.notification.adapter.MTBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.utils.C43057di;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.delegate.MusAdHelperDetailHolder */
public final class MusAdHelperDetailHolder extends MTBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private final View f90045d;

    /* renamed from: e */
    private final AvatarImageView f90046e;

    /* renamed from: f */
    private final TextView f90047f;

    /* renamed from: g */
    private final RemoteImageView f90048g;

    /* renamed from: h */
    private BaseNotice f90049h;

    /* renamed from: i */
    private C34351a f90050i;

    /* renamed from: j */
    private Context f90051j;

    /* renamed from: c */
    public final int mo87655c() {
        return R.id.c7r;
    }

    public MusAdHelperDetailHolder(View view) {
        C7573i.m23587b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90045d = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90046e = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90047f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.awy);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.id.ic_cover)");
        this.f90048g = (RemoteImageView) findViewById4;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "itemView.context");
        this.f90051j = context;
        C34615d.m111861a(this.f90045d);
        C34626j.m111876a(this.f90048g);
        C34626j.m111876a(this.f90046e);
        OnClickListener onClickListener = this;
        this.f90048g.setOnClickListener(onClickListener);
        this.f90045d.setOnClickListener(onClickListener);
        this.f90046e.setOnClickListener(onClickListener);
        this.f89662b = C43057di.m136601a(this.f90051j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r0 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r9) {
        /*
            r8 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r9)
            android.content.Context r0 = r8.f90051j
            boolean r0 = com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34529e.m111665a(r0)
            if (r0 != 0) goto L_0x0018
            android.content.Context r9 = r8.f90051j
            r0 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r9 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r9, r0)
            r9.mo25750a()
            return
        L_0x0018:
            if (r9 != 0) goto L_0x001b
            return
        L_0x001b:
            int r9 = r9.getId()
            r0 = 2131300268(0x7f090fac, float:1.821856E38)
            r1 = 0
            if (r9 == r0) goto L_0x003e
            r0 = 2131300235(0x7f090f8b, float:1.8218494E38)
            if (r9 != r0) goto L_0x002b
            goto L_0x003e
        L_0x002b:
            r0 = 2131298499(0x7f0908c3, float:1.8214973E38)
            if (r9 != r0) goto L_0x003d
            com.ss.android.ugc.aweme.router.s r9 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            com.ss.android.ugc.aweme.notice.repo.list.bean.a r0 = r8.f90050i
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.f89519c
        L_0x003a:
            r9.mo18682a(r1)
        L_0x003d:
            return
        L_0x003e:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r7 = r9
            java.util.Map r7 = (java.util.Map) r7
            java.lang.String r9 = "notice_id"
            com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r0 = r8.f90049h
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = r0.getNid()
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            java.lang.String r0 = ""
        L_0x0054:
            r7.put(r9, r0)
            java.lang.String r9 = "aid"
            java.lang.String r0 = "1233"
            r7.put(r9, r0)
            java.lang.String r9 = "channel"
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r2 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r0 = r0.getService(r2)
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r0 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r0
            java.lang.String r0 = r0.getChannel()
            r7.put(r9, r0)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r9 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper> r0 = com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper.class
            java.lang.Object r9 = r9.getService(r0)
            r2 = r9
            com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper r2 = (com.p280ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper) r2
            android.content.Context r3 = r8.f90051j
            com.ss.android.ugc.aweme.notice.repo.list.bean.a r9 = r8.f90050i
            if (r9 == 0) goto L_0x0088
            java.lang.String r1 = r9.f89520d
        L_0x0088:
            r4 = r1
            android.content.Context r9 = r8.f90051j
            r0 = 2131823883(0x7f110d0b, float:1.9280578E38)
            java.lang.String r9 = r9.getString(r0)
            if (r9 != 0) goto L_0x0096
            java.lang.String r9 = ""
        L_0x0096:
            r5 = r9
            r6 = 1
            r2.openAdWebUrl(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.delegate.MusAdHelperDetailHolder.onClick(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo87830a(BaseNotice baseNotice, boolean z) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        CharSequence charSequence5;
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getAdHelperNotice() != null) {
            this.f90049h = baseNotice;
            this.f90050i = baseNotice.getAdHelperNotice();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f89662b) {
                spannableStringBuilder.append(8296);
            }
            C34351a aVar = this.f90050i;
            UrlModel urlModel = null;
            if (aVar != null) {
                charSequence = aVar.f89518b;
            } else {
                charSequence = null;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C34351a aVar2 = this.f90050i;
                if (aVar2 != null) {
                    charSequence4 = aVar2.f89518b;
                } else {
                    charSequence4 = null;
                }
                spannableStringBuilder.append(charSequence4);
                C34351a aVar3 = this.f90050i;
                if (aVar3 != null) {
                    charSequence5 = aVar3.f89517a;
                } else {
                    charSequence5 = null;
                }
                if (!TextUtils.isEmpty(charSequence5)) {
                    spannableStringBuilder.append(": ");
                }
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            C34351a aVar4 = this.f90050i;
            if (aVar4 != null) {
                charSequence2 = aVar4.f89517a;
            } else {
                charSequence2 = null;
            }
            if (!TextUtils.isEmpty(charSequence2)) {
                C34351a aVar5 = this.f90050i;
                if (aVar5 != null) {
                    charSequence3 = aVar5.f89517a;
                } else {
                    charSequence3 = null;
                }
                spannableStringBuilder.append(charSequence3);
            }
            if (this.f89662b) {
                spannableStringBuilder.append(8297);
            }
            this.f90046e.setImageURI(C13337d.m39030a((int) R.drawable.bi3));
            mo87667a(spannableStringBuilder, baseNotice);
            this.f90047f.setText(spannableStringBuilder);
            RemoteImageView remoteImageView = this.f90048g;
            C34351a aVar6 = this.f90050i;
            if (aVar6 != null) {
                urlModel = aVar6.f89522f;
            }
            C23323e.m76524b(remoteImageView, urlModel);
        }
    }
}
