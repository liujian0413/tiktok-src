package org.chromium;

import android.content.Context;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTAppInfoProvider.AppInfo;
import java.util.Map;

/* renamed from: org.chromium.a */
public class C48312a extends TTAppInfoProvider {

    /* renamed from: a */
    private static C48312a f123359a;

    /* renamed from: b */
    private AppInfo f123360b;

    /* renamed from: c */
    private Context f123361c;

    public AppInfo getAppInfo() {
        try {
            synchronized (C48312a.class) {
                if (this.f123360b == null) {
                    this.f123360b = new AppInfo();
                }
            }
            this.f123360b.setAbClient(C48316e.m149835a().mo121755w());
            this.f123360b.setAbFlag(C48316e.m149835a().mo121740h());
            this.f123360b.setAbVersion(C48316e.m149835a().mo121754v());
            this.f123360b.setAbFeature(C48316e.m149835a().mo121756x());
            this.f123360b.setAppId(C48316e.m149835a().mo121738f());
            this.f123360b.setAppName(C48316e.m149835a().mo121745m());
            this.f123360b.setChannel(C48316e.m149835a().mo121746n());
            this.f123360b.setCityName(C48316e.m149835a().mo121747o());
            this.f123360b.setDeviceId(C48316e.m149835a().mo121741i());
            if (C48320i.m149888a(this.f123361c)) {
                this.f123360b.setIsMainProcess("1");
            } else {
                this.f123360b.setIsMainProcess("0");
            }
            this.f123360b.setAbi(C48316e.m149835a().mo121749q());
            this.f123360b.setDevicePlatform(C48316e.m149835a().mo121750r());
            this.f123360b.setDeviceType(C48316e.m149835a().mo121744l());
            this.f123360b.setDeviceBrand(C48316e.m149835a().mo121758z());
            this.f123360b.setIId(C48316e.m149835a().mo121736d());
            this.f123360b.setNetAccessType(C48316e.m149835a().mo121742j());
            this.f123360b.setOpenUdid(C48316e.m149835a().mo121752t());
            this.f123360b.setSSmix(C48316e.m149835a().mo121757y());
            this.f123360b.setRticket(C48316e.m149835a().mo121722J());
            this.f123360b.setLanguage(C48316e.m149835a().mo121713A());
            this.f123360b.setDPI(C48316e.m149835a().mo121721I());
            this.f123360b.setOSApi(C48316e.m149835a().mo121739g());
            this.f123360b.setOSVersion(C48316e.m149835a().mo121748p());
            this.f123360b.setResolution(C48316e.m149835a().mo121753u());
            this.f123360b.setUserId(C48316e.m149835a().mo121737e());
            this.f123360b.setUUID(C48316e.m149835a().mo121751s());
            this.f123360b.setVersionCode(C48316e.m149835a().mo121743k());
            this.f123360b.setVersionName(C48316e.m149835a().mo121714B());
            this.f123360b.setUpdateVersionCode(C48316e.m149835a().mo121715C());
            this.f123360b.setManifestVersionCode(C48316e.m149835a().mo121716D());
            this.f123360b.setStoreIdc(C48316e.m149835a().mo121717E());
            this.f123360b.setRegion(C48316e.m149835a().mo121718F());
            this.f123360b.setSysRegion(C48316e.m149835a().mo121719G());
            this.f123360b.setCarrierRegion(C48316e.m149835a().mo121720H());
            this.f123360b.setLiveSdkVersion("");
            this.f123360b.setOpenVersion("");
            Map K = C48316e.m149835a().mo121723K();
            if (K != null && !K.isEmpty()) {
                this.f123360b.setHostFirst((String) K.get("first"));
                this.f123360b.setHostSecond((String) K.get("second"));
                this.f123360b.setHostThird((String) K.get("third"));
                this.f123360b.setDomainBase((String) K.get("ib"));
                this.f123360b.setDomainChannel((String) K.get("ichannel"));
                this.f123360b.setDomainLog((String) K.get("log"));
                this.f123360b.setDomainMon((String) K.get("mon"));
                this.f123360b.setDomainSec((String) K.get("security"));
                this.f123360b.setDomainSub((String) K.get("isub"));
            }
            if (C48317f.m149883a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("AppInfo{mIId='");
                sb.append(this.f123360b.getIId());
                sb.append('\'');
                sb.append(", mUserId='");
                sb.append(this.f123360b.getUserId());
                sb.append('\'');
                sb.append(", mAppId='");
                sb.append(this.f123360b.getAppId());
                sb.append('\'');
                sb.append(", mOSApi='");
                sb.append(this.f123360b.getOSApi());
                sb.append('\'');
                sb.append(", mAbFlag='");
                sb.append(this.f123360b.getAbFlag());
                sb.append('\'');
                sb.append(", mOpenVersion='");
                sb.append(this.f123360b.getOpenVersion());
                sb.append('\'');
                sb.append(", mDeviceId='");
                sb.append(this.f123360b.getDeviceId());
                sb.append('\'');
                sb.append(", mNetAccessType='");
                sb.append(this.f123360b.getNetAccessType());
                sb.append('\'');
                sb.append(", mVersionCode='");
                sb.append(this.f123360b.getVersionCode());
                sb.append('\'');
                sb.append(", mDeviceType='");
                sb.append(this.f123360b.getDeviceType());
                sb.append('\'');
                sb.append(", mAppName='");
                sb.append(this.f123360b.getAppName());
                sb.append('\'');
                sb.append(", mChannel='");
                sb.append(this.f123360b.getChannel());
                sb.append('\'');
                sb.append(", mCityName='");
                sb.append(this.f123360b.getCityName());
                sb.append('\'');
                sb.append(", mLiveSdkVersion='");
                sb.append(this.f123360b.getLiveSdkVersion());
                sb.append('\'');
                sb.append(", mOSVersion='");
                sb.append(this.f123360b.getOSVersion());
                sb.append('\'');
                sb.append(", mAbi='");
                sb.append(this.f123360b.getAbi());
                sb.append('\'');
                sb.append(", mDevicePlatform='");
                sb.append(this.f123360b.getDevicePlatform());
                sb.append('\'');
                sb.append(", mUUID='");
                sb.append(this.f123360b.getUUID());
                sb.append('\'');
                sb.append(", mOpenUdid='");
                sb.append(this.f123360b.getOpenUdid());
                sb.append('\'');
                sb.append(", mResolution='");
                sb.append(this.f123360b.getResolution());
                sb.append('\'');
                sb.append(", mAbVersion='");
                sb.append(this.f123360b.getAbVersion());
                sb.append('\'');
                sb.append(", mAbClient='");
                sb.append(this.f123360b.getAbClient());
                sb.append('\'');
                sb.append(", mAbFeature='");
                sb.append(this.f123360b.getAbFeature());
                sb.append('\'');
                sb.append(", mDeviceBrand='");
                sb.append(this.f123360b.getDeviceBrand());
                sb.append('\'');
                sb.append(", mLanguage='");
                sb.append(this.f123360b.getLanguage());
                sb.append('\'');
                sb.append(", mVersionName='");
                sb.append(this.f123360b.getVersionName());
                sb.append('\'');
                sb.append(", mSSmix='");
                sb.append(this.f123360b.getSSmix());
                sb.append('\'');
                sb.append(", mUpdateVersionCode='");
                sb.append(this.f123360b.getUpdateVersionCode());
                sb.append('\'');
                sb.append(", mManifestVersionCode='");
                sb.append(this.f123360b.getManifestVersionCode());
                sb.append('\'');
                sb.append(", mDPI='");
                sb.append(this.f123360b.getDPI());
                sb.append('\'');
                sb.append(", mRticket='");
                sb.append(this.f123360b.getRticket());
                sb.append('\'');
                sb.append(", mHostFirst='");
                sb.append(this.f123360b.getHostFirst());
                sb.append('\'');
                sb.append(", mHostSecond='");
                sb.append(this.f123360b.getHostSecond());
                sb.append('\'');
                sb.append(", mHostThird='");
                sb.append(this.f123360b.getHostThird());
                sb.append('\'');
                sb.append(", mDomainBase='");
                sb.append(this.f123360b.getDomainBase());
                sb.append('\'');
                sb.append(", mDomainLog='");
                sb.append(this.f123360b.getDomainLog());
                sb.append('\'');
                sb.append(", mDomainSub='");
                sb.append(this.f123360b.getDomainSub());
                sb.append('\'');
                sb.append(", mDomainChannel='");
                sb.append(this.f123360b.getDomainChannel());
                sb.append('\'');
                sb.append(", mDomainMon='");
                sb.append(this.f123360b.getDomainMon());
                sb.append('\'');
                sb.append(", mDomainSec='");
                sb.append(this.f123360b.getDomainSec());
                sb.append('\'');
                sb.append('}');
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("get appinfo = ");
                sb3.append(sb2);
                C48317f.m149883a().loggerD("CronetAppInfoProvider", sb3.toString());
            }
        } catch (Throwable unused) {
        }
        return this.f123360b;
    }

    private C48312a(Context context) {
        this.f123361c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C48312a m149831a(Context context) {
        if (f123359a == null) {
            synchronized (C48312a.class) {
                if (f123359a == null) {
                    f123359a = new C48312a(context);
                }
            }
        }
        return f123359a;
    }
}
