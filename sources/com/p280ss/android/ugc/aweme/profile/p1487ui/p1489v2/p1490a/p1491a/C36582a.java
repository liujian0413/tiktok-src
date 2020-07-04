package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1491a;

import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusAbsProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.C36580a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.C36581a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.a.a */
public abstract class C36582a extends C36581a {

    /* renamed from: b */
    private ImageView f95992b;

    /* renamed from: c */
    private String f95993c;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.a.a$a */
    static final class C36583a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36582a f95994a;

        C36583a(C36582a aVar) {
            this.f95994a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f95994a.mo92813g();
            C36580a.m118030a("email", this.f95994a.f95991a.f94531Q);
        }
    }

    /* renamed from: g */
    public final void mo92813g() {
        if (!TextUtils.isEmpty(this.f95993c)) {
            StringBuilder sb = new StringBuilder("mailto:");
            sb.append(this.f95993c);
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb.toString()));
            try {
                FragmentActivity activity = this.f95991a.getActivity();
                if (activity != null) {
                    activity.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }
    }

    public C36582a(MusAbsProfileFragment musAbsProfileFragment) {
        C7573i.m23587b(musAbsProfileFragment, "owner");
        super(musAbsProfileFragment);
    }

    /* renamed from: a */
    public final void mo92801a(View view) {
        ImageView imageView;
        super.mo92801a(view);
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.c0x);
        } else {
            imageView = null;
        }
        this.f95992b = imageView;
        ImageView imageView2 = this.f95992b;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C36583a(this));
        }
    }

    /* renamed from: a */
    public final void mo92802a(User user, View view, TextView textView) {
        super.mo92802a(user, view, textView);
        if (user != null) {
            int i = 8;
            if (view != null) {
                view.setVisibility(8);
            }
            ImageView imageView = this.f95992b;
            if (imageView != null) {
                if (!TextUtils.isEmpty(user.getBioEmail())) {
                    this.f95993c = user.getBioEmail();
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
    }
}
