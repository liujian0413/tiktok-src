package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.C4865aa;
import com.bytedance.android.livesdk.chatroom.model.C4869ad;
import com.bytedance.android.livesdk.chatroom.model.C4873ah;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b;
import com.bytedance.android.livesdk.utils.p425a.C9023a;
import com.google.gson.p276a.C6593c;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bh */
public class C8512bh extends C8538c {
    @C6593c(mo15949a = "user")

    /* renamed from: a */
    public User f23362a;
    @C6593c(mo15949a = "box_id")

    /* renamed from: b */
    public long f23363b;
    @C6593c(mo15949a = "send_time")

    /* renamed from: c */
    public long f23364c;
    @C6593c(mo15949a = "delay_time")

    /* renamed from: d */
    public int f23365d;
    @C6593c(mo15949a = "box_type")

    /* renamed from: e */
    public int f23366e;
    @C6593c(mo15949a = "title")

    /* renamed from: f */
    public String f23367f;
    @C6593c(mo15949a = "diamond_count")

    /* renamed from: g */
    public int f23368g;
    @C6593c(mo15949a = "priority")

    /* renamed from: h */
    public int f23369h;
    @C6593c(mo15949a = "large")

    /* renamed from: i */
    public boolean f23370i;
    @C6593c(mo15949a = "description_list")

    /* renamed from: j */
    public List<C4869ad> f23371j;
    @C6593c(mo15949a = "background")

    /* renamed from: k */
    public ImageModel f23372k;
    @C6593c(mo15949a = "is_official")

    /* renamed from: l */
    public boolean f23373l;
    @C6593c(mo15949a = "lucky_icon")

    /* renamed from: m */
    public ImageModel f23374m;
    @C6593c(mo15949a = "meta")

    /* renamed from: n */
    public C4873ah f23375n;
    @C6593c(mo15949a = "display_duration")

    /* renamed from: o */
    public long f23376o;
    @C6593c(mo15949a = "box_status")

    /* renamed from: p */
    public int f23377p;
    @C6593c(mo15949a = "flat_duration")

    /* renamed from: q */
    public int f23378q;
    @C6593c(mo15949a = "unpack_type")

    /* renamed from: r */
    public int f23379r;
    @C6593c(mo15949a = "rush_condition")

    /* renamed from: s */
    public int f23380s;
    @C6593c(mo15949a = "business_type")

    /* renamed from: t */
    public long f23381t;
    @C6593c(mo15949a = "extra")

    /* renamed from: u */
    public C8539ca f23382u;

    /* renamed from: v */
    public transient boolean f23383v;

    /* renamed from: w */
    public transient boolean f23384w;

    /* renamed from: x */
    public transient C4865aa f23385x;

    /* renamed from: y */
    public transient WeakReference<C4343b> f23386y;

    /* renamed from: z */
    public transient boolean f23387z = true;

    public boolean canText() {
        return true;
    }

    /* renamed from: a */
    public final long mo21657a() {
        return (this.f23364c + ((long) (this.f23365d * 1000))) - C9023a.m26968a();
    }
}
