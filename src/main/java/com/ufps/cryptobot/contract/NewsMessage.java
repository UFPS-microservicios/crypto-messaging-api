package com.ufps.cryptobot.contract;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsMessage {
    @JsonAlias("chat_id")
    private Long chatID;
    @JsonAlias("titulo")
    private String title;
    @JsonAlias("link")
    private String link;
}
