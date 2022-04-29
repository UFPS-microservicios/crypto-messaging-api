package com.ufps.cryptobot.telegram;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import com.ufps.cryptobot.contract.Message;
import com.ufps.cryptobot.service.MessagingProviderI;
import org.springframework.stereotype.Component;

@Component
public class Provider implements MessagingProviderI {

    private final TelegramBot bot;
    private String token = System.getenv("BOT_TOKEN");

    public Provider() {
        this.bot = new TelegramBot(token);
    }

    public SendResponse sendMessage(Message message) {
        SendMessage sendMessage = new SendMessage(message.getChat().getId(), message.getText());
        return bot.execute(sendMessage);
    }
}
