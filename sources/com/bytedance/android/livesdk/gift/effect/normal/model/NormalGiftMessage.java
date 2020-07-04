package com.bytedance.android.livesdk.gift.effect.normal.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.message.model.C8489ao;
import java.util.Map;

public final class NormalGiftMessage extends C8052a {

    /* renamed from: a */
    public int f21911a = 1;

    /* renamed from: b */
    public long f21912b;

    /* renamed from: c */
    public int f21913c;

    /* renamed from: d */
    public int f21914d;

    /* renamed from: e */
    public ImageModel f21915e;

    /* renamed from: f */
    public boolean f21916f;

    /* renamed from: g */
    public String f21917g;

    /* renamed from: h */
    public String f21918h;

    /* renamed from: p */
    public Map<String, Integer> f21919p;

    /* renamed from: q */
    public C8489ao f21920q;

    /* renamed from: r */
    public GiftType f21921r;

    /* renamed from: s */
    public boolean f21922s;

    public enum GiftType {
        normal,
        group
    }

    /* renamed from: b */
    public final void mo21009b() {
        if (this.f21922s) {
            this.f21913c += this.f21914d;
            this.f21914d = 0;
            return;
        }
        this.f21913c++;
        this.f21914d--;
    }

    /* renamed from: a */
    public final String mo21007a() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f21926l.getId()));
        sb.append("-");
        sb.append(String.valueOf(this.f21924j));
        sb.append("-");
        sb.append(String.valueOf(this.f21911a));
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo21010b(NormalGiftMessage normalGiftMessage) {
        int i = (normalGiftMessage.f21913c - this.f21913c) - this.f21914d;
        if (i > 0) {
            this.f21914d += i;
        }
    }

    /* renamed from: a */
    public final boolean mo21008a(NormalGiftMessage normalGiftMessage) {
        if ((normalGiftMessage.f21912b == 0 || normalGiftMessage.f21912b != this.f21912b) && normalGiftMessage.f21913c != this.f21913c + this.f21914d + 1 && !normalGiftMessage.f21922s) {
            return false;
        }
        return true;
    }

    public NormalGiftMessage(long j, long j2) {
        super(j, j2);
    }
}
