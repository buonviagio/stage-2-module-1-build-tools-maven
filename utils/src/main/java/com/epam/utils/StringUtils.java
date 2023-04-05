package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (NumberUtils.isCreatable(str)){
            if(str.endsWith("d") || str.endsWith("D")){
                return NumberUtils.createDouble(str) > 0;
            } else if(str.endsWith("l") || str.endsWith("L")){
                return NumberUtils.createLong(str) > 0;
            } else if(str.endsWith("f") || str.endsWith("F")){
                return NumberUtils.createFloat(str) > 0;
            }
        }
        return NumberUtils.toInt(str) > 0;
    }
}
