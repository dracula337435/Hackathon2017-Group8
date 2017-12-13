package org.dracula.ht2017g8.bo;

public enum ReturnCodeAndMsg {

    SUCCESS("00000", null),

    FAIL_00001("00001", "未能检索到此客户的web_timeline信息"),
    FAIL_00002("00002", "查询客户web_timeline信息，后台异常，service向portal返回null"),
    FAIL_00003("00003", "未能检索到此客户的web_card信息"),
    FAIL_00004("00004", "未能检索到此客户的web_cardapply信息"),
    FAIL_00005("00005", "未能检索到此客户的web_customer信息"),
    FAIL_00006("00006", "增加web_cardapply不成功"),
    FAIL_00007("00007", "查询客户web_customer信息，后台异常，service向portal返回null"),
    FAIL_00008("00008", "查询客户web_card信息，后台异常，service向portal返回null"),
    FAIL_00009("00009", "查询参数id不是合法数字"),
    FAIL_00010("00010", "查询客户web_cardapply信息，后台异常，service向portal返回null"),
    FAIL_00011("00011", "新增客户web_cardapply信息，后台异常，service向portal返回null"),
    FAIL_00012("00013", "未能查询到web_busintro信息"),
    FAIL_00013("00013", "查询客户web_busintro信息，后台异常，service向portal返回null"),
    FAIL_00014("00014", "未能查询到web_rate信息"),
    FAIL_00015("00015", "查询客户web_rate信息，后台异常，service向portal返回null"),
    FAIL_00016("00016", "未能检索到web_card信息"),
    FAIL_00017("00017", "查询web_card信息，后台异常，service向portal返回null")
    ;

    ReturnCodeAndMsg(String code, String msg){
        setCode(code);
        setMsg(msg);
    }

    private String code;

    private String msg;

    public java.lang.String getCode() {
        return code;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public java.lang.String getMsg() {
        return msg;
    }

    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }
}
