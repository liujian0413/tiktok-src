package org.chromium;

import android.content.Context;
import com.ttnet.org.chromium.net1.TTAppInfoProvider;
import com.ttnet.org.chromium.net1.TTAppInfoProvider.AppInfo;
import java.util.Map;

/* renamed from: org.chromium.b */
public class C48313b extends TTAppInfoProvider {

    /* renamed from: a */
    private static C48313b f123362a;

    /* renamed from: b */
    private AppInfo f123363b;

    /* renamed from: c */
    private Context f123364c;

    public AppInfo getAppInfo() {
        try {
            synchronized (C48312a.class) {
                if (this.f123363b == null) {
                    this.f123363b = new AppInfo();
                }
            }
            this.f123363b.setAbClient(C48316e.m149835a().mo121755w());
            this.f123363b.setAbFlag(C48316e.m149835a().mo121740h());
            this.f123363b.setAbVersion(C48316e.m149835a().mo121754v());
            this.f123363b.setAbFeature(C48316e.m149835a().mo121756x());
            this.f123363b.setAppId(C48316e.m149835a().mo121738f());
            this.f123363b.setAppName(C48316e.m149835a().mo121745m());
            this.f123363b.setChannel(C48316e.m149835a().mo121746n());
            this.f123363b.setCityName(C48316e.m149835a().mo121747o());
            this.f123363b.setDeviceId(C48316e.m149835a().mo121741i());
            if (C48320i.m149888a(this.f123364c)) {
                this.f123363b.setIsMainProcess("1");
            } else {
                this.f123363b.setIsMainProcess("0");
            }
            this.f123363b.setAbi(C48316e.m149835a().mo121749q());
            this.f123363b.setDevicePlatform(C48316e.m149835a().mo121750r());
            this.f123363b.setDeviceType(C48316e.m149835a().mo121744l());
            this.f123363b.setDeviceBrand(C48316e.m149835a().mo121758z());
            this.f123363b.setIId(C48316e.m149835a().mo121736d());
            this.f123363b.setNetAccessType(C48316e.m149835a().mo121742j());
            this.f123363b.setOpenUdid(C48316e.m149835a().mo121752t());
            this.f123363b.setSSmix(C48316e.m149835a().mo121757y());
            this.f123363b.setRticket(C48316e.m149835a().mo121722J());
            this.f123363b.setLanguage(C48316e.m149835a().mo121713A());
            this.f123363b.setDPI(C48316e.m149835a().mo121721I());
            this.f123363b.setOSApi(C48316e.m149835a().mo121739g());
            this.f123363b.setOSVersion(C48316e.m149835a().mo121748p());
            this.f123363b.setResolution(C48316e.m149835a().mo121753u());
            this.f123363b.setUserId(C48316e.m149835a().mo121737e());
            this.f123363b.setUUID(C48316e.m149835a().mo121751s());
            this.f123363b.setVersionCode(C48316e.m149835a().mo121743k());
            this.f123363b.setVersionName(C48316e.m149835a().mo121714B());
            this.f123363b.setUpdateVersionCode(C48316e.m149835a().mo121715C());
            this.f123363b.setManifestVersionCode(C48316e.m149835a().mo121716D());
            this.f123363b.setStoreIdc(C48316e.m149835a().mo121717E());
            this.f123363b.setRegion(C48316e.m149835a().mo121718F());
            this.f123363b.setSysRegion(C48316e.m149835a().mo121719G());
            this.f123363b.setCarrierRegion(C48316e.m149835a().mo121720H());
            this.f123363b.setLiveSdkVersion("");
            this.f123363b.setOpenVersion("");
            Map K = C48316e.m149835a().mo121723K();
            if (K != null && !K.isEmpty()) {
                this.f123363b.setHostFirst((String) K.get("first"));
                this.f123363b.setHostSecond((String) K.get("second"));
                this.f123363b.setHostThird((String) K.get("third"));
                this.f123363b.setDomainBase((String) K.get("ib"));
                this.f123363b.setDomainChannel((String) K.get("ichannel"));
                this.f123363b.setDomainLog((String) K.get("log"));
                this.f123363b.setDomainMon((String) K.get("mon"));
                this.f123363b.setDomainSec((String) K.get("security"));
                this.f123363b.setDomainSub((String) K.get("isub"));
            }
            if (C48317f.m149883a().loggerDebug()) {
                StringBuilder sb = new StringBuilder("AppInfo{mIId='");
                sb.append(this.f123363b.getIId());
                sb.append('\'');
                sb.append(", mUserId='");
                sb.append(this.f123363b.getUserId());
                sb.append('\'');
                sb.append(", mAppId='");
                sb.append(this.f123363b.getAppId());
                sb.append('\'');
                sb.append(", mOSApi='");
                sb.append(this.f123363b.getOSApi());
                sb.append('\'');
                sb.append(", mAbFlag='");
                sb.append(this.f123363b.getAbFlag());
                sb.append('\'');
                sb.append(", mOpenVersion='");
                sb.append(this.f123363b.getOpenVersion());
                sb.append('\'');
                sb.append(", mDeviceId='");
                sb.append(this.f123363b.getDeviceId());
                sb.append('\'');
                sb.append(", mNetAccessType='");
                sb.append(this.f123363b.getNetAccessType());
                sb.append('\'');
                sb.append(", mVersionCode='");
                sb.append(this.f123363b.getVersionCode());
                sb.append('\'');
                sb.append(", mDeviceType='");
                sb.append(this.f123363b.getDeviceType());
                sb.append('\'');
                sb.append(", mAppName='");
                sb.append(this.f123363b.getAppName());
                sb.append('\'');
                sb.append(", mChannel='");
                sb.append(this.f123363b.getChannel());
                sb.append('\'');
                sb.append(", mCityName='");
                sb.append(this.f123363b.getCityName());
                sb.append('\'');
                sb.append(", mLiveSdkVersion='");
                sb.append(this.f123363b.getLiveSdkVersion());
                sb.append('\'');
                sb.append(", mOSVersion='");
                sb.append(this.f123363b.getOSVersion());
                sb.append('\'');
                sb.append(", mAbi='");
                sb.append(this.f123363b.getAbi());
                sb.append('\'');
                sb.append(", mDevicePlatform='");
                sb.append(this.f123363b.getDevicePlatform());
                sb.append('\'');
                sb.append(", mUUID='");
                sb.append(this.f123363b.getUUID());
                sb.append('\'');
                sb.append(", mOpenUdid='");
                sb.append(this.f123363b.getOpenUdid());
                sb.append('\'');
                sb.append(", mResolution='");
                sb.append(this.f123363b.getResolution());
                sb.append('\'');
                sb.append(", mAbVersion='");
                sb.append(this.f123363b.getAbVersion());
                sb.append('\'');
                sb.append(", mAbClient='");
                sb.append(this.f123363b.getAbClient());
                sb.append('\'');
                sb.append(", mAbFeature='");
                sb.append(this.f123363b.getAbFeature());
                sb.append('\'');
                sb.append(", mDeviceBrand='");
                sb.append(this.f123363b.getDeviceBrand());
                sb.append('\'');
                sb.append(", mLanguage='");
                sb.append(this.f123363b.getLanguage());
                sb.append('\'');
                sb.append(", mVersionName='");
                sb.append(this.f123363b.getVersionName());
                sb.append('\'');
                sb.append(", mSSmix='");
                sb.append(this.f123363b.getSSmix());
                sb.append('\'');
                sb.append(", mUpdateVersionCode='");
                sb.append(this.f123363b.getUpdateVersionCode());
                sb.append('\'');
                sb.append(", mManifestVersionCode='");
                sb.append(this.f123363b.getManifestVersionCode());
                sb.append('\'');
                sb.append(", mDPI='");
                sb.append(this.f123363b.getDPI());
                sb.append('\'');
                sb.append(", mRticket='");
                sb.append(this.f123363b.getRticket());
                sb.append('\'');
                sb.append(", mHostFirst='");
                sb.append(this.f123363b.getHostFirst());
                sb.append('\'');
                sb.append(", mHostSecond='");
                sb.append(this.f123363b.getHostSecond());
                sb.append('\'');
                sb.append(", mHostThird='");
                sb.append(this.f123363b.getHostThird());
                sb.append('\'');
                sb.append(", mDomainBase='");
                sb.append(this.f123363b.getDomainBase());
                sb.append('\'');
                sb.append(", mDomainLog='");
                sb.append(this.f123363b.getDomainLog());
                sb.append('\'');
                sb.append(", mDomainSub='");
                sb.append(this.f123363b.getDomainSub());
                sb.append('\'');
                sb.append(", mDomainChannel='");
                sb.append(this.f123363b.getDomainChannel());
                sb.append('\'');
                sb.append(", mDomainMon='");
                sb.append(this.f123363b.getDomainMon());
                sb.append('\'');
                sb.append(", mDomainSec='");
                sb.append(this.f123363b.getDomainSec());
                sb.append('\'');
                sb.append('}');
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("get appinfo = ");
                sb3.append(sb2);
                C48317f.m149883a().loggerD("CronetAppInfoProvider1", sb3.toString());
            }
        } catch (Throwable unused) {
        }
        return this.f123363b;
    }

    private C48313b(Context context) {
        this.f123364c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C48313b m149832a(Context context) {
        if (f123362a == null) {
            synchronized (C48313b.class) {
                if (f123362a == null) {
                    f123362a = new C48313b(context);
                }
            }
        }
        return f123362a;
    }
}
