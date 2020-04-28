package com.study.d2spring.view.error;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ErrorView {
    private String errCode;
    private String errMsg;

    public ErrorView(String _cd, String _msg) {
        this.errCode = _cd;
        this.errMsg = " ErroMsg "+_msg;
    }
}
