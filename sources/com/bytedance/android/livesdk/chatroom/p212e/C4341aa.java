package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.message.model.C8557cr;
import com.bytedance.android.livesdk.message.model.C8557cr.C8558a;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.aa */
public final class C4341aa extends C4343b<C8557cr> {

    /* renamed from: i */
    private boolean f12644i;

    /* renamed from: j */
    private IUser f12645j = TTLiveSDKContext.getHostService().mo22367h().mo22165a();

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.aa$a */
    public static class C4342a {

        /* renamed from: a */
        public String f12646a;

        C4342a(String str) {
            this.f12646a = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return false;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8557cr) this.f12647a).f23586a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        return C4372y.m14743a(((C8557cr) this.f12647a).mo21684a(), (int) R.color.aei);
    }

    /* renamed from: a */
    private int m14610a() {
        if (this.f12645j == null || ((C8557cr) this.f12647a).f23586a == null) {
            return 0;
        }
        return this.f12644i ? R.color.aqk : R.color.aqk;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        String str;
        CharSequence charSequence;
        boolean z;
        if (this.f12647a == null) {
            return null;
        }
        Context context = TTLiveSDKContext.getHostService().mo22360a().context();
        if (context == null) {
            return null;
        }
        if (!(this.f12645j == null || ((C8557cr) this.f12647a).f23586a == null)) {
            if (this.f12645j.getId() == ((C8557cr) this.f12647a).f23586a.getId()) {
                z = true;
            } else {
                z = false;
            }
            if (z && ((C8557cr) this.f12647a).f23587b != null) {
                C9097a.m27146a().mo22267a((Object) new C4342a(((C8557cr) this.f12647a).f23587b.f23591d));
            }
        }
        User user = ((C8557cr) this.f12647a).f23586a;
        C8558a aVar = ((C8557cr) this.f12647a).f23587b;
        if (user != null) {
            str = user.getNickName();
        } else {
            str = null;
        }
        if (aVar != null) {
            charSequence = String.valueOf(aVar.f23588a);
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(charSequence)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(context.getString(R.string.f9b, new Object[]{charSequence}));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(m14610a())), 0, str.length(), 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.aqj)), str.length(), str.length() + 6, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(m14610a())), str.length() + 6, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public C4341aa(C8557cr crVar) {
        super(crVar);
    }
}
