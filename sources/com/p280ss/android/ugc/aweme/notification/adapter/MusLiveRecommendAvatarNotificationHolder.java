package com.p280ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.p1444ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.notification.util.C34607a;
import com.p280ss.android.ugc.aweme.notification.util.C34615d;
import com.p280ss.android.ugc.aweme.notification.util.NotificationBoldSpan;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder */
public class MusLiveRecommendAvatarNotificationHolder extends MTBaseNotificationHolder implements OnClickListener {

    /* renamed from: d */
    private ConstraintLayout f89791d;

    /* renamed from: e */
    private AvatarImageView f89792e;

    /* renamed from: f */
    private LiveCircleView f89793f;

    /* renamed from: g */
    private TextView f89794g;

    /* renamed from: h */
    private Button f89795h;

    /* renamed from: i */
    private C34362j f89796i;

    /* renamed from: j */
    private Context f89797j;

    /* renamed from: k */
    private C34607a f89798k;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo87643a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo87655c() {
        return R.id.c7r;
    }

    /* renamed from: d */
    public final void mo87676d() {
        if (this.f89798k != null) {
            this.f89798k.mo87903b();
        }
    }

    /* renamed from: e */
    public final void mo87677e() {
        if (this.f89798k != null) {
            this.f89798k.mo87900a();
        }
    }

    public MusLiveRecommendAvatarNotificationHolder(View view) {
        super(view);
        this.f89797j = view.getContext();
        this.f89791d = (ConstraintLayout) view.findViewById(R.id.c7r);
        this.f89792e = (AvatarImageView) view.findViewById(R.id.b3s);
        this.f89793f = (LiveCircleView) view.findViewById(R.id.b3w);
        this.f89794g = (TextView) view.findViewById(R.id.c60);
        this.f89795h = (Button) view.findViewById(R.id.c5q);
        this.f89795h.getLayoutParams().width = C34615d.m111860a(this.f89797j);
        C34615d.m111861a((View) this.f89791d);
        C34615d.m111861a((View) this.f89792e);
        C34615d.m111861a((View) this.f89795h);
        this.f89795h.setOnClickListener(this);
        this.f89791d.setOnClickListener(this);
        this.f89792e.setOnClickListener(this);
        this.f89798k = new C34607a();
        this.f89798k.mo87901a((View) this.f89791d);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C34400h.m111251a(C6399b.m19921a())) {
            C10761a.m31399c(this.f89797j, (int) R.string.cjs).mo25750a();
            return;
        }
        int id = view.getId();
        if (id == R.id.c7r || id == R.id.c5q || id == R.id.b3s || id == R.id.b3w) {
            m111206a("live", getLayoutPosition());
            Bundle bundle = new Bundle();
            bundle.putString("style", "head");
            bundle.putString("position", "live_merge");
            ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logEnterLiveMerge("message", "new_type");
            ((NoticeLiveServiceAdapter) ServiceManager.get().getService(NoticeLiveServiceAdapter.class)).enterLiveConverge(this.f89797j, bundle);
        }
    }

    /* renamed from: a */
    public final void mo87675a(MusNotice musNotice, boolean z) {
        if (musNotice != null && musNotice.getRecommendAvatars() != null) {
            this.f89796i = musNotice.getRecommendAvatars();
            this.f89798k.mo87902a(this.f89796i.f89551a);
            this.f89798k.mo87900a();
            String charSequence = this.f89794g.getText().toString();
            if (!TextUtils.isEmpty(charSequence)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(charSequence);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                this.f89794g.setText(spannableStringBuilder);
            }
        }
    }
}
