package com.bytedance.android.live.broadcast.p129b;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.api.exceptions.ApiException;
import com.bytedance.android.live.broadcast.dialog.IllegalReviewDialog;
import com.bytedance.android.live.broadcast.model.WaitingReviewInfo;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.p212e.C4374z;
import com.bytedance.android.livesdk.message.model.C8540cb;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.p533a.C10290a;
import com.bytedance.ies.p533a.C10291b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.b.a */
public final class C2442a extends C10291b<C2443a> implements C6310a {

    /* renamed from: d */
    private static final Spannable f7976d = new SpannableString("");

    /* renamed from: a */
    public int f7977a = 1;

    /* renamed from: b */
    public boolean f7978b;

    /* renamed from: c */
    public IllegalReviewDialog f7979c;

    /* renamed from: e */
    private String f7980e;

    /* renamed from: f */
    private long f7981f;

    /* renamed from: g */
    private C6309f f7982g;

    /* renamed from: h */
    private int f7983h = 10;

    /* renamed from: i */
    private String f7984i;

    /* renamed from: j */
    private C7321c f7985j;

    /* renamed from: k */
    private int f7986k;

    /* renamed from: l */
    private int f7987l;

    /* renamed from: com.bytedance.android.live.broadcast.b.a$a */
    public interface C2443a extends C10290a {
        /* renamed from: a */
        void mo8768a(CharSequence charSequence);

        /* renamed from: a */
        void mo8771a(boolean z);

        /* renamed from: a */
        void mo8772a(boolean z, CharSequence charSequence, CharSequence charSequence2);

        /* renamed from: a */
        void mo8773a(boolean z, CharSequence charSequence, String str);

        /* renamed from: a */
        void mo8774a(boolean z, String str);

        /* renamed from: b */
        void mo8777b(CharSequence charSequence);

        /* renamed from: e */
        void mo8782e();

        /* renamed from: f */
        void mo8783f();

        /* renamed from: g */
        void mo8784g();
    }

    /* renamed from: e */
    public final void mo8972e() {
        if (this.f7977a != 1) {
            this.f7978b = true;
            m10215h();
        }
    }

    /* renamed from: a */
    public final void mo8963a() {
        super.mo8963a();
        this.f7982g.removeMessages(1);
        this.f7982g.removeMessages(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo8974g() throws Exception {
        if (mo9140c() != null) {
            ((C2443a) mo9140c()).mo8774a(true, C3358ac.m12515a((int) R.string.epn));
        }
    }

    /* renamed from: b */
    public final void mo8968b() {
        if (mo9140c() != null) {
            ((C2443a) mo9140c()).mo8782e();
            ((C3495l) C3596c.m13172a(C3495l.class)).roomManager().mo10514a((Handler) this.f7982g, this.f7981f);
        }
    }

    /* renamed from: d */
    public final void mo8971d() {
        this.f7982g.removeMessages(2);
        this.f7977a = 3;
        C2515f.m10417f().mo9076c().mo9169d().getReviewInfo(this.f7981f).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2446d<Object>(this), (C7326g<? super Throwable>) new C2447e<Object>(this));
    }

    /* renamed from: f */
    public final void mo8973f() {
        this.f7982g.removeMessages(1);
        this.f7982g.removeMessages(2);
        this.f7977a = 1;
        if (this.f7985j != null) {
            this.f7985j.dispose();
            this.f7985j = null;
        }
        if (mo9140c() != null) {
            ((C2443a) mo9140c()).mo8771a(false);
            this.f7978b = false;
            ((C2443a) mo9140c()).mo8772a(false, (CharSequence) null, (CharSequence) null);
        }
        if (this.f7979c != null) {
            this.f7979c.dismiss();
        }
    }

    /* renamed from: h */
    private void m10215h() {
        SpannableString spannableString;
        if (mo9140c() != null) {
            String a = C3358ac.m12515a((int) R.string.f5w);
            if (this.f7986k <= 1) {
                spannableString = new SpannableString(C3358ac.m12515a((int) R.string.epl));
            } else {
                SpannableString spannableString2 = new SpannableString(C9078p.m27101a(Locale.CHINA, C3358ac.m12515a((int) R.string.f33), Integer.valueOf(this.f7987l)));
                spannableString2.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.amh)), 4, String.valueOf(this.f7987l).length() + 4, 18);
                spannableString = spannableString2;
            }
            ((C2443a) mo9140c()).mo8772a(true, (CharSequence) a, (CharSequence) spannableString);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo8969b(C3479d dVar) throws Exception {
        m10211a((WaitingReviewInfo) dVar.data);
    }

    /* renamed from: a */
    private void m10212a(Object obj) {
        if ((obj instanceof ApiException) && mo9140c() != null) {
            mo8973f();
        }
    }

