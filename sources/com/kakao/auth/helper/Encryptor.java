package com.kakao.auth.helper;

import android.content.Context;
import android.os.Build;
import com.kakao.auth.KakaoSDK;
import com.kakao.util.helper.log.Logger;
import java.io.IOException;
import java.security.GeneralSecurityException;

public interface Encryptor {

    public static class Factory {
        private static Encryptor encryptor;

        public static Encryptor getInstnace() {
            byte[] bArr;
            Context applicationContext = KakaoSDK.getAdapter().getApplicationConfig().getApplicationContext();
            if (encryptor == null) {
                try {
                    bArr = AndroidIdUtils.generateAndroidId(applicationContext);
                } catch (Exception unused) {
                    StringBuilder sb = new StringBuilder("xxxx");
                    sb.append(Build.PRODUCT);
                    sb.append("a23456789012345bcdefg");
                    bArr = sb.toString().getBytes();
                }
                try {
                    encryptor = new AESEncryptor(applicationContext, bArr);
                } catch (GeneralSecurityException e) {
                    Logger.m60933e("Failed to generate encryptor for Access token...");
                    Logger.m60933e(e.toString());
                }
            }
            return encryptor;
        }
    }

    String decrypt(String str) throws GeneralSecurityException, IOException;

    String encrypt(String str) throws GeneralSecurityException, IOException;
}
