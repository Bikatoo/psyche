package com.bikatoo.psyche.infrastructure.exception;

import lombok.Getter;

public enum ExceptionCode {

    // 第一位 S 服务端导致的异常 C 客户端导致的异常 G 通用
    // 第二位 F 表示层  A 应用层 D 领域层 I 基础设施层 G 通用
    // 第三四位 模块编码 000 通用
    // 第五六七位 业务编码 000 通用

    GLOBAL('G', 'G', "000", "000"),

    MAPPER_NOT_SUPPORT('S', 'I', "000", "000"),


    ;

    @Getter
    private final Character source;
    @Getter
    private final Character point;
    @Getter
    private final String moduleCode;
    @Getter
    private final String businessCode;

    ExceptionCode(Character source, Character point, String moduleCode, String businessCode) {
        this.source = source;
        this.point = point;
        this.moduleCode = moduleCode;
        this.businessCode = businessCode;
    }

    @Override
    public String toString() {
        return source + point + moduleCode + businessCode;
    }
}
