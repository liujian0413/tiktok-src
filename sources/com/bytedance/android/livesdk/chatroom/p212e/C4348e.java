package com.bytedance.android.livesdk.chatroom.p212e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4414af;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b.C4345b;
import com.bytedance.android.livesdk.message.model.C8682o;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.widget.C9238b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9456c;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.common.util.C19290j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.Collection;
import p346io.reactivex.C7498y;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.e */
public final class C4348e extends C4343b<C8682o> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8682o) this.f12647a).f23633a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8682o) this.f12647a).f23633a, "", " ", R.color.alu, R.color.alv, false);
    }

    /* renamed from: a */
    public final boolean mo12060a() {
        if (((C8682o) this.f12647a).f23636d == null || C6307b.m19566a((Collection<T>) ((C8682o) this.f12647a).f23636d.getUrls()) || TextUtils.isEmpty((CharSequence) ((C8682o) this.f12647a).f23636d.getUrls().get(0))) {
            return false;
        }
        return true;
    }

    public C4348e(C8682o oVar) {
        super(oVar);
    }

    /* renamed from: a */
    public final void mo12080a(TextView textView, Room room, C4345b bVar) {
        final WeakReference weakReference = new WeakReference(textView);
        final float f = textView.getResources().getDisplayMetrics().density / 3.0f;
        C9456c l = TTLiveSDKContext.getHostService().mo22371l();
        ImageModel imageModel = ((C8682o) this.f12647a).f23636d;
        final Room room2 = room;
        final C4345b bVar2 = bVar;
        C43491 r0 = new C9459c() {
            /* renamed from: a */
            public final void mo9922a(C9457a aVar) {
            }

            /* renamed from: a */
            public final void mo9921a(Bitmap bitmap) {
                int i;
                if (weakReference.get() != null && bitmap != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                    float width = ((float) bitmap.getWidth()) * f;
                    float height = ((float) bitmap.getHeight()) * f;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(((TextView) weakReference.get()).getResources(), copy);
                    bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                    C9238b bVar = new C9238b(bitmapDrawable);
                    spannableStringBuilder.append("0");
                    if (spannableStringBuilder.length() > 0) {
                        i = spannableStringBuilder.length() - 1;
                    } else {
                        i = spannableStringBuilder.length();
                    }
                    spannableStringBuilder.setSpan(bVar, i, spannableStringBuilder.length(), 33);
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.setSpan(new ClickableSpan() {
                        public final void onClick(View view) {
                            if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
                                TTLiveSDKContext.getHostService().mo22367h().mo22167a(((TextView) weakReference.get()).getContext(), C8987h.m26865a().mo22189a(C3358ac.m12515a((int) R.string.efb)).mo22188a(0).mo22190a()).mo19189a((C7498y<? super T>) new C8986g<Object>());
                                return;
                            }
                            if (((C8682o) C4348e.this.f12647a).f23637e == 1 && !TextUtils.isEmpty(((C8682o) C4348e.this.f12647a).f23638f)) {
                                C19290j jVar = new C19290j(((C8682o) C4348e.this.f12647a).f23638f);
                                if (!(room2 == null || room2.getOwner() == null)) {
                                    jVar.mo51187a("anchor_id", room2.getOwner().getId());
                                    jVar.mo51187a("room_id", room2.getId());
                                }
                                jVar.mo51187a("user_id", TTLiveSDKContext.getHostService().mo22367h().mo22179b());
                                C4414af afVar = new C4414af(jVar.mo51184a(), "", 17, 0, 0, 8);
                                afVar.f12832h = true;
                                C9097a.m27146a().mo22267a((Object) afVar);
                            }
                        }
                    }, i, spannableStringBuilder.length(), 33);
                    if (bVar2 != null) {
                        bVar2.mo12079a(spannableStringBuilder);
                    }
                }
            }
        };
        l.mo23192a(imageModel, (C9459c) r0);
    }
}
