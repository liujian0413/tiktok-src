package com.bytedance.android.livesdk;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.C9467i;
import com.bytedance.android.livesdkapi.host.C9468j;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.p454b.C9455a;
import com.bytedance.android.livesdkapi.p452h.C9414c;
import com.bytedance.android.livesdkapi.p452h.C9415d;
import com.bytedance.android.livesdkapi.view.C9517a;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.g */
public final class C6128g implements IHostApp {

    /* renamed from: a */
    private IHostApp f18077a;

    public final C9414c avatarBorderController() {
        return this.f18077a.avatarBorderController();
    }

    public final String getBgBroadcastServiceName() {
        return this.f18077a.getBgBroadcastServiceName();
    }

    public final Class getLiveActivityClass() {
        return this.f18077a.getLiveActivityClass();
    }

    public final void hideStickerView() {
        this.f18077a.hideStickerView();
    }

    public final void initImageLib() {
        this.f18077a.initImageLib();
    }

    public final boolean isShowStickerView() {
        return this.f18077a.isShowStickerView();
    }

    public final void enterRecorderActivity(Activity activity) {
        this.f18077a.enterRecorderActivity(activity);
    }

    public final Class getHostActivity(int i) {
        return this.f18077a.getHostActivity(i);
    }

    public final Typeface getHostTypeface(int i) {
        return this.f18077a.getHostTypeface(i);
    }

    public final C9415d liveCircleView(Context context) {
        return this.f18077a.liveCircleView(context);
    }

    public final void openWallet(Activity activity) {
        this.f18077a.openWallet(activity);
    }

    public final void transCloudControlCommand(JSONObject jSONObject) {
        this.f18077a.transCloudControlCommand(jSONObject);
    }

    public final void tryDownloadGiftImage(String str) {
        this.f18077a.tryDownloadGiftImage(str);
    }

    public final void tryDownloadImage(String str) {
        this.f18077a.tryDownloadImage(str);
    }

    public C6128g(IHostApp iHostApp) {
        this.f18077a = iHostApp;
        C3596c.m13174a(IHostApp.class, this);
    }

    public final void checkBindHelpShow(FragmentActivity fragmentActivity, String str) {
        this.f18077a.checkBindHelpShow(fragmentActivity, str);
    }

    public final Uri getUriForFile(Context context, File file) {
        return this.f18077a.getUriForFile(context, file);
    }

    public final boolean startVideoRecordActivity(Activity activity, String str) {
        return this.f18077a.startVideoRecordActivity(activity, str);
    }

    public final void bindGifImage(View view, String str, Config config) {
        this.f18077a.bindGifImage(view, str, config);
    }

    public final void centerToast(Context context, String str, int i) {
        this.f18077a.centerToast(context, str, i);
    }

    public final void checkAndShowGuide(FragmentActivity fragmentActivity, String str, String str2) {
        this.f18077a.checkAndShowGuide(fragmentActivity, str, str2);
    }

    public final void systemToast(Context context, String str, int i) {
        this.f18077a.systemToast(context, str, i);
    }

    public final void startBindMobileFullFragment(Activity activity, String str, String str2, C9467i iVar) {
        this.f18077a.startBindMobileFullFragment(activity, str, str2, iVar);
    }

    public final void startBindPhoneDialogFragment(Activity activity, String str, String str2, C9467i iVar) {
        this.f18077a.startBindPhoneDialogFragment(activity, str, str2, iVar);
    }

    public final void centerToast(Context context, String str, int i, boolean z) {
        this.f18077a.centerToast(context, str, i, z);
    }

    public final void showStickerView(AppCompatActivity appCompatActivity, C0608j jVar, String str, FrameLayout frameLayout, C9468j jVar2) {
        this.f18077a.showStickerView(appCompatActivity, jVar, str, frameLayout, jVar2);
    }

    public final Dialog showDialog(Context context, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, C9517a aVar, CharSequence charSequence4, C9517a aVar2, C9455a aVar3) {
        return this.f18077a.showDialog(context, charSequence, charSequence2, charSequence3, aVar, charSequence4, aVar2, aVar3);
    }
}
