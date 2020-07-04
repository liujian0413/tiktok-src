package com.kakao.util.helper;

import android.os.Bundle;
import java.util.Date;
import java.util.List;

public interface PersistentKVStore {
    void clear(List<String> list);

    void clearAll();

    Date getDate(String str);

    String getString(String str);

    void save(Bundle bundle);
}