    /* renamed from: b */
    private static CharSequence m10213b(C8540cb cbVar) {
        C4374z.m14749a(cbVar.f23497d, "");
        return C3358ac.m12515a((int) R.string.epp);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo8970b(Throwable th) throws Exception {
        this.f7982g.sendEmptyMessageDelayed(2, 10000);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8964a(C3479d dVar) throws Exception {
        if (this.f7982g != null) {
            Message obtainMessage = this.f7982g.obtainMessage(34);
            obtainMessage.obj = dVar.data;
            this.f7982g.sendMessage(obtainMessage);
        }
    }

    /* renamed from: c */
    private static CharSequence m10214c(C8540cb cbVar) {
        Spannable spannable = f7976d;
        C4374z.m14749a(cbVar.f23498e, "");
        if (cbVar.supportDisplayText()) {
            spannable = C4374z.m14749a(cbVar.baseMessage.f26000j, "");
        }
        if (spannable != f7976d || TextUtils.isEmpty(cbVar.f23494a)) {
            return spannable;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C3358ac.m12515a((int) R.string.feg));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C3358ac.m12521b((int) R.color.amh)), 8, spannableStringBuilder.length(), 33);
        StringBuilder sb = new StringBuilder();
        sb.append(C3358ac.m12515a((int) R.string.f56));
        sb.append(cbVar.f23494a);
        sb.append("\n");
        spannableStringBuilder.insert(0, sb.toString());
        return spannableStringBuilder;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8966a(Long l) throws Exception {
        if (mo9140c() != null) {
            ((C2443a) mo9140c()).mo8774a(false, C9078p.m27101a(Locale.CHINA, this.f7980e, Long.valueOf((10 - l.longValue()) - 1)));
        }
    }

    public final void handleMsg(Message message) {
        if (mo9140c() != null && this.f7977a != 1) {
            int i = message.what;
            if (i != 25) {
                switch (i) {
                    case 1:
                        ((C2443a) mo9140c()).mo8784g();
                        return;
                    case 2:
                        C2515f.m10417f().mo9076c().mo9169d().getReviewInfo(this.f7981f).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C2448f<Object>(this), (C7326g<? super Throwable>) new C2449g<Object>(this));
                        break;
                }
                return;
            }
            m10212a(message.obj);
        }
    }

    /* renamed from: a */
    private void m10211a(WaitingReviewInfo waitingReviewInfo) {
        this.f7986k = Math.abs(waitingReviewInfo.getWaitingCount());
        this.f7987l = Math.abs(waitingReviewInfo.getWaitingTime()) / 60;
        if (this.f7987l <= 0) {
            this.f7987l++;
        }
        if (this.f7978b) {
            m10215h();
        }
        if (!this.f7978b && this.f7979c.f11448j) {
            this.f7979c.mo9090a(false);
            this.f7979c.mo9094b(true);
            this.f7979c.mo9088a((CharSequence) C3358ac.m12515a((int) R.string.f5x));
            this.f7979c.mo9093b((CharSequence) C3358ac.m12515a((int) R.string.f57));
            if (this.f7986k <= 5) {
                this.f7977a = 5;
                this.f7979c.mo9091a(false, this.f7986k, this.f7987l);
                this.f7979c.mo9092a(true, (CharSequence) C3358ac.m12515a((int) R.string.epm));
            } else {
                this.f7977a = 4;
                this.f7979c.mo9091a(true, this.f7986k, this.f7987l);
                this.f7979c.mo9092a(false, (CharSequence) null);
            }
            List waitingReviewRules = waitingReviewInfo.getWaitingReviewRules();
            if (waitingReviewRules != null && !waitingReviewRules.isEmpty()) {
                this.f7979c.mo9089a(waitingReviewRules);
            }
        }
    }

    /* renamed from: a */
    public final void mo8965a(C8540cb cbVar) {
        if (mo9140c() != null && cbVar != null) {
            if (2 == cbVar.f23495b && this.f7977a == 1) {
                this.f7977a = 2;
                this.f7983h = 10;
                this.f7984i = cbVar.f23494a;
                ((C2443a) mo9140c()).mo8768a(m10213b(cbVar));
                ((C2443a) mo9140c()).mo8777b(m10214c(cbVar));
                String a = C9078p.m27101a(Locale.CHINA, this.f7980e, Integer.valueOf(this.f7983h));
                ((C2443a) mo9140c()).mo8773a(false, (CharSequence) null, (String) null);
                ((C2443a) mo9140c()).mo8774a(false, a);
                ((C2443a) mo9140c()).mo8771a(true);
                this.f7982g.sendEmptyMessageDelayed(1, 600000);
                if (this.f7985j == null || this.f7985j.isDisposed()) {
                    this.f7985j = C9057b.m27048a(0, 10, 1000, 1000, TimeUnit.MILLISECONDS).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19287a((C7323a) new C2444b(this)).mo19325f((C7326g<? super T>) new C2445c<Object>(this));
                }
                return;
            }
            if (3 == cbVar.f23495b && this.f7977a != 1) {
                if (mo9140c() != null) {
                    ((C2443a) mo9140c()).mo8783f();
                }
                mo8973f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo8967a(Throwable th) throws Exception {
        if (this.f7982g != null) {
            Message obtainMessage = this.f7982g.obtainMessage(34);
            obtainMessage.obj = th;
            this.f7982g.sendMessage(obtainMessage);
        }
    }

    public C2442a(long j, Context context) {
        this.f7981f = j;
        this.f7982g = new C6309f(this);
        StringBuilder sb = new StringBuilder();
        sb.append(C3358ac.m12515a((int) R.string.epn));
        sb.append("（%ds）");
        this.f7980e = sb.toString();
    }
}
