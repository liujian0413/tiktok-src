package com.bytedance.services.apm.api;

import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import org.json.JSONObject;

public interface IMonitorLogManager extends IService {
    void deleteLegacyLogByIds(String str, String str2);

    void getLegacyLog(long j, long j2, String str, C12917f fVar);

    List<JSONObject> getRecentUiActionRecords();
}
