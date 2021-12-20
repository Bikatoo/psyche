package com.bikatoo.psyche.infrastructure.utils;

import java.util.TimeZone;

public class TimeUtils {

    public static final long ONE_DAY_TIMESTAMP = 86400000L;

    /**
     * 获取指定日期零点
     */
    public static long getTimeStampByDay(long date) {
        return date - (date + TimeZone.getDefault().getRawOffset()) % ONE_DAY_TIMESTAMP;
    }
}
