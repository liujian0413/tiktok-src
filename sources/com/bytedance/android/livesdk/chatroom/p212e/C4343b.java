package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.C4431aw;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdk.message.model.C8538c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdkapi.message.C9505f;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.b */
public abstract class C4343b<T extends C8538c> {

    /* renamed from: a */
    public T f12647a;

    /* renamed from: b */
    public int f12648b;

    /* renamed from: c */
    public int f12649c;

    /* renamed from: d */
    public boolean f12650d;

    /* renamed from: e */
    public Spannable f12651e;

    /* renamed from: f */
    protected Spannable f12652f;

    /* renamed from: g */
    public boolean f12653g;

    /* renamed from: h */
    public List<ImageModel> f12654h;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.b$a */
    public interface C4344a {
        /* renamed from: a */
        void mo12078a(Bitmap bitmap);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.b$b */
    public interface C4345b {
        /* renamed from: a */
        void mo12079a(Spannable spannable);
    }

    /* renamed from: e */
    public abstract User mo12065e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo12066f();

    /* renamed from: g */
    public String mo12067g() {
        return "#3d000000";
    }

    /* renamed from: k */
    public List<Integer> mo12074k() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract Spannable mo12069l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Spannable mo12070m() {
        return null;
    }

    /* renamed from: o */
    public final Spannable mo12076o() {
        if (this.f12652f == null) {
            this.f12652f = mo12070m();
        }
        return this.f12652f;
    }

    /* renamed from: i */
    public final ImageModel mo12072i() {
        if (!mo12066f()) {
            return null;
        }
        User e = mo12065e();
        if (e == null || e.getUserHonor() == null) {
            return null;
        }
        return e.getUserHonor().mo8707k();
    }

    /* renamed from: j */
    public final List<ImageModel> mo12073j() {
        if (!mo12066f()) {
            return null;
        }
        User e = mo12065e();
        if (e == null) {
            return null;
        }
        if (this.f12654h != null) {
            return this.f12654h;
        }
        return e.getNewUserBadges();
    }

    /* renamed from: p */
    public final long mo12077p() {
        if (mo12065e() == null) {
            return 0;
        }
        return mo12065e().getId();
    }

    /* renamed from: a */
    private void mo12060a() {
        if (this.f12647a.baseMessage != null && this.f12647a.baseMessage.f26000j != null) {
            C9505f fVar = this.f12647a.baseMessage.f26000j;
            String str = null;
            String str2 = fVar.f26014b;
            if (fVar.f26013a != null) {
                str = C8317b.m25387a().mo21482a(fVar.f26013a);
            }
            if (!(str == null && str2 == null)) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                }
                this.f12651e = C4374z.m14751a(str, fVar);
            }
        }
    }

    /* renamed from: n */
    public final Spannable mo12075n() {
        if (this.f12651e == null || TextUtils.isEmpty(this.f12651e.toString())) {
            if (this.f12647a.supportDisplayText()) {
                mo12060a();
            } else {
                this.f12651e = mo12069l();
            }
        }
        return this.f12651e;
    }

    public C4343b(T t) {
        this(t, 0);
    }

    /* renamed from: a */
    public final boolean mo12071a(Context context) {
        if (mo12065e() == null) {
            return false;
        }
        C9097a.m27146a().mo22267a((Object) new C4431aw(1, C8471f.m25743a(mo12065e())));
        return true;
    }

    public C4343b(T t, int i) {
        this.f12647a = t;
        this.f12648b = i;
    }
}
