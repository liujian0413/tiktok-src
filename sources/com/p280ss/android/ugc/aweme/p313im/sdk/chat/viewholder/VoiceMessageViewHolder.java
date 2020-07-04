package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.VoiceMessageViewHolder */
public class VoiceMessageViewHolder extends BaseViewHolder<AudioContent> {

    /* renamed from: m */
    protected ImageView f81423m;

    /* renamed from: n */
    protected TextView f81424n;

    /* renamed from: o */
    protected View f81425o;

    /* renamed from: p */
    protected C31050o f81426p;

    /* renamed from: q */
    public String f81427q = "";

    /* renamed from: r */
    private final float f81428r = ((float) ((int) C9738o.m28708b(C6399b.m19921a(), 244.0f)));

    /* renamed from: s */
    private final float f81429s = ((float) ((int) C9738o.m28708b(C6399b.m19921a(), 71.0f)));

    /* renamed from: t */
    private final int f81430t = ((int) C9738o.m28708b(C6399b.m19921a(), 3.0f));

    /* renamed from: u */
    private int f81431u = R.drawable.cg;

    /* renamed from: v */
    private int f81432v = R.drawable.a_c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81197e = (View) mo81425a((int) R.id.a1q);
        this.f81423m = (ImageView) mo81425a((int) R.id.edz);
        this.f81424n = (TextView) mo81425a((int) R.id.ee0);
        this.f81425o = (View) mo81425a((int) R.id.ee4);
        this.f81195c = (ImageView) mo81425a((int) R.id.dar);
        this.f81426p = new C31050o(this.f81195c);
        if (this.f81197e != null) {
            Drawable background = this.f81197e.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    /* renamed from: a */
    private void m101239a(boolean z) {
        if (z) {
            if (this.f81423m.getBackground() instanceof AnimationDrawable) {
                ((AnimationDrawable) this.f81423m.getBackground()).stop();
            }
            this.f81423m.setBackgroundResource(this.f81432v);
            return;
        }
        this.f81423m.setBackgroundResource(this.f81431u);
        ((AnimationDrawable) this.f81423m.getBackground()).start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo81482b(int i) {
        if (i > 0 && i <= 60) {
            LayoutParams layoutParams = (LayoutParams) this.f81197e.getLayoutParams();
            if (i <= 3) {
                layoutParams.width = (int) this.f81429s;
            } else {
                layoutParams.width = (int) (this.f81429s + ((float) (this.f81430t * (i - 3))));
            }
            if (((float) layoutParams.width) > this.f81428r) {
                layoutParams.width = (int) this.f81428r;
            }
            this.f81197e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public void mo81424a(OnClickListener onClickListener) {
        super.mo81424a(onClickListener);
        this.f81197e.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81197e);
        this.f81195c.setOnClickListener(onClickListener);
        this.f81202j.mo82725a(this.f81195c);
    }

    public VoiceMessageViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo81428a(Message message, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 1 && message != null && C6399b.m19945u()) {
            if (message.isSelf()) {
                i2 = R.drawable.cg;
            } else {
                i2 = R.drawable.ch;
            }
            this.f81431u = i2;
            if (message.isSelf()) {
                i3 = R.drawable.a_c;
            } else {
                i3 = R.drawable.a_d;
            }
            this.f81432v = i3;
            TextView textView = this.f81424n;
            Resources resources = C6399b.m19921a().getResources();
            if (message.isSelf()) {
                i4 = R.color.ua;
            } else {
                i4 = R.color.ub;
            }
            textView.setTextColor(resources.getColor(i4));
            View view = this.f81197e;
            if (message.isSelf()) {
                i5 = R.drawable.b3a;
            } else {
                i5 = R.drawable.b38;
            }
            view.setBackgroundResource(i5);
        }
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, AudioContent audioContent, int i) {
        super.mo81421a(message, message2, audioContent, i);
        this.f81426p.mo81521a(this.f81201i);
        int duration = ((int) audioContent.getDuration()) / 1000;
        if (message.getLocalExt().get("isPlayed") == null || !((String) message.getLocalExt().get("isPlayed")).equals("1")) {
            this.f81425o.setVisibility(0);
        } else {
            this.f81425o.setVisibility(8);
        }
        m101239a(!TextUtils.equals(message.getUuid(), this.f81427q));
        mo81482b(duration);
        TextView textView = this.f81424n;
        StringBuilder sb = new StringBuilder();
        sb.append(duration);
        sb.append("''");
        textView.setText(sb.toString());
        this.f81197e.setTag(50331648, Integer.valueOf(19));
        this.f81197e.setTag(67108864, this.f81201i);
    }
}
