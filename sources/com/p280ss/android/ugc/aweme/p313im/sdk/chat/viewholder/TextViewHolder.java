package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30918l;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.C30987r;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.TextViewHolder */
public class TextViewHolder extends BaseViewHolder<TextContent> {

    /* renamed from: m */
    private TextView f81418m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81420a() {
        super.mo81420a();
        this.f81418m = (TextView) mo81425a((int) R.id.c0g);
        this.f81197e = (View) mo81425a((int) R.id.a1q);
        if (this.f81197e != null) {
            Drawable background = this.f81197e.getBackground();
            if (background != null && VERSION.SDK_INT >= 19) {
                background.setAutoMirrored(true);
            }
        }
    }

    public TextViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81428a(com.bytedance.p263im.core.model.Message r4, int r5) {
        /*
            r3 = this;
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            r1 = 1
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4.isSelf()
            if (r5 != r1) goto L_0x0029
            android.view.View r2 = r3.f81197e
            if (r0 == 0) goto L_0x0015
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            goto L_0x0018
        L_0x0015:
            r0 = 2131233201(0x7f0809b1, float:1.8082533E38)
        L_0x0018:
            r2.setBackgroundResource(r0)
            boolean r0 = r4.isSelf()
            if (r0 == 0) goto L_0x0025
            r0 = 2131100429(0x7f06030d, float:1.781324E38)
            goto L_0x003a
        L_0x0025:
            r0 = 2131100428(0x7f06030c, float:1.7813237E38)
            goto L_0x003a
        L_0x0029:
            android.view.View r2 = r3.f81197e
            if (r0 == 0) goto L_0x0031
            r0 = 2131233203(0x7f0809b3, float:1.8082537E38)
            goto L_0x0034
        L_0x0031:
            r0 = 2131233200(0x7f0809b0, float:1.808253E38)
        L_0x0034:
            r2.setBackgroundResource(r0)
        L_0x0037:
            r0 = 2131100427(0x7f06030b, float:1.7813235E38)
        L_0x003a:
            boolean r2 = r4.isRecalled()
            if (r2 == 0) goto L_0x0058
            android.widget.TextView r4 = r3.f81418m
            android.content.Context r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r0)
            r4.setTextColor(r5)
            android.view.View r4 = r3.f81197e
            r5 = 0
            r4.setEnabled(r5)
            return
        L_0x0058:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
            if (r0 == 0) goto L_0x0083
            android.widget.TextView r0 = r3.f81418m
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            android.content.res.Resources r2 = r2.getResources()
            if (r5 != r1) goto L_0x0074
            boolean r4 = r4.isSelf()
            if (r4 != 0) goto L_0x0074
            r4 = 2131100426(0x7f06030a, float:1.7813233E38)
            goto L_0x0077
        L_0x0074:
            r4 = 2131100425(0x7f060309, float:1.7813231E38)
        L_0x0077:
            int r4 = r2.getColor(r4)
            r0.setTextColor(r4)
            android.view.View r4 = r3.f81197e
            r4.setEnabled(r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder.TextViewHolder.mo81428a(com.bytedance.im.core.model.Message, int):void");
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, TextContent textContent, int i) {
        int i2;
        super.mo81421a(message, message2, textContent, i);
        if (textContent != null && textContent.getText() != null) {
            long length = (long) textContent.getText().length();
            if (C6956a.m21632a().mo18009f().getIMSetting().f83738a != 1 || length > 1024) {
                this.f81418m.setText(textContent.getText());
            } else {
                C30918l.m100657a(this.f81418m, textContent.getText(), this.f81196d, C31863ai.m103531a(message, (BaseContent) textContent), message.getMsgId());
            }
            if (length <= 1024) {
                C27608b.m90502a(this.f81418m);
            }
            if (textContent.isDefault()) {
                if (C31915n.m103672b()) {
                    i2 = C6399b.m19921a().getResources().getColor(R.color.auk);
                } else if (message.isSelf()) {
                    i2 = C6399b.m19921a().getResources().getColor(R.color.au8);
                } else {
                    i2 = C6399b.m19921a().getResources().getColor(R.color.ax8);
                }
                if (!C31863ai.m103538e(message)) {
                    C30987r.m100845a(this.f81418m, textContent.getText(), i2);
                } else if (C7063bg.m22053b()) {
                    int color = C6399b.m19921a().getResources().getColor(R.color.u9);
                    C30987r.m100843a(this.itemView.getContext(), this.f81418m, textContent.getText(), C6399b.m19921a().getString(R.string.brq), color, message);
                } else {
                    this.f81418m.setText(textContent.getText());
                }
            }
            if (textContent.getHeartType() == 2 || textContent.getHeartType() == 1) {
                this.f81197e.setTag(50331648, Integer.valueOf(31));
            } else {
                this.f81197e.setTag(50331648, Integer.valueOf(1));
            }
            this.f81197e.setTag(50331649, Boolean.valueOf(C31863ai.m103531a(message, (BaseContent) textContent)));
        }
    }
}
