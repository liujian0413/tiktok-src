package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import com.C1642a;
import com.bytedance.p263im.core.model.Message;
import com.facebook.drawee.generic.C13438a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodContent;
import com.taobao.android.dexposed.ClassUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DecimalFormat;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.ShareGoodViewHolder */
public class ShareGoodViewHolder extends ShareSimpleBaseViewHolder {
    public ShareGoodViewHolder(View view, int i) {
        super(view, i);
    }

    /* renamed from: a */
    public void mo81421a(Message message, Message message2, BaseContent baseContent, int i) {
        super.mo81421a(message, message2, baseContent, i);
        if (baseContent instanceof ShareGoodContent) {
            ShareGoodContent shareGoodContent = (ShareGoodContent) baseContent;
            this.f81372o.setText(shareGoodContent.getTitle());
            this.f81373p.setVisibility(0);
            String valueOf = String.valueOf(shareGoodContent.getUserCount());
            if (shareGoodContent.getUserCount() >= 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                double userCount = (double) shareGoodContent.getUserCount();
                Double.isNaN(userCount);
                String format = decimalFormat.format(userCount / 10000.0d);
                if (format.endsWith("0") && format.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                    format = format.substring(0, format.indexOf(ClassUtils.PACKAGE_SEPARATOR));
                }
                StringBuilder sb = new StringBuilder();
                sb.append(format);
                sb.append("w");
                valueOf = sb.toString();
            }
            this.f81373p.setText(C1642a.m8035a(Locale.getDefault(), this.f81373p.getContext().getString(R.string.bjv), new Object[]{valueOf}));
            this.f81374q.setText(R.string.bju);
            ((C13438a) this.f81371n.getHierarchy()).mo32898b((int) R.drawable.b7k);
            C23323e.m76524b(this.f81371n, shareGoodContent.getAvatar());
            this.f81197e.setTag(50331648, Integer.valueOf(34));
            this.f81197e.setTag(67108864, shareGoodContent);
        }
    }
}
