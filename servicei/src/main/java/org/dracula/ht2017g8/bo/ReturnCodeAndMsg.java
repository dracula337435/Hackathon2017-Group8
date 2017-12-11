package org.dracula.ht2017g8.bo;

public enum ReturnCodeAndMsg {

    SUCCESS("00000", null),

    FAIL_00001("00001", "未能检索到此客户的web_timeline信息"),
    FAIL_00002("00002", "查询客户web_timeline信息，后台异常，service向portal返回null"),
    FAIL_00003("00003", "未能检索到此客户的web_card信息"),
    FAIL_00004("00004", "未能检索到此客户的web_cardapply信息"),
    FAIL_00005("00005", "未能检索到此客户的web_customer信息"),
    FAIL_00006("00006", "增加web_cardapply不成功"),
    FAIL_00007("00007", ""),
    FAIL_00008("00008", ""),
    FAIL_00009("00009", ""),
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
