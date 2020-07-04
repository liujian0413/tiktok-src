package com.bytedance.business.base;

import android.app.Application;

public interface IBusinessToolsService extends IBugReportService {
    void initialize(Application application, BusinessToolsConfig businessToolsConfig);
}
