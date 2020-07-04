package com.bytedance.android.livesdk.chatroom.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdk.chatroom.utils.a */
public final class C5335a {
    /* renamed from: a */
    private static TextView m17012a(final Context context, int i) {
        SpannableString spannableString = new SpannableString(context.getString(R.string.epg));
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.amx)), 1, 16, 33);
        TextView textView = new TextView(context);
        textView.setTextSize(18.0f);
        textView.setText(spannableString);
        textView.setPadding(C3358ac.m12510a(30.0f), C3358ac.m12510a(20.0f), C3358ac.m12510a(30.0f), C3358ac.m12510a(10.0f));
        textView.setTextColor(-16777216);
        textView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
            }
        });
        return textView;
    }

    /* renamed from: b */
    public static void m17014b(Activity activity, String str, C9467i iVar) {
        TTLiveSDKContext.getHostService().mo22362c().startBindMobileFullFragment(activity, "live_detail", "live_detail", iVar);
        HashMap hashMap = new HashMap();
        hashMap.put("bind_page_source", str);
        C8443c.m25663a().mo21606a("livesdk_phone_bind_page_show", hashMap, new C8438j(), Room.class);
    }

    /* renamed from: a */
    public static void m17013a(final Activity activity, final String str, final C9467i iVar) {
        Builder builder = new Builder(activity);
        builder.setCustomTitle(m17012a(activity, R.string.epg)).setNegativeButton(R.string.epe, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).setPositiveButton(R.string.epf, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C5335a.m17014b(activity, str, iVar);
            }
        }).setCancelable(false);
        AlertDialog create = builder.create();
        create.show();
        create.getButton(-1).setTextColor(activity.getResources().getColor(R.color.amx));
        create.getButton(-2).setTextColor(activity.getResources().getColor(R.color.am2));
    }
}
