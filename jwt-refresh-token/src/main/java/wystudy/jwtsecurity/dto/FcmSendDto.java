package wystudy.jwtsecurity.dto;

import lombok.Getter;

@Getter
public class FcmSendDto {
    // 검증 조건 추가하기
    private String targetToken;
    private String title;
    private String body;
}
