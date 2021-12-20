package com.bikatoo.psyche.infrastructure.utils;

import com.bikatoo.psyche.infrastructure.exception.GlobalException;
import org.apache.commons.lang3.StringUtils;

public class PreconditionUtils {

    public static void checkConditionAndThrow(boolean b, GlobalException e) {
        if (!b) {
            throw e;
        }
    }

    public static void checkNonNullAndThrow(Object o, GlobalException e) {
        if (o == null) {
            throw e;
        }
    }

    public static void checkNoneNullAndThrow(GlobalException e, Object... os) {
        if (os == null || os.length <= 0) {
            throw e;
        }

        for (Object o : os) {
            if (o == null) {
                throw e;
            }
        }
    }

    public static void checkStringNonBlankAndThrow(String str, GlobalException e) {
        if (StringUtils.isBlank(str)) {
            throw e;
        }
    }
}
