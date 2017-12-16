package org.dracula.ht2017g8.bo

class CommonBO<DataType> {

    var code: String? =null

    var msg: String? =null

    var data: DataType? =null

    fun setCodeAndMsg(codeAndMsg: ReturnCodeAndMsg){
        code = codeAndMsg.code
        msg = codeAndMsg.msg
    }

    override fun toString(): String {
        return "CommonBO(code=$code, msg=$msg, data=$data)"
    }

}