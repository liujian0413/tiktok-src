package com.p280ss.android.ugc.aweme.profile;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26118aa;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.profile.api.C35731g;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p280ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1484e.C35746b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragmentImpl;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36337ai;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MTAwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36675j;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RemarkEditDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl */
public final class ProfileServiceImpl implements IProfileService {

    /* renamed from: com.ss.android.ugc.aweme.profile.ProfileServiceImpl$a */
    static final class C35641a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ String f93389a;

        /* renamed from: b */
        final /* synthetic */ String f93390b;

        /* renamed from: c */
        final /* synthetic */ String f93391c;

        C35641a(String str, String str2, String str3) {
            this.f93389a = str;
            this.f93390b = str2;
            this.f93391c = str3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UserResponse call() {
            String str;
            if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
                str = C35731g.m115450b(this.f93389a, this.f93390b, this.f93391c, 0);
            } else {
                str = C35731g.m115443a(this.f93390b, this.f93389a, this.f93391c, 0);
            }
            return C35731g.m115447b(str, false, (String) null);
        }
    }

    public final boolean needShowCompleteProfileGuide() {
        if (C6399b.m19945u()) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!C43122ff.m136783n(f.getCurUser()) && C6384b.m19835a().mo15287a(ShowCompleteProfileAlertStyle.class, true, "show_complete_profile_alert_style", C6384b.m19835a().mo15295d().show_complete_profile_alert_style, 0) != 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean needShowCompleteProfileGuideBar() {
        boolean z;
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        if (curUser.getProfileCompletion() <= 0.0f || curUser.getProfileCompletion() > 0.7f) {
            z = false;
        } else {
            z = true;
        }
        if (!needShowCompleteProfileGuide() || (!z && !curUser.nicknameUpdateReminder() && !curUser.avatarUpdateReminder())) {
            return false;
        }
        return true;
    }

    public final boolean needShowCompleteProfileGuideBarForFansDetail() {
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!needShowCompleteProfileGuideBar() || repo.getInt(C35779f.m115540a("fans_detail_page_complete_profile_guide_bar_show_times"), 0) >= 3 || System.currentTimeMillis() - repo.getLong(C35779f.m115540a("fans_detail_page_complete_profile_guide_bar_last_show_time"), 0) <= 604800000) {
            return false;
        }
        return true;
    }

    public final void onFansDetailCompleteProfileGuideBarShow() {
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        repo.storeInt(C35779f.m115540a("fans_detail_page_complete_profile_guide_bar_show_times"), repo.getInt(C35779f.m115540a("fans_detail_page_complete_profile_guide_bar_show_times"), 0) + 1);
        repo.storeLong(C35779f.m115540a("fans_detail_page_complete_profile_guide_bar_last_show_time"), System.currentTimeMillis());
    }

    public final void preloadProfile(FragmentActivity fragmentActivity, String str) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "pageName");
        C35746b.m115475a(fragmentActivity, str);
    }

    public final C26134am newDetailPageOperator(C25673a<?, ?> aVar, boolean z, String str) {
        return new C26118aa(aVar, z, str);
    }

    public final C7319aa<UserResponse> user(String str, String str2, String str3) {
        C7319aa<UserResponse> b = C7319aa.m22932a((Callable<? extends T>) new C35641a<Object>(str, str2, str3)).mo19135b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "Single.fromCallable {\n  …scribeOn(Schedulers.io())");
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0066, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (r2.getInt(r3, 0) <= 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r2.getInt(r3, 0) < 3) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0076, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r4 == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean showRemindUserCompleteProfileDialog(android.content.Context r14, java.lang.String r15, java.lang.String r16, android.content.DialogInterface.OnDismissListener r17) {
        /*
            r13 = this;
            r0 = r14
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r14, r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.p280ss.android.ugc.aweme.account.C6861a.m21337f()
            java.lang.String r2 = "AccountProxyService.userService()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getCurUser()
            java.lang.String r2 = "keva_repo_profile_component"
            com.bytedance.keva.Keva r2 = com.bytedance.keva.Keva.getRepo(r2)
            java.lang.String r3 = "remind_user_complete_profile_show_times"
            java.lang.String r3 = com.p280ss.android.ugc.aweme.profile.C35779f.m115540a(r3)
            boolean r4 = r13.needShowCompleteProfileGuide()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x007b
            boolean r4 = r1.nicknameUpdateReminder()
            if (r4 != 0) goto L_0x0033
            boolean r4 = r1.avatarUpdateReminder()
            if (r4 == 0) goto L_0x007b
        L_0x0033:
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "remind_user_complete_profile_last_show_time"
            java.lang.String r4 = com.p280ss.android.ugc.aweme.profile.C35779f.m115540a(r4)
            r9 = 0
            long r9 = r2.getLong(r4, r9)
            long r7 = r7 - r9
            r9 = 604800000(0x240c8400, double:2.988109026E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x007b
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle> r8 = com.p280ss.android.ugc.aweme.profile.experiment.ShowCompleteProfileAlertStyle.class
            r9 = 1
            java.lang.String r10 = "show_complete_profile_alert_style"
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r4 = r4.mo15295d()
            int r11 = r4.show_complete_profile_alert_style
            r12 = 0
            int r4 = r7.mo15287a(r8, r9, r10, r11, r12)
            switch(r4) {
                case 1: goto L_0x006f;
                case 2: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            r4 = 0
            goto L_0x0077
        L_0x0068:
            int r4 = r2.getInt(r3, r6)
            if (r4 > 0) goto L_0x0066
            goto L_0x0076
        L_0x006f:
            int r4 = r2.getInt(r3, r6)
            r7 = 3
            if (r4 >= r7) goto L_0x0066
        L_0x0076:
            r4 = 1
        L_0x0077:
            if (r4 == 0) goto L_0x007b
            r4 = 1
            goto L_0x007c
        L_0x007b:
            r4 = 0
        L_0x007c:
            if (r4 != 0) goto L_0x007f
            return r6
        L_0x007f:
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.profile.ui.RemindUserCompleteProfileActivity> r7 = com.p280ss.android.ugc.aweme.profile.p1487ui.RemindUserCompleteProfileActivity.class
            r4.<init>(r14, r7)
            java.lang.String r7 = "enter_from"
            if (r15 != 0) goto L_0x008d
            java.lang.String r8 = ""
            goto L_0x008e
        L_0x008d:
            r8 = r15
        L_0x008e:
            r4.putExtra(r7, r8)
            java.lang.String r7 = "enter_method"
            r9 = r16
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x00a2
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r9 = 0
            goto L_0x00a3
        L_0x00a2:
            r9 = 1
        L_0x00a3:
            if (r9 == 0) goto L_0x00a8
            java.lang.String r8 = "follow"
            goto L_0x00aa
        L_0x00a8:
            r8 = r16
        L_0x00aa:
            r4.putExtra(r7, r8)
            java.lang.String r7 = "complete_avatar"
            boolean r8 = r1.avatarUpdateReminder()
            r4.putExtra(r7, r8)
            java.lang.String r7 = "complete_nickname"
            boolean r1 = r1.nicknameUpdateReminder()
            r4.putExtra(r7, r1)
            r14.startActivity(r4)
            com.p280ss.android.ugc.aweme.profile.p1487ui.RemindUserCompleteProfileActivity.C36299a.m117304a(r17)
            int r0 = r2.getInt(r3, r6)
            int r0 = r0 + r5
            r2.storeInt(r3, r0)
            java.lang.String r0 = "remind_user_complete_profile_last_show_time"
            java.lang.String r0 = com.p280ss.android.ugc.aweme.profile.C35779f.m115540a(r0)
            long r3 = java.lang.System.currentTimeMillis()
            r2.storeLong(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.ProfileServiceImpl.showRemindUserCompleteProfileDialog(android.content.Context, java.lang.String, java.lang.String, android.content.DialogInterface$OnDismissListener):boolean");
    }

    public final boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        if (!C7573i.m23585a((Object) str2, (Object) "follow") || C36337ai.m117568b(user) >= 1000 || (i != 1 && i != 2 && i != 4)) {
            return false;
        }
        return showRemindUserCompleteProfileDialog(context, str, str2, null);
    }

    public final AwemeListFragment newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C7573i.m23587b(str, "uid");
        if (str2 == null) {
            str2 = "";
        }
        AwemeListFragment a = AwemeListFragmentImpl.m116354a(i, i2, str, str2, z, z2, new Bundle());
        C7573i.m23582a((Object) a, "AwemeListFragmentImpl.ne…reshOnInitData, Bundle())");
        return a;
    }

    public final AwemeListFragment newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C7573i.m23587b(str, "uid");
        MTAwemeListFragment a = MTAwemeListFragment.m116663a(i, i2, str, z, new Bundle());
        C7573i.m23582a((Object) a, "MTAwemeListFragment.newI…d, isMyProfile, Bundle())");
        return a;
    }

    public final void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C36675j jVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "defaultInput");
        RemarkEditDialog remarkEditDialog = new RemarkEditDialog(context);
        remarkEditDialog.f96236f = user;
        remarkEditDialog.f96237g = str;
        remarkEditDialog.f96238h = i;
        if (jVar != null) {
            remarkEditDialog.f96235e = jVar;
        }
        remarkEditDialog.show();
    }

    public final AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        C7573i.m23587b(str, "uid");
        C7573i.m23587b(bundle, "args");
        if (C6399b.m19944t()) {
            MTAwemeListFragment a = MTAwemeListFragment.m116663a(i, i2, str, z, bundle);
            C7573i.m23582a((Object) a, "MTAwemeListFragment.newI…, uid, isMyProfile, args)");
            return a;
        }
        if (str2 == null) {
            str2 = "";
        }
        AwemeListFragment a2 = AwemeListFragmentImpl.m116354a(i, i2, str, str2, z, z2, bundle);
        C7573i.m23582a((Object) a2, "AwemeListFragmentImpl.ne…dRefreshOnInitData, args)");
        return a2;
    }
}
