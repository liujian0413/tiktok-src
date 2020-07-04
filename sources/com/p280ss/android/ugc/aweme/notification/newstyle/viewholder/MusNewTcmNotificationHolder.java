package com.p280ss.android.ugc.aweme.notification.newstyle.viewholder;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.util.C13337d;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNewNotificationFragment;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity;
import com.p280ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity.C34493a;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.C34626j;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTcmNotificationHolder */
public final class MusNewTcmNotificationHolder extends MTNewBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    public static final C34582a f90299d = new C34582a(null);

    /* renamed from: e */
    private final View f90300e;

    /* renamed from: f */
    private final AvatarImageView f90301f;

    /* renamed from: g */
    private final TextView f90302g;

    /* renamed from: k */
    private final AutoRTLImageView f90303k;

    /* renamed from: l */
    private C34366n f90304l;

    /* renamed from: m */
    private final Fragment f90305m;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTcmNotificationHolder$a */
    public static final class C34582a {
        private C34582a() {
        }

        public /* synthetic */ C34582a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34599o.m111830a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89761c, (int) R.string.cjs).mo25750a();
        } else if (!C27326a.m89578a(view) && view != null) {
            if ((this.f90305m instanceof MusNewNotificationFragment) && C33213d.m107132a().mo85008c(61) > 0) {
                ((MusNewNotificationFragment) this.f90305m).f89934g = true;
            }
            C34493a aVar = MusNotificationDetailActivity.f89965a;
            Context context = view.getContext();
            C7573i.m23582a((Object) context, "it.context");
            aVar.mo87802a(context, 62, C33213d.m107132a().mo85008c(62));
            C34315c.m110984c(61);
        }
    }

    public MusNewTcmNotificationHolder(View view, Fragment fragment) {
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(fragment, "fragment");
        super(view);
        this.f90305m = fragment;
        View findViewById = view.findViewById(R.id.c7r);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.notification_root)");
        this.f90300e = findViewById;
        View findViewById2 = view.findViewById(R.id.c6v);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.notification_head)");
        this.f90301f = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.c60);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.notification_content)");
        this.f90302g = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bap);
        C7573i.m23582a((Object) findViewById4, "itemView.findViewById(R.….iv_notification_red_dot)");
        this.f90303k = (AutoRTLImageView) findViewById4;
        C34615d.m111861a(this.f90300e);
        C34626j.m111876a(this.f90301f);
        OnClickListener onClickListener = this;
        this.f90300e.setOnClickListener(onClickListener);
        this.f90301f.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo87885a(BaseNotice baseNotice, boolean z) {
        C7573i.m23587b(baseNotice, "notice");
        if (baseNotice.getTcmNotice() != null) {
            this.f90304l = baseNotice.getTcmNotice();
            C34366n nVar = this.f90304l;
            if (nVar != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Context context = this.f89761c;
                C7573i.m23582a((Object) context, "context");
                spannableStringBuilder.append(context.getResources().getString(R.string.bn0)).append(": ");
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append(8296);
                if (!TextUtils.isEmpty(nVar.f89564a)) {
                    spannableStringBuilder.append(nVar.f89564a);
                } else {
                    spannableStringBuilder.delete(spannableStringBuilder.length() - 2, spannableStringBuilder.length());
                }
                spannableStringBuilder.append(8297);
                if (z) {
                    this.f90303k.setVisibility(8);
                    C34586c.m111818a(this.f90302g, spannableStringBuilder, baseNotice, 5, C9738o.m28691a(this.f89761c) - ((int) C9738o.m28708b(this.f89761c, 132.0f)));
                    this.f90303k.setVisibility(8);
                } else {
                    this.f90302g.setText(spannableStringBuilder);
                    this.f90303k.setVisibility(0);
                }
                this.f90301f.setImageURI(C13337d.m39030a((int) R.drawable.ak4));
            }
        }
    }
}
